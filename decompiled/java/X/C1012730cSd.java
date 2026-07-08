package X;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012730cSd implements InterfaceC1007910cKr {
    public final Aweme LIZ;
    public final FrameLayout LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(362));
    public C1009340cNA LIZLLL;
    public IAnoleManager LJ;
    public boolean LJFF;

    @Override // X.InterfaceC1007910cKr
    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
    }

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
    public final C1008080cL8 c3() {
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
        if (this.LIZIZ != null) {
            return new C1014390cVJ(new C1009390cNF(r6.getWidth(), r6.getHeight()), new PointF(r6.getWidth() / 2, r6.getHeight() / 2));
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1009390cNF W2(String str) {
        return C1008220cLM.LIZ();
    }

    public C1012730cSd(Aweme aweme, C1036030d4D c1036030d4D) {
        this.LIZ = aweme;
        this.LIZIZ = c1036030d4D;
    }
}
