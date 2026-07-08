package X;

import com.ss.android.ugc.aweme.im.debug.api.IFeatureDebugSwitch;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.annotation.Feature;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0y0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841080y0g<T> implements InterfaceC1731706qJ<Object, T> {
    public static final C01GW<IFeatureDebugSwitch> LLILZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(327));
    public static final C01GW<C1841070y0f> LLILZIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(328));
    public final C13IQ<T> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, (C1841080y0g<Object>) 1327));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, (C1841080y0g<Object>) 1326));

    public C1841080y0g(C19719912Dl c19719912Dl) {
        this.LL = c19719912Dl;
    }

    @Override // X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        if (this.LLILLJJLI.getValue() == null) {
            return null;
        }
        Feature feature = (Feature) this.LLILLL.getValue();
        if (feature == null) {
            return (T) this.LLILLJJLI.getValue();
        }
        IFeatureDebugSwitch value = LLILZ.getValue();
        if (value != null) {
            feature.id();
            if (value.LIZJ()) {
                return null;
            }
        }
        C13IQ<?>[] c13iqArrLIZIZ = C13LE.LIZIZ(feature.parents());
        if (c13iqArrLIZIZ.length != 0) {
            int i = C1781780wT2.LIZ[feature.dependencyMode().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    for (C13IQ<?> c13iq : c13iqArrLIZIZ) {
                        if (!LLILZIL.getValue().LIZIZ(c13iq)) {
                        }
                    }
                    return null;
                }
                throw new C1954807lC();
            }
            for (C13IQ<?> c13iq2 : c13iqArrLIZIZ) {
                if (!LLILZIL.getValue().LIZIZ(c13iq2)) {
                    return null;
                }
            }
        }
        return (T) this.LLILLJJLI.getValue();
    }
}
