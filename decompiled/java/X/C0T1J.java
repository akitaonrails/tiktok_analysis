package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T1J, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T1J extends C09AY implements Function0<Keva> {
    public C0T1J() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("LowActiveSwipeUp");
    }
}
