package X;

import com.bytedance.fresco.sr.BmfJniSr;

/* JADX INFO: renamed from: X.0kgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328960kgg extends AbstractC1291220jho {
    public final InterfaceC1328980kgi LIZ;
    public final boolean LIZJ;
    public final int LJ;
    public C592490NLr LJFF;
    public String LIZIZ = "";
    public final boolean LIZLLL = true;

    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public final String getName() {
        return "SRPostProcessor";
    }

    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public final InterfaceC1324680kZm getPostprocessorCacheKey() {
        if (this.LJFF == null) {
            this.LJFF = new C592490NLr(C786410Ut5.k4(null, "s%d%b", new Object[]{Integer.valueOf(this.LJ), Boolean.valueOf(this.LIZJ)}));
        }
        return this.LJFF;
    }

    public C1328960kgg(int i, boolean z) {
        this.LIZJ = z;
        this.LJ = i;
        if (C1328730kgJ.LJIJJLI) {
            this.LIZ = new BmfJniSr();
        } else {
            this.LIZ = new C1328970kgh();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0126, code lost:
    
        if (r13.equals("2") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0160, code lost:
    
        if (r13.equals("2.0") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0177, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017c A[Catch: Exception -> 0x0287, 0jW1 -> 0x0295, TRY_LEAVE, TryCatch #9 {0jW1 -> 0x0295, Exception -> 0x0287, blocks: (B:41:0x0102, B:43:0x0106, B:47:0x0114, B:74:0x0178, B:76:0x017c, B:46:0x0111), top: B:165:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191 A[Catch: Exception -> 0x0289, 0jW1 -> 0x0297, TryCatch #8 {0jW1 -> 0x0297, Exception -> 0x0289, blocks: (B:72:0x0163, B:77:0x0182, B:78:0x0191, B:80:0x0195, B:84:0x01a0, B:85:0x01af, B:86:0x01b8, B:88:0x01bc, B:89:0x01d3, B:91:0x01d7, B:95:0x01e2, B:96:0x01f3), top: B:167:0x0104 }] */
    @Override // X.AbstractC1291220jho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1323050kX9<android.graphics.Bitmap> process(android.graphics.Bitmap r30, X.AbstractC1301670jyf r31, java.util.Map<java.lang.String, java.lang.String> r32) {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1328960kgg.process(android.graphics.Bitmap, X.0jyf, java.util.Map):X.0kX9");
    }
}
