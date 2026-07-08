package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0n7Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422500n7Y extends AbstractC2255721DQs<InterfaceC1422310n7F> implements InterfaceC1422310n7F {
    public static final C1422510n7Z LLILZIL = new Object() { // from class: X.0n7Z
    };
    public static final int LLILZLL = 8;
    public final C1DRG LL;
    public final ShortVideoContext LLILLJJLI;
    public final InterfaceC1422310n7F LLILLL = this;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 0));

    @Override // X.InterfaceC1422310n7F
    public void F1(C1422540n7c c1422540n7c) {
    }

    @Override // X.InterfaceC1422310n7F
    public void d91(C0LAB c0lab, TemplateCategoryData templateCategoryData, Integer num, C1419590n2r c1419590n2r, String str) {
    }

    private final InterfaceC1422570n7f X1() {
        return (InterfaceC1422570n7f) this.LLILZ.getValue();
    }

    public InterfaceC1422310n7F W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    public C1422500n7Y(C1DRG c1drg, ShortVideoContext shortVideoContext) {
        this.LL = c1drg;
        this.LLILLJJLI = shortVideoContext;
    }

    @Override // X.InterfaceC1422310n7F
    public synchronized void cr2(int i, C1422430n7R c1422430n7R) {
        InterfaceC1422570n7f interfaceC1422570n7fX1 = X1();
        if (interfaceC1422570n7fX1 != null && interfaceC1422570n7fX1.NJ2(c1422430n7R)) {
            return;
        }
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        int i2 = c1422430n7R.LIZJ;
        C1419590n2r c1419590n2r = c1422430n7R.LIZIZ;
        TemplateCategoryData templateCategoryData = c1422430n7R.LIZ;
        c1419580n2q.getClass();
        C1419580n2q.LJIIIIZZ(shortVideoContext, i, i2, c1419590n2r, templateCategoryData, this);
    }
}
