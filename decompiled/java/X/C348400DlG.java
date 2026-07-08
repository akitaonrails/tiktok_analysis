package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0DlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348400DlG {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(NLEModel nLEModel) {
        int i;
        List<NLETrack> listLIZIZ = C348520DlS.LIZIZ(nLEModel);
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        int i2 = -1;
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                String extra = ((NLENode) it3.next()).getExtra("original_effect_order");
                if (extra != null && extra.length() != 0) {
                    i2 = CastIntegerProtector.parseInt(extra);
                } else {
                    i2 = -1;
                }
                while (it3.hasNext()) {
                    String extra2 = ((NLENode) it3.next()).getExtra("original_effect_order");
                    if (extra2 != null && extra2.length() != 0) {
                        i = CastIntegerProtector.parseInt(extra2);
                    } else {
                        i = -1;
                    }
                    if (i2 < i) {
                        i2 = i;
                    }
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        return i2;
    }
}
