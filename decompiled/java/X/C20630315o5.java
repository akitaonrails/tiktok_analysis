package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15o5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20630315o5 {
    public static boolean LIZ(C198H c198h, NavigationScene navigationScene) {
        Scene sceneLLLLIIIILLL;
        if (navigationScene != null && (sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL()) != null) {
            if (Intrinsics.LJFF(sceneLLLLIIIILLL, c198h)) {
                return true;
            }
            if (sceneLLLLIIIILLL instanceof C214932199m) {
                return Intrinsics.LJFF(((C214932199m) sceneLLLLIIIILLL).LLJI, c198h);
            }
        }
        return false;
    }
}
