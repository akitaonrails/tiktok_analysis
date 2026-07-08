package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: X.1Dyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273481Dyk {
    public final InterfaceC2273521Dyo LIZ;
    public final C2273461Dyi LIZIZ;
    public final BufferedReader LIZJ;

    public final Spannable LIZ() throws IOException {
        C2273501Dym c2273501Dym;
        String line = this.LIZJ.readLine();
        SpannableStringBuilder spannableStringBuilder = null;
        final C2260261DdQ c2260261DdQ = null;
        C2273501Dym c2273501Dym2 = null;
        while (line != null) {
            C2273501Dym c2273501Dym3 = new C2273501Dym(line);
            if (c2273501Dym2 == null) {
                c2260261DdQ = new C2260261DdQ(c2273501Dym3);
                c2273501Dym2 = c2273501Dym3;
            } else if (c2260261DdQ != null) {
                c2260261DdQ.LIZJ.LIZIZ(c2273501Dym3);
                c2260261DdQ.LIZJ = c2273501Dym3;
            }
            line = this.LIZJ.readLine();
        }
        if (c2260261DdQ != null) {
            this.LIZIZ.LIZIZ = new InterfaceC2273561Dys() { // from class: X.1Dyq
                @Override // X.InterfaceC2273561Dys
                public final C2260261DdQ LJII() {
                    return c2260261DdQ;
                }
            };
            while (true) {
                C2273501Dym c2273501Dym4 = c2260261DdQ.LIZIZ;
                if (c2273501Dym4 == null || !C2273461Dyi.LIZIZ(25, c2273501Dym4)) {
                    break;
                }
                C2273501Dym c2273501Dym5 = c2260261DdQ.LIZIZ;
                C2273501Dym c2273501Dym6 = c2260261DdQ.LIZJ;
                if (c2273501Dym5 == c2273501Dym6) {
                    c2273501Dym = c2273501Dym6.LIZ;
                } else {
                    c2273501Dym = c2273501Dym5.LIZIZ;
                    if (c2273501Dym5 == c2260261DdQ.LIZ) {
                        c2260261DdQ.LIZ = c2273501Dym;
                    }
                }
                if (c2273501Dym5.LIZJ == null) {
                    c2273501Dym5.LJI();
                } else {
                    c2273501Dym5.LJFF();
                }
                c2260261DdQ.LIZIZ = c2273501Dym;
            }
            if (c2260261DdQ.LIZIZ != null && c2260261DdQ.LIZ != null) {
                if (c2260261DdQ.LIZJ == null) {
                    return null;
                }
                do {
                    if (!this.LIZIZ.LJII(c2260261DdQ.LIZIZ) && !this.LIZIZ.LJIIIZ(c2260261DdQ.LIZIZ)) {
                        C2273501Dym c2273501Dym7 = c2260261DdQ.LIZIZ;
                        c2273501Dym7.LJFF = SpannableStringBuilder.valueOf(c2273501Dym7.LJ);
                        this.LIZIZ.LJ(c2260261DdQ.LIZIZ);
                    }
                } while (c2260261DdQ.LIZ());
                c2260261DdQ.LIZIZ = c2260261DdQ.LIZ;
                spannableStringBuilder = new SpannableStringBuilder();
                do {
                    C2273501Dym c2273501Dym8 = c2260261DdQ.LIZIZ;
                    C2273501Dym c2273501Dym9 = c2273501Dym8.LIZIZ;
                    spannableStringBuilder.append(c2273501Dym8.LJFF);
                    if (c2273501Dym9 == null) {
                        break;
                    }
                    InterfaceC2273521Dyo interfaceC2273521Dyo = this.LIZ;
                    if (interfaceC2273521Dyo != null) {
                        interfaceC2273521Dyo.LJ(spannableStringBuilder);
                    }
                } while (c2260261DdQ.LIZ());
            }
        }
        return spannableStringBuilder;
    }

    public C2273481Dyk(String str, InterfaceC2273521Dyo interfaceC2273521Dyo) {
        this.LIZ = interfaceC2273521Dyo;
        this.LIZIZ = new C2273461Dyi(interfaceC2273521Dyo);
        this.LIZJ = new BufferedReader(new StringReader(str == null ? "" : str));
    }
}
