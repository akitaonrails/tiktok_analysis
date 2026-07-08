package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.api.tab.IPugcCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.template.TemplateLottieKey;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424590nAv extends AbstractC1664490tPr<C1424470nAj, C1422210n75> {
    public View LLJJJJ;
    public C1427240nFC LLJJJJJIL;
    public View LLJJJJLIIL;
    public TuxIconView LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public LinearLayout LLJLIL;
    public View LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public TuxTextView LLJLLIL;
    public ConstraintLayout LLJLLL;
    public C1846220y8y LLJZ;
    public ViewPager LLJZIJLIL;
    public TuxSkeletonLayout LLL;
    public TuxSkeletonLayout LLLF;
    public View LLLFF;
    public View LLLFFI;
    public View LLLFZ;
    public FrameLayout LLLI;
    public SmartImageView LLLII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1011));
    public C0MWA LLLIIII = C0MWC.LIZ;
    public final boolean LLLIILIL = ((Boolean) C0BOL.LIZ.getValue()).booleanValue();
    public final C01GW LLLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(451));
    public final C01GW LLLILZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(452));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1340));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1341));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1012));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1010));

    public final C1424770nBD LLLLLJLJLL() {
        return (C1424770nBD) this.LLLJ.getValue();
    }

    public final TuxSkeletonLayout LLLLLL() {
        return this.LLLIILIL ? this.LLLF : this.LLL;
    }

    public final boolean LLLLLLL() {
        return ((Boolean) this.LLJJJIL.getValue()).booleanValue();
    }

    public final void LLLLLJIL() {
        TuxSkeletonLayout tuxSkeletonLayoutLLLLLL = LLLLLL();
        if (tuxSkeletonLayoutLLLLLL != null && tuxSkeletonLayoutLLLLLL.getVisibility() == 0) {
            ((InterfaceC1424840nBK) this.LLLIZZ.getValue()).LIZIZ(null);
        }
        TuxSkeletonLayout tuxSkeletonLayoutLLLLLL2 = LLLLLL();
        if (tuxSkeletonLayoutLLLLLL2 != null) {
            tuxSkeletonLayoutLLLLLL2.setLoading(false);
        }
        TuxSkeletonLayout tuxSkeletonLayoutLLLLLL3 = LLLLLL();
        if (tuxSkeletonLayoutLLLLLL3 != null) {
            C786410Ut5.LLLZL(tuxSkeletonLayoutLLLLLL3, 8);
        }
        View view = this.LLLFF;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public final void LLLLLLLLLL() {
        TuxSkeletonLayout tuxSkeletonLayoutLLLLLL = LLLLLL();
        if (tuxSkeletonLayoutLLLLLL != null && tuxSkeletonLayoutLLLLLL.getVisibility() == 8) {
            ((InterfaceC1424840nBK) this.LLLIZZ.getValue()).LJIIIZ(null);
        }
        View view = this.LLLFF;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        TuxSkeletonLayout tuxSkeletonLayoutLLLLLL2 = LLLLLL();
        if (tuxSkeletonLayoutLLLLLL2 != null) {
            C786410Ut5.LLLZL(tuxSkeletonLayoutLLLLLL2, 0);
        }
        TuxSkeletonLayout tuxSkeletonLayoutLLLLLL3 = LLLLLL();
        if (tuxSkeletonLayoutLLLLLL3 != null) {
            tuxSkeletonLayoutLLLLLL3.setLoading(true);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C1DRG c1drg;
        InterfaceC1425150nBp interfaceC1425150nBp;
        C1DRG c1drg2;
        super.onDestroyView();
        ViewPager viewPager = this.LLJZIJLIL;
        if (viewPager != null) {
            int currentItem = viewPager.getCurrentItem();
            C1424770nBD c1424770nBDLLLLLJLJLL = LLLLLJLJLL();
            if (c1424770nBDLLLLLJLJLL.LLJI == currentItem) {
                c1424770nBDLLLLLJLJLL.LJJIJLIJ();
            }
            C1424850nBL c1424850nBLLJJIJL = c1424770nBDLLLLLJLJLL.LJJIJL(currentItem);
            if (c1424850nBLLJJIJL != null) {
                c1424850nBLLJJIJL.LJIJJLI(false);
            }
        }
        if (((Boolean) C280870Azd.LIZ.getValue()).booleanValue() && !C299160Bo2.LIZ() && (c1drg2 = LLLLILI().LIZ.LJIIJ) != null && ((InterfaceC1424960nBW) c1drg2.LJII(InterfaceC1424960nBW.class, null)).LIZJ() != null) {
            C0OBF.LIZ();
        }
        if (!C299160Bo2.LIZ() || (c1drg = LLLLILI().LIZ.LJIIJ) == null || (interfaceC1425150nBp = (InterfaceC1425150nBp) c1drg.LJIIL(null, InterfaceC1425150nBp.class)) == null) {
            return;
        }
        interfaceC1425150nBp.release();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        ViewPager viewPager = this.LLJZIJLIL;
        if (viewPager != null) {
            int currentItem = viewPager.getCurrentItem();
            C1424770nBD c1424770nBDLLLLLJLJLL = LLLLLJLJLL();
            if (c1424770nBDLLLLLJLJLL.LLJI == currentItem) {
                c1424770nBDLLLLLJLJLL.LJJIJLIJ();
            }
            C1424850nBL c1424850nBLLJJIJL = c1424770nBDLLLLLJLJLL.LJJIJL(currentItem);
            if (c1424850nBLLJJIJL != null) {
                C1425080nBi c1425080nBiLIZIZ = c1424850nBLLJJIJL.LIZIZ(c1424850nBLLJJIJL.LLJLILLLLZIIL);
                if (c1425080nBiLIZIZ != null) {
                    c1425080nBiLIZIZ.T5(true, false);
                }
                c1424850nBLLJJIJL.LJIIIZ();
            }
        }
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        ViewPager viewPager;
        super.onResume();
        if (Intrinsics.LJFF(LLLLILI().LIZ.LJIJJ, Boolean.TRUE) || (viewPager = this.LLJZIJLIL) == null) {
            return;
        }
        C1424850nBL c1424850nBLLJJIJL = LLLLLJLJLL().LJJIJL(viewPager.getCurrentItem());
        if (c1424850nBLLJJIJL != null) {
            C1425080nBi c1425080nBiLIZIZ = c1424850nBLLJJIJL.LIZIZ(c1424850nBLLJJIJL.LLJLILLLLZIIL);
            if (c1425080nBiLIZIZ != null) {
                c1425080nBiLIZIZ.U5();
            }
            c1424850nBLLJJIJL.LLJJIII = System.currentTimeMillis();
        }
    }

    public static final C0MWA LLLLLLIL(String str) {
        if (C0CHQ.LIZ().getAccountService().LJIIJJI()) {
            return C0MWC.LIZ;
        }
        TemplateLottieKey templateLottieKey = (TemplateLottieKey) C1420570n4R.LIZ.getValue();
        if (templateLottieKey == null) {
            return C0MWC.LIZ;
        }
        C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
        C0L62 c0l62 = C0L62.LIZ;
        C0L67 c0l67 = C0L67.LIZ;
        c0l62.getClass();
        if (!c2137908Zd.LJFF(C0L62.LJII(c0l67, str))) {
            return C0MWC.LIZ;
        }
        Keva repo = Keva.getRepo("keva_repo_auto_cut_operational_activity");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C538490L9z.LIZIZ(c0l67, str));
        sbLIZ.append("template_tab_show_time");
        long j = repo.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (j == 0 && templateLottieKey.isAutoPlayFirstTime()) {
            return C0MWB.LIZ;
        }
        if (System.currentTimeMillis() - j >= 172800000) {
            List<Long> list = templateLottieKey.timeStamp;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<Long> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (System.currentTimeMillis() - it2.next().longValue() < 172800000) {
                        return C0MWB.LIZ;
                    }
                }
            }
        }
        if (templateLottieKey.isShowEndFrame()) {
            return C0MW9.LIZ;
        }
        return C0MWC.LIZ;
    }

    public final void LLLLLLJ(EnumC994860bzo enumC994860bzo) {
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        C1846220y8y c1846220y8y;
        TextView textView;
        ViewGroup.LayoutParams layoutParams2;
        if (enumC994860bzo == EnumC994860bzo.EDITOR_TAB) {
            TuxIconView tuxIconView = this.LLJLL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            TuxTextView tuxTextView = this.LLJLLIL;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(22);
            }
            TuxTextView tuxTextView2 = this.LLJLLIL;
            if (tuxTextView2 != null) {
                layoutParams = tuxTextView2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C19ME) {
                c19me = (C19ME) layoutParams;
            } else {
                c19me = null;
            }
            if (c19me != null) {
                c19me.startToStart = 0;
                c19me.endToEnd = -1;
                TuxTextView tuxTextView3 = this.LLJLLIL;
                if (tuxTextView3 != null) {
                    C786410Ut5.R6(tuxTextView3, c19me);
                }
            }
            TuxTextView tuxTextView4 = this.LLJLLIL;
            if (tuxTextView4 != null) {
                C426750GoL.LJIIIZ(tuxTextView4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, null, false, 30);
            }
            C1424760nBC c1424760nBC = LLLLILI().LIZ.LJIILLIIL;
            if (c1424760nBC != null) {
                ConstraintLayout constraintLayout = this.LLJLLL;
                if (constraintLayout != null) {
                    C426750GoL.LJIIIZ(constraintLayout, null, Integer.valueOf(c1424760nBC.LIZ), null, null, false, 29);
                }
                ConstraintLayout constraintLayout2 = this.LLJLLL;
                if (constraintLayout2 != null && (layoutParams2 = constraintLayout2.getLayoutParams()) != null) {
                    layoutParams2.height = c1424760nBC.LIZIZ;
                }
                ConstraintLayout constraintLayout3 = this.LLJLLL;
                if (constraintLayout3 != null) {
                    C426750GoL.LJIIIZ(constraintLayout3, null, null, null, 0, false, 23);
                }
            }
            View view = this.LLJLILLLLZIIL;
            if (view != null && (textView = (TextView) view.findViewById(R.id.f7f)) != null) {
                textView.setText(2131829636);
            }
            if (C0MQ1.LIZIZ() && (c1846220y8y = this.LLJZ) != null) {
                c1846220y8y.setBackground(null);
            }
            View view2 = this.mView;
            if (view2 != null) {
                view2.setBackground(null);
            }
            LinearLayout linearLayout = this.LLJLIL;
            if (linearLayout != null) {
                linearLayout.setBackground(null);
            }
        }
        C1846220y8y c1846220y8y2 = this.LLJZ;
        if (c1846220y8y2 != null) {
            c1846220y8y2.setEditTabType(42);
        }
        C1846220y8y c1846220y8y3 = this.LLJZ;
        if (c1846220y8y3 != null) {
            c1846220y8y3.setBackground(null);
        }
        ConstraintLayout constraintLayout4 = this.LLJLLL;
        if (constraintLayout4 != null) {
            LLLLIL().LJ.invoke(constraintLayout4);
        }
    }

    public final void LLLLLLLLL(View view) {
        C19ME c19me;
        ViewGroup viewGroup;
        int i;
        int i2;
        boolean zLLLLLLL = LLLLLLL();
        View view2 = this.LLJJJJ;
        if (view2 != null) {
            if (zLLLLLLL) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view2);
        }
        TuxIconView tuxIconView = this.LLJJL;
        if (tuxIconView != null) {
            if (!zLLLLLLL) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxIconView);
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (!Intrinsics.LJFF(view.getParent(), this.LLJJLIIIJLLLLLLLZ)) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
            FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
            if (frameLayout != null) {
                frameLayout.addView(view);
            }
        }
        FrameLayout frameLayout2 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
        }
        FrameLayout frameLayout3 = this.LLJL;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(8, frameLayout3);
        }
        C1846220y8y c1846220y8y = this.LLJZ;
        if (c1846220y8y != null) {
            layoutParams = c1846220y8y.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            c19me.endToStart = -1;
            C1846220y8y c1846220y8y2 = this.LLJZ;
            if (c1846220y8y2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1846220y8y2);
                c1846220y8y2.setLayoutParams(c19me);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
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
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ViewPager viewPager;
        ViewPager viewPager2;
        TuxIconView tuxIconView;
        View view;
        int i;
        int i2;
        super.onActivityCreated(bundle);
        this.LLJLIL = (LinearLayout) findViewById(R.id.eu1);
        this.LLJLILLLLZIIL = findViewById(R.id.f7d);
        this.LLJLL = (TuxIconView) findViewById(R.id.hff);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
        View view2 = null;
        if (tuxTextView != null) {
            if (C298250BmZ.LIZ()) {
                tuxTextView.setText(getString(2131845857));
            }
        } else {
            tuxTextView = null;
        }
        this.LLJLLIL = tuxTextView;
        this.LLJLLL = (ConstraintLayout) findViewById(R.id.y1z);
        this.LLJZ = (C1846220y8y) findViewById(R.id.wx3);
        this.LLJZIJLIL = (ViewPager) findViewById(R.id.view_pager);
        this.LLL = (TuxSkeletonLayout) findViewById(R.id.nmp);
        this.LLLF = (TuxSkeletonLayout) findViewById(R.id.nmr);
        this.LLLFF = findViewById(R.id.nnq);
        View viewFindViewById = findViewById(R.id.hbe);
        if (viewFindViewById != null) {
            TuxIconView tuxIconView2 = (TuxIconView) viewFindViewById.findViewById(R.id.jxe);
            if (tuxIconView2 != null) {
                C1361400lX0 c1361400lX0LJFF = C1425570nCV.LIZIZ.LJFF(getSceneContext());
                if (c1361400lX0LJFF != null) {
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.nl;
                    tuxIconView2.setImageDrawable(c0hti.LIZ(c1361400lX0LJFF));
                }
            }
            view2 = viewFindViewById;
        }
        this.LLLFFI = view2;
        this.LLLFZ = findViewById(R.id.tec);
        this.LLLI = (FrameLayout) findViewById(R.id.b3o);
        this.LLLII = (SmartImageView) findViewById(R.id.b3l);
        int i3 = 8;
        ?? r10 = 0;
        if (C298920Bne.LIZ()) {
            this.LLJJLIIIJLLLLLLLZ = (FrameLayout) findViewById(R.id.u9d);
            this.LLJL = (FrameLayout) findViewById(R.id.u9a);
            this.LLJJJJ = findViewById(R.id.h5h);
            this.LLJJJJJIL = (C1427240nFC) findViewById(R.id.h5j);
            this.LLJJJJLIIL = findViewById(R.id.h5i);
            this.LLJJL = (TuxIconView) findViewById(R.id.z4);
            View view3 = this.LLJJJJ;
            if (view3 != null) {
                if (LLLLLLL()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, view3);
            }
            TuxIconView tuxIconView3 = this.LLJJL;
            if (tuxIconView3 != null) {
                if (!LLLLLLL()) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, tuxIconView3);
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n8i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIIJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 792));
        View view4 = this.LLJLILLLLZIIL;
        if (view4 != null) {
            r10 = 0;
            IPugcCreatorService iPugcCreatorService = (IPugcCreatorService) PluggableExtentionKt.pluggableSpi$default(IPugcCreatorService.class, false, false, false, 14, null);
            if (iPugcCreatorService != null && iPugcCreatorService.LIZ() && !LLLLILI().LIZ.LIZJ) {
                i3 = 0;
            }
            C786410Ut5.LJLLLLLL(i3, view4);
        }
        if (!C298920Bne.LIZ() && (view = this.LLJLILLLLZIIL) != null) {
            C426750GoL.LJIIIZ(view, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, r10, 27);
        }
        View view5 = this.LLJLILLLLZIIL;
        if (view5 != null) {
            C560180Ly4.LIZ(view5, new AwS566S0100000_22(this, 1014));
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, r10, "studio_normal_enter_template_tab", true) == 2 && (tuxIconView = this.LLJLL) != null) {
            tuxIconView.setIconRes(R.raw.icon_chevron_left_ltr);
        }
        TuxIconView tuxIconView4 = this.LLJLL;
        if (tuxIconView4 != null) {
            C786410Ut5.a9(tuxIconView4, new C1466570oGd(this, 27));
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) C0AZE.LIZ.getValue()).intValue() - 4)));
        ViewPager viewPager3 = this.LLJZIJLIL;
        if (viewPager3 != null) {
            C426750GoL.LJIIL(viewPager3, Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(iLIZIZ), Integer.valueOf((int) r10), 16);
        }
        Context sceneContext = getSceneContext();
        if (sceneContext != null && C11VU.LJFF(sceneContext) && (viewPager2 = this.LLJZIJLIL) != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewPager2);
            viewPager2.setRotationY(180.0f);
        }
        ViewPager viewPager4 = this.LLJZIJLIL;
        if (viewPager4 != null) {
            viewPager4.setAdapter(LLLLLJLJLL());
        }
        C1846220y8y c1846220y8y = this.LLJZ;
        if (c1846220y8y != 0) {
            c1846220y8y.setIsTabIndicatorFullWidth(r10);
            c1846220y8y.setFixedIndicatorWidthDp(22);
        }
        C1846220y8y c1846220y8y2 = this.LLJZ;
        if (c1846220y8y2 != null) {
            c1846220y8y2.setOnPopulateFromPagerAdapter(new AwS566S0100000_22(this, 1019));
        }
        C1846220y8y c1846220y8y3 = this.LLJZ;
        if (c1846220y8y3 != null && (viewPager = this.LLJZIJLIL) != null) {
            viewPager.addOnPageChangeListener(new C1425200nBu(c1846220y8y3));
        }
        C1846220y8y c1846220y8y4 = this.LLJZ;
        if (c1846220y8y4 != null) {
            C1846220y8y.LJIILLIIL(c1846220y8y4, this.LLJZIJLIL);
        }
        C1846220y8y c1846220y8y5 = this.LLJZ;
        if (c1846220y8y5 != null) {
            c1846220y8y5.LIZ(new InterfaceC1846270y93() { // from class: X.0n9y
                @Override // X.InterfaceC1846270y93
                public final void LIZ() {
                }

                @Override // X.InterfaceC1846270y93
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1846270y93
                public final void LIZJ(C1425810nCt c1425810nCt) {
                    TemplateLottieKey templateLottieKey;
                    ViewPager viewPager5 = this.LIZ.LLJZIJLIL;
                    if (viewPager5 != null) {
                        viewPager5.setCurrentItem(c1425810nCt.LJI, true);
                    }
                    TemplateCategoryData templateCategoryDataLJJIJIL = this.LIZ.LLLLLJLJLL().LJJIJIL(c1425810nCt.LJI);
                    if (templateCategoryDataLJJIJIL != null) {
                        C1424590nAv c1424590nAv = this.LIZ;
                        String str = templateCategoryDataLJJIJIL.extra;
                        if (str != null && str.length() != 0 && Intrinsics.LJFF(c1424590nAv.LLLIIII, C0MWB.LIZ) && (templateLottieKey = (TemplateLottieKey) C1420570n4R.LIZ.getValue()) != null && templateLottieKey.isQuitAfterClick()) {
                            C538490L9z.LJFF(Long.MAX_VALUE, templateCategoryDataLJJIJIL.key);
                        }
                    }
                }
            });
        }
        ViewPager viewPager5 = this.LLJZIJLIL;
        if (viewPager5 != null) {
            viewPager5.addOnPageChangeListener(new C1466890oH9(this, 2));
        }
        View view6 = this.LLLFZ;
        if (view6 != null) {
            C786410Ut5.I7(new C1466570oGd(this, 26), view6);
        }
        TuxSkeletonLayout tuxSkeletonLayoutLLLLLL = LLLLLL();
        if (tuxSkeletonLayoutLLLLLL != null) {
            List<Float> list = C1425070nBh.LIZ;
            C1425070nBh.LIZ(tuxSkeletonLayoutLLLLLL, this.LLLIILIL, (List) this.LLLIL.getValue());
        }
        LLLLLLLLLL();
        LLLLLLJ(LLLLILI().LIZ.LJIILL);
        if (C298920Bne.LIZ()) {
            FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
            if (frameLayout != null) {
                C786410Ut5.LJZ(r10, frameLayout);
            }
            if (LLLLLLL()) {
                C1427240nFC c1427240nFC = this.LLJJJJJIL;
                if (c1427240nFC != null) {
                    c1427240nFC.setTuxFont(61);
                    c1427240nFC.setTextSizeSp(13.0f);
                    c1427240nFC.setTextColorAttr(R.attr.a1p);
                    if (C298960Bni.LIZ()) {
                        c1427240nFC.setText(c1427240nFC.getContext().getString(2131850055));
                    }
                }
                View view7 = this.LLJJJJ;
                if (view7 != null) {
                    C560180Ly4.LIZ(view7, new AwS566S0100000_22(this, 1013));
                }
                View view8 = this.LLJJJJLIIL;
                if (view8 != null) {
                    C560180Ly4.LIZ(view8, new AwS566S0100000_22(this, 1015));
                }
            }
            TuxIconView tuxIconView5 = this.LLJJL;
            if (tuxIconView5 != null) {
                C560180Ly4.LIZ(tuxIconView5, new AwS566S0100000_22(this, 1016));
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nB0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1424470nAj) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 347));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nAz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1424470nAj) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 349));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nBA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 791));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nAk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 798));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nAl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 803));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nAq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJI;
            }
        }, new AwS601S0100000_22(this, 806));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nAs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIIIIZZ;
            }
        }, new AwS601S0100000_22(this, StrategyCenter.ENABLE_SMART_SERVICE));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nB1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJII;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 810));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nB4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIIIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 823));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nB7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIIJJI;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 830));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nB2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIJJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 790));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nAm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIJJLI;
            }
        }, new AwS601S0100000_22(this, 793));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nAn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIIL;
            }
        }, new AwS601S0100000_22(this, 797));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nAo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIILIIL;
            }
        }, new AwS601S0100000_22(this, 801));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nB5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIILL;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 802));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nAp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIIZILJ;
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 348));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nAr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 807));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nAt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIJI;
            }
        }, new AwS601S0100000_22(this, 809));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nAu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIL;
            }
        }, new AwS601S0100000_22(this, 811));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nB6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJIILJJIL;
            }
        }, new AwS601S0100000_22(this, 824));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n9t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424470nAj) obj).LJJI;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 827));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(C1425570nCV.LIZIZ.LIZLLL());
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.sn, viewGroup, false);
    }
}
