package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Kfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523380Kfo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (z) {
            i = R.layout.eqv;
        } else {
            i = R.layout.equ;
        }
        arrayList.add(Integer.valueOf(i));
        if (C295640BiM.LIZ()) {
            arrayList.add(Integer.valueOf(R.layout.iae));
        }
        arrayList.add(Integer.valueOf(R.layout.d_f));
        C21146717pB.LJFF(context, "album", arrayList);
    }
}
