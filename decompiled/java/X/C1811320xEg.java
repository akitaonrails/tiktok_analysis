package X;

import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811320xEg {
    public final String LIZ;
    public final DataChannel LIZIZ;
    public final RankListV2Response.RankInfo LIZJ;
    public final boolean LIZLLL;
    public final Function1<RankListV2Response.RankInfo, Unit> LJ;
    public final boolean LJFF;
    public final boolean LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C1811320xEg(String str, DataChannel dataChannel, RankListV2Response.RankInfo rankInfo, boolean z, Function1<? super RankListV2Response.RankInfo, Unit> function1, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = dataChannel;
        this.LIZJ = rankInfo;
        this.LIZLLL = z;
        this.LJ = function1;
        this.LJFF = z2;
        this.LJI = z3;
    }
}
