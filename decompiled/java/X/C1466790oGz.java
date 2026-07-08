package X;

/* JADX INFO: renamed from: X.0oGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466790oGz implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

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

    public static final void run$0(C1466790oGz c1466790oGz) {
        C1458080o2w c1458080o2w = (C1458080o2w) c1466790oGz.l0;
        synchronized (c1458080o2w) {
            c1458080o2w.LIZ = false;
        }
    }

    public static final void run$1(C1466790oGz c1466790oGz) {
        ((C1419510n2j) c1466790oGz.l0).LIZ();
    }

    public C1466790oGz(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
