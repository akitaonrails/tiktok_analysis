package X;

import Y.ACListenerS140S0100000_5;
import Y.AsS32S0100000_5;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EFO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFO extends AbstractC1664490tPr<C353280Dt8, C0E1J> {
    public static final int LLJLIL;
    public static final int LLJLILLLLZIIL;
    public final C0EFL LLJJJIL;
    public RecyclerView LLJJJJ;
    public View LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C0EFP LLJJL;
    public final AsS32S0100000_5 LLJJLIIIJLLLLLLLZ;
    public final C21688219uK LLJL;

    static {
        LLJLIL = C357780E0y.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(212)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(294));
        LLJLILLLLZIIL = C357780E0y.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(212)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0EFP] */
    public C0EFO() {
        setTheme(R.style.y0);
        this.LLJJJIL = new C0EFL();
        this.LLJJJJLIIL = true;
        this.LLJJL = new C0EFM() { // from class: X.0EFP
            @Override // X.C0EFM
            public final void LIZIZ(C0EFK c0efk) {
                this.LIZ.LLJL.LJIILLIIL(c0efk);
            }

            @Override // X.C0EFM
            public final Bitmap LIZ(long j, String str) {
                return this.LIZ.LLLLIL().LIZIZ.invoke(str, Long.valueOf(j));
            }

            @Override // X.C0EFM
            public final void LIZJ(C352950Dsb c352950Dsb, int i) {
                if (c352950Dsb == null) {
                    return;
                }
                this.LIZ.LLLLIL().LIZJ.invoke(c352950Dsb, Integer.valueOf(i));
                RecyclerView recyclerView = this.LIZ.LLJJJJ;
                if (recyclerView != null) {
                    recyclerView.smoothScrollToPosition(i);
                }
            }
        };
        this.LLJJLIIIJLLLLLLLZ = new AsS32S0100000_5(this, 1);
        this.LLJL = new C21688219uK(new C0EFS(this));
    }

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
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super.onActivityCreated(bundle);
        this.LLJJJJ = (RecyclerView) this.mView.findViewById(R.id.ikw);
        this.LLJJJJJIL = this.mView.findViewById(R.id.ikn);
        if (!C357780E0y.LIZ()) {
            View view = this.mView;
            if (view.isLaidOut() && !view.isLayoutRequested()) {
                LLLLIL().LIZ.invoke(Integer.valueOf(view.getHeight()));
            } else {
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 7));
            }
        }
        if (ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.mActivity) != 0) {
            RecyclerView recyclerView = this.LLJJJJ;
            if (recyclerView != null && (layoutParams2 = recyclerView.getLayoutParams()) != null) {
                layoutParams2.height = LLJLIL;
            }
        } else {
            RecyclerView recyclerView2 = this.LLJJJJ;
            if (recyclerView2 != null && (layoutParams = recyclerView2.getLayoutParams()) != null) {
                layoutParams.height = LLJLILLLLZIIL;
            }
        }
        RecyclerView recyclerView3 = this.LLJJJJ;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
            if (!C357780E0y.LIZ()) {
                recyclerView3.addItemDecoration(new C0DXR() { // from class: X.03Iu
                    public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));

                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                        rect.bottom = this.LL;
                    }
                });
            }
            this.LLJL.LJ(recyclerView3);
            recyclerView3.addOnScrollListener(this.LLJJLIIIJLLLLLLLZ);
            C0EFL c0efl = this.LLJJJIL;
            C0EFP c0efp = this.LLJJL;
            c0efl.getClass();
            recyclerView3.setAdapter(c0efl);
            c0efl.LLILLJJLI = c0efp;
        }
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 79), view2);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Dzd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C353280Dt8) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 617));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Dyn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C353280Dt8) obj).LIZJ;
            }
        }, new AwS584S0100000_5(this, 618));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0DzD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C353280Dt8) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 619));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C357780E0y.LIZ()) {
            return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c17, viewGroup, false);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c16, viewGroup, false);
    }
}
