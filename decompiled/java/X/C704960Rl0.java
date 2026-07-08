package X;

import Y.ARunnableS111S0100000_11;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704960Rl0 extends AbstractC704980Rl2<C705000Rl4, C698160Ra2> {
    public final C698160Ra2 LJIJ() {
        C705000Rl4 c705000Rl4 = (C705000Rl4) this.LJIIL;
        if (c705000Rl4 == null) {
            return null;
        }
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1376);
        if (!c705000Rl4.LIZLLL()) {
            return null;
        }
        C704990Rl3 c704990Rl3 = c705000Rl4.LIZJ;
        String str = c704990Rl3.LIZIZ;
        if (str == null) {
            str = "";
        }
        String str2 = c705000Rl4.LIZIZ;
        C698170Ra3 c698170Ra3 = c704990Rl3.LIZJ;
        return new C698160Ra2(str, str2, c704990Rl3.LJ, c704990Rl3.LJFF, c704990Rl3.LIZ, c698170Ra3, awS555S0100000_11, 128);
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
            C20684815ws.LJFF().submit(new ARunnableS111S0100000_11(this, 109));
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
        InterfaceC705020Rl6 interfaceC705020Rl6 = this.LJIILJJIL;
        if (interfaceC705020Rl6 != null) {
            interfaceC705020Rl6.show();
        }
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
            Function0<Unit> function02 = this.LJIILL;
            if (function02 != null) {
                function02.invoke();
            }
            InterfaceC705020Rl6 interfaceC705020Rl6 = this.LJIILJJIL;
            if (interfaceC705020Rl6 != null) {
                interfaceC705020Rl6.hide();
            }
            LIZLLL().LIZ = "exited";
            if (function0 != null) {
                function0.invoke();
            }
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

    public C704960Rl0(Context context, String str, String str2, C704840Rko c704840Rko, C704890Rkt c704890Rkt, AwS555S0100000_11 awS555S0100000_11) {
        super(context, str, str2, "Plain_InfoBar", c704840Rko, c704890Rkt, awS555S0100000_11);
    }
}
