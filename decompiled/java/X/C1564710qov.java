package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564710qov {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Bundle bundle, Function1 function1) {
        int i;
        String string = bundle.getString("fromStart", "");
        if (Intrinsics.LJFF(string, "MainPage")) {
            i = 2;
        } else if (!Intrinsics.LJFF(string, "RootNode")) {
            return;
        } else {
            i = 3;
        }
        function1.invoke(Integer.valueOf(i));
    }

    public static void LIZ(Fragment fragment, Bundle bundle, String str, Function1 function1) {
        int i;
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(activity).HQ2(str);
        String strHQ22 = c446900Hfk.LIZ(activity).HQ2(strHQ2);
        String strHQ23 = c446900Hfk.LIZ(activity).HQ2(strHQ22);
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ22)) {
                if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ23)) {
                    i = 3;
                } else {
                    return;
                }
            } else {
                i = 2;
            }
        } else {
            i = 1;
        }
        function1.invoke(Integer.valueOf(i));
    }
}
