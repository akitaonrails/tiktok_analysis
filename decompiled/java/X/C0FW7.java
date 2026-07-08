package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FW7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FW7 extends C0FUM implements InterfaceC19530911b9, C0FUG {
    public final Context LL;
    public final FrameLayout LLILLJJLI;
    public final List<C0FTJ<StickerModel>> LLILLL;
    public final LifecycleOwner LLILZ;
    public final Function0<Unit> LLILZIL;
    public final C0ZDN LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1018));

    @Override // X.C0FUG
    public final void LIZJ() {
    }

    @Override // X.C0FUG
    public final void LJI() {
    }

    @Override // X.C0FUG
    public final void LJII(MotionEvent motionEvent) {
    }

    @Override // X.C0FUG
    public final void LJIIIIZZ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIILLIIL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIZILJ() {
    }

    @Override // X.C0FUG
    public final void LJIJ(int i, EnumC1466150oFx enumC1466150oFx) {
    }

    @Override // X.C0FUG
    public final void LJIL() {
    }

    @Override // X.C0FUG
    public final void LJJ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2) {
    }

    @Override // X.C0FUG
    public final void LJJIII() {
    }

    @Override // X.C0FUG
    public final void LJJIIJZLJL() {
    }

    @Override // X.C0FUG
    public final void LJJIIZ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2, RectF rectF, float f3) {
    }

    @Override // X.C0FUG
    public final void LJJIJ() {
    }

    @Override // X.C0FUG
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.C0FUG
    public final int getPriority() {
        return 100;
    }

    @Override // X.InterfaceC19530911b9
    public final void LJJIIZI() {
        C786410Ut5.LJJJZ(LJJIL(), this.LLILLJJLI);
    }

    public final C0FTJ<StickerModel> LJJIJL() {
        C0FTJ<StickerModel> next;
        TextStickerModel textStickerModel;
        Iterator<C0FTJ<StickerModel>> it2 = this.LLILLL.iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            StickerModel stickerModelLJLI = next.LJLI();
            if ((stickerModelLJLI instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModelLJLI) != null && C0F8Y.LJII(textStickerModel)) {
                break;
            }
        }
        return next;
    }

    public final C0FTJ<StickerModel> LJJIJLIJ() {
        C0FTJ<StickerModel> next;
        Iterator<C0FTJ<StickerModel>> it2 = this.LLILLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.getStickerType() == EnumC1466150oFx.AI_CAPTION_TAG) {
                break;
            }
        }
        return next;
    }

    public final View LJJIL() {
        return (View) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC19530911b9
    public final void LJIIL() {
        C0FTJ<StickerModel> c0ftjLJJIJLIJ;
        C0FFE c0ffe;
        C0FTJ<StickerModel> c0ftjLJJIJL = LJJIJL();
        if (c0ftjLJJIJL == null || (c0ftjLJJIJLIJ = LJJIJLIJ()) == null) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0FW8(c0ftjLJJIJL, c0ftjLJJIJLIJ, this, null), 3);
        if (!(c0ftjLJJIJLIJ instanceof C0FFE) || (c0ffe = (C0FFE) c0ftjLJJIJLIJ) == null) {
            return;
        }
        c0ffe.LJJIJ().LIZ(new C2217381BqS() { // from class: X.0FW9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateY());
            }
        }).LJIIIZ(this.LLILZ, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 846));
    }

    public final void LJJIJIL() {
        BaseStickerModel baseStickerModelLJJIIJZLJL;
        RectF stickerBoundingRect;
        C0FTJ<StickerModel> c0ftjLJJIJLIJ;
        BaseStickerModel baseStickerModelLJJIIJZLJL2;
        RectF stickerBoundingRect2;
        int measuredWidth;
        C0FTJ<StickerModel> c0ftjLJJIJL = LJJIJL();
        if (c0ftjLJJIJL == null || (baseStickerModelLJJIIJZLJL = c0ftjLJJIJL.LJJIIJZLJL()) == null || (stickerBoundingRect = baseStickerModelLJJIIJZLJL.getStickerBoundingRect()) == null || (c0ftjLJJIJLIJ = LJJIJLIJ()) == null || (baseStickerModelLJJIIJZLJL2 = c0ftjLJJIJLIJ.LJJIIJZLJL()) == null || (stickerBoundingRect2 = baseStickerModelLJJIIJZLJL2.getStickerBoundingRect()) == null) {
            return;
        }
        float f = stickerBoundingRect.bottom;
        float f2 = stickerBoundingRect2.bottom;
        if (f < f2) {
            f = f2;
        }
        View viewLJJIL = LJJIL();
        float fCenterX = stickerBoundingRect.centerX();
        View viewLJJIL2 = LJJIL();
        if (viewLJJIL2.getWidth() > 0) {
            measuredWidth = viewLJJIL2.getWidth();
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            viewLJJIL2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            measuredWidth = viewLJJIL2.getMeasuredWidth();
        }
        C786410Ut5.Fd(viewLJJIL, fCenterX - (measuredWidth / 2.0f));
        C786410Ut5.Ld(LJJIL(), f);
    }

    @Override // X.InterfaceC19530911b9
    public final void LIZ(boolean z) {
        LJJIL().setClickable(z);
    }

    @Override // X.C0FUG
    public final void LJIILL(int i) {
        LJJIZ(i);
    }

    public final void LJJIZ(int i) {
        C0FTJ<StickerModel> c0ftjLJJIJL = LJJIJL();
        if (c0ftjLJJIJL != null && c0ftjLJJIJL.getStickerId() == i) {
            LJJIJIL();
        }
    }

    @Override // X.C0FUG
    public final void LJIJI(int i, boolean z) {
        C0FTJ<StickerModel> next;
        int i2;
        BaseStickerModel baseStickerModelLJJIIJZLJL;
        if (LJJIL().getParent() == null) {
            return;
        }
        Iterator<C0FTJ<StickerModel>> it2 = this.LLILLL.iterator();
        while (true) {
            next = null;
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            StickerModel stickerModelLJLI = next.LJLI();
            if ((stickerModelLJLI instanceof AICaptionTagStickerModel) && stickerModelLJLI != null) {
                break;
            }
        }
        C0FTJ<StickerModel> c0ftj = next;
        if (c0ftj != null && (baseStickerModelLJJIIJZLJL = c0ftj.LJJIIJZLJL()) != null && baseStickerModelLJJIIJZLJL.getId() == i) {
            View viewLJJIL = LJJIL();
            if (!z) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, viewLJJIL);
        }
    }

    @Override // X.C0FUG
    public final void LJIIJJI(float f, int i, RectF rectF) {
        LJJIZ(i);
    }

    @Override // X.C0FUG
    public final void LJJI(int i, float f, float f2, RectF rectF) {
        LJJIZ(i);
    }

    public C0FW7(Context context, FrameLayout frameLayout, List list, LifecycleOwner lifecycleOwner, AwS549S0100000_5 awS549S0100000_5) {
        this.LL = context;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = list;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = awS549S0100000_5;
        this.LLILZLL = new C0ZDN(context);
    }
}
