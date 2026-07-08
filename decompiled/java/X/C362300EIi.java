package X;

import Y.AObjectS240S0100000_5;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0EIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.guide.guideitem.AutoSelectGuideItem$tryShowAIPlaygroundGuide$1", f = "AutoSelectGuideItem.kt", l = {87}, m = "invokeSuspend")
public final class C362300EIi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C362290EIh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C362300EIi(C362290EIh c362290EIh, InterfaceC1364105Vn<? super C362300EIi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c362290EIh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C362300EIi(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0EGY c0egy;
        InterfaceC359940E9g interfaceC359940E9gAZ0;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        LiveEvent<Unit> liveEventDx0;
        C1C7U.LIZ("AutoSelectGuideItem@266c.tryShowAIPlaygroundGuide$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("AutoSelectGuideItem@266c.tryShowAIPlaygroundGuide$1");
                return objLJFF;
            }
        }
        C362290EIh c362290EIh = this.LLILLJJLI;
        if (C1428470nHB.LJFF(c362290EIh.LLILZ) && !C363750ENx.LIZIZ("AI_PLAYGROUND_GUIDE_SHOW") && !c362290EIh.LL.isFinishing() && !c362290EIh.LL.isDestroyed() && (c0egy = (C0EGY) c362290EIh.LLIZ.getValue(c362290EIh, C362290EIh.LLJ[1])) != null && (interfaceC359940E9gAZ0 = c0egy.AZ0()) != null) {
            RecyclerView recyclerViewLLII = interfaceC359940E9gAZ0.LLII();
            List<C361980EHc> listLJIILJJIL = interfaceC359940E9gAZ0.LJIILJJIL();
            if (listLJIILJJIL != null) {
                Iterator<C361980EHc> it2 = listLJIILJJIL.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it2.next().LJI, "bottom_item_edit_ai_video")) {
                        if (i2 >= 0 && i2 < listLJIILJJIL.size() && recyclerViewLLII != null && (viewHolderFindViewHolderForAdapterPosition = recyclerViewLLII.findViewHolderForAdapterPosition(i2)) != null) {
                            C450720Hlu c450720Hlu = new C450720Hlu(new ContextThemeWrapper(c362290EIh.LL, R.style.y0));
                            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                            c1391600mJi.LIZIZ = view;
                            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                            c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                            c450720Hlu.LJIIJ(2131829712);
                            C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
                            c0p0tLIZIZ.show();
                            C363750ENx.LJ("AI_PLAYGROUND_GUIDE_SHOW");
                            InterfaceC359950E9h interfaceC359950E9h = (InterfaceC359950E9h) c362290EIh.LLIZLLLIL.getValue(c362290EIh, C362290EIh.LLJ[2]);
                            if (interfaceC359950E9h != null && (liveEventDx0 = interfaceC359950E9h.Dx0()) != null) {
                                liveEventDx0.LIZ(c362290EIh.LLILLL, new AObjectS240S0100000_5(c0p0tLIZIZ, 165));
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoSelectGuideItem@266c.tryShowAIPlaygroundGuide$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
