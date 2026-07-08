package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Pyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662650Pyx {
    public static final /* synthetic */ int LIZ = 0;

    public static final C653740Pka LIZ(String str, C653660PkS c653660PkS, User user) {
        String str2;
        C653740Pka c653740Pka = new C653740Pka(str);
        c653740Pka.LJIIZILJ("search_id", c653660PkS.LJIIJ);
        c653740Pka.LJIJI("search_result_id", user.getUid());
        c653740Pka.LJIIZILJ("search_keyword", c653660PkS.LJFF);
        c653740Pka.LJIIZILJ("impr_id", c653660PkS.LJIIJJI);
        c653740Pka.LJIJJ(c653660PkS.LJIIIIZZ);
        c653740Pka.LJIIZILJ("to_user_id", user.getUid());
        C662390PyX.LIZ.getClass();
        boolean zLIZLLL = C662390PyX.LIZLLL(user);
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (!zLIZLLL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c653740Pka.LJIIZILJ("can_message", str2);
        if (user.getFollowStatus() == 4) {
            str3 = "1";
        }
        c653740Pka.LJIIZILJ("is_requested", str3);
        return c653740Pka;
    }
}
