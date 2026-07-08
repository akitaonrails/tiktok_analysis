package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.10kf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19335110kf implements InterfaceC1585190rLx {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1585190rLx
    public final void p1(String str, String str2) {
        switch (this.$t) {
            case 0:
                p1$0(this, str, str2);
                break;
            case 1:
                p1$1(this, str, str2);
                break;
        }
    }

    public C19335110kf(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void p1$0(C19335110kf c19335110kf, String str, String str2) {
        if (TextUtils.equals(str2, "NOTIFICATION")) {
            ((C1903680zde) c19335110kf.l0).L5();
        }
    }

    public static final void p1$1(C19335110kf c19335110kf, String str, String str2) {
        if (TextUtils.equals(str2, "NOTIFICATION")) {
            ((C1903670zdd) c19335110kf.l0).U5();
        }
    }
}
