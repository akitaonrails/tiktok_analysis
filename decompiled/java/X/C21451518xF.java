package X;

import com.ss.mediakit.medialoader.AVMDLDataLoader;
import java.util.Arrays;

/* JADX INFO: renamed from: X.18xF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21451518xF {
    public static final char[] LJIIZILJ;
    public static final int[] LJIJ = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, AVMDLDataLoader.KeyIsLoaderFactoryP2PLevel, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final C21451718xH LIZ;
    public final C21445818wK LIZIZ;
    public AbstractC21450518x5 LIZLLL;
    public boolean LJ;
    public String LJFF;
    public AbstractC21450218x2 LJIIIIZZ;
    public String LJIILJJIL;
    public EnumC21454118xf LIZJ = EnumC21454118xf.LL;
    public final StringBuilder LJI = new StringBuilder(1024);
    public final StringBuilder LJII = new StringBuilder(1024);
    public final C21450118x1 LJIIIZ = new AbstractC21450218x2() { // from class: X.18x1
        {
            EnumC21448718wn enumC21448718wn = EnumC21448718wn.StartTag;
            this.LJIIIZ = new C21449918wz();
        }

        public final String toString() {
            C21449918wz c21449918wz = this.LJIIIZ;
            if (c21449918wz == null || c21449918wz.LL <= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("<");
                sbLIZ.append(LJII());
                sbLIZ.append(">");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("<");
            sbLIZ2.append(LJII());
            sbLIZ2.append(" ");
            sbLIZ2.append(this.LJIIIZ.toString());
            sbLIZ2.append(">");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }

        @Override // X.AbstractC21450218x2
        public final AbstractC21450218x2 LJIIIZ() {
            super.LJIIIZ();
            this.LJIIIZ = new C21449918wz();
            return this;
        }

        @Override // X.AbstractC21450218x2, X.AbstractC21450518x5
        public final /* bridge */ /* synthetic */ AbstractC21450518x5 LIZ() {
            LJIIIZ();
            return this;
        }
    };
    public final C21450318x3 LJIIJ = new AbstractC21450218x2() { // from class: X.18x3
        {
            EnumC21448718wn enumC21448718wn = EnumC21448718wn.EndTag;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("</");
            sbLIZ.append(LJII());
            sbLIZ.append(">");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    };
    public final C21449718wx LJIIJJI = new C21449718wx();
    public final C21450818x8 LJIIL = new C21450818x8();
    public final C21450418x4 LJIILIIL = new C21450418x4();
    public final int[] LJIILL = new int[1];
    public final int[] LJIILLIIL = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        LJIIZILJ = cArr;
        Arrays.sort(cArr);
    }

    public final void LJ() {
        AbstractC21450518x5.LIZIZ(this.LJII);
    }

    public final void LJIIIIZZ() {
        LJI(this.LJIILIIL);
    }

    public final void LJIIIZ() {
        LJI(this.LJIIL);
    }

    public final void LJIIJ() {
        AbstractC21450218x2 abstractC21450218x2 = this.LJIIIIZZ;
        if (abstractC21450218x2.LIZLLL != null) {
            abstractC21450218x2.LJIIIIZZ();
        }
        LJI(this.LJIIIIZZ);
    }

    public final boolean LJIILIIL() {
        return this.LJIILJJIL != null && this.LJIIIIZZ.LJII().equalsIgnoreCase(this.LJIILJJIL);
    }

    public final AbstractC21450518x5 LJIILJJIL() {
        while (!this.LJ) {
            this.LIZJ.LJI(this, this.LIZ);
        }
        if (this.LJI.length() > 0) {
            String string = this.LJI.toString();
            StringBuilder sb = this.LJI;
            sb.delete(0, sb.length());
            this.LJFF = null;
            C21449718wx c21449718wx = this.LJIIJJI;
            c21449718wx.LIZIZ = string;
            return c21449718wx;
        }
        String str = this.LJFF;
        if (str == null) {
            this.LJ = false;
            return this.LIZLLL;
        }
        C21449718wx c21449718wx2 = this.LJIIJJI;
        c21449718wx2.LIZIZ = str;
        this.LJFF = null;
        return c21449718wx2;
    }

    public final void LIZ(EnumC21454118xf enumC21454118xf) {
        this.LIZ.LIZ();
        this.LIZJ = enumC21454118xf;
    }

    public final void LIZIZ(String str) {
        C21445818wK c21445818wK = this.LIZIZ;
        if (c21445818wK.size() < c21445818wK.maxSize) {
            C21445818wK c21445818wK2 = this.LIZIZ;
            C21451718xH c21451718xH = this.LIZ;
            c21445818wK2.add(new C211400rg(c21451718xH.LJFF + c21451718xH.LJ, "Invalid character reference: %s", str));
        }
    }

    public final AbstractC21450218x2 LIZLLL(boolean z) {
        AbstractC21450218x2 abstractC21450218x2;
        if (z) {
            abstractC21450218x2 = this.LJIIIZ;
            abstractC21450218x2.LJIIIZ();
        } else {
            abstractC21450218x2 = this.LJIIJ;
            abstractC21450218x2.LJIIIZ();
        }
        this.LJIIIIZZ = abstractC21450218x2;
        return abstractC21450218x2;
    }

    public final void LJFF(char c) {
        LJII(String.valueOf(c));
    }

    public final void LJI(AbstractC21450518x5 abstractC21450518x5) {
        if (!this.LJ) {
            this.LIZLLL = abstractC21450518x5;
            this.LJ = true;
            EnumC21448718wn enumC21448718wn = abstractC21450518x5.LIZ;
            if (enumC21448718wn == EnumC21448718wn.StartTag) {
                this.LJIILJJIL = ((AbstractC21450218x2) abstractC21450518x5).LIZIZ;
                return;
            }
            if (enumC21448718wn != EnumC21448718wn.EndTag || ((AbstractC21450218x2) abstractC21450518x5).LJIIIZ == null) {
                return;
            }
            C21445818wK c21445818wK = this.LIZIZ;
            if (c21445818wK.size() >= c21445818wK.maxSize) {
                return;
            }
            C21445818wK c21445818wK2 = this.LIZIZ;
            C21451718xH c21451718xH = this.LIZ;
            c21445818wK2.add(new C211400rg(c21451718xH.LJFF + c21451718xH.LJ));
            return;
        }
        throw new IllegalArgumentException("There is an unread token pending!");
    }

    public final void LJII(String str) {
        if (this.LJFF == null) {
            this.LJFF = str;
            return;
        }
        if (this.LJI.length() == 0) {
            this.LJI.append(this.LJFF);
        }
        this.LJI.append(str);
    }

    public final void LJIIJJI(EnumC21454118xf enumC21454118xf) {
        C21445818wK c21445818wK = this.LIZIZ;
        if (c21445818wK.size() < c21445818wK.maxSize) {
            C21445818wK c21445818wK2 = this.LIZIZ;
            C21451718xH c21451718xH = this.LIZ;
            c21445818wK2.add(new C211400rg(c21451718xH.LJFF + c21451718xH.LJ, "Unexpectedly reached end of file (EOF) in input state [%s]", enumC21454118xf));
        }
    }

    public final void LJIIL(EnumC21454118xf enumC21454118xf) {
        C21445818wK c21445818wK = this.LIZIZ;
        if (c21445818wK.size() < c21445818wK.maxSize) {
            C21445818wK c21445818wK2 = this.LIZIZ;
            C21451718xH c21451718xH = this.LIZ;
            c21445818wK2.add(new C211400rg(c21451718xH.LJFF + c21451718xH.LJ, "Unexpected character '%s' in input state [%s]", Character.valueOf(c21451718xH.LJIIIIZZ()), enumC21454118xf));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.18x1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.18x3] */
    public C21451518xF(C21451718xH c21451718xH, C21445818wK c21445818wK) {
        this.LIZ = c21451718xH;
        this.LIZIZ = c21445818wK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ba, code lost:
    
        if (r15.LIZ.LJIILIIL('=', '-', '_') == false) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] LIZJ(java.lang.Character r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21451518xF.LIZJ(java.lang.Character, boolean):int[]");
    }
}
