package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0EVG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EVG {
    public static final ArrayList LIZ(int i, List list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        int i2 = 0;
        if (((int) ((CaptionUtterance) ListProtector.get(list, 0)).LIZJ()) != 0) {
            if (((CaptionUtterance) ListProtector.get(list, 0)).utterance != null) {
                arrayList.add(new CaptionUtterance(new Utterance(0L, ((CaptionUtterance) ListProtector.get(list, 0)).LIZJ(), "", "#00000000", "#00FFFFF", 0.0f, 0.0f, 22, 0, "", false), (TextStickerData) null));
            }
            if (((CaptionUtterance) ListProtector.get(list, 0)).inlineUtterance != null) {
                arrayList.add(new CaptionUtterance((Utterance) null, new TextStickerData(null, 0, 0, 0, null, null, 0, (int) ((CaptionUtterance) ListProtector.get(list, 0)).LIZJ(), 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -193, -1, -1, 4095, null)));
            }
        }
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (i2 == list.size() - 1) {
                arrayList.add(new CaptionUtterance((CaptionUtterance) ListProtector.get(list, i2)));
                break;
            }
            arrayList.add(new CaptionUtterance((CaptionUtterance) ListProtector.get(list, i2)));
            if (((CaptionUtterance) ListProtector.get(list, i2)).utterance != null) {
                arrayList.add(new CaptionUtterance(new Utterance(((CaptionUtterance) ListProtector.get(list, i2)).LIZ(), ((CaptionUtterance) ListProtector.get(list, i2 + 1)).LIZJ(), "", "#00000000", "#00FFFFF", 0.0f, 0.0f, 22, 0, "", false), 2));
            }
            if (((CaptionUtterance) ListProtector.get(list, i2)).inlineUtterance != null) {
                arrayList.add(new CaptionUtterance(new TextStickerData(null, 0, 0, 0, null, null, (int) ((CaptionUtterance) ListProtector.get(list, i2)).LIZ(), (int) ((CaptionUtterance) ListProtector.get(list, i2 + 1)).LIZJ(), 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -193, -1, -1, 4095, null)));
            }
            i2++;
        }
        if (((int) ((CaptionUtterance) ListProtector.get(list, list.size() - 1)).LIZ()) != i) {
            if (((CaptionUtterance) ListProtector.get(list, list.size() - 1)).utterance != null) {
                arrayList.add(new CaptionUtterance(new Utterance(((CaptionUtterance) ListProtector.get(list, list.size() - 1)).LIZ(), i, "", "#00000000", "#00FFFFF", 0.0f, 0.0f, 22, 0, "", false), 2));
            }
            if (((CaptionUtterance) ListProtector.get(list, list.size() - 1)).inlineUtterance != null) {
                arrayList.add(new CaptionUtterance(new TextStickerData(null, 0, 0, 0, null, null, (int) ((CaptionUtterance) ListProtector.get(list, list.size() - 1)).LIZ(), i, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -193, -1, -1, 4095, null)));
            }
        }
        return arrayList;
    }
}
