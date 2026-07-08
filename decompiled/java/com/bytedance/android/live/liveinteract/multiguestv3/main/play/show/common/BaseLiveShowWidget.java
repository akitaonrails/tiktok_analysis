package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common;

import X.AbstractC19994813Le;
import X.AbstractC919790a2j;
import X.C01FQ;
import X.C01GW;
import X.C01H3;
import X.C01H9;
import X.C01HA;
import X.C01HE;
import X.C01HT;
import X.C1161920gLG;
import X.C13LE;
import X.C13LZ;
import X.C1548820qPI;
import X.C19487111Lx;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C303501Fp;
import X.C304201Fw;
import X.C307001Gy;
import X.C389001fE;
import X.C500260Jjc;
import X.C513601zK;
import X.C515301zb;
import X.C5182020e;
import X.C5183020f;
import X.C5185020h;
import X.C917520Zz4;
import X.C924810aAp;
import X.C927600aFK;
import X.C938110aWH;
import X.EnumC918970a1P;
import X.InterfaceC1097170eep;
import X.InterfaceC2217461Bqa;
import X.InterfaceC302601Fg;
import X.InterfaceC927510aFB;
import X.InterfaceC941870acL;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;
import org.json.JSONObject;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseLiveShowWidget<T extends BaseLiveShowViewModel> extends LiveWidget implements InterfaceC941870acL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final Class<T> LL;
    public T LLILLJJLI;
    public C19487111Lx LLILLL;
    public String LLILZ;
    public Integer LLILZIL;
    public ShowListUser LLIZ;
    public int LLIZLLLIL;
    public ShowListUser LLJ;
    public boolean LLJI;
    public C5185020h LLJIJIL;
    public boolean LLJILJIL;
    public LiveDialog LLJILJILJ;
    public String LLILZLL = "user name";
    public final C304201Fw LLJILLL = new C304201Fw("ZOOM_SERVICE");
    public final C515301zb LLJJ = new C515301zb(this, 6);
    public final C513601zK LLJJI = new C513601zK(this, 20);
    public final C5182020e LLJJIII = new C5182020e((BaseLiveShowWidget) this, 56);
    public final C513601zK LLJJIJI = new C513601zK(this, 21);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseLiveShowWidget.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract String A1(ShowListUser showListUser);

    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "live_show";
    }

    public void end() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static void G1() {
        String string;
        Long lLJII;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        JSONObject jSONObject = new JSONObject();
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ == null || (lLJII = interfaceC302601FgLIZ.LJII()) == null || (string = lLJII.toString()) == null) {
            string = "";
        }
        jSONObject.put("multiguest_liveshow_id", string);
        jSONObject.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJII).getSecond());
        jSONObject.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJII).getFirst());
        C389001fE.LIZ("live_show_banner_info", jSONObject, System.currentTimeMillis(), false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendLiveShowInfoEvent, showId: ");
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        sbLIZ.append(interfaceC302601FgLIZ2 != null ? interfaceC302601FgLIZ2.LJII() : null);
        sbLIZ.append(", window: ");
        sbLIZ.append((String) C917520Zz4.LJII(enumC918970a1PLJII).getSecond());
        sbLIZ.append(", layout: ");
        sbLIZ.append((String) C917520Zz4.LJII(enumC918970a1PLJII).getFirst());
        C20441214yg.LIZIZ("BaseLiveShowWidget", C2188811AlT.LIZIZ(sbLIZ));
        C924810aAp c924810aApLJ = C924810aAp.LJ();
        InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
        c924810aApLJ.LJJJIL = interfaceC302601FgLIZ3 != null ? interfaceC302601FgLIZ3.LJII() : null;
    }

    public final void D1() {
        String str = this.LLILZ;
        if (str != null) {
            C1(str);
            this.LLILZ = null;
        }
        C19487111Lx c19487111Lx = this.LLILLL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLILLL = null;
        C01HA.LIZIZ(null);
    }

    public final void H1() {
        Object next;
        MutableLiveData<C01H9> mutableLiveData;
        C01H9 value;
        ShowListUser showListUser;
        MutableLiveData<C01H9> mutableLiveData2;
        C01H9 value2;
        List<ShowListUser> list;
        ArrayList arrayList = new ArrayList();
        T t = this.LLILLJJLI;
        if (t != null && (mutableLiveData2 = t.LLILLJJLI) != null && (value2 = mutableLiveData2.getValue()) != null && (list = value2.LIZIZ) != null) {
            arrayList.addAll(list);
        }
        T t2 = this.LLILLJJLI;
        if (t2 != null && (mutableLiveData = t2.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (showListUser = value.LIZ) != null) {
            arrayList.add(showListUser);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            ShowListUser showListUser2 = (ShowListUser) next;
            if (showListUser2 != null && showListUser2.order == 1) {
                break;
            }
        }
        ShowListUser showListUser3 = (ShowListUser) next;
        E1(2, 1, showListUser3 != null ? showListUser3.nickname : null, showListUser3, false);
        this.LLJ = showListUser3;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        C20441214yg.LIZIZ("BaseLiveShowWidget", "onDestroy");
        C1(this.LLILZ);
        this.dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(false, null));
        C01HA.LIZIZ(null);
        C19487111Lx c19487111Lx = this.LLILLL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLILLL = null;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (C500260Jjc.LJJJI(interfaceC302601FgLIZ != null ? Boolean.valueOf(interfaceC302601FgLIZ.LJIJI()) : null)) {
            E1(5, null, null, null, false);
        }
        C1548820qPI.LJIIIIZZ("multi_guest_banner_ready", this.LLJJ);
        super.onDestroy();
    }

    public void x1() {
        C1(this.LLILZ);
        C19487111Lx c19487111Lx = this.LLILLL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLILLL = null;
        this.LLILZ = null;
        T t = this.LLILLJJLI;
        if (t != null) {
            t.zQ2("live-end-success");
        }
    }

    public final String y1() {
        MutableLiveData<C303501Fp> mutableLiveData;
        C303501Fp value;
        ShowListUser showListUser;
        String strLJIILIIL;
        C304201Fw c304201Fw = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c304201Fw.LIZ();
        if (interfaceC927510aFB != null && (strLJIILIIL = interfaceC927510aFB.LJIILIIL()) != null && strLJIILIIL.length() > 0) {
            long jLJI = C01HE.LJI(strLJIILIIL);
            AbstractC919790a2j.LJIIJJI.getClass();
            if (jLJI != AbstractC919790a2j.LJIILJJIL) {
                return String.valueOf(jLJI);
            }
        }
        if (C01HT.LIZJ()) {
            return String.valueOf(UserService.getInstance().user().getCurrentUserId());
        }
        T t = this.LLILLJJLI;
        if (t == null || (mutableLiveData = t.LLILLL) == null || (value = mutableLiveData.getValue()) == null || (showListUser = value.LIZIZ) == null) {
            return null;
        }
        return Long.valueOf(showListUser.userId).toString();
    }

    public final void B1() {
        if (C924810aAp.LJ().LJJJ) {
            return;
        }
        C20441214yg.LIZIZ("BaseLiveShowWidget", "refresh banner");
        if (MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().bannerRefreshShuffleTime < 0) {
            return;
        }
        ((IBannerService) C1161920gLG.LIZJ(IBannerService.class)).mE0(C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(0, r2)));
        C924810aAp.LJ().LJJJ = true;
    }

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        return C500260Jjc.LJJJI(interfaceC302601FgLIZ != null ? Boolean.valueOf(interfaceC302601FgLIZ.LJIJI()) : null);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        Fragment fragment;
        super.onCreate();
        C20441214yg.LIZIZ("BaseLiveShowWidget", "onCreate");
        C20441214yg.LIZIZ("BaseLiveShowWidget", "initViewModel");
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null && fragment.isAdded() && !fragment.isRemoving() && !fragment.isDetached() && fragment.getView() != null) {
            this.LLILLJJLI = (T) ViewModelProviders.of(fragment).get(this.LL);
        }
        T t = this.LLILLJJLI;
        if (t != null) {
            t.LLJI = this.dataChannel;
            t.LLJIJIL = this;
            t.onInit();
            t.LLILLL.observe(this, this.LLJJI);
            t.LLILZIL.observe(this, this.LLJJIJI);
        }
        C1548820qPI.LIZLLL("multi_guest_banner_ready", this.LLJJ);
        this.LLJIJIL = new C5185020h(this, 5);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, LiveShowOpenMicDialogDismissEvent.class, new C5183020f(this, 60));
        dataChannel.BQ2(this, LiveShowSendJsEventForRefreshBannerData.class, new C5183020f(this, 61));
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        super.onResume();
        if (this.LLJI) {
            T t = this.LLILLJJLI;
            if (t != null && (mutableLiveData = t.LL) != null && (value = mutableLiveData.getValue()) != null && value.intValue() == 2) {
                B1();
            }
            this.LLJI = false;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onStop() {
        super.onStop();
        this.LLJI = true;
    }

    public BaseLiveShowWidget(Class<T> cls) {
        this.LL = cls;
    }

    public final void C1(String str) {
        if (str == null) {
            return;
        }
        this.dataChannel.LC0(LiveShowCountDownEvent.class, new C938110aWH(0, 0L, 0L, str));
        C19487111Lx c19487111Lx = this.LLILLL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLILLL = null;
    }

    public final ShowListUser z1(int i) {
        MutableLiveData<C01H9> mutableLiveData;
        C01H9 value;
        List<ShowListUser> list;
        T t = this.LLILLJJLI;
        ShowListUser showListUser = null;
        if (t == null || (mutableLiveData = t.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null || (list = value.LIZIZ) == null) {
            return null;
        }
        Iterator<ShowListUser> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ShowListUser next = it2.next();
            if (next.order == i + 1) {
                showListUser = next;
                break;
            }
        }
        return showListUser;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9 A[PHI: r5
      0x00f9: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:24:0x0044, B:22:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1(int r8, java.lang.Integer r9, java.lang.String r10, webcast.data.multi_guest_play.ShowListUser r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget.E1(int, java.lang.Integer, java.lang.String, webcast.data.multi_guest_play.ShowListUser, boolean):void");
    }
}
