package X;

import android.os.Bundle;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.ss.android.ugc.aweme.livewallpaper.IAmeLiveWallpaperDelegate;
import com.ss.android.ugc.aweme.livewallpaper.IAmeLiveWallpaperEngineDelegate;

/* JADX INFO: renamed from: X.0X4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842930X4x extends WallpaperService.Engine {
    public volatile IAmeLiveWallpaperEngineDelegate LIZ;
    public final /* synthetic */ AmeLiveWallpaper LIZIZ;

    public final IAmeLiveWallpaperEngineDelegate LIZ() {
        IAmeLiveWallpaperEngineDelegate iAmeLiveWallpaperEngineDelegate = this.LIZ;
        if (iAmeLiveWallpaperEngineDelegate != null) {
            return iAmeLiveWallpaperEngineDelegate;
        }
        IAmeLiveWallpaperDelegate iAmeLiveWallpaperDelegateLIZJ = this.LIZIZ.LIZJ();
        if (iAmeLiveWallpaperDelegateLIZJ == null) {
            return null;
        }
        try {
            IAmeLiveWallpaperEngineDelegate iAmeLiveWallpaperEngineDelegateCreateEngineDelegate = iAmeLiveWallpaperDelegateLIZJ.createEngineDelegate(this.LIZIZ);
            this.LIZ = iAmeLiveWallpaperEngineDelegateCreateEngineDelegate;
            return iAmeLiveWallpaperEngineDelegateCreateEngineDelegate;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C842930X4x(AmeLiveWallpaper ameLiveWallpaper) {
        super(ameLiveWallpaper);
        this.LIZIZ = ameLiveWallpaper;
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onSurfaceCreated(SurfaceHolder surfaceHolder) {
        super.onSurfaceCreated(surfaceHolder);
        IAmeLiveWallpaperEngineDelegate iAmeLiveWallpaperEngineDelegateLIZ = LIZ();
        if (iAmeLiveWallpaperEngineDelegateLIZ != null) {
            try {
                iAmeLiveWallpaperEngineDelegateLIZ.LIZ(surfaceHolder);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.onSurfaceDestroyed(surfaceHolder);
        IAmeLiveWallpaperEngineDelegate iAmeLiveWallpaperEngineDelegateLIZ = LIZ();
        if (iAmeLiveWallpaperEngineDelegateLIZ != null) {
            try {
                iAmeLiveWallpaperEngineDelegateLIZ.LIZIZ(surfaceHolder);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LIZIZ.LL.remove(this);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onVisibilityChanged(boolean z) {
        super.onVisibilityChanged(z);
        IAmeLiveWallpaperEngineDelegate iAmeLiveWallpaperEngineDelegateLIZ = LIZ();
        if (iAmeLiveWallpaperEngineDelegateLIZ != null) {
            try {
                iAmeLiveWallpaperEngineDelegateLIZ.onVisibilityChanged(z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onSurfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.onSurfaceChanged(surfaceHolder, i, i2, i3);
        IAmeLiveWallpaperEngineDelegate iAmeLiveWallpaperEngineDelegateLIZ = LIZ();
        if (iAmeLiveWallpaperEngineDelegateLIZ != null) {
            try {
                iAmeLiveWallpaperEngineDelegateLIZ.LIZJ(surfaceHolder, i, i2, i3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final Bundle onCommand(String str, int i, int i2, int i3, Bundle bundle, boolean z) {
        IAmeLiveWallpaperEngineDelegate iAmeLiveWallpaperEngineDelegateLIZ = LIZ();
        if (iAmeLiveWallpaperEngineDelegateLIZ != null) {
            try {
                iAmeLiveWallpaperEngineDelegateLIZ.LJ(str, i, i2);
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }
}
