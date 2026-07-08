package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177530gkR {
    public final InterfaceC1176890gjP LIZ;
    public final View LIZIZ;
    public final ImageView LIZJ;
    public final C417240GXq LIZLLL;

    public C1177530gkR(Context context, EnumC1177980glA enumC1177980glA) {
        C1180740gpc.LIZ.getClass();
        this.LIZ = C1180740gpc.LIZ().LIZLLL();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e8g, new FrameLayout(context), false);
        this.LIZIZ = viewTd;
        this.LIZJ = (ImageView) viewTd.findViewById(R.id.rca);
        this.LIZLLL = (C417240GXq) viewTd.findViewById(R.id.rcd);
    }
}
