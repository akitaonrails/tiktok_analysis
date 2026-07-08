package X;

import kotlin.text.Regex;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0g1L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149570g1L {
    public final String LIZ;
    public final String LIZIZ;
    public final Regex LIZJ;
    public final int LIZLLL;

    public C1149570g1L(String str, String str2, int i, int i2) {
        Regex regex;
        str = (i2 & 1) != 0 ? "," : str;
        str2 = (i2 & 2) != 0 ? e3.d : str2;
        if ((i2 & 4) != 0) {
            regex = new Regex("(\\d)(?=(\\d{3})+\\b)");
        } else {
            regex = null;
        }
        i = (i2 & 8) != 0 ? 2 : i;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = regex;
        this.LIZLLL = i;
    }
}
