package X;

import android.view.View;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter;

/* JADX INFO: renamed from: X.0HB3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HB3<T> implements InterfaceC346701Wf {
    public final /* synthetic */ View LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ LiveAdminSettingGuideAdapter LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ C16F5 LLILZIL;

    public C0HB3(View view, InterfaceC497601wk interfaceC497601wk, LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter, View view2, C16F5 c16f5) {
        this.LL = view;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = liveAdminSettingGuideAdapter;
        this.LLILZ = view2;
        this.LLILZIL = c16f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(boolean r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0HB2
            if (r0 == 0) goto L84
            r6 = r9
            X.0HB2 r6 = (X.C0HB2) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L4c
            if (r0 != r4) goto L8a
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0UX6 r3 = X.C0UX6.LIVE_BROADCAST_AI_REPLY_SETTING
            com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter r0 = r7.LLILLL
            androidx.lifecycle.LifecycleOwner r2 = r0.LLILZ
            android.view.View r1 = r7.LLILZ
            r0 = 0
            com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LJI(r1, r2, r0, r3, r0)
            android.view.View r1 = r7.LL
            if (r1 == 0) goto L3a
            r0 = 0
            kotlin.jvm.internal.AFwS289S0000000_6 r0 = kotlin.jvm.internal.AFwS289S0000000_6.get$arr$(r0)
            X.C444140HbI.LIZ(r1, r0)
        L3a:
            android.view.View r3 = r7.LL
            if (r3 == 0) goto L49
            Y.ACListenerS147S0100000_12 r2 = new Y.ACListenerS147S0100000_12
            com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter r1 = r7.LLILLL
            r0 = 0
            r2.<init>(r1, r0)
            X.C786410Ut5.I7(r2, r3)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4c:
            X.C155000ia.LIZIZ(r1)
            if (r8 == 0) goto L7c
            android.view.View r0 = r7.LL
            if (r0 == 0) goto L58
            X.C500260Jjc.LLFFF(r0)
        L58:
            X.01wk r3 = r7.LLILLJJLI
            X.0HB1 r2 = new X.0HB1
            X.16F5 r0 = r7.LLILZIL
            r1 = 0
            r2.<init>(r0, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            X.0He5 r0 = com.bytedance.android.live.aireply.IAIReplyAnchorManagerService.Companion
            r0.getClass()
            com.bytedance.android.live.aireply.IAIReplyAnchorManagerService r1 = X.C445870He5.LIZ()
            com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter r0 = r7.LLILLL
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.LLILLJJLI
            r6.LLILLL = r4
            java.lang.Object r0 = r1.getAiCommentReplySwitch(r0, r6)
            if (r0 != r5) goto L22
            return r5
        L7c:
            android.view.View r0 = r7.LL
            if (r0 == 0) goto L49
            X.C500260Jjc.LJIILIIL(r0)
            goto L49
        L84:
            X.0HB2 r6 = new X.0HB2
            r6.<init>(r7, r9)
            goto L12
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HB3.LIZ(boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC346701Wf
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return LIZ(((Boolean) obj).booleanValue(), interfaceC1364105Vn);
    }
}
