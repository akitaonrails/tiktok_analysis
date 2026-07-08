package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097C, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$notifyAnchorKaraokeState$2", f = "KaraokeViewModel.kt", l = {865, 866, 868, 870, 872, 875, 878, 880}, m = "invokeSuspend")
public final class C097C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C099G LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ KaraokeViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C097C(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = z;
        this.LLILZLL = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C097C c097c = new C097C(this.LLILZLL, interfaceC1364105Vn, this.LLILZIL);
        c097c.LLILZ = obj;
        return c097c;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C097C.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
