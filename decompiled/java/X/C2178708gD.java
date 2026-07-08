package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08gD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2178708gD extends C09AY implements Function0<Keva> {
    public C2178708gD() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("touch_point_action_list");
    }
}
