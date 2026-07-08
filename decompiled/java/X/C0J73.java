package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J73, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J73 extends C09AY implements Function0<Keva> {
    public C0J73() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("ttlive_preview_repo");
    }
}
