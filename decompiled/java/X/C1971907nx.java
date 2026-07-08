package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1971907nx extends C09AY implements Function0<Keva> {
    public C1971907nx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return KevaImpl.getRepoSync("lazy_data_manager_second", 0);
    }
}
