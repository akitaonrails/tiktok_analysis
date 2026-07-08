package X;

import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.0qCP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540830qCP extends AbstractC1542200qEc {
    public AbstractC1542200qEc LLILLJJLI = null;
    public boolean LLILLL;

    @Override // X.AbstractC1537870q7d
    public final void LJLJJI() {
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLILLLLZI() {
        AbstractC1542200qEc abstractC1542200qEc;
        if (this.LLILLL || (abstractC1542200qEc = this.LLILLJJLI) == null) {
            return;
        }
        abstractC1542200qEc.LJLILLLLZI();
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        AbstractC1542200qEc abstractC1542200qEc;
        if (!this.LLILLL && (abstractC1542200qEc = this.LLILLJJLI) != null) {
            abstractC1542200qEc.LJLIIIL(interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        AbstractC1542200qEc abstractC1542200qEc;
        if (!this.LLILLL && (abstractC1542200qEc = this.LLILLJJLI) != null) {
            abstractC1542200qEc.LJLIIL(interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) {
        AbstractC1542200qEc abstractC1542200qEc;
        if (!this.LLILLL && (abstractC1542200qEc = this.LLILLJJLI) != null) {
            abstractC1542200qEc.LJLLJ(sparkContext, c1548490qOl);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        AbstractC1542200qEc abstractC1542200qEc;
        LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        if (!this.LLILLL && (abstractC1542200qEc = this.LLILLJJLI) != null) {
            abstractC1542200qEc.LJL(interfaceC1541990qEH, str, c1542120qEU);
        }
    }
}
