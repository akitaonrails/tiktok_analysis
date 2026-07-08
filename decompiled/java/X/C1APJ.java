package X;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1APJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1APJ implements SurfaceHolder.Callback {
    public WeakReference<C1A7J> LL;
    public final /* synthetic */ C1APH LLILLJJLI;

    public C1APJ(C1APH c1aph) {
        this.LLILLJJLI = c1aph;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.LLILLJJLI.LJJJJJL();
        C1APH c1aph = this.LLILLJJLI;
        if (c1aph.LL == null) {
            C20441214yg.LJ("LivePlayController", "preCreatePlayerIfNotExits");
            try {
                c1aph.LJJJLZIJ(String.valueOf(c1aph.LLJL), false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepare create player error");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LLILLJJLI.LJJZZIII(true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("surfaceCreated -> inner stream:");
        sbLIZ2.append(false);
        sbLIZ2.append(",surface:");
        sbLIZ2.append(surfaceHolder.getSurface());
        sbLIZ2.append(",player:");
        sbLIZ2.append(this.LLILLJJLI.LL);
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C827750WdZ.LIZ("LivePlayController", "surfaceDestroyed called");
        InterfaceC463820IGu interfaceC463820IGu = this.LLILLJJLI.LLILZLL;
        if (interfaceC463820IGu != null && !(interfaceC463820IGu instanceof SurfaceView)) {
            return;
        }
        if (C1APH.LJJLIIIIJ() && this.LL.get() != null) {
            this.LLILLJJLI.LJJLIIIJLJLI(this.LL.get(), this.LLILLJJLI.LL);
            return;
        }
        C1APH c1aph = this.LLILLJJLI;
        if (!c1aph.LLLLIILL) {
            if (c1aph.LL != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("background surfaceDestroyed -> inner stream:");
                sbLIZ.append(false);
                sbLIZ.append(",surface:");
                sbLIZ.append(surfaceHolder.getSurface());
                C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
                this.LLILLJJLI.LJJLIIJ(true);
                return;
            }
            return;
        }
        if ((c1aph.LLILZLL instanceof C1A7J) && surfaceHolder.getSurface() != ((C1A7J) this.LLILLJJLI.LLILZLL).getSurface()) {
            return;
        }
        if (this.LLILLJJLI.LLLLIIL) {
            this.LL.get();
        }
        if (this.LLILLJJLI.LL != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("surfaceDestroyed -> inner stream:");
            sbLIZ2.append(false);
            sbLIZ2.append(",surface:");
            sbLIZ2.append(surfaceHolder.getSurface());
            C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILLJJLI.LJJLIIJ(false);
        }
        if (this.LL.get() != null) {
            this.LL.get().setSurfaceCallBack(null);
        }
        this.LLILLJJLI.LJJZZIII(false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceChanged -> inner stream:");
        sbLIZ.append(false);
        sbLIZ.append(",player:");
        sbLIZ.append(this.LLILLJJLI.LL);
        C827750WdZ.LIZ("LivePlayController", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.getClass();
        if (C1APH.LJJLIIIIJ() && this.LL.get() != null) {
            C1A7J c1a7j = this.LL.get();
            this.LLILLJJLI.LL.LJII(c1a7j.getSurfaceControl(), c1a7j.getWidth(), c1a7j.getHeight());
        }
    }
}
