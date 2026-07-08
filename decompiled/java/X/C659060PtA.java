package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0PtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659060PtA {
    public static final C659060PtA LIZ = new C659060PtA();

    public static void LIZIZ(String str, Aweme aweme, C653660PkS c653660PkS, Map map) {
        String aid;
        Map map2 = map;
        if (c653660PkS != null) {
            LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", c653660PkS.LJIIIIZZ);
            linkedHashMap.put("search_type", c653660PkS.LIZLLL);
            linkedHashMap.put("search_id", c653660PkS.LJIIJ);
            linkedHashMap.put("search_result_id", c653660PkS.LJIJI);
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            linkedHashMap.put("group_id", aid);
            linkedHashMap.put("search_keyword", c653660PkS.LJFF);
            linkedHashMap.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
            map2 = linkedHashMap;
        } else if (map == null) {
            return;
        }
        C20684815ws.LJIILLIIL(str, map2);
    }

    public static void LIZ(C659060PtA c659060PtA, View view, Aweme aweme, C653660PkS c653660PkS, Map map, int i) {
        if ((i & 4) != 0) {
            c653660PkS = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        c659060PtA.getClass();
        Context context = view.getContext();
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIJ(context.getString(2131829774));
        c1389890mGx.LJIIJJI();
        LIZIZ("sounds_remove_click", aweme, c653660PkS, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C659060PtA r3, com.ss.android.ugc.aweme.feed.model.Aweme r4, X.C1012300cRw r5, com.bytedance.tux.icon.TuxIconView r6, X.C653660PkS r7, java.util.Map r8, int r9) {
        /*
            r0 = r9 & 8
            r2 = 0
            if (r0 == 0) goto L6
            r7 = r2
        L6:
            r0 = r9 & 16
            if (r0 == 0) goto Lb
            r8 = r2
        Lb:
            r3.getClass()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isMute = "
            r1.append(r0)
            if (r4 == 0) goto L96
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r4)
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.feed.model.AwemeStatus$VideoMuteInfo r0 = r0.getVideoMuteInfo()
            if (r0 == 0) goto L96
            boolean r0 = r0.isMute()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2d:
            r1.append(r0)
            java.lang.String r0 = ", copyright = "
            r1.append(r0)
            if (r4 == 0) goto L4b
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r4)
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.feed.model.AwemeStatus$VideoMuteInfo r0 = r0.getVideoMuteInfo()
            if (r0 == 0) goto L4b
            boolean r0 = r0.getIsCopyrightViolation()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L4b:
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            boolean r0 = X.C659070PtB.LIZ(r4)
            r2 = 0
            if (r0 == 0) goto L94
            X.C659080PtC.LJFF()
            int r0 = X.C659080PtC.LIZIZ
            if (r0 == 0) goto L65
            boolean r0 = X.C07P0.LIZIZ()
            if (r0 != 0) goto L94
        L65:
            r0 = 1
        L66:
            r1 = 8
            if (r0 == 0) goto L83
            if (r5 == 0) goto L6f
            X.C786410Ut5.r1(r5, r1)
        L6f:
            if (r6 == 0) goto L78
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L78
        L77:
            return
        L78:
            java.lang.String r0 = "sounds_remove_show"
            LIZIZ(r0, r4, r7, r8)
            if (r6 == 0) goto L77
            X.C786410Ut5.LLLLLLZZ(r6, r2)
            return
        L83:
            boolean r0 = X.C07P0.LIZIZ()
            if (r0 == 0) goto L8e
            if (r5 == 0) goto L8e
            X.C786410Ut5.r1(r5, r2)
        L8e:
            if (r6 == 0) goto L77
            X.C786410Ut5.LLLLLLZZ(r6, r1)
            return
        L94:
            r0 = 0
            goto L66
        L96:
            r0 = r2
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C659060PtA.LIZLLL(X.0PtA, com.ss.android.ugc.aweme.feed.model.Aweme, X.0cRw, com.bytedance.tux.icon.TuxIconView, X.0PkS, java.util.Map, int):void");
    }

    public static void LIZJ(C659060PtA c659060PtA, Aweme aweme, boolean z, C1012300cRw c1012300cRw, TuxIconView tuxIconView, C653660PkS c653660PkS, Map map, int i) {
        if ((i & 16) != 0) {
            c653660PkS = null;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        c659060PtA.getClass();
        int i2 = 8;
        if (c1012300cRw != null) {
            C786410Ut5.r1(c1012300cRw, 8);
        }
        if (tuxIconView != null) {
            if (!z && C659070PtB.LIZ(aweme)) {
                LIZIZ("sounds_remove_show", aweme, c653660PkS, map);
                i2 = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i2);
        }
    }
}
