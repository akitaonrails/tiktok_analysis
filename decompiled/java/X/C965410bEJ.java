package X;

import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965410bEJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C965980bFE LL;
    public final /* synthetic */ LinkLayerMessage LLILLJJLI;
    public final /* synthetic */ InterfaceC965990bFF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965410bEJ(InterfaceC965990bFF interfaceC965990bFF, C965980bFE c965980bFE, LinkLayerMessage linkLayerMessage) {
        super(0);
        this.LL = c965980bFE;
        this.LLILLJJLI = linkLayerMessage;
        this.LLILLL = interfaceC965990bFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r15 = this;
            X.0bFE r4 = r15.LL
            X.0bFI r0 = r4.LL
            X.0bI7 r3 = r0.LJJIFFI
            com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r0 = r15.LLILLJJLI
            com.bytedance.android.livesdk.model.message.linkcore.FinishChannelContent r0 = r0.finishContent
            r11 = 0
            if (r0 == 0) goto L6d
            com.bytedance.android.livesdk.model.message.linkcore.Player r2 = r0.owner
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r0.owner
            if (r0 == 0) goto L6e
            long r0 = r0.uid
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto L6e
            long r0 = r0.longValue()
        L1f:
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = r3.LJJIJL(r0)
            if (r0 == 0) goto L6b
            java.lang.String r0 = r0.linkMicId
        L27:
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r6 = r4.LJ(r2, r0)
            int r8 = r3.LJJIL()
            java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r0 = r3.LJIJI
            int r7 = r0.size()
            X.0bFF r4 = r15.LLILLL
            X.0bFE r0 = r15.LL
            X.0bFI r3 = r0.LL
            com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage r2 = new com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage
            com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r5 = r15.LLILLJJLI
            com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper r9 = new com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper
            r10 = 0
            com.bytedance.android.livesdk.model.message.linkcore.FinishChannelContent r0 = r5.finishContent
            if (r0 == 0) goto L4c
            long r0 = r0.finishReason
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
        L4c:
            com.bytedance.android.livesdk.model.message.LinkMessage r14 = new com.bytedance.android.livesdk.model.message.LinkMessage
            r14.<init>()
            r12 = 0
            r9.<init>(r10, r11, r12, r14)
            com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage r0 = X.C954920axO.LJ(r5, r9)
            r2.<init>(r6, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4.LLIIJLIL(r3, r2, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6b:
            r0 = r11
            goto L27
        L6d:
            r2 = r11
        L6e:
            r0 = -1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965410bEJ.invoke():java.lang.Object");
    }
}
