package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ADl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175831ADl extends C09AY implements Function0<Keva> {
    public C2175831ADl() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Keva invoke() {
        return Keva.getRepo("ws_pref_monitor");
    }
}
