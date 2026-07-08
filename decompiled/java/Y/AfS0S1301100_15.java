package Y;

import X.C09JN;
import X.C1C7U;
import X.C470590Icr;
import X.C915980Zwa;
import X.C974540bT2;
import X.C974930bTf;
import X.C975250bUB;
import X.EnumC919170a1j;
import X.EnumC976390bW1;
import X.InterfaceC975810bV5;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeAnchorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.ManageViewerSingReq;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AfS0S1301100_15 implements C09JN {
    public final int $t;
    public int i4;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S1301100_15 afS0S1301100_15, Object obj) {
        C1C7U.LIZ("TeamMatchInviteeViewModel@e3fd.requestRejectApi$dispose$1");
        C974540bT2.LIZ.LJLLILLLL(afS0S1301100_15.i4, afS0S1301100_15.j5, afS0S1301100_15.s0, (C470590Icr) obj, (EnumC919170a1j) afS0S1301100_15.l1);
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null) {
            interfaceC975810bV5LIZLLL.LJIILL(interfaceC975810bV5LIZLLL.LIZIZ());
        }
        ((C975250bUB) afS0S1301100_15.l2).LJIJ.setValue(C974930bTf.LIZ(new C974930bTf(null, null, null, null), null, null, (EnumC976390bW1) afS0S1301100_15.l3, null, 11));
        C1C7U.LIZIZ("TeamMatchInviteeViewModel@e3fd.requestRejectApi$dispose$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021d  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, com.bytedance.android.livesdk.model.message.linkcore.PermitResponse] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS0S1301100_15 r32, java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S1301100_15.accept$1(Y.AfS0S1301100_15, java.lang.Object):void");
    }

    public AfS0S1301100_15(KaraokeAnchorViewModel karaokeAnchorViewModel, int i, long j, ManageViewerSingReq manageViewerSingReq, Function1 function1, int i2) {
        this.$t = i2;
        this.l1 = karaokeAnchorViewModel;
        this.i4 = i;
        this.j5 = j;
        this.s0 = "karaoke";
        this.l2 = manageViewerSingReq;
        this.l3 = function1;
    }

    public AfS0S1301100_15(int i, long j, String str, EnumC919170a1j enumC919170a1j, C975250bUB c975250bUB, EnumC976390bW1 enumC976390bW1, int i2) {
        this.$t = i2;
        this.i4 = i;
        this.j5 = j;
        this.s0 = str;
        this.l1 = enumC919170a1j;
        this.l2 = c975250bUB;
        this.l3 = enumC976390bW1;
    }
}
