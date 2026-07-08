package X;

import com.ss.android.ugc.aweme.bsr.BSRLiveConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Blg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214421Blg extends C09AY implements Function0<Integer> {
    public C2214421Blg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((BSRLiveConfig) C2214381Blc.LIZIZ.getValue()).liveContinuousBadVVCount);
    }
}
