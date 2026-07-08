package X;

import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import webcast.api.feed.LiveTab;

/* JADX INFO: renamed from: X.0IkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475280IkQ implements InterfaceC479770Irf, InterfaceC477100InM {
    public final InterfaceC479780Irg<?> LL;
    public final InterfaceC475300IkS LLILLJJLI;
    public final C475310IkT LLILLL;
    public C472280Ifa LLILZ;

    @Override // X.InterfaceC479770Irf
    public final void F2(boolean z) {
    }

    @Override // X.InterfaceC479770Irf
    public final int G2(int i) {
        return -1;
    }

    @Override // X.InterfaceC479770Irf
    public final String H2(int i) {
        return "";
    }

    @Override // X.InterfaceC479770Irf
    public final void I2(C21546719Ub c21546719Ub) {
    }

    @Override // X.InterfaceC479770Irf
    public final void J2(int i) {
    }

    @Override // X.InterfaceC477100InM
    public final boolean K4() {
        return true;
    }

    @Override // X.InterfaceC479770Irf
    public final int LIZ(EnterRoomConfig enterRoomConfig) {
        return 0;
    }

    @Override // X.InterfaceC479770Irf
    public final boolean M2() {
        return false;
    }

    @Override // X.InterfaceC477100InM
    public final void fj(Rect rect) {
    }

    @Override // X.InterfaceC479770Irf
    public final Fragment getCurrentFragment() {
        return null;
    }

    @Override // X.InterfaceC479770Irf
    public final int getLayoutId() {
        return R.layout.db2;
    }

    @Override // X.InterfaceC479770Irf
    public final void onDestroy() {
    }

    @Override // X.InterfaceC477100InM
    public final C475460Iki c1() {
        InterfaceC475300IkS interfaceC475300IkS = this.LLILLJJLI;
        if (interfaceC475300IkS != null) {
            return interfaceC475300IkS.c1();
        }
        return null;
    }

    @Override // X.InterfaceC477100InM
    public final Object em() {
        return this.LL.xL();
    }

    @Override // X.InterfaceC479770Irf
    public final Float rs() {
        C476830Imv c476830Imv;
        SkylightController skylightController = this.LLILLL.LJFF;
        if (skylightController == null || (c476830Imv = skylightController.LL) == null) {
            return null;
        }
        return Float.valueOf(c476830Imv.LJFF());
    }

    @Override // X.InterfaceC479770Irf
    public final Map<String, String> Z() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC479770Irf
    public final List<LiveTab> L2() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC477100InM
    public final EnumC471790Ien getPage() {
        return EnumC471790Ien.ROOM;
    }

    public C475280IkQ(InterfaceC479780Irg<?> interfaceC479780Irg, InterfaceC475300IkS interfaceC475300IkS) {
        this.LL = interfaceC479780Irg;
        this.LLILLJJLI = interfaceC475300IkS;
        this.LLILLL = new C475310IkT(interfaceC479780Irg.xL(), interfaceC479780Irg, interfaceC475300IkS, false, this, AFwS193S0000000_7.get$arr$(155));
    }

    @Override // X.InterfaceC479770Irf
    public final void K2(EnterRoomConfig enterRoomConfig, C19EH c19eh) {
        C472280Ifa c472280Ifa = (C472280Ifa) this.LL.U6().findViewById(R.id.trt);
        this.LLILZ = c472280Ifa;
        if (c472280Ifa != null) {
            c472280Ifa.setPageContainer(1);
        }
        this.LLILLJJLI.LJIIJ(this.LLILZ);
        C475310IkT c475310IkT = this.LLILLL;
        C472280Ifa c472280Ifa2 = this.LLILZ;
        c475310IkT.LJI = c472280Ifa2;
        SkylightController skylightController = c475310IkT.LJFF;
        if (skylightController != null) {
            skylightController.LLJILJILJ = c472280Ifa2;
        }
        this.LLILLL.LIZIZ(enterRoomConfig, c19eh, this.LLILZ);
        SkylightController skylightController2 = this.LLILLL.LJFF;
        if (skylightController2 != null) {
            C476830Imv c476830Imv = skylightController2.LL;
            if (c476830Imv != null) {
                C500260Jjc.LLFFF(c476830Imv.LJIILLIIL);
            }
            skylightController2.LLJILJIL = true;
        }
    }

    @Override // X.InterfaceC479770Irf
    public final <T> void E2(EnterRoomConfig enterRoomConfig, InterfaceC479830Irl<T> interfaceC479830Irl, C19EH c19eh) {
        C472280Ifa c472280Ifa = (C472280Ifa) this.LL.U6().findViewById(R.id.trt);
        this.LLILZ = c472280Ifa;
        if (c472280Ifa != null) {
            c472280Ifa.setPageContainer(1);
        }
        this.LLILLJJLI.LJIIJ(this.LLILZ);
        this.LLILLL.LIZJ(enterRoomConfig, interfaceC479830Irl, c19eh, this.LLILZ);
    }
}
