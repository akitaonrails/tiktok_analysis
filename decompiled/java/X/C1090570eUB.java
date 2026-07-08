package X;

import android.view.View;

/* JADX INFO: renamed from: X.0eUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090570eUB {
    public static final /* synthetic */ int LIZ = 0;

    public static final View LIZ(int i, int i2, View view) {
        View viewFindViewById = view.findViewById(i2);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        C1090550eU9 c1090550eU9 = (C1090550eU9) view.findViewById(i);
        if (c1090550eU9 == null) {
            return null;
        }
        c1090550eU9.LIZ();
        return view.findViewById(i2);
    }
}
