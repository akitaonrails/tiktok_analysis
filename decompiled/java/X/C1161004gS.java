package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.service.ISocPublishService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1161004gS extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ MainPageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161004gS(MainPageFragment mainPageFragment) {
        super(1);
        this.LL = mainPageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(ISocPublishService.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            c696590RUb2.LL = ((ISocPublishService) objPluggableSpi$default).LIZJ();
            c696590RUb2.LLJ = this.LL.getView();
            return Unit.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
