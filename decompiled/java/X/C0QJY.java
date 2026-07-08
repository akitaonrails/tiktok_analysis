package X;

import androidx.fragment.app.Fragment;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;

/* JADX INFO: renamed from: X.0QJY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QJY {
    public static final C0QJY LIZ = new C0QJY();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static boolean LIZLLL;

    public static final void LJ(int i) {
        LIZIZ = "";
        C1440005kM.LIZ(new AnonymousClass0352(i));
    }

    public static String LIZ(Fragment fragment, C19EG c19eg) {
        if (C650500PfM.LIZJ(C640270P9l.LIZJ(fragment, c19eg))) {
            return ((IMiddleForSearchFromEC) ServiceManager.get().getService(IMiddleForSearchFromEC.class)).LLIIIL();
        }
        return LIZIZ;
    }

    public static void LIZIZ(int i, String str, String str2, String str3, Integer num, String str4, SearchSugEntity searchSugEntity, String str5, String str6) {
        String str7;
        String id;
        C0PX4 c0px4 = new C0PX4();
        c0px4.LJIJJ(str);
        c0px4.LJIIZILJ("enter_method", "sug");
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo != null && sugExtraInfo.isGenerativeSug()) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c0px4.LJIIZILJ("sug_generate_type", str7);
        c0px4.LJIIZILJ("search_type", C0PSI.LIZ(i));
        c0px4.LJIIZILJ("words_type", str3);
        if (C123100dR.LIZ(str5)) {
            c0px4.LJ("words_label", "Sound");
            c0px4.LJIIZILJ("music_id", str5);
            c0px4.LJ("is_origin_music", str6);
        }
        c0px4.LJIIZILJ("action_type", str4);
        c0px4.LJIIZILJ("input_keyword", str2);
        c0px4.LJIIZILJ("search_keyword", searchSugEntity.content);
        Word word = searchSugEntity.mWord;
        if (word != null) {
            id = word.getId();
        } else {
            id = null;
        }
        c0px4.LJIIZILJ("group_id", id);
        c0px4.LJIIZILJ("order", String.valueOf(num));
        c0px4.LJIILJJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r13, int r14, com.ss.android.ugc.aweme.search.model.SearchSugEntity r15, java.lang.String r16, java.lang.String r17, int r18, androidx.fragment.app.Fragment r19, X.C19EG r20, java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, int r25) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QJY.LIZJ(java.lang.String, int, com.ss.android.ugc.aweme.search.model.SearchSugEntity, java.lang.String, java.lang.String, int, androidx.fragment.app.Fragment, X.19EG, java.lang.String, java.lang.String, boolean, java.lang.String, int):void");
    }

    public static void LIZLLL(String str, int i, SearchSugEntity searchSugEntity, String str2, String str3, int i2, Fragment fragment, C19EG c19eg, String str4, String str5, boolean z, String str6, int i3) {
        boolean z2 = z;
        String str7 = str5;
        String str8 = str4;
        String str9 = str2;
        int i4 = i2;
        String str10 = str;
        String str11 = "";
        if ((i3 & 1) != 0) {
            str10 = "";
        }
        if ((i3 & 8) != 0) {
            str9 = "";
        }
        if ((i3 & 16) == 0) {
            str11 = str3;
        }
        if ((i3 & 32) != 0) {
            i4 = -1;
        }
        String str12 = null;
        if ((i3 & 256) != 0) {
            str8 = null;
        }
        if ((i3 & 512) != 0) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        if ((i3 & 1024) != 0) {
            z2 = false;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            str12 = str6;
        }
        C01V1.LIZIZ(new C0QJZ(str10, i, searchSugEntity, str9, str11, i4, fragment, c19eg, str8, str7, z2, str12));
    }
}
