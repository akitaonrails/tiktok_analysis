package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F5F, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5F {
    public final C0F5K LIZ;
    public final C0F5L LIZIZ;
    public final C0F5E LIZJ;

    public final void LIZ(List<TextStickerData> list) {
        int i;
        C384570F5z c384570F5z = this.LIZIZ.LJJIJIIJIL;
        if (c384570F5z == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<TextStickerData> it2 = list.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            TextStickerData next = it2.next();
            String textStr = next.getTextStr();
            if (textStr != null && !a0.LJJJIL(textStr)) {
                arrayList.add(next);
            }
        }
        if (this.LIZ.LIZIZ()) {
            c384570F5z.setData(C363740ENw.LJIIJ(arrayList));
            return;
        }
        int i2 = this.LIZ.LJI.LJII;
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            if (((TextStickerData) ListProtector.get(arrayList, 0)).getStartTime() != 0) {
                arrayList2.add(new TextStickerData(null, 0, 0, 0, null, null, 0, ((TextStickerData) ListProtector.get(arrayList, 0)).getStartTime(), 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -193, -1, -1, 4095, null));
            }
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                if (i == arrayList.size() - 1) {
                    arrayList2.add(((TextStickerData) ListProtector.get(arrayList, i)).m187clone());
                    break;
                }
                arrayList2.add(((TextStickerData) ListProtector.get(arrayList, i)).m187clone());
                int endTime = ((TextStickerData) ListProtector.get(arrayList, i)).getEndTime();
                i++;
                arrayList2.add(new TextStickerData(null, 0, 0, 0, null, null, endTime, ((TextStickerData) ListProtector.get(arrayList, i)).getStartTime(), 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -193, -1, -1, 4095, null));
            }
            if (((TextStickerData) ListProtector.get(arrayList, arrayList.size() - 1)).getEndTime() != i2) {
                arrayList2.add(new TextStickerData(null, 0, 0, 0, null, null, ((TextStickerData) ListProtector.get(arrayList, arrayList.size() - 1)).getEndTime(), i2, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -193, -1, -1, 4095, null));
            }
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineCaptionFragment -> initSubtitleLayout: captionWithGapList.size = ");
        sbLIZ.append(arrayList2.size());
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        c384570F5z.setData(C363740ENw.LJIIJ(arrayList2));
    }

    public C0F5F(C0F5K c0f5k, C0F5L c0f5l, C0F5E c0f5e) {
        this.LIZ = c0f5k;
        this.LIZIZ = c0f5l;
        this.LIZJ = c0f5e;
    }
}
