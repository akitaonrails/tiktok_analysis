package X;

/* JADX INFO: renamed from: X.0n4D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420430n4D implements C05WF {
    public final C1420410n4B LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;

    @Override // X.C05WF
    public final void LIZ(float f, String str) {
    }

    public C1420430n4D(C1420410n4B c1420410n4B) {
        this.LIZ = c1420410n4B;
    }

    @Override // X.C05WF
    public final void LIZIZ(float f, EnumC1426605iC enumC1426605iC) {
        int i = C1426805iE.LIZ[enumC1426605iC.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                    return;
                }
                if (f <= 0.0f && !this.LIZLLL) {
                    C1415050mvX c1415050mvX = C1415050mvX.LIZ;
                    C1420410n4B c1420410n4B = this.LIZ;
                    String str = c1420410n4B.LIZ;
                    String str2 = c1420410n4B.LIZLLL;
                    String str3 = c1420410n4B.LIZJ;
                    String str4 = c1420410n4B.LJ;
                    c1415050mvX.getClass();
                    C1415050mvX.LJII(null, str, "convert_lyrics_nle", str2, str3, str4, true);
                    this.LIZLLL = true;
                    return;
                }
                if (f >= 1.0f) {
                    C1415050mvX c1415050mvX2 = C1415050mvX.LIZ;
                    String str5 = this.LIZ.LIZ;
                    c1415050mvX2.getClass();
                    C1415050mvX.LIZIZ(0, str5, "convert_lyrics_nle", null, null);
                    return;
                }
                return;
            }
            if (f <= 0.0f && !this.LIZJ) {
                C1415050mvX c1415050mvX3 = C1415050mvX.LIZ;
                C1420410n4B c1420410n4B2 = this.LIZ;
                String str6 = c1420410n4B2.LIZ;
                String str7 = c1420410n4B2.LIZLLL;
                String str8 = c1420410n4B2.LIZJ;
                String str9 = c1420410n4B2.LJ;
                c1415050mvX3.getClass();
                C1415050mvX.LJII(null, str6, "request_minidraft", str7, str8, str9, true);
                this.LIZJ = true;
                return;
            }
            if (f >= 1.0f) {
                C1415050mvX c1415050mvX4 = C1415050mvX.LIZ;
                String str10 = this.LIZ.LIZ;
                c1415050mvX4.getClass();
                C1415050mvX.LIZIZ(0, str10, "request_minidraft", null, null);
                return;
            }
            return;
        }
        if (f <= 0.0f && !this.LIZIZ) {
            C1415050mvX c1415050mvX5 = C1415050mvX.LIZ;
            C1420410n4B c1420410n4B3 = this.LIZ;
            String str11 = c1420410n4B3.LIZ;
            String str12 = c1420410n4B3.LIZLLL;
            String str13 = c1420410n4B3.LIZJ;
            String str14 = c1420410n4B3.LJ;
            c1415050mvX5.getClass();
            C1415050mvX.LJII(null, str11, "download_effect_resource", str12, str13, str14, true);
            this.LIZIZ = true;
            return;
        }
        if (f >= 1.0f) {
            C1415050mvX c1415050mvX6 = C1415050mvX.LIZ;
            String str15 = this.LIZ.LIZ;
            c1415050mvX6.getClass();
            C1415050mvX.LIZIZ(0, str15, "download_effect_resource", null, null);
        }
    }
}
