package X;

import Y.AAListenerS143S0300000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.159x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204751159x extends C20743416Fc implements C15AJ {
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public final boolean LLJLIL;
    public C20475615Ac LLJLILLLLZIIL;

    @Override // X.C15AJ
    public final void g() {
        C500260Jjc.LJLJLJ(this, true);
    }

    @Override // X.C15AJ
    public final boolean LLIIII() {
        return getParent() != null;
    }

    @Override // android.view.View, X.C15AJ
    public String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC20476415Ak.TEXT);
        sbLIZ.append('_');
        sbLIZ.append(getGeniusId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C15AJ
    public final void LJIIJ() {
        C15AI.LJII(this);
    }

    @Override // X.C15AJ
    public final void LLLIILIL() {
        C15AI.LIZ(this);
    }

    @Override // X.C15AJ
    public final boolean LLZZLLIL() {
        return this.LLJLIL;
    }

    @Override // X.C15AJ
    public String getGeniusId() {
        return this.LLJL;
    }

    @Override // X.C15AJ
    public ViewGroup getRoot() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C15AJ
    public C20475615Ac getGeniusModel() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C15AJ
    public final ViewGroup.LayoutParams LLIIIZ(Rect rect) {
        return C15AI.LIZIZ(this, rect);
    }

    @Override // X.C15AJ
    public final void LLIIL(View view) {
        C15AI.LJIIIIZZ(this, view);
    }

    @Override // X.C15AJ
    public final void W(InterfaceC20476615Am interfaceC20476615Am) {
        C15AI.LJ(this, interfaceC20476615Am);
        C500260Jjc.LJLJLJ(this, false);
    }

    @Override // X.C15AJ
    public final void log(String str) {
        C15AI.LJFF(this, str);
    }

    public void setGeniusId(String str) {
        this.LLJL = str;
    }

    @Override // X.C15AJ
    public void setRoot(ViewGroup viewGroup) {
        this.LLJJLIIIJLLLLLLLZ = viewGroup;
    }

    @Override // X.C15AJ
    public void setGeniusModel(C20475615Ac c20475615Ac) {
        this.LLJLILLLLZIIL = c20475615Ac;
    }

    public C204751159x(ViewGroup viewGroup, String str) throws Throwable {
        super(viewGroup.getContext());
        this.LLJJLIIIJLLLLLLLZ = viewGroup;
        this.LLJL = str;
        this.LLJLIL = true;
        setGravity(17);
        setIncludeFontPadding(false);
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxLines(1);
        ViewGroup.LayoutParams layoutParamsLLIIIZ = LLIIIZ(new Rect());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParamsLLIIIZ);
    }

    @Override // X.C15AJ
    public final void LJLL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        C15AI.LJIIIZ(this, list, interfaceC20476615Am, function2);
    }

    @Override // X.C15AJ
    public final void LLJJIJIL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) throws Throwable {
        C15AG c15ag;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update playanimations :");
        sbLIZ.append(list.size());
        C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C15AK c15ak = (C15AK) it2.next();
            if (c15ak != null && (c15ag = c15ak.LIZLLL) != null) {
                int i = C15AC.LIZIZ[c15ag.ordinal()];
                if (i != 1) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                T t = c15ak.LJ;
                                if (t instanceof C1782410wU3) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("TranslateAnimationConfig cur.x:");
                                    sbLIZ2.append(getX());
                                    sbLIZ2.append(" cur.y:");
                                    sbLIZ2.append(getY());
                                    sbLIZ2.append(" x:");
                                    C1782410wU3 c1782410wU3 = (C1782410wU3) t;
                                    sbLIZ2.append(c1782410wU3.LIZ);
                                    sbLIZ2.append(" y:");
                                    sbLIZ2.append(c1782410wU3.LIZIZ);
                                    C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ2));
                                    Float f = c1782410wU3.LIZJ;
                                    if (f != null && c1782410wU3.LIZLLL != null) {
                                        objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.X, f.floatValue(), c1782410wU3.LIZ), PropertyValuesHolder.ofFloat((Property<?, Float>) View.Y, c1782410wU3.LIZLLL.floatValue(), c1782410wU3.LIZIZ));
                                    } else {
                                        objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.X, c1782410wU3.LIZ), PropertyValuesHolder.ofFloat((Property<?, Float>) View.Y, c1782410wU3.LIZIZ));
                                    }
                                    C15AI.LIZLLL(objectAnimatorOfPropertyValuesHolder, c15ak);
                                    arrayList.add(objectAnimatorOfPropertyValuesHolder);
                                }
                            }
                        } else {
                            T t2 = c15ak.LJ;
                            if (t2 instanceof C15A5) {
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C204751159x, Float>) View.TRANSLATION_Z, getTranslationZ(), ((C15A5) t2).LIZ);
                                C15AI.LIZLLL(objectAnimatorOfFloat, c15ak);
                                arrayList.add(objectAnimatorOfFloat);
                            }
                        }
                    } else {
                        T t3 = c15ak.LJ;
                        if (t3 instanceof C15A2) {
                            C15A2 c15a2 = (C15A2) t3;
                            if (c15a2 != null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("ScaleAnimationConfig:");
                                sbLIZ3.append(c15ak.LJ);
                                C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ3));
                                Pair<Float, Float> pair = c15a2.LIZIZ;
                                if (pair != null) {
                                    objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, pair.getFirst().floatValue(), c15a2.LIZ.getFirst().floatValue()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, c15a2.LIZIZ.getSecond().floatValue(), c15a2.LIZ.getSecond().floatValue()));
                                } else {
                                    objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, c15a2.LIZ.getFirst().floatValue()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, c15a2.LIZ.getSecond().floatValue()));
                                }
                                C15AI.LIZLLL(objectAnimatorOfPropertyValuesHolder2, c15ak);
                                arrayList.add(objectAnimatorOfPropertyValuesHolder2);
                            } else {
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<C204751159x, Float>) View.ALPHA, getAlpha(), ((C1782400wU2) c15ak.LJ).LIZ);
                    C15AI.LIZLLL(objectAnimatorOfFloat2, c15ak);
                    arrayList.add(objectAnimatorOfFloat2);
                }
            }
        }
        animatorSet.addListener(new AAListenerS143S0300000_31(this, animatorSet, function2, 2));
        if (!arrayList.isEmpty()) {
            C15AI.LJFF(this, "readyPlayAnimationList.isNotEmpty()");
            animatorSet.playTogether(arrayList);
            animatorSet.start();
        } else {
            C15AI.LJFF(this, "readyPlayAnimationList.isEmpty() update model directly");
            if (interfaceC20476615Am != null) {
                LLLZZIL(interfaceC20476615Am, "no animation", false, null);
            }
            if (function2 == null) {
                return;
            }
            function2.invoke(Boolean.TRUE, null);
        }
    }

    @Override // X.C15AJ
    public final void LLJLILLLLZIIL(InterfaceC20476615Am interfaceC20476615Am, String str, Function2 function2) {
        C15AI.LJI(this, interfaceC20476615Am, str, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    @Override // X.C15AJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZZIL(X.InterfaceC20476615Am r8, java.lang.String r9, boolean r10, kotlin.jvm.functions.Function2 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204751159x.LLLZZIL(X.15Am, java.lang.String, boolean, kotlin.jvm.functions.Function2):void");
    }
}
