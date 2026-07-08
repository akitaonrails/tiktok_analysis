package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.psp.action.DownloadImageToDiskAction$downloadImageInQueue$1", f = "DownloadImageToDiskAction.kt", l = {}, m = "invokeSuspend")
public final class C1702770uPb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C207256168g LL;
    public final /* synthetic */ AbstractC1749630vdB LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702770uPb(C207256168g c207256168g, AbstractC1749630vdB abstractC1749630vdB, long j, InterfaceC1364105Vn<? super C1702770uPb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c207256168g;
        this.LLILLJJLI = abstractC1749630vdB;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702770uPb(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadImageToDiskAction@3fc5.downloadImageInQueue$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJ(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadImageToDiskAction@3fc5.downloadImageInQueue$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
