package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538870LBl extends C1619110sEf implements C0LCE {
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public final Map<String, C538890LBn> LLILLJJLI = new LinkedHashMap();
    public final C01GW LLILLL;

    public C538870LBl() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C538900LBo(this));
        this.LLILLL = c01gwLIZIZ;
        C201955140j.LIZLLL(C538950LBt.LIZIZ, "EditorProAIGCServiceImpl", "AsyncTaskManagerServiceImpl registerHandlerAndObserver");
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        c1908480zlO.LJ((C0LCJ) c01gwLIZIZ.getValue());
        c1908480zlO.LJIILL(this, new int[]{2397, 2449});
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        this.LL.set(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(X.C538890LBn r11, java.lang.String r12, int r13) {
        /*
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.util.List<java.lang.String> r3 = r11.LIZJ
            java.lang.String r4 = ","
            r5 = 0
            r7 = 0
            r10 = 62
            r6 = r5
            r8 = r5
            r9 = r5
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "async_function_list"
            r2.LJFF(r0, r1)
            java.lang.String r0 = "async_status"
            r2.LJFF(r0, r12)
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r0 = r11.LIZIZ
            if (r0 == 0) goto L45
            boolean r0 = r0.LJIIJJI()
            r1 = 1
            if (r0 != r1) goto L45
        L29:
            java.lang.String r0 = "is_from_create_template"
            r2.LIZJ(r1, r0)
            r0 = 2397(0x95d, float:3.359E-42)
            if (r13 == r0) goto L47
            r0 = 2449(0x991, float:3.432E-42)
            if (r13 != r0) goto L44
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "click"
            r2.LJFF(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "ai_video_tool_async_popup"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L44:
            return
        L45:
            r1 = 0
            goto L29
        L47:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "ai_create_async_popup_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C538870LBl.LJIILIIL(X.0LBn, java.lang.String, int):void");
    }

    public static void LJIILJJIL(int i, boolean z, boolean z2) {
        String str;
        String str2;
        if (z) {
            if (z2) {
                str = "direct_jump";
            } else {
                str = "task_fail";
            }
        } else {
            str = "lost_draft";
        }
        if (i == 2449) {
            str2 = "create_tab_video";
        } else {
            str2 = "ep_ai_create";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("business", str2);
        c2344009Gk.LJFF("enter_from", "in_app_push");
        c2344009Gk.LIZJ(1, "is_hit_experiment");
        c2344009Gk.LJFF("action_result", str);
        C20684815ws.LJIILLIIL("aigc_recall_action_result", c2344009Gk.LIZ);
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        String str2;
        C538950LBt c538950LBt = C538950LBt.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncTaskPushHandler, dismissCallback, reason: ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c538950LBt, "EditorProAIGCServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.set(false);
        if (innerPushMessage != null) {
            if (innerPushMessage.getType() == 2397 || innerPushMessage.getType() == 2449) {
                AIGCPushMessage aIGCPushMessageLIZ = C538880LBm.LIZ(innerPushMessage.getBizExtraJsonStr());
                if (aIGCPushMessageLIZ != null) {
                    str2 = aIGCPushMessageLIZ.creationId;
                } else {
                    str2 = null;
                }
                C538890LBn c538890LBn = (C538890LBn) ((LinkedHashMap) this.LLILLJJLI).get(str2);
                if (c538890LBn != null && !Intrinsics.LJFF(str, "clicked")) {
                    LJIILIIL(c538890LBn, "1", innerPushMessage.getType());
                }
                C19719512Dh.LIZJ(this.LLILLJJLI).remove(str2);
            }
        }
    }

    @Override // X.C0LCE
    public final void LJIIIIZZ(List list, String str, List list2, boolean z) {
        EnumC545550LaT enumC545550LaT;
        C538950LBt c538950LBt = C538950LBt.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processDraftId, draftId: ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c538950LBt, "EditorProAIGCServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(str, 0, null, 6, null), false, false, false, 14));
        if (awemeDraftLJI == null) {
            return;
        }
        if (z) {
            enumC545550LaT = EnumC545550LaT.COMPLETE;
        } else {
            enumC545550LaT = EnumC545550LaT.FAILED;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update draft status, draftId: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", status: ");
        sbLIZ2.append(enumC545550LaT);
        C201955140j.LIZLLL(c538950LBt, "EditorProAIGCServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLILLJJLI.put(str, new C538890LBn(enumC545550LaT, awemeDraftLJI, list, 24));
    }
}
