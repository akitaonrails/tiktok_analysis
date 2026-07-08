package X;

import Y.ALAdapterS5S0100000_8;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0MVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC569690MVz<VH extends RecyclerView.ViewHolder> extends AbstractC21673619ry<VH> {
    public C569660MVw LLILLJJLI;
    public final ArrayList<C569570MVn> LL = new ArrayList<>();
    public int LLILLL = LLLFZ();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public static final int LLLFZ() {
        return C285960BIs.LIZ() ? C0F39.LIZ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : C0F39.LIZ();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return TextUtils.equals(((C569570MVn) ListProtector.get(this.LL, i)).LIZLLL.toLowerCase(Locale.getDefault()), "end_of_year") ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [X.0MqP, android.view.View$OnLayoutChangeListener] */
    /* JADX WARN: Type inference failed for: r7v27, types: [X.0MqP] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(VH vh, int i) {
        C0MW3 c0mw3;
        Integer numLIZJ;
        int i2;
        Integer numLIZJ2;
        C569570MVn c569570MVn = (C569570MVn) ListProtector.get(this.LL, i);
        final C569680MVy c569680MVy = (C569680MVy) this;
        int i3 = 1;
        int i4 = 8;
        if (vh instanceof C0MW2) {
            C0MW2 c0mw2 = (C0MW2) vh;
            c569680MVy.LLLI(c0mw2.itemView);
            Pair pairLLLII = C569680MVy.LLLII(c569570MVn);
            if (pairLLLII != null) {
                int iIntValue = ((Number) pairLLLII.getFirst()).intValue();
                String str = (String) pairLLLII.getSecond();
                C1361400lX0 c1361400lX0LJFF = C1425580nCW.LIZIZ.LJFF(c0mw2.itemView.getContext());
                if (c1361400lX0LJFF != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0LJFF)) != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    TuxTextView tuxTextView = c0mw2.LLILLJJLI;
                    if (tuxTextView != null) {
                        tuxTextView.setTextColor(iIntValue2);
                    }
                    if (!C569460MVc.LJI(c569570MVn)) {
                        TuxIconView tuxIconView = c0mw2.LL;
                        if (tuxIconView != null) {
                            tuxIconView.setTintColor(iIntValue2);
                        }
                    } else {
                        TuxIconView tuxIconView2 = c0mw2.LL;
                        if (tuxIconView2 != null) {
                            tuxIconView2.LIZ();
                        }
                    }
                }
                TuxIconView tuxIconView3 = c0mw2.LL;
                if (tuxIconView3 != null) {
                    tuxIconView3.setIconRes(iIntValue);
                }
                TuxTextView tuxTextView2 = c0mw2.LLILLJJLI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(str);
                }
                int iIntValue3 = ((Number) C259790AGb.LIZ.getValue()).intValue();
                List list = (List) C162900jr.LIZIZ.getValue();
                C569480MVe c569480MVe = C569480MVe.LIZ;
                String str2 = c569570MVn.LIZLLL;
                c569480MVe.getClass();
                boolean zContains = list.contains(C569480MVe.LIZIZ(str2).toLowerCase(Locale.ROOT));
                if (C0MW6.LIZ() < iIntValue3) {
                    i3 = 0;
                }
                TuxIconView tuxIconView4 = c0mw2.LLILLL;
                if (tuxIconView4 != null) {
                    if ((C569460MVc.LIZLLL(c569570MVn) || C569460MVc.LJ(c569570MVn) || C569460MVc.LIZJ(c569570MVn)) && i3 == 0 && zContains) {
                        i4 = 0;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView4, i4);
                }
            }
        } else {
            if ((vh instanceof C0MW3) && (c0mw3 = (C0MW3) vh) != null) {
                TuxTextView tuxTextView3 = c0mw3.LLILLL;
                C786410Ut5.LJLLLLLL(0, c0mw3.itemView);
                C786410Ut5.W5(c0mw3.itemView, new RecyclerView.LayoutParams(-2, -2));
                View view = c0mw3.itemView;
                C426750GoL.LJIIL(view, Integer.valueOf(view.getPaddingStart()), Integer.valueOf(c0mw3.itemView.getPaddingTop()), Integer.valueOf(c0mw3.itemView.getPaddingEnd()), Integer.valueOf(c0mw3.itemView.getPaddingBottom()), 16);
                C786410Ut5.LLD(8, c0mw3.LLILZ);
                C786410Ut5.LLLLLLZZ(c0mw3.LLILLJJLI, 0);
                C786410Ut5.LLLLZLL(c0mw3.LLILLL, 0);
                q0.LJIJ(c0mw3.itemView, new C581300Mr2(c0mw3, 0));
                if (Intrinsics.LJFF(c569570MVn.LIZLLL, "end_of_year") && c569680MVy.LLILZLL.creativeModel.editorProDraftModel.isEoyCreateTabOn && !Intrinsics.LJFF(c569680MVy.LLJILJIL, C0MWC.LIZ)) {
                    C426750GoL.LJIIL(c0mw3.itemView, 0, 0, 0, 0, 16);
                    c569680MVy.LLJILLL = c0mw3;
                    C1294720jnS c1294720jnS = c569680MVy.LLJJ;
                    if (c1294720jnS != null) {
                        View view2 = c0mw3.itemView;
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = -2;
                            layoutParams.height = -2;
                            C786410Ut5.W5(view2, layoutParams);
                            C786410Ut5.LLD(0, c0mw3.LLILZ);
                            C786410Ut5.LLLLLLZZ(c0mw3.LLILLJJLI, 8);
                            C786410Ut5.LLLLZLL(c0mw3.LLILLL, 8);
                            if (!Intrinsics.LJFF(c0mw3.LLILZ.getComposition(), c1294720jnS)) {
                                c0mw3.LLILZ.setComposition(c1294720jnS);
                            }
                            if (Intrinsics.LJFF(c569680MVy.LLJILJIL, C0MW9.LIZ)) {
                                c0mw3.LLILZ.setMinProgress(1.0f);
                            } else {
                                if (C285960BIs.LIZ()) {
                                    final C1295960jpS c1295960jpS = c0mw3.LLILZ;
                                    final ViewGroup viewGroup = c569680MVy.LLILZIL;
                                    if (viewGroup != null) {
                                        if (c569680MVy.LLJILJILJ == null) {
                                            C416330GUd c416330GUd = new C416330GUd(c569680MVy.LLILZ.requireSceneContext());
                                            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
                                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c416330GUd);
                                            c416330GUd.setLayoutParams(layoutParams2);
                                            c416330GUd.LLILLL = new AwS552S0100000_8(c569680MVy, 1150);
                                            c416330GUd.LLILZ = new AwS552S0100000_8(c569680MVy, 1151);
                                            int visibility = c416330GUd.getVisibility();
                                            c416330GUd.setVisibility(4);
                                            C1602160rnK.LIZIZ(visibility, 4, c416330GUd);
                                            c416330GUd.setClickable(true);
                                            c416330GUd.setFocusable(true);
                                            c569680MVy.LLJILJILJ = c416330GUd;
                                            viewGroup.addView(c416330GUd);
                                        }
                                        C416330GUd c416330GUd2 = c569680MVy.LLJILJILJ;
                                        if (c416330GUd2 != null) {
                                            c416330GUd2.bringToFront();
                                        }
                                        final float alpha = c1295960jpS.getAlpha();
                                        C786410Ut5.f5(c1295960jpS, 0.0f);
                                        C786410Ut5.y3(viewGroup.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0MW0
                                            @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                            public final boolean onPreDraw() {
                                                ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
                                                if (!viewTreeObserver.isAlive()) {
                                                    return true;
                                                }
                                                viewTreeObserver.removeOnPreDrawListener(this);
                                                C2187701Ajg.LIZIZ(viewTreeObserver, this, ViewTreeObserver.OnPreDrawListener.class);
                                                C569680MVy.LLLIL(viewGroup, c1295960jpS, c569680MVy);
                                                C416330GUd c416330GUd3 = c569680MVy.LLJILJILJ;
                                                if (c416330GUd3 != null) {
                                                    int visibility2 = c416330GUd3.getVisibility();
                                                    c416330GUd3.setVisibility(0);
                                                    C1602160rnK.LIZIZ(visibility2, 0, c416330GUd3);
                                                }
                                                C416330GUd c416330GUd4 = c569680MVy.LLJILJILJ;
                                                if (c416330GUd4 != null) {
                                                    c416330GUd4.bringToFront();
                                                }
                                                C786410Ut5.f5(c1295960jpS, alpha);
                                                viewGroup.postInvalidateOnAnimation();
                                                return false;
                                            }
                                        });
                                        final int i5 = 0;
                                        ?? r10 = new View.OnLayoutChangeListener(viewGroup, c1295960jpS, c569680MVy, i5) { // from class: X.0MqP
                                            public final int $t;
                                            public Object l0;
                                            public Object l1;
                                            public Object l2;

                                            @Override // android.view.View.OnLayoutChangeListener
                                            public final void onLayoutChange(View view3, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                                                switch (this.$t) {
                                                    case 0:
                                                        onLayoutChange$0(this, view3, i6, i7, i8, i9, i10, i11, i12, i13);
                                                        break;
                                                    case 1:
                                                        onLayoutChange$1(this, view3, i6, i7, i8, i9, i10, i11, i12, i13);
                                                        break;
                                                }
                                            }

                                            public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC580910MqP viewOnLayoutChangeListenerC580910MqP, View view3, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                                                C1295960jpS c1295960jpS2;
                                                C569680MVy c569680MVy2 = (C569680MVy) viewOnLayoutChangeListenerC580910MqP.l0;
                                                C0MW3 c0mw32 = c569680MVy2.LLJILLL;
                                                if (c0mw32 != null && (c1295960jpS2 = c0mw32.LLILZ) != null) {
                                                    c1295960jpS2.removeOnLayoutChangeListener(c569680MVy2.LLJJIII);
                                                }
                                                C416330GUd c416330GUd3 = ((C569680MVy) viewOnLayoutChangeListenerC580910MqP.l0).LLJILJILJ;
                                                if (c416330GUd3 != null && c416330GUd3.getVisibility() == 0) {
                                                    C569680MVy.LLLIL((ViewGroup) viewOnLayoutChangeListenerC580910MqP.l2, (C1295960jpS) viewOnLayoutChangeListenerC580910MqP.l1, (C569680MVy) viewOnLayoutChangeListenerC580910MqP.l0);
                                                    C416330GUd c416330GUd4 = ((C569680MVy) viewOnLayoutChangeListenerC580910MqP.l0).LLJILJILJ;
                                                    if (c416330GUd4 != null) {
                                                        c416330GUd4.invalidate();
                                                    }
                                                }
                                            }

                                            public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC580910MqP viewOnLayoutChangeListenerC580910MqP, View view3, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                                                ((ViewGroup) viewOnLayoutChangeListenerC580910MqP.l0).removeOnLayoutChangeListener(((C569680MVy) viewOnLayoutChangeListenerC580910MqP.l1).LLJJIJI);
                                                C416330GUd c416330GUd3 = ((C569680MVy) viewOnLayoutChangeListenerC580910MqP.l1).LLJILJILJ;
                                                if (c416330GUd3 != null && c416330GUd3.getVisibility() == 0) {
                                                    C569680MVy.LLLIL((ViewGroup) viewOnLayoutChangeListenerC580910MqP.l0, (C1295960jpS) viewOnLayoutChangeListenerC580910MqP.l2, (C569680MVy) viewOnLayoutChangeListenerC580910MqP.l1);
                                                    C416330GUd c416330GUd4 = ((C569680MVy) viewOnLayoutChangeListenerC580910MqP.l1).LLJILJILJ;
                                                    if (c416330GUd4 != null) {
                                                        c416330GUd4.invalidate();
                                                    }
                                                }
                                            }
                                        };
                                        c569680MVy.LLJJIII = r10;
                                        final int i6 = 1;
                                        c569680MVy.LLJJIJI = new View.OnLayoutChangeListener(viewGroup, c1295960jpS, c569680MVy, i6) { // from class: X.0MqP
                                            public final int $t;
                                            public Object l0;
                                            public Object l1;
                                            public Object l2;

                                            @Override // android.view.View.OnLayoutChangeListener
                                            public final void onLayoutChange(View view3, int i62, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                                                switch (this.$t) {
                                                    case 0:
                                                        onLayoutChange$0(this, view3, i62, i7, i8, i9, i10, i11, i12, i13);
                                                        break;
                                                    case 1:
                                                        onLayoutChange$1(this, view3, i62, i7, i8, i9, i10, i11, i12, i13);
                                                        break;
                                                }
                                            }

                                            public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC580910MqP viewOnLayoutChangeListenerC580910MqP, View view3, int i62, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                                                C1295960jpS c1295960jpS2;
                                                C569680MVy c569680MVy2 = (C569680MVy) viewOnLayoutChangeListenerC580910MqP.l0;
                                                C0MW3 c0mw32 = c569680MVy2.LLJILLL;
                                                if (c0mw32 != null && (c1295960jpS2 = c0mw32.LLILZ) != null) {
                                                    c1295960jpS2.removeOnLayoutChangeListener(c569680MVy2.LLJJIII);
                                                }
                                                C416330GUd c416330GUd3 = ((C569680MVy) viewOnLayoutChangeListenerC580910MqP.l0).LLJILJILJ;
                                                if (c416330GUd3 != null && c416330GUd3.getVisibility() == 0) {
                                                    C569680MVy.LLLIL((ViewGroup) viewOnLayoutChangeListenerC580910MqP.l2, (C1295960jpS) viewOnLayoutChangeListenerC580910MqP.l1, (C569680MVy) viewOnLayoutChangeListenerC580910MqP.l0);
                                                    C416330GUd c416330GUd4 = ((C569680MVy) viewOnLayoutChangeListenerC580910MqP.l0).LLJILJILJ;
                                                    if (c416330GUd4 != null) {
                                                        c416330GUd4.invalidate();
                                                    }
                                                }
                                            }

                                            public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC580910MqP viewOnLayoutChangeListenerC580910MqP, View view3, int i62, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                                                ((ViewGroup) viewOnLayoutChangeListenerC580910MqP.l0).removeOnLayoutChangeListener(((C569680MVy) viewOnLayoutChangeListenerC580910MqP.l1).LLJJIJI);
                                                C416330GUd c416330GUd3 = ((C569680MVy) viewOnLayoutChangeListenerC580910MqP.l1).LLJILJILJ;
                                                if (c416330GUd3 != null && c416330GUd3.getVisibility() == 0) {
                                                    C569680MVy.LLLIL((ViewGroup) viewOnLayoutChangeListenerC580910MqP.l0, (C1295960jpS) viewOnLayoutChangeListenerC580910MqP.l2, (C569680MVy) viewOnLayoutChangeListenerC580910MqP.l1);
                                                    C416330GUd c416330GUd4 = ((C569680MVy) viewOnLayoutChangeListenerC580910MqP.l1).LLJILJILJ;
                                                    if (c416330GUd4 != null) {
                                                        c416330GUd4.invalidate();
                                                    }
                                                }
                                            }
                                        };
                                        c1295960jpS.addOnLayoutChangeListener(r10);
                                        viewGroup.addOnLayoutChangeListener(c569680MVy.LLJJIJI);
                                    }
                                }
                                if (!c0mw3.LLILZ.isAnimating()) {
                                    c0mw3.LLILZ.removeAllAnimatorListeners();
                                    c0mw3.LLILZ.addAnimatorListener(new ALAdapterS5S0100000_8(c569680MVy, 14));
                                    c0mw3.LLILZ.playAnimation();
                                }
                            }
                            ShortVideoContext shortVideoContext = c569680MVy.LLILZLL;
                            ICelebrationCreateService iCelebrationCreateService = (ICelebrationCreateService) c569680MVy.LLJJJ.getValue();
                            if (iCelebrationCreateService == null || !ICelebrationCreateService.DefaultImpls.checkMaterialReady$default(iCelebrationCreateService, 2, false, 2, null)) {
                                i3 = 0;
                            }
                            C361680EFy.LJJJJZ(shortVideoContext, "create_tab", Integer.valueOf(i3));
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    } else {
                        View view3 = c0mw3.itemView;
                        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                        if (layoutParams3 != null) {
                            layoutParams3.width = c569680MVy.LLJIJIL;
                            C786410Ut5.W5(view3, layoutParams3);
                            C786410Ut5.LLD(4, c0mw3.LLILZ);
                            C786410Ut5.LLLLLLZZ(c0mw3.LLILLJJLI, 8);
                            C786410Ut5.LLLLZLL(c0mw3.LLILLL, 8);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                } else if (Intrinsics.LJFF(c569570MVn.LIZLLL, "end_of_year")) {
                    C786410Ut5.LJLLLLLL(8, c0mw3.itemView);
                    C786410Ut5.W5(c0mw3.itemView, new RecyclerView.LayoutParams(0, 0));
                } else {
                    c569680MVy.LLLI(c0mw3.itemView);
                    Pair pairLLLII2 = C569680MVy.LLLII(c569570MVn);
                    if (pairLLLII2 != null) {
                        tuxTextView3.setText((CharSequence) pairLLLII2.getSecond());
                        if (((Boolean) C285970BIt.LIZ.getValue()).booleanValue()) {
                            CharSequence text = tuxTextView3.getText();
                            for (int i7 = 0; i7 < text.length(); i7++) {
                                char cCharAt = text.charAt(i7);
                                if (C1244080iTm.LJ(cCharAt) || cCharAt == '-') {
                                    i2 = 2;
                                    break;
                                }
                            }
                            i2 = 1;
                            tuxTextView3.setMaxLines(i2);
                            tuxTextView3.setTextSize(1, C418440Gaw.LJFF(c569680MVy.LLIZLLLIL, c569680MVy.LLILZ.requireSceneContext()));
                            tuxTextView3.setMinTextSizePx(-1);
                            tuxTextView3.setMinimumHeight(0);
                            tuxTextView3.setMinHeight(0);
                            C426750GoL.LJIIL(c0mw3.itemView, Integer.valueOf(c569680MVy.LLJ), null, Integer.valueOf(c569680MVy.LLJ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 18);
                            if (C285960BIs.LIZ()) {
                                C426750GoL.LJIIL(c0mw3.itemView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, 29);
                            }
                        }
                        C1361400lX0 c1361400lX0LJFF2 = C1425580nCW.LIZIZ.LJFF(c0mw3.itemView.getContext());
                        if (c1361400lX0LJFF2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0LJFF2)) != null) {
                            int iIntValue4 = numLIZJ.intValue();
                            c0mw3.LLILLL.setTextColor(iIntValue4);
                            if (!C569460MVc.LJI(c569570MVn)) {
                                c0mw3.LLILLJJLI.setTintColor(iIntValue4);
                            } else {
                                c0mw3.LLILLJJLI.LIZ();
                            }
                        }
                        if (C285960BIs.LIZ()) {
                            C426750GoL.LJIIIZ(c0mw3.LLILLJJLI, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 23);
                        }
                        c0mw3.LLILLJJLI.setIconRes(((Number) pairLLLII2.getFirst()).intValue());
                    }
                }
            }
            C473601ss.LIZ(c569570MVn.LJFF, vh.itemView, new AwS217S0300000_8(c569570MVn, (C569570MVn) this, (AbstractC569690MVz<int>) i, (int) vh, 64));
        }
        if (C569460MVc.LJIIIIZZ(c569570MVn) && !C0MWD.LIZ().getBoolean("pugc_creator_tooltip_has_shown", false)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c569680MVy.LLILZ), null, null, new C0MW7(c569680MVy, vh, null), 3);
        }
        C473601ss.LIZ(c569570MVn.LJFF, vh.itemView, new AwS217S0300000_8(c569570MVn, (C569570MVn) this, (AbstractC569690MVz<int>) i, (int) vh, 64));
    }
}
