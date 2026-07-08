package com.bytedance.android.live.liveinteract.api;

import X.AbstractC1100450ek7;
import X.AbstractC1549150qPp;
import X.AbstractC19484711Kz;
import X.AbstractC937370aV5;
import X.AbstractC970120bLu;
import X.C006A;
import X.C019N;
import X.C0IF3;
import X.C0ILL;
import X.C0JFT;
import X.C0JG7;
import X.C0UTJ;
import X.C11NJ;
import X.C11RK;
import X.C1793510wlx;
import X.C1799650wvr;
import X.C1799710wvx;
import X.C1819160xRK;
import X.C1819180xRM;
import X.C1819220xRQ;
import X.C1873840yrW;
import X.C19EG;
import X.C1ACZ;
import X.C1EA4;
import X.C1EA5;
import X.C2276691E9j;
import X.C2276771E9r;
import X.C2276781E9s;
import X.C474500IjA;
import X.C914280Ztq;
import X.C914350Ztx;
import X.C915190ZvJ;
import X.C916720Zxm;
import X.C916750Zxp;
import X.C918350a0P;
import X.C923440a8c;
import X.C944320agI;
import X.C950840aqo;
import X.EnumC20429314wl;
import X.EnumC753370Tgt;
import X.EnumC919090a1b;
import X.EnumC937290aUx;
import X.EnumC952890au7;
import X.InterfaceC1273910jFt;
import X.InterfaceC2175461ACa;
import X.InterfaceC2175511ACf;
import X.InterfaceC2183451Acp;
import X.InterfaceC2855018r;
import X.InterfaceC463170IEh;
import X.InterfaceC463440IFi;
import X.InterfaceC464090IHv;
import X.InterfaceC500690JkJ;
import X.InterfaceC758000ToM;
import X.InterfaceC758670TpR;
import X.InterfaceC769410UGd;
import X.InterfaceC771550UOj;
import X.InterfaceC914420Zu4;
import X.InterfaceC914670ZuT;
import X.InterfaceC914680ZuU;
import X.InterfaceC914930Zut;
import X.InterfaceC915240ZvO;
import X.InterfaceC917550Zz7;
import X.InterfaceC923350a8T;
import X.InterfaceC937960aW2;
import X.InterfaceC939660aYm;
import X.InterfaceC948540an6;
import X.InterfaceC952240at4;
import Y.ARunnableS117S0100000_17;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.interact.MultiGuestLiveEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.PreviewPageActivePlaybook;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.uikit.base.AbsFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS591S0100000_12;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public interface IInteractService extends C006A, InterfaceC2183451Acp {
    int A32(String str);

    boolean AE2();

    boolean AR0();

    Map<String, String> Am0();

    long B62();

    void BB0(int i, List list, C1799710wvx c1799710wvx);

    boolean BE1();

    void BT1(EnumC937290aUx enumC937290aUx, boolean z, EnumC919090a1b enumC919090a1b, boolean z2);

    void Bg0(Context context, DataChannel dataChannel, EnumC952890au7 enumC952890au7, C916750Zxp c916750Zxp, boolean z, boolean z2, WeakReference<InterfaceC917550Zz7> weakReference, String str, Long l, String str2);

    boolean Bl1();

    void Bw2(long j, long j2, String str, AwS585S0100000_6 awS585S0100000_6, AwS591S0100000_12 awS591S0100000_12, boolean z);

    boolean C10(DataChannel dataChannel);

    boolean Cl0(String str, boolean z);

    void Cz2(C950840aqo c950840aqo);

    C916720Zxm DK1(long j);

    void DM(DataChannel dataChannel);

    boolean DQ1();

    long DV0();

    List<C916720Zxm> Do2();

    void EH1(C944320agI c944320agI);

    void EM(InterfaceC915240ZvO interfaceC915240ZvO);

    void EQ0(DataChannel dataChannel);

    void Ei1(long j, DataChannel dataChannel);

    long FJ0();

    boolean FL1();

    void Fb(LifecycleOwner lifecycleOwner);

    String Fc2();

    boolean Ff2(DataChannel dataChannel, int i);

    void Fu1(long j, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12);

    boolean G71();

    void GR(C0JFT c0jft);

    InterfaceC771550UOj Ga1();

    int HA(User user);

    boolean He2(String str);

    InterfaceC2175461ACa Hj();

    boolean Hr0();

    boolean Hu0();

    C0UTJ IB(DataChannel dataChannel, Fragment fragment, LifecycleOwner lifecycleOwner, boolean z);

    boolean IX0(DataChannel dataChannel);

    C019N Ia1(Context context, DataChannel dataChannel);

    void Id0(InterfaceC915240ZvO interfaceC915240ZvO);

    boolean Ii2();

    String Ij1(String str);

    boolean Io0(Room room);

    boolean J12();

    boolean J8();

    boolean JF0();

    SurfaceView JM();

    InterfaceC2855018r JO2(Context context, DataChannel dataChannel);

    int Je();

    boolean Jf();

    void Jf2();

    AbstractC19484711Kz<String> Jg0(C916750Zxp c916750Zxp);

    void K00(InterfaceC914670ZuT interfaceC914670ZuT);

    int KS0();

    String Kh();

    boolean Kn2();

    void Ky1();

    boolean Kz();

    boolean Kz1(DataChannel dataChannel);

    boolean L20();

    boolean L6();

    InterfaceC2175511ACf LB(C1ACZ c1acz);

    void LB2(Context context, C1793510wlx c1793510wlx);

    void LJIILIIL();

    boolean LL2();

    boolean LT();

    Map<String, String> LT0(DataChannel dataChannel, String str);

    Map<String, Map<String, String>> Lo1(List<String> list, Map<String, String> map, Map<Long, ? extends RivalExtraInfo> map2);

    void Lv0(InterfaceC923350a8T interfaceC923350a8T);

    List<User> M30();

    InterfaceC769410UGd M70();

    LiveWidget MK1(RecyclableWidgetManager recyclableWidgetManager);

    C1EA4 MU();

    void MV1(JSONObject jSONObject);

    void Mf2(DataChannel dataChannel);

    boolean N22();

    boolean N70();

    C0JG7 ND(User user);

    boolean Nf2();

    boolean Nk0(DataChannel dataChannel);

    void Nm0(C914350Ztx c914350Ztx, C2276781E9s c2276781E9s);

    String No2();

    boolean Nt();

    InterfaceC500690JkJ Nw1(View view);

    void OT1(Room room, Function0<Boolean> function0);

    int Oh1();

    void Oo2(int i, DataChannel dataChannel, String str, String str2);

    boolean PU();

    String Pi2();

    C0UTJ Pl1(DataChannel dataChannel);

    void Pq2(long j, boolean z);

    User Pt1(Long l);

    void Q12(Room room);

    String Q92();

    boolean QL2();

    boolean QV1(boolean z);

    void QX0(C918350a0P c918350a0P, AwS394S0200000_28 awS394S0200000_28);

    int QZ();

    void Qu2(C914280Ztq c914280Ztq, InterfaceC914930Zut<C2276691E9j> interfaceC914930Zut);

    void RA0(Map<String, String> map);

    boolean RE0(Long l);

    void Ry1(EnumC753370Tgt enumC753370Tgt);

    void S0(String str);

    String SH2();

    Class<? extends LiveRecyclableWidget> SK();

    boolean SN();

    void Sq0(DataChannel dataChannel);

    void T31();

    String T6();

    boolean T9();

    String TT1();

    String Ti2();

    Boolean Tn(long j);

    String Tr1(String str);

    boolean UN0();

    void UP1(C915190ZvJ c915190ZvJ, EnumC20429314wl enumC20429314wl);

    boolean Ub1(DataChannel dataChannel);

    int Uh();

    String Uq0(long j);

    boolean VD();

    boolean VF2(Long l);

    void VU1();

    void Vd0(View view, AbsFragment absFragment, boolean z);

    void Vl0(boolean z, String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z2);

    boolean Vs(String str);

    AbstractC1100450ek7 W92(Context context, int i, LifecycleOwner lifecycleOwner, DataChannel dataChannel, User user);

    AbstractC937370aV5 WX1(boolean z, Context context, int i, C11RK c11rk, C11RK c11rk2, C11RK c11rk3, C11RK c11rk4, String str, boolean z2, DataChannel dataChannel, ARunnableS117S0100000_17 aRunnableS117S0100000_17);

    void Wd1(long j, Function2<? super Integer, ? super String, Unit> function2, Function0<Unit> function0);

    void We1(String str, Map<String, String> map);

    void Wr2();

    int XA2();

    boolean XP2();

    C0IF3 XY0(long j, C19EG c19eg);

    FrameLayout Xf1(long j);

    void Xi2(long j, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12);

    void Xx2(DataChannel dataChannel);

    void Y42();

    void Y51(C2276781E9s c2276781E9s);

    long YR0(boolean z);

    Set<Long> YZ1();

    boolean Ya1();

    AbstractC970120bLu Yf1(Context context, DataChannel dataChannel, EnumC952890au7 enumC952890au7, C1819180xRM c1819180xRM, C1819160xRK c1819160xRK, C1819220xRQ c1819220xRQ);

    Rect Yx0();

    void Yz(String str, Map map);

    boolean Z4();

    void Z42(InterfaceC914680ZuU interfaceC914680ZuU);

    C0ILL ZM(C19EG c19eg, DataChannel dataChannel);

    List<String> ZP2();

    void ZQ(DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15);

    boolean Zf();

    C1EA5 Zr2();

    boolean a0();

    void a00();

    void aE(C914350Ztx c914350Ztx, C2276771E9r c2276771E9r);

    InterfaceC464090IHv aF0(LiveMode liveMode);

    int aU0();

    void ad1(Context context);

    boolean ae();

    void au1(int i, int i2, int i3, C1873840yrW c1873840yrW);

    List<Long> b70();

    boolean bH2(DataChannel dataChannel);

    boolean bX0(DataChannel dataChannel);

    C0JG7 c10(long j);

    void c42();

    InterfaceC758000ToM cI2();

    int cw1();

    void d70(RecyclableWidgetManager recyclableWidgetManager);

    boolean dD(DataChannel dataChannel, boolean z);

    void dE2(long j, String str);

    TeamUsersInfo dY0(long j);

    void dZ(DataChannel dataChannel);

    InterfaceC463440IFi dc2();

    void du0(String str);

    boolean dw1();

    InterfaceC948540an6 e32();

    Object ec0();

    void ej2();

    void el0(String str);

    long er();

    void et0(Room room);

    void fI0(int i, String str);

    Set<Long> fP2();

    long ff();

    void fu2(DataChannel dataChannel);

    void g1(List list);

    String g90(boolean z, Room room);

    boolean g92();

    InterfaceC937960aW2 gd0(ViewGroup viewGroup);

    long getBattleId();

    long getChannelId();

    String getConnectionType();

    int getGuestCount();

    Map<String, String> getMatchLogParams();

    List<TeamUsersInfo> gg();

    InterfaceC952240at4 hI2();

    void hN(DataChannel dataChannel, String str);

    void hO0(DataChannel dataChannel);

    Map<String, String> ho0();

    User hz1();

    void i3(long j, Function0 function0, Function1 function1);

    void iQ0(DataChannel dataChannel);

    boolean ib2();

    boolean ig2();

    void initPublicScreenConfiguration();

    void it1();

    void ji1(long j);

    boolean jq1();

    long js();

    void k30(Map<String, String> map);

    boolean k61(DataChannel dataChannel);

    boolean k81();

    LiveWidget k90();

    boolean kB();

    boolean kD1();

    boolean kZ();

    void kn(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void kn1();

    boolean l62();

    void l70(C944320agI c944320agI);

    boolean lL(C916750Zxp c916750Zxp);

    void lO();

    void lR0(String str, boolean z);

    void lX1(long j, DataChannel dataChannel, List list);

    void ls0(DataChannel dataChannel);

    boolean ls1();

    void m00(String str, WeakReference<InterfaceC914420Zu4> weakReference);

    C0UTJ mG2();

    Rect mI2(long j);

    boolean mJ();

    void mN0(int i, DataChannel dataChannel, String str, String str2);

    String mO1();

    void mj(int i, String str, String str2, String str3, String str4, String str5, String str6);

    boolean mo2();

    boolean mx1();

    boolean n12();

    boolean n30();

    List<C923440a8c> nr2();

    boolean ny1(String str);

    boolean o1();

    void o22(String str, Map<String, String> map);

    String oE2();

    void oZ0(List<Long> list, long j, Room room);

    boolean oc();

    boolean oh1();

    void openLiveEventInviteGuestPanel(Activity activity, String str, long j, GetLiveEventUserResponse getLiveEventUserResponse, MultiGuestLiveEvent multiGuestLiveEvent);

    InterfaceC939660aYm oz0();

    boolean p00();

    boolean pD1();

    void pO();

    String pY0(DataChannel dataChannel);

    List<Class<? extends AbstractC1549150qPp<?, ?>>> provideJsbForHost();

    long q9();

    void qR(DataChannel dataChannel, C11NJ c11nj, String str);

    boolean qW(User user);

    void qm2(DataChannel dataChannel);

    boolean qp0();

    boolean qx0(User user);

    void rL();

    void rh(int i, String str, String str2, String str3);

    boolean rl2(String str);

    int rm0(long j);

    String ry();

    void sD(DataChannel dataChannel);

    String sE(long j);

    void sO0();

    Map<String, String> sR(Long l, boolean z);

    void sX1(InterfaceC923350a8T interfaceC923350a8T);

    boolean si1();

    void ss2(InterfaceC914680ZuU interfaceC914680ZuU);

    List<C923440a8c> tH2();

    boolean tL();

    boolean tk1(boolean z);

    int tn0();

    InterfaceC758670TpR u7();

    boolean uI2(DataChannel dataChannel);

    void uL0(DataChannel dataChannel);

    boolean ui2();

    InterfaceC1273910jFt us2();

    Set<Long> uz0();

    long v81();

    boolean vH0();

    Set<Long> vL1();

    Bitmap vl0(String str);

    boolean vp0();

    void vq1(String str, Map<String, ? extends Object> map);

    String vt1();

    Map<String, String> w00(Map<String, String> map);

    String w30();

    Pair<String, String> w72();

    boolean w9();

    boolean wc0();

    boolean we0();

    InterfaceC463170IEh wl1(ViewGroup viewGroup, DataChannel dataChannel, Fragment fragment);

    void x30(String str);

    void xh2(InterfaceC914670ZuT interfaceC914670ZuT);

    void xt1(C474500IjA c474500IjA);

    String xw0();

    boolean xz0();

    int y91();

    PreviewPageActivePlaybook yK2(DataChannel dataChannel);

    Map<String, Map<String, String>> yh0(List<String> list);

    boolean yk1();

    C0JG7 yq(User user);

    boolean z00(C916750Zxp c916750Zxp);

    void zA(Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12);

    void zV(long j, C1799650wvr c1799650wvr);

    List<Long> zr2();

    int zt();

    void zx0(JSONObject jSONObject);
}
