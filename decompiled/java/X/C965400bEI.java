package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bEI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965400bEI extends C09AY implements Function2<String, C965950bFB, CreateChannelResult> {
    public final /* synthetic */ C966020bFI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965400bEI(C966020bFI c966020bFI) {
        super(2);
        this.LL = c966020bFI;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult invoke(java.lang.String r11, X.C965950bFB r12) {
        /*
            r10 = this;
            X.0bFB r12 = (X.C965950bFB) r12
            X.0bFI r0 = r10.LL
            X.0bED r4 = r0.LJJ
            java.lang.String r3 = r0.LJ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onCreateChannelSucceeded start cur channel id "
            r2.append(r0)
            X.0bFI r0 = r10.LL
            long r0 = r0.LIZLLL
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            r5 = 0
            X.C1AZW.LIZIZ(r4, r3, r0, r5, r5)
            X.0aAp r1 = X.C924810aAp.LJ()
            X.0bFI r0 = r10.LL
            java.lang.String r0 = r0.LJIILJJIL
            r1.LJIILJJIL = r0
            java.lang.Class<com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse> r1 = com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse.class
            byte[] r0 = r12.LIZ
            java.lang.Object r2 = X.C966250bFf.LIZ(r0, r1)
            com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse r2 = (com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse) r2
            if (r2 == 0) goto L53
            X.0bFI r1 = r10.LL
            java.lang.Integer r0 = r2.isResume
            if (r0 == 0) goto L51
            int r0 = r0.intValue()
            r5 = 1
            if (r0 != r5) goto L51
        L43:
            r1.LJIJI = r5
            com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult r3 = new com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse r4 = r2.multiGuestRespExtra
            r6 = 0
            java.lang.String r7 = r1.LJIILJJIL
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L51:
            r5 = 0
            goto L43
        L53:
            com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult r3 = new com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult
            r6 = 0
            r4 = r3
            r7 = r5
            r8 = r5
            r9 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965400bEI.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
