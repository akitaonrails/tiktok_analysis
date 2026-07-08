package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0nxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455000nxy implements C0LH5 {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ C1454990nxx LIZIZ;

    public C1455000nxy(Activity activity, C1454990nxx c1454990nxx) {
        this.LIZ = activity;
        this.LIZIZ = c1454990nxx;
    }

    @Override // X.C0LH5
    public final void LIZ(int[] iArr, String[] strArr) {
        if (strArr != null && iArr != null && strArr.length != 0 && iArr.length != 0) {
            if (iArr[0] == 0) {
                C1454990nxx c1454990nxx = this.LIZIZ;
                C1456140nzo.LIZIZ(c1454990nxx.LLLLLZL(), false, false, false, false, 12);
                InterfaceC1455040ny2 interfaceC1455040ny2 = c1454990nxx.LLJJJIL;
                if (interfaceC1455040ny2 != null) {
                    interfaceC1455040ny2.show();
                    return;
                }
                return;
            }
            C1233040iBy c1233040iBy = new C1233040iBy(this.LIZ);
            c1233040iBy.LIZIZ(2131829829);
            c1233040iBy.LIZLLL();
            return;
        }
        C1233040iBy c1233040iBy2 = new C1233040iBy(this.LIZ);
        c1233040iBy2.LIZIZ(2131829829);
        c1233040iBy2.LIZLLL();
    }
}
