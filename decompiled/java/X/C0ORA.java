package X;

import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageInteractionAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0ORA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ORA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BulletinPageInteractionAssem LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ BulletinBaseItem LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ C817403Hg LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ List<C0OSR> LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ C817403Hg LLJ;
    public final /* synthetic */ float LLJI;
    public final /* synthetic */ View LLJIJIL;
    public final /* synthetic */ C817403Hg LLJILJIL;
    public final /* synthetic */ float LLJILJILJ;
    public final /* synthetic */ int LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ORA(BulletinPageInteractionAssem bulletinPageInteractionAssem, ViewGroup viewGroup, BulletinBaseItem bulletinBaseItem, View view, C817403Hg c817403Hg, View view2, List<C0OSR> list, float f, C817403Hg c817403Hg2, float f2, View view3, C817403Hg c817403Hg3, float f3, int i) {
        super(0);
        this.LL = bulletinPageInteractionAssem;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = bulletinBaseItem;
        this.LLILZ = view;
        this.LLILZIL = c817403Hg;
        this.LLILZLL = view2;
        this.LLIZ = list;
        this.LLIZLLLIL = f;
        this.LLJ = c817403Hg2;
        this.LLJI = f2;
        this.LLJIJIL = view3;
        this.LLJILJIL = c817403Hg3;
        this.LLJILJILJ = f3;
        this.LLJILLL = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, android.animation.ObjectAnimator, android.animation.ValueAnimator] */
    /* JADX WARN: Type inference failed for: r13v8, types: [T, android.animation.ObjectAnimator, android.animation.ValueAnimator] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        float fMax;
        List<String> list;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvOo = this.LL.Oo();
        ViewGroup viewGroup = this.LLILLJJLI;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewOnAttachStateChangeListenerC20604515jvOo, viewGroup);
        viewOnAttachStateChangeListenerC20604515jvOo.removeView(viewGroup);
        ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
        layoutParams.width = this.LL.No().getWidth();
        C786410Ut5.X5(layoutParams, this.LLILLJJLI);
        if (this.LLILLL instanceof C0OOP) {
            Drawable.ConstantState constantState = this.LLILZ.findViewById(R.id.d0b).getBackground().getConstantState();
            Drawable drawableNewDrawable = constantState != null ? constantState.newDrawable() : null;
            View viewFindViewById = this.LLILLJJLI.findViewById(R.id.d0b);
            if (viewFindViewById != null) {
                viewFindViewById.setBackground(drawableNewDrawable);
            }
        }
        if (C0C0T.LIZ()) {
            q0.LJIJ(this.LLILLJJLI, null);
            this.LLILLJJLI.setImportantForAccessibility(4);
        }
        FrameLayout frameLayoutNo = this.LL.No();
        if (frameLayoutNo != null) {
            frameLayoutNo.addView(this.LLILLJJLI);
        }
        FrameLayout frameLayoutNo2 = this.LL.No();
        if (frameLayoutNo2 != null) {
            C786410Ut5.U4(frameLayoutNo2, 1.0f);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_7283948925_bb_longpress_flicker", true, true)) {
            this.LL.LLJJJ = this.LLILZIL.element;
        }
        FrameLayout frameLayoutNo3 = this.LL.No();
        if (frameLayoutNo3 != null) {
            C786410Ut5.fd(frameLayoutNo3, this.LLILZIL.element);
        }
        float fMin = Math.min(this.LLILZLL.getWidth(), this.LLILZLL.getHeight()) * 0.1f;
        float width = (this.LLILZLL.getWidth() - fMin) / this.LLILZLL.getWidth();
        float height = (this.LLILZLL.getHeight() - fMin) / this.LLILZLL.getHeight();
        View viewFindViewById2 = this.LLILLJJLI.findViewById(R.id.d0b);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewFindViewById2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, width), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, height));
        objectAnimatorOfPropertyValuesHolder.setDuration(150L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LJI());
        View viewFindViewById3 = this.LLILLJJLI.findViewById(R.id.d1c);
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        if (viewFindViewById3 != null && (!(viewFindViewById3 instanceof ViewStub))) {
            float fMin2 = Math.min(viewFindViewById3.getWidth(), viewFindViewById3.getHeight()) * 0.1f;
            float width2 = (viewFindViewById3.getWidth() - fMin2) / viewFindViewById3.getWidth();
            float height2 = (viewFindViewById3.getHeight() - fMin2) / viewFindViewById3.getHeight();
            ?? OfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewFindViewById3, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, width2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, height2));
            OfPropertyValuesHolder.setDuration(150L);
            OfPropertyValuesHolder.setInterpolator(C1619980sG4.LJI());
            c259800zU.element = OfPropertyValuesHolder;
            ?? OfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(viewFindViewById3, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, width2, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, height2, 1.0f));
            OfPropertyValuesHolder2.setDuration(250L);
            OfPropertyValuesHolder2.setInterpolator(C1619980sG4.LJI());
            c259800zU2.element = OfPropertyValuesHolder2;
        }
        View viewFindViewById4 = this.LLILLJJLI.findViewById(R.id.d09);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(viewFindViewById4.getHeight(), 0);
        valueAnimatorOfInt.setDuration(150L);
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LJI());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(viewFindViewById4, 5));
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(viewFindViewById2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, width, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, height, 1.0f));
        objectAnimatorOfPropertyValuesHolder2.setDuration(250L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(C1619980sG4.LJI());
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderWith = animatorSet.play(objectAnimatorOfPropertyValuesHolder).with(valueAnimatorOfInt);
        Animator animator = (Animator) c259800zU.element;
        if (animator != null) {
            builderWith.with(animator);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet2.play(objectAnimatorOfPropertyValuesHolder2);
        Animator animator2 = (Animator) c259800zU2.element;
        if (animator2 != null) {
            builderPlay.with(animator2);
        }
        float height3 = this.LLILLJJLI.getHeight();
        float fMax2 = Math.max(C418440Gaw.LIZIZ(Integer.valueOf((this.LLIZ.size() * 49) + 8 + 8)), BulletinPageInteractionAssem.ap(this.LL, this.LLILLL) ? C418440Gaw.LIZIZ(60) : 0.0f);
        float f = this.LLILZIL.element + height3;
        float fLIZIZ = (this.LLIZLLLIL - this.LLJ.element) - C418440Gaw.LIZIZ(12);
        float f2 = (f + fMax2) - fLIZIZ;
        if (f2 > 0.0f) {
            C817403Hg c817403Hg = this.LLILZIL;
            c817403Hg.element = Math.max(c817403Hg.element - f2, this.LLJI);
            FrameLayout frameLayoutNo4 = this.LL.No();
            if (frameLayoutNo4 != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayoutNo4, (Property<FrameLayout, Float>) View.TRANSLATION_Y, this.LLILZIL.element);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.setInterpolator(new C0ORQ(1.871f));
                builderWith.with(objectAnimatorOfFloat);
            }
        }
        View view = viewFindViewById2;
        float left = 0.0f;
        if (viewFindViewById2 != null) {
            while (!Intrinsics.LJFF(view, this.LLJIJIL)) {
                left += view.getLeft();
                Object parent = view.getParent();
                if (!(parent instanceof View) || (view = (View) parent) == null) {
                    break;
                }
            }
        }
        float fLIZIZ2 = this.LLILLL instanceof C0OOP ? C418440Gaw.LIZIZ(4) : 0.0f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[BulletinPageInteractionAssem]mockCellHeight ");
        sbLIZ.append(height3);
        sbLIZ.append(", totalMenuHeight ");
        sbLIZ.append(fMax2);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[BulletinPageInteractionAssem]mockCellBottomInFragment ");
        sbLIZ2.append(f);
        sbLIZ2.append(", availableBottomSpace ");
        sbLIZ2.append(fLIZIZ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[BulletinPageInteractionAssem]overlapDistance ");
        sbLIZ3.append(f2);
        sbLIZ3.append(", final cellTransY ");
        sbLIZ3.append(this.LLILZIL.element);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
        if (BulletinPageInteractionAssem.ap(this.LL, this.LLILLL)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C13LP.LL(((BulletinEmojiViewModel) this.LL.LLJJ.getValue()).vQ2(), 5));
            if (arrayList2.size() < 5 && (list = C456350Huz.LIZ.content) != null) {
                arrayList2.addAll(list);
            }
            List listLL = C13LP.LL(C13LP.LJJJJI(arrayList2), 5);
            BulletinBaseItem bulletinBaseItem = this.LLILLL;
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C618760OOs((String) it2.next(), 0, String.valueOf(bulletinBaseItem.LJJJ()), 2));
            }
            arrayList.add(new C618760OOs(null, EnumC618770OOt.ACTION.getType(), String.valueOf(this.LLILLL.LJJJ()), 1));
            this.LL.So().getState().LJIILL(arrayList, null);
            float height4 = this.LLILLJJLI.getHeight() - this.LLILLJJLI.getPaddingBottom();
            float f3 = this.LLILZIL.element;
            float f4 = height4 + f3;
            float f5 = this.LLJI;
            float height5 = f4 < f5 ? (this.LLILLJJLI.getHeight() - this.LLILLJJLI.getPaddingBottom()) + this.LLILZIL.element + C418440Gaw.LIZIZ(12) : Math.max(0.0f, f3 - (f5 - this.LLJILJIL.element));
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvSo = this.LL.So();
            if (C426750GoL.LJ(this.LL.So())) {
                fMax = -(this.LL.Vo().To() ? Math.max(((this.LLJILJILJ - C418440Gaw.LIZIZ(312)) - left) - fLIZIZ2, 0.0f) : Math.max(((this.LLJILJILJ - left) - viewFindViewById2.getWidth()) - ((C418440Gaw.LIZIZ(312) / 2.0f) - (viewFindViewById2.getWidth() / 2.0f)), 0.0f));
            } else {
                fMax = this.LL.Vo().To() ? Math.max(((viewFindViewById2.getWidth() + left) - C418440Gaw.LIZIZ(312)) - fLIZIZ2, 0.0f) : Math.max(((viewFindViewById2.getWidth() / 2.0f) + left) - (C418440Gaw.LIZIZ(312) / 2.0f), 0.0f);
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnAttachStateChangeListenerC20604515jvSo);
            viewOnAttachStateChangeListenerC20604515jvSo.setTranslationX(fMax);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvSo2 = this.LL.So();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnAttachStateChangeListenerC20604515jvSo2);
            viewOnAttachStateChangeListenerC20604515jvSo2.setTranslationY(height5);
            C786410Ut5.s5(this.LL.So(), 0.0f);
            C12ES.LJIILL(0, this.LL.So());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LL.So(), "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(250L);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJI());
            ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this.LL.So(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.1f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.1f, 1.0f));
            objectAnimatorOfPropertyValuesHolder3.setDuration(250L);
            objectAnimatorOfPropertyValuesHolder3.setInterpolator(new C0ORQ(1.871f));
            builderPlay.with(objectAnimatorOfFloat2).with(objectAnimatorOfPropertyValuesHolder3);
        } else {
            C0DTR.LIZIZ(this.LL.So());
        }
        if (this.LLIZ.isEmpty()) {
            C0DTR.LIZIZ(this.LL.Go());
        } else {
            this.LL.Go().getState().LJIILL(this.LLIZ, null);
            float height6 = ((this.LLILZIL.element + this.LLJILLL) - viewFindViewById4.getHeight()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = this.LL.Go();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnAttachStateChangeListenerC20604515jvGo);
            viewOnAttachStateChangeListenerC20604515jvGo.setTranslationY(height6);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo2 = this.LL.Go();
            float width3 = C426750GoL.LJ(this.LL.Go()) ? this.LL.Vo().To() ? -(((this.LLJILJILJ - left) - C418440Gaw.LIZIZ(208)) - fLIZIZ2) : -(((this.LLJILJILJ - left) - viewFindViewById2.getWidth()) + fLIZIZ2) : this.LL.Vo().To() ? ((left + viewFindViewById2.getWidth()) - C418440Gaw.LIZIZ(208)) - fLIZIZ2 : left + fLIZIZ2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnAttachStateChangeListenerC20604515jvGo2);
            viewOnAttachStateChangeListenerC20604515jvGo2.setTranslationX(width3);
            C786410Ut5.s5(this.LL.Go(), 0.0f);
            C12ES.LJIILL(0, this.LL.Go());
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LL.Go(), "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat3.setDuration(250L);
            objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
            ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(this.LL.Go(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.1f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.1f, 1.0f));
            objectAnimatorOfPropertyValuesHolder4.setDuration(250L);
            objectAnimatorOfPropertyValuesHolder4.setInterpolator(new C0ORQ(1.871f));
            builderPlay.with(objectAnimatorOfFloat3).with(objectAnimatorOfPropertyValuesHolder4);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(animatorSet).before(animatorSet2);
        animatorSet3.start();
        C0DTR.LIZIZ(this.LL.Oo());
        return Unit.LIZ;
    }
}
