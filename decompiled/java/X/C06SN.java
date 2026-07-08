package X;

import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06SN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06SN implements InterfaceC868750Y6f {
    public final C06SL LIZ = new C06SL();
    public final PrivacySettingsFeature LIZIZ = C1336205Ku.LIZ(false).getImPrivacySettings();
    public String LIZJ;
    public long LIZLLL;

    @Override // X.InterfaceC868750Y6f
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC868750Y6f
    public final void LIZIZ() {
        C06SL c06sl = this.LIZ;
        c06sl.getClass();
        if (C884080YmE.LIZ().useUnreadCollector) {
            StringBuilder sb = new StringBuilder("reason to conversation count: ");
            for (Map.Entry<String, Integer> entry : c06sl.LIZIZ().entrySet()) {
                String key = entry.getKey();
                int iIntValue = entry.getValue().intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(key);
                sbLIZ.append(':');
                sbLIZ.append(iIntValue);
                sbLIZ.append('-');
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder("reason to unread count: ");
            for (Map.Entry<String, Integer> entry2 : c06sl.LIZJ().entrySet()) {
                String key2 = entry2.getKey();
                int iIntValue2 = entry2.getValue().intValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(key2);
                sbLIZ2.append(':');
                sbLIZ2.append(iIntValue2);
                sbLIZ2.append('-');
                sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
            String string2 = sb2.toString();
            if (Intrinsics.LJFF(string, c06sl.LJ) && Intrinsics.LJFF(string2, c06sl.LJFF)) {
                return;
            }
            c06sl.LJ = string;
            c06sl.LJFF = string2;
        }
    }

    public final void LJFF() {
        C06SL c06sl = this.LIZ;
        c06sl.getClass();
        if (C884080YmE.LIZ().useUnreadCollector) {
            if (C884080YmE.LIZ().useUnreadCollector) {
                c06sl.LIZIZ().clear();
                c06sl.LIZJ().clear();
                ((Map) c06sl.LIZJ.getValue()).clear();
                ((Map) c06sl.LIZLLL.getValue()).clear();
            }
            c06sl.LJ = "";
            c06sl.LJFF = "";
        }
    }

    @Override // X.InterfaceC868750Y6f
    public final C06SQ LIZ(C0Y8T c0y8t) {
        long jLJ;
        String str = this.LIZJ;
        if (str != null && Intrinsics.LJFF(str, c0y8t.getConversationId()) && C879070Ye9.LIZJ(c0y8t, C19212010Ec.LIZJ.LIZLLL())) {
            jLJ = this.LIZLLL;
        } else {
            jLJ = LJ(c0y8t, true);
        }
        c0y8t.getCategory();
        return new C06SQ(jLJ);
    }

    @Override // X.InterfaceC868750Y6f
    public final long LIZJ(C0Y8T c0y8t) {
        long jLJ = LJ(c0y8t, false);
        this.LIZJ = c0y8t.getConversationId();
        this.LIZLLL = jLJ;
        return jLJ;
    }

    public final long LJ(C0Y8T c0y8t, boolean z) {
        List list;
        C06SM[] c06smArr;
        long jLongValue;
        C06SL c06sl = this.LIZ;
        String conversationId = c0y8t.getConversationId();
        c06sl.getClass();
        if (C884080YmE.LIZ().useUnreadCollector && ((Map) c06sl.LIZJ.getValue()).containsKey(conversationId) && (list = (List) ((Map) c06sl.LIZJ.getValue()).get(conversationId)) != null && (c06smArr = (C06SM[]) list.toArray(new C06SM[0])) != null) {
            C06SM[] c06smArr2 = (C06SM[]) Arrays.copyOf(c06smArr, c06smArr.length);
            Long l = (Long) ((Map) c06sl.LIZLLL.getValue()).get(conversationId);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            int i = (int) jLongValue;
            String strLJJJ = C13LQ.LJJJ(Arrays.copyOf(c06smArr2, c06smArr2.length), "_", null, null, null, 62);
            if (c06sl.LIZIZ().get(strLJJJ) != null) {
                c06sl.LIZIZ().put(strLJJJ, Integer.valueOf(r0.intValue() - 1));
            }
            Integer num = c06sl.LIZJ().get(strLJJJ);
            if (num != null) {
                c06sl.LIZJ().put(strLJJJ, Integer.valueOf(num.intValue() - i));
            }
            ((Map) c06sl.LIZJ.getValue()).remove(conversationId);
        }
        C0Z2V.LIZ.getClass();
        boolean zLJI = C0Z2V.LJI(c0y8t);
        boolean zLJIJJLI = this.LIZIZ.LJIJJLI(true);
        if (!zLJI) {
            C06SL.LIZ(this.LIZ, c0y8t, false, false, false, 60);
            return 0L;
        }
        if (c0y8t.isMute() && (c0y8t.isSingleChat() || c0y8t.isGroupChat())) {
            C06SL.LIZ(this.LIZ, c0y8t, true, false, false, 58);
            return 0L;
        }
        if (!z && C879070Ye9.LIZLLL(c0y8t, C19212010Ec.LIZJ.LIZLLL())) {
            C06SL.LIZ(this.LIZ, c0y8t, false, true, false, 46);
            return 0L;
        }
        if (zLJIJJLI && c0y8t.isRisky()) {
            C06SL.LIZ(this.LIZ, c0y8t, false, false, true, 30);
            return 0L;
        }
        C06SL.LIZ(this.LIZ, c0y8t, false, false, false, 62);
        return c0y8t.getUnreadCount();
    }
}
