package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.assem.PostTopicListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501740Jm0 extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ RecyclerView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501740Jm0(RecyclerView recyclerView) {
        super(1);
        this.LL = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LL = C13LE.LIZ(PostTopicListAssem.class);
        c696590RUb2.LLJ = this.LL;
        return Unit.LIZ;
    }
}
