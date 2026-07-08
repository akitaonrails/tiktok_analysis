package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitDraftService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder$updateCameoAvatar$1$1", f = "DraftBoxTaskItemViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C551530Lk7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftBoxTaskItemViewHolder LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551530Lk7(DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder, String str, InterfaceC1364105Vn<? super C551530Lk7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxTaskItemViewHolder;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C551530Lk7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IAIPortraitDraftService iAIPortraitDraftServiceLJI;
        View viewLIZJ;
        C1C7U.LIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder = this.LL;
        if (draftBoxTaskItemViewHolder.LLJJJJLIIL == null) {
            FrameLayout frameLayout = (FrameLayout) draftBoxTaskItemViewHolder.getItemView().findViewById(R.id.d9h);
            if (frameLayout != null) {
                C786410Ut5.Pb(frameLayout, 1.125f);
                C786410Ut5.qc(frameLayout, 1.125f);
                C786410Ut5.U4(frameLayout, 0.8f);
            } else {
                frameLayout = null;
            }
            draftBoxTaskItemViewHolder.LLJJJJLIIL = frameLayout;
        }
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && (iAIPortraitDraftServiceLJI = iAIPortraitFeatureServiceLIZ.LJI()) != null && (viewLIZJ = iAIPortraitDraftServiceLJI.LIZJ(this.LL.getItemView().getContext(), this.LLILLJJLI)) != null) {
            ViewGroup viewGroup = this.LL.LLJJJJLIIL;
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
                viewGroup.addView(viewLIZJ);
                C337180DJs.LIZJ(viewGroup);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1$1");
        return unit2;
    }
}
