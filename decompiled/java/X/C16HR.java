package X;

/* JADX INFO: renamed from: X.16HR, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HR implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public static final void run$0(C16HR c16hr) {
        C162V c162v = ((C163D) c16hr.l0).LJIIIIZZ;
        if (c162v != null) {
            ((C162U) c16hr.l1).LIZ(c162v);
        }
    }

    public static final void run$1(C16HR c16hr) {
        C207118162y c207118162y = (C207118162y) c16hr.l0;
        C162V c162v = c207118162y.LJFF;
        if (c162v != null) {
            C162U c162u = (C162U) c16hr.l1;
            c207118162y.LJJI = null;
            c162u.LIZ(c162v);
        }
    }

    public C16HR(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
