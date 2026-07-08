package X;

import Y.AObjectS246S0100000_25;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.gamora.recorder.sticker.popup.RecordStickerPanelPopupScreenScene;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS17S0401000_25;
import kotlin.jvm.internal.AwS269S0300000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0sU6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628680sU6 extends AbstractC2255721DQs<InterfaceC1627990sSz> implements InterfaceC1627990sSz, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), Context.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(324));
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1627990sSz LLILZLL = this;
    public final InterfaceC332260D0u<Boolean> LLIZ = C1BNE.LIZ(Boolean.FALSE);
    public final InterfaceC1737690vJv LLIZLLLIL = new InterfaceC1737690vJv() { // from class: X.0sU7
        @Override // X.InterfaceC1737690vJv
        public final boolean onBackPressed() {
            return true;
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1628680sU6.class, "context", "getContext()Landroid/content/Context;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1628680sU6.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJI = 8;
    }

    private final boolean Z1() {
        return ((Boolean) this.LLILZ.getValue()).booleanValue();
    }

    private final Context getContext() {
        return (Context) this.LLILLL.getValue(this, LLJ[0]);
    }

    public final q getStickerApi() {
        return (q) this.LLILZIL.getValue(this, LLJ[1]);
    }

    public final void hJ() {
        Scene next;
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LLILLJJLI);
        if (navigationSceneLIZ == null) {
            return;
        }
        Iterator<Scene> it2 = navigationSceneLIZ.getSceneList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next instanceof C1642330sq7) {
                    break;
                }
            }
        }
        Scene scene = next;
        if (scene != null) {
            navigationSceneLIZ.remove(scene);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getStickerApi().pb2().LJII(this, Lifecycle.State.STARTED, new AObjectS246S0100000_25(this, 608));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC1622080sJS interfaceC1622080sJSI2 = getStickerApi().I2(AFwS266S0000000_25.get$arr$(310));
        if (!(interfaceC1622080sJSI2 instanceof C1628610sTz)) {
            interfaceC1622080sJSI2 = null;
        }
        C1628610sTz c1628610sTz = (C1628610sTz) interfaceC1622080sJSI2;
        if (c1628610sTz != null) {
            c1628610sTz.LLIZ = null;
        }
    }

    public InterfaceC1627990sSz X1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public InterfaceC332260D0u<Boolean> o2() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1627990sSz
    public /* bridge */ /* synthetic */ C05YD ps() {
        return this.LLIZ;
    }

    private final Function0<Unit> w2(C20656615sK c20656615sK) {
        return new AwS426S0200000_25(this, c20656615sK, 103);
    }

    public final void G2(C20656615sK c20656615sK) {
        W1(c20656615sK);
        hJ();
        getStickerApi().rS(true);
        this.LLIZ.setValue(Boolean.FALSE);
    }

    public final void W1(C20656615sK c20656615sK) {
        if (Z1()) {
            if (c20656615sK != null) {
                c20656615sK.LIZ();
            }
            C1637830sir.LLILLJJLI = 0L;
        }
    }

    public C1628680sU6(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
    }

    @Override // X.InterfaceC1627990sSz
    public void Uu1(int i, Function0<Unit> function0, Function0<Unit> function02) {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LLILLJJLI);
        if (navigationSceneLIZ == null) {
            return;
        }
        if (Z1()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - C1637830sir.LLILLJJLI) < 500) {
                return;
            }
            C1637830sir.LLILLJJLI = jCurrentTimeMillis;
            PopupManager.LJIJ(new C1637830sir(RecordStickerPanelPopupScreenScene.Companion.LIZ(getContext(), this), new AwS17S0401000_25(this, (C1628680sU6) navigationSceneLIZ, (NavigationScene) i, (int) function0, function02, (Function0<Unit>) 0)), "disturbing_sticker_warning_popup", new C1668306g5("disturbing_sticker_warning_creative_trigger"));
            return;
        }
        H2(this, navigationSceneLIZ, i, function0, function02, null);
    }

    public static final void H2(C1628680sU6 c1628680sU6, NavigationScene navigationScene, int i, Function0 function0, Function0 function02, C20656615sK c20656615sK) {
        if (!C523910Kgf.LIZIZ(navigationScene, C1642330sq7.class)) {
            function0.invoke();
            c1628680sU6.getStickerApi().rS(false);
            c1628680sU6.LLIZ.setValue(Boolean.TRUE);
            C1642330sq7 c1642330sq7 = new C1642330sq7(i, new AwS269S0300000_25(c1628680sU6, (C1628680sU6) c20656615sK, (C20656615sK) function02, (Function0<Unit>) 10), c1628680sU6.w2(c20656615sK));
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZ = true;
            navigationScene.LLLLLLLLLL(c1642330sq7, c569760MWg.LIZ());
            navigationScene.LLLIILIL(c1642330sq7, c1628680sU6.LLIZLLLIL);
        }
    }
}
