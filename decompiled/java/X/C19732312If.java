package X;

import Y.ACListenerS163S0100000_29;
import Y.ALAdapterS11S0110000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.12If, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19732312If implements C12IV {
    public final Context LIZ;
    public final View LIZIZ;
    public final C12J0 LIZJ;
    public final C12J9 LIZLLL;
    public final C054G LJ = C2296808zG.LIZ(C2107608Nm.LIZ.plus(C23118094a.LIZ()).plus(new C19775412Yu(CoroutineExceptionHandler.LJJLIL, 0)));
    public final RelativeLayout LJFF;
    public final C19517811Xs LJI;
    public final LinearLayout LJII;
    public final FrameLayout LJIIIIZZ;
    public final RelativeLayout LJIIIZ;
    public final FrameLayout LJIIJ;
    public final TextView LJIIJJI;
    public final C19517811Xs LJIIL;
    public ComposerBeauty LJIILIIL;
    public ComposerBeauty LJIILJJIL;
    public boolean LJIILL;
    public C19733312Ip LJIILLIIL;
    public final Map<BeautyCategory, List<ComposerBeauty>> LJIIZILJ;
    public final C19733412Iq LJIJ;
    public final C19733412Iq LJIJI;

    @Override // X.C12IV
    public final void LIZ() {
    }

    @Override // X.C12IV
    public final void LJFF() {
        if (this.LIZLLL.LIZ.LIZIZ()) {
            C23250099c.LIZLLL(this.LJ, C2107608Nm.LIZ, null, new C19732612Ii(this, null), 2);
        }
    }

    @Override // X.C12IV
    public final void LJIILIIL() {
        InterfaceC19731912Ib interfaceC19731912Ib;
        if (this.LIZJ.LIZLLL.LJJII) {
            this.LJIJ.LLLIIIIL(true);
            this.LJIJ.notifyDataSetChanged();
            for (BeautyCategory beautyCategory : ((LinkedHashMap) this.LJIIZILJ).keySet()) {
                this.LIZLLL.LIZ.me(beautyCategory.getCategoryResponse().getId(), true);
            }
            C12JP c12jp = this.LIZLLL.LIZLLL;
            if (c12jp == null || (interfaceC19731912Ib = c12jp.LIZ) == null) {
                return;
            }
            interfaceC19731912Ib.LJIIIIZZ();
        }
    }

    @Override // X.C12IV
    public final boolean LIZLLL() {
        return this.LJIILL;
    }

    @Override // X.C12IV
    public final C19733412Iq LJIIIIZZ() {
        return this.LJIJ;
    }

    @Override // X.C12IV
    public final ComposerBeauty LJIIIZ() {
        return this.LJIILIIL;
    }

    @Override // X.C12IV
    public final C19733412Iq LJIIL() {
        return this.LJIJI;
    }

    @Override // X.C12IV
    public final ComposerBeauty LJIILJJIL() {
        return this.LJIILJJIL;
    }

    @Override // X.C12IV
    public final void LIZIZ(ComposerBeauty composerBeauty) {
        this.LJIILJJIL = composerBeauty;
    }

    @Override // X.C12IV
    public final void LIZJ(boolean z) {
        C19733412Iq c19733412Iq;
        Integer first;
        Integer first2;
        C19733312Ip c19733312Ip = this.LJIILLIIL;
        if (c19733312Ip != null) {
            Drawable second = null;
            if (this.LIZLLL.LIZ.LIZIZ()) {
                Context context = c19733312Ip.getContext();
                Pair<Integer, ? extends Drawable> pair = this.LIZJ.LIZLLL.LJJ;
                if (pair != null) {
                    first2 = pair.getFirst();
                } else {
                    first2 = null;
                }
                c19733312Ip.setText(context.getString(first2.intValue()));
                C1324800kZy imageView = c19733312Ip.getImageView();
                Pair<Integer, ? extends Drawable> pair2 = this.LIZJ.LIZLLL.LJJ;
                if (pair2 != null) {
                    second = pair2.getSecond();
                }
                imageView.setImageDrawable(second);
            } else {
                Context context2 = c19733312Ip.getContext();
                Pair<Integer, ? extends Drawable> pair3 = this.LIZJ.LIZLLL.LJJI;
                if (pair3 != null) {
                    first = pair3.getFirst();
                } else {
                    first = null;
                }
                c19733312Ip.setText(context2.getString(first.intValue()));
                C1324800kZy imageView2 = c19733312Ip.getImageView();
                Pair<Integer, ? extends Drawable> pair4 = this.LIZJ.LIZLLL.LJJI;
                if (pair4 != null) {
                    second = pair4.getSecond();
                }
                imageView2.setImageDrawable(second);
            }
        }
        if (z && (c19733412Iq = this.LJIJ) != null) {
            c19733412Iq.notifyDataSetChanged();
        }
    }

    @Override // X.C12IV
    public final void LJ(List<BeautyCategory> list) {
        for (BeautyCategory beautyCategory : (ArrayList) list) {
            this.LJIIZILJ.put(beautyCategory, beautyCategory.getBeautyList());
        }
        this.LIZLLL.LIZ.xe();
        if (this.LIZJ.LIZLLL.LJIILJJIL) {
            C786410Ut5.LJZL(0, this.LJII);
            C19732812Ik c19732812Ik = this.LIZJ.LIZLLL;
            if (c19732812Ik.LJIILIIL) {
                c19732812Ik = new C19732812Ik();
                c19732812Ik.LJ = false;
                c19732812Ik.LIZLLL = 8.0f;
                c19732812Ik.LIZJ = 52.0f;
                c19732812Ik.LIZIZ = 52.0f;
                c19732812Ik.LJI = 3;
                c19732812Ik.LJIL = R.color.a0l;
                c19732812Ik.LJII = 12.0f;
                c19732812Ik.LJIJJLI = 2;
                c19732812Ik.LJIJJ = R.color.a0v;
                c19732812Ik.LJIJI = R.color.a0u;
                c19732812Ik.LJIIIZ = R.drawable.cck;
            }
            this.LJIILLIIL = C19733112In.LIZ(this.LIZ, c19732812Ik);
            C19733312Ip c19733312Ip = this.LJIILLIIL;
            if (c19733312Ip != null) {
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19733312Ip);
                c19733312Ip.setLayoutParams(layoutParams);
                c19733312Ip.setId(R.id.l55);
                C1324800kZy imageView = c19733312Ip.getImageView();
                int i = C19733512Ir.LLJI;
                imageView.setBackground(C19734312Iz.LIZ(c19732812Ik.LIZLLL, R.color.et, c19733312Ip.getContext(), c19732812Ik.LJ));
                TextView textView = c19733312Ip.getTextView();
                if (textView != null) {
                    textView.setTextSize(1, c19732812Ik.LIZ);
                }
                c19733312Ip.getImageView().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                LIZJ(false);
                this.LJIIIIZZ.addView(this.LJIILLIIL, 0);
            }
            C786410Ut5.R7(this.LJII, new ACListenerS163S0100000_29(this, 171));
            LJIIZILJ(!this.LIZLLL.LIZ.LIZIZ());
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.LIZ);
        linearLayoutManager.setOrientation(0);
        this.LJI.setLayoutManager(linearLayoutManager);
        this.LJI.setAdapter(this.LJIJ);
        AbstractC21673719rz itemAnimator = this.LJI.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJIJJLI(0L);
        }
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this.LIZ);
        linearLayoutManager2.setOrientation(0);
        this.LJIIL.setLayoutManager(linearLayoutManager2);
        this.LJIIL.setAdapter(this.LJIJI);
        AbstractC21673719rz itemAnimator2 = this.LJI.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.LJIJJLI(0L);
        }
        if (this.LJIILL) {
            LJIILLIIL(this, this.LJIILJJIL, true, false, 20);
        } else {
            LJIILLIIL(this, this.LJIILIIL, false, false, 22);
        }
        C786410Ut5.O7(this.LJIIJ, new ACListenerS163S0100000_29(this, 170));
    }

    @Override // X.C12IV
    public final void LJI(BeautyCategory beautyCategory) {
        ComposerBeauty next;
        int i;
        if (this.LIZJ.LIZLLL.LJIILJJIL) {
            LinearLayout linearLayout = this.LJII;
            if (a0.LJJIIZI(beautyCategory.getCategoryResponse().getKey(), "beauty", false)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZL(i, linearLayout);
        }
        if (a0.LJJIIZI(beautyCategory.getCategoryResponse().getKey(), "beauty", false)) {
            this.LIZJ.LIZLLL.LJIIIIZZ = R.color.et;
        } else {
            this.LIZJ.LIZLLL.LJIIIIZZ = R.color.fi;
        }
        C19733412Iq.LLLI(this.LJIJ, beautyCategory.getBeautyList());
        Iterator<ComposerBeauty> it2 = this.LJIJ.LLILZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getSelected()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LJIILLIIL(this, next, false, false, 30);
    }

    @Override // X.C12IV
    public final void LJII(Map<String, Integer> map) {
        ComposerBeauty composerBeauty;
        ComposerBeauty next;
        if (map != null) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                Iterator<ComposerBeauty> it2 = this.LJIJ.LLILZ.iterator();
                while (true) {
                    composerBeauty = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(entry.getKey(), next.getEffect().getEffectId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ComposerBeauty composerBeauty2 = next;
                if (composerBeauty2 != null) {
                    composerBeauty2.setDownloadState(entry.getValue().intValue());
                }
                Iterator<ComposerBeauty> it3 = this.LJIJI.LLILZ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    ComposerBeauty next2 = it3.next();
                    if (Intrinsics.LJFF(entry.getKey(), next2.getEffect().getEffectId())) {
                        composerBeauty = next2;
                        break;
                    }
                }
                ComposerBeauty composerBeauty3 = composerBeauty;
                if (composerBeauty3 != null) {
                    composerBeauty3.setDownloadState(entry.getValue().intValue());
                }
            }
        }
        this.LJIJ.notifyDataSetChanged();
        this.LJIJI.notifyDataSetChanged();
    }

    @Override // X.C12IV
    public final void LJIIJ(ComposerBeauty composerBeauty) {
        this.LJIILIIL = composerBeauty;
    }

    @Override // X.C12IV
    public final void LJIIJJI(List<ComposerBeauty> list) {
        Iterator<ComposerBeauty> it2 = list.iterator();
        while (it2.hasNext()) {
            C12HP.LIZ(it2.next(), new C12JC(this.LIZLLL.LIZ.Ye()), new C12J3(this.LIZLLL));
        }
        if (this.LJIILL) {
            this.LJIJI.notifyDataSetChanged();
        } else {
            this.LJIJ.notifyDataSetChanged();
        }
    }

    public final void LJIILL(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float fLIZ;
        float fLIZ2;
        float f5;
        RelativeLayout relativeLayout = this.LJFF;
        float[] fArr = new float[2];
        float f6 = 0.0f;
        if (z) {
            Context context = this.LIZ;
            f = -(C12JJ.LIZ(context) + C11VU.LIZIZ(12.0f, context));
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.0f;
        } else {
            Context context2 = this.LIZ;
            f2 = -(C12JJ.LIZ(context2) + C11VU.LIZIZ(12.0f, context2));
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "translationX", fArr);
        RelativeLayout relativeLayout2 = this.LJFF;
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", fArr2);
        RelativeLayout relativeLayout3 = this.LJIIIZ;
        float[] fArr3 = new float[2];
        if (z) {
            fLIZ = 0.0f;
        } else {
            Context context3 = this.LIZ;
            fLIZ = C12JJ.LIZ(context3) + C11VU.LIZIZ(12.0f, context3);
        }
        fArr3[0] = fLIZ;
        if (z) {
            Context context4 = this.LIZ;
            fLIZ2 = C12JJ.LIZ(context4) + C11VU.LIZIZ(12.0f, context4);
        } else {
            fLIZ2 = 0.0f;
        }
        fArr3[1] = fLIZ2;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(relativeLayout3, "translationX", fArr3);
        RelativeLayout relativeLayout4 = this.LJIIIZ;
        float[] fArr4 = new float[2];
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        fArr4[0] = f5;
        if (!z) {
            f6 = 1.0f;
        }
        fArr4[1] = f6;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(relativeLayout4, "alpha", fArr4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.addListener(new ALAdapterS11S0110000_29(this, z, 0));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void LJIIZILJ(boolean z) {
        List<ComposerBeauty> beautyList;
        InterfaceC19731912Ib interfaceC19731912Ib;
        List<ComposerBeauty> beautyList2;
        InterfaceC19731912Ib interfaceC19731912Ib2;
        this.LIZLLL.LIZ.LIZLLL(!z);
        List<ComposerBeauty> beautyList3 = null;
        if (z) {
            C12JP c12jp = this.LIZLLL.LIZLLL;
            if (c12jp != null && (interfaceC19731912Ib2 = c12jp.LIZ) != null) {
                interfaceC19731912Ib2.LJ("off");
            }
            this.LIZLLL.LIZ(false);
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_beauty_off_in_panel_remove_nodes_optimization", true, false)) {
                BeautyCategory beautyCategoryLIZJ = this.LIZLLL.LIZ.LIZJ();
                if (beautyCategoryLIZJ != null) {
                    beautyList3 = beautyCategoryLIZJ.getBeautyList();
                }
                ArrayList arrayList = new ArrayList();
                if (beautyList3 != null) {
                    for (ComposerBeauty composerBeauty : beautyList3) {
                        String unzipPath = composerBeauty.getEffect().getUnzipPath();
                        String extra = composerBeauty.getEffect().getExtra();
                        if (extra == null) {
                            extra = "";
                        }
                        arrayList.add(new BeautyComposerInfo(unzipPath, extra, composerBeauty.getEffect().getEffectId(), composerBeauty.getEffect().getResourceId(), composerBeauty.getCategoryId()));
                    }
                }
                C12J7 c12j7 = this.LIZLLL.LIZJ;
                if (c12j7 != null) {
                    c12j7.LJJLIIIJILLIZJL(arrayList);
                }
            } else {
                BeautyCategory beautyCategoryLIZJ2 = this.LIZLLL.LIZ.LIZJ();
                if (beautyCategoryLIZJ2 != null && (beautyList2 = beautyCategoryLIZJ2.getBeautyList()) != null) {
                    for (ComposerBeauty composerBeauty2 : beautyList2) {
                        if (composerBeauty2.isCollectionType()) {
                            List<ComposerBeauty> childList = composerBeauty2.getChildList();
                            if (childList != null) {
                                for (ComposerBeauty composerBeauty3 : childList) {
                                    if (composerBeauty3.getSelected()) {
                                        LJIJI(composerBeauty3, false);
                                    }
                                }
                            }
                        } else {
                            LJIJI(composerBeauty2, false);
                        }
                    }
                }
            }
            this.LIZLLL.LIZ.Oe();
        } else {
            C12JP c12jp2 = this.LIZLLL.LIZLLL;
            if (c12jp2 != null && (interfaceC19731912Ib = c12jp2.LIZ) != null) {
                interfaceC19731912Ib.LJ("on");
            }
            this.LIZLLL.LIZ.af(false, true);
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_beauty_off_in_panel_remove_nodes_optimization", true, false)) {
                BeautyCategory beautyCategoryLIZJ3 = this.LIZLLL.LIZ.LIZJ();
                if (beautyCategoryLIZJ3 != null) {
                    beautyList3 = beautyCategoryLIZJ3.getBeautyList();
                }
                C12HU c12huPe = this.LIZLLL.LIZ.Pe();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : c12huPe) {
                    BeautyComposerInfo beautyComposerInfo = (BeautyComposerInfo) obj;
                    if (beautyList3 != null && !beautyList3.isEmpty()) {
                        for (ComposerBeauty composerBeauty4 : beautyList3) {
                            if (composerBeauty4.isCollectionType()) {
                                List<ComposerBeauty> childList2 = composerBeauty4.getChildList();
                                if (childList2 != null && !childList2.isEmpty()) {
                                    Iterator<ComposerBeauty> it2 = childList2.iterator();
                                    while (it2.hasNext()) {
                                        if (Intrinsics.LJFF(it2.next().getEffect().getEffectId(), beautyComposerInfo.effectId)) {
                                            arrayList2.add(obj);
                                            break;
                                        }
                                    }
                                }
                            } else if (Intrinsics.LJFF(composerBeauty4.getEffect().getEffectId(), beautyComposerInfo.effectId)) {
                                arrayList2.add(obj);
                                break;
                                break;
                            }
                        }
                    }
                }
                C12J7 c12j72 = this.LIZLLL.LIZJ;
                if (c12j72 != null) {
                    c12j72.LIZ(arrayList2, arrayList2);
                }
            }
            BeautyCategory beautyCategoryLIZJ4 = this.LIZLLL.LIZ.LIZJ();
            if (beautyCategoryLIZJ4 != null && (beautyList = beautyCategoryLIZJ4.getBeautyList()) != null) {
                for (ComposerBeauty composerBeauty5 : beautyList) {
                    if (composerBeauty5.isCollectionType()) {
                        List<ComposerBeauty> childList3 = composerBeauty5.getChildList();
                        if (childList3 != null) {
                            for (ComposerBeauty composerBeauty6 : childList3) {
                                if (composerBeauty6.getSelected()) {
                                    LJIJI(composerBeauty6, true);
                                }
                            }
                        }
                    } else {
                        LJIJI(composerBeauty5, true);
                    }
                }
            }
            LJFF();
        }
        C12JF c12jf = (C12JF) this.LIZLLL.LJ.LIZ(C12JF.class);
        if (c12jf != null) {
            c12jf.LIZ();
        }
        LIZJ(true);
    }

    public final void LJIJ(ComposerBeauty composerBeauty) {
        InterfaceC19732212Ie interfaceC19732212Ie;
        if (this.LIZJ.LIZ && (interfaceC19732212Ie = (InterfaceC19732212Ie) this.LIZLLL.LJ.LIZ(InterfaceC19732212Ie.class)) != null && !interfaceC19732212Ie.LJ()) {
            return;
        }
        this.LIZLLL.LIZ.jf(composerBeauty);
    }

    public final void LJIJI(ComposerBeauty composerBeauty, boolean z) {
        int[] iArrLJJLL;
        float fLIZ;
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items != null) {
            for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
                C12J7 c12j7 = this.LIZLLL.LIZJ;
                if (c12j7 != null && (iArrLJJLL = c12j7.LJJLL(composerBeauty.getEffect().getUnzipPath(), "")) != null && iArrLJJLL.length == 2 && iArrLJJLL[0] == 0 && iArrLJJLL[1] != EnumC992680bwI.EXCLUDE.getFlag() && this.LIZLLL.LIZ.Ye().LIZLLL(composerBeauty, false) && C12HP.LJ(composerBeauty)) {
                    if (z) {
                        fLIZ = C12I3.LIZ(new C12I4(itemsBean.doubleDirection, itemsBean.max, itemsBean.min, 0.0f, composerBeauty.getProgressValue(), 0.0f, 1868));
                    } else {
                        fLIZ = 0.0f;
                    }
                    C12J7 c12j72 = this.LIZLLL.LIZJ;
                    if (c12j72 != null) {
                        c12j72.V(composerBeauty.getEffect().getUnzipPath(), itemsBean.tag, fLIZ / 100.0f);
                    }
                }
            }
        }
    }

    public C19732312If(Context context, View view, C12J0 c12j0, C12J9 c12j9) {
        C19732412Ig c19732412Ig;
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = c12j0;
        this.LIZLLL = c12j9;
        this.LJFF = (RelativeLayout) view.findViewById(R.id.tns);
        C19517811Xs c19517811Xs = (C19517811Xs) view.findViewById(R.id.tuw);
        this.LJI = c19517811Xs;
        this.LJII = (LinearLayout) view.findViewById(R.id.tv1);
        this.LJIIIIZZ = (FrameLayout) view.findViewById(R.id.tv0);
        this.LJIIIZ = (RelativeLayout) view.findViewById(R.id.tnq);
        this.LJIIJ = (FrameLayout) view.findViewById(R.id.f719i4b);
        this.LJIIJJI = (TextView) view.findViewById(R.id.zeh);
        C19517811Xs c19517811Xs2 = (C19517811Xs) view.findViewById(R.id.tuu);
        this.LJIIL = c19517811Xs2;
        this.LJIIZILJ = new LinkedHashMap();
        C19733412Iq c19733412Iq = new C19733412Iq(c12j0, c19517811Xs);
        c19733412Iq.LLILZIL = new AwS643S0100000_29(this, 61);
        c19733412Iq.LLILZLL = new AwS573S0100000_29(this, 790);
        if (c12j0.LIZLLL.LJJII) {
            c19732412Ig = new C19732412Ig(this, c19733412Iq);
        } else {
            c19732412Ig = null;
        }
        c19733412Iq.LLIZ = c19732412Ig;
        c19733412Iq.LLIZLLLIL = c12j0.LIZLLL.LJJII ? new AwS608S0100000_29(this, 480) : null;
        this.LJIJ = c19733412Iq;
        C19733412Iq c19733412Iq2 = new C19733412Iq(c12j0, c19517811Xs2);
        c19733412Iq2.LLILZIL = new AwS643S0100000_29(this, 60);
        this.LJIJI = c19733412Iq2;
    }

    public static void LJIILLIIL(C19732312If c19732312If, ComposerBeauty composerBeauty, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4;
        boolean z5;
        C12JP c12jp;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        ComposerBeauty composerBeauty2 = null;
        if ((i & 16) != 0) {
            composerBeauty2 = composerBeauty;
        }
        if (z3 && (c12jp = c19732312If.LIZLLL.LIZLLL) != null) {
            InterfaceC19731912Ib interfaceC19731912Ib = c12jp.LIZ;
            if (interfaceC19731912Ib != null) {
                interfaceC19731912Ib.LIZ(c12jp.LIZIZ);
            }
            c12jp.LIZIZ = composerBeauty2;
        }
        if (composerBeauty == null) {
            c19732312If.LIZLLL.LIZ(false);
            return;
        }
        if (z) {
            for (ComposerBeauty composerBeauty3 : c19732312If.LJIJI.LLILZ) {
                if (Intrinsics.LJFF(composerBeauty3, composerBeauty) && composerBeauty3.getEnable()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                composerBeauty3.setSelected(z5);
            }
        } else {
            for (ComposerBeauty composerBeauty4 : c19732312If.LJIJ.LLILZ) {
                if (Intrinsics.LJFF(composerBeauty4, composerBeauty) && composerBeauty4.getEnable()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                composerBeauty4.setSelected(z4);
            }
        }
        if (composerBeauty.isCollectionType()) {
            c19732312If.LIZLLL.LIZ(false);
            return;
        }
        if (!composerBeauty.getExtra().isNone() && composerBeauty.getEnable()) {
            c19732312If.LIZLLL.LIZ(true);
        } else {
            c19732312If.LIZLLL.LIZ(false);
        }
        if (C12HP.LIZLLL(composerBeauty)) {
            c19732312If.LJIILJJIL = composerBeauty;
        } else {
            c19732312If.LJIILIIL = composerBeauty;
        }
        if (!C12HP.LIZLLL(composerBeauty) && !composerBeauty.getCategoryExclusive() && composerBeauty.getExtra().isNone()) {
            Map<BeautyCategory, List<ComposerBeauty>> map = c19732312If.LJIIZILJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (Intrinsics.LJFF(((BeautyCategory) entry.getKey()).getCategoryResponse().getId(), composerBeauty.getCategoryId())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List list = (List) C13LP.LJJJLIIL(linkedHashMap.values());
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!((ComposerBeauty) obj).getExtra().isNone()) {
                        arrayList.add(obj);
                    }
                }
                C12JF c12jf = (C12JF) c19732312If.LIZLLL.LJ.LIZ(C12JF.class);
                if (c12jf != null) {
                    c12jf.LJ(arrayList);
                }
            }
        } else {
            C12JN c12jn = (C12JN) c19732312If.LIZLLL.LJ.LIZ(C12JN.class);
            if (c12jn != null) {
                c12jn.LIZ(composerBeauty, z2, true, false);
            }
        }
        C12JF c12jf2 = (C12JF) c19732312If.LIZLLL.LJ.LIZ(C12JF.class);
        if (c12jf2 == null) {
            return;
        }
        c12jf2.LIZ();
    }
}
