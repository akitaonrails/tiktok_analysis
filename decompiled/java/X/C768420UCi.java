package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768420UCi implements C0U86 {
    public static final C768420UCi LIZ = new C768420UCi();

    @Override // X.C0U86
    public final void LIZ(LiveEffect liveEffect, String str, boolean z) {
        if (str.length() > 0) {
            if (Intrinsics.LJFF(str, C0UD4.LIZIZ) || Intrinsics.LJFF(str, C0UD4.LJ) || C0UD4.LJIIJ.contains(str) || Intrinsics.LJFF(str, "livebackground")) {
                if (z) {
                    HashMap<String, C0UC9> map = C768430UCj.LIZIZ;
                    if (!map.containsKey(liveEffect.getFilePath())) {
                        map.put(liveEffect.getFilePath(), new C0UC9(liveEffect, 0L, System.currentTimeMillis(), false, str));
                        return;
                    }
                    return;
                }
                C768430UCj.LIZIZ.remove(liveEffect.getFilePath());
            }
        }
    }
}
