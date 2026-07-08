package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NGY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NGY extends C09AY implements Function0<Keva> {
    public C0NGY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("cache_meta_store");
    }
}
