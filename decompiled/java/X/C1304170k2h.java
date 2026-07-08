package X;

import android.view.Surface;
import com.lynx.canvas.player.PlayerContext;

/* JADX INFO: renamed from: X.0k2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304170k2h implements InterfaceC1304250k2p {
    public Surface LL;
    public InterfaceC1304230k2n LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public String LLIZ;

    @Override // X.InterfaceC1304250k2p
    public final void LIZ(double d) {
    }

    @Override // X.InterfaceC1304250k2p
    public final double LIZLLL() {
        return 0.0d;
    }

    @Override // X.InterfaceC1304250k2p
    public final /* synthetic */ void LJFF(double d) {
    }

    @Override // X.InterfaceC1304250k2p
    public final /* synthetic */ double LJIIJ() {
        return 1.0d;
    }

    @Override // X.InterfaceC1304250k2p
    public final boolean LJIILJJIL() {
        return false;
    }

    @Override // X.InterfaceC1304250k2p
    public final void LJIIZILJ(double d) {
    }

    @Override // X.InterfaceC1304250k2p
    public final int getDuration() {
        return 0;
    }

    @Override // X.InterfaceC1304250k2p
    public final void getRotation() {
    }

    @Override // X.InterfaceC1304250k2p
    public final void pause() {
        this.LLILLL = false;
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZ(6, null);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void play() {
        this.LLILLL = true;
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZ(5, null);
        }
        InterfaceC1304230k2n interfaceC1304230k2n2 = this.LLILLJJLI;
        if (interfaceC1304230k2n2 != null) {
            ((PlayerContext) interfaceC1304230k2n2).LIZ(3, null);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void release() {
        this.LLILLL = false;
        this.LLILZLL = false;
        C1304180k2i.LIZ.LIZ(this, this.LLIZ);
        this.LLIZ = null;
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1304250k2p
    public final void setLooping(boolean z) {
    }

    @Override // X.InterfaceC1304250k2p
    public final void prepare() {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            PlayerContext playerContext = (PlayerContext) interfaceC1304230k2n;
            playerContext.LJ = true;
            playerContext.LIZ(0, null);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final int getVideoHeight() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1304250k2p
    public final int getVideoWidth() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1304250k2p
    public final boolean isPlaying() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1304250k2p
    public final void LJIILLIIL(InterfaceC1304230k2n interfaceC1304230k2n) {
        this.LLILLJJLI = interfaceC1304230k2n;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[Catch: all -> 0x00a1, TRY_ENTER, TryCatch #0 {, blocks: (B:30:0x0062, B:32:0x0068, B:34:0x006e, B:35:0x0071, B:39:0x0079, B:41:0x0083, B:42:0x008b), top: B:50:0x0062 }] */
    @Override // X.InterfaceC1304250k2p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setDataSource(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 0
            r5.LLILZ = r4
            r5.LLILZIL = r4
            r5.LLILZLL = r4
            r3 = 1
            if (r6 == 0) goto L51
            boolean r0 = kotlin.text.a0.LJJJIL(r6)
            if (r0 != 0) goto L51
            r0 = 0
            if (r0 != 0) goto L51
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = r2.getScheme()     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "algo"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L51
            java.lang.String r1 = r2.getHost()     // Catch: java.lang.Exception -> L4d
            if (r1 == 0) goto L32
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Exception -> L4d
            r0 = r0 ^ 1
            if (r0 == 0) goto L32
            goto L53
        L32:
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Exception -> L4d
            if (r2 == 0) goto L51
            char[] r1 = new char[r3]     // Catch: java.lang.Exception -> L4d
            r0 = 47
            r1[r4] = r0     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = kotlin.text.a0.LJLIL(r2, r1)     // Catch: java.lang.Exception -> L4d
            if (r1 == 0) goto L51
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Exception -> L4d
            r0 = r0 ^ 1
            if (r0 == 0) goto L51
            goto L53
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L51:
            java.lang.String r1 = "portrait"
        L53:
            java.lang.String r0 = r5.LLIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto La4
            X.0k2i r3 = X.C1304180k2i.LIZ
            java.lang.String r2 = r5.LLIZ
            monitor-enter(r3)
            if (r2 == 0) goto L71
            boolean r0 = kotlin.text.a0.LJJJIL(r2)     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L71
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L71
            r3.LIZ(r5, r2)     // Catch: java.lang.Throwable -> La1
        L71:
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L79
            monitor-exit(r3)
            goto L9e
        L79:
            java.util.Map<java.lang.String, java.util.LinkedHashSet<X.0k2h>> r2 = X.C1304180k2i.LIZIZ     // Catch: java.lang.Throwable -> La1
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r2.get(r1)     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L8b
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> La1
            r0.<init>()     // Catch: java.lang.Throwable -> La1
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> La1
        L8b:
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0     // Catch: java.lang.Throwable -> La1
            r0.add(r5)     // Catch: java.lang.Throwable -> La1
            java.util.Map<java.lang.String, java.lang.Integer> r2 = X.C1304180k2i.LIZJ     // Catch: java.lang.Throwable -> La1
            int r0 = r0.size()     // Catch: java.lang.Throwable -> La1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> La1
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r3)
        L9e:
            r5.LLIZ = r1
            return
        La1:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1304170k2h.setDataSource(java.lang.String):void");
    }

    @Override // X.InterfaceC1304250k2p
    public final void setSurface(Surface surface) {
        this.LL = surface;
    }
}
