package X;

import X.InterfaceC373200EkA;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C375790EoL<T extends InterfaceC373200EkA> extends AbstractC381020Ewm<T> implements InterfaceC373200EkA, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LLILLL;
    public final NavigationScene LLILZ;
    public final Scene LLILZIL;
    public final String LLILZLL;
    public boolean LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C375790EoL.class, "epPanelApiComponent", "getEpPanelApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = 8;
    }

    public T X1() {
        return this;
    }

    @Override // X.InterfaceC373200EkA
    public boolean dx2() {
        if (this.LLIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PanelNavComponent already pending: ");
            sbLIZ.append(getPanelName());
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        this.LLIZ = true;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PanelNavComponent pending: ");
        sbLIZ2.append(getPanelName());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }

    public final C0EB6 o2() {
        return (C0EB6) this.LLIZLLLIL.getValue(this, LLJ[0]);
    }

    @Override // X.InterfaceC373200EkA
    public void lt1() {
        float fZ1 = Z1(C1664590tQ1.LJII(this));
        if (o2() != null) {
            C0EB6 c0eb6O2 = o2();
            if (c0eb6O2 != null) {
                c0eb6O2.LJIIJJI(true);
            }
            C0EB6 c0eb6O22 = o2();
            if (c0eb6O22 != null) {
                c0eb6O22.LJIIIZ(new C0E2C(fZ1, getPanelName(), true));
                return;
            }
            return;
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            c0e48W1.S7().LIZIZ(Boolean.TRUE, "is_bottom_panel_showing", false);
            c0e48W1.S7().LIZIZ(new C0E2C(fZ1, getPanelName(), true), "panel_bounce_event", false);
        }
    }

    @Override // X.InterfaceC373200EkA
    public void sr0() {
        float fZ1 = Z1(C1664590tQ1.LJII(this));
        if (o2() != null) {
            C0EB6 c0eb6O2 = o2();
            if (c0eb6O2 != null) {
                c0eb6O2.LJIIJJI(false);
            }
            C0EB6 c0eb6O22 = o2();
            if (c0eb6O22 != null) {
                c0eb6O22.LJIIIZ(new C0E2C(fZ1, getPanelName(), false));
                return;
            }
            return;
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            c0e48W1.S7().LIZIZ(Boolean.FALSE, "is_bottom_panel_showing", false);
            c0e48W1.S7().LIZIZ(new C0E2C(fZ1, getPanelName(), false), "panel_bounce_event", false);
        }
    }

    public final Scene G2() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public String getPanelName() {
        return this.LLILZLL;
    }

    public final NavigationScene w2() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC373200EkA
    public void Db0(Object obj) {
        NavigationScene navigationScene;
        try {
            Scene scene = this.LLILZIL;
            if (scene != null && (navigationScene = this.LLILZ) != null) {
                navigationScene.LLLLLLZZ(scene, obj);
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PanelNavComponent save error: ");
            sbLIZ.append(getPanelName());
            C201955140j.LJI(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public final int Z1(Context context) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null || (viewFindViewById = activityLIZ.findViewById(R.id.gcu)) == null || (viewFindViewById2 = activityLIZ.findViewById(R.id.ygy)) == null || (viewFindViewById3 = activityLIZ.findViewById(R.id.gcv)) == null) {
            return 0;
        }
        return viewFindViewById.getMeasuredHeight() + viewFindViewById2.getMeasuredHeight() + viewFindViewById3.getMeasuredHeight();
    }

    @Override // X.InterfaceC373200EkA
    public void exit(boolean z) {
        C1524705y1.LIZJ(new AwS549S0100000_5((C375790EoL) this, 816));
    }

    public C375790EoL(C1DRG c1drg, NavigationScene navigationScene, Scene scene, String str) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = navigationScene;
        this.LLILZIL = scene;
        this.LLILZLL = str;
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EB6.class, null);
    }
}
