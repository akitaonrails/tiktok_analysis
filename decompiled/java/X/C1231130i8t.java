package X;

import Y.ARunnableS119S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinCheckResult;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231130i8t {
    public static final C1231130i8t LIZ = new C1231130i8t();
    public static InterfaceC1231230i93 LIZIZ;
    public static DialogC1389620mGW LIZJ;

    public static Pair LIZ(List list) {
        boolean z;
        if (list == null) {
            return new Pair(Boolean.FALSE, C13BV.INSTANCE);
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!((GroupJoinCheckResult) it2.next()).pass) {
                    z = false;
                    break;
                }
            }
            z = true;
        } else {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((GroupJoinCheckResult) obj).pass) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((GroupJoinCheckResult) it3.next()).checkCode));
        }
        return new Pair(Boolean.valueOf(z), arrayList2);
    }

    public static final void LIZLLL(final View view, final boolean z, final String str) {
        C1481605r4.LIZIZ(new Runnable() { // from class: X.01mu
            public final void LIZ() {
                Activity activityLIZIZ;
                Activity activityLIZ;
                View view2 = view;
                if (view2 != null) {
                    boolean z2 = z;
                    String str2 = str;
                    if (!z2) {
                        C1389890mGx c1389890mGx = new C1389890mGx(view2);
                        c1389890mGx.LJIIJ(str2);
                        c1389890mGx.LJIIJJI();
                        return;
                    } else {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(view2);
                        c1389890mGx2.LJIIJ(str2);
                        c1389890mGx2.LJFF(R.raw.icon_tick_circle_fill);
                        c1389890mGx2.LJII(R.attr.a1h);
                        c1389890mGx2.LJIIJJI();
                        return;
                    }
                }
                boolean z3 = z;
                String str3 = str;
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
                    return;
                }
                if (!z3) {
                    C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ);
                    c1389890mGx3.LJIIJ(str3);
                    c1389890mGx3.LJIIJJI();
                } else {
                    C1389890mGx c1389890mGx4 = new C1389890mGx(activityLIZ);
                    c1389890mGx4.LJIIJ(str3);
                    c1389890mGx4.LJFF(R.raw.icon_tick_circle_fill);
                    c1389890mGx4.LJII(R.attr.a1h);
                    c1389890mGx4.LJIIJJI();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FanGroupJoinDowngradeImpl@b193.showToast$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FanGroupJoinDowngradeImpl@b193.showToast$1");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[PHI: r2 r3
      0x004a: PHI (r2v3 int) = (r2v1 int), (r2v4 int) binds: [B:36:0x0075, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r3v2 int) = (r3v0 int), (r3v3 int) binds: [B:36:0x0075, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[PHI: r2
      0x0074: PHI (r2v1 int) = (r2v0 int), (r2v5 int), (r2v5 int) binds: [B:33:0x0071, B:16:0x0033, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(final android.content.Context r10, final java.lang.String r11, java.lang.String r12, java.util.Map r13) {
        /*
            r8 = 0
            if (r13 == 0) goto L83
            java.lang.String r0 = "enter_from"
            java.lang.Object r7 = r13.get(r0)
            java.lang.String r7 = (java.lang.String) r7
        Lb:
            if (r12 == 0) goto L78
            int r0 = r12.length()
            if (r0 == 0) goto L78
            r8 = r12
        L14:
            if (r13 == 0) goto L70
            java.lang.String r0 = "aweim_prefer_push_in_panel_percent_type"
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L70
            java.lang.Double r0 = X.C2327809Ae.LJII(r0)
            if (r0 == 0) goto L70
            double r0 = r0.doubleValue()
            int r2 = (int) r0
        L2b:
            java.lang.String r0 = "aweim_prefer_push_in_panel"
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L74
            java.lang.Double r0 = X.C2327809Ae.LJII(r0)
            if (r0 == 0) goto L74
            double r0 = r0.doubleValue()
            int r3 = (int) r0
        L40:
            java.lang.String r0 = "traffic_type"
            java.lang.Object r9 = r13.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L4c
        L4a:
            java.lang.String r9 = ""
        L4c:
            if (r13 == 0) goto L6e
            java.lang.String r0 = "disable_background_mask"
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6e
            java.lang.Double r0 = X.C2327809Ae.LJII(r0)
            if (r0 == 0) goto L6e
            double r0 = r0.doubleValue()
            int r4 = (int) r0
        L63:
            X.0i6F r1 = new X.0i6F
            r6 = r11
            r5 = r10
            r1.<init>()
            X.C1481605r4.LIZIZ(r1)
            return
        L6e:
            r4 = 0
            goto L63
        L70:
            r2 = 1
            if (r13 == 0) goto L74
            goto L2b
        L74:
            r3 = 0
            if (r13 == 0) goto L4a
            goto L40
        L78:
            if (r13 == 0) goto L14
            java.lang.String r0 = "enter_method"
            java.lang.Object r8 = r13.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            goto L14
        L83:
            r7 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1231130i8t.LIZJ(android.content.Context, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static final void LJ(Context context, boolean z, C1231150i8v c1231150i8v, int i, String str, GroupJoinResponse groupJoinResponse) {
        String str2;
        if (!C461720I8s.LJ()) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C0I0B.LJFF.LIZ();
                Map<String, String> extraMap = c1231150i8v.getExtraMap();
                if (extraMap == null || (str2 = extraMap.get("enter_from")) == null) {
                    str2 = "";
                }
                C1400340mXo.LJIIIZ(activityLIZ, str2);
                return;
            }
            return;
        }
        C1481605r4.LIZIZ(new ARunnableS119S0100000_19(context, 7));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1231120i8s(c1231150i8v, z, i, str, context, groupJoinResponse, null), 3);
    }

    public static void LIZIZ(C1231150i8v c1231150i8v, boolean z, Integer num, List list, int i, Map map, int i2) {
        String str;
        String str2;
        Map<String, String> extraMap;
        Map map2 = map;
        int i3 = i;
        if ((i2 & 16) != 0) {
            i3 = 0;
        }
        String enterMethod = null;
        if ((i2 & 32) != 0) {
            map2 = null;
        }
        if ((i2 & 64) != 0 && (enterMethod = c1231150i8v.getEnterMethod()) == null && ((extraMap = c1231150i8v.getExtraMap()) == null || (enterMethod = extraMap.get("enter_method")) == null)) {
            enterMethod = "";
        }
        String etGroupType = c1231150i8v.getEtGroupType();
        if (etGroupType == null) {
            etGroupType = "";
        }
        if (z) {
            if (num != null && num.intValue() == 2) {
                str = "success";
            } else {
                str = "request_pending_approval";
            }
        } else {
            str = "fail";
        }
        String conversationId = c1231150i8v.getConversationId();
        Map<String, String> extraMap2 = c1231150i8v.getExtraMap();
        if (extraMap2 == null || (str2 = extraMap2.get("enter_from")) == null) {
            str2 = "";
        }
        C1528205ya.LJ(conversationId, str2, enterMethod, str, C0ZY9.FAN_GROUP.getValue(), etGroupType, C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62), map2, i3, C0I0B.LJFF.LIZIZ());
    }
}
