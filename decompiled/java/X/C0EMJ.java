package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0EMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EMJ {
    public static C0EY9 LIZ(NLEModel nLEModel) {
        String extra;
        String strLJIIJ = C361680EFy.LJIIJ(nLEModel);
        String strLJIIJJI = C361680EFy.LJIIJJI(nLEModel);
        List<NLESegmentComposerFilter> listLJIIL = C351220Dpo.LJIIL(nLEModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIL, 10));
        for (NLENode nLENode : (ArrayList) listLJIIL) {
            if (nLENode.hasExtra("filter_category")) {
                extra = nLENode.getExtra("filter_category");
            } else {
                extra = "";
            }
            arrayList.add(extra);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append((String) obj);
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new C0EY9(strLJIIJ, strLJIIJJI, sb.toString());
    }
}
