package X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cN6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009300cN6 implements InterfaceC1007910cKr {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public ViewGroup LIZJ;
    public IAnoleManager LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(472));
    public SparkContext LJFF;

    @Override // X.InterfaceC1007910cKr
    public final void LJJLIIJ() {
    }

    @Override // X.InterfaceC1007910cKr
    public final long LJJLIL() {
        return 0L;
    }

    @Override // X.InterfaceC1007910cKr
    public final int LLJILLL() {
        return 0;
    }

    @Override // X.InterfaceC1007910cKr
    public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014410cVL LLJJIJI(String str) {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014390cVJ LLJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void P() {
    }

    @Override // X.InterfaceC1007910cKr
    public final void U2() {
    }

    @Override // X.InterfaceC1007910cKr
    public final JSONObject V2() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
    }

    @Override // X.InterfaceC1007910cKr
    public final HashMap<String, Object> Z2() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean a3(String str, Runnable runnable, int i) {
        return true;
    }

    @Override // X.InterfaceC1007910cKr
    public final ViewGroup b3() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean d3() {
        return true;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean e3() {
        return false;
    }

    @Override // X.InterfaceC1007910cKr
    public final void f3(long j, String str, String str2, AwS81S0100100_16 awS81S0100100_16) {
    }

    @Override // X.InterfaceC1007910cKr
    public final void g3(int i) {
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean h3(String str, InterfaceC1007930cKt interfaceC1007930cKt, AnoleComponentAppearModel anoleComponentAppearModel) {
        return true;
    }

    @Override // X.InterfaceC1007910cKr
    public final Integer i3() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void o0() {
    }

    @Override // X.InterfaceC1007910cKr
    public final void pauseVideo() {
    }

    @Override // X.InterfaceC1007910cKr
    public final long r1() {
        return 0L;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014390cVJ Y2() {
        if (this.LIZJ != null) {
            return new C1014390cVJ(new C1009390cNF(r6.getWidth(), r6.getHeight()), new PointF(r6.getWidth() / 2, r6.getHeight() / 2));
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1008080cL8 c3() {
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        String strLIZ = C1014230cV3.LIZ("scene_anole_format");
        InterfaceC1020440cf4 interfaceC1020440cf4 = new InterfaceC1020440cf4() { // from class: X.0cf1
            @Override // X.InterfaceC1020440cf4
            public final List<Class<? extends InterfaceC1063710dmr>> LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC1020440cf4
            public final InterfaceC1057870ddR LIZJ(AdSparkHybridContext adSparkHybridContext, Context context, String str, Bundle bundle) {
                return null;
            }

            @Override // X.InterfaceC1020440cf4
            public final AbstractC1542100qES LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC1020440cf4
            public final List<InterfaceC1051730dTX> LIZ(C1051660dTQ c1051660dTQ) {
                InterfaceC1000280c8Y interfaceC1000280c8Y2;
                ICommercializeAdService iCommercializeAdService = (ICommercializeAdService) PluggableExtentionKt.pluggableSpi$default(ICommercializeAdService.class, false, false, false, 14, null);
                InterfaceC988500bpY interfaceC988500bpYQ = null;
                if (iCommercializeAdService != null) {
                    interfaceC988500bpYQ = iCommercializeAdService.Q(17);
                }
                if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y2 = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null && interfaceC1000280c8Y2.LJJIIJ() != null) {
                    return C1020280ceo.LIZ(c1051660dTQ);
                }
                return C13BV.INSTANCE;
            }
        };
        Bundle bundle = new Bundle();
        ICommercializeAdService iCommercializeAdService = (ICommercializeAdService) PluggableExtentionKt.pluggableSpi$default(ICommercializeAdService.class, false, false, false, 14, null);
        InterfaceC988500bpY interfaceC988500bpYQ = iCommercializeAdService != null ? iCommercializeAdService.Q(17) : null;
        if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null) {
            interfaceC1000280c8Y.LJIJJ(this.LIZ, bundle, this.LIZIZ);
        }
        return new C1008080cL8(bundle, strLIZ, interfaceC1020440cf4, (AwS595S0100000_16) null, 24);
    }

    @Override // X.InterfaceC1007910cKr
    public final C1009390cNF W2(String str) {
        return C1008220cLM.LIZ();
    }

    public C1009300cN6(Context context, Aweme aweme) {
        this.LIZ = context;
        this.LIZIZ = aweme;
    }

    @Override // X.InterfaceC1007910cKr
    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
        if (abstractC991850bux instanceof C1005320cGg) {
            C1440005kM.LIZ(new C991890bv1(this.LIZIZ.getAid(), (C1005320cGg) abstractC991850bux));
        }
    }
}
