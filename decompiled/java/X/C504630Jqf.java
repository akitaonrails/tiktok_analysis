package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SpaceFeedTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504630Jqf extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504630Jqf(View view) {
        super(1);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LL = C13LE.LIZ(SpaceFeedTitleAssem.class);
        c696590RUb2.LLJ = this.LL;
        return Unit.LIZ;
    }
}
