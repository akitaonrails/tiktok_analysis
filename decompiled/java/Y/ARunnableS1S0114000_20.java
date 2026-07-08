package Y;

import X.C1C7U;
import com.lynx.tasm.image.AutoSizeImage;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS1S0114000_20 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public Object l0;
    public boolean z1;

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

    public static final void run$0(ARunnableS1S0114000_20 aRunnableS1S0114000_20) {
        boolean zLIZ;
        C1C7U.LIZ("AutoSizeImage@9bc7.justSizeIfNeeded$1");
        try {
            ((AutoSizeImage) aRunnableS1S0114000_20.l0).LJJIII(aRunnableS1S0114000_20.i2, aRunnableS1S0114000_20.i3, aRunnableS1S0114000_20.i4, aRunnableS1S0114000_20.i5, aRunnableS1S0114000_20.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoSizeImage@9bc7.justSizeIfNeeded$1");
    }

    public static final void run$1(ARunnableS1S0114000_20 aRunnableS1S0114000_20) {
        boolean zLIZ;
        C1C7U.LIZ("AutoSizeImage@9bc7.justSizeIfNeeded$2");
        try {
            ((AutoSizeImage) aRunnableS1S0114000_20.l0).LJJIII(aRunnableS1S0114000_20.i2, aRunnableS1S0114000_20.i3, aRunnableS1S0114000_20.i4, aRunnableS1S0114000_20.i5, aRunnableS1S0114000_20.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoSizeImage@9bc7.justSizeIfNeeded$2");
    }

    public ARunnableS1S0114000_20(AutoSizeImage autoSizeImage, boolean z, int i, int i2, int i3, int i4, int i5) {
        this.$t = i5;
        this.l0 = autoSizeImage;
        this.z1 = z;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
        this.i5 = i4;
    }
}
