package X;

import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: X.0I9F, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I9F implements C0I9I {
    public final /* synthetic */ C0I9I LIZ;
    public final /* synthetic */ C21307918a5 LIZIZ;

    @Override // X.C0I9I
    public final boolean LIZLLL() {
        C0I9I c0i9i = this.LIZ;
        if (c0i9i != null) {
            return c0i9i.LIZLLL();
        }
        return false;
    }

    @Override // X.C0I9I
    public final void LIZJ(String str) {
        C0I9I c0i9i = this.LIZ;
        if (c0i9i != null) {
            c0i9i.LIZJ(str);
        }
        this.LIZIZ.LJFF(null, str);
    }

    public C0I9F(C0I9I c0i9i, C21307918a5 c21307918a5) {
        this.LIZ = c0i9i;
        this.LIZIZ = c21307918a5;
    }

    @Override // X.C0I9I
    public final void LIZIZ(String str, Throwable th) {
        C0I9I c0i9i = this.LIZ;
        if (c0i9i != null) {
            c0i9i.LIZIZ(str, th);
        }
        this.LIZIZ.LIZLLL(str, th);
    }

    @Override // X.C0I9I
    public final void LIZ(String str, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
        C0I9I c0i9i = this.LIZ;
        if (c0i9i != null) {
            c0i9i.LIZ(str, interfaceC1330440kj4, animatable);
        }
        this.LIZIZ.LJ(str, interfaceC1330440kj4, animatable);
    }
}
