package X;

import com.ss.android.ugc.feed.platform.panel.plugindownloading.PluginDownloadBarComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rCP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579270rCP extends C09AY implements Function1<C05K2, Unit> {
    public C1579270rCP() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C05K2 c05k2) {
        C05K2 c05k22 = c05k2;
        c05k22.LIZJ = R.id.t25;
        c05k22.LIZLLL = C13LE.LIZ(PluginDownloadBarComponent.class);
        c05k22.LIZ = new C282690B6d();
        c05k22.LIZIZ = EnumC1579210rCJ.SPARSE;
        return Unit.LIZ;
    }
}
