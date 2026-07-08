package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DD3, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DD3 extends C09AY implements Function0<Keva> {
    public C1DD3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("play_count");
    }
}
