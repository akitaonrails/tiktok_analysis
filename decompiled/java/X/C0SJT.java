package X;

import Y.AComparatorS30S0000000_11;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0SJT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SJT {
    public static final C0SJT LIZ = new C0SJT();

    /* JADX WARN: Type inference failed for: r5v2, types: [METADATA, X.0SIg] */
    public static List LIZ(CharSequence charSequence, Iterable iterable) {
        int end;
        C0SJJ c0sjr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (true) {
            end = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C719000SIg c719000SIg = (C719000SIg) next;
            if (c719000SIg.LIZ() && c719000SIg.LIZ.getEnd() <= charSequence.length()) {
                arrayList2.add(next);
            }
        }
        for (?? r5 : C13LP.LJLLLL(new AComparatorS30S0000000_11(0), arrayList2)) {
            TextExtraStruct textExtraStruct = r5.LIZ;
            C0SJT c0sjt = LIZ;
            int start = textExtraStruct.getStart();
            c0sjt.getClass();
            if (end < start) {
                C0SJM c0sjm = new C0SJM(end, start, charSequence.subSequence(end, start));
                end = textExtraStruct.getStart();
                arrayList.add(c0sjm);
            }
            TextExtraStruct textExtraStruct2 = r5.LIZ;
            int type = textExtraStruct2.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type == 5) {
                        c0sjr = new C0SJS(textExtraStruct2.getStart(), textExtraStruct2.getEnd());
                        c0sjr.LLJ = charSequence.subSequence(textExtraStruct2.getStart(), textExtraStruct2.getEnd()).toString();
                        c0sjr.LLIZ = r5;
                    }
                } else {
                    c0sjr = new C0SJN(textExtraStruct2.getStart(), textExtraStruct2.getEnd());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(EnumC0327009l.HASHTAG.getValue());
                    sbLIZ.append(textExtraStruct2.getHashTagName());
                    c0sjr.LLJ = C2188811AlT.LIZIZ(sbLIZ);
                    c0sjr.LLIZ = r5;
                }
            } else {
                c0sjr = new C0SJR(textExtraStruct2.getStart(), textExtraStruct2.getEnd());
                c0sjr.LLJ = charSequence.subSequence(textExtraStruct2.getStart(), textExtraStruct2.getEnd()).toString();
                c0sjr.LLIZ = r5;
            }
            end = textExtraStruct.getEnd();
            arrayList.add(c0sjr);
        }
        int length = charSequence.length();
        if (end < length) {
            arrayList.add(new C0SJM(end, length, charSequence.subSequence(end, length)));
        }
        C719300SJk.LIZ("createTextComponents singleLineText -> " + ((Object) charSequence) + ", size -> " + arrayList.size());
        return arrayList;
    }
}
