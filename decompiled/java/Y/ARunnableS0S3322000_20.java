package Y;

import X.C1267500j5Y;
import X.C1272090jCx;
import X.C1272260jDE;
import X.C1C7U;
import X.InterfaceC1272120jD0;
import X.InterfaceC1272600jDm;
import android.content.res.AssetManager;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S3322000_20 implements Runnable {
    public final int $t;
    public int i8;
    public int i9;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public boolean z6 = false;
    public boolean z7;

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
        if (((C1272090jCx) this.l5).isValid()) {
            Object obj = this.l3;
            if (obj != null) {
                ((C1272090jCx) this.l5).LLJJIJIIJIL.setResourceFinder(obj);
            }
            AssetManager assetManager = (AssetManager) this.l4;
            if (assetManager != null) {
                ((C1272090jCx) this.l5).LLJJIJIIJIL.setAssetManager(assetManager);
            }
            C1272090jCx c1272090jCx = (C1272090jCx) this.l5;
            InterfaceC1272120jD0 interfaceC1272120jD0 = c1272090jCx.LLJJIJIIJIL;
            int i = this.i8;
            int i2 = this.i9;
            String str = this.s0;
            String str2 = this.s1;
            boolean z = this.z6;
            boolean z2 = this.z7;
            String str3 = this.s2;
            C1267500j5Y c1267500j5Y = c1272090jCx.LLLLZLLLI;
            interfaceC1272120jD0.configEffect(i, i2, str, str2, z, z2, str3, c1267500j5Y != null && c1267500j5Y.LIZIZ.LJFF);
            C1272090jCx c1272090jCx2 = (C1272090jCx) this.l5;
            c1272090jCx2.setClientState(c1272090jCx2.LLZZZIL);
            InterfaceC1272600jDm interfaceC1272600jDm = ((C1272090jCx) this.l5).LLJZ;
            if (interfaceC1272600jDm != null) {
                interfaceC1272600jDm.onMessageReceived(2139095041, 0, 0, null);
            }
        }
    }

    public static final void run$0(ARunnableS0S3322000_20 aRunnableS0S3322000_20) {
        C1272260jDE c1272260jDE = (C1272260jDE) aRunnableS0S3322000_20.l3;
        Object obj = aRunnableS0S3322000_20.l4;
        AssetManager assetManager = (AssetManager) aRunnableS0S3322000_20.l5;
        int i = aRunnableS0S3322000_20.i8;
        int i2 = aRunnableS0S3322000_20.i9;
        String str = aRunnableS0S3322000_20.s0;
        String str2 = aRunnableS0S3322000_20.s1;
        boolean z = aRunnableS0S3322000_20.z6;
        boolean z2 = aRunnableS0S3322000_20.z7;
        String str3 = aRunnableS0S3322000_20.s2;
        C1C7U.LIZ("EffectManager@a3e3.configEffect$1L");
        if (c1272260jDE.isValid()) {
            EffectWrapper effectWrapper = c1272260jDE.LLIZLLLIL;
            if (effectWrapper != null) {
                effectWrapper.setResourceFinder(obj);
                effectWrapper.setAssetManager(assetManager);
                effectWrapper.configEffect(i, i2, str, str2, z, z2, str3, c1272260jDE.LLILLL.LIZIZ.LJFF);
            }
            c1272260jDE.setClientState(c1272260jDE.LLJILLL);
            InterfaceC1272600jDm interfaceC1272600jDm = c1272260jDE.LLJIJIL;
            if (interfaceC1272600jDm != null) {
                interfaceC1272600jDm.onMessageReceived(2139095041, 0, 0, null);
            }
        }
        C1C7U.LIZIZ("EffectManager@a3e3.configEffect$1L");
    }

    public static final void run$1(ARunnableS0S3322000_20 aRunnableS0S3322000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FilterManager@d45d.configEffect$1");
        try {
            aRunnableS0S3322000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.configEffect$1");
    }

    public ARunnableS0S3322000_20(C1272090jCx c1272090jCx, Object obj, AssetManager assetManager, int i, int i2, String str, String str2, boolean z, String str3, int i3) {
        this.$t = i3;
        this.l5 = c1272090jCx;
        this.l3 = obj;
        this.l4 = assetManager;
        this.i8 = i;
        this.i9 = i2;
        this.s0 = str;
        this.s1 = str2;
        this.z7 = z;
        this.s2 = str3;
    }

    public ARunnableS0S3322000_20(C1272260jDE c1272260jDE, Object obj, AssetManager assetManager, int i, int i2, String str, String str2, boolean z, String str3, int i3) {
        this.$t = i3;
        this.l3 = c1272260jDE;
        this.l4 = obj;
        this.l5 = assetManager;
        this.i8 = i;
        this.i9 = i2;
        this.s0 = str;
        this.s1 = str2;
        this.z7 = z;
        this.s2 = str3;
    }
}
