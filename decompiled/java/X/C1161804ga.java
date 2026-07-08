package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SpacePostCategoryAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.SubSpaceFeedFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1161804ga extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ SubSpaceFeedFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161804ga(SubSpaceFeedFragment subSpaceFeedFragment) {
        super(1);
        this.LL = subSpaceFeedFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        View viewFindViewById;
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LL = C13LE.LIZ(SpacePostCategoryAssem.class);
        View view = this.LL.getView();
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.p7e);
        } else {
            viewFindViewById = null;
        }
        c696590RUb2.LLJ = viewFindViewById;
        return Unit.LIZ;
    }
}
