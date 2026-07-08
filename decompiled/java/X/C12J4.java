package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12J4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12J4 extends C19733512Ir {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final C19733312Ip LLJIJIL;
    public AwS608S0100000_29 LLJILJIL;

    @Override // X.C19733512Ir
    public final void N5(boolean z) {
        float f;
        View view = this.itemView;
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.T4(view, f);
    }

    public C12J4(View view, C19732812Ik c19732812Ik) {
        super(view, c19732812Ik);
        this.LLJIJIL = (C19733312Ip) view.findViewById(R.id.l54);
        view.getContext();
    }
}
