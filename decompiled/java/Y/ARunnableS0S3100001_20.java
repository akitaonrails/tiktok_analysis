package Y;

import X.C1272090jCx;
import X.C1272100jCy;
import X.C1272300jDI;
import X.C1C7U;
import X.InterfaceC1272120jD0;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S3100001_20 implements Runnable {
    public final int $t;
    public float f4;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

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

    public static final void run$0(ARunnableS0S3100001_20 aRunnableS0S3100001_20) {
        boolean zLIZ;
        int iComposerUpdateNode;
        C1C7U.LIZ("FilterManager@d45d.composerUpdateNode$1");
        try {
            if (((C1272090jCx) aRunnableS0S3100001_20.l3).isValid() && (iComposerUpdateNode = ((C1272090jCx) aRunnableS0S3100001_20.l3).LLJJIJIIJIL.composerUpdateNode(aRunnableS0S3100001_20.s0, aRunnableS0S3100001_20.s1, aRunnableS0S3100001_20.f4)) != 0) {
                ((C1272090jCx) aRunnableS0S3100001_20.l3).LLJZIJLIL.onError(iComposerUpdateNode, aRunnableS0S3100001_20.s2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterManager@d45d.composerUpdateNode$1");
    }

    public static final void run$1(ARunnableS0S3100001_20 aRunnableS0S3100001_20) {
        int iComposerUpdateNode;
        C1272100jCy c1272100jCy = (C1272100jCy) aRunnableS0S3100001_20.l3;
        String str = aRunnableS0S3100001_20.s0;
        String str2 = aRunnableS0S3100001_20.s1;
        float f = aRunnableS0S3100001_20.f4;
        String str3 = aRunnableS0S3100001_20.s2;
        C1C7U.LIZ("VideoEffectNode@5e69.composerUpdateNode$1L");
        if (c1272100jCy.LJIILIIL()) {
            InterfaceC1272120jD0 interfaceC1272120jD0 = c1272100jCy.LLILZ;
            if (interfaceC1272120jD0 != null) {
                iComposerUpdateNode = interfaceC1272120jD0.composerUpdateNode(str, str2, f);
                if (iComposerUpdateNode != 0) {
                }
            } else {
                iComposerUpdateNode = -1;
            }
            C1272300jDI c1272300jDI = c1272100jCy.LLJLILLLLZIIL;
            if (c1272300jDI != null) {
                c1272300jDI.onError(iComposerUpdateNode, str3);
            }
        }
        C1C7U.LIZIZ("VideoEffectNode@5e69.composerUpdateNode$1L");
    }

    public ARunnableS0S3100001_20(Object obj, String str, String str2, float f, String str3, int i) {
        this.$t = i;
        this.l3 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.f4 = f;
        this.s2 = str3;
    }
}
