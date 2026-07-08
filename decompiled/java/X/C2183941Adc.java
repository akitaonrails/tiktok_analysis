package X;

import com.ss.android.ugc.aweme.wavepublish.utils.mapper.PublishProgressMapperConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1Adc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183941Adc {
    public final Function1<Double, Unit> LIZ;
    public final C2183951Add LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;
    public final long LJ;
    public volatile double LJFF;
    public final C054G LJI;
    public AnonymousClass0956 LJII;

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            C2183951Add c2183951Add = this.LIZIZ;
            c2183951Add.LJI = 0.0d;
            c2183951Add.LJII = 0.0d;
            c2183951Add.LJIIIIZZ = 0.0d;
            c2183951Add.LJIIIZ = System.nanoTime() / 1.0E9d;
            this.LJII = C23250099c.LIZLLL(this.LJI, null, null, new C2183931Adb(this, null), 3);
        }
    }

    public C2183941Adc(PublishProgressMapperConfig publishProgressMapperConfig, AwS614S0100000_35 awS614S0100000_35) {
        this.LIZ = awS614S0100000_35;
        this.LIZIZ = new C2183951Add(publishProgressMapperConfig.getParams());
        this.LIZJ = publishProgressMapperConfig.getRangeStart();
        this.LIZLLL = publishProgressMapperConfig.getRangeEnd();
        int i = publishProgressMapperConfig.fps;
        long j = 1000 / ((long) (i <= 0 ? 30 : i));
        this.LJ = j < 1 ? 1L : j;
        this.LJI = C2296808zG.LIZ(C0PEM.LIZ);
    }
}
