package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ttf.network.task.IInitTTNetHook;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0p2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496450p2p implements IInitTTNetHook {
    public static final C1496450p2p LIZIZ = new C1496450p2p();
    public final /* synthetic */ IInitTTNetHook LIZ;

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LIZ(C1495130p0h c1495130p0h) {
        this.LIZ.LIZ(c1495130p0h);
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final Executor LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LIZLLL(C1495130p0h c1495130p0h) {
        this.LIZ.LIZLLL(c1495130p0h);
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJ(C1495130p0h c1495130p0h, Throwable th) {
        this.LIZ.LJ(c1495130p0h, th);
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final int LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJI(C1495130p0h c1495130p0h) {
        this.LIZ.LJI(c1495130p0h);
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJII(C1495130p0h c1495130p0h) {
        this.LIZ.LJII(c1495130p0h);
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJIIIIZZ(C1495130p0h c1495130p0h) {
        this.LIZ.LJIIIIZZ(c1495130p0h);
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJIIJ(EnumC1496430p2n enumC1496430p2n, boolean z) {
        this.LIZ.LJIIJ(enumC1496430p2n, z);
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJIIJJI(Context context) {
        this.LIZ.LJIIJJI(context);
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJIIL(C1495130p0h c1495130p0h) {
        this.LIZ.LJIIL(c1495130p0h);
    }

    @Override // com.tiktok.ttf.network.task.IInitTTNetHook
    public final void LJIILIIL(Context context) {
        this.LIZ.LJIILIIL(context);
    }

    public C1496450p2p() {
        IInitTTNetHook iInitTTNetHook = (IInitTTNetHook) PluggableExtentionKt.pluggableSpi$default(IInitTTNetHook.class, false, false, false, 14, null);
        if (iInitTTNetHook != null) {
            this.LIZ = iInitTTNetHook;
        } else {
            "no impl for IInitTTNetHook".toString();
            throw new IllegalStateException("no impl for IInitTTNetHook");
        }
    }
}
