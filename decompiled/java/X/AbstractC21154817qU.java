package X;

import Y.AUListenerS279S0100000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.libra.EcMixMallAndroidConfigSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS148S0110000_32;
import kotlin.jvm.internal.AwS169S0101000_32;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17qU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21154817qU implements InterfaceC21155017qW {
    public final C1771760wCs LL;
    public final C21156817qo LLILLJJLI;
    public final C21156217qi LLILLL;
    public final View LLILZ;
    public volatile boolean LLILZIL;
    public volatile boolean LLILZLL;
    public volatile boolean LLIZ;
    public volatile boolean LLIZLLLIL;
    public final boolean LLJ;
    public final int LLJI;
    public final String LLJIJIL;
    public final C1771930wD9 LLJILJIL;

    @Override // X.InterfaceC21155017qW
    public boolean LIZIZ(Rect rect) {
        return false;
    }

    public abstract void LJIILJJIL(ConstraintLayout constraintLayout);

    public abstract void LJIILL();

    public abstract void LJIILLIIL();

    public abstract void LJIIZILJ(ConstraintLayout constraintLayout, int i, AwS681S0100000_32 awS681S0100000_32, AwS576S0100000_32 awS576S0100000_32, AwS169S0101000_32 awS169S0101000_32);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object, java.lang.String] */
    public final String LJIILIIL() {
        int iLJIIJJI;
        C259800zU c259800zU = new C259800zU();
        View view = this.LLILZ;
        Object tag = view != null ? view.getTag(R.id.gih) : null;
        ?? r1 = tag instanceof String ? (String) tag : 0;
        c259800zU.element = r1;
        if (r1 != 0 && !a0.LJJJIL(r1)) {
            return (String) c259800zU.element;
        }
        int i = EcMixMallAndroidConfigSettings.LIZIZ.bubbleFindParentMaxDepth;
        if (i <= 0 || (iLJIIJJI = LJIIJJI(i)) < 0) {
            return null;
        }
        int iHashCode = this.LLJIJIL.hashCode();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bubble_anchor_tag_");
        sbLIZ.append(iLJIIJJI);
        ?? LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c259800zU.element = LIZIZ;
        this.LLILZ.setTag(iHashCode, LIZIZ);
        new C21149417pc((ViewTreeObserverOnScrollChangedListenerC21156017qg) this, iHashCode, c259800zU);
        return (String) c259800zU.element;
    }

    @Override // X.InterfaceC21155017qW
    public final boolean isVisible() {
        return this.LLILZIL && !this.LLILZLL && Y4().getVisibility() == 0;
    }

    @Override // X.InterfaceC21155017qW
    public final C21156217qi LJII() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC21155017qW
    /* JADX INFO: renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    public C1771930wD9 Y4() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC21155017qW
    public final String getBubbleId() {
        return this.LLJIJIL;
    }

    public final int LJIIJJI(int i) {
        View view;
        View view2;
        try {
            Object parent = this.LLILZ.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            View view3 = this.LLILZ;
            int i2 = 0;
            while (view != null && ((i < 0 || i2 < i) && !(view instanceof RecyclerView) && !(view instanceof C1773610wFr))) {
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view2 = (View) parent2;
                } else {
                    view2 = null;
                }
                i2++;
                view3 = view;
                view = view2;
            }
            if ((view instanceof RecyclerView) && !(view instanceof C1773630wFt) && !(view instanceof C1773640wFu)) {
                return ((RecyclerView) view).getChildAdapterPosition(view3);
            }
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    @Override // X.InterfaceC21155017qW
    public final void LJFF(ConstraintLayout constraintLayout, int i, int i2) {
        new AwS169S0101000_32(this, i, 11);
        C1741560vQA.LIZJ(this.LLILLL.LJIJJ, "load_start", 0L, null, 6);
        if (!this.LLILZIL && !this.LLILZLL) {
            this.LLILZIL = true;
            LJIIZILJ(constraintLayout, i, new AwS681S0100000_32(this, 31), new AwS576S0100000_32(this, 715), new AwS169S0101000_32(this, i2, 12));
            Y4().setBlock(new AwS433S0200000_32(this, constraintLayout, 70));
            return;
        }
        LJIJI(null, "load_fail", "repeat invoke", null, false);
    }

    @Override // X.InterfaceC21155017qW
    public final void LJIIIZ(boolean z, int i, InterfaceC21154617qS interfaceC21154617qS) {
        C1741560vQA c1741560vQALIZIZ;
        new AwS148S0110000_32(this, z, 8);
        if (interfaceC21154617qS != null) {
            c1741560vQALIZIZ = interfaceC21154617qS.LIZIZ(this.LLJIJIL, this.LLILLL, new LinkedHashMap());
        } else {
            c1741560vQALIZIZ = null;
        }
        if (this.LLILZLL) {
            if (c1741560vQALIZIZ != null) {
                interfaceC21154617qS.LIZ(c1741560vQALIZIZ, false, "has dismissed");
            }
        } else {
            this.LLIZ = z;
            LJIJ(i, z, new AwS276S0300000_32(c1741560vQALIZIZ, interfaceC21154617qS, this, 16));
        }
    }

    public final void LJIJ(int i, final boolean z, final Function0<Unit> function0) {
        ValueAnimator valueAnimatorOfFloat;
        if (i < 0) {
            i = 0;
        }
        long j = i;
        if (j > 0) {
            if (z) {
                C1771930wD9 c1771930wD9Y4 = Y4();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771930wD9Y4);
                c1771930wD9Y4.setAlpha(0.0f);
                valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            } else {
                C1771930wD9 c1771930wD9Y42 = Y4();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771930wD9Y42);
                c1771930wD9Y42.setAlpha(1.0f);
                valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            }
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(this, 26));
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.17qV
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (!z) {
                        C786410Ut5.g2(this.Y4(), 8);
                    }
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    if (z) {
                        C786410Ut5.g2(this.Y4(), 0);
                    }
                }
            });
            valueAnimatorOfFloat.start();
            return;
        }
        if (z) {
            C786410Ut5.g2(Y4(), 0);
        } else {
            C786410Ut5.g2(Y4(), 8);
        }
        C1771930wD9 c1771930wD9Y43 = Y4();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771930wD9Y43);
        c1771930wD9Y43.setAlpha(1.0f);
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    public AbstractC21154817qU(C1771760wCs c1771760wCs, C21156817qo c21156817qo, C21156217qi c21156217qi, View view) {
        this.LL = c1771760wCs;
        this.LLILLJJLI = c21156817qo;
        this.LLILLL = c21156217qi;
        this.LLILZ = view;
        this.LLJ = view.getLayoutDirection() == 1;
        this.LLJI = C20516615Pw.LIZJ(view);
        this.LLJIJIL = UUID.randomUUID().toString();
        C1771930wD9 c1771930wD9 = new C1771930wD9(view.getContext());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771930wD9);
        c1771930wD9.setAlpha(0.0f);
        this.LLJILJIL = c1771930wD9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIJI(Integer num, String str, String str2, Map map, boolean z) {
        JSONObject jSONObject;
        InterfaceC1771900wD6 interfaceC1771900wD6;
        Map linkedHashMap = map;
        this.LLIZLLLIL = true;
        C21156217qi c21156217qi = this.LLILLL;
        C1741560vQA c1741560vQA = c21156217qi.LJIJJ;
        Integer numValueOf = null;
        if (z) {
            jSONObject = null;
        } else {
            jSONObject = c21156217qi.LJIJI;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Pair[] pairArr = new Pair[1];
        InterfaceC1773890wGJ interfaceC1773890wGJ = this.LL.LJFF;
        if (interfaceC1773890wGJ != null && (interfaceC1771900wD6 = (InterfaceC1771900wD6) interfaceC1773890wGJ.getService(InterfaceC1771900wD6.class)) != null) {
            numValueOf = Integer.valueOf(interfaceC1771900wD6.LIZJ());
        }
        pairArr[0] = new Pair("scroll_offset", numValueOf);
        C1008603wy.LIZ(linkedHashMap, pairArr);
        linkedHashMap.put("page_visible", Boolean.valueOf(this.LL.LIZLLL.K4()));
        c1741560vQA.LIZ(str, z, num, str2, jSONObject, linkedHashMap);
    }

    @Override // X.InterfaceC21155017qW
    public final void LIZLLL(boolean z, ConstraintLayout constraintLayout, int i, boolean z2, Pair<Integer, String> pair, InterfaceC21154617qS interfaceC21154617qS) {
        C1741560vQA c1741560vQALIZIZ;
        String second;
        new AwS148S0110000_32(this, z2, 7);
        Integer first = null;
        if (interfaceC21154617qS != null) {
            c1741560vQALIZIZ = interfaceC21154617qS.LIZIZ(this.LLJIJIL, this.LLILLL, C2097608Jq.LJIIJ(new Pair("not_release", Integer.valueOf(z2 ? 1 : 0))));
        } else {
            c1741560vQALIZIZ = null;
        }
        if (this.LLILZLL) {
            if (!z2) {
                LJIILLIIL();
            }
            if (!z && c1741560vQALIZIZ != null) {
                interfaceC21154617qS.LIZ(c1741560vQALIZIZ, false, "has dismissed");
                return;
            }
            return;
        }
        this.LLILZLL = true;
        if (!this.LLIZLLLIL) {
            if (pair != null) {
                first = pair.getFirst();
                second = pair.getSecond();
            } else {
                second = null;
            }
            LJIJI(first, "dismiss_unfinish", second, null, false);
        }
        LJIILL();
        LJIJ(i, false, new C21154717qT(this, constraintLayout, z2, pair, c1741560vQALIZIZ, interfaceC21154617qS));
    }
}
