package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.provider.impl.GScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555440qZy extends C1554710qYn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1555590qaD LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1555440qZy.class, "viewWeak", "getViewWeak()Landroid/view/View;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // X.C1554710qYn, X.InterfaceC665370Q7z
    public final Object getHost() {
        C1555590qaD c1555590qaD = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return c1555590qaD.LIZ.get();
    }

    @Override // X.C1554710qYn, X.InterfaceC665370Q7z
    public final C1554890qZ5 getTree() {
        return (C1554890qZ5) this.LLILZIL.getValue();
    }

    public C1555440qZy(View view, LifecycleOwner lifecycleOwner, String str) {
        InterfaceC665370Q7z interfaceC665370Q7zLJI;
        super(str);
        C1555590qaD c1555590qaD = new C1555590qaD(new C1555460qa0(view));
        this.LLILZ = c1555590qaD;
        this.LLILZIL = C452501pT.LIZIZ(new C1555450qZz(this));
        C665410Q8d.LIZIZ(new C1555470qa1(lifecycleOwner, this));
        if (Intrinsics.LJFF(getTree().LJIIIIZZ(), GScope.LL)) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
            View view2 = (View) c1555590qaD.LIZ.get();
            if (view2 != null) {
                Fragment fragmentLIZ = C946803n0.LIZ(view2);
                if (fragmentLIZ != null) {
                    interfaceC665370Q7zLJI = C1558360qeg.LJFF(fragmentLIZ, null);
                } else {
                    View view3 = (View) c1555590qaD.LIZ.get();
                    if (view3 != null) {
                        C19EG c19egLIZ = C665410Q8d.LIZ(view3);
                        if (c19egLIZ != null) {
                            interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZ, null);
                        } else {
                            throw new RuntimeException("view is not attached to host");
                        }
                    } else {
                        throw new RuntimeException("view is already destroyed!");
                    }
                }
                getTree().LIZIZ(interfaceC665370Q7zLJI);
                return;
            }
            throw new RuntimeException("view is already destroyed!");
        }
    }
}
