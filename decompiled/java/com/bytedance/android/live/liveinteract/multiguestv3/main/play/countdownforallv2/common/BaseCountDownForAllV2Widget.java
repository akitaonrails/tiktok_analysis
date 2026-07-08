package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common;

import X.C01HE;
import X.C01IS;
import X.C01IZ;
import X.C01J3;
import X.C01K8;
import X.C020W;
import X.C0PEM;
import X.C1143680frq;
import X.C11JF;
import X.C11NZ;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C19487111Lx;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C310901Il;
import X.C311001Im;
import X.C311201Io;
import X.C500260Jjc;
import X.C516201zk;
import X.C5183020f;
import X.C924240a9u;
import X.C930540aK4;
import X.C938160aWM;
import X.C948450amx;
import X.C949860apE;
import X.InterfaceC1097170eep;
import X.InterfaceC941870acL;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestOpenCountDownForAllScoreDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayMaskEffectUpdateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayStatusChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforall.AbstractCountDownForAllWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.CountDownForAllV2Service;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllV2ContentChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllV2PlayBannerChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllV2StatusChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.score.CountDownForAllV2ScoreDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicCountDownForAllBackupRefreshBannerIntervalSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCountDownForAllV2Widget<VM extends BaseCountDownForAllV2ViewModel> extends AbstractCountDownForAllWidget implements InterfaceC941870acL {
    public VM LL;
    public CountDownForAllV2ScoreDialog LLILLJJLI;
    public C11JF LLILLL;
    public C19487111Lx LLILZ;
    public final C311201Io LLILZIL;
    public final C949860apE LLILZLL;

    public abstract String A1();

    public abstract void B1();

    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "count_down_for_all";
    }

    public void end() {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforall.AbstractCountDownForAllWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public C01K8 y1() {
        return null;
    }

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        VM vm;
        VM vm2 = this.LL;
        if (vm2 != null && vm2.yQ2() == 0) {
            return false;
        }
        VM vm3 = this.LL;
        return ((vm3 != null && vm3.yQ2() == 3) || (vm = this.LL) == null || Integer.valueOf(vm.yQ2()) == null) ? false : true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        B1();
        VM vm = this.LL;
        if (vm != null) {
            C20441214yg.LIZIZ("CountDownForAllV2Service", "CountDownForAllService create");
            C948450amx.LIZIZ.LJFF(new CountDownForAllV2Service(vm), null);
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, CountDownForAllV2ContentChangeEvent.class, new C5183020f(this, 33));
        dataChannel.BQ2(this, CountDownForAllV2PlayBannerChangeEvent.class, new C5183020f(this, 34));
        dataChannel.BQ2(this, CountDownForAllV2StatusChangeEvent.class, new C5183020f(this, 35));
        DataChannelGlobal.LLILZ.CQ2(MultiGuestOpenCountDownForAllScoreDialogEvent.class, this, new C5183020f(this, 36));
        C311201Io c311201Io = this.LLILZIL;
        c311201Io.getClass();
        C20441214yg.LIZIZ("PlayBannerHelper", "registerBanner");
        C1548820qPI.LIZLLL("multi_guest_banner_ready", c311201Io.LJ);
        C949860apE c949860apE = this.LLILZLL;
        List listLJIIJJI = C1697810uHb.LJIIJJI(C924240a9u.LIZ().startAnimation, C924240a9u.LIZ().endAnimation);
        c949860apE.getClass();
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            C1143680frq.LJJIIJ(c949860apE.LIZ, (String) it2.next());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        C20441214yg.LJIIIZ(A1(), "onDestroy");
        x1();
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C19487111Lx c19487111Lx = this.LLILZ;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        C311201Io c311201Io = this.LLILZIL;
        c311201Io.getClass();
        C20441214yg.LIZIZ("PlayBannerHelper", "unregisterBanner");
        C1548820qPI.LJIIIIZZ("multi_guest_banner_ready", c311201Io.LJ);
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog = this.LLILLJJLI;
        if (countDownForAllV2ScoreDialog != null) {
            countDownForAllV2ScoreDialog.close(1);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C20441214yg.LIZIZ(A1(), "onPause");
        C311201Io c311201Io = this.LLILZIL;
        c311201Io.getClass();
        C20441214yg.LIZIZ("PlayBannerHelper", "onBackground");
        c311201Io.LIZLLL = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C20441214yg.LIZIZ(A1(), "onResume");
        C311201Io c311201Io = this.LLILZIL;
        c311201Io.getClass();
        C20441214yg.LIZIZ("PlayBannerHelper", "onForeground");
        if (c311201Io.LIZLLL) {
            C311001Im c311001Im = c311201Io.LIZ;
            if (C500260Jjc.LJJJI(c311001Im != null ? Boolean.valueOf(c311001Im.LIZJ()) : null)) {
                c311201Io.LIZ("onForeground");
                C311001Im c311001Im2 = c311201Io.LIZ;
                if (c311001Im2 != null) {
                    c311001Im2.LIZIZ(new C5183020f(c311201Io, 340));
                }
            }
        }
        c311201Io.LIZLLL = false;
    }

    public final void x1() {
        C20441214yg.LIZIZ(A1(), "clearCache");
        VM vm = this.LL;
        if (vm != null) {
            C01IS c01isVQ2 = vm.vQ2();
            c01isVQ2.LJIIIZ.clear();
            c01isVQ2.LJIIJ.clear();
            c01isVQ2.LJII = 0;
            c01isVQ2.LJIIJJI = C924240a9u.LIZ().startIMLostProtectRetryCount;
            c01isVQ2.LJFF = null;
            c01isVQ2.LJI = "";
            c01isVQ2.LJ = 0L;
            C19487111Lx c19487111Lx = c01isVQ2.LJIIL;
            if (c19487111Lx != null) {
                c19487111Lx.dispose();
            }
            c01isVQ2.LJIIL = null;
            C19487111Lx c19487111Lx2 = c01isVQ2.LJIILIIL;
            if (c19487111Lx2 != null) {
                c19487111Lx2.dispose();
            }
            c01isVQ2.LJIILIIL = null;
            c01isVQ2.LJIILJJIL = false;
            c01isVQ2.LJIILIIL(null, "clearCache");
        }
        C949860apE c949860apE = this.LLILZLL;
        Iterator it2 = ((LinkedHashMap) c949860apE.LIZJ).entrySet().iterator();
        while (it2.hasNext()) {
            View view = (View) ((Map.Entry) it2.next()).getValue();
            view.clearAnimation();
            C930540aK4.LJJIJL(view);
        }
        ((LinkedHashMap) c949860apE.LIZJ).clear();
    }

    public BaseCountDownForAllV2Widget(ViewGroup viewGroup) {
        C311201Io c311201Io = new C311201Io();
        c311201Io.LIZ = new C311001Im(this);
        this.LLILZIL = c311201Io;
        this.LLILZLL = new C949860apE(C924240a9u.LIZ().geckoChannel, viewGroup);
    }

    public final void z1(C310901Il c310901Il) {
        CountdownForAllContent countdownForAllContentWQ2;
        int iYQ2;
        VM vm = this.LL;
        if (vm != null) {
            vm.EQ2("getScoreAndShowDialog");
        }
        VM vm2 = this.LL;
        if (vm2 != null) {
            countdownForAllContentWQ2 = vm2.wQ2();
        } else {
            countdownForAllContentWQ2 = null;
        }
        VM vm3 = this.LL;
        if (vm3 != null) {
            iYQ2 = vm3.yQ2();
        } else {
            iYQ2 = 0;
        }
        D1(1, countdownForAllContentWQ2, iYQ2, c310901Il);
    }

    public void C1(int i, int i2) {
        CountdownForAllContent countdownForAllContentWQ2;
        User userCQ2;
        String strDQ2;
        CountdownForAllContent countdownForAllContentWQ22;
        Boolean boolValueOf;
        String strA1 = A1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status: ");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ(strA1, C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.dataChannel;
        boolean z = true;
        if (dataChannel != null) {
            dataChannel.LC0(PlayStatusChangeEvent.class, new C938160aWM(1, i2));
        }
        VM vm = this.LL;
        if (vm != null) {
            countdownForAllContentWQ2 = vm.wQ2();
        } else {
            countdownForAllContentWQ2 = null;
        }
        VM vm2 = this.LL;
        if (vm2 != null) {
            userCQ2 = vm2.CQ2();
        } else {
            userCQ2 = null;
        }
        VM vm3 = this.LL;
        if (vm3 != null) {
            strDQ2 = vm3.DQ2();
        } else {
            strDQ2 = null;
        }
        if (countdownForAllContentWQ2 != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C01J3(strDQ2, this, countdownForAllContentWQ2, userCQ2, null), 2);
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C11JF c11jf = this.LLILLL;
                        if (c11jf != null) {
                            c11jf.dispose();
                        }
                        if (!C01HE.LIZJ()) {
                            DataChannel dataChannel2 = this.dataChannel;
                            if (dataChannel2 != null) {
                                boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel2));
                            } else {
                                boolValueOf = null;
                            }
                            if (!C500260Jjc.LJJJI(boolValueOf)) {
                                z = false;
                            }
                        }
                        VM vm4 = this.LL;
                        if (vm4 != null && vm4.wQ2() != null && z) {
                            VM vm5 = this.LL;
                            if (vm5 != null) {
                                countdownForAllContentWQ22 = vm5.wQ2();
                            } else {
                                countdownForAllContentWQ22 = null;
                            }
                            D1(2, countdownForAllContentWQ22, 3, null);
                        }
                        x1();
                        return;
                    }
                    return;
                }
                C11JF c11jf2 = this.LLILLL;
                if (c11jf2 == null) {
                    return;
                }
                c11jf2.dispose();
                return;
            }
            this.LLILZIL.LIZ("statusObserver");
            C11JF c11jf3 = this.LLILLL;
            if (c11jf3 != null) {
                c11jf3.dispose();
            }
            this.LLILLL = (C11JF) C11NZ.LJJJJJL(0L, LinkmicCountDownForAllBackupRefreshBannerIntervalSetting.INSTANCE.getValue(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C516201zk(this, 35));
            VM vm6 = this.LL;
            if (vm6 != null && vm6.vQ2().LJII() > 3000) {
                return;
            }
            this.LLILZLL.LIZ(C924240a9u.LIZ().startAnimation);
            return;
        }
        C11JF c11jf4 = this.LLILLL;
        if (c11jf4 != null) {
            c11jf4.dispose();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.zW(PlayMaskEffectUpdateChannel.class, new C01IZ(0));
    }

    public final void D1(int i, CountdownForAllContent countdownForAllContent, int i2, C310901Il c310901Il) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog;
        CountdownForAllContent countdownForAllContent2;
        CountdownForAllContent countdownForAllContent3;
        String strA1 = A1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showCountDownForAllScoreDialog, scoreDialogScene=");
        sbLIZ.append(i);
        sbLIZ.append(", countdownForAllContent=");
        sbLIZ.append(countdownForAllContent);
        sbLIZ.append(", countDownForAllStatus=");
        sbLIZ.append(i2);
        sbLIZ.append(", countDownForAllScoreDialog=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", CDDPlayId=");
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog2 = this.LLILLJJLI;
        Fragment fragment = null;
        if (countDownForAllV2ScoreDialog2 != null && (countdownForAllContent3 = countDownForAllV2ScoreDialog2.LLLFF) != null) {
            lValueOf = Long.valueOf(countdownForAllContent3.playId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", configChangeListener=");
        sbLIZ.append(c310901Il);
        sbLIZ.append(", CDCPlayId=");
        if (countdownForAllContent != null) {
            lValueOf2 = Long.valueOf(countdownForAllContent.playId);
        } else {
            lValueOf2 = null;
        }
        sbLIZ.append(lValueOf2);
        C20441214yg.LIZIZ(strA1, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLJJLI != null) {
            if (countdownForAllContent != null) {
                lValueOf3 = Long.valueOf(countdownForAllContent.playId);
            } else {
                lValueOf3 = null;
            }
            CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog3 = this.LLILLJJLI;
            if (countDownForAllV2ScoreDialog3 != null && (countdownForAllContent2 = countDownForAllV2ScoreDialog3.LLLFF) != null) {
                lValueOf4 = Long.valueOf(countdownForAllContent2.playId);
            } else {
                lValueOf4 = null;
            }
            if (!Intrinsics.LJFF(lValueOf3, lValueOf4) || (countDownForAllV2ScoreDialog = this.LLILLJJLI) == null || i != countDownForAllV2ScoreDialog.LLLF) {
                C20441214yg.LIZIZ(A1(), "safeDismissCountDownForAllScoreDialog");
                CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog4 = this.LLILLJJLI;
                if (countDownForAllV2ScoreDialog4 != null) {
                    countDownForAllV2ScoreDialog4.close(1);
                }
                this.LLILLJJLI = null;
            }
        }
        if (this.LLILLJJLI == null) {
            C20441214yg.LIZIZ(A1(), "newCountDownForAllScoreDialog");
            CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog5 = new CountDownForAllV2ScoreDialog(this.dataChannel, y1(), i, countdownForAllContent, i2);
            countDownForAllV2ScoreDialog5.LLJZIJLIL = new C020W(c310901Il, this, 1);
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep != null) {
                fragment = interfaceC1097170eep.getFragment();
            }
            if (countDownForAllV2ScoreDialog5.wS(fragment, null, "CountDownForAllV2ScoreDialog") && c310901Il != null) {
                c310901Il.LIZIZ();
            }
            this.LLILLJJLI = countDownForAllV2ScoreDialog5;
            return;
        }
        C20441214yg.LIZIZ(A1(), "updateDialogData");
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog6 = this.LLILLJJLI;
        if (countDownForAllV2ScoreDialog6 == null) {
            return;
        }
        countDownForAllV2ScoreDialog6.LLLFF = countdownForAllContent;
        countDownForAllV2ScoreDialog6.LLLFFI = i2;
        countDownForAllV2ScoreDialog6.zS();
    }
}
