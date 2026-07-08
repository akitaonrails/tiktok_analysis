package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12Is, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19733612Is extends FrameLayout implements C12JG {
    public final ViewGroup LL;
    public C12J0 LLILLJJLI;
    public Function0<? extends View> LLILLL;
    public View LLILZ;
    public final View LLILZIL;
    public final C19733812Iu LLILZLL;
    public C19735612Jm LLIZ;
    public View.OnClickListener LLIZLLLIL;
    public ViewGroup LLJ;

    @Override // X.C12JG
    public final void LIZ() {
        C19733812Iu c19733812Iu = this.LLILZLL;
        Context context = getContext();
        this.LLILLJJLI.LIZJ.getClass();
        float fLIZIZ = C11VU.LIZIZ(12.0f, context);
        c19733812Iu.getClass();
        if (fLIZIZ > 0.0f) {
            C1643380sro c1643380sro = new C1643380sro();
            c1643380sro.LIZIZ(c19733812Iu.LL);
            c1643380sro.LJ(c19733812Iu.LL, 0);
            c1643380sro.LIZLLL(0);
            c1643380sro.LJI = new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f};
            c19733812Iu.setBackground(c1643380sro.LIZ());
        }
        C19733812Iu c19733812Iu2 = this.LLILZLL;
        this.LLILLJJLI.LIZJ.getClass();
        c19733812Iu2.getClass();
    }

    @Override // X.C12JG
    public final void dismiss() {
        C19735612Jm c19735612Jm = this.LLIZ;
        if (c19735612Jm != null) {
            c19735612Jm.LJFF(new C19510311Uv());
        }
    }

    @Override // X.C12JG
    public final void show() {
        C19735612Jm c19735612Jm = this.LLIZ;
        if (c19735612Jm != null) {
            this.LLILLJJLI.getClass();
            c19735612Jm.LJ = true;
        }
        C19735612Jm c19735612Jm2 = this.LLIZ;
        if (c19735612Jm2 != null) {
            c19735612Jm2.LIZJ(new C19510311Uv());
        }
    }

    public ViewGroup getContainer() {
        return this.LLJ;
    }

    @Override // android.view.View, android.view.ViewParent
    public final ViewGroup getParent() {
        return this.LL;
    }

    @Override // X.C12JG
    public View getRoot() {
        return this.LLILZ;
    }

    public final Function0<View> getRootProvider() {
        return this.LLILLL;
    }

    public final C12J0 getViewConfig() {
        return this.LLILLJJLI;
    }

    @Override // X.C12JG
    public final void lo(Drawable drawable) {
        this.LLILZLL.setBackground(drawable);
    }

    @Override // X.C12JG
    public void setContainer(ViewGroup viewGroup) {
        this.LLJ = viewGroup;
        this.LLIZ = new C19735612Jm(this, getRoot(), viewGroup);
    }

    @Override // X.C12JG
    public void setDismissViewClickListener(View.OnClickListener onClickListener) {
        this.LLIZLLLIL = onClickListener;
        this.LLILLJJLI.getClass();
        C786410Ut5.I7(this.LLIZLLLIL, this.LLILZIL);
    }

    public void setRoot(View view) {
        this.LLILZ = view;
    }

    public final void setRootProvider(Function0<? extends View> function0) {
        this.LLILLL = function0;
    }

    public final void setViewConfig(C12J0 c12j0) {
        this.LLILLJJLI = c12j0;
    }

    public C19733612Is(Context context, ViewGroup viewGroup, C12J0 c12j0) {
        super(context);
        this.LL = viewGroup;
        this.LLILLJJLI = c12j0;
        this.LLILLL = null;
        int i = c12j0.LIZJ.LIZ;
        this.LLILZ = C786410Ut5.Td(C786410Ut5.ne(context), i == 0 ? R.layout.v1 : i, this, true);
        View viewFindViewById = getRoot().findViewById(R.id.v_com_beauty_list_touch_outside);
        viewFindViewById.setImportantForAccessibility(1);
        C377000EqI.LIZ(viewFindViewById);
        this.LLILZIL = viewFindViewById;
        this.LLILZLL = (C19733812Iu) getRoot().findViewById(R.id.i4d);
        this.LLJ = viewGroup;
    }
}
