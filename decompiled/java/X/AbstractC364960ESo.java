package X;

import X.C360050E9r;
import Y.ARunnableS74S0200000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.navigation.NavigationScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ESo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC364960ESo<I extends C360050E9r, O> extends C19A3 {
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final boolean LLJJI;
    public final C0EZ4 LLJJIII;
    public boolean LLJJIJI;
    public I LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C19A3 LLJJJ;
    public NavigationScene LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public InterfaceC362600EJm LLJJL;

    public abstract Function1<C539960LFq, Unit> LLLLIL();

    public abstract Function1<C1DRF, Unit> LLLLILI();

    public abstract C0ESS LLLLJI();

    public final C0E48 LIZIZ() {
        return (C0E48) this.LLJJIJIL.getValue();
    }

    public final boolean LLLLIIIILLL() {
        C0ETQ c0etq = (C0ETQ) this.LLJJJJ.getValue();
        if (c0etq != null) {
            return c0etq.close();
        }
        return false;
    }

    public C0ETA LLLLL() {
        return (C0ETA) this.LLJJ.getValue();
    }

    public final boolean LLLLLILLIL() {
        return ((Boolean) this.LLJILLL.getValue()).booleanValue();
    }

    public AbstractC364960ESo() {
        setTheme(R.style.y0);
        this.LLJILLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(292));
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1054));
        this.LLJJI = true;
        this.LLJJIII = new C0EZ4(null, null, null, null, 15);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1051));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1053));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1052));
    }

    public int LLLLIILL() {
        return LLLLLILLIL() ? R.layout.c23 : R.layout.c22;
    }

    @Override // com.bytedance.scene.Scene
    public void onDestroyView() {
        InterfaceC360570EBr interfaceC360570EBr;
        if (C357780E0y.LIZ() && (interfaceC360570EBr = (InterfaceC360570EBr) this.LLJJJJJIL.getValue()) != null) {
            interfaceC360570EBr.dB2(LLLLJI());
        }
        super.onDestroyView();
    }

    public C0EZ4 LLLLJ() {
        return this.LLJJIII;
    }

    public boolean LLLLLIL() {
        return this.LLJJI;
    }

    @Override // com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        InterfaceC360570EBr interfaceC360570EBr;
        NavigationScene navigationSceneLIZ;
        super.onActivityCreated(bundle);
        if (C0E47.LIZ()) {
            C19A3 c19a3 = this.LLJJJ;
            if (c19a3 != null && (navigationSceneLIZ = C1447800nmM.LIZ(c19a3)) != null) {
                navigationSceneLIZ.LLLIILIL(this, new C0FXH(this, 12));
            }
            C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(419));
            C1664590tQ1.LIZ(this, getClass().getSimpleName(), true, new AwS584S0100000_5(this, (AbstractC364960ESo<C360050E9r, Object>) 878));
            C1664600tQ2.LIZ(this, getClass().getSimpleName(), new AwS584S0100000_5(this, (AbstractC364960ESo<C360050E9r, Object>) 880));
            if (LLLLLILLIL() && !this.LLJJIJI && (interfaceC360570EBr = (InterfaceC360570EBr) this.LLJJJJJIL.getValue()) != null) {
                interfaceC360570EBr.IB1(LLLLJI());
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS74S0200000_5(view, this, 44));
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLJJJJLIIL = viewGroup;
        return (ViewGroup) C786410Ut5.Td(layoutInflater, LLLLIILL(), viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
