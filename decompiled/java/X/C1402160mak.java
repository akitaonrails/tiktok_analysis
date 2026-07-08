package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402160mak implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public static final void run$0(C1402160mak c1402160mak) {
        Comment next;
        CmtAudioStruct audioStruct;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCommentTranslationTask startTranslate onComplete ");
        sbLIZ.append(((List) c1402160mak.l0).size());
        sbLIZ.append('}');
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (C866950Xzh.LIZIZ((List) c1402160mak.l0)) {
            List<TranslationResult> list = (List) c1402160mak.l0;
            C1341520l0w c1341520l0w = (C1341520l0w) c1402160mak.l1;
            for (TranslationResult translationResult : list) {
                Iterator<? extends Comment> it2 = c1341520l0w.LIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getCid(), translationResult.contentId)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Comment comment = next;
                if (comment != null) {
                    if (C0BJF.LIZ()) {
                        C1343710l4T.LIZ.getClass();
                        if (!C1343710l4T.LIZJ(comment)) {
                        }
                    }
                    String str = translationResult.translatedContent;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = translationResult.variant;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    C0SWX.LIZ.getClass();
                    if (C123100dR.LIZ(str) && (audioStruct = comment.getAudioStruct()) != null) {
                        audioStruct.setAsrText(str);
                    }
                    comment.setTranslateVariant(str2);
                    comment.setAudioTextIsTranslated(true);
                    C1343710l4T.LIZ.getClass();
                    C1343710l4T.LJ(comment, false);
                    Comment commentM169clone = comment.m169clone();
                    HashMap<String, Comment> map = C1343710l4T.LIZJ;
                    map.put(comment.getCid(), commentM169clone);
                    C1343710l4T.LJ.remove(comment.getCid());
                    if (comment.getCommentType() == 0 && !C086I.LIZIZ(commentM169clone.getReplyComments())) {
                        Comment comment2 = (Comment) ListProtector.get(commentM169clone.getReplyComments(), 0);
                        map.put(comment2.getCid(), comment2);
                    }
                    C1343710l4T.LIZIZ(comment.getCid()).setValue(new C1339660kxw(comment, true));
                }
            }
        }
        C1350920lG6.LLIL(true, ((C1341520l0w) c1402160mak.l1).LIZIZ);
    }

    public static final void run$1(C1402160mak c1402160mak) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCommentTranslationTask startTranslate onComplete ");
        sbLIZ.append(((List) c1402160mak.l0).size());
        sbLIZ.append('}');
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (((List) c1402160mak.l0).size() == ((C1341530l0x) c1402160mak.l1).LIZ.size()) {
            List<? extends Comment> list = ((C1341530l0x) c1402160mak.l1).LIZ;
            List list2 = (List) c1402160mak.l0;
            int i = 0;
            for (Comment comment : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    Comment comment2 = comment;
                    String str = ((TranslationResult) ListProtector.get(list2, i)).translatedContent;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = ((TranslationResult) ListProtector.get(list2, i)).variant;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(' ');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    sb.append(strLIZIZ);
                    if (comment2.getTextExtra() != null) {
                        int size = comment2.getTextExtra().size();
                        for (int i3 = 0; i3 < size; i3++) {
                            TextExtraStruct textExtraStruct = (TextExtraStruct) ListProtector.get(comment2.getTextExtra(), i3);
                            if (textExtraStruct.getType() != 6) {
                                int start = textExtraStruct.getStart();
                                if (start < 0) {
                                    start = 0;
                                }
                                int length = C1342220l24.LIZLLL(comment2).length();
                                if (start > length) {
                                    start = length;
                                }
                                int end = textExtraStruct.getEnd();
                                int length2 = C1342220l24.LIZLLL(comment2).length();
                                if (end > length2) {
                                    end = length2;
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(C1342220l24.LIZLLL(comment2).substring(start, end));
                                sbLIZ3.append(' ');
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                                sb.append(strLIZIZ2);
                                TextExtraStruct textExtraStructM271clone = textExtraStruct.m271clone();
                                int length3 = strLIZIZ2.length();
                                if (i3 == 0) {
                                    textExtraStructM271clone.setStart(strLIZIZ.length());
                                } else {
                                    textExtraStructM271clone.setStart(((TextExtraStruct) ListProtector.get(arrayList, i3 - 1)).getEnd() + 1);
                                }
                                textExtraStructM271clone.setEnd((textExtraStructM271clone.getStart() + length3) - 1);
                                arrayList.add(textExtraStructM271clone);
                            }
                        }
                    }
                    Pair pair = new Pair(a0.LJLIIIL(sb.toString()).toString(), arrayList);
                    String str4 = (String) pair.getFirst();
                    List<TextExtraStruct> list3 = (List) pair.getSecond();
                    C0SWX.LIZ.getClass();
                    if (C123100dR.LIZ(str4)) {
                        comment2.setText(str4);
                        comment2.setTextExtra(list3);
                    }
                    comment2.setTranslateVariant(str2);
                    comment2.setTranslated(true);
                    C1343720l4U.LIZ.getClass();
                    C1343720l4U.LJ(comment2, false);
                    Comment commentM169clone = comment2.m169clone();
                    HashMap<String, Comment> map = C1343720l4U.LIZJ;
                    map.put(comment2.getCid(), commentM169clone);
                    if (comment2.getCommentType() == 0 && !C086I.LIZIZ(commentM169clone.getReplyComments())) {
                        Comment comment3 = (Comment) ListProtector.get(commentM169clone.getReplyComments(), 0);
                        map.put(comment3.getCid(), comment3);
                    }
                    C1343720l4U.LIZIZ(comment2.getCid()).setValue(new C1339660kxw(comment2, true));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C1350920lG6.LLIL(true, ((C1341530l0x) c1402160mak.l1).LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1402160mak(Object obj, List<TranslationResult> list, C1341520l0w c1341520l0w) {
        this.$t = c1341520l0w;
        this.l0 = obj;
        this.l1 = list;
    }
}
