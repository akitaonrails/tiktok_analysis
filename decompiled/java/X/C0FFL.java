package X;

import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FFL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FFL extends C0FFD {
    public final Context LJIJJLI;
    public final TextStickerModel LJIL;
    public final FrameLayout LJJ;
    public final C0FFO LJJI;
    public final LifecycleOwner LJJIFFI;
    public final C390420FSm LJJII;
    public final C01GW LJJIII;
    public final C01GW LJJIIJ;
    public final C01GW LJJIIJZLJL;
    public final C01GW LJJIIZ;

    @Override // X.C0FFD
    public final void LJJJLL() {
        LLD(true);
    }

    @Override // X.C0FFE
    public final C388890FMp LJJIJIIJI() {
        return (C388890FMp) this.LJJIII.getValue();
    }

    @Override // X.C0FFE
    public final void LJJIZ() {
        C0FTJ<StickerModel> next;
        float width;
        int height;
        float translateX;
        float fLIZIZ;
        if (this.LJIL.getSourceType() == C0F7S.AI_CREATE) {
            FrameLayout frameLayout = this.LJJ;
            C385340F8y c385340F8yLJJLI = LJJLI();
            TextStickerModel textStickerModel = this.LJIL;
            Iterator<C0FTJ<StickerModel>> it2 = C390410FSl.LIZLLL(this.LJJII).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (next instanceof C390150FRl) {
                        break;
                    }
                }
            }
            C0FTJ<StickerModel> c0ftj = next;
            StickerModel stickerModelLJLI = c0ftj != null ? c0ftj.LJLI() : null;
            AddYoursStickerModel addYoursStickerModel = stickerModelLJLI instanceof AddYoursStickerModel ? (AddYoursStickerModel) stickerModelLJLI : null;
            Point point = new Point((frameLayout.getLeft() + frameLayout.getRight()) / 2, (frameLayout.getTop() + frameLayout.getBottom()) / 2);
            if (addYoursStickerModel != null) {
                width = addYoursStickerModel.getBaseStickerModel().getWidth();
                translateX = addYoursStickerModel.getBaseStickerModel().getTranslateX();
                height = addYoursStickerModel.getBaseStickerModel().getHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            } else {
                width = 0.0f;
                height = 0;
                translateX = 0.0f;
            }
            c385340F8yLJJLI.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getRight() - frameLayout.getLeft(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            float measuredWidth = c385340F8yLJJLI.getMeasuredWidth() * textStickerModel.getBaseStickerModel().getScale();
            float measuredHeight = c385340F8yLJJLI.getMeasuredHeight() * textStickerModel.getBaseStickerModel().getScale();
            int containerLeft = point.x;
            if (containerLeft <= 0) {
                containerLeft = textStickerModel.getBaseStickerModel().getContainerLeft() + (textStickerModel.getBaseStickerModel().getContainerWidth() / 2);
            }
            int containerTop = point.y;
            if (containerTop <= 0) {
                containerTop = textStickerModel.getBaseStickerModel().getContainerTop() + (textStickerModel.getBaseStickerModel().getContainerHeight() / 2);
            }
            if (addYoursStickerModel != null) {
                fLIZIZ = translateX + ((((width - measuredWidth) / 2.0f) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * textStickerModel.getBaseStickerModel().getScale())) * (C426750GoL.LIZLLL(c385340F8yLJJLI.getContext()) ? 1 : -1));
            } else {
                fLIZIZ = (((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) * textStickerModel.getBaseStickerModel().getScale()) + (measuredWidth / 2.0f)) - containerLeft) * (C426750GoL.LIZLLL(c385340F8yLJJLI.getContext()) ? -1 : 1);
            }
            LJIIJJI(TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ, ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(158)) + (measuredHeight / 2.0f)) + height) - containerTop, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291457, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, true, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -8194, 65535, null));
        }
    }

    @Override // X.C0FFD
    public final void LJJL() {
        LJJJJ(this.LJJ);
        C390420FSm c390420FSm = this.LJJII;
        C1664680tQA<TextStickerModel> c1664680tQALJJJZ = LJJJZ();
        C0FFP c0ffpLJJIL = LJJIL();
        C0FF8 c0ff8LIZ = this.LJIILLIIL.LIZ();
        LIZ(new C0FES(c390420FSm, c1664680tQALJJJZ, c0ffpLJJIL, c0ff8LIZ != null ? c0ff8LIZ.LJIILLIIL() : null, this.LJIIZILJ));
    }

    public final C385340F8y LJJLI() {
        return (C385340F8y) this.LJJIIJ.getValue();
    }

    @Override // X.C0FFE
    public final void LJJJ() {
        C0FK0 c0fk0LJIILLIIL;
        if (LJJIJL().LIZ.LJIILJJIL) {
            C0FF8 c0ff8LIZ = this.LJIILLIIL.LIZ();
            if (c0ff8LIZ != null && (c0fk0LJIILLIIL = c0ff8LIZ.LJIILLIIL()) != null && c0fk0LJIILLIIL.LJIJI) {
                super.LJJJ();
                return;
            }
            C388890FMp c388890FMpLJJIJIIJI = LJJIJIIJI();
            if (c388890FMpLJJIJIIJI != null) {
                c388890FMpLJJIJIIJI.LIZ(new AwS584S0100000_5(this, 9));
            }
        }
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        if (C0F8Y.LJIIJ(LJJJZ().LIZ)) {
            LJJJZ();
            return new C390770FTv(LJJIJ(), (C386770FEl) this.LJJIIJZLJL.getValue(), this.LJJII);
        }
        if (C0F8Y.LJIIJJI(LJJJZ().LIZ)) {
            LJJJZ();
            return new C390740FTs(LJJIJ(), (C386740FEi) this.LJJIIZ.getValue(), this.LJJII);
        }
        Context context = this.LJIJJLI;
        C390420FSm c390420FSm = this.LJJII;
        LJJIJL();
        C0FF8 c0ff8LIZ = this.LJIILLIIL.LIZ();
        return new C390760FTu(this, context, c390420FSm, c0ff8LIZ != null ? c0ff8LIZ.LJIILLIIL() : null);
    }

    @Override // X.C0FFD, X.C0FFE
    public final void LJJJIL() {
        super.LJJJIL();
        LJJIJ().LIZ(new C2217381BqS() { // from class: X.0FFM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getAlpha());
            }
        }).LJIIIZ(this.LJJIFFI, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 10));
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return C0F8Y.LJIIJ(LJJJZ().LIZ) ? (View) this.LJJIIJZLJL.getValue() : C0F8Y.LJIIJJI(LJJJZ().LIZ) ? (View) this.LJJIIZ.getValue() : LJJLI();
    }

    @Override // X.C0FFD
    public final void LJJJLZIJ() {
        HandlerHook.viewPost(LJJLI(), new ARunnableS105S0100000_5(this, 1));
    }

    @Override // X.C0FFD, X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJJIFFI;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJJI;
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        TextStickerModel textStickerModel;
        if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null) {
            LJJJZ().LIZLLL(new AwS584S0100000_5(textStickerModel, 11), true);
            LJJJLIIL(((TextStickerModel) stickerModel).getBaseStickerModel());
        }
        super.LJIIJJI(stickerModel);
        LJJJLZIJ();
    }

    public C0FFL(Context context, TextStickerModel textStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, textStickerModel, c0ffo, lifecycleOwner, c390420FSm);
        this.LJIJJLI = context;
        this.LJIL = textStickerModel;
        this.LJJ = frameLayout;
        this.LJJI = c0ffo;
        this.LJJIFFI = lifecycleOwner;
        this.LJJII = c390420FSm;
        this.LJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 24));
        this.LJJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 26));
        this.LJJIIJZLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 25));
        this.LJJIIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 27));
    }
}
