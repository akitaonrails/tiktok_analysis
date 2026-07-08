package X;

import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerScrollAngleComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579250rCN extends C09AY implements Function1<C05K2, Unit> {
    public C1579250rCN() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C05K2 c05k2) {
        C05K2 c05k22 = c05k2;
        c05k22.LIZJ = R.id.viewpager;
        c05k22.LIZLLL = C13LE.LIZ(ViewPagerScrollAngleComponent.class);
        c05k22.LIZ = new C0T4Z();
        c05k22.LIZIZ = EnumC1579210rCJ.SPARSE;
        return Unit.LIZ;
    }
}
