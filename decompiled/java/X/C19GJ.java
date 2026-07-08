package X;

import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import org.json.JSONException;

/* JADX INFO: renamed from: X.19GJ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19GJ extends C19GM {
    public boolean LLILZLL;
    public final InterfaceC1119910fFV LLIZ;
    public final boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    public String LJJZ() {
        return null;
    }

    public String LJJZZI() {
        return null;
    }

    public String LJJZZIII() {
        return null;
    }

    public String LJL() {
        return null;
    }

    public abstract boolean LJLI();

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public void show() throws Throwable {
        Object obj;
        C1107690evn c1107690evn = C464800IKo.LIZ;
        if (!c1107690evn.LJIIJJI() || this.LLILZLL) {
            C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGJ544i2jfZ33D0K1VMkmzDSbzdJad2r+OKdg+FxDktVIEY0JDJscE9Pe", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = new Object[0];
            C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/live/design/app/LiveThemeAwareAppCompatDialog", "show", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(300000, "com/bytedance/android/live/design/app/LiveThemeAwareAppCompatDialog", "show", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
                super.show();
                c0wst.LIZ(300000, "com/bytedance/android/live/design/app/LiveThemeAwareAppCompatDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
            }
            c1107690evn.LIZ(this);
        }
    }

    @Override // android.app.Dialog
    public final void hide() {
        super.hide();
        C464800IKo.LIZ.LJIILLIIL(this);
    }

    @Override // X.C19EK, android.app.Dialog
    public void onStart() throws JSONException {
        super.onStart();
        C464800IKo.LIZ.LIZ(this);
        if (this.LLIZLLLIL && (this instanceof LiveDialog)) {
            C19GK.LIZ(this.LLIZ, new C19GL(LJL(), LJJZ(), LJJZZIII(), LJJZZI(), this.LLJI, this.LLJ));
        }
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public void onStop() {
        super.onStop();
        C464800IKo.LIZ.LJIILLIIL(this);
    }

    public C19GJ(Context context) {
        boolean z;
        super(context);
        C1119850fFP c1119850fFP = C011Z.LIZ;
        this.LLIZ = c1119850fFP.LJIILIIL();
        if (AbstractC19994813Le.Default.nextDouble() < c1119850fFP.LJIIJ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        this.LLJ = this instanceof LiveDialog;
        this.LLJI = true;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.LLJI = z;
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.LLJ = z;
    }

    public C19GJ(Context context, int i) {
        boolean z;
        super(context, i);
        C1119850fFP c1119850fFP = C011Z.LIZ;
        this.LLIZ = c1119850fFP.LJIILIIL();
        if (AbstractC19994813Le.Default.nextDouble() < c1119850fFP.LJIIJ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        this.LLJ = this instanceof LiveDialog;
        this.LLJI = true;
    }
}
