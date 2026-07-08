package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: X.18xH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21451718xH {
    public final char[] LIZ;
    public final Reader LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public final String[] LJII;

    public final void LIZ() {
        this.LJ++;
    }

    public final void LIZIZ() {
        int i = this.LJ;
        if (i < this.LIZLLL) {
            return;
        }
        try {
            this.LIZIZ.skip(i);
            this.LIZIZ.mark(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
            int i2 = this.LIZIZ.read(this.LIZ);
            this.LIZIZ.reset();
            if (i2 != -1) {
                this.LIZJ = i2;
                this.LJFF += this.LJ;
                this.LJ = 0;
                this.LJI = 0;
                if (i2 > 3072) {
                    i2 = 3072;
                }
                this.LIZLLL = i2;
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e) { // from class: X.0jaB
                public IOException ioException() {
                    return (IOException) getCause();
                }
            };
        }
    }

    public final void LJIILLIIL() {
        this.LJ--;
    }

    public final String toString() {
        char[] cArr = this.LIZ;
        int i = this.LJ;
        return new String(cArr, i, this.LIZJ - i);
    }

    public final char LIZLLL() {
        LIZIZ();
        int i = this.LJ;
        char c = i >= this.LIZJ ? (char) 65535 : this.LIZ[i];
        this.LJ = i + 1;
        return c;
    }

    public final String LJ() {
        char c;
        LIZIZ();
        int i = this.LJ;
        while (true) {
            int i2 = this.LJ;
            if (i2 >= this.LIZJ || (((c = this.LIZ[i2]) < 'A' || (c > 'Z' && (c < 'a' || c > 'z'))) && !Character.isLetter(c))) {
                break;
            }
            this.LJ++;
        }
        return LIZJ(this.LIZ, this.LJII, i, this.LJ - i);
    }

    public final char LJIIIIZZ() {
        LIZIZ();
        int i = this.LJ;
        if (i >= this.LIZJ) {
            return (char) 65535;
        }
        return this.LIZ[i];
    }

    public final boolean LJIIIZ() {
        LIZIZ();
        return this.LJ >= this.LIZJ;
    }

    public final boolean LJIILJJIL() {
        if (LJIIIZ()) {
            return false;
        }
        char c = this.LIZ[this.LJ];
        return (c >= 'A' && (c <= 'Z' || (c >= 'a' && c <= 'z'))) || Character.isLetter(c);
    }

    public C21451718xH(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.LJII = new String[128];
        if (stringReader.markSupported()) {
            this.LIZIZ = stringReader;
            this.LIZ = new char[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
            LIZIZ();
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    public final String LJFF(char c) {
        LIZIZ();
        int i = this.LJ;
        while (true) {
            if (i >= this.LIZJ) {
                break;
            }
            if (c == this.LIZ[i]) {
                int i2 = i - this.LJ;
                if (i2 != -1) {
                    String strLIZJ = LIZJ(this.LIZ, this.LJII, this.LJ, i2);
                    this.LJ += i2;
                    return strLIZJ;
                }
            } else {
                i++;
            }
        }
        LIZIZ();
        char[] cArr = this.LIZ;
        String[] strArr = this.LJII;
        int i3 = this.LJ;
        String strLIZJ2 = LIZJ(cArr, strArr, i3, this.LIZJ - i3);
        this.LJ = this.LIZJ;
        return strLIZJ2;
    }

    public final String LJI(char... cArr) {
        LIZIZ();
        int i = this.LJ;
        int i2 = this.LIZJ;
        char[] cArr2 = this.LIZ;
        loop0: while (this.LJ < i2) {
            for (char c : cArr) {
                if (cArr2[this.LJ] == c) {
                    break loop0;
                }
            }
            this.LJ++;
        }
        int i3 = this.LJ;
        if (i3 > i) {
            return LIZJ(this.LIZ, this.LJII, i, i3 - i);
        }
        return "";
    }

    public final String LJII(char... cArr) {
        LIZIZ();
        int i = this.LJ;
        int i2 = this.LIZJ;
        char[] cArr2 = this.LIZ;
        while (true) {
            int i3 = this.LJ;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.LJ++;
        }
        int i4 = this.LJ;
        if (i4 > i) {
            return LIZJ(this.LIZ, this.LJII, i, i4 - i);
        }
        return "";
    }

    public final boolean LJIIJ(String str) {
        LIZIZ();
        LIZIZ();
        int length = str.length();
        if (length <= this.LIZJ - this.LJ) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.LIZ[this.LJ + i]) {
                }
            }
            this.LJ += str.length();
            return true;
        }
        return false;
    }

    public final boolean LJIIJJI(String str) {
        LIZIZ();
        int length = str.length();
        if (length <= this.LIZJ - this.LJ) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.LIZ[this.LJ + i])) {
                }
            }
            this.LJ += str.length();
            return true;
        }
        return false;
    }

    public final boolean LJIIL(char c) {
        if (!LJIIIZ() && this.LIZ[this.LJ] == c) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL(char... cArr) {
        if (LJIIIZ()) {
            return false;
        }
        LIZIZ();
        char c = this.LIZ[this.LJ];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public final int LJIILL(CharSequence charSequence) {
        LIZIZ();
        String str = (String) charSequence;
        char cCharAt = str.charAt(0);
        int i = this.LJ;
        while (i < this.LIZJ) {
            if (cCharAt != this.LIZ[i]) {
                do {
                    i++;
                    if (i >= this.LIZJ) {
                        break;
                    }
                } while (cCharAt != this.LIZ[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.LIZJ;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.LIZ[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.LJ;
                }
            }
            i = i2;
        }
        return -1;
    }

    public static String LIZJ(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i;
        int i4 = 0;
        int i5 = 0;
        do {
            i5 = (i5 * 31) + cArr[i3];
            i4++;
            i3++;
        } while (i4 < i2);
        int length = (strArr.length - 1) & i5;
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        }
        if (i2 == str.length()) {
            int i6 = i;
            int i7 = i2;
            int i8 = 0;
            while (true) {
                int i9 = i7 - 1;
                if (i7 != 0) {
                    int i10 = i6 + 1;
                    int i11 = i8 + 1;
                    if (cArr[i6] != str.charAt(i8)) {
                        break;
                    }
                    i6 = i10;
                    i7 = i9;
                    i8 = i11;
                } else {
                    return str;
                }
            }
        }
        String str3 = new String(cArr, i, i2);
        strArr[length] = str3;
        return str3;
    }
}
