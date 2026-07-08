package X;

import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705240RlS extends AbstractC705300RlY<C705250RlT> {
    public final InterfaceC497601wk LJIILLIIL;
    public final Function2<Boolean, View, Unit> LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public final List<C197039127h> LJIJJ;

    public final Map<String, C197039127h> LJIJJ() {
        return (Map) this.LJIJI.getValue();
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
            sbLIZ2.append(", start reporting fdmt show, aid: ");
            VideoItemParams videoItemParams2 = this.LJIIJJI;
            sbLIZ2.append((videoItemParams2 == null || (aweme3 = videoItemParams2.getAweme()) == null) ? null : aweme3.getAid());
            C2188811AlT.LIZIZ(sbLIZ2);
            C704840Rko c704840Rko = this.LJII;
            if (c704840Rko != null && (interfaceC702810RhX = c704840Rko.LJI) != null) {
                interfaceC702810RhX.LIZIZ();
            }
            LJIILL();
            C20684815ws.LJFF().submit(new ARunnableS111S0100000_11(this, 204));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("component: ");
            sbLIZ3.append(this.LIZJ);
            sbLIZ3.append(", template: ");
            sbLIZ3.append(this.LJ);
            sbLIZ3.append(", finish reporting fdmt show, aid: ");
            VideoItemParams videoItemParams3 = this.LJIIJJI;
            sbLIZ3.append((videoItemParams3 == null || (aweme2 = videoItemParams3.getAweme()) == null) ? null : aweme2.getAid());
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        ViewGroup viewGroup = this.LJFF;
        float fLIZ = C339190DRl.LIZ(36);
        View view = this.LJI;
        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
        C704840Rko c704840Rko2 = this.LJII;
        LJIJ(viewGroup, fLIZ, viewGroup2, c704840Rko2 != null && c704840Rko2.LJFF > 1, new AwS555S0100000_11(this, 1685));
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
        C705290RlX c705290RlX;
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
            float fLIZ = C339190DRl.LIZ(36);
            C705250RlT c705250RlT = (C705250RlT) this.LJIIL;
            if (c705250RlT != null && (c705290RlX = c705250RlT.LIZIZ) != null) {
                z = c705290RlX.LIZJ;
            } else {
                z = true;
            }
            LJIJI(viewGroup, fLIZ, z, null, false);
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
        C705290RlX c705290RlX;
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
            if (Intrinsics.LJFF(LIZLLL().LIZ, "exited")) {
                return;
            }
            LIZLLL().LIZ = "exited";
            C705340Rlc c705340Rlc = this.LJIILIIL;
            if (c705340Rlc != null) {
                c705340Rlc.LIZ("exposure_action");
            }
            C705340Rlc c705340Rlc2 = this.LJIILIIL;
            if (c705340Rlc2 != null) {
                c705340Rlc2.LIZIZ("exposure_over_action");
            }
            ViewGroup viewGroup = this.LJFF;
            float fLIZ = C339190DRl.LIZ(36);
            C705250RlT c705250RlT = (C705250RlT) this.LJIIL;
            if (c705250RlT != null && (c705290RlX = c705250RlT.LIZIZ) != null) {
                z = c705290RlX.LIZJ;
            } else {
                z = true;
            }
            LJIJI(viewGroup, fLIZ, z, function0, true);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("component: ");
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(", template: ");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append(", finish handling manual exposure, stage: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", aid: ");
        VideoItemParams videoItemParams2 = this.LJIIJJI;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ2.append(aid2);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0354 A[SYNTHETIC] */
    @Override // X.AbstractC705030Rl7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(X.AbstractC704860Rkq r21, kotlin.jvm.functions.Function0 r22) {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C705240RlS.LJIIZILJ(X.0Rkq, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(X.C197039127h r10, X.C705270RlV r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C705240RlS.LJIJJLI(X.127h, X.0RlV):void");
    }

    @Override // X.AbstractC705030Rl7
    public final void LJIIIZ(VideoItemParams videoItemParams, AbstractC704860Rkq abstractC704860Rkq, C705340Rlc c705340Rlc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", template: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", start binding template data, aid: ");
        sbLIZ.append(videoItemParams.getAweme().getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        LJIJJ().clear();
        ((Map) this.LJIJ.getValue()).clear();
        super.LJIIIZ(videoItemParams, abstractC704860Rkq, c705340Rlc);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("component: ");
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(", template: ");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append(", finish binding template data, aid: ");
        sbLIZ2.append(videoItemParams.getAweme().getAid());
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C705240RlS(Context context, String str, String str2, ViewGroup viewGroup, View view, C704840Rko c704840Rko, LifecycleCoroutineScope lifecycleCoroutineScope, AwS625S0100000_11 awS625S0100000_11, AwS555S0100000_11 awS555S0100000_11) {
        super(context, str, str2, "Plain_Button", viewGroup, view, c704840Rko, awS555S0100000_11);
        this.LJIILLIIL = lifecycleCoroutineScope;
        this.LJIIZILJ = awS625S0100000_11;
        this.LJIJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(533));
        this.LJIJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1468));
        this.LJIJJ = new ArrayList();
    }
}
