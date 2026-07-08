package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel$panelStateListener$1$onFavouriteGiftIdsChanged$1", f = "MusicGiftDetailViewModel.kt", l = {}, m = "invokeSuspend")
public final class C592840NNa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MusicGiftDetailViewModel LL;
    public final /* synthetic */ List<Long> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592840NNa(MusicGiftDetailViewModel musicGiftDetailViewModel, List<Long> list, InterfaceC1364105Vn<? super C592840NNa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = musicGiftDetailViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592840NNa(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailViewModel@deb0.panelStateListener$1$onFavouriteGiftIdsChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashSet<Long> linkedHashSet = this.LL.LLJLLIL;
        List<Long> list = this.LLILLJJLI;
        linkedHashSet.clear();
        ArrayList arrayList = new ArrayList();
        for (Long l : list) {
            if (l.longValue() > 0) {
                arrayList.add(l);
            }
        }
        linkedHashSet.addAll(arrayList);
        this.LL.QQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.panelStateListener$1$onFavouriteGiftIdsChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
