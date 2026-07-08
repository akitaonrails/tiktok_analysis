package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* JADX INFO: renamed from: X.0Mxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585370Mxb implements InterfaceC21699519w9 {
    public OnUIPlayListener LIZ;
    public Aweme LIZIZ;

    @Override // X.InterfaceC21699519w9
    public final void LIZJ(String str) {
    }

    @Override // X.InterfaceC21699519w9
    public final void setSurface(Surface surface) {
    }

    @Override // X.InterfaceC21699519w9
    public final void LIZIZ(InterfaceC1588310rQz interfaceC1588310rQz) {
        String aid;
        OnUIPlayListener onUIPlayListener = this.LIZ;
        if (onUIPlayListener != null) {
            Aweme aweme = this.LIZIZ;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            onUIPlayListener.onPausePlay(aid, null);
        }
    }

    @Override // X.InterfaceC21699519w9
    public final void LJJIJ(OnUIPlayListener onUIPlayListener) {
        this.LIZ = onUIPlayListener;
    }

    @Override // X.InterfaceC21699519w9
    public final void LIZ(Aweme aweme, C584190Mvh c584190Mvh) {
        if (aweme.getAid() != null) {
            OnUIPlayListener onUIPlayListener = this.LIZ;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRenderFirstFrame(aweme.getAid(), null);
            }
            this.LIZIZ = aweme;
            OnUIPlayListener onUIPlayListener2 = this.LIZ;
            if (onUIPlayListener2 != null) {
                onUIPlayListener2.onBufferedPercent(aweme.getAid(), 100L, 100);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    @Override // X.InterfaceC21699519w9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r4, X.C584190Mvh r5, X.InterfaceC1588310rQz r6) {
        /*
            r3 = this;
            java.lang.String r0 = r4.getAid()
            if (r0 == 0) goto L3a
            if (r6 != 0) goto L9
            return
        L9:
            java.lang.String r1 = r4.getAid()
            r2 = 0
            if (r1 == 0) goto L2e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZIZ
            if (r0 == 0) goto L2c
            java.lang.String r0 = r0.getAid()
        L18:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener r1 = r3.LIZ
            if (r1 == 0) goto L29
            java.lang.String r0 = r4.getAid()
            r1.onResumePlay(r0, r2)
        L29:
            r3.LIZIZ = r4
            return
        L2c:
            r0 = r2
            goto L18
        L2e:
            com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener r1 = r3.LIZ
            if (r1 == 0) goto L29
            java.lang.String r0 = r4.getAid()
            r1.onRenderFirstFrame(r0, r2)
            goto L29
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C585370Mxb.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, X.0Mvh, X.0rQz):void");
    }
}
