package X;

import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAssem;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1160904gR extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ MainPageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160904gR(MainPageFragment mainPageFragment) {
        super(1);
        this.LL = mainPageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LL = C13LE.LIZ(MainPageSeekAssem.class);
        c696590RUb2.LLJ = this.LL.getView();
        return Unit.LIZ;
    }
}
