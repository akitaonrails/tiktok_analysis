package Y;

import X.C1551800qU6;
import X.C1551960qUM;
import X.C1551990qUP;
import X.C1552070qUX;
import X.C1552230qUn;
import X.C1553130qWF;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1473950oSX;
import X.InterfaceC1474000oSc;
import X.TextureViewSurfaceTextureListenerC1482630ogX;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS8S0202000_23 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((TextureViewSurfaceTextureListenerC1482630ogX) this.l1).LLILLL.LLILZLL == null) {
            ((TextureViewSurfaceTextureListenerC1482630ogX) this.l1).LLILLL.LLILZLL = new Surface((SurfaceTexture) this.l0);
        }
        TextureViewSurfaceTextureListenerC1482630ogX textureViewSurfaceTextureListenerC1482630ogX = (TextureViewSurfaceTextureListenerC1482630ogX) this.l1;
        if (textureViewSurfaceTextureListenerC1482630ogX.LL) {
            textureViewSurfaceTextureListenerC1482630ogX.LLILLL.LLILLL = (SurfaceTexture) this.l0;
        }
        InterfaceC1474000oSc interfaceC1474000oSc = ((TextureViewSurfaceTextureListenerC1482630ogX) this.l1).LLILLL.LLIZ;
        if (interfaceC1474000oSc != null) {
            interfaceC1474000oSc.LJ();
        }
        Iterator<InterfaceC1473950oSX> it2 = ((TextureViewSurfaceTextureListenerC1482630ogX) this.l1).LLILLL.LLIZLLLIL.keySet().iterator();
        while (it2.hasNext()) {
            it2.next().LLILLIZIL(this.i2, this.i3);
        }
    }

    public final void LIZ$1() {
        try {
            if (((List) this.l0).isEmpty()) {
                return;
            }
            C1553130qWF.LIZ("gecko-debug-tag", "sync queue filter unregistered gecko", ((C1551990qUP) this.l1).LIZJ);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(this.i2);
            optionCheckUpdateParams.setCheckUpdateData(new C1551800qU6());
            C1552230qUn c1552230qUnLJIIJ = C1551960qUM.LJIIJ(((C1551990qUP) this.l1).LIZIZ, (List) this.l0, optionCheckUpdateParams, new C1552070qUX());
            c1552230qUnLJIIJ.setPipelineData("req_type", Integer.valueOf(this.i3));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sync queue execute check update,req type:");
            sbLIZ.append(this.i3);
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ), (List) this.l0);
            c1552230qUnLJIIJ.proceed(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1553130qWF.LIZ("gecko-debug-tag", "sync queue check update failed", e);
        }
    }

    public static final void run$0(ARunnableS8S0202000_23 aRunnableS8S0202000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TextureViewHolder@dd04.<init>$2$onSurfaceTextureAvailable$1");
        try {
            aRunnableS8S0202000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextureViewHolder@dd04.<init>$2$onSurfaceTextureAvailable$1");
    }

    public static final void run$1(ARunnableS8S0202000_23 aRunnableS8S0202000_23) {
        boolean zLIZ;
        C1C7U.LIZ("SyncQueueRequestManager@a8a6.executeQueueUpdate$1");
        try {
            aRunnableS8S0202000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SyncQueueRequestManager@a8a6.executeQueueUpdate$1");
    }

    public ARunnableS8S0202000_23(Object obj, Object obj2, int i, int i2, int i3) {
        this.$t = i3;
        this.l1 = obj;
        this.l0 = obj2;
        this.i2 = i;
        this.i3 = i2;
    }
}
