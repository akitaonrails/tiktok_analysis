package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08IC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08IC extends C09AY implements Function0<Keva> {
    public C08IC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("feed_digg_cache");
    }
}
