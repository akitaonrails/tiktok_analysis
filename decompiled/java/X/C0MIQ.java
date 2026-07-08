package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MIQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MIQ {
    public final Context LIZ;
    public final C0MIK LIZIZ;
    public final InterfaceC1652470t6T LIZJ;

    public C0MIQ(Context context, C0MIK c0mik, InterfaceC1652470t6T interfaceC1652470t6T) {
        this.LIZ = context;
        this.LIZIZ = c0mik;
        this.LIZJ = interfaceC1652470t6T;
    }

    public static void LIZ(C0MIQ c0miq, C0MJE c0mje, boolean z, String str, String str2, boolean z2, boolean z3, String str3, String str4, Effect effect, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) != 0) {
            str3 = "";
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        InterfaceC1652470t6T interfaceC1652470t6T = c0miq.LIZJ;
        if (interfaceC1652470t6T != null) {
            interfaceC1652470t6T.rZ0(null, true);
        }
        C1797450wsJ c1797450wsJ = C1797450wsJ.LIZ;
        Context context = c0miq.LIZ;
        C0MIL c0mil = new C0MIL(effect, c0miq, c0mje, z, str, str2, z2, z3, str3, str4);
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c0miq, 201);
        c1797450wsJ.getClass();
        C1797450wsJ.LIZJ(context, c0mil, awS552S0100000_8, false);
    }
}
