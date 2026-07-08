package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS29S0100001_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391140FVg implements C0FUG, C0FUD {
    public final Context LL;
    public final FrameLayout LLILLJJLI;
    public final C0FUH LLILLL;
    public final LifecycleOwner LLILZ;
    public final C390420FSm LLILZIL;
    public volatile boolean LLIZ;
    public C194331111d LLIZLLLIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1698));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(434));

    @Override // X.C0FUG
    public final void LIZJ() {
    }

    @Override // X.C0FUG
    public final void LJII(MotionEvent motionEvent) {
    }

    @Override // X.C0FUG
    public final void LJIIJJI(float f, int i, RectF rectF) {
    }

    @Override // X.C0FUD
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.C0FUD
    public final boolean LJIILJJIL(int i) {
        return false;
    }

    @Override // X.C0FUG
    public final void LJIILL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIZILJ() {
    }

    @Override // X.C0FUG
    public final void LJIJ(int i, EnumC1466150oFx enumC1466150oFx) {
    }

    @Override // X.C0FUG
    public final void LJIJI(int i, boolean z) {
    }

    @Override // X.C0FUG
    public final void LJJ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2) {
    }

    @Override // X.C0FUG
    public final void LJJI(int i, float f, float f2, RectF rectF) {
    }

    @Override // X.C0FUD
    public final boolean LJJIIJ(int i) {
        return false;
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

    public final void LJ() {
        if (this.LLIZ) {
            LJIIL();
            ((C1664680tQA) this.LLJ.getValue()).LIZLLL(AFwS234S0000000_5.get$arr$(597), true);
        }
    }

    public final RectF LJFF() {
        FrameLayout fakeLandScapeEntranceContainer;
        FrameLayout fakeLandScapeEntranceContainer2;
        if (!this.LLIZ) {
            return null;
        }
        LJIIL();
        C194331111d c194331111d = this.LLIZLLLIL;
        if (c194331111d != null && (fakeLandScapeEntranceContainer = c194331111d.getFakeLandScapeEntranceContainer()) != null) {
            float top = fakeLandScapeEntranceContainer.getTop();
            C194331111d c194331111d2 = this.LLIZLLLIL;
            if (c194331111d2 != null && (fakeLandScapeEntranceContainer2 = c194331111d2.getFakeLandScapeEntranceContainer()) != null) {
                return new RectF(this.LLILLJJLI.getLeft(), top, this.LLILLJJLI.getRight(), fakeLandScapeEntranceContainer2.getBottom());
            }
        }
        return null;
    }

    public final void LJIIIZ() {
        ((C1664680tQA) this.LLJ.getValue()).LIZLLL(AFwS234S0000000_5.get$arr$(598), true);
    }

    public final void LJIIL() {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new C194331111d(this.LL, null, 6);
            this.LLILLJJLI.addView(this.LLIZLLLIL, new FrameLayout.LayoutParams(-1, -1));
            C194331111d c194331111d = this.LLIZLLLIL;
            if (c194331111d != null) {
                c194331111d.LIZ(this.LLILZ, (C1664680tQA) this.LLJ.getValue());
            }
            C194331111d c194331111d2 = this.LLIZLLLIL;
            if (c194331111d2 == null) {
                return;
            }
            C14K9.LJJ(c194331111d2, 100102.0f);
        }
    }

    @Override // X.C0FUG
    public final void LJI() {
        LJ();
    }

    @Override // X.C0FUG
    public final void LJIL() {
        LJ();
    }

    @Override // X.C0FUG
    public final void LJJIII() {
        LJ();
    }

    @Override // X.C0FUG
    public final void LJIIIIZZ(int i) {
        LJIIIZ();
    }

    @Override // X.C0FUG
    public final void LJIIJ(int i) {
        LJIIIZ();
    }

    @Override // X.C0FUG
    public final void LJIILLIIL(int i) {
        LJIIIZ();
    }

    public final void LJIJJ(float f) {
        C1524705y1.LIZJ(new AwS29S0100001_5(this, f, 5));
    }

    public final BaseStickerModel LIZ(BaseStickerModel baseStickerModel, boolean z) {
        StickerModel stickerModelLJLI;
        RectF stickerBoundingRect = baseStickerModel.getStickerBoundingRect();
        C0FTJ c0ftjLIZ = C0FKU.LIZ(baseStickerModel.getId(), C390410FSl.LIZLLL(this.LLILZIL));
        if (c0ftjLIZ != null) {
            stickerModelLJLI = c0ftjLIZ.LJLI();
        } else {
            stickerModelLJLI = null;
        }
        if (stickerModelLJLI != null && (stickerModelLJLI instanceof TextStickerModel) && ((TextStickerModel) stickerModelLJLI).getCaptionModel() != null) {
            List<C0FTJ<StickerModel>> listLIZLLL = C390410FSl.LIZLLL(this.LLILZIL);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
            Iterator<C0FTJ<StickerModel>> it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJLI());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                StickerModel stickerModel = (StickerModel) obj;
                if ((stickerModel instanceof TextStickerModel) && C0F8Y.LJIIIIZZ((TextStickerModel) stickerModel)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((StickerModel) it3.next()).getBaseModel().getStickerBoundingRect());
            }
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                Object next = it4.next();
                if (it4.hasNext()) {
                    float fHeight = ((RectF) next).height();
                    do {
                        Object next2 = it4.next();
                        float fHeight2 = ((RectF) next2).height();
                        if (Float.compare(fHeight, fHeight2) < 0) {
                            next = next2;
                            fHeight = fHeight2;
                        }
                    } while (it4.hasNext());
                }
                float fHeight3 = ((RectF) next).height();
                float fCenterY = stickerBoundingRect.centerY();
                float f = fHeight3 / 2;
                stickerBoundingRect = new RectF(stickerBoundingRect.left, fCenterY - f, stickerBoundingRect.right, fCenterY + f);
            } else {
                throw new NoSuchElementException();
            }
        }
        Pair<Float, Float> pairLIZIZ = LIZIZ(stickerBoundingRect, z);
        if (pairLIZIZ.getFirst().floatValue() == 0.0f && pairLIZIZ.getSecond().floatValue() == 1.0f) {
            return baseStickerModel;
        }
        return BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModel.getTranslateY() + pairLIZIZ.getFirst().floatValue(), baseStickerModel.getScale() * pairLIZIZ.getSecond().floatValue(), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -12582913, 15, null);
    }

    public final Pair<Float, Float> LIZIZ(RectF rectF, boolean z) {
        FrameLayout fakeLandScapeEntranceContainer;
        FrameLayout fakeLandScapeEntranceContainer2;
        boolean z2;
        float height;
        float f;
        float fHeight = 1.0f;
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(0.0f), Float.valueOf(1.0f));
        if (!this.LLIZ) {
            return pair;
        }
        LJIIL();
        C194331111d c194331111d = this.LLIZLLLIL;
        if (c194331111d != null && (fakeLandScapeEntranceContainer = c194331111d.getFakeLandScapeEntranceContainer()) != null) {
            float top = fakeLandScapeEntranceContainer.getTop();
            C194331111d c194331111d2 = this.LLIZLLLIL;
            if (c194331111d2 != null && (fakeLandScapeEntranceContainer2 = c194331111d2.getFakeLandScapeEntranceContainer()) != null) {
                float bottom = fakeLandScapeEntranceContainer2.getBottom();
                RectF rectF2 = new RectF(this.LLILLJJLI.getLeft(), top, this.LLILLJJLI.getRight(), bottom);
                int iLJII = C1919207fS.LJII();
                if (RectF.intersects(rectF2, rectF) && rectF.height() > 0.0f) {
                    if (rectF.centerY() >= (top + bottom) / 2 && !z) {
                        z2 = false;
                        height = this.LLILLJJLI.getHeight() - bottom;
                    } else {
                        z2 = true;
                        height = top;
                    }
                    if (rectF.height() > height) {
                        fHeight = (height * 0.9f) / rectF.height();
                    }
                    RectF rectF3 = new RectF(rectF);
                    Matrix matrix = new Matrix();
                    matrix.postScale(fHeight, fHeight, rectF3.centerX(), rectF3.centerY());
                    matrix.mapRect(rectF3);
                    if (z2) {
                        f = (top - rectF3.bottom) - iLJII;
                    } else {
                        f = (bottom - rectF3.top) + iLJII;
                    }
                    return new Pair<>(Float.valueOf(f), Float.valueOf(fHeight));
                }
            }
        }
        return pair;
    }

    public final boolean LIZLLL(float f, int i, RectF rectF) {
        if (!this.LLIZ) {
            return false;
        }
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i, (List) this.LLILZLL.getValue());
        if (c0ftjLIZ != null) {
            c0ftjLIZ.LJIIIIZZ();
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f, rectF.centerX(), rectF.centerY());
        matrix.mapRect(rectF);
        RectF rectFLJFF = LJFF();
        if (rectFLJFF == null) {
            return false;
        }
        return RectF.intersects(rectFLJFF, rectF);
    }

    @Override // X.C0FUD
    public final boolean LJJIFFI(float f, int i, RectF rectF) {
        return LIZLLL(f, i, rectF);
    }

    @Override // X.C0FUD
    public final boolean LJJII(float f, int i, RectF rectF) {
        return LIZLLL(f, i, rectF);
    }

    public C391140FVg(Context context, FrameLayout frameLayout, C0FUH c0fuh, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        this.LL = context;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = c0fuh;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = c390420FSm;
    }

    @Override // X.C0FUD
    public final boolean LJIJJLI(float f, float f2, int i, RectF rectF, EnumC1466150oFx enumC1466150oFx) {
        return LIZLLL(f2, i, rectF);
    }
}
