package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.service.IMusicNameService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0oDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464900oDw {
    public static final C1464900oDw LIZ = new C1464900oDw();

    public static String LIZ(Context context, InterfaceC2257101DWa interfaceC2257101DWa) {
        String shortId;
        String string = context.getResources().getString(2131839040);
        String uniqueId = null;
        if (interfaceC2257101DWa != null) {
            shortId = interfaceC2257101DWa.getShortId();
            uniqueId = interfaceC2257101DWa.getUniqueId();
            interfaceC2257101DWa.getNickname();
        } else {
            shortId = null;
        }
        String string2 = context.getResources().getText(R.string.drg).toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(" - @");
        if (!TextUtils.isEmpty(uniqueId)) {
            shortId = uniqueId;
        }
        if (!TextUtils.isEmpty(shortId)) {
            string2 = shortId;
        }
        sbLIZ.append(string2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(InterfaceC2257101DWa interfaceC2257101DWa, Resources resources) {
        String nickname;
        if (interfaceC2257101DWa == null || (nickname = interfaceC2257101DWa.getNickname()) == null || nickname.length() == 0) {
            return resources.getText(R.string.drg).toString();
        }
        return nickname;
    }

    public static String LIZIZ(Context context, InterfaceC2257101DWa interfaceC2257101DWa, EditCapCutReuseModel.MusicInfo musicInfo, AVMusic aVMusic) {
        String shortId;
        String strLIZ;
        String title;
        String author;
        String title2;
        String uniqueId = null;
        if (C290810BaZ.LIZ() && aVMusic != null && !aVMusic.isLocalMusic()) {
            if (aVMusic.isPgc()) {
                return context.getResources().getString(2131837791, aVMusic.musicName, aVMusic.authorName);
            }
            if (!aVMusic.isPgc() && !aVMusic.isLocalMusic() && aVMusic.getMatchedPGCSoundInfo() != null) {
                MatchedPGCSoundInfo matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo();
                if (matchedPGCSoundInfo != null) {
                    title = matchedPGCSoundInfo.getTitle();
                } else {
                    title = null;
                }
                if (C1533950q1J.LJ(title)) {
                    MatchedPGCSoundInfo matchedPGCSoundInfo2 = aVMusic.getMatchedPGCSoundInfo();
                    if (matchedPGCSoundInfo2 != null) {
                        author = matchedPGCSoundInfo2.getAuthor();
                    } else {
                        author = null;
                    }
                    if (C1533950q1J.LJ(author)) {
                        Resources resources = context.getResources();
                        Object[] objArr = new Object[2];
                        MatchedPGCSoundInfo matchedPGCSoundInfo3 = aVMusic.getMatchedPGCSoundInfo();
                        if (matchedPGCSoundInfo3 != null) {
                            title2 = matchedPGCSoundInfo3.getTitle();
                        } else {
                            title2 = null;
                        }
                        objArr[0] = title2;
                        MatchedPGCSoundInfo matchedPGCSoundInfo4 = aVMusic.getMatchedPGCSoundInfo();
                        if (matchedPGCSoundInfo4 != null) {
                            uniqueId = matchedPGCSoundInfo4.getAuthor();
                        }
                        objArr[1] = uniqueId;
                        return resources.getString(2131837791, objArr);
                    }
                }
            }
            IMusicNameService iMusicNameService = (IMusicNameService) PluggableExtentionKt.pluggableSpi$default(IMusicNameService.class, false, false, false, 14, null);
            if (iMusicNameService != null && (strLIZ = iMusicNameService.LIZ(context, C10I1.LIZ(aVMusic))) != null) {
                return strLIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aVMusic.musicName);
            sbLIZ.append(" — @");
            sbLIZ.append(aVMusic.authorName);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (musicInfo != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(musicInfo.getMusicName());
            sbLIZ2.append(" — @");
            sbLIZ2.append(musicInfo.getAuthorName());
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (C290810BaZ.LIZ()) {
            String string = context.getResources().getString(2131839040);
            if (interfaceC2257101DWa != null) {
                shortId = interfaceC2257101DWa.getShortId();
                uniqueId = interfaceC2257101DWa.getUniqueId();
                interfaceC2257101DWa.getNickname();
            } else {
                shortId = null;
            }
            String string2 = context.getResources().getText(R.string.drg).toString();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            if (!TextUtils.isEmpty(uniqueId)) {
                shortId = uniqueId;
            }
            if (!TextUtils.isEmpty(shortId)) {
                string2 = shortId;
            }
            sbLIZ3.append(string2);
            sbLIZ3.append(" - ");
            sbLIZ3.append(string);
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return LIZ(context, interfaceC2257101DWa);
    }
}
