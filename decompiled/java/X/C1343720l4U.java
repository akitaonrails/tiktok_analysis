package X;

import Y.AfS185S0100000_16;
import Y.AfS190S0100000_21;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.translation.MultiTranslationBody;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0l4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343720l4U {
    public static final C1343720l4U LIZ = new C1343720l4U();
    public static final Set<String> LJ = new HashSet();
    public static final Set<String> LIZIZ = new HashSet();
    public static final HashMap<String, Comment> LIZJ = new HashMap<>();
    public static final HashMap<String, Comment> LIZLLL = new HashMap<>();

    public static void LIZ(List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Comment comment = (Comment) it2.next();
                LIZ.getClass();
                LIZLLL(comment);
            }
            LIZLLL.clear();
            LIZJ.clear();
            ((HashSet) LIZIZ).clear();
        }
    }

    public static NextLiveData LIZIZ(String str) {
        if (str == null) {
            str = "";
        }
        ((HashSet) LJ).add(str);
        return C707370Rot.LIZ.LIZ(str);
    }

    public static Comment LIZJ(String str) {
        if (str == null) {
            return null;
        }
        return LIZJ.get(str);
    }

    public static void LIZLLL(Comment comment) {
        if (comment == null) {
            return;
        }
        List<Comment> listSingletonList = Collections.singletonList(comment);
        if (!listSingletonList.isEmpty()) {
            for (Comment comment2 : listSingletonList) {
                if (LIZJ(comment2.getCid()) == null) {
                    comment2.setTranslated(false);
                } else {
                    LJI(comment2, LIZLLL.get(comment2.getCid()), false);
                    LIZIZ(comment2.getCid()).setValue(new C1339660kxw(comment2, true, 0));
                }
            }
        }
    }

    public static void LJ(Comment comment, boolean z) {
        if (comment == null) {
            return;
        }
        if (z) {
            ((HashSet) LIZIZ).add(comment.getCid());
        } else {
            ((HashSet) LIZIZ).remove(comment.getCid());
        }
    }

    public static void LJFF(List list, C1339520kxi c1339520kxi, boolean z) {
        int i;
        String awemeId;
        List<TextExtraStruct> contentDescExtra;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Comment comment = (Comment) it2.next();
            Comment commentLIZJ = LIZJ(comment.getCid());
            if (commentLIZJ != null) {
                LJI(comment, commentLIZJ, true);
                LIZIZ(comment.getCid()).setValue(new C1339660kxw(comment, true, 0));
            } else if (!TextUtils.isEmpty(C0SWX.LIZ(comment)) && !TextUtils.equals(Comment.getAuthorUid(comment), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) && (comment.getAliasAweme() == null || z)) {
                LJ(comment, true);
                LIZLLL.put(comment.getCid(), comment.m169clone());
                LIZIZ(comment.getCid()).setValue(new C1339660kxw(comment, true, 1));
                arrayList.add(comment);
            }
        }
        if (c1339520kxi != null) {
            c1339520kxi.LJFF = System.currentTimeMillis();
        }
        C1341530l0x c1341530l0x = new C1341530l0x(arrayList, c1339520kxi);
        ArrayList arrayList2 = new ArrayList();
        List listSubList = arrayList;
        while (true) {
            int iMin = Math.min(listSubList.size(), 20);
            if (iMin <= 0) {
                break;
            }
            ArrayList<Comment> arrayList3 = new ArrayList();
            Iterator it3 = listSubList.subList(i, iMin).iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next());
            }
            String str = c1341530l0x.LIZJ;
            MultiTranslationBody multiTranslationBody = new MultiTranslationBody();
            multiTranslationBody.trgLang = str;
            for (Comment comment2 : arrayList3) {
                if (comment2 != null) {
                    if (comment2.getAliasAweme() != null) {
                        contentDescExtra = comment2.getAliasAweme().getContentDescExtra();
                    } else {
                        contentDescExtra = null;
                    }
                    List<MultiTranslationBody.TranslationContent> list2 = multiTranslationBody.translationInfos;
                    String strLIZ = C0SWX.LIZ(comment2);
                    String commentLanguage = comment2.getCommentLanguage();
                    String cid = comment2.getCid();
                    long diggCount = comment2.getDiggCount();
                    if (comment2.getCommentType() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    list2.add(new MultiTranslationBody.TranslationContent(multiTranslationBody, strLIZ, commentLanguage, cid, contentDescExtra, new MultiTranslationBody.ExtraCommentInfo(diggCount, z2)));
                }
            }
            String json = GsonProtectorUtils.toJson(new Gson(), multiTranslationBody.translationInfos);
            String str2 = c1341530l0x.LIZJ;
            Comment comment3 = (Comment) C13LP.LJJJLL(arrayList3);
            if (comment3 == null || (awemeId = comment3.getAwemeId()) == null) {
                awemeId = "";
            }
            arrayList2.add(((InterfaceC1346180l8S) C09S2.LIZJ(InterfaceC1346180l8S.class, C0CQT.LIZJ)).LIZ(str2, json, awemeId, 2).LJL(C11S5.LIZ()));
            if (iMin == listSubList.size()) {
                break;
            }
            i = 0;
            listSubList = listSubList.subList(iMin, listSubList.size());
        }
        ArrayList arrayList4 = new ArrayList();
        C11NZ.LJIIZILJ(arrayList2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS190S0100000_21(c1341530l0x, 30)).LJJZ(new AfS185S0100000_16(arrayList4, 51), new AfS190S0100000_21(c1341530l0x, 31), new C1402160mak(arrayList4, c1341530l0x, 1));
    }

    public static void LJI(Comment comment, Comment comment2, boolean z) {
        if (comment != null && comment2 != null) {
            comment.setTranslated(z);
            comment.setText(comment2.getText());
            comment.setTextExtra(comment2.getTextExtra());
            if (comment.getCommentType() == 0 && !C086I.LIZIZ(comment.getReplyComments()) && !C086I.LIZIZ(comment2.getReplyComments())) {
                LJI((Comment) ListProtector.get(comment.getReplyComments(), 0), (Comment) ListProtector.get(comment2.getReplyComments(), 0), z);
            }
        }
    }
}
