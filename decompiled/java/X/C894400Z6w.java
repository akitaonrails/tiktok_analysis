package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Z6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894400Z6w {
    public static final C01GW LIZ = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(317));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static void LIZ(Context context, String str, String str2, String str3, EnumC1230500i7s enumC1230500i7s) {
        ?? arrayList;
        String conversationId;
        String string;
        C19EG c19eg;
        List<Long> memberIds;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        C01GW c01gw = LIZ;
        Integer numValueOf = null;
        if (((C0Z6T) c01gw.getValue()).LJIILJJIL(c0y8tLIZ)) {
            C913630Zsn.LJIIJJI.getClass();
            C1227540i36.LJIIIZ(str, str2);
            C1227540i36.LJIIJJI("add_group_member_start", C2097608Jq.LJ());
            C1227540i36.LJIIL(new C1227650i3H(C0ZBV.BUSINESS_FAIL, -10001));
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C0Z6T c0z6t = (C0Z6T) c01gw.getValue();
                if (c0z6t != null) {
                    numValueOf = Integer.valueOf(c0z6t.LIZ(c0y8tLIZ));
                }
                C1527905yX.LIZ(numValueOf);
                String strLIZ = C0YUN.LIZ.LIZ();
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(strLIZ);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (!((C0Z6T) c01gw.getValue()).LJIIZILJ(c0y8tLIZ)) {
            C913630Zsn.LJIIJJI.getClass();
            C1227540i36.LJIIIZ(str, str2);
            C1227540i36.LJIIJJI("add_group_member_start", C2097608Jq.LJ());
            C1227540i36.LJIIL(new C1227650i3H(C0ZBV.BUSINESS_FAIL, -10002));
            Activity activityLIZ2 = C1388190mED.LIZ(context);
            if (activityLIZ2 != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                c1389890mGx2.LJIIIZ(2131830657);
                c1389890mGx2.LJIIJJI();
                return;
            }
            return;
        }
        int i = 0;
        IMGroupChatDetailAnalytics.LIZ.LJFF("click_add_member", new Pair[]{new Pair("enter_from", str2), new Pair("enter_method", str3)}, C0I0B.LJFF.LIZIZ());
        if (c0y8tLIZ != null && (memberIds = c0y8tLIZ.getMemberIds()) != null) {
            arrayList = new ArrayList();
            Iterator<Long> it2 = memberIds.iterator();
            while (it2.hasNext()) {
                String string2 = it2.next().toString();
                if (string2 != null) {
                    arrayList.add(string2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (C1229100i5c.LIZ.LJIIJJI(str)) {
            if (c0y8tLIZ != null) {
                Activity activityLIZ3 = C1388190mED.LIZ(context);
                if ((activityLIZ3 instanceof C19EG) && (c19eg = (C19EG) activityLIZ3) != null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), null, null, new C615220OBc(context, c0y8tLIZ, arrayList, str2, str3, enumC1230500i7s, c19eg, null), 3);
                    return;
                }
                return;
            }
            return;
        }
        if (c0y8tLIZ == null || (conversationId = c0y8tLIZ.getConversationId()) == null) {
            return;
        }
        boolean zLJIIIZ = C0Z58.LIZ.LJIIIZ(conversationId);
        boolean zLIZ = C1727806pg.LIZ.LIZ("group_chat_operation_audit_request", conversationId, C461720I8s.LIZIZ(), false);
        int iLIZ = C1527905yX.LIZ(Integer.valueOf(((C0Z6T) LIZ.getValue()).LIZ(c0y8tLIZ))) - arrayList.size();
        if (iLIZ >= 0) {
            i = iLIZ;
        }
        if (zLJIIIZ && !zLIZ) {
            string = context.getString(2131835235);
        } else {
            string = "";
        }
        C1226990i2D c1226990i2D = new C1226990i2D(context, str2, str3, i, conversationId, arrayList, string, enumC1230500i7s);
        C1227130i2R.LIZ.getClass();
        C1227130i2R.LJ(context, c1226990i2D);
    }

    public static void LIZIZ(Context context, C0Y8T c0y8t, List list, String str, String str2, EnumC1230500i7s enumC1230500i7s, List list2) {
        C1227810i3X c1227810i3X;
        List listLIZIZ = list2;
        String conversationId = c0y8t.getConversationId();
        int iLIZ = C0ZFW.LIZ.LIZ(c0y8t) - list.size();
        if (iLIZ < 0) {
            iLIZ = 0;
        }
        EnumC1219960hqs enumC1219960hqsLIZ = C1229100i5c.LIZ(conversationId);
        boolean zLJIIIZ = C0Z58.LIZ.LJIIIZ(conversationId);
        boolean zLIZ = C1727806pg.LIZ.LIZ("group_chat_operation_audit_request", conversationId, C461720I8s.LIZIZ(), false);
        if (listLIZIZ == null) {
            C0NZN.LIZ.getClass();
            listLIZIZ = C0NZN.LIZIZ(conversationId);
        }
        int i = C1219710hqT.LIZ[enumC1219960hqsLIZ.ordinal()];
        String string = "";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        c1227810i3X = new C1227810i3X(C1383370m6R.LIZ.getString(2131830148), "");
                    } else {
                        Context context2 = C1383370m6R.LIZ;
                        c1227810i3X = new C1227810i3X(context2.getString(2131834306), context2.getString(2131834305));
                    }
                } else {
                    c1227810i3X = new C1227810i3X(C1383370m6R.LIZ.getString(2131830148), "");
                }
            } else {
                Context context3 = C1383370m6R.LIZ;
                c1227810i3X = new C1227810i3X(context3.getString(2131830150), context3.getString(2131830151));
            }
        } else {
            Context context4 = C1383370m6R.LIZ;
            c1227810i3X = new C1227810i3X(context4.getString(2131830152), context4.getString(2131830153));
        }
        if (zLJIIIZ && !zLIZ) {
            string = context.getString(2131835235);
        }
        C1226950i29 c1226950i29 = new C1226950i29(context, str, str2, conversationId, list, iLIZ, listLIZIZ, c1227810i3X, string, enumC1230500i7s);
        C1227130i2R.LIZ.getClass();
        C1227130i2R.LJ(context, c1226950i29);
    }
}
