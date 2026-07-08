package X;

import com.bytedance.poplayer.core.PopupManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15rZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20651915rZ {
    public static final void LIZ(String str) {
        Function2<String, String, Unit> function2 = PopupManager.LIZLLL().LIZJ;
        if (function2 != null) {
            function2.invoke("PopupManager", str);
        } else {
            int i = C2187451AjH.LIZ;
            LIZIZ(str);
        }
    }

    public static final void LIZIZ(String str) {
        PopupManager.LIZLLL().LIZIZ.invoke("PopupManager", str);
    }
}
