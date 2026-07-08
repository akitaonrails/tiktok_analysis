package X;

import Y.AcS186S0300000_12;
import Y.AcS83S0400000_12;
import android.content.Context;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Tpm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758880Tpm implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 205;
    }

    public static void LIZLLL(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_toggle_popup_click");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(DataChannel dataChannel) {
        String strLIZ;
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_toggle_popup_show");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        } else {
            strLIZ = "";
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    @Override // X.InterfaceC759380Tqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C500840JkY r10, boolean r11, X.C759360TqY r12) {
        /*
            r9 = this;
            X.099m r3 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r12)
            r3.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.live.slot.model.ECBcToggleChannel> r0 = com.bytedance.android.live.slot.model.ECBcToggleChannel.class
            java.lang.Object r5 = r1.gg0(r0)
            X.0Tpq r5 = (X.C758920Tpq) r5
            r6 = -1
            if (r5 == 0) goto L87
            X.0Tps r0 = r5.LIZ
            if (r0 == 0) goto L87
            int r8 = r0.LIZJ
        L1c:
            X.0Tps r0 = r5.LIZ
            if (r0 == 0) goto L22
            int r6 = r0.LJ
        L22:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r10.LIZIZ
            if (r1 == 0) goto L85
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveModeChannel.class
            java.lang.Object r7 = r1.gg0(r0)
        L2c:
            r0 = 2
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode[] r4 = new com.bytedance.android.livesdkapi.depend.model.live.LiveMode[r0]
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            r2 = 0
            r4[r2] = r0
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY
            r1 = 1
            r4[r1] = r0
            java.util.List r0 = X.C1697810uHb.LJIIJJI(r4)
            boolean r0 = X.C13LP.LJJJJ(r7, r0)
            if (r0 == 0) goto L63
            boolean r0 = X.C758060ToS.LIZ()
            if (r0 != 0) goto L63
            if (r8 != r1) goto L63
            android.content.Context r0 = r10.LIZ
            r9.LJFF(r0, r3, r5, r10)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r10.LIZIZ
            LJ(r0)
        L55:
            java.lang.Object r1 = r3.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L62
            X.C099Q.LIZJ(r12)
        L62:
            return r1
        L63:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            if (r7 != r0) goto L7a
            boolean r0 = X.C758060ToS.LIZ()
            if (r0 != 0) goto L7a
            if (r6 != r1) goto L7a
            android.content.Context r0 = r10.LIZ
            r9.LJFF(r0, r3, r5, r10)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r10.LIZIZ
            LJ(r0)
            goto L55
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.C189200o6.m2constructorimpl(r0)
            r3.resumeWith(r0)
            goto L55
        L85:
            r7 = 0
            goto L2c
        L87:
            r8 = -1
            if (r5 == 0) goto L22
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758880Tpm.LIZIZ(X.0JkY, boolean, X.0TqY):java.lang.Object");
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }

    public final void LJFF(Context context, C23260099m c23260099m, C758920Tpq c758920Tpq, C500840JkY c500840JkY) {
        C758060ToS.LIZIZ(c500840JkY.LIZIZ, "show");
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJFF(R.drawable.eaz);
        c782110Um9.LJIIZILJ(2131841819);
        c782110Um9.LJII(2131843722);
        c782110Um9.LJIILIIL(2131841820, new AcS186S0300000_12(this, c500840JkY, c23260099m, 3));
        c782110Um9.LJIIJ(2131841826, new AcS83S0400000_12(c23260099m, c758920Tpq, this, c500840JkY, 2));
        c782110Um9.LJIILLIIL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.f145u4;
        Boolean bool = Boolean.TRUE;
        c20337914i1.LJFF(bool);
        InterfaceC772390URp.LLZZLLIL.LJFF(bool);
    }
}
