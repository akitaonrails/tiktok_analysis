package X;

import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPagingDurationComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qe9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558030qe9 extends C09AY implements Function1<C696590RUb, Unit> {
    public C1558030qe9() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LLIZLLLIL = R.id.viewpager;
        c696590RUb2.LL = C13LE.LIZ(ViewPagerPagingDurationComponent.class);
        return Unit.LIZ;
    }
}
