package X;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.0HZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443230HZp {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        int i = 0;
        if (string.length() == 0) {
            return 0;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
        characterInstance.setText(string);
        int iFirst = characterInstance.first();
        while (iFirst != -1 && (iFirst = characterInstance.next()) != -1) {
            i++;
        }
        return i;
    }
}
