package X;

import com.bytedance.android.livesdk.chatroom.api.VerificationWarningInfo;

/* JADX INFO: renamed from: X.0fIW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121780fIW {
    public VerificationWarningInfo LIZ;

    public final String LIZ() {
        Integer numValueOf;
        VerificationWarningInfo verificationWarningInfo = this.LIZ;
        return (verificationWarningInfo == null || (numValueOf = Integer.valueOf(verificationWarningInfo.warningType)) == null) ? "normal" : numValueOf.intValue() == 1 ? "in_warning" : numValueOf.intValue() == 2 ? "revoked" : "normal";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[PHI: r4
      0x00b5: PHI (r4v3 java.lang.Integer) = (r4v2 java.lang.Integer), (r4v2 java.lang.Integer), (r4v4 java.lang.Integer), (r4v4 java.lang.Integer) binds: [B:27:0x00a1, B:29:0x00ad, B:17:0x0064, B:19:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel r8, com.bytedance.android.livesdk.chatroom.api.VerificationWarningInfo r9, kotlin.jvm.internal.AwS661S0100000_12 r10) {
        /*
            r7 = this;
            r7.LIZ = r9
            if (r8 == 0) goto Lbd
            java.lang.Class<X.0Tp0> r0 = X.C758400Tp0.class
            java.lang.Object r1 = r8.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r6 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L10:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "info="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " hasWarning="
            r1.append(r0)
            r3 = 0
            if (r9 == 0) goto Lba
            boolean r0 = r9.hasWarning
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2a:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r5 = "ServicePlusVerificationWarningInfoDelegate"
            X.C20441214yg.LIZIZ(r5, r0)
            if (r9 == 0) goto Lb7
            boolean r0 = r9.hasWarning
            if (r0 == 0) goto Lb7
            int r1 = r9.warningType
            r0 = 1
            if (r1 == r0) goto L81
            r0 = 2
            if (r1 != r0) goto Lb7
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "HAS_SHOWN_SERVICE_PLUS_VERIFICATION_WARNING_REVOKED="
            r1.append(r0)
            X.0JT6<java.lang.Boolean> r2 = X.InterfaceC1106030et7.l8
            java.lang.Object r0 = r2.LIZ()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r5, r0)
            r0 = 2130773061(0x7f010445, float:1.7149258E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r6 == 0) goto Lb5
            java.lang.Object r0 = r2.LIZ()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto Lb5
            r2.LIZJ(r1)
            X.0fH2 r1 = X.EnumC1120860fH2.GOLIVE_GUIDE_SERVICE_PLUS_ENTRY_NOT_VISIBLE
        L77:
            com.bytedance.android.livesdk.chatroom.api.VerificationWarningInfo r0 = r7.LIZ
            if (r0 == 0) goto L7d
            java.lang.String r3 = r0.bubbleText
        L7d:
            r10.invoke(r4, r1, r3)
            return
        L81:
            r0 = 2130773062(0x7f010446, float:1.714926E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "HAS_SHOWN_SERVICE_PLUS_VERIFICATION_WARNING_REMINDER="
            r1.append(r0)
            X.0JT6<java.lang.Boolean> r2 = X.InterfaceC1106030et7.k8
            java.lang.Object r0 = r2.LIZ()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r5, r0)
            if (r6 == 0) goto Lb5
            java.lang.Object r0 = r2.LIZ()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto Lb5
            r2.LIZJ(r1)
            X.0fH2 r1 = X.EnumC1120860fH2.GOLIVE_GUIDE_SERVICE_PLUS_VERIFY_CONTINUE
            goto L77
        Lb5:
            r1 = r3
            goto L77
        Lb7:
            r1 = r3
            r4 = r3
            goto L77
        Lba:
            r0 = r3
            goto L2a
        Lbd:
            r6 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1121780fIW.LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdk.chatroom.api.VerificationWarningInfo, kotlin.jvm.internal.AwS661S0100000_12):void");
    }
}
