package X;

import Y.ARunnableS84S0200000_15;
import android.os.Handler;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957570b1f extends AbstractC957580b1g<C954670awz, CancelInviteJoinGroupResult> {
    public final C784440Upu LIZIZ;
    public final Handler LIZJ;
    public final InterfaceC954310awP LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C957570b1f(C784440Upu c784440Upu, BPEAHandler bPEAHandler) {
        super(null);
        C0TW8 c0tw8 = C0TW8.LIZ;
        this.LIZIZ = c784440Upu;
        this.LIZJ = bPEAHandler;
        this.LIZLLL = c0tw8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC957580b1g
    public final boolean LIZ(C954670awz c954670awz, AbstractC915270ZvR abstractC915270ZvR, InterfaceC920680a4A<CancelInviteJoinGroupResult> interfaceC920680a4A) {
        Integer num;
        C954670awz c954670awz2 = c954670awz;
        int iIntValue = 0;
        if (!Intrinsics.LJFF(abstractC915270ZvR, C915280ZvS.LIZ)) {
            AbstractC957580b1g<DATA, RESULT> abstractC957580b1g = this.LIZ;
            if (abstractC957580b1g == 0) {
                return false;
            }
            return abstractC957580b1g.LIZ((DATA) c954670awz2, abstractC915270ZvR, (InterfaceC920680a4A<RESULT>) interfaceC920680a4A);
        }
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1V1;
        long j = c954670awz2.LIZIZ;
        C957590b1h c957590b1h = new C957590b1h(new AwS416S0200000_15(this, (C957570b1f) interfaceC920680a4A, (InterfaceC920680a4A<CancelInviteJoinGroupResult>) 68), new AwS381S0200000_15(this, (C957570b1f) interfaceC920680a4A, (InterfaceC920680a4A<CancelInviteJoinGroupResult>) 111));
        long j2 = c954670awz2.LIZJ;
        Object obj = c954670awz2.LJFF.get("invite_type");
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            iIntValue = num.intValue();
        }
        C974150bSP c974150bSP = new C974150bSP(enumC919170a1j, j, c957590b1h, new C957560b1e(iIntValue, j2));
        InterfaceC954310awP interfaceC954310awP = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sent battle cancel event to Match service. event=");
        sbLIZ.append(c974150bSP);
        interfaceC954310awP.d("QuickBattleCancelInvite", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS84S0200000_15(this, c974150bSP, 45));
        return true;
    }
}
