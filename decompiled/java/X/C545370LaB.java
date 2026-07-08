package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.absetting.AigcArchAttachCountdownVideoExperiment;
import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0LaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545370LaB implements C0LZB {
    public static final C545370LaB LIZ = new C545370LaB();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(652));

    public static AIGCWorkflowCreationService LJIIIZ() {
        return (AIGCWorkflowCreationService) LIZIZ.getValue();
    }

    public static C0M6F LJIIJ() {
        return C0CHQ.LIZ().LJI();
    }

    @Override // X.C0LZB
    public final boolean LIZLLL(AwemeDraft awemeDraft) {
        String str;
        if (AigcArchAttachCountdownVideoExperiment.isEnabled() ? awemeDraft != null : !(awemeDraft == null || ((str = awemeDraft.LJJJJIZL.videoCoverPath) != null && str.length() == 0))) {
            if (awemeDraft.LIZIZ() != null) {
                if (awemeDraft.LIZ.aigcOfflineModel.reqKey.length() != 0 && awemeDraft.LIZ.aigcOfflineModel.reqJson.length() != 0) {
                    return true;
                }
                List<AIGCInputItem> list = awemeDraft.LIZ.aigcOfflineModel.inputItems;
                if (list != null && !list.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    @Override // X.C0LZB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.app.Activity r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, X.InterfaceC1364105Vn r25) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545370LaB.LIZJ(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be A[PHI: r5 r11 r12 r13 r14
      0x01be: PHI (r5v10 X.0LSZ) = (r5v11 X.0LSZ), (r5v11 X.0LSZ), (r5v11 X.0LSZ), (r5v12 X.0LSZ), (r5v14 X.0LSZ) binds: [B:59:0x016d, B:69:0x019c, B:76:0x01bb, B:77:0x01bd, B:54:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r11v10 android.app.Activity) = 
      (r11v12 android.app.Activity)
      (r11v12 android.app.Activity)
      (r11v12 android.app.Activity)
      (r11v12 android.app.Activity)
      (r11v13 android.app.Activity)
     binds: [B:59:0x016d, B:69:0x019c, B:76:0x01bb, B:77:0x01bd, B:54:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r12v5 int) = (r12v7 int), (r12v7 int), (r12v7 int), (r12v7 int), (r12v8 int) binds: [B:59:0x016d, B:69:0x019c, B:76:0x01bb, B:77:0x01bd, B:54:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r13v10 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel) = 
      (r13v12 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
      (r13v12 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
      (r13v12 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
      (r13v12 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
      (r13v13 com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel)
     binds: [B:59:0x016d, B:69:0x019c, B:76:0x01bb, B:77:0x01bd, B:54:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r14v6 boolean) = (r14v8 boolean), (r14v8 boolean), (r14v8 boolean), (r14v8 boolean), (r14v9 boolean) binds: [B:59:0x016d, B:69:0x019c, B:76:0x01bb, B:77:0x01bd, B:54:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0LZB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.app.Activity r19, java.lang.String r20, com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel r21, boolean r22, X.InterfaceC1364105Vn r23) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545370LaB.LJ(android.app.Activity, java.lang.String, com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021f  */
    @Override // X.C0LZB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.app.Activity r22, java.lang.String r23, java.util.List r24, java.lang.String r25, java.lang.String r26, X.InterfaceC1364105Vn r27) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545370LaB.LIZ(android.app.Activity, java.lang.String, java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.C0LZB
    public final Object LIZIZ(final String str, String str2, final AIGCOfflineModel aIGCOfflineModel, CreativeModel creativeModel, boolean z, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        InterfaceC545580LaW interfaceC545580LaWLIZIZ;
        ArrayList arrayListLJ;
        String str3;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C0VSJ c0vsj = new C0VSJ(str2);
        if (!c0vsj.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Result file ");
            sbLIZ.append(str2);
            sbLIZ.append(" not found");
            C1AF0.LJ(new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ)));
        }
        try {
            String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(new CreativeInfo(str, 0, null, 4, null), EnumC20228214Cy.PHOTO, c0vsj.getName(), false).getAbsolutePath();
            C2354709Kn.LIZLLL(str2, absolutePath);
            LIZ.getClass();
            interfaceC545580LaWLIZIZ = LJIIJ().LIZIZ();
            arrayListLJ = C1697810uHb.LJ(absolutePath);
            if (aIGCOfflineModel == null || (str3 = aIGCOfflineModel.shootWay) == null) {
                str3 = "";
            }
        } catch (IllegalArgumentException e) {
            e = e;
        }
        try {
            interfaceC545580LaWLIZIZ.LIZ(new IAVDraftService.SaveDraftByPathParam(arrayListLJ, str, str3, new ISaveVideoToDraftListener() { // from class: X.0LaA
                @Override // com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener
                public final void onSuccess() {
                    String str4 = C0LC1.LIZIZ.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("save draft success for draft ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", aigcOfflineModel: ");
                    sbLIZ2.append(aIGCOfflineModel);
                    C0LC0.LIZ(str4, C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn2.resumeWith(bool);
                }

                @Override // com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener
                public final void onFailed(Exception exc) {
                    String str4 = C0LC1.LIZIZ.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("save draft failed for draft ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", aigcOfflineModel: ");
                    sbLIZ2.append(aIGCOfflineModel);
                    C0LC0.LIZ(str4, C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn2.resumeWith(bool);
                }
            }, aIGCOfflineModel, creativeModel, false, null, null, null, z, 960, null));
        } catch (IllegalArgumentException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            C189200o6.m2constructorimpl(false);
            c23260099m.resumeWith(false);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Illegal argument exception during saving draft ");
            sbLIZ2.append(str);
            sbLIZ2.append(": ");
            sbLIZ2.append(e.getMessage());
            C1AF0.LJ(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2)));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C0LSZ r42, android.app.Activity r43, int r44, com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel r45, boolean r46, java.lang.String r47, java.lang.String r48, X.InterfaceC1364105Vn<? super kotlin.Unit> r49) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545370LaB.LJFF(X.0LSZ, android.app.Activity, int, com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel, boolean, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0377 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C552940LmO r42, android.app.Activity r43, int r44, com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel r45, boolean r46, java.lang.String r47, java.lang.String r48, X.InterfaceC1364105Vn<? super kotlin.Unit> r49) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545370LaB.LJII(X.0LmO, android.app.Activity, int, com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel, boolean, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
