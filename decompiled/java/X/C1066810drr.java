package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0drr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066810drr extends AbstractC1066890drz {
    public static final EnumC1430380nKG LLJ = EnumC1430380nKG.NEWS;

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.AbstractC1066890drz
    public final boolean LJIJI() {
        return true;
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 701);
        return new C1400390mXt(awS560S0100000_16, awS560S0100000_16, awS560S0100000_16, null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1066810drr();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return LLJ.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        LJJIJIIJI(c2344009Gk);
        LJJIIJ(c2344009Gk);
    }

    public final void LJJIJIIJI(C2344009Gk c2344009Gk) {
        InterfaceC710290Rtb interfaceC710290RtbLIZ = C19513411Wa.LIZ();
        if (interfaceC710290RtbLIZ != null && ((C19513511Wb) interfaceC710290RtbLIZ).LIZ() != null) {
            C1066750drl.LIZ(c2344009Gk, this.LLIZ);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        LJJIJIIJI(c2344009Gk);
        super.p1(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String schema;
        Activity activityLJIILJJIL;
        InterfaceC1392640mLO interfaceC1392640mLO;
        Aweme awemeLJJLIIIJJIZ;
        InterfaceC710290Rtb interfaceC710290RtbLIZ;
        C1066750drl c1066750drlLIZ;
        String id;
        LJJIJIIJI(c2344009Gk);
        LJJII(c2344009Gk, true, true);
        LJIILJJIL();
        int i = 0;
        try {
            if (C036E.LIZ.LIZIZ()) {
                AnchorCommonStruct anchorCommonStruct = this.LLIZ;
                if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null && (activityLJIILJJIL = LJIILJJIL()) != null && (interfaceC1392640mLO = this.LL) != null && (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) != null && (interfaceC710290RtbLIZ = C19513411Wa.LIZ()) != null && (c1066750drlLIZ = ((C19513511Wb) interfaceC710290RtbLIZ).LIZ()) != null) {
                    String strCf = interfaceC1392640mLO.Cf();
                    String str = "";
                    if (strCf == null) {
                        strCf = "";
                    }
                    c2344009Gk.getClass();
                    c2344009Gk.LJIIIIZZ("enter_from", strCf);
                    c2344009Gk.LJIIIIZZ("anchor_type", LLJ.getTYPENAME());
                    String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
                    if (authorUid == null) {
                        authorUid = "";
                    }
                    c2344009Gk.LJIIIIZZ("author_id", authorUid);
                    String aid = awemeLJJLIIIJJIZ.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    c2344009Gk.LJIIIIZZ("from_group_id", aid);
                    AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
                    if (anchorCommonStruct2 != null && (id = anchorCommonStruct2.getId()) != null) {
                        str = id;
                    }
                    c2344009Gk.LJIIIIZZ("anchor_id", str);
                    List<AnchorCommonStruct> anchors = awemeLJJLIIIJJIZ.getAnchors();
                    if (anchors != null && anchors.size() > 1) {
                        i = 1;
                    }
                    c2344009Gk.LIZJ(i, "multi_anchor");
                    c1066750drlLIZ.LIZJ(activityLJIILJJIL, schema, new C1066760drm(c2344009Gk.LIZ));
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(LJIILJJIL());
        c1389890mGx.LJIIIZ(R.string.m25);
        c1389890mGx.LJIIJJI();
    }
}
