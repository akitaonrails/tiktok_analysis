package X;

/* JADX INFO: renamed from: X.0tJI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.biz.reveal.camera.RevealFakeDualCameraComponent", f = "RevealFakeDualCameraComponent.kt", l = {322}, m = "takePhoto")
public final class C1660420tJI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1660390tJF LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660420tJI(C1660390tJF c1660390tJF, InterfaceC1364105Vn<? super C1660420tJI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1660390tJF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RevealFakeDualCameraComponent@f872.takePhoto$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objS5 = this.LLILLJJLI.S5(false, this);
        C1C7U.LIZIZ("RevealFakeDualCameraComponent@f872.takePhoto$1");
        return objS5;
    }
}
