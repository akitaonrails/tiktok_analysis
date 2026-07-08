package X;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.13gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20075913gr extends AbstractC20077113h3 {
    public static C20075913gr LIZLLL;
    public BreakIterator LIZJ;

    public C20075913gr(Locale locale) {
        this.LIZJ = BreakIterator.getCharacterInstance(locale);
    }

    @Override // X.InterfaceC20077913hB
    public final int[] LIZ(int i) {
        int length = LIZLLL().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.LIZJ;
            if (breakIterator == null) {
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.LIZJ;
                if (breakIterator2 == null) {
                    breakIterator2 = null;
                }
                i = breakIterator2.following(i);
            } else {
                BreakIterator breakIterator3 = this.LIZJ;
                if (breakIterator3 == null) {
                    breakIterator3 = null;
                }
                int iFollowing = breakIterator3.following(i);
                if (iFollowing == -1) {
                    return null;
                }
                return LIZJ(i, iFollowing);
            }
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.LIZJ;
            if (breakIterator == null) {
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.LIZJ;
                if (breakIterator2 == null) {
                    breakIterator2 = null;
                }
                i = breakIterator2.preceding(i);
            } else {
                BreakIterator breakIterator3 = this.LIZJ;
                if (breakIterator3 == null) {
                    breakIterator3 = null;
                }
                int iPreceding = breakIterator3.preceding(i);
                if (iPreceding == -1) {
                    return null;
                }
                return LIZJ(iPreceding, i);
            }
        } while (i != -1);
        return null;
    }

    public final void LJ(String str) {
        this.LIZ = str;
        BreakIterator breakIterator = this.LIZJ;
        if (breakIterator == null) {
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}
