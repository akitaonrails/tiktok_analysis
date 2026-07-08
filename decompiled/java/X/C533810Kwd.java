package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Kwd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533810Kwd {
    public static final C0LAB LIZ(C0LAB c0lab) {
        boolean zLIZLLL = C533930Kwp.LIZLLL("android.permission.CAMERA");
        boolean zLIZLLL2 = C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO");
        boolean zLIZJ = C533930Kwp.LIZJ();
        ArrayList arrayList = new ArrayList();
        if (zLIZJ) {
            if (C0CHQ.LIZ().LJJJI().isPartialMediaAccessPermissionGranted()) {
                arrayList.add("photo_selected_only");
            } else {
                arrayList.add("photo");
            }
        }
        if (zLIZLLL) {
            arrayList.add("camera");
        }
        if (zLIZLLL2) {
            arrayList.add("microphone");
        }
        c0lab.LJ("permission_grant", C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63));
        return c0lab;
    }
}
