package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1698606ky {
    public final List<String> LIZ;
    public final Effect LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1698606ky)) {
            return false;
        }
        C1698606ky c1698606ky = (C1698606ky) obj;
        return Intrinsics.LJFF(this.LIZ, c1698606ky.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1698606ky.LIZIZ);
    }

    public C1698606ky(Effect effect, List list) {
        this.LIZ = list;
        this.LIZIZ = effect;
    }
}
