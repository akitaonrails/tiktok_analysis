package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W5W, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W5W extends C09AY implements Function0<Keva> {
    public C0W5W() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("background_play_repo");
    }
}
