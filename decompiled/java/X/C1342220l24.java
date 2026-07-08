package X;

import Y.AComparatorS25S0000000_6;
import Y.AComparatorS30S0000000_11;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l24, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342220l24 {
    public static final String LIZLLL(Comment comment) {
        String str = "";
        if (TextUtils.isEmpty(comment.getForwardId())) {
            String text = comment.getText();
            if (text == null) {
                return "";
            }
            return text;
        }
        C844470XAv.LIZ.getClass();
        String string = C844470XAv.LIZ().getString(2131834870);
        String text2 = comment.getText();
        if (text2 != null && text2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(" • ");
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(string);
        String text3 = comment.getText();
        if (text3 != null) {
            str = text3;
        }
        sbLIZ2.append(str);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final String LJFF(Comment comment) {
        if (C1339690kxz.LIZ().LIZ) {
            if (TextUtils.isEmpty(comment.getTimeFormat())) {
                Context contextLJFF = C2214201BlK.LJFF();
                if (contextLJFF == null) {
                    C844470XAv.LIZ.getClass();
                    contextLJFF = C844470XAv.LIZ();
                }
                comment.setTimeFormat(C1356610lPH.LIZJ(((long) comment.getCreateTime()) * 1000, contextLJFF));
            }
            return comment.getTimeFormat();
        }
        Context contextLJFF2 = C2214201BlK.LJFF();
        if (contextLJFF2 == null) {
            C844470XAv.LIZ.getClass();
            contextLJFF2 = C844470XAv.LIZ();
        }
        return C1356610lPH.LIZJ(((long) comment.getCreateTime()) * 1000, contextLJFF2);
    }

    public static final String LIZIZ(User user, String str) {
        String strLIZIZ;
        if (user == null) {
            return "";
        }
        C1243240iSQ.LIZ.getClass();
        if (C343230Dcv.LIZ() && (strLIZIZ = C1247000iYU.LIZIZ(user)) != null) {
            return strLIZIZ;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final List LIZ(Comment comment, String str, List list, Context context) {
        ArrayList<TextExtraStruct> arrayList;
        if (list == null && (list = comment.getTextExtra()) == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((TextExtraStruct) it2.next()).m271clone());
            }
        }
        if (str == null) {
            str = comment.getText();
        }
        int i = 0;
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String string = context.getString(2131834870);
            if (str != null && str.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append(" • ");
                string = C2188811AlT.LIZIZ(sbLIZ);
            }
            int length = string.length();
            for (TextExtraStruct textExtraStruct : arrayList) {
                textExtraStruct.setStart(textExtraStruct.getStart() + length);
                textExtraStruct.setEnd(textExtraStruct.getEnd() + length);
                textExtraStruct.setUserId(textExtraStruct.getUserId());
            }
        }
        if (C0CPF.LIZ()) {
            int i2 = 0;
            for (TextExtraStruct textExtraStruct2 : C13LP.LJLLLL(new AComparatorS25S0000000_6(3), C13LP.LLIIII(arrayList))) {
                if (textExtraStruct2.getType() == 6) {
                    int start = textExtraStruct2.getStart();
                    int iCodePointCount = str.codePointCount(0, str.length());
                    if (start > iCodePointCount) {
                        start = iCodePointCount;
                    }
                    textExtraStruct2.setStart(str.offsetByCodePoints(0, start) + i2);
                    int end = textExtraStruct2.getEnd();
                    int iCodePointCount2 = str.codePointCount(0, str.length());
                    if (end > iCodePointCount2) {
                        end = iCodePointCount2;
                    }
                    textExtraStruct2.setEnd(str.offsetByCodePoints(0, end) + i2);
                    textExtraStruct2.setBoldText(true);
                } else {
                    textExtraStruct2.setStart(textExtraStruct2.getStart() + i2);
                    textExtraStruct2.setEnd(textExtraStruct2.getEnd() + i2);
                }
                if (textExtraStruct2.getType() == 6) {
                    i2++;
                }
            }
        }
        if (comment.getCommentType() == 1 && comment.isAuthorPin()) {
            for (Object obj : arrayList) {
                int i3 = i + 1;
                if (i >= 0) {
                    TextExtraStruct textExtraStruct3 = (TextExtraStruct) obj;
                    if (i != 0) {
                        textExtraStruct3.setStart(textExtraStruct3.getStart() + 1);
                        textExtraStruct3.setEnd(textExtraStruct3.getEnd() + 1);
                    }
                    i = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }

    public static final String LIZJ(Comment comment, String str, List<? extends TextExtraStruct> list, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        if (C0CPF.LIZ() && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (TextExtraStruct textExtraStruct : list) {
                if (textExtraStruct.getType() == 6) {
                    arrayList.add(textExtraStruct);
                }
            }
            Iterator it2 = C13LP.LJLLLL(new AComparatorS30S0000000_11(3), arrayList).iterator();
            int i = 0;
            while (it2.hasNext()) {
                int end = ((TextExtraStruct) it2.next()).getEnd() + i;
                int iCodePointCount = sb.codePointCount(0, sb.length());
                if (end > iCodePointCount) {
                    end = iCodePointCount;
                }
                sb.insert(sb.offsetByCodePoints(0, end), "\u200b");
                i++;
            }
        }
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            C844470XAv.LIZ.getClass();
            String string = C844470XAv.LIZ().getString(2131834870);
            if (str.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append(" • ");
                string = C2188811AlT.LIZIZ(sbLIZ);
            }
            sb.insert(0, string);
        }
        if (comment.getCommentType() == 1 && comment.isAuthorPin()) {
            sb.insert(0, "\u200b");
        }
        if (z) {
            sb.append(" ");
            sb.append(LJFF(comment));
        }
        return sb.toString();
    }

    public static final String LJ(User user, String str, boolean z, boolean z2) {
        boolean z3;
        if (user == null) {
            return "";
        }
        if (!Intrinsics.LJFF(str, "homepage_friends") && !Intrinsics.LJFF(str, "repost_feed")) {
            z3 = false;
        } else {
            z3 = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMainNameInComment isSocial->");
        sbLIZ.append(z3);
        sbLIZ.append(" regionDiff->");
        sbLIZ.append(z);
        sbLIZ.append(" eventType->");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null) {
            str.length();
        }
        C1243240iSQ.LIZ.getClass();
        return C1243240iSQ.LIZ(user, z2);
    }

    public static final CharSequence LJI(Comment comment, String str, List list, boolean z, Context context) {
        return LIZJ(comment, str, list, !z);
    }
}
