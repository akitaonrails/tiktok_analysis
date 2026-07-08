package X;

import com.bytedance.android.livesdk.livesetting.level.GuidanceConfig;
import com.bytedance.android.livesdk.model.message.FansEventData;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: renamed from: X.0ecw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1096000ecw {
    public final long LIZ;
    public final Text LIZIZ;
    public final FansEventData.EntranceGuidanceData LIZJ;
    public final long LIZLLL;
    public final GuidanceConfig LJ;
    public final C1094740eau LJFF;

    public /* synthetic */ C1096000ecw(long j, Text text, FansEventData.EntranceGuidanceData entranceGuidanceData, long j2, GuidanceConfig guidanceConfig, int i) {
        this(j, text, entranceGuidanceData, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? null : guidanceConfig, (C1094740eau) null);
    }

    public C1096000ecw(long j, Text text, FansEventData.EntranceGuidanceData entranceGuidanceData, long j2, GuidanceConfig guidanceConfig, C1094740eau c1094740eau) {
        this.LIZ = j;
        this.LIZIZ = text;
        this.LIZJ = entranceGuidanceData;
        this.LIZLLL = j2;
        this.LJ = guidanceConfig;
        this.LJFF = c1094740eau;
    }
}
