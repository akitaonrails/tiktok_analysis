package X;

import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;

/* JADX INFO: renamed from: X.0ahu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945320ahu {
    public final LiveSeiStruct LIZ;
    public final String LIZIZ;
    public long LIZJ = -1;
    public long LIZLLL = -1;

    public final boolean LIZ() {
        SeiAppData seiAppData;
        LiveSeiStruct liveSeiStruct = this.LIZ;
        return (liveSeiStruct == null || (seiAppData = liveSeiStruct.LIZ) == null || !seiAppData.LJIILL()) ? false : true;
    }

    public C945320ahu(LiveSeiStruct liveSeiStruct, String str) {
        this.LIZ = liveSeiStruct;
        this.LIZIZ = str;
    }
}
