package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823250WRf extends C09AY implements Function0<Object> {
    public C823250WRf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C822890WPv c822890WPv = C822890WPv.LIZ;
        long jLIZJ = C822920WPy.LIZJ();
        return jLIZJ <= 0 ? "pns-null" : jLIZJ <= Mp4ScreenVideoLoadTimeout.CONTROL ? "0-5" : jLIZJ <= 60000 ? "5-60" : jLIZJ <= 600000 ? "60-600" : "600+";
    }
}
