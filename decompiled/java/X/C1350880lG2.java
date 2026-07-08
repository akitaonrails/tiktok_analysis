package X;

import com.ss.android.ugc.aweme.commercialize.feed.slide.SlideAdWebPreloadAssem;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lG2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350880lG2 extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ MainActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350880lG2(MainActivity mainActivity) {
        super(1);
        this.LL = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LLJI = new SlideAdWebPreloadAssem();
        c696590RUb2.LLJ = this.LL.findViewById(R.id.viewpager);
        return Unit.LIZ;
    }
}
