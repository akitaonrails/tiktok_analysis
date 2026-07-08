package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0OV7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OV7 {
    public static final C0OVA LIZ(Context context, boolean z, boolean z2) {
        AnonymousClass0123 anonymousClass0121;
        float f = C0OV8.LIZ;
        C0OV6 c0ov6LIZ = C0OV9.LIZ(false, z, z2);
        C0OT1 c0ot1 = new C0OT1(C960203pA.LIZ(R.attr.c3, context));
        Integer num = C0I0I.LIZ.LIZ;
        if (num != null) {
            anonymousClass0121 = new AnonymousClass0121(num.intValue());
        } else {
            anonymousClass0121 = AnonymousClass0122.LIZ;
        }
        return new C0OVA(c0ov6LIZ, anonymousClass0121, c0ot1);
    }

    public static final C0OVA LIZIZ(Context context, boolean z, boolean z2) {
        AnonymousClass0123 anonymousClass0121;
        float f = C0OV8.LIZ;
        C0OV6 c0ov6LIZ = C0OV9.LIZ(true, z, z2);
        C0OT1 c0ot1 = new C0OT1(C960203pA.LIZ(R.attr.c3, context));
        Integer num = C0I0I.LIZ.LIZ;
        if (num != null) {
            anonymousClass0121 = new AnonymousClass0121(num.intValue());
        } else {
            anonymousClass0121 = AnonymousClass0122.LIZ;
        }
        return new C0OVA(c0ov6LIZ, anonymousClass0121, c0ot1);
    }

    public static final C2255551DQb LIZJ(Context context, C0OV6 c0ov6, boolean z) {
        int iIntValue;
        float f;
        float fMax = Math.max(c0ov6.LIZLLL, c0ov6.LIZJ);
        float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(1.25d));
        float fLIZIZ2 = C418440Gaw.LIZIZ(Double.valueOf(3.75d));
        float fLIZIZ3 = C418440Gaw.LIZIZ(Double.valueOf(2.25d));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bq, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -3355444;
        }
        float f2 = c0ov6.LIZ;
        float f3 = c0ov6.LIZIZ;
        if (z) {
            f = fMax;
        } else {
            f = c0ov6.LIZLLL;
            fMax = c0ov6.LIZJ;
        }
        return new C2255551DQb(fLIZIZ, fLIZIZ2, fLIZIZ3, iIntValue, f2, f3, f, fMax);
    }

    public static final C0OVA LIZLLL(Context context, boolean z, boolean z2, boolean z3) {
        C0OT1 c0ot1;
        float f = C0OV8.LIZ;
        C0OV6 c0ov6LIZ = C0OV9.LIZ(false, z, z3);
        if (z2) {
            if (z3) {
                c0ov6LIZ = C0OV6.LIZ(c0ov6LIZ, 11);
            } else {
                c0ov6LIZ = C0OV6.LIZ(c0ov6LIZ, 7);
            }
        }
        C0I0I.LIZ.getClass();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context);
        if (numLIZJ != null) {
            c0ot1 = new C0OT1(numLIZJ.intValue());
        } else {
            c0ot1 = null;
        }
        return new C0OVA(c0ov6LIZ, AnonymousClass0122.LIZ, c0ot1);
    }
}
