package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0O6T, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O6T {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public volatile C0O6C LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0O6T.class, "initializer", "getInitializer()Lcom/ss/android/ugc/aweme/MotaInitializer;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C0O6C LIZ() {
        C0O6C c0o6c = this.LIZ;
        if (c0o6c == null) {
            synchronized (this) {
                c0o6c = this.LIZ;
                if (c0o6c == null) {
                    C0O6C c0o6c2 = (C0O6C) C0O6B.LIZ.getValue();
                    this.LIZ = c0o6c2;
                    return c0o6c2;
                }
            }
        }
        return c0o6c;
    }

    public final void LIZIZ(Context context) {
        C0O6U c0o6u = new C0O6U(this);
        C0O6W c0o6w = new C0O6W();
        c0o6u.invoke(c0o6w);
        C613950O6f.LJ = c0o6w.LIZ;
        C0O6R.LIZ(LIZ().LIZ());
        LIZ().LIZLLL(new C0O6V());
        LIZ().LIZJ();
    }
}
