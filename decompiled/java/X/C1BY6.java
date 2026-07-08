package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BY6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BY6 extends C09AY implements Function0<Keva> {
    public C1BY6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return KevaImpl.getRepo("feed_volume_info", 1);
    }
}
