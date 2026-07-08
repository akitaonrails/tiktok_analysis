package X;

import android.content.Context;
import android.view.LayoutInflater;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19VK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19VK implements C19V7 {
    public final Context LL;
    public Context LLILLJJLI;
    public C19V6 LLILLL;
    public final LayoutInflater LLILZ;
    public InterfaceC21549519Vd LLILZIL;
    public final int LLILZLL = R.layout.hh;
    public final int LLIZ = R.layout.hg;
    public InterfaceC21549819Vg LLIZLLLIL;
    public int LLJ;

    @Override // X.C19V7
    public final boolean LIZJ(C21548219Uq c21548219Uq) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LJ(C21548219Uq c21548219Uq) {
        return false;
    }

    @Override // X.C19V7
    public final int getId() {
        return this.LLJ;
    }

    public C19VK(Context context) {
        this.LL = context;
        this.LLILZ = C786410Ut5.ne(context);
    }

    @Override // X.C19V7
    public final void LJI(InterfaceC21549519Vd interfaceC21549519Vd) {
        this.LLILZIL = interfaceC21549519Vd;
    }
}
