package X;

/* JADX INFO: renamed from: X.08cK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.reliability.emergencychannel.drill.EmergencyDrill", f = "EmergencyDrill.kt", l = {51}, m = "checkAfterDelay")
public final class C2154608cK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2154708cL LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2154608cK(C2154708cL c2154708cL, InterfaceC1364105Vn<? super C2154608cK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2154708cL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmergencyDrill@122d.checkAfterDelay$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("EmergencyDrill@122d.checkAfterDelay$1");
        return objLIZ;
    }
}
