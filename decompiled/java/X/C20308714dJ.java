package X;

import android.content.Context;

/* JADX INFO: renamed from: X.14dJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20308714dJ implements InterfaceC1680560tpm {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1680560tpm
    public final void dispose() {
        switch (this.$t) {
            case 0:
                dispose$0(this);
                break;
            case 1:
                dispose$1(this);
                break;
            case 2:
                dispose$2(this);
                break;
            case 3:
                dispose$3(this);
                break;
            case 4:
                dispose$4(this);
                break;
        }
    }

    public static final void dispose$0(C20308714dJ c20308714dJ) {
        C786410Ut5.N3((Context) c20308714dJ.l0).unregisterComponentCallbacks((ComponentCallbacks2C20045713bz) c20308714dJ.l1);
    }

    public static final void dispose$1(C20308714dJ c20308714dJ) {
        C786410Ut5.N3((Context) c20308714dJ.l0).unregisterComponentCallbacks((ComponentCallbacks2C20045613by) c20308714dJ.l1);
    }

    public static final void dispose$2(C20308714dJ c20308714dJ) {
        C786410Ut5.LJJIFFI((Context) c20308714dJ.l0, (C1296770jql) c20308714dJ.l1);
    }

    public static final void dispose$3(C20308714dJ c20308714dJ) {
        C786410Ut5.LJJIFFI((Context) c20308714dJ.l0, (C20303214cQ) c20308714dJ.l1);
    }

    public static final void dispose$4(C20308714dJ c20308714dJ) {
        ((C20042813bW) c20308714dJ.l0).LIZJ.LJIIJ(c20308714dJ.l1);
    }

    public C20308714dJ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
