package X;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.13gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20075813gq extends AbstractC20077113h3 {
    public static C20075813gq LIZLLL;
    public BreakIterator LIZJ;

    public C20075813gq(Locale locale) {
        this.LIZJ = BreakIterator.getWordInstance(locale);
    }

    @Override // X.InterfaceC20077913hB
    public final int[] LIZ(int i) {
        if (LIZLLL().length() <= 0 || i >= LIZLLL().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!LJI(i) && (!LJI(i) || (i != 0 && LJI(i - 1)))) {
            BreakIterator breakIterator = this.LIZJ;
            if (breakIterator == null) {
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.LIZJ;
        if (breakIterator2 == null) {
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i);
        if (iFollowing == -1 || !LJFF(iFollowing)) {
            return null;
        }
        return LIZJ(i, iFollowing);
    }

    @Override // X.InterfaceC20077913hB
    public final int[] LIZIZ(int i) {
        int length = LIZLLL().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !LJI(i - 1) && !LJFF(i)) {
            BreakIterator breakIterator = this.LIZJ;
            if (breakIterator == null) {
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.LIZJ;
        if (breakIterator2 == null) {
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i);
        if (iPreceding == -1 || !LJI(iPreceding) || (iPreceding != 0 && LJI(iPreceding - 1))) {
            return null;
        }
        return LIZJ(iPreceding, i);
    }

    public final void LJ(String str) {
        this.LIZ = str;
        BreakIterator breakIterator = this.LIZJ;
        if (breakIterator == null) {
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    public final boolean LJFF(int i) {
        if (i > 0 && LJI(i - 1)) {
            if (i == LIZLLL().length() || !LJI(i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LJI(int i) {
        if (i >= 0 && i < LIZLLL().length()) {
            return Character.isLetterOrDigit(LIZLLL().codePointAt(i));
        }
        return false;
    }
}
