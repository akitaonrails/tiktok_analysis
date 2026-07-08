package X;

import com.ss.android.ugc.aweme.ab.RemoveGapData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564340qoK extends C09AY implements Function0<RemoveGapData> {
    public C1564340qoK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ab.RemoveGapData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final RemoveGapData invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        RemoveGapData removeGapData = C1564330qoJ.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(RemoveGapData.class, removeGapData, "live_min_gap_delete", true);
        return LJJII != 0 ? LJJII : removeGapData;
    }
}
