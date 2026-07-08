package X;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WVI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WVI {
    public static final /* synthetic */ int LIZIZ = 0;
    public Uri LIZ;

    public C0WVI(String str, Bundle bundle) {
        Uri uriLIZ;
        bundle = bundle == null ? new Bundle() : bundle;
        C0WVJ[] c0wvjArrValuesCustom = C0WVJ.valuesCustom();
        ArrayList arrayList = new ArrayList(c0wvjArrValuesCustom.length);
        for (C0WVJ c0wvj : c0wvjArrValuesCustom) {
            arrayList.add(c0wvj.getRawValue());
        }
        if (arrayList.contains(str)) {
            uriLIZ = C0W7Q.LIZ(C786410Ut5.j4("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), Intrinsics.LJIIJJI(str, "/dialog/"), bundle);
        } else {
            uriLIZ = C0WVC.LIZ(bundle, str);
        }
        this.LIZ = uriLIZ;
    }
}
