package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0FRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390070FRd extends C0FUM implements C0FUG {
    public final FrameLayout LL;
    public final List<C0FTJ<StickerModel>> LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public Integer LLILZ;
    public Integer LLILZIL;

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
    public final void LJIJI(int i, boolean z) {
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

    public final void LJJIJIL() {
        C0FTJ<StickerModel> next;
        C0FTJ<StickerModel> next2;
        AICaptionTagStickerModel aICaptionTagStickerModel;
        Iterator<C0FTJ<StickerModel>> it2 = this.LLILLJJLI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            int stickerId = next.getStickerId();
            Integer num = this.LLILZ;
            if (num != null && stickerId == num.intValue()) {
                break;
            }
        }
        C0FTJ<StickerModel> c0ftj = next;
        if (c0ftj == null) {
            return;
        }
        Iterator<C0FTJ<StickerModel>> it3 = this.LLILLJJLI.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            int stickerId2 = next2.getStickerId();
            Integer num2 = this.LLILZIL;
            if (num2 != null && stickerId2 == num2.intValue()) {
                break;
            }
        }
        C0FTJ<StickerModel> c0ftj2 = next2;
        if (c0ftj2 == null) {
            return;
        }
        StickerModel stickerModelLJLI = c0ftj.LJLI();
        if (!(stickerModelLJLI instanceof AICaptionTagStickerModel) || (aICaptionTagStickerModel = (AICaptionTagStickerModel) stickerModelLJLI) == null) {
            return;
        }
        BaseStickerModel baseStickerModelLJJIIJZLJL = c0ftj2.LJJIIJZLJL();
        float rotation = c0ftj2.LJJIIJZLJL().getRotation();
        if (baseStickerModelLJJIIJZLJL.getHeight() == 0 || aICaptionTagStickerModel.getBaseStickerModel().getHeight() == 0) {
            return;
        }
        float height = ((baseStickerModelLJJIIJZLJL.getHeight() / 2.0f) * baseStickerModelLJJIIJZLJL.getScale()) + (aICaptionTagStickerModel.getBaseStickerModel().getHeight() / 2.0f);
        if (!aICaptionTagStickerModel.getSolidSpace() && !c0ftj2.LJLI().isVERenderSticker()) {
            height -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        double d = rotation;
        c0ftj.LJIIJJI(AICaptionTagStickerModel.copy$default(aICaptionTagStickerModel, BaseStickerModel.copy$default(aICaptionTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModelLJJIIJZLJL.getTranslateX() + (height * ((float) Math.sin(Math.toRadians(d)))), baseStickerModelLJJIIJZLJL.getTranslateY() - (height * ((float) Math.cos(Math.toRadians(d)))), 0.0f, rotation, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -23068673, 15, null), false, false, 0.0f, false, false, 62, null));
    }

    @Override // X.C0FUG
    public final void LJIILL(int i) {
        LJJIJL(i);
    }

    public final void LJJIJL(int i) {
        Integer num = this.LLILZIL;
        if (num != null && num.intValue() == i) {
            LJJIJIL();
        }
    }

    @Override // X.C0FUG
    public final void LJIJ(int i, EnumC1466150oFx enumC1466150oFx) {
        LJJIJL(i);
    }

    public C390070FRd(FrameLayout frameLayout, List list, LifecycleOwner lifecycleOwner) {
        this.LL = frameLayout;
        this.LLILLJJLI = list;
        this.LLILLL = lifecycleOwner;
    }

    @Override // X.C0FUG
    public final void LJIIJJI(float f, int i, RectF rectF) {
        LJJIJL(i);
    }

    @Override // X.C0FUG
    public final void LJJI(int i, float f, float f2, RectF rectF) {
        LJJIJL(i);
    }
}
