package X;

import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0b3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958980b3w {
    public static final /* synthetic */ int LJI = 0;
    public DataChannel LIZ;
    public FrameLayout LIZIZ;
    public InterfaceC962060b8u LIZJ;
    public final AwS594S0100000_15 LIZLLL = new AwS594S0100000_15(this, 792);
    public final AwS594S0100000_15 LJ = new AwS594S0100000_15(this, 790);
    public final AwS594S0100000_15 LJFF = new AwS594S0100000_15(this, 791);

    public final C962790bA5 LIZ(String str) {
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout != null) {
            return (C962790bA5) frameLayout.findViewWithTag(str);
        }
        return null;
    }
}
