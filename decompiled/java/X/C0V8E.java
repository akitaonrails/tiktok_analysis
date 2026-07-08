package X;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0V8E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V8E {
    public String LIZ;
    public C0V8E LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public long LJI;
    public boolean LJII;
    public final /* synthetic */ C0V8C LJIIIIZZ;

    public C0V8E(C0V8C c0v8c) {
        this.LJIIIIZZ = c0v8c;
    }

    public final void LIZ(long j) {
        int i;
        long j2 = this.LIZJ + j;
        this.LIZJ = j2;
        int i2 = this.LJ + 1;
        this.LJ = i2;
        C0V8E c0v8e = this.LIZIZ;
        if (c0v8e != null && i2 == (i = this.LIZLLL)) {
            if (this.LJII) {
                c0v8e.LJII = true;
            }
            C0V8C c0v8c = this.LJIIIIZZ;
            if (j2 >= c0v8c.LLJIJIL && !this.LJII) {
                String str = this.LIZ;
                c0v8c.getClass();
                Context context = C792400V6o.LIZ;
                if (j2 <= 17179869184L) {
                    if (c0v8c.LLJL == null) {
                        c0v8c.LLJL = new C823150WQv<>(c0v8c.LLJILJIL);
                    }
                    c0v8c.LLJL.LIZ(new C0V8F(str, j2, i));
                }
                this.LIZIZ.LJII = true;
            }
            this.LIZIZ.LIZ(this.LIZJ);
            if (this.LJFF) {
                this.LJIIIIZZ.LJIILLIIL(this.LIZLLL, this.LIZJ, this.LJI, this.LIZ);
            }
            if (TextUtils.equals(this.LIZ, C0V8C.LLJLILLLLZIIL)) {
                this.LJIIIIZZ.LLJJI = this.LIZJ;
                return;
            }
            if (TextUtils.equals(this.LIZ, C0V8C.LLJLL)) {
                this.LJIIIIZZ.LLJJIII = this.LIZJ;
            } else if (TextUtils.equals(this.LIZ, this.LJIIIIZZ.LLJILLL)) {
                this.LJIIIIZZ.LLJJIJI = this.LIZJ;
            } else {
                if (!TextUtils.equals(this.LIZ, this.LJIIIIZZ.LLJJ)) {
                    return;
                }
                this.LJIIIIZZ.LLJJIJIIJIL = this.LIZJ;
            }
        }
    }
}
