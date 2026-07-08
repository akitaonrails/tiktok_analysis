package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.cell.FriendsV3CellTrackAbility;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392530mLD implements InterfaceC712540RxE {
    public final InterfaceC1392640mLO LL;
    public final String LLILLL;
    public final String LLILZ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1392570mLH(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1392580mLI(this));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1392630mLN(this));
    public final int LLIZ = -1;
    public final int LLIZLLLIL = 1;

    public final C2344009Gk LIZIZ() {
        if (LJI().isEmpty() || C13LP.LJJJLL(LJI()) == null) {
            return new C2344009Gk();
        }
        InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) C13LP.LJJJJZI(LJI());
        InterfaceC1392590mLJ interfaceC1392590mLJLJJJJJL = interfaceC1393560mMs.LJJJJJL();
        C2344009Gk c2344009GkLIZLLL = interfaceC1392590mLJLJJJJJL.LIZLLL();
        String str = this.LLILLL;
        c2344009GkLIZLLL.getClass();
        c2344009GkLIZLLL.LJIIIIZZ("enter_method", str);
        c2344009GkLIZLLL.LJIIIIZZ("enter_from", this.LL.Cf());
        c2344009GkLIZLLL.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(this.LL.LJJLIIIJJIZ()));
        c2344009GkLIZLLL.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(this.LL.LJJLIIIJJIZ()));
        c2344009GkLIZLLL.LJIIIIZZ("group_id", this.LL.LJJLIIIJJIZ().getAid());
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_id", interfaceC1392590mLJLJJJJJL.LIZ());
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_name", interfaceC1392590mLJLJJJJJL.LIZIZ());
        c2344009GkLIZLLL.LJIIIIZZ("main_anchor_type", interfaceC1392590mLJLJJJJJL.LJ());
        int i = 0;
        c2344009GkLIZLLL.LIZJ(LJIIIIZZ() > 1 ? 1 : 0, "multi_anchor");
        c2344009GkLIZLLL.LIZJ(LJIIIIZZ(), "anchor_number");
        C712520RxC c712520RxC = (C712520RxC) this.LL;
        if (c712520RxC.LJIIJ() <= 1) {
            i = this.LLIZ;
        } else if (!C1392650mLP.LIZIZ(c712520RxC)) {
            i = this.LLIZLLLIL;
        }
        c2344009GkLIZLLL.LIZJ(i, "multi_anchor_display");
        c2344009GkLIZLLL.LJIIIIZZ("request_id", (String) this.LLILZIL.getValue());
        c2344009GkLIZLLL.LJIIIIZZ("component_key", C13LP.LJJLIIIJ(LJI(), ",", null, null, 0, null, new C1392550mLF(), 30));
        AnchorCommonStruct anchorCommonStructData = interfaceC1393560mMs.data();
        c2344009GkLIZLLL.LJIIIIZZ("main_component_key", anchorCommonStructData != null ? anchorCommonStructData.getComponentKey() : null);
        AIGCInfo aIGCInfo = ((C712520RxC) this.LL).LIZIZ.LIZ.aigcInfo;
        c2344009GkLIZLLL.LJ(aIGCInfo != null ? Integer.valueOf(aIGCInfo.getAIGCLabelType()) : null, "aigc_theme_status");
        LIZ(c2344009GkLIZLLL, "anchor_type", C13LP.LJJLIIIJ(LJI(), ",", null, null, 0, null, new C1392560mLG(), 30));
        LIZ(c2344009GkLIZLLL, "main_anchor_type", interfaceC1392590mLJLJJJJJL.LJ());
        List<InterfaceC1393560mMs> listLJI = LJI();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
        Iterator<InterfaceC1393560mMs> it2 = listLJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJJJJJL());
        }
        c2344009GkLIZLLL.LJFF("anchor_id", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, new C1392600mLK(), 30));
        c2344009GkLIZLLL.LJFF("anchor_name", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, new C1392610mLL(), 30));
        c2344009GkLIZLLL.LJFF("anchor_type", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, new C1392620mLM(), 30));
        if (C729510SjV.LJJIJIL(((C712520RxC) this.LL).LIZIZ.LIZ)) {
            c2344009GkLIZLLL.LJFF("story_type", C729510SjV.LJJIJIL(((C712520RxC) this.LL).LIZIZ.LIZ) ? "story" : "post");
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C712510RxB c712510RxB = ((C712520RxC) this.LL).LIZIZ;
            String str2 = c712510RxB.LIZJ;
            Activity activity = c712510RxB.LIZIZ;
            c735840Sti.getClass();
            c2344009GkLIZLLL.LJFF("enter_position", C735840Sti.LJIIJ(activity, str2, null));
        }
        if (C123100dR.LIZ(this.LLILZ)) {
            c2344009GkLIZLLL.LJFF("relation_enter_method", this.LLILZ);
        }
        return c2344009GkLIZLLL;
    }

    public final List<InterfaceC1393560mMs> LJI() {
        return (List) this.LLILLJJLI.getValue();
    }

    public final int LJIIIIZZ() {
        Iterator<InterfaceC1393560mMs> it2 = LJI().iterator();
        int iLJJLI = 0;
        while (it2.hasNext()) {
            iLJJLI += it2.next().LJJLI();
        }
        return iLJJLI;
    }

    public C1392530mLD(InterfaceC1392640mLO interfaceC1392640mLO) {
        this.LL = interfaceC1392640mLO;
        this.LLILLL = interfaceC1392640mLO.LLIIJI();
        this.LLILZ = interfaceC1392640mLO.LJI();
    }

    @Override // X.InterfaceC712540RxE
    public final void LIZJ(AnchorEventCenter anchorEventCenter) {
        anchorEventCenter.DQ2(this, "event_show", new C1392480mL8(this));
        anchorEventCenter.DQ2(this, "event_entrance_click", new C1392490mL9(this));
        anchorEventCenter.DQ2(this, "event_enter_detail", new C1392500mLA(this));
    }

    public final C2344009Gk LJ(InterfaceC1393560mMs interfaceC1393560mMs) {
        String componentKey;
        String componentKey2;
        String componentKey3;
        if (!LJI().isEmpty() && C13LP.LJJJLL(LJI()) != null) {
            InterfaceC1392590mLJ interfaceC1392590mLJLJJJJJL = interfaceC1393560mMs.LJJJJJL();
            C2344009Gk c2344009GkLIZLLL = interfaceC1392590mLJLJJJJJL.LIZLLL();
            String strCf = this.LL.Cf();
            c2344009GkLIZLLL.getClass();
            c2344009GkLIZLLL.LJIIIIZZ("enter_from", strCf);
            c2344009GkLIZLLL.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(this.LL.LJJLIIIJJIZ()));
            c2344009GkLIZLLL.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(this.LL.LJJLIIIJJIZ()));
            c2344009GkLIZLLL.LJIIIIZZ("group_id", this.LL.LJJLIIIJJIZ().getAid());
            c2344009GkLIZLLL.LJIIIIZZ("enter_method", this.LLILLL);
            c2344009GkLIZLLL.LJIIIIZZ("main_anchor_id", interfaceC1392590mLJLJJJJJL.LIZ());
            c2344009GkLIZLLL.LJIIIIZZ("main_anchor_name", interfaceC1392590mLJLJJJJJL.LIZIZ());
            c2344009GkLIZLLL.LJIIIIZZ("main_anchor_type", interfaceC1392590mLJLJJJJJL.LJ());
            int i = 0;
            c2344009GkLIZLLL.LIZJ(0, "multi_anchor");
            c2344009GkLIZLLL.LJIIIIZZ("anchor_id", interfaceC1392590mLJLJJJJJL.LIZ());
            c2344009GkLIZLLL.LJIIIIZZ("anchor_name", interfaceC1392590mLJLJJJJJL.LIZIZ());
            c2344009GkLIZLLL.LJIIIIZZ("anchor_type", interfaceC1392590mLJLJJJJJL.LJ());
            c2344009GkLIZLLL.LIZJ(1, "anchor_number");
            C712520RxC c712520RxC = (C712520RxC) this.LL;
            if (c712520RxC.LJIIJ() <= 1) {
                i = this.LLIZ;
            } else if (!C1392650mLP.LIZIZ(c712520RxC)) {
                i = this.LLIZLLLIL;
            }
            c2344009GkLIZLLL.LIZJ(i, "multi_anchor_display");
            c2344009GkLIZLLL.LJIIIIZZ("request_id", (String) this.LLILZIL.getValue());
            AnchorCommonStruct anchorCommonStructData = interfaceC1393560mMs.data();
            String componentKey4 = null;
            if (anchorCommonStructData != null) {
                componentKey = anchorCommonStructData.getComponentKey();
            } else {
                componentKey = null;
            }
            c2344009GkLIZLLL.LJIIIIZZ("component_key", componentKey);
            AnchorCommonStruct anchorCommonStructData2 = interfaceC1393560mMs.data();
            if (anchorCommonStructData2 != null) {
                componentKey2 = anchorCommonStructData2.getComponentKey();
            } else {
                componentKey2 = null;
            }
            c2344009GkLIZLLL.LJIIIIZZ("main_component_key", componentKey2);
            AnchorCommonStruct anchorCommonStructData3 = interfaceC1393560mMs.data();
            if (anchorCommonStructData3 != null) {
                componentKey3 = anchorCommonStructData3.getComponentKey();
            } else {
                componentKey3 = null;
            }
            LIZ(c2344009GkLIZLLL, "anchor_type", componentKey3);
            AnchorCommonStruct anchorCommonStructData4 = interfaceC1393560mMs.data();
            if (anchorCommonStructData4 != null) {
                componentKey4 = anchorCommonStructData4.getComponentKey();
            }
            LIZ(c2344009GkLIZLLL, "main_anchor_type", componentKey4);
            return c2344009GkLIZLLL;
        }
        return new C2344009Gk();
    }

    public final void LJIIJ(JSONObject jSONObject) {
        InterfaceC665370Q7z interfaceC665370Q7zK0;
        FriendsV3CellTrackAbility friendsV3CellTrackAbility;
        if (jSONObject == null) {
            return;
        }
        C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
        String strIu = c1599640rjG.Iu(this.LL.LJ());
        if (strIu.length() == 0) {
            return;
        }
        Boolean boolValueOf = null;
        if (Intrinsics.LJFF(strIu, "friends_v3_feeds") && (interfaceC665370Q7zK0 = this.LL.k0()) != null && (friendsV3CellTrackAbility = (FriendsV3CellTrackAbility) C1558520qew.LIZ(interfaceC665370Q7zK0, FriendsV3CellTrackAbility.class, null)) != null) {
            boolValueOf = Boolean.valueOf(friendsV3CellTrackAbility.If2());
        }
        c1599640rjG.Ou(jSONObject, new C1360330lVH(strIu, null, null, boolValueOf, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2344009Gk LJIIIZ(X.InterfaceC1393560mMs r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1392530mLD.LJIIIZ(X.0mMs, boolean):X.09Gk");
    }

    public static void LIZ(C2344009Gk c2344009Gk, String str, String str2) {
        if (TextUtils.isEmpty(c2344009Gk.LJIIIZ(str)) && str2 != null) {
            c2344009Gk.LJFF(str, str2);
        }
    }
}
