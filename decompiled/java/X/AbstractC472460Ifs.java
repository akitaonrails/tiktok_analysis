package X;

import com.bytedance.android.livesdk.livesetting.skylight.LiveSkylightStyleSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ifs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC472460Ifs {
    public final EnumC472500Ifw LIZ;

    public final boolean LIZ() {
        return Intrinsics.LJFF(this, C472490Ifv.LIZIZ) && LiveSkylightStyleSetting.INSTANCE.enableStyleV2();
    }

    public AbstractC472460Ifs(EnumC472500Ifw enumC472500Ifw) {
        this.LIZ = enumC472500Ifw;
    }
}
