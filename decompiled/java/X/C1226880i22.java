package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.Comparator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226880i22<T> implements Comparator {
    public static final C1226880i22<T> LL = new C1226880i22<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean zIsLetter;
        IMContact iMContact = (IMContact) obj;
        IMContact iMContact2 = (IMContact) obj2;
        Character chLJLLILLLL = C13LN.LJLLILLLL(C1226910i25.LIZLLL(iMContact));
        boolean zIsLetter2 = false;
        if (chLJLLILLLL != null) {
            zIsLetter = Character.isLetter(chLJLLILLLL.charValue());
        } else {
            zIsLetter = false;
        }
        Character chLJLLILLLL2 = C13LN.LJLLILLLL(C1226910i25.LIZLLL(iMContact2));
        if (chLJLLILLLL2 != null) {
            zIsLetter2 = Character.isLetter(chLJLLILLLL2.charValue());
        }
        String strLIZ = C1226910i25.LIZ(iMContact);
        String strLIZ2 = C1226910i25.LIZ(iMContact2);
        if (zIsLetter) {
            if (!zIsLetter2) {
                return -1;
            }
        } else if (zIsLetter2) {
            return 1;
        }
        if (Intrinsics.LJFF(C1226910i25.LIZLLL(iMContact), C1226910i25.LIZLLL(iMContact2))) {
            Locale locale = Locale.ROOT;
            return strLIZ.toLowerCase(locale).compareTo(strLIZ2.toLowerCase(locale));
        }
        return C1226910i25.LIZLLL(iMContact).compareTo(C1226910i25.LIZLLL(iMContact2));
    }
}
