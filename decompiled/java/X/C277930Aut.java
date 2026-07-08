package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Aut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C277930Aut extends C09AY implements Function0<Keva> {
    public C277930Aut() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return KevaImpl.getRepo("ab_repo_cold_boot_muti", 1);
    }
}
