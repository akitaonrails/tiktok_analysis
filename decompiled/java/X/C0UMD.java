package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectLoadOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UMD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0UMD implements InterfaceC396201gO<C0U74<LiveEffect>>, InterfaceC401501hF {
    public final HashMap<String, C0UN4> LIZ = new HashMap<>();

    @Override // X.InterfaceC401501hF
    public final boolean LJIILLIIL(String str) {
        boolean z;
        C0UN4 c0un4 = this.LIZ.get(str);
        if (c0un4 != null && !c0un4.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final void LIZ(int i, int i2, String str, boolean z) {
        if (LiveEffectLoadOptSetting.INSTANCE.allowPageLoad() && Intrinsics.LJFF(str, "trending")) {
            C0UN4 c0un4 = this.LIZ.get(str);
            if (c0un4 != null) {
                c0un4.LIZ = i;
                c0un4.LIZIZ = z;
            } else {
                c0un4 = new C0UN4(i, z, i2);
            }
            this.LIZ.put(str, c0un4);
        }
    }
}
