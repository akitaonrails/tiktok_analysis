package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: renamed from: X.0IF8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IF8 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public EnterRoomConfig LJ;

    public C0IF8(long j) {
        this.LIZJ = j;
    }

    public C0IF8(EnterRoomConfig enterRoomConfig, long j) {
        this.LIZJ = j;
        this.LJ = enterRoomConfig;
    }

    public C0IF8(long j, EnterRoomConfig enterRoomConfig, String str) {
        this.LIZJ = j;
        this.LJ = enterRoomConfig;
        this.LIZIZ = str;
    }

    public C0IF8(long j, EnterRoomConfig enterRoomConfig, boolean z, boolean z2) {
        this.LIZJ = j;
        this.LJ = enterRoomConfig;
        this.LIZ = z;
        this.LIZLLL = z2;
    }
}
