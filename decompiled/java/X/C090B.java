package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.090B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel$dealTrendingDataChanged$1", f = "SearchStickerViewModel.kt", l = {405}, m = "invokeSuspend")
public final class C090B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CategoryEffectModel LLILLJJLI;
    public final /* synthetic */ SearchStickerViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C090B(CategoryEffectModel categoryEffectModel, SearchStickerViewModel searchStickerViewModel, InterfaceC1364105Vn<? super C090B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = categoryEffectModel;
        this.LLILLL = searchStickerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C090B(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchStickerViewModel@2710.dealTrendingDataChanged$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List listLL = C13LP.LL(this.LLILLJJLI.getEffects(), 5);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLL.iterator();
            while (true) {
                Parcel parcelObtain = null;
                if (!it2.hasNext()) {
                    break;
                }
                Effect effect = (Effect) it2.next();
                try {
                    parcelObtain = Parcel.obtain();
                    parcelObtain.writeParcelable(effect, 0);
                    parcelObtain.setDataPosition(0);
                    Parcelable parcelable = parcelObtain.readParcelable(effect.getClass().getClassLoader());
                    parcelObtain.recycle();
                    if (parcelable != null) {
                        arrayList.add(parcelable);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (parcelObtain != null) {
                        parcelObtain.recycle();
                    }
                    throw th;
                }
            }
            C2238608ps c2238608ps = C2107708Nn.LIZ;
            C090C c090c = new C090C(this.LLILLL, arrayList, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c090c) == objLJFF) {
                C1C7U.LIZIZ("SearchStickerViewModel@2710.dealTrendingDataChanged$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchStickerViewModel@2710.dealTrendingDataChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
