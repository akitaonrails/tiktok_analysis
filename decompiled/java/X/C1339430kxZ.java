package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0kxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339430kxZ {
    public final View LIZ;
    public final Fragment LIZIZ;
    public C420090Gdb LIZJ;
    public InterfaceC1345780l7o LIZLLL;
    public C1339910kyL LJFF;
    public InterfaceC1339640kxu LJI;
    public C912690ZrH LJII;
    public InterfaceC1339720ky2 LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public Comment LJIILJJIL;
    public Aweme LJIILL;
    public final Context LJIILLIIL;
    public String LJIJ;
    public FypExposedCommentMobParams LJIJI;
    public InterfaceC497601wk LJIL;
    public Function1<? super String, Unit> LJJ;
    public Function0<Unit> LJJI;
    public C1353360lK2 LJJIFFI;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1550));
    public int LJIIL = -1;
    public int LJIILIIL = -1;
    public boolean LJIIZILJ = true;
    public final C01GW LJIJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1551));
    public final C01GW LJIJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1552));
    public final List<C09AE> LJJII = new ArrayList();

    public final void LIZ() {
        Iterator it2 = ((ArrayList) this.LJJII).iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        ((ArrayList) this.LJJII).clear();
    }

    public final boolean LIZIZ() {
        return ((Boolean) this.LJIJJLI.getValue()).booleanValue();
    }

    public C1339430kxZ(View view, Fragment fragment) {
        this.LIZ = view;
        this.LIZIZ = fragment;
        this.LJIILLIIL = view.getContext();
    }
}
