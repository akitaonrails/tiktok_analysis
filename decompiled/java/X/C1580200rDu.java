package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.experiment.TopTabUiAlignmentConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580200rDu extends C09AY implements Function0<InterfaceC1580140rDo> {
    public C1580200rDu() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1580140rDo invoke() {
        TopTabUiAlignmentConfig topTabUiAlignmentConfig = C1581510rG1.LIZ;
        return (topTabUiAlignmentConfig == null || topTabUiAlignmentConfig.tabMarginRuleOpt <= 0 || (topTabUiAlignmentConfig != null && topTabUiAlignmentConfig.tabMarginRuleOpt >= 0 && topTabUiAlignmentConfig != null && topTabUiAlignmentConfig.tabHitAreaRuleOpt == 1) || C1581510rG1.LIZJ()) ? new InterfaceC1580140rDo() { // from class: X.0rDt
            public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            public static final int LIZIZ;
            public static final int LIZJ;

            static {
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            }

            @Override // X.InterfaceC1580140rDo
            public final C1580120rDm LIZIZ(boolean z) {
                C1580210rDv c1580210rDv;
                if (z) {
                    int i = LIZIZ;
                    int i2 = LIZJ;
                    c1580210rDv = new C1580210rDv(i, i2, 0, i2);
                } else {
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    int i3 = LIZJ;
                    c1580210rDv = new C1580210rDv(iLIZIZ, i3, LIZIZ, i3);
                }
                int i4 = LIZ;
                return new C1580120rDm(new ViewGroup.LayoutParams(c1580210rDv.LIZ + c1580210rDv.LIZJ + i4, i4 + c1580210rDv.LIZIZ + c1580210rDv.LIZLLL), new ViewGroup.LayoutParams(-2, -2), c1580210rDv, null);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
            @Override // X.InterfaceC1580140rDo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1580120rDm LIZ(int r17, int r18, java.lang.String r19, boolean r20) {
                /*
                    Method dump skipped, instruction units count: 301
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1580190rDt.LIZ(int, int, java.lang.String, boolean):X.0rDm");
            }
        } : new InterfaceC1580140rDo() { // from class: X.0rDs
            public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            public static final int LIZJ;

            static {
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            }

            @Override // X.InterfaceC1580140rDo
            public final C1580120rDm LIZIZ(boolean z) {
                int i = LIZ;
                return new C1580120rDm(new ViewGroup.LayoutParams(i, i), new ViewGroup.LayoutParams(-2, -2), new C1580210rDv(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
            @Override // X.InterfaceC1580140rDo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1580120rDm LIZ(int r11, int r12, java.lang.String r13, boolean r14) {
                /*
                    Method dump skipped, instruction units count: 286
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1580180rDs.LIZ(int, int, java.lang.String, boolean):X.0rDm");
            }
        };
    }
}
