package X;

import androidx.emoji2.text.e;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695180uDM {
    public final CharSequence LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final BreakIterator LIZLLL;

    public final void LIZ(int i) {
        int i2 = this.LIZIZ;
        if (i <= this.LIZJ && i2 <= i) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid offset: ");
        sbLIZ.append(i);
        sbLIZ.append(". Valid range is [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" , ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(']');
        C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LIZIZ(int i) {
        int i2 = this.LIZIZ + 1;
        if (i <= this.LIZJ && i2 <= i) {
            if (Character.isLetterOrDigit(Character.codePointBefore(this.LIZ, i))) {
                return true;
            }
            int i3 = i - 1;
            if (Character.isSurrogate(this.LIZ.charAt(i3))) {
                return true;
            }
            if (e.LJ()) {
                e eVarLIZ = e.LIZ();
                if (eVarLIZ.LIZJ() == 1 && eVarLIZ.LIZIZ(i3, this.LIZ) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LIZJ(int i) {
        int i2 = this.LIZIZ + 1;
        if (i > this.LIZJ || i2 > i) {
            return false;
        }
        return C1695590uE1.LIZ(Character.codePointBefore(this.LIZ, i));
    }

    public final boolean LIZLLL(int i) {
        LIZ(i);
        if (this.LIZLLL.isBoundary(i)) {
            if (!LJFF(i) || !LJFF(i - 1) || !LJFF(i + 1)) {
                if (i <= 0 || i >= this.LIZ.length() - 1 || (!LJ(i) && !LJ(i + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean LJ(int i) {
        int i2 = i - 1;
        if (!Intrinsics.LJFF(Character.UnicodeBlock.of(this.LIZ.charAt(i2)), Character.UnicodeBlock.HIRAGANA) || !Intrinsics.LJFF(Character.UnicodeBlock.of(this.LIZ.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            if (Intrinsics.LJFF(Character.UnicodeBlock.of(this.LIZ.charAt(i)), Character.UnicodeBlock.HIRAGANA) && Intrinsics.LJFF(Character.UnicodeBlock.of(this.LIZ.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean LJFF(int i) {
        int i2 = this.LIZIZ;
        if (i < this.LIZJ && i2 <= i) {
            if (Character.isLetterOrDigit(Character.codePointAt(this.LIZ, i)) || Character.isSurrogate(this.LIZ.charAt(i))) {
                return true;
            }
            if (e.LJ()) {
                e eVarLIZ = e.LIZ();
                if (eVarLIZ.LIZJ() == 1 && eVarLIZ.LIZIZ(i, this.LIZ) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LJI(int i) {
        int i2 = this.LIZIZ;
        if (i >= this.LIZJ || i2 > i) {
            return false;
        }
        return C1695590uE1.LIZ(Character.codePointAt(this.LIZ, i));
    }

    public final int LJII(int i) {
        LIZ(i);
        int iFollowing = this.LIZLLL.following(i);
        if (LJFF(iFollowing - 1) && LJFF(iFollowing) && !LJ(iFollowing)) {
            return LJII(iFollowing);
        }
        return iFollowing;
    }

    public final int LJIIIIZZ(int i) {
        LIZ(i);
        int iPreceding = this.LIZLLL.preceding(i);
        if (LJFF(iPreceding) && LIZIZ(iPreceding) && !LJ(iPreceding)) {
            return LJIIIIZZ(iPreceding);
        }
        return iPreceding;
    }

    public C1695180uDM(CharSequence charSequence, int i, Locale locale) {
        this.LIZ = charSequence;
        if (charSequence.length() < 0) {
            C1681000tqU.LIZ("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            C1681000tqU.LIZ("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.LIZLLL = wordInstance;
        this.LIZIZ = Math.max(0, -50);
        this.LIZJ = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new C1695260uDU(i, charSequence));
    }
}
