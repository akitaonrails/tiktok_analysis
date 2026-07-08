package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import java.util.Comparator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i14, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226280i14<T> implements Comparator {
    public static final C1226280i14<T> LL = new C1226280i14<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        IMConversation iMConversation;
        IMConversation iMConversation2;
        boolean zIsLetter;
        String initialLetter;
        String initialLetter2;
        String initialLetter3;
        String displayName;
        String displayName2;
        String initialLetter4;
        Character chLJLLILLLL;
        String initialLetter5;
        Character chLJLLILLLL2;
        C1224840hyk c1224840hyk = (C1224840hyk) obj2;
        Object obj3 = ((C1224840hyk) obj).LLJI.get("contact");
        String initialLetter6 = null;
        if (obj3 instanceof IMConversation) {
            iMConversation = (IMConversation) obj3;
        } else {
            iMConversation = null;
        }
        Object obj4 = c1224840hyk.LLJI.get("contact");
        if (obj4 instanceof IMConversation) {
            iMConversation2 = (IMConversation) obj4;
        } else {
            iMConversation2 = null;
        }
        boolean zIsLetter2 = false;
        if (iMConversation != null && (initialLetter5 = iMConversation.getInitialLetter()) != null && (chLJLLILLLL2 = C13LN.LJLLILLLL(initialLetter5)) != null) {
            zIsLetter = Character.isLetter(chLJLLILLLL2.charValue());
        } else {
            zIsLetter = false;
        }
        if (iMConversation2 != null && (initialLetter4 = iMConversation2.getInitialLetter()) != null && (chLJLLILLLL = C13LN.LJLLILLLL(initialLetter4)) != null) {
            zIsLetter2 = Character.isLetter(chLJLLILLLL.charValue());
        }
        if (zIsLetter) {
            if (!zIsLetter2) {
                return -1;
            }
        } else if (zIsLetter2) {
            return 1;
        }
        if (iMConversation != null) {
            initialLetter = iMConversation.getInitialLetter();
        } else {
            initialLetter = null;
        }
        if (iMConversation2 != null) {
            initialLetter6 = iMConversation2.getInitialLetter();
        }
        boolean zLJFF = Intrinsics.LJFF(initialLetter, initialLetter6);
        String str = "";
        if (zLJFF) {
            if (iMConversation == null || (displayName = iMConversation.getDisplayName()) == null) {
                displayName = "";
            }
            Locale locale = Locale.ROOT;
            String lowerCase = displayName.toLowerCase(locale);
            if (iMConversation2 != null && (displayName2 = iMConversation2.getDisplayName()) != null) {
                str = displayName2;
            }
            return lowerCase.compareTo(str.toLowerCase(locale));
        }
        if (iMConversation == null || (initialLetter2 = iMConversation.getInitialLetter()) == null) {
            initialLetter2 = "";
        }
        if (iMConversation2 != null && (initialLetter3 = iMConversation2.getInitialLetter()) != null) {
            str = initialLetter3;
        }
        return initialLetter2.compareTo(str);
    }
}
