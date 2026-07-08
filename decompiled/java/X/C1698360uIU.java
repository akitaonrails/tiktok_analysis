package X;

import com.ss.android.ugc.aweme.infinisticker.b;

/* JADX INFO: renamed from: X.0uIU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698360uIU implements InterfaceC1737690vJv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        switch (this.$t) {
            case 0:
                return onBackPressed$0(this);
            case 1:
                return onBackPressed$1(this);
            case 2:
                return onBackPressed$2(this);
            case 3:
                return onBackPressed$3(this);
            case 4:
                return onBackPressed$4(this);
            case 5:
                return onBackPressed$5(this);
            case 6:
                return onBackPressed$6(this);
            default:
                return false;
        }
    }

    public static final boolean onBackPressed$0(C1698360uIU c1698360uIU) {
        ((b) c1698360uIU.l0).getStickerApiComponent().LLZLL();
        C0FT7 c0ft7 = ((b) c1698360uIU.l0).LLJLILLLLZIIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.Ja().LJIIIZ();
    }

    public static final boolean onBackPressed$1(C1698360uIU c1698360uIU) {
        ((C1662330tMN) c1698360uIU.l0).LLLLIL().LIZLLL.invoke();
        return true;
    }

    public static final boolean onBackPressed$2(C1698360uIU c1698360uIU) {
        ((C1662320tMM) c1698360uIU.l0).LLLLIL().LIZLLL.invoke();
        return true;
    }

    public static final boolean onBackPressed$3(C1698360uIU c1698360uIU) {
        ((C1662440tMY) c1698360uIU.l0).LLLLIL().LIZLLL.invoke();
        return true;
    }

    public static final boolean onBackPressed$4(C1698360uIU c1698360uIU) {
        ((C1652840t74) c1698360uIU.l0).onBackPressed();
        return false;
    }

    public static final boolean onBackPressed$5(C1698360uIU c1698360uIU) {
        return ((l2m.b) c1698360uIU.l0).LLLLILI().onBackPressed();
    }

    public static final boolean onBackPressed$6(C1698360uIU c1698360uIU) {
        ((C1686850tzv) c1698360uIU.l0).LLLLJ();
        return true;
    }

    public C1698360uIU(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
