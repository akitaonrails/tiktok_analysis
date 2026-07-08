package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: X.0qCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541030qCj {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (str.length() == 0) {
            return "default_biz";
        }
        return str;
    }

    public static void LIZIZ(InterfaceC1540940qCa interfaceC1540940qCa, Context context) {
        Context hybridViewContext = interfaceC1540940qCa.getHybridViewContext();
        if (hybridViewContext instanceof C2481809o0) {
            hybridViewContext = ((ContextWrapper) hybridViewContext).getBaseContext();
        }
        if (hybridViewContext instanceof MutableContextWrapper) {
            ((MutableContextWrapper) hybridViewContext).setBaseContext(context);
        }
    }
}
