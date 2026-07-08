package X;

import Y.ACListenerS145S0100000_10;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0QJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668330QJj extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJJI = 0;
    public String LL;
    public String LLILLJJLI;
    public final String LLILLL;
    public boolean LLILZ;
    public C0QKM LLILZIL;
    public C0QK9 LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public C0QK7 LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    public final SearchStartViewModel I5() {
        return (SearchStartViewModel) this.LLJI.getValue();
    }

    public C668330QJj(View view) {
        super(view);
        C12ES.LJIIJ(view.getContext());
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        this.LL = "";
        C0Q2M.LIZ.getClass();
        this.LLILLL = C0Q2M.LJIIL();
        this.LLJI = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1063));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1058));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1060));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1059));
        this.LLJILJILJ = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1062));
        this.LLJILLL = c01gwLIZIZ2;
        this.LLJJ = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1061));
        C427690Gpr.LJ(view, 0.0f);
        TuxTextView tuxTextView = (TuxTextView) c01gwLIZIZ2.getValue();
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(C301210BrL.LIZ());
        }
        C786410Ut5.I7(new ACListenerS145S0100000_10(this, 67), (View) c01gwLIZIZ.getValue());
        view.addOnAttachStateChangeListener(new C0R45(this, 33));
    }
}
