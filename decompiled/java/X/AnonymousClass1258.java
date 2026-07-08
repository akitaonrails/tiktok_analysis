package X;

import android.graphics.Paint;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1258, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1258 {
    public static int LIZ;

    public static final String LIZ(List<TextStickerTextWrap> list) {
        boolean z;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (TextStickerTextWrap textStickerTextWrap : list) {
            if (textStickerTextWrap.isValid()) {
                arrayList.add(textStickerTextWrap);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        if (arrayList.size() > 1) {
            int size = arrayList.size() - 2;
            if (size >= 0) {
                while (true) {
                    sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, i)).safeStrPair().first);
                    sb.append("\n");
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, arrayList.size() - 1)).safeStrPair().first);
        } else {
            sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, 0)).safeStrPair().first);
        }
        return sb.toString();
    }

    public static final String LIZIZ(List<TextStickerTextWrap> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        Iterator<TextStickerTextWrap> it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().getText());
        }
        return sb.toString();
    }

    public static final boolean LJ(List<TextStickerTextWrap> list) {
        if (list == null) {
            return false;
        }
        Iterator<TextStickerTextWrap> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TextStickerTextWrap next = it2.next();
            if (next.isValid()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LIZLLL(int i, List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((InteractTextStructWrap) next).isValid(i)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int LIZJ(Paint paint, String str, int i, int i2) {
        if (str == null || str.length() == 0 || i < 0 || i2 > str.length() || i >= i2) {
            return 0;
        }
        String strSubstring = str.substring(i, i2);
        int length = strSubstring.length();
        paint.getTextWidths(strSubstring, new float[length]);
        int iCeil = 0;
        for (int i3 = 0; i3 < length; i3++) {
            iCeil += (int) Math.ceil(r4[i3]);
        }
        return iCeil;
    }
}
