package X;

import com.bytedance.android.livesdk.livesetting.other.LiveEcommerceInnerSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468070IXd {
    public static final C01GW<C468070IXd> LJIIIIZZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C468090IXf());
    public Long LIZ;
    public Long LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL = true;
    public String LJ;
    public Long LJFF;
    public String LJI;
    public int LJII;

    public final boolean LIZIZ() {
        return this.LIZJ && this.LJ != null;
    }

    public static String LIZ(C468070IXd c468070IXd, Long l, boolean z, int i) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((!c468070IXd.LIZJ || (!Intrinsics.LJFF(l, c468070IXd.LIZIZ) && !LiveEcommerceInnerSetting.INSTANCE.m123switch())) && !z) {
            return null;
        }
        return c468070IXd.LJ;
    }
}
