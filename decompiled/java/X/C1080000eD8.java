package X;

import android.view.View;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import java.util.List;

/* JADX INFO: renamed from: X.0eD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080000eD8 {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final List<Integer> LJFF;

    static {
        int iGenerateViewId = View.generateViewId();
        LIZ = iGenerateViewId;
        int iGenerateViewId2 = View.generateViewId();
        LIZIZ = iGenerateViewId2;
        LIZJ = View.generateViewId();
        LIZLLL = View.generateViewId();
        LJ = View.generateViewId();
        LJFF = C1697810uHb.LJIIJJI(Integer.valueOf(iGenerateViewId), Integer.valueOf(iGenerateViewId2));
    }

    public static final void LIZ(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, int i) {
        multiElementSpecImpl.registerElement(new C1080010eD9(i));
    }
}
