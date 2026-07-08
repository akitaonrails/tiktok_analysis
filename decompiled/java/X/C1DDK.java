package X;

import com.ss.android.ugc.feed.platform.componentmanager.metric.device.ScreenConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DDK, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DDK extends C09AY implements Function0<C1DDF> {
    public C1DDK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1DDF] */
    @Override // kotlin.jvm.functions.Function0
    public final C1DDF invoke() {
        return new InterfaceC20673715v5<C1DDI>() { // from class: X.1DDF
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20673715v5
            public final void LIZ(C20673615v4 c20673615v4) {
                Integer num;
                int iIntValue;
                int i;
                int iIntValue2;
                Integer num2;
                Integer num3;
                ScreenConfig screenConfig = (ScreenConfig) C722800SWw.LIZIZ.getValue();
                int i2 = 0;
                if (screenConfig != null && (num = screenConfig.smallWidthDp) != null && screenConfig.smallHeightDp != null && num.intValue() > 0 && screenConfig.smallHeightDp.intValue() > 0) {
                    T t = c20673615v4.LIZIZ;
                    int i3 = ((C1DDI) t).LIZJ.LIZIZ;
                    int i4 = ((C1DDI) t).LIZJ.LIZ;
                    float f = ((C1DDI) t).LIZJ.LIZLLL;
                    int i5 = (int) (i3 / f);
                    if (screenConfig != null && (num3 = screenConfig.smallHeightDp) != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (i5 <= iIntValue) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i6 = (int) (i4 / f);
                    if (screenConfig != null && (num2 = screenConfig.smallWidthDp) != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (i6 <= iIntValue2) {
                        i2 = 1;
                    }
                    T t2 = c20673615v4.LIZIZ;
                    ((C1DDI) t2).LIZJ.LJFF = i2 | (i << 1);
                    int i7 = ((C1DDI) t2).LIZJ.LJFF;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 == 3) {
                                    new AwS579S0100000_35(c20673615v4, 277);
                                    C0T6L.LIZLLL();
                                }
                            } else {
                                new AwS579S0100000_35(c20673615v4, 276);
                                C0T6L.LIZLLL();
                            }
                        } else {
                            new AwS579S0100000_35(c20673615v4, 275);
                            C0T6L.LIZLLL();
                        }
                    } else {
                        new C1DDH(c20673615v4);
                        C0T6L.LIZLLL();
                    }
                    c20673615v4.LIZ();
                    return;
                }
                ((C1DDI) c20673615v4.LIZIZ).LIZJ.LJFF = 0;
                C0T6L.LIZLLL();
            }
        };
    }
}
