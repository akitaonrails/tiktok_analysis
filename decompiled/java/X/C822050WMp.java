package X;

import android.content.Context;
import com.bytedance.pumbaa.governance.tool.api.IControlService;
import com.bytedance.pumbaa.governance.tool.model.PnsGovToolConfigItem;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;

/* JADX INFO: renamed from: X.0WMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822050WMp implements C0WM8 {
    public static boolean LIZIZ = true;
    public IControlService LIZ;

    @Override // X.C0WM8
    public final void LJ(Context context, C0WMF c0wmf, BaseGovernanceModel baseGovernanceModel, C0WMD c0wmd) {
    }

    @Override // X.C0WM8
    public final void LJI(C0WMF c0wmf, BaseGovernanceModel baseGovernanceModel) {
        if (!LIZIZ) {
            return;
        }
        if (this.LIZ == null) {
            this.LIZ = C821970WMh.LIZ();
        }
        IControlService iControlService = this.LIZ;
        if (iControlService != null) {
            iControlService.LJ();
            LIZIZ = false;
            return;
        }
        IControlService iControlService2 = this.LIZ;
        if (iControlService2 != null) {
            iControlService2.LIZJ();
        }
        if (c0wmf.LJ) {
            new PnsGovToolConfigItem(c0wmf.LIZ, null, false, false, null, null);
            IControlService iControlService3 = this.LIZ;
            if (iControlService3 != null) {
                iControlService3.LIZIZ();
                return;
            }
            return;
        }
        IControlService iControlService4 = this.LIZ;
        if (iControlService4 == null) {
            return;
        }
        iControlService4.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // X.C0WM8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r6, X.C0WMF r7, com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel r8, X.C0WMD r9, X.C0WM1 r10) {
        /*
            r5 = this;
            boolean r0 = X.C822050WMp.LIZIZ
            if (r0 != 0) goto L5
            return
        L5:
            if (r10 != 0) goto L8
            return
        L8:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "GovernanceToolPlugin -> onActionResult operandId:"
            r1.append(r0)
            java.lang.Object r0 = r9.LIZ()
            r4 = 0
            if (r0 == 0) goto L4a
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L20:
            r1.append(r0)
            java.lang.String r0 = ", actionMeta:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", result:"
            r1.append(r0)
            r1.append(r10)
            X.C2188811AlT.LIZIZ(r1)
            com.bytedance.pumbaa.governance.tool.api.IControlService r0 = r5.LIZ
            if (r0 == 0) goto L9b
            com.bytedance.pumbaa.governance.tool.model.ControlStrategy r0 = r0.LIZ()
            if (r0 == 0) goto L9b
            if (r6 != 0) goto L4c
            com.bytedance.pumbaa.governance.tool.api.IControlService r0 = r5.LIZ
            if (r0 == 0) goto L49
            r0.LJI()
        L49:
            return
        L4a:
            r0 = r4
            goto L20
        L4c:
            boolean r0 = r10.LIZ
            if (r0 == 0) goto L9b
            boolean r2 = r8.hintEnable
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.bytedance.pumbaa.governance.tool.api.IControlService> r0 = com.bytedance.pumbaa.governance.tool.api.IControlService.class
            java.lang.Object r0 = r1.getService(r0)
            com.bytedance.pumbaa.governance.tool.api.IControlService r0 = (com.bytedance.pumbaa.governance.tool.api.IControlService) r0
            r0.LJ()
            if (r2 == 0) goto L9b
            X.0WLv r1 = r10.LIZLLL
            if (r1 == 0) goto L97
            X.0WLo r0 = r1.LJ
            if (r0 == 0) goto L97
            X.0WLw r3 = r0.LIZ
        L6d:
            java.util.Map<?, ?> r1 = r1.LIZIZ
            if (r1 == 0) goto L77
            java.lang.String r0 = "error"
            java.lang.Object r4 = r1.get(r0)
        L77:
            boolean r0 = r4 instanceof X.C821880WLy
            com.bytedance.pumbaa.governance.tool.api.IControlService r2 = r5.LIZ
            if (r2 == 0) goto L9b
            X.0WNP r1 = new X.0WNP
            if (r3 == 0) goto L87
            r3.getCode()
            r3.getDescription()
        L87:
            org.json.JSONObject r0 = r10.LIZJ
            if (r0 != 0) goto L90
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L90:
            r1.<init>()
            r2.LJFF()
            return
        L97:
            r3 = r4
            if (r1 == 0) goto L77
            goto L6d
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C822050WMp.LIZJ(android.content.Context, X.0WMF, com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel, X.0WMD, X.0WM1):void");
    }
}
