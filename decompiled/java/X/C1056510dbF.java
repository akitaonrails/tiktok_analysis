package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056510dbF extends AbstractC1066890drz {
    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "webview";
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(null, null, new AwS560S0100000_16(this, 706), null, null, 27);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1056510dbF();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.THIRD_PART_GENERAL.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        if (C0XQ7.LJFF().isNewUser()) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2.getType() == type() && Intrinsics.LJFF(anchorCommonStruct2.subType(), "photo_2023_eoy")) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct3);
        LJIILIIL(anchorCommonStruct3);
        this.LLIZ = anchorCommonStruct3;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String strSubType;
        String strSubType2;
        LJIILJJIL();
        try {
            if (C036E.LIZ.LIZIZ()) {
                InterfaceC1392640mLO interfaceC1392640mLO = null;
                if (!C04UD.LIZ()) {
                    InterfaceC1392590mLJ interfaceC1392590mLJLJJJJJL = LJJJJJL();
                    String strLJIJJLI = LJIJJLI();
                    c2344009Gk.LJIIIZ("enter_from");
                    c2344009Gk.LJFF("enter_from", strLJIJJLI);
                    String aid = LJIIZILJ().getAid();
                    c2344009Gk.LJIIIZ("group_id");
                    c2344009Gk.LJFF("group_id", aid);
                    String authorUid = AwemeExtKt.getAuthorUid(LJIIZILJ());
                    c2344009Gk.LJIIIZ("author_id");
                    c2344009Gk.LJFF("author_id", authorUid);
                    String strLJIILIIL = C735370Ssx.LJIILIIL(LJIIZILJ());
                    c2344009Gk.LJIIIZ("music_id");
                    c2344009Gk.LJFF("music_id", strLJIILIIL);
                    C1065100dp6 c1065100dp6 = (C1065100dp6) interfaceC1392590mLJLJJJJJL;
                    String strLIZ = c1065100dp6.LIZ();
                    c2344009Gk.LJIIIZ("anchor_id");
                    c2344009Gk.LJFF("anchor_id", strLIZ);
                    String strLIZIZ = c1065100dp6.LIZIZ();
                    c2344009Gk.LJIIIZ("anchor_name");
                    c2344009Gk.LJFF("anchor_name", strLIZIZ);
                    String strLJ = c1065100dp6.LJ();
                    c2344009Gk.LJIIIZ("anchor_type");
                    c2344009Gk.LJFF("anchor_type", strLJ);
                    AnchorCommonStruct anchorCommonStruct = this.LLIZ;
                    if (anchorCommonStruct != null) {
                        strSubType2 = anchorCommonStruct.subType();
                    } else {
                        strSubType2 = null;
                    }
                    c2344009Gk.LJIIIZ("sub_type");
                    c2344009Gk.LJFF("sub_type", strSubType2);
                    LJJII(c2344009Gk, true, true);
                }
                AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
                if (anchorCommonStruct2 != null) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(LJIILJJIL(), anchorCommonStruct2.getSchema());
                    smartRouteBuildRoute.withParam("anchor_event_map", (HashMap) LJIJ(c2344009Gk));
                    InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
                    if (interfaceC1392640mLO2 == null) {
                        interfaceC1392640mLO2 = null;
                    }
                    String authorUid2 = AwemeExtKt.getAuthorUid(interfaceC1392640mLO2.LJJLIIIJJIZ());
                    String str = "";
                    if (authorUid2 == null) {
                        authorUid2 = "";
                    }
                    smartRouteBuildRoute.withParam("author_id", authorUid2);
                    InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
                    if (interfaceC1392640mLO3 == null) {
                        interfaceC1392640mLO3 = null;
                    }
                    String aid2 = interfaceC1392640mLO3.LJJLIIIJJIZ().getAid();
                    if (aid2 == null) {
                        aid2 = "";
                    }
                    smartRouteBuildRoute.withParam("group_id", aid2);
                    smartRouteBuildRoute.withParam("anchor_id", anchorCommonStruct2.getId());
                    smartRouteBuildRoute.withParam("enter_from", LJIJJLI());
                    InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
                    if (interfaceC1392640mLO4 != null) {
                        interfaceC1392640mLO = interfaceC1392640mLO4;
                    }
                    String aid3 = interfaceC1392640mLO.LJJLIIIJJIZ().getAid();
                    if (aid3 == null) {
                        aid3 = "";
                    }
                    smartRouteBuildRoute.withParam("from_group_id", aid3);
                    smartRouteBuildRoute.withParam("previous_page", LJIJJLI());
                    smartRouteBuildRoute.withParam("detail_aweme_from", LJIJJLI());
                    AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
                    if (anchorCommonStruct3 != null && (strSubType = anchorCommonStruct3.subType()) != null) {
                        str = strSubType;
                    }
                    smartRouteBuildRoute.withParam("anchor_subtype", str);
                    smartRouteBuildRoute.withParam("anchor_click_time", SystemClock.elapsedRealtime());
                    smartRouteBuildRoute.open();
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C0XF1.LIZIZ(LJIILJJIL())) {
            C1389890mGx c1389890mGx = new C1389890mGx(LJIILJJIL());
            c1389890mGx.LJIIIZ(2131829441);
            c1389890mGx.LJIIJJI();
            return;
        }
        C1626990sRN.LIZIZ(LJIILJJIL());
    }
}
