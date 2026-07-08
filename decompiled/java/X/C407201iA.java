package X;

import com.ss.android.ugc.tools.infosticker.repository.internal.recent.InfoStickerRecentCustomListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.recent.InfoStickerRecentCustomListViewModel$requestData$6", f = "InfoStickerRecentCustomListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C407201iA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InfoStickerRecentCustomListViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C407201iA(InfoStickerRecentCustomListViewModel infoStickerRecentCustomListViewModel, InterfaceC1364105Vn<? super C407201iA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = infoStickerRecentCustomListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C407201iA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InfoStickerRecentCustomListViewModel@b860.requestData$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        throw null;
    }
}
