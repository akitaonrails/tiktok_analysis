package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.assem.SendSpacePostAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment.SubOnlySpacePostTopicFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501800Jm6 extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ SubOnlySpacePostTopicFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501800Jm6(SubOnlySpacePostTopicFragment subOnlySpacePostTopicFragment) {
        super(1);
        this.LL = subOnlySpacePostTopicFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LL = C13LE.LIZ(SendSpacePostAssem.class);
        SubOnlySpacePostTopicFragment subOnlySpacePostTopicFragment = this.LL;
        View viewFindViewById = subOnlySpacePostTopicFragment.LL;
        if (viewFindViewById == null) {
            View view = subOnlySpacePostTopicFragment.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.zsh);
            } else {
                viewFindViewById = null;
            }
            subOnlySpacePostTopicFragment.LL = (C16FS) viewFindViewById;
        }
        c696590RUb2.LLJ = viewFindViewById;
        return Unit.LIZ;
    }
}
