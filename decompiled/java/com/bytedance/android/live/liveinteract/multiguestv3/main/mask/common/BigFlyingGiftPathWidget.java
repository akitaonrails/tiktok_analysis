package com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common;

import X.C1083680eJ4;
import X.C1085630eMD;
import X.C1118780fDg;
import X.C1118840fDm;
import X.C1140660fmy;
import X.C1143620frk;
import X.C1143630frl;
import X.C1292030jj7;
import X.C1294250jmh;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C13LP;
import X.C20441214yg;
import X.C2188811AlT;
import X.C784440Upu;
import X.C930540aK4;
import X.InterfaceC1143640frm;
import X.InterfaceC1292040jj8;
import Y.AfS186S0100000_17;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.BigFlyingGiftEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.BigFlyingGiftPathWidget;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BigFlyingGiftPathWidget extends LiveWidget {
    public final ViewGroup LL;
    public boolean LLILLL;
    public C1085630eMD<C1295960jpS> LLILZ;
    public final int[] LLILLJJLI = new int[2];
    public final ArrayList<C1295960jpS> LLILZIL = new ArrayList<>();
    public final ArrayList<C1143630frl> LLILZLL = new ArrayList<>();
    public final Map<String, C1294720jnS> LLIZ = new LinkedHashMap();

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract String y1(long j);

    public final void A1() {
        for (C1143630frl c1143630frl : C13LP.LLIIII(this.LLILZLL)) {
            C1295960jpS c1295960jpS = c1143630frl.LJ;
            if (c1295960jpS != null && c1143630frl.LJFF) {
                if (this.LLILLL) {
                    C1118840fDm c1118840fDm = c1143630frl.LIZLLL;
                    if (c1118840fDm != null) {
                        C1118780fDg.LIZIZ(c1118840fDm, 0, 2, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
                    }
                } else {
                    c1295960jpS.playAnimation();
                    InterfaceC1143640frm interfaceC1143640frm = c1143630frl.LIZJ;
                    if (interfaceC1143640frm != null) {
                        interfaceC1143640frm.LIZ();
                    }
                }
                this.LLILZLL.remove(c1143630frl);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        DataChannelGlobal.LLILZ.zQ2(this);
        this.LLILZIL.clear();
        this.LLILZLL.clear();
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            viewGroup.getLocationInWindow(this.LLILLJJLI);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BigFlyingGiftEvent.class, new AwS596S0100000_17(this, 34));
        }
        DataChannelGlobal.LLILZ.CQ2(ScreenClearEvent.class, this, new C1083680eJ4(this));
        C784440Upu.LIZ().LIZJ(this, C1140660fmy.class).LIZJ(new AfS186S0100000_17(this, 8));
    }

    public BigFlyingGiftPathWidget(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }

    public static String x1(long j, long j2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(j2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void B1(long j, long j2, InterfaceC1143640frm interfaceC1143640frm, C1118840fDm c1118840fDm, C1295960jpS c1295960jpS) {
        C1143630frl next;
        Iterator<C1143630frl> it2 = this.LLILZLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C1143630frl c1143630frl = next;
                if (c1143630frl.LIZ == j && c1143630frl.LIZIZ == j2 && c1143630frl.LJ == null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1143630frl c1143630frl2 = next;
        if (c1143630frl2 == null) {
            this.LLILZLL.add(new C1143630frl(j, j2, interfaceC1143640frm, c1118840fDm, c1295960jpS, false));
        } else {
            c1143630frl2.LIZJ = interfaceC1143640frm;
            c1143630frl2.LIZLLL = c1118840fDm;
            c1143630frl2.LJ = c1295960jpS;
        }
        A1();
    }

    public final void z1(final C1295960jpS c1295960jpS, final String str, final Long l, final C1118840fDm c1118840fDm, final C1143620frk c1143620frk) {
        try {
            C1292030jj7<C1294720jnS> c1292030jj7LJIIJJI = C1294250jmh.LJIIJJI(c1295960jpS.getContext(), str);
            c1292030jj7LJIIJJI.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0fri
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    boolean z;
                    C1294720jnS c1294720jnS = (C1294720jnS) obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("load ");
                    sbLIZ.append(str);
                    sbLIZ.append(" success, result = ");
                    if (c1294720jnS != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    C20441214yg.LJIIIZ("FlyingGiftManager", C2188811AlT.LIZIZ(sbLIZ));
                    if (c1294720jnS != null) {
                        Long l2 = l;
                        if (l2 != null) {
                            this.LLIZ.put(BigFlyingGiftPathWidget.x1(c1143620frk.LIZ.LIZ, l2.longValue()), c1294720jnS);
                        }
                        c1295960jpS.setImageAssetsFolder("images");
                        c1295960jpS.setComposition(c1294720jnS);
                        BigFlyingGiftPathWidget bigFlyingGiftPathWidget = this;
                        C1143620frk c1143620frk2 = c1143620frk;
                        C1118830fDl c1118830fDl = c1143620frk2.LIZ;
                        bigFlyingGiftPathWidget.B1(c1118830fDl.LIZ, c1118830fDl.LJ, c1143620frk2.LIZJ, c1118840fDm, c1295960jpS);
                    }
                }
            });
            c1292030jj7LJIIJJI.LIZ(new InterfaceC1292040jj8() { // from class: X.0frj
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C1118780fDg.LIZIZ(c1118840fDm, 4, 2, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("load ");
                    sbLIZ.append(str);
                    sbLIZ.append(" failed, reason = ");
                    sbLIZ.append(((Throwable) obj).getMessage());
                    C20441214yg.LJ("FlyingGiftManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("catch an exception when load ");
            sbLIZ.append(str);
            sbLIZ.append(", exception = ");
            sbLIZ.append(e);
            C20441214yg.LJ("FlyingGiftManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
