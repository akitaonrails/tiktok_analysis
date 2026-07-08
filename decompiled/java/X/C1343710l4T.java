package X;

import Y.AfS185S0100000_16;
import Y.AfS190S0100000_21;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.translation.MultiTranslationBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0l4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343710l4T {
    public static final C1343710l4T LIZ = new C1343710l4T();
    public static final Set<String> LIZIZ = new HashSet();
    public static final HashMap<String, Comment> LIZJ = new HashMap<>();
    public static final HashMap<String, Comment> LIZLLL = new HashMap<>();
    public static final HashMap<String, Comment> LJ = new HashMap<>();
    public static final Set<String> LJFF = new HashSet();

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
            LJ.clear();
            ((HashSet) LIZIZ).clear();
        }
    }

    public static NextLiveData LIZIZ(String str) {
        if (str == null) {
            str = "";
        }
        ((HashSet) LJFF).add(str);
        return C707370Rot.LIZ.LIZ(str);
    }

    public static boolean LIZJ(Comment comment) {
        return ((HashSet) LIZIZ).contains(comment.getCid());
    }

    public static void LIZLLL(Comment comment) {
        Comment commentRemove;
        if (comment == null) {
            return;
        }
        List<Comment> listSingletonList = Collections.singletonList(comment);
        if (!listSingletonList.isEmpty()) {
            for (Comment comment2 : listSingletonList) {
                if (C0BJF.LIZ()) {
                    LJ(comment2, false);
                }
                String cid = comment2.getCid();
                if (cid != null && LIZJ.get(cid) != null) {
                    LJI(comment2, LIZLLL.get(comment2.getCid()), false);
                    if (C0BJF.LIZ() && (commentRemove = LIZJ.remove(comment2.getCid())) != null) {
                        LJ.put(comment2.getCid(), commentRemove);
                    }
                    LIZIZ(comment2.getCid()).setValue(new C1339660kxw(comment2, true, 0));
                } else {
                    comment2.setAudioTextIsTranslated(false);
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

    public static void LJFF(List list, C1339520kxi c1339520kxi) {
        int i;
        String awemeId;
        boolean z;
        Comment commentRemove;
        Comment comment;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Comment comment2 = (Comment) it2.next();
            String cid = comment2.getCid();
            String asrText = null;
            if (cid != null && (comment = LIZJ.get(cid)) != null) {
                LJI(comment2, comment, true);
                LIZIZ(comment2.getCid()).setValue(new C1339660kxw(comment2, true, 0));
            } else if (C0BJF.LIZ() && (commentRemove = LJ.remove(comment2.getCid())) != null) {
                LIZJ.put(comment2.getCid(), commentRemove);
                LJI(comment2, commentRemove, true);
                LIZIZ(comment2.getCid()).setValue(new C1339660kxw(comment2, true, 0));
            } else {
                CmtAudioStruct audioStruct = comment2.getAudioStruct();
                if (audioStruct != null) {
                    asrText = audioStruct.getAsrText();
                }
                if (!TextUtils.isEmpty(asrText) && !TextUtils.equals(Comment.getAuthorUid(comment2), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) && comment2.getAliasAweme() == null) {
                    LJ(comment2, true);
                    LIZLLL.put(comment2.getCid(), comment2.m169clone());
                    LIZIZ(comment2.getCid()).setValue(new C1339660kxw(comment2, true, 1));
                    arrayList.add(comment2);
                }
            }
        }
        if (c1339520kxi != null) {
            c1339520kxi.LJFF = System.currentTimeMillis();
        }
        C1341520l0w c1341520l0w = new C1341520l0w(arrayList, c1339520kxi);
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
            String str = c1341520l0w.LIZJ;
            MultiTranslationBody multiTranslationBody = new MultiTranslationBody();
            multiTranslationBody.trgLang = str;
            for (Comment comment3 : arrayList3) {
                if (comment3 != null && comment3.getAudioStruct() != null) {
                    List<MultiTranslationBody.TranslationContent> list2 = multiTranslationBody.translationInfos;
                    String asrText2 = comment3.getAudioStruct().getAsrText();
                    String asrLang = comment3.getAudioStruct().getAsrLang();
                    String cid2 = comment3.getCid();
                    long diggCount = comment3.getDiggCount();
                    if (comment3.getCommentType() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list2.add(new MultiTranslationBody.TranslationContent(multiTranslationBody, asrText2, asrLang, cid2, null, new MultiTranslationBody.ExtraCommentInfo(diggCount, z)));
                }
            }
            String json = GsonProtectorUtils.toJson(new Gson(), multiTranslationBody.translationInfos);
            String str2 = c1341520l0w.LIZJ;
            Comment comment4 = (Comment) C13LP.LJJJLL(arrayList3);
            if (comment4 == null || (awemeId = comment4.getAwemeId()) == null) {
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
        C11NZ.LJIIZILJ(arrayList2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS190S0100000_21(c1341520l0w, 28)).LJJZ(new AfS185S0100000_16(arrayList4, 50), new AfS190S0100000_21(c1341520l0w, 29), new C1402160mak(arrayList4, c1341520l0w, 0));
    }

    public static void LJI(Comment comment, Comment comment2, boolean z) {
        String asrText;
        if (comment != null && comment2 != null) {
            comment.setAudioTextIsTranslated(z);
            CmtAudioStruct audioStruct = comment.getAudioStruct();
            if (audioStruct != null) {
                CmtAudioStruct audioStruct2 = comment2.getAudioStruct();
                if (audioStruct2 != null) {
                    asrText = audioStruct2.getAsrText();
                } else {
                    asrText = null;
                }
                audioStruct.setAsrText(asrText);
            }
            if (comment.getCommentType() == 0 && !C086I.LIZIZ(comment.getReplyComments()) && !C086I.LIZIZ(comment2.getReplyComments())) {
                LJI((Comment) ListProtector.get(comment.getReplyComments(), 0), (Comment) ListProtector.get(comment2.getReplyComments(), 0), z);
            }
        }
    }
}
