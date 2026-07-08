package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;

/* JADX INFO: renamed from: X.0R5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690280R5u {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        if (view != null && interfaceC665370Q7z != null) {
            Rect rectPR1 = null;
            InteractInfoAreaAttachAbility interactInfoAreaAttachAbility = (InteractInfoAreaAttachAbility) C1558520qew.LIZ(interfaceC665370Q7z, InteractInfoAreaAttachAbility.class, null);
            if (interactInfoAreaAttachAbility != null) {
                rectPR1 = interactInfoAreaAttachAbility.PR1();
            }
            int height = view.getHeight();
            if (rectPR1 != null && height != 0) {
                return height - rectPR1.bottom;
            }
            return 0.0f;
        }
        return 0.0f;
    }
}
