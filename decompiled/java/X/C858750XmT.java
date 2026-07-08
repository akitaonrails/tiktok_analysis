package X;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.common.MentionVideoItem;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0XmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858750XmT {
    public static final C858750XmT LIZ = new C858750XmT();

    public static Integer LIZIZ(String str, String str2) {
        boolean z;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int length = str.length();
        int length2 = str2.length();
        int iLIZJ = LIZJ(0, str);
        int iLIZJ2 = LIZJ(0, str2);
        while (iLIZJ2 < length2) {
            char cCharAt = str2.charAt(iLIZJ2);
            if (C1244080iTm.LJ(cCharAt)) {
                iLIZJ2 = LIZJ(iLIZJ2, str2);
                if (iLIZJ2 >= length2) {
                    break;
                }
                iLIZJ = LIZJ(iLIZJ, str);
                if (iLIZJ >= length) {
                    return null;
                }
            } else {
                int iLIZJ3 = LIZJ(iLIZJ, str);
                if (iLIZJ3 >= length || str.charAt(iLIZJ3) != cCharAt) {
                    return null;
                }
                iLIZJ = iLIZJ3 + 1;
                iLIZJ2++;
            }
        }
        return Integer.valueOf(iLIZJ);
    }

    public static final int LIZJ(int i, String str) {
        while (i < str.length() && C1244080iTm.LJ(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, C857730Xkp c857730Xkp) {
        c857730Xkp.LJIIJ(videoPublishEditModel);
        String chain = videoPublishEditModel.getChain();
        if (chain != null && chain.length() != 0) {
            CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
            captionModel.chain = chain;
            captionModel.disableDeleteChain = videoPublishEditModel.getDisableDeleteChain();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C856850XjP c856850XjP, C0ZI0 c0zi0, List<InputBlock> list, boolean z) {
        String string;
        MentionVideoItem mentionVideoItem;
        String str;
        Editable editableQ;
        String strSubstring;
        MentionDataItem mentionDataItem;
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator<InputBlock> it2 = list.iterator();
        while (true) {
            String str3 = "";
            if (it2.hasNext()) {
                InputBlock next = it2.next();
                String str4 = next.type;
                if (str4 != null) {
                    switch (str4.hashCode()) {
                        case -2133197338:
                            if (str4.equals("mention_video") && (mentionVideoItem = next.mentionVideo) != null && mentionVideoItem.LIZ()) {
                                String str5 = mentionVideoItem.uniqueId;
                                if (str5 != null) {
                                    str3 = str5;
                                }
                                if (c856850XjP.LIZIZ.LJIILIIL(new C0ZIK(str3, mentionVideoItem.nickname, mentionVideoItem.userId, mentionVideoItem.secUid, mentionVideoItem.awemeId, 0, 0, 6, null), null)) {
                                    sb.append(e3.g);
                                    sb.append(mentionVideoItem.nickname);
                                    sb.append(" ");
                                }
                            }
                            break;
                        case 3556653:
                            if (str4.equals("text") && (str = next.content) != null && str.length() != 0) {
                                if (z) {
                                    c0zi0.getClass();
                                    if (!TextUtils.isEmpty(str) && (editableQ = C2204961BRm.q(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null))) != null) {
                                        SpannableString spannableString = new SpannableString(str);
                                        MentionSpan mentionSpan = new MentionSpan(str, c0zi0.LLIZLLLIL, 0L, "", "", 6553, "");
                                        mentionSpan.LIZ(18);
                                        C786410Ut5.p2(spannableString, mentionSpan, 0, spannableString.length(), 33);
                                        editableQ.append((CharSequence) spannableString);
                                    }
                                } else {
                                    c0zi0.append(str);
                                }
                                sb.append(str);
                            }
                            break;
                        case 697547724:
                            if (str4.equals("hashtag") && (strSubstring = next.content) != null) {
                                String strLJJJJZ = a0.LJJJJZ("#", strSubstring);
                                if (strLJJJJZ.length() != 0) {
                                    c856850XjP.getClass();
                                    if (strSubstring.startsWith("#")) {
                                        strSubstring = strSubstring.substring(1);
                                    }
                                    if (!TextUtils.isEmpty(strSubstring) && c856850XjP.LIZIZ.LJIIIIZZ(1, strSubstring, "", "", true, true)) {
                                        sb.append("#");
                                        sb.append(strLJJJJZ);
                                        sb.append(" ");
                                    }
                                }
                            }
                            break;
                        case 950345194:
                            if (str4.equals("mention") && (mentionDataItem = next.userItem) != null && mentionDataItem.uid != null && (str2 = mentionDataItem.name) != null) {
                                String str6 = mentionDataItem.uid;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                if (c856850XjP.LIZIZ.LJIIIZ(str2, str6, "", true)) {
                                    sb.append(e3.g);
                                    sb.append(mentionDataItem.name);
                                    sb.append(" ");
                                }
                            }
                            break;
                    }
                }
            } else {
                if (sb.length() == 0) {
                    return;
                }
                String string2 = sb.toString();
                Editable editableP = C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhjNfHhYUOAbTZ/pi+a9z4IDgoNjShU6v/1mLv7ZTJHssIDwUY", null));
                if (editableP != null && (string = editableP.toString()) != null) {
                    str3 = string;
                }
                if (!u.LJJIIJZLJL(str3, string2, false)) {
                    if (str3.length() > 0) {
                        string2 = str3;
                    } else {
                        return;
                    }
                }
                if (!z) {
                    return;
                }
                int length = sb.length();
                c0zi0.getClass();
                Editable editableQ2 = C2204961BRm.q(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null));
                if (editableQ2 != null && length > 0) {
                    MentionSpan[] mentionSpanArrLJIJ = c0zi0.LJIJ(editableQ2);
                    if (mentionSpanArrLJIJ != null) {
                        for (MentionSpan mentionSpan2 : mentionSpanArrLJIJ) {
                            if (mentionSpan2 != null) {
                                int spanStart = editableQ2.getSpanStart(mentionSpan2);
                                int spanEnd = editableQ2.getSpanEnd(mentionSpan2);
                                if (spanStart >= 0 && spanEnd > spanStart && spanEnd <= length) {
                                    mentionSpan2.LIZ(18);
                                }
                            }
                        }
                    }
                    c0zi0.LJJIL(length);
                }
                c856850XjP.LIZJ(videoPublishEditModel, string2);
                return;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void LJ(VideoPublishEditModel videoPublishEditModel, C856850XjP c856850XjP, C0ZI0 c0zi0, C857730Xkp c857730Xkp, List<InputBlock> list, boolean z) {
        Integer numLIZIZ;
        int iIntValue;
        MentionVideoItem mentionVideoItem;
        String str;
        String str2;
        MentionDataItem mentionDataItem;
        String chain;
        if (!z) {
            return;
        }
        String noAdTagText = c0zi0.getNoAdTagText();
        if (noAdTagText == null) {
            noAdTagText = "";
        }
        if (noAdTagText.length() == 0) {
            return;
        }
        CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
        String chain2 = captionModel.chain;
        if ((chain2 == null || chain2.length() <= 0) && ((chain2 = videoPublishEditModel.getChain()) == null || chain2.length() == 0)) {
            chain2 = null;
        }
        if ((captionModel.disableDeleteChain || ((chain = videoPublishEditModel.getChain()) != null && chain.length() > 0 && videoPublishEditModel.getDisableDeleteChain())) && chain2 != null && chain2.length() != 0) {
            if (u.LJJIIJZLJL(noAdTagText, chain2, false)) {
                numLIZIZ = Integer.valueOf(chain2.length());
            } else {
                LIZ.getClass();
                numLIZIZ = LIZIZ(noAdTagText, chain2);
            }
            if (numLIZIZ != null && numLIZIZ.intValue() > 0) {
                c856850XjP.LIZJ(videoPublishEditModel, noAdTagText.substring(0, numLIZIZ.intValue()));
                LIZLLL(videoPublishEditModel, c857730Xkp);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (InputBlock inputBlock : list) {
            String str3 = inputBlock.type;
            if (str3 != null) {
                switch (str3.hashCode()) {
                    case -2133197338:
                        if (str3.equals("mention_video") && (mentionVideoItem = inputBlock.mentionVideo) != null && mentionVideoItem.LIZ()) {
                            sb.append(e3.g);
                            sb.append(mentionVideoItem.nickname);
                            sb.append(" ");
                        }
                        break;
                    case 3556653:
                        if (str3.equals("text") && (str = inputBlock.content) != null && str.length() != 0) {
                            sb.append(str);
                        }
                        break;
                    case 697547724:
                        if (str3.equals("hashtag") && (str2 = inputBlock.content) != null) {
                            String strLJJJJZ = a0.LJJJJZ("#", str2);
                            if (strLJJJJZ.length() != 0) {
                                sb.append("#");
                                sb.append(strLJJJJZ);
                                sb.append(" ");
                            }
                        }
                        break;
                    case 950345194:
                        if (str3.equals("mention") && (mentionDataItem = inputBlock.userItem) != null && mentionDataItem.uid != null && mentionDataItem.name != null) {
                            sb.append(e3.g);
                            sb.append(mentionDataItem.name);
                            sb.append(" ");
                        }
                        break;
                }
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return;
        }
        if (u.LJJIIJZLJL(noAdTagText, string, false)) {
            iIntValue = string.length();
        } else {
            LIZ.getClass();
            Integer numLIZIZ2 = LIZIZ(noAdTagText, string);
            if (numLIZIZ2 == null) {
                return;
            } else {
                iIntValue = numLIZIZ2.intValue();
            }
        }
        c856850XjP.LIZJ(videoPublishEditModel, noAdTagText.substring(0, iIntValue));
        LIZLLL(videoPublishEditModel, c857730Xkp);
    }
}
