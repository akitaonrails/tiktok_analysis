package X;

import Y.AfS106S0300000_10;
import Y.AfS146S0200000_10;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.Map;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QeT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675430QeT extends C0QCZ {
    public Fragment LJIIL;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJIILIIL;
    public C09AY LJIILJJIL;
    public AwS589S0100000_10 LJIILL;
    public AwS624S0100000_10 LJIILLIIL;
    public AwS624S0100000_10 LJIIZILJ;

    @Override // X.InterfaceC666420QCa
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZIZ() {
        return this.LJIILIIL;
    }

    public final void LJIIL(DynamicPatch dynamicPatch, Map<String, ? extends Object> map) {
        LynxView lynxView;
        if (Intrinsics.LJFF(dynamicPatch, this.LJIIJJI)) {
            Object kitView = this.LJIILIIL.getKitView();
            if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
                lynxView.onEnterForeground();
                return;
            }
            return;
        }
        LJII();
        C830490Whz c830490Whz = new C830490Whz();
        LIZLLL(c830490Whz);
        this.LJIIJ.add(C11NN.LJIIIIZZ(c830490Whz).LJIIIZ(new InterfaceC1487280oo2() { // from class: X.0QeV
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return TemplateData.LJII((C830490Whz) obj);
            }
        }).LJIIZILJ(C11S5.LIZIZ).LJIIJ(C1701940uOG.LIZIZ()).LJIIL(new AfS106S0300000_10(this, dynamicPatch, map, 2)));
    }

    public C675430QeT(Fragment fragment, Context context, LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.LJIIL = fragment;
        C0QCP.LIZ.getClass();
        this.LJIILIIL = C0QCP.LIZ(context);
        this.LIZIZ = this.LJIIL;
    }

    @Override // X.InterfaceC666420QCa
    public final void LIZJ(DynamicPatch dynamicPatch, Map<String, ? extends Object> map, boolean z) {
        LynxView lynxView;
        if (Intrinsics.LJFF(dynamicPatch, this.LJIIJJI)) {
            Object kitView = this.LJIILIIL.getKitView();
            if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
                lynxView.onEnterForeground();
                return;
            }
            return;
        }
        LJII();
        C830490Whz c830490Whz = new C830490Whz();
        if (map != null) {
            c830490Whz.putAll(map);
        }
        LIZLLL(c830490Whz);
        this.LJIIJ.add(C11NN.LJIIIIZZ(c830490Whz).LJIIIZ(new InterfaceC1487280oo2() { // from class: X.0QeU
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return TemplateData.LJII((C830490Whz) obj);
            }
        }).LJIIZILJ(C11S5.LIZIZ).LJIIJ(C1701940uOG.LIZIZ()).LJIIL(new AfS146S0200000_10(this, dynamicPatch, 5)));
    }
}
