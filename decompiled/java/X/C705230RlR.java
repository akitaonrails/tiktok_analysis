package X;

import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RlR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705230RlR extends AbstractC705300RlY<C705260RlU> {
    public final InterfaceC497601wk LJIILLIIL;
    public C705270RlV LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;
    public int LJJI;

    public final TextView LJIJJ() {
        return (TextView) this.LJIJJ.getValue();
    }

    @Override // X.InterfaceC705050Rl9
    public final void onShow() {
        Aweme aweme;
        Aweme aweme2;
        InterfaceC702810RhX interfaceC702810RhX;
        Aweme aweme3;
        Aweme aweme4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", template: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", start exposing, aid: ");
        VideoItemParams videoItemParams = this.LJIIJJI;
        String aid = null;
        sbLIZ.append((videoItemParams == null || (aweme4 = videoItemParams.getAweme()) == null) ? null : aweme4.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(LIZLLL().LIZ, "exited")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("component: ");
            sbLIZ2.append(this.LIZJ);
            sbLIZ2.append(", template: ");
            sbLIZ2.append(this.LJ);
            sbLIZ2.append(", start report fdmt show, aid: ");
            VideoItemParams videoItemParams2 = this.LJIIJJI;
            sbLIZ2.append((videoItemParams2 == null || (aweme3 = videoItemParams2.getAweme()) == null) ? null : aweme3.getAid());
            C2188811AlT.LIZIZ(sbLIZ2);
            C704840Rko c704840Rko = this.LJII;
            if (c704840Rko != null && (interfaceC702810RhX = c704840Rko.LJI) != null) {
                interfaceC702810RhX.LIZIZ();
            }
            LJIILL();
            C20684815ws.LJFF().submit(new ARunnableS111S0100000_11(this, 205));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("component: ");
            sbLIZ3.append(this.LIZJ);
            sbLIZ3.append(", template: ");
            sbLIZ3.append(this.LJ);
            sbLIZ3.append(", finishing report fdmt show, aid: ");
            VideoItemParams videoItemParams3 = this.LJIIJJI;
            sbLIZ3.append((videoItemParams3 == null || (aweme2 = videoItemParams3.getAweme()) == null) ? null : aweme2.getAid());
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        ViewGroup viewGroup = this.LJFF;
        float f = this.LJJI;
        View view = this.LJI;
        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
        C704840Rko c704840Rko2 = this.LJII;
        LJIJ(viewGroup, f, viewGroup2, c704840Rko2 != null && c704840Rko2.LJFF > 1, new AwS555S0100000_11(this, 1696));
        LIZLLL().LIZ = "showing";
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("component: ");
        sbLIZ4.append(this.LIZJ);
        sbLIZ4.append(", template: ");
        sbLIZ4.append(this.LJ);
        sbLIZ4.append(", finishing exposing, aid: ");
        VideoItemParams videoItemParams4 = this.LJIIJJI;
        if (videoItemParams4 != null && (aweme = videoItemParams4.getAweme()) != null) {
            aid = aweme.getAid();
        }
        sbLIZ4.append(aid);
        C2188811AlT.LIZIZ(sbLIZ4);
    }

    @Override // X.InterfaceC705050Rl9
    public final void LIZ(String str) {
        String aid;
        Aweme aweme;
        boolean z;
        C705280RlW c705280RlW;
        Aweme aweme2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", template: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", start stop exposing, aid: ");
        VideoItemParams videoItemParams = this.LJIIJJI;
        String aid2 = null;
        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC705050Rl9.LIZ.getClass();
        if (!Intrinsics.LJFF(str, "un_select")) {
            ViewGroup viewGroup = this.LJFF;
            float f = this.LJJI;
            C705260RlU c705260RlU = (C705260RlU) this.LJIIL;
            if (c705260RlU != null && (c705280RlW = c705260RlU.LIZIZ) != null) {
                z = c705280RlW.LJFF;
            } else {
                z = true;
            }
            LJIJI(viewGroup, f, z, null, false);
        }
        LIZLLL().LIZ = "exited";
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("component: ");
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(", template: ");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append(", finish stop exposing, aid: ");
        VideoItemParams videoItemParams2 = this.LJIIJJI;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ2.append(aid2);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.AbstractC705030Rl7
    public final void LJIIL(String str, Function0<Unit> function0) {
        String aid;
        Aweme aweme;
        boolean z;
        C705280RlW c705280RlW;
        Aweme aweme2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", template: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", start handling manual exposure, stage: ");
        sbLIZ.append(str);
        sbLIZ.append(", aid: ");
        VideoItemParams videoItemParams = this.LJIIJJI;
        String aid2 = null;
        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(str, "exited")) {
            C705340Rlc c705340Rlc = this.LJIILIIL;
            if (c705340Rlc != null) {
                c705340Rlc.LIZ("exposure_action");
            }
            C705340Rlc c705340Rlc2 = this.LJIILIIL;
            if (c705340Rlc2 != null) {
                c705340Rlc2.LIZIZ("exposure_over_action");
            }
            ViewGroup viewGroup = this.LJFF;
            if (!(viewGroup instanceof ViewGroup)) {
                viewGroup = null;
            }
            float f = this.LJJI;
            C705260RlU c705260RlU = (C705260RlU) this.LJIIL;
            if (c705260RlU != null && (c705280RlW = c705260RlU.LIZIZ) != null) {
                z = c705280RlW.LJFF;
            } else {
                z = true;
            }
            LJIJI(viewGroup, f, z, function0, true);
            LIZLLL().LIZ = "exited";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("component: ");
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(", template: ");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append(", start finishing manual exposure, stage: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", aid: ");
        VideoItemParams videoItemParams2 = this.LJIIJJI;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ2.append(aid2);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    @Override // X.AbstractC705030Rl7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(X.AbstractC704860Rkq r22, kotlin.jvm.functions.Function0 r23) {
        /*
            Method dump skipped, instruction units count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C705230RlR.LJIIZILJ(X.0Rkq, kotlin.jvm.functions.Function0):void");
    }

    public C705230RlR(Context context, String str, String str2, View view, ViewGroup viewGroup, InterfaceC497601wk interfaceC497601wk, C704840Rko c704840Rko, Function0<Unit> function0) {
        super(context, str, str2, "Tip_Card", viewGroup, view, c704840Rko, function0);
        this.LJIILLIIL = interfaceC497601wk;
        this.LJIJ = C452501pT.LIZIZ(new AwS555S0100000_11(view, 1694));
        this.LJIJI = C452501pT.LIZIZ(new AwS555S0100000_11(view, 1692));
        this.LJIJJ = C452501pT.LIZIZ(new AwS555S0100000_11(view, 1693));
        this.LJIJJLI = C452501pT.LIZIZ(new AwS555S0100000_11(view, 1698));
        this.LJIL = C452501pT.LIZIZ(new AwS555S0100000_11(view, 1695));
        this.LJJ = C452501pT.LIZIZ(new AwS555S0100000_11(view, 1697));
        C1546210qL5.LIZ.getClass();
        this.LJJI = C814420VxA.LIZIZ(C1546210qL5.LIZ(52));
    }
}
