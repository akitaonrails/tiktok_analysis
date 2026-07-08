package X;

import Y.AObserverS212S0100000_8;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS77S0200000_8;
import Y.AfS177S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Ltb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557410Ltb extends C19A3 {
    public final C553840Lnq LLJILLL;
    public float LLJJ;
    public boolean LLJJI;
    public C557310LtR LLJJIII;
    public C555030Lpl LLJJIJI;
    public C557370LtX LLJJIJIIJIL;
    public i LLJJIJIL;
    public C18SI LLJJJ;
    public boolean LLJJJJLIIL;
    public ViewTreeObserverOnPreDrawListenerC557430Ltd LLJJL;
    public ViewOnLayoutChangeListenerC580900MqO LLJJLIIIJLLLLLLLZ;
    public C565430MFp LLJL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 87));
    public final C11NJ LLJJJJ = new C11NJ();
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 86));
    public final MutableLiveData<C551290Ljj> LLJLIL = new MutableLiveData<>();
    public final MutableLiveData<C549360Lgc> LLJLILLLLZIIL = new MutableLiveData<>();
    public final C11RK<List<InputBlock>> LLJLL = new C11RK<>();
    public final MutableLiveData<Pair<Integer, MentionDataItem>> LLJLLIL = new MutableLiveData<>();
    public final C11RK<String> LLJLLL = new C11RK<>();
    public final MutableLiveData<AbstractC551420Ljw> LLJZ = new MutableLiveData<>();
    public final MutableLiveData<String> LLJZIJLIL = new MutableLiveData<>();
    public final MutableLiveData<C006R> LLL = new MutableLiveData<>();
    public final MutableLiveData<Long> LLLF = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLLFF = new MutableLiveData<>();
    public final MutableLiveData<String> LLLFFI = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLLFZ = new MutableLiveData<>();

    public final void LLLLIILL() {
        LLLLIIIILLL((View) this.LLJJJJJIL.getValue());
        LLLLIIIILLL(findViewById(R.id.cho));
        LLLLIIIILLL(findViewById(R.id.kqm));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0Ltd, android.view.ViewTreeObserver$OnPreDrawListener] */
    public final void LLLLILI() {
        final View view;
        ViewOnLayoutChangeListenerC580900MqO viewOnLayoutChangeListenerC580900MqO;
        if (this.LLJILLL.getEnableDynamicInputBoxHeight$tools_ai_uikit_df_release()) {
            final C565430MFp c565430MFp = (C565430MFp) findViewById(R.id.kql);
            C565430MFp c565430MFp2 = (C565430MFp) findViewById(R.id.do2);
            if ((c565430MFp2 == null || !c565430MFp2.isShown()) && c565430MFp != null) {
                c565430MFp.isShown();
            } else {
                c565430MFp = c565430MFp2;
                if (c565430MFp2 == null) {
                    return;
                }
            }
            final View viewFindViewById = findViewById(R.id.cho);
            if (viewFindViewById == null || (view = (View) this.LLJJJJJIL.getValue()) == null) {
                return;
            }
            C565430MFp c565430MFp3 = this.LLJL;
            if (c565430MFp3 != c565430MFp) {
                if (c565430MFp3 != null && (viewOnLayoutChangeListenerC580900MqO = this.LLJJLIIIJLLLLLLLZ) != null) {
                    c565430MFp3.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580900MqO);
                }
                ViewOnLayoutChangeListenerC580900MqO viewOnLayoutChangeListenerC580900MqO2 = new ViewOnLayoutChangeListenerC580900MqO(this, 0);
                this.LLJJLIIIJLLLLLLLZ = viewOnLayoutChangeListenerC580900MqO2;
                this.LLJL = c565430MFp;
                c565430MFp.addOnLayoutChangeListener(viewOnLayoutChangeListenerC580900MqO2);
            }
            if (this.LLJJJJLIIL) {
                return;
            }
            this.LLJJJJLIIL = true;
            ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0Ltd
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    int i;
                    int i2;
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    boolean z = false;
                    if (!view.getViewTreeObserver().isAlive()) {
                        C557410Ltb c557410Ltb = this;
                        c557410Ltb.LLJJJJLIIL = false;
                        c557410Ltb.LLJJL = null;
                        return true;
                    }
                    C786410Ut5.D3(view.getViewTreeObserver(), this);
                    C557410Ltb c557410Ltb2 = this;
                    c557410Ltb2.LLJJJJLIIL = false;
                    c557410Ltb2.LLJJL = null;
                    Integer numValueOf = Integer.valueOf(c565430MFp.getHeight());
                    if (numValueOf.intValue() > 0) {
                        int iIntValue = numValueOf.intValue();
                        Integer numValueOf2 = Integer.valueOf(viewFindViewById.getHeight());
                        if (numValueOf2.intValue() > 0) {
                            int iIntValue2 = numValueOf2.intValue();
                            ViewGroup.LayoutParams layoutParams = c565430MFp.getLayoutParams();
                            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                                i = 0;
                                i2 = 0;
                            } else {
                                i = marginLayoutParams.topMargin;
                                i2 = marginLayoutParams.bottomMargin;
                            }
                            int i3 = iIntValue + iIntValue2 + i + i2;
                            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                            if (layoutParams2 == null) {
                                return true;
                            }
                            if (layoutParams2.height != i3) {
                                z = true;
                                layoutParams2.height = i3;
                                C786410Ut5.W5(view, layoutParams2);
                            }
                            this.getClass();
                            return !z;
                        }
                    }
                    return true;
                }
            };
            this.LLJJL = r1;
            C786410Ut5.y3(view.getViewTreeObserver(), r1);
            view.invalidate();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        ViewOnLayoutChangeListenerC580900MqO viewOnLayoutChangeListenerC580900MqO;
        View view = (View) this.LLJJJJJIL.getValue();
        ViewTreeObserverOnPreDrawListenerC557430Ltd viewTreeObserverOnPreDrawListenerC557430Ltd = this.LLJJL;
        if (view != null && viewTreeObserverOnPreDrawListenerC557430Ltd != null && view.getViewTreeObserver().isAlive()) {
            C786410Ut5.D3(view.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC557430Ltd);
        }
        this.LLJJL = null;
        this.LLJJJJLIIL = false;
        C565430MFp c565430MFp = this.LLJL;
        if (c565430MFp != null && (viewOnLayoutChangeListenerC580900MqO = this.LLJJLIIIJLLLLLLLZ) != null) {
            c565430MFp.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580900MqO);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        super.onDestroyView();
        this.LLJJJJ.dispose();
    }

    public C557410Ltb(C553840Lnq c553840Lnq) {
        this.LLJILLL = c553840Lnq;
    }

    public static void LLLLIIIILLL(View view) {
        if (view == null) {
            return;
        }
        view.animate().cancel();
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.Ob(view, 0.9f);
        C786410Ut5.pc(view, 0.9f);
        HandlerHook.viewPost(view, new ARunnableS106S0100000_6(view, 34));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Lte, ge.i] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Lte, ge.i] */
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
    public final void LLLLIL(boolean z, boolean z2) {
        ?? r0 = this.LLJJIJIL;
        if (r0 != 0) {
            r0.ka(true);
        }
        ?? r02 = this.LLJJIJIL;
        if (r02 != 0) {
            r02.OQ0(z);
        }
        C557370LtX c557370LtX = this.LLJJIJIIJIL;
        if (c557370LtX != null) {
            c557370LtX.sK1(true);
        }
        C557370LtX c557370LtX2 = this.LLJJIJIIJIL;
        if (c557370LtX2 != null) {
            c557370LtX2.A92(z2);
        }
        C555030Lpl c555030Lpl = this.LLJJIJI;
        if (c555030Lpl != null) {
            c555030Lpl.sb2(false, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Lte, ge.i] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Lte, ge.i] */
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C11RK<List<InputBlock>> c11rkO0;
        LiveData liveDataAk2;
        LiveData liveDataXP2;
        LiveData liveDataJp1;
        LiveData liveDataWj;
        LiveData<C00YB> liveDataEz;
        LiveData<AbstractC551420Ljw> liveDataI6;
        C557370LtX c557370LtX;
        C11RK<String> c11rkUo;
        C11RK<String> c11rkUo2;
        LiveData liveDataU8;
        C11RK<List<InputBlock>> c11rkO02;
        LiveData liveDataSv;
        LiveData liveDataJj;
        super.onViewCreated(view, bundle);
        C1664590tQ1.LIZLLL(this, null, true, AFwS239S0000000_8.get$arr$(36), 1);
        C1664600tQ2.LIZ(this, null, new AwS587S0100000_8(this, 49));
        C555030Lpl c555030Lpl = this.LLJJIJI;
        if (c555030Lpl != null && (liveDataJj = c555030Lpl.Jj()) != null) {
            liveDataJj.observe(this, new AObserverS212S0100000_8(this, 20));
        }
        C555030Lpl c555030Lpl2 = this.LLJJIJI;
        if (c555030Lpl2 != null && (liveDataSv = c555030Lpl2.Sv()) != null) {
            liveDataSv.observe(this, new AObserverS212S0100000_8(this, 21));
        }
        C557370LtX c557370LtX2 = this.LLJJIJIIJIL;
        if (c557370LtX2 != null && (c11rkO02 = c557370LtX2.O0()) != null) {
            c11rkO02.LIZIZ(this.LLJLL);
        }
        C557370LtX c557370LtX3 = this.LLJJIJIIJIL;
        if (c557370LtX3 != null && (liveDataU8 = c557370LtX3.U8()) != null) {
            liveDataU8.observe(this, new AObserverS212S0100000_8(this, 22));
        }
        C557370LtX c557370LtX4 = this.LLJJIJIIJIL;
        if (c557370LtX4 != null && (c11rkUo2 = c557370LtX4.uo()) != null) {
            c11rkUo2.LIZIZ(this.LLJLLL);
        }
        if (this.LLJILLL.getEnableDynamicInputBoxHeight$tools_ai_uikit_df_release() && (c557370LtX = this.LLJJIJIIJIL) != null && (c11rkUo = c557370LtX.uo()) != null) {
            this.LLJJJJ.LIZ(c11rkUo.LJJLJLI(new AfS177S0100000_8(this, 8)));
        }
        ?? r0 = this.LLJJIJIL;
        if (r0 != 0 && (liveDataI6 = r0.i6()) != null) {
            liveDataI6.observe(this, new AObserverS212S0100000_8(this, 23));
        }
        ?? r02 = this.LLJJIJIL;
        if (r02 != 0 && (liveDataEz = r02.ez()) != null) {
            liveDataEz.observe(this, new AObserverS212S0100000_8(this, 24));
        }
        C18SI c18si = this.LLJJJ;
        if (c18si != null && (liveDataWj = c18si.wj()) != null) {
            liveDataWj.observe(this, new AObserverS212S0100000_8(this, 25));
        }
        C18SI c18si2 = this.LLJJJ;
        if (c18si2 != null && (liveDataJp1 = c18si2.Jp1()) != null) {
            liveDataJp1.observe(this, new AObserverS212S0100000_8(this, 26));
        }
        C18SI c18si3 = this.LLJJJ;
        if (c18si3 != null && (liveDataXP2 = c18si3.xP2()) != null) {
            liveDataXP2.observe(this, new AObserverS212S0100000_8(this, 27));
        }
        C18SI c18si4 = this.LLJJJ;
        if (c18si4 != null && (liveDataAk2 = c18si4.ak2()) != null) {
            liveDataAk2.observe(this, new AObserverS212S0100000_8(this, 19));
        }
        C557370LtX c557370LtX5 = this.LLJJIJIIJIL;
        if (c557370LtX5 != null && (c11rkO0 = c557370LtX5.O0()) != null) {
            this.LLJJJJ.LIZ(c11rkO0.LJJLJLI(new AfS177S0100000_8(this, 7)));
        }
        if (this.LLJILLL.getEnableDynamicInputBoxHeight$tools_ai_uikit_df_release()) {
            HandlerHook.viewPost(view, new ARunnableS77S0200000_8(view, this, 2));
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.o3, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
