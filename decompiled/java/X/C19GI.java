package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: renamed from: X.19GI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19GI extends DialogC21505919Ej implements InterfaceC1107740evs {
    public boolean LL;
    public String LLILLJJLI;
    public String LLILLL;
    public final InterfaceC1119910fFV LLILZ;
    public final boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    public String LJJLIIIJLLLLLLLZ() {
        return null;
    }

    public String LJJLIIJ() {
        return null;
    }

    public String LJJLJ() {
        return null;
    }

    public String LJJLJLI() {
        return null;
    }

    public boolean LJJLL() {
        return false;
    }

    public abstract boolean LJJZ();

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public void show() {
        Object obj;
        C1107690evn c1107690evn = C464800IKo.LIZ;
        if (!c1107690evn.LJIIJJI() || this.LL) {
            C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGJ544i2jfZ33D0K1VMkmzDSbzdJad2r+OKdg/UVSvdVC", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = new Object[0];
            C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/live/design/app/LiveThemeAwareDialog", "show", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(300000, "com/bytedance/android/live/design/app/LiveThemeAwareDialog", "show", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
                super.show();
                c0wst.LIZ(300000, "com/bytedance/android/live/design/app/LiveThemeAwareDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
            }
            if (C011Z.LIZ.LJIJJLI()) {
                c1107690evn.LIZ(this);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        C464800IKo.LIZ.LJIILLIIL(this);
    }

    @Override // android.app.Dialog
    public final void hide() {
        super.hide();
        if (C011Z.LIZ.LJIJJLI()) {
            C464800IKo.LIZ.LJIILLIIL(this);
        }
    }

    @Override // X.DialogC21505919Ej, android.app.Dialog
    public void onStart() throws JSONException {
        super.onStart();
        if (!C011Z.LIZ.LJIJJLI()) {
            C464800IKo.LIZ.LIZ(this);
        }
        if (this.LLILZIL && LJJLL()) {
            C19GK.LIZ(this.LLILZ, new C19GL(LJJLJLI(), LJJLIIIJLLLLLLLZ(), LJJLJ(), LJJLIIJ(), this.LLIZ, this.LLILZLL));
        }
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        C1107690evn c1107690evn = C464800IKo.LIZ;
        c1107690evn.LJIILLIIL(this);
        if (TextUtils.isEmpty(this.LLILLJJLI)) {
            return;
        }
        ((HashMap) c1107690evn.LJ).remove(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1107740evs
    public final String getTag() {
        return this.LLILLL;
    }

    public C19GI(Context context) {
        boolean z;
        super(context);
        C1119850fFP c1119850fFP = C011Z.LIZ;
        this.LLILZ = c1119850fFP.LJIILIIL();
        if (AbstractC19994813Le.Default.nextDouble() < c1119850fFP.LJIIJ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZIL = z;
        this.LLILZLL = false;
        this.LLIZ = true;
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.LLIZ = z;
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.LLILZLL = z;
    }

    public C19GI(Context context, C21458718yP<?> c21458718yP) {
        boolean z;
        super(context);
        C1119850fFP c1119850fFP = C011Z.LIZ;
        this.LLILZ = c1119850fFP.LJIILIIL();
        if (AbstractC19994813Le.Default.nextDouble() < c1119850fFP.LJIIJ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZIL = z;
        this.LLILZLL = false;
        this.LLIZ = true;
        if (c21458718yP != null) {
            this.LL = c21458718yP.LIZIZ;
            String str = c21458718yP.LIZJ;
            this.LLILLJJLI = str;
            if (!TextUtils.isEmpty(str)) {
                C1107690evn c1107690evn = C464800IKo.LIZ;
                String str2 = this.LLILLJJLI;
                c1107690evn.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    ((HashMap) c1107690evn.LJ).put(str2, this);
                }
            }
        }
    }

    public C19GI(Context context, int i) {
        boolean z;
        super(context, i);
        C1119850fFP c1119850fFP = C011Z.LIZ;
        this.LLILZ = c1119850fFP.LJIILIIL();
        if (AbstractC19994813Le.Default.nextDouble() < c1119850fFP.LJIIJ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZIL = z;
        this.LLILZLL = false;
        this.LLIZ = true;
    }
}
