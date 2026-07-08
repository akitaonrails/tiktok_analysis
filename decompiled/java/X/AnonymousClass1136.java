package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.1136, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AnonymousClass1136 {
    public final String LL;
    public final C113G LLILLJJLI;
    public List<Effect> LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public AnonymousClass1134 LLILZLL;
    public boolean LLIZ;

    public abstract int LIZIZ();

    public abstract String LIZLLL();

    public void LJFF() {
    }

    public abstract View LJI();

    public void LJIIIIZZ() {
    }

    public void LJIIJ() {
    }

    public final AnonymousClass1134 LIZJ() {
        AnonymousClass1134 anonymousClass1134 = this.LLILZLL;
        if (anonymousClass1134 != null) {
            return anonymousClass1134;
        }
        return null;
    }

    public final View LJ() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        return null;
    }

    public C113G LIZ() {
        return this.LLILLJJLI;
    }

    public boolean LJII() {
        return this.LLILZIL;
    }

    public void LJIIIZ(boolean z) {
        if (this.LLIZ != z && this.LLILZ != null) {
            this.LLIZ = z;
            if (z) {
                LJFF();
            }
        }
    }

    public AnonymousClass1136(C113G c113g, String str, List list) {
        this.LL = str;
        this.LLILLJJLI = c113g;
        this.LLILLL = list;
    }
}
