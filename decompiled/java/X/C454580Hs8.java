package X;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Hs8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454580Hs8 {
    public static final String LIZ(Emoji emoji) {
        if (emoji.getDisplayNameLangs() != null) {
            return emoji.getDisplayNameLangs().get(C786410Ut5.t2(Locale.ENGLISH));
        }
        return "";
    }

    public static final String LIZIZ(Emoji emoji) {
        Locale locale;
        String strT2 = "";
        if (emoji.getStickerType() == 2) {
            return "";
        }
        String strT22 = C786410Ut5.t2(Locale.ENGLISH);
        if (Build.VERSION.SDK_INT >= 24) {
            C0I0B.LJFF.LIZJ();
            locale = C894660Z7w.LIZ().getResources().getConfiguration().getLocales().get(0);
        } else {
            C0I0B.LJFF.LIZJ();
            locale = C894660Z7w.LIZ().getResources().getConfiguration().locale;
        }
        if (locale != null) {
            strT2 = C786410Ut5.t2(locale);
        }
        if (TextUtils.equals(strT22, strT2)) {
            String strLIZ = LIZ(emoji);
            if (!TextUtils.isEmpty(strLIZ)) {
                return strLIZ;
            }
        } else if (TextUtils.isEmpty(emoji.getDisplayName())) {
            return LIZ(emoji);
        }
        return emoji.getDisplayName();
    }
}
