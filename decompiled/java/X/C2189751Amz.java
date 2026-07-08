package X;

import oo5.b;

/* JADX INFO: renamed from: X.1Amz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189751Amz implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C2189751Amz c2189751Amz) {
    }

    public static final void onCanceled$1(C2189751Amz c2189751Amz) {
    }

    @Override // X.InterfaceC19515111Wr
    public final void LIZ(C0HWO... c0hwoArr) throws Throwable {
        switch (this.$t) {
            case 0:
                LIZ$0(this, c0hwoArr);
                break;
            case 1:
                LIZ$1(this, c0hwoArr);
                break;
        }
    }

    @Override // X.InterfaceC19515111Wr
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
        }
    }

    public C2189751Amz(ActivityC2186501Ahk activityC2186501Ahk, int i) {
        this.$t = i;
        this.l0 = activityC2186501Ahk;
    }

    public static final void LIZ$0(C2189751Amz c2189751Amz, C0HWO... c0hwoArr) {
        for (C0HWO c0hwo : c0hwoArr) {
            int i = C0LHJ.LIZIZ[c0hwo.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        b bVar = b.LJIJJLI;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        bVar.getClass();
                        b.LJIIJ(jCurrentTimeMillis, "cancel", "ocr_camera_request_permission");
                        ((ActivityC2186501Ahk) c2189751Amz.l0).LLZZ();
                        ((ActivityC2186501Ahk) c2189751Amz.l0).LLJILLL = true;
                    }
                } else {
                    b bVar2 = b.LJIJJLI;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    bVar2.getClass();
                    b.LJIIJ(jCurrentTimeMillis2, "cancel", "ocr_camera_request_permission");
                    ((ActivityC2186501Ahk) c2189751Amz.l0).LLZZ();
                    ((ActivityC2186501Ahk) c2189751Amz.l0).LLJILLL = true;
                }
            } else {
                b bVar3 = b.LJIJJLI;
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                bVar3.getClass();
                b.LJIIJ(jCurrentTimeMillis3, "ok", "ocr_camera_request_permission");
                ((ActivityC2186501Ahk) c2189751Amz.l0).LLJI.LIZJ();
                ((ActivityC2186501Ahk) c2189751Amz.l0).LLJILLL = false;
            }
        }
    }

    public static final void LIZ$1(C2189751Amz c2189751Amz, C0HWO... c0hwoArr) throws Throwable {
        for (C0HWO c0hwo : c0hwoArr) {
            int i = C0LHJ.LIZ[c0hwo.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        b bVar = b.LJIJJLI;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        bVar.getClass();
                        b.LJIIJ(jCurrentTimeMillis, "cancel", "ocr_album_request_permission");
                        ((ActivityC2186501Ahk) c2189751Amz.l0).LLZZZIL();
                    }
                } else {
                    b bVar2 = b.LJIJJLI;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    bVar2.getClass();
                    b.LJIIJ(jCurrentTimeMillis2, "cancel", "ocr_album_request_permission");
                    ((ActivityC2186501Ahk) c2189751Amz.l0).LLZZZIL();
                }
            } else {
                b bVar3 = b.LJIJJLI;
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                bVar3.getClass();
                b.LJIIJ(jCurrentTimeMillis3, "ok", "ocr_album_request_permission");
                ((ActivityC2186501Ahk) c2189751Amz.l0).LLLLZLL();
            }
        }
    }
}
