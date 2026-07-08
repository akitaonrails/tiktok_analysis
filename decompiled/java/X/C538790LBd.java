package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.asynctask.AsyncTaskManagerServiceImpl$restoreFinishedTaskAtAppForeground$1;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538790LBd extends C1619110sEf implements C0LCE {
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public final Map<String, C538810LBf> LLILLJJLI = new LinkedHashMap();
    public final C01GW LLILLL;
    public final ICreationAsyncTaskManager LLILZ;

    public C538790LBd() {
        int[] iArr = {LSPassThroughRecordSizeConfig.DEFAULT, 117, 2500};
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C538830LBh(this));
        this.LLILLL = c01gwLIZIZ;
        this.LLILZ = C09BV.LIZ();
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "CreationAsyncTask", "AsyncTaskManagerServiceImpl registerHandlerAndObserver");
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        c1908480zlO.LJ((C538930LBr) c01gwLIZIZ.getValue());
        c1908480zlO.LJIILL(this, iArr);
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new AsyncTaskManagerServiceImpl$restoreFinishedTaskAtAppForeground$1(this, null), 2);
        c1908480zlO.LJ(new C539000LBy());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(X.C538810LBf r11) {
        /*
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = r11.LIZLLL
            java.lang.String r0 = "tt_template_id"
            r2.LJFF(r0, r1)
            java.lang.String r1 = "tt_template_type"
            java.lang.String r0 = r11.LJ
            r2.LJFF(r1, r0)
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
            X.0LaT r1 = r11.LIZ
            X.0LaT r0 = X.EnumC545550LaT.COMPLETE
            if (r1 != r0) goto L4e
            java.lang.String r1 = "1"
        L2f:
            java.lang.String r0 = "async_status"
            r2.LJFF(r0, r1)
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r0 = r11.LIZIZ
            if (r0 == 0) goto L4c
            boolean r0 = r0.LJIIJJI()
            r1 = 1
            if (r0 != r1) goto L4c
        L3f:
            java.lang.String r0 = "is_from_create_template"
            r2.LIZJ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "ai_create_async_popup_show"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L4c:
            r1 = 0
            goto L3f
        L4e:
            java.lang.String r1 = "0"
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C538790LBd.LJIILJJIL(X.0LBf):void");
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        this.LL.set(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(X.C538810LBf r11, java.lang.String r12) {
        /*
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = r11.LIZLLL
            java.lang.String r0 = "tt_template_id"
            r2.LJFF(r0, r1)
            java.lang.String r1 = "tt_template_type"
            java.lang.String r0 = r11.LJ
            r2.LJFF(r1, r0)
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
            if (r0 == 0) goto L44
            boolean r0 = r0.LJIIJJI()
            r1 = 1
            if (r0 != r1) goto L44
        L37:
            java.lang.String r0 = "is_from_create_template"
            r2.LIZJ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "ai_create_async_popup_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L44:
            r1 = 0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C538790LBd.LJIILIIL(X.0LBf, java.lang.String):void");
    }

    public final void LJIILL(int i, String str) {
        C538810LBf c538810LBf;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        final Activity activityLIZ;
        final LifecycleOwner lifecycleOwnerLJFF;
        if (str.length() == 0 || (c538810LBf = (C538810LBf) ((LinkedHashMap) this.LLILLJJLI).get(str)) == null) {
            return;
        }
        InterfaceC539120LCk interfaceC539120LCk = ((C538930LBr) this.LLILLL.getValue()).LLILLL;
        if (interfaceC539120LCk != null) {
            interfaceC539120LCk.LIZIZ("clicked", null, false);
        }
        AwemeDraft awemeDraft = c538810LBf.LIZIZ;
        if (awemeDraft != null && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ2 != null) {
                lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ2.LJFF();
            } else {
                lifecycleOwnerLJFF = null;
            }
            final C538710LAv c538710LAv = new C538710LAv(c538810LBf, this, awemeDraft, activityLIZ, i);
            C542610LPv.LIZLLL(new C542550LPp(new InterfaceC537370L5r(activityLIZ, lifecycleOwnerLJFF) { // from class: X.0LBg
                public final Context LIZ;
                public final LifecycleOwner LIZIZ;

                @Override // X.InterfaceC537370L5r
                public final IDraftListener LIZ() {
                    return null;
                }

                @Override // X.InterfaceC537370L5r
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.InterfaceC537370L5r
                public final Context getContext() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC537370L5r
                public final LifecycleOwner getLifecycleOwner() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = activityLIZ;
                    this.LIZIZ = lifecycleOwnerLJFF;
                }
            }, awemeDraft, new C0M2T(false, null, "clickFromContinuePopup", 0, false, 23)), new InterfaceC542470LPh() { // from class: X.0LB4
                @Override // X.InterfaceC542470LPh
                public final void LIZ(C0LBJ c0lbj) {
                    VideoPublishEditModel videoPublishEditModel = c0lbj.LIZIZ;
                    if (videoPublishEditModel != null) {
                        c538710LAv.invoke(videoPublishEditModel);
                    } else {
                        C0MYY.LIZ(c0lbj.LIZ, activityLIZ);
                    }
                }

                @Override // X.InterfaceC542470LPh
                public final void LIZIZ(C0LBJ c0lbj) {
                    C0MYY.LIZ(c0lbj.LIZ, activityLIZ);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        if (r8 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        return new kotlin.Pair(r8, r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.13BV] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b5 -> B:12:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c7 -> B:12:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Pair<X.C0LSZ, ? extends java.util.List<X.C0LSZ>>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C538790LBd.LJIJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        String str2;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncTaskPushHandler, dismissCallback, reason: ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c563650M8t, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.set(false);
        if (innerPushMessage != null && innerPushMessage.getType() == 117) {
            AIGCPushMessage aIGCPushMessageLIZ = C538800LBe.LIZ(innerPushMessage.getBizExtraJsonStr());
            if (aIGCPushMessageLIZ != null) {
                str2 = aIGCPushMessageLIZ.creationId;
            } else {
                str2 = null;
            }
            C538810LBf c538810LBf = (C538810LBf) ((LinkedHashMap) this.LLILLJJLI).get(str2);
            if (c538810LBf != null && !Intrinsics.LJFF(str, "clicked")) {
                LJIILIIL(c538810LBf, "1");
            }
            C19719512Dh.LIZJ(this.LLILLJJLI).remove(str2);
        }
    }

    @Override // X.C0LCE
    public final void LJIIIIZZ(List list, String str, List list2, boolean z) {
        EnumC545550LaT enumC545550LaT;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processDraftId, draftId: ");
        sbLIZ.append(str);
        sbLIZ.append(", isSuccess: ");
        sbLIZ.append(z);
        sbLIZ.append(", serverTaskIds: ");
        sbLIZ.append(list2);
        C201955140j.LIZLLL(c563650M8t, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(str, 0, null, 6, null), false, false, false, 14));
        if (awemeDraftLJI == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("processDraftId: queryDraft returned null for draftId=");
            sbLIZ2.append(str);
            C201955140j.LIZLLL(c563650M8t, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (z) {
            enumC545550LaT = EnumC545550LaT.COMPLETE;
        } else {
            enumC545550LaT = EnumC545550LaT.FAILED;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("processDraftId: releasing push, draftId: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", status: ");
        sbLIZ3.append(enumC545550LaT);
        C201955140j.LIZLLL(c563650M8t, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ3));
        this.LLILLJJLI.put(str, new C538810LBf(enumC545550LaT, awemeDraftLJI, list, 24));
        if (!awemeDraftLJI.LIZ.autoPickModel.mediaList.isEmpty()) {
            String strLIZ = awemeDraftLJI.LIZ();
            if (!a0.LJJJIL(strLIZ)) {
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C538670LAr(this, strLIZ, awemeDraftLJI, z, null), 2);
            }
        }
    }

    public final void LJIILLIIL(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        if (a0.LJJJIL(str)) {
            return;
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C538680LAs(this, str, str2, str3, i, i2, str4, str5, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[PHI: r2
      0x0042: PHI (r2v1 X.0LSZ) = (r2v0 X.0LSZ), (r2v10 X.0LSZ) binds: [B:6:0x000f, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[PHI: r12 r13
      0x007a: PHI (r12v3 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String), (r12v4 java.lang.String) binds: [B:56:0x00bb, B:49:0x00b1, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r13v2 java.lang.String) = (r13v0 java.lang.String), (r13v4 java.lang.String), (r13v3 java.lang.String) binds: [B:56:0x00bb, B:49:0x00b1, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba A[PHI: r12
      0x00ba: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v0 java.lang.String), (r12v4 java.lang.String), (r12v4 java.lang.String) binds: [B:52:0x00b5, B:53:0x00b7, B:47:0x00a9, B:49:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1 A[PHI: r2
      0x00c1: PHI (r2v7 X.0LSZ) = (r2v1 X.0LSZ), (r2v1 X.0LSZ), (r2v10 X.0LSZ) binds: [B:17:0x0044, B:19:0x004c, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(java.util.List r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, java.lang.String r22, X.C0LSZ r23, int r24, int r25, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C538790LBd.LJIIZILJ(java.util.List, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, X.0LSZ, int, int, java.lang.String, java.lang.String):void");
    }
}
