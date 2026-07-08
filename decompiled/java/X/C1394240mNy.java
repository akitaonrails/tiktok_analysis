package X;

import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394240mNy implements InterfaceC1394050mNf {
    public final AnchorCommonStruct LIZ;
    public final InterfaceC1392640mLO LIZIZ;

    @Override // X.InterfaceC1394050mNf
    public final EnumC1050190dR3 LIZ() {
        return null;
    }

    @Override // X.InterfaceC1394050mNf
    public final C1400390mXt o2() {
        return new C1400390mXt(new AwS565S0100000_21(this, 1332), new AwS565S0100000_21(this, 1333), new AwS565S0100000_21(this, 1334), null, null, 24);
    }

    @Override // X.InterfaceC1394050mNf
    public final boolean LIZIZ(C2344009Gk c2344009Gk) {
        if (C123100dR.LIZ(this.LIZ.getId())) {
            AnchorCommonStruct anchorCommonStruct = this.LIZ;
            this.LIZIZ.LJJLIIIJJIZ();
            C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct);
            c2344009Gk.LIZJ(this.LIZIZ.LJJLIIIJJIZ().getAwemeType(), "aweme_type");
            LJI(c2344009Gk);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1394050mNf
    public final void LIZJ(C2344009Gk c2344009Gk) {
        LJII(c2344009Gk);
        C20684815ws.LJIILLIIL("anchor_entrance_show", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1394050mNf
    public final void LIZLLL(C2344009Gk c2344009Gk) {
        LJII(c2344009Gk);
        C20684815ws.LJIILLIIL("anchor_entrance_click", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1394050mNf
    public final boolean LJ(C2344009Gk c2344009Gk) {
        if (this.LIZ.getId().length() == 0) {
            return false;
        }
        if (C1392450mL5.LIZ("capcut") && (this.LIZ.getType() == EnumC1430380nKG.CAPCUT.getTYPE() || C1394440mOI.LJ(this.LIZ) == EnumC1394470mOL.CAPCUT)) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().loadNLELib();
            ITemplateAnchorStrategyService iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) PluggableExtentionKt.pluggableSpi$default(ITemplateAnchorStrategyService.class, false, false, false, 14, null);
            if (iTemplateAnchorStrategyService != null) {
                iTemplateAnchorStrategyService.LIZIZ(this.LIZIZ.LIZIZ(), this.LIZ, this.LIZIZ.LJJLIIIJJIZ(), this.LIZIZ.Cf(), this.LIZIZ.LLIIJI(), this.LIZIZ.LJI(), c2344009Gk.LJIIIZ("main_anchor_type"), null);
            }
        } else {
            LJI(c2344009Gk);
        }
        AnchorCommonStruct anchorCommonStruct = this.LIZ;
        this.LIZIZ.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct);
        c2344009Gk.LIZJ(this.LIZIZ.LJJLIIIJJIZ().getAwemeType(), "aweme_type");
        return true;
    }

    @Override // X.InterfaceC1394050mNf
    public final void LJFF(C2344009Gk c2344009Gk) {
        LJII(c2344009Gk);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C2344009Gk r29) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394240mNy.LJI(X.09Gk):void");
    }

    public final C2344009Gk LJII(C2344009Gk c2344009Gk) {
        int i;
        Aweme awemeLJJLIIIJJIZ = this.LIZIZ.LJJLIIIJJIZ();
        String strOptString = this.LIZIZ.requestId().optString("request_id");
        String str = "";
        if (strOptString == null) {
            strOptString = "";
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(strOptString);
        C1E95 c1e95 = C1E95.LIZIZ;
        if (c1e95.LJIILL()) {
            c2344009Gk.LIZJ(c1e95.LJJIFFI(C735370Ssx.LIZJ(awemeLJJLIIIJJIZ)), "spammy_tag_cnt");
        }
        String strLIZ = C584850Mwl.LIZ.LIZ(logPbBean);
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("log_pb", strLIZ);
        String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
        if (authorUid == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        String aid = awemeLJJLIIIJJIZ.getAid();
        if (aid != null) {
            str = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZIZ.Cf());
        C1394340mO8.LIZJ(c2344009Gk, this.LIZ);
        if (C1394440mOI.LJ(this.LIZ) == EnumC1394470mOL.CAPCUT) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_capcut");
        c2344009Gk.LJIIIIZZ("mv_id", this.LIZ.getId());
        return c2344009Gk;
    }

    @Override // X.InterfaceC1394050mNf
    public final void p1(C2344009Gk c2344009Gk) {
        LJII(c2344009Gk);
    }

    public C1394240mNy(InterfaceC1392640mLO interfaceC1392640mLO, AnchorCommonStruct anchorCommonStruct) {
        this.LIZ = anchorCommonStruct;
        this.LIZIZ = interfaceC1392640mLO;
    }
}
