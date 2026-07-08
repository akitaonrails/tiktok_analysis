package X;

import com.ss.android.ugc.aweme.bsr.BSRLiveConfig;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ble, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214401Ble extends C09AY implements Function0<List<? extends String>> {
    public C2214401Ble() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        return ((BSRLiveConfig) C2214381Blc.LIZIZ.getValue()).liveEnterEvent;
    }
}
