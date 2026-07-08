package X;

import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.1An4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189801An4 extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        if (1 - this.$t != 0) {
            super.LJL(interfaceC1541990qEH, str, c1542120qEU);
        } else {
            LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (1 - this.$t != 0) {
            super.LJLIIIL(interfaceC1541990qEH);
        } else {
            LJLIIIL$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJL(String str, byte[] bArr) {
        if (1 - this.$t != 0) {
            super.LJLJJL(str, bArr);
        } else {
            LJLJJL$0(this, str, bArr);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLL(SparkContext sparkContext) {
        if (this.$t != 0) {
            super.LJLL(sparkContext);
        } else {
            LJLL$0(this, sparkContext);
        }
    }

    public C2189801An4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C2189801An4 c2189801An4, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1AF6 c1af6 = ((C1AF3) c2189801An4.l0).LJJIJL;
        c1af6.LIZ |= 4;
        c1af6.LJIIIIZZ = true;
        c1af6.LIZIZ = System.currentTimeMillis() - c1af6.LJII;
        ((C1AF3) c2189801An4.l0).LJJIIZ();
    }

    public static final void LJLL$0(C2189801An4 c2189801An4, SparkContext sparkContext) {
        ((C2177041AIc) c2189801An4.l0).LLJL = null;
    }

    public static final void LJLJJL$0(C2189801An4 c2189801An4, String str, byte[] bArr) {
        C1AF6 c1af6 = ((C1AF3) c2189801An4.l0).LJJIJL;
        c1af6.LIZ |= 8;
        c1af6.LIZLLL = System.currentTimeMillis() - c1af6.LJII;
    }

    public static final void LJL$0(C2189801An4 c2189801An4, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        ((C1AF3) c2189801An4.l0).LJJIJL.LJ = c1542120qEU.LIZ();
    }
}
