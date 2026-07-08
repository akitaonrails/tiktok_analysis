package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wpd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835230Wpd extends C09AY implements Function0<Keva> {
    public C835230Wpd() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("cloud_key_file");
    }
}
