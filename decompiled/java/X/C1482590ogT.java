package X;

import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.simkit.impl.player.SurfaceViewHolder;
import com.ss.android.ugc.aweme.simkit.impl.player.TextureViewHolder;
import com.ss.android.ugc.playerkit.videoview.SurfaceViewWrapper;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0ogT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482590ogT {
    public static final boolean LIZIZ = ((Boolean) C1474810oTv.G3.getValue()).booleanValue();
    public final WeakHashMap<InterfaceC1482610ogV, String> LIZ = new WeakHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF() {
        for (InterfaceC1482610ogV interfaceC1482610ogV : this.LIZ.keySet()) {
            InterfaceC1483990oij relatedSurfaceHolder = interfaceC1482610ogV.getRelatedSurfaceHolder();
            if (relatedSurfaceHolder != null) {
                if (relatedSurfaceHolder.getView() != null) {
                    relatedSurfaceHolder.getView().setTag(null);
                }
                relatedSurfaceHolder.release();
            }
            if (interfaceC1482610ogV instanceof View) {
                C1473800oSI.LIZ((View) interfaceC1482610ogV);
            }
        }
        this.LIZ.clear();
    }

    public final InterfaceC1483990oij LIZ(ViewGroup viewGroup) {
        InterfaceC1483990oij interfaceC1483990oijLIZJ = LIZJ(viewGroup, Boolean.FALSE, false);
        C786410Ut5.j4("create: holder:%s, total:%s", new Object[]{interfaceC1483990oijLIZJ, Integer.valueOf(this.LIZ.size())});
        return interfaceC1483990oijLIZJ;
    }

    public final InterfaceC1483990oij LIZLLL(View view) {
        for (InterfaceC1482610ogV interfaceC1482610ogV : this.LIZ.keySet()) {
            if (interfaceC1482610ogV == view) {
                return interfaceC1482610ogV.getRelatedSurfaceHolder();
            }
        }
        return null;
    }

    public final void LJ(InterfaceC1483990oij interfaceC1483990oij) {
        boolean z;
        Iterator<InterfaceC1482610ogV> it2 = this.LIZ.keySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1483990oij relatedSurfaceHolder = it2.next().getRelatedSurfaceHolder();
            if (relatedSurfaceHolder == interfaceC1483990oij) {
                z = true;
            } else {
                z = false;
            }
            relatedSurfaceHolder.LJIIIIZZ(z);
        }
    }

    public final InterfaceC1483990oij LIZIZ(ViewGroup viewGroup, Boolean bool, boolean z) {
        InterfaceC1483990oij interfaceC1483990oijLIZJ = LIZJ(viewGroup, bool, z);
        C786410Ut5.j4("create: holder:%s, total:%s", new Object[]{interfaceC1483990oijLIZJ, Integer.valueOf(this.LIZ.size())});
        return interfaceC1483990oijLIZJ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final InterfaceC1483990oij LIZJ(ViewGroup viewGroup, Boolean bool, boolean z) {
        InterfaceC1483990oij interfaceC1483990oij;
        Object obj;
        if (!(!C582130MsN.LIZ().getConfig().getPlayerGlobalConfig().isUseSurfaceView()) && !bool.booleanValue() && (Build.VERSION.SDK_INT >= 24 || z)) {
            if (C582130MsN.LIZ().getConfig().getPlayerGlobalConfig().isUseOptimizedSurfaceView()) {
                SurfaceViewWrapper surfaceViewWrapper = new SurfaceViewWrapper(0, 0, viewGroup);
                SurfaceView surfaceView = surfaceViewWrapper.LL;
                surfaceView.setId(R.id.vbi);
                surfaceViewWrapper.LL.setTag("VIDEO_VIEW_TAG");
                obj = surfaceView;
                interfaceC1483990oij = surfaceViewWrapper;
            } else {
                C1474220oSy c1474220oSy = new C1474220oSy(C1475000oUE.LIZ);
                c1474220oSy.setId(R.id.vbi);
                c1474220oSy.setTag("VIDEO_VIEW_TAG");
                SurfaceViewHolder surfaceViewHolder = new SurfaceViewHolder(c1474220oSy);
                obj = c1474220oSy;
                interfaceC1483990oij = surfaceViewHolder;
            }
        } else {
            C1482600ogU c1482600ogU = new C1482600ogU(C1475000oUE.LIZ);
            c1482600ogU.setId(R.id.vbi);
            c1482600ogU.setTag("VIDEO_VIEW_TAG");
            TextureViewHolder textureViewHolder = new TextureViewHolder(c1482600ogU, LIZIZ);
            obj = c1482600ogU;
            interfaceC1483990oij = textureViewHolder;
        }
        this.LIZ.put((InterfaceC1482610ogV) obj, "SurfaceHolderFactory");
        return interfaceC1483990oij;
    }
}
