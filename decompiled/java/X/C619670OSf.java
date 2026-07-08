package X;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619670OSf implements C0OT0 {
    public final View LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    public final TuxIconView LIZLLL() {
        return (TuxIconView) this.LIZIZ.getValue();
    }

    public final TuxTextView LJFF() {
        return (TuxTextView) this.LIZJ.getValue();
    }

    public C619670OSf(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.a6s);
        this.LIZ = C786410Ut5.LJLLLL(viewStub);
        this.LIZIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1733));
        this.LIZJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1734));
    }
}
