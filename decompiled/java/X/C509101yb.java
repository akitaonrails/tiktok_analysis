package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel$uploadImage$1", f = "LiveSmallItemBeautyViewModel.kt", l = {306, 308, 312}, m = "invokeSuspend")
public final class C509101yb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509101yb(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, Bitmap bitmap, InterfaceC1364105Vn<? super C509101yb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveSmallItemBeautyViewModel;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C509101yb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSmallItemBeautyViewModel@ff2.uploadImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.uploadImage$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC510701yr interfaceC510701yr = this.LLILLJJLI.LLILZ;
            Bitmap bitmap = this.LLILLL;
            this.LL = 1;
            obj = interfaceC510701yr.LJ(bitmap, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.uploadImage$1");
                return objLJFF;
            }
        }
        CoverImageModel coverImageModel = (CoverImageModel) obj;
        if (coverImageModel != null) {
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
            C404201hg c404201hg = new C404201hg(coverImageModel.urlList);
            this.LL = 2;
            if (c2252331DDr.emit(c404201hg, this) == objLJFF) {
                C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.uploadImage$1");
                return objLJFF;
            }
        } else {
            C2252331DDr c2252331DDr2 = this.LLILLJJLI.LLILLL;
            C404201hg c404201hg2 = new C404201hg(null);
            this.LL = 3;
            if (c2252331DDr2.emit(c404201hg2, this) == objLJFF) {
                C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.uploadImage$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.uploadImage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
