package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348430DlJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLETrackSlot nLETrackSlot, String str) {
        String str2;
        String extra = nLETrackSlot.getExtra(str);
        if (C123100dR.LIZ(extra)) {
            ArrayList arrayList = new ArrayList();
            if (a0.LJJIIZI(extra, ",", false)) {
                List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(extra, new String[]{","}, 0, 6);
                if (listLJJLIIIJILLIZJL != null) {
                    for (String str3 : listLJJLIIIJILLIZJL) {
                        if (C123100dR.LIZ(str3)) {
                            arrayList.add(str3);
                        }
                    }
                }
            } else {
                arrayList.add(extra);
            }
            if (!arrayList.isEmpty()) {
                str2 = (String) C13LP.LJJLIIIJJI(arrayList);
            } else {
                str2 = "";
            }
            if (C123100dR.LIZ(str2)) {
                nLETrackSlot.setExtra(str, str2);
                return;
            } else {
                nLETrackSlot.removeExtraWithKey(str);
                return;
            }
        }
        nLETrackSlot.removeExtraWithKey(str);
    }
}
