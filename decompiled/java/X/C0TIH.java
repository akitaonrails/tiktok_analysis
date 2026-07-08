package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.CppUnlockGuideDialog;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TIH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIH {
    public static CppUnlockGuideDialog LIZ(String str, Function1 function1, Boolean bool, WeakReference weakReference) {
        CppUnlockGuideDialog cppUnlockGuideDialog = new CppUnlockGuideDialog();
        if (str != null) {
            cppUnlockGuideDialog.LL = str;
        }
        if (bool != null) {
            cppUnlockGuideDialog.LLILLL = bool.booleanValue();
        }
        cppUnlockGuideDialog.LLILLJJLI = function1;
        cppUnlockGuideDialog.LLILZ = weakReference;
        return cppUnlockGuideDialog;
    }
}
