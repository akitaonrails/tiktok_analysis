package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C118800ck {
    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MediaModel mediaModel = (MediaModel) it2.next();
            C118900cl c118900cl = new C118900cl(mediaModel);
            c118900cl.LJ = LIZIZ(mediaModel.albumClass);
            arrayList.add(c118900cl);
        }
        return arrayList;
    }

    public static String LIZIZ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            return string;
        }
        return null;
    }
}
