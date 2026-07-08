package X;

import android.os.Looper;
import im3.c;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ViY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805360ViY {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(C1441430nc5 c1441430nc5, String str, String str2, String str3) {
        String str4;
        c1441430nc5.LIZIZ.LIZJ = str2;
        StackTraceElement stackTraceElement = new StackTraceElement(C805360ViY.class.getName(), "", "", 0);
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            str4 = "MainThread";
        } else {
            str4 = "SubThread";
        }
        C801800Vco c801800VcoLJFF = C801800Vco.LJFF(stackTraceElement, str, str2, str4, true, "EnsureNotReachHere", str3);
        for (C805370ViZ c805370ViZ : (ArrayList) c1441430nc5.LIZ) {
            String str5 = c805370ViZ.LIZJ;
            if (str5 != null) {
                c801800VcoLJFF.LIZ(c805370ViZ.LIZ, str5);
                if (c805370ViZ.LIZIZ) {
                    c801800VcoLJFF.LIZIZ(c805370ViZ.LIZ, str5);
                }
            }
        }
        c.LIZ(c801800VcoLJFF);
    }
}
