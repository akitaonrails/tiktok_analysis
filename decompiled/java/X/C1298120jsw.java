package X;

import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import java.util.Comparator;

/* JADX INFO: renamed from: X.0jsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1298120jsw implements Comparator<SDUIBaseUI> {
    @Override // java.util.Comparator
    public final int compare(SDUIBaseUI sDUIBaseUI, SDUIBaseUI sDUIBaseUI2) {
        SDUIBaseUI sDUIBaseUI3 = sDUIBaseUI;
        SDUIBaseUI sDUIBaseUI4 = sDUIBaseUI2;
        if (sDUIBaseUI3.LJJJIL() > sDUIBaseUI4.LJJJIL()) {
            return 1;
        }
        if (sDUIBaseUI3.LJJJIL() == sDUIBaseUI4.LJJJIL()) {
            return 0;
        }
        return -1;
    }
}
