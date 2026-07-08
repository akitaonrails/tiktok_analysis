package X;

import com.ss.android.ugc.aweme.bsr.BSRLiveConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Blf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214411Blf extends C09AY implements Function0<Boolean> {
    public C2214411Blf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((BSRLiveConfig) C2214381Blc.LIZIZ.getValue()).enable);
    }
}
