package X;

import com.bytedance.android.livesdk.model.message.LiveEventMessage;

/* JADX INFO: renamed from: X.0edj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1096490edj {
    public final long LIZ;
    public final LiveEventMessage LIZIZ;
    public final boolean LIZJ;
    public final EnumC1085360eLm LIZLLL;

    public /* synthetic */ C1096490edj(long j) {
        this(j, null, false, EnumC1085360eLm.NULL);
    }

    public C1096490edj(long j, LiveEventMessage liveEventMessage, boolean z, EnumC1085360eLm enumC1085360eLm) {
        this.LIZ = j;
        this.LIZIZ = liveEventMessage;
        this.LIZJ = z;
        this.LIZLLL = enumC1085360eLm;
    }

    public static C1096490edj LIZ(C1096490edj c1096490edj, LiveEventMessage liveEventMessage, boolean z, EnumC1085360eLm enumC1085360eLm, int i) {
        long j;
        EnumC1085360eLm enumC1085360eLm2 = enumC1085360eLm;
        boolean z2 = z;
        LiveEventMessage liveEventMessage2 = liveEventMessage;
        if ((i & 1) != 0) {
            j = c1096490edj.LIZ;
        } else {
            j = 0;
        }
        if ((i & 2) != 0) {
            liveEventMessage2 = c1096490edj.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c1096490edj.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC1085360eLm2 = c1096490edj.LIZLLL;
        }
        return new C1096490edj(j, liveEventMessage2, z2, enumC1085360eLm2);
    }
}
