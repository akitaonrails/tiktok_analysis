package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LCT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LCT {
    public static final C0LCT LIZ = new C0LCT();
    public static final Keva LIZIZ = Keva.getRepo("creation_async_tasks_draft");
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    public static final Set<String> LIZIZ() {
        String string = LIZIZ.getString("checked_draft_list", "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCheckedDrafts, ");
        sbLIZ.append(string);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6));
    }

    public static final void LIZJ(AIGCPushMessage aIGCPushMessage) {
        C23250099c.LIZLLL(LIZJ, null, null, new C0LCD(aIGCPushMessage, null), 3);
    }

    public static final void LIZLLL(String str, boolean z) {
        Keva keva = LIZIZ;
        Set setLLIIIZ = C13LP.LLIIIZ(a0.LJJLIIIJILLIZJL(keva.getString("checked_draft_list", ""), new String[]{","}, 0, 6));
        if (z) {
            if (!setLLIIIZ.contains(str)) {
                setLLIIIZ.add(str);
                keva.storeString("checked_draft_list", C13LP.LJJLIIIJ(setLLIIIZ, ",", null, null, 0, null, null, 62));
                return;
            }
            return;
        }
        if (!setLLIIIZ.contains(str)) {
            return;
        }
        setLLIIIZ.remove(str);
        keva.storeString("checked_draft_list", C13LP.LJJLIIIJ(setLLIIIZ, ",", null, null, 0, null, null, 62));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r10, java.util.List<X.C0LSZ> r11, X.InterfaceC1364105Vn<? super X.C539070LCf> r12) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LCT.LIZ(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
    
        if (r4.isEmpty() != false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[LOOP:4: B:39:0x00cc->B:41:0x00d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f A[PHI: r11 r12 r13 r14 r15
      0x019f: PHI (r11v4 com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage) = 
      (r11v3 com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage)
      (r11v7 com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage)
     binds: [B:70:0x019e, B:63:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r12v4 com.ss.android.ugc.aweme.draft.model.AwemeDraft) = (r12v3 com.ss.android.ugc.aweme.draft.model.AwemeDraft), (r12v7 com.ss.android.ugc.aweme.draft.model.AwemeDraft) binds: [B:70:0x019e, B:63:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r13v4 java.lang.Object) = (r13v29 java.lang.Object), (r13v30 java.lang.Object) binds: [B:70:0x019e, B:63:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r14v2 java.util.List) = (r14v27 java.util.List), (r14v28 java.util.List) binds: [B:70:0x019e, B:63:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r15v8 java.util.List) = (r15v6 java.util.List), (r15v13 java.util.List) binds: [B:70:0x019e, B:63:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0270  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0203 -> B:84:0x021d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage r18, com.ss.android.ugc.aweme.draft.model.AwemeDraft r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LCT.LJ(com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage, com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }
}
