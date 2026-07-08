package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock;
import java.util.List;

/* JADX INFO: renamed from: X.0zv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1914480zv4 {
    public final Context LIZ;
    public final InterfaceC1914580zvE LIZIZ;
    public final UniversalPopupBlock LIZJ;
    public String LIZLLL = "fullscreen";

    public abstract FrameLayout LIZ();

    public void LIZJ(boolean z) {
    }

    public List<String> LIZIZ() {
        return C13BV.INSTANCE;
    }

    public AbstractC1914480zv4(Context context, InterfaceC1914580zvE interfaceC1914580zvE, UniversalPopupBlock universalPopupBlock) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1914580zvE;
        this.LIZJ = universalPopupBlock;
    }
}
