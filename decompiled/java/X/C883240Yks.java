package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Yks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883240Yks extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C883100Yke LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C883240Yks(C883100Yke c883100Yke) {
        super(0);
        this.LL = c883100Yke;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("SDKManagerV2", "u16 info fetched from remote");
        boolean zBooleanValue = ((Boolean) C270050AiB.LIZ.getValue()).booleanValue();
        C883100Yke c883100Yke = this.LL;
        C054G c054g = c883100Yke.LLIZ;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c883100Yke, 1659);
        if (zBooleanValue) {
            C23250099c.LIZLLL(c054g, null, null, new C314001Jq(awS558S0100000_14, null), 3);
        } else {
            awS558S0100000_14.invoke();
        }
        return Unit.LIZ;
    }
}
