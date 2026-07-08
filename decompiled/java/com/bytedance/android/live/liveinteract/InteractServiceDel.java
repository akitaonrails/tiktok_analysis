package com.bytedance.android.live.liveinteract;

import X.AbstractC1100450ek7;
import X.AbstractC1549150qPp;
import X.AbstractC19484711Kz;
import X.AbstractC937370aV5;
import X.AbstractC970120bLu;
import X.C019N;
import X.C0IF3;
import X.C0ILL;
import X.C0JFT;
import X.C0JG7;
import X.C0UTJ;
import X.C1161920gLG;
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
import X.C5183020f;
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
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.model.PreviewPageActivePlaybook;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
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
public final class InteractServiceDel implements IInteractService {
    public static final InteractServiceDel LLILLJJLI = new InteractServiceDel();
    public final /* synthetic */ IInteractService LL = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int A32(String str) {
        return this.LL.A32(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean AE2() {
        return this.LL.AE2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean AR0() {
        return this.LL.AR0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Map<String, String> Am0() {
        return this.LL.Am0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long B62() {
        return this.LL.B62();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void BB0(int i, List list, C1799710wvx c1799710wvx) {
        this.LL.BB0(i, list, c1799710wvx);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean BE1() {
        return this.LL.BE1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void BT1(EnumC937290aUx enumC937290aUx, boolean z, EnumC919090a1b enumC919090a1b, boolean z2) {
        this.LL.BT1(enumC937290aUx, z, enumC919090a1b, z2);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Bg0(Context context, DataChannel dataChannel, EnumC952890au7 enumC952890au7, C916750Zxp c916750Zxp, boolean z, boolean z2, WeakReference<InterfaceC917550Zz7> weakReference, String str, Long l, String str2) {
        this.LL.Bg0(context, dataChannel, enumC952890au7, c916750Zxp, z, z2, weakReference, str, l, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Bl1() {
        return this.LL.Bl1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Bw2(long j, long j2, String str, AwS585S0100000_6 awS585S0100000_6, AwS591S0100000_12 awS591S0100000_12, boolean z) {
        this.LL.Bw2(j, j2, str, awS585S0100000_6, awS591S0100000_12, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean C10(DataChannel dataChannel) {
        return this.LL.C10(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Cl0(String str, boolean z) {
        return this.LL.Cl0(str, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Cz2(C950840aqo c950840aqo) {
        this.LL.Cz2(c950840aqo);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C916720Zxm DK1(long j) {
        return this.LL.DK1(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void DM(DataChannel dataChannel) {
        this.LL.DM(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean DQ1() {
        return this.LL.DQ1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long DV0() {
        return this.LL.DV0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<C916720Zxm> Do2() {
        return this.LL.Do2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void EH1(C944320agI c944320agI) {
        this.LL.EH1(c944320agI);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void EM(InterfaceC915240ZvO interfaceC915240ZvO) {
        this.LL.EM(interfaceC915240ZvO);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void EQ0(DataChannel dataChannel) {
        this.LL.EQ0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Ei1(long j, DataChannel dataChannel) {
        this.LL.Ei1(j, dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long FJ0() {
        return this.LL.FJ0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean FL1() {
        return this.LL.FL1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Fb(LifecycleOwner lifecycleOwner) {
        this.LL.Fb(lifecycleOwner);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String Fc2() {
        return this.LL.Fc2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Ff2(DataChannel dataChannel, int i) {
        return this.LL.Ff2(dataChannel, i);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Fu1(long j, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        this.LL.Fu1(j, function1, function12);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean G71() {
        return this.LL.G71();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void GR(C0JFT c0jft) {
        this.LL.GR(c0jft);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC771550UOj Ga1() {
        return this.LL.Ga1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int HA(User user) {
        return this.LL.HA(user);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean He2(String str) {
        return this.LL.He2(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC2175461ACa Hj() {
        return this.LL.Hj();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Hr0() {
        return this.LL.Hr0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Hu0() {
        return this.LL.Hu0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C0UTJ IB(DataChannel dataChannel, Fragment fragment, LifecycleOwner lifecycleOwner, boolean z) {
        return this.LL.IB(dataChannel, fragment, lifecycleOwner, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean IX0(DataChannel dataChannel) {
        return this.LL.IX0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C019N Ia1(Context context, DataChannel dataChannel) {
        return this.LL.Ia1(context, dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Id0(InterfaceC915240ZvO interfaceC915240ZvO) {
        this.LL.Id0(interfaceC915240ZvO);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Ii2() {
        return this.LL.Ii2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String Ij1(String str) {
        return this.LL.Ij1(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Io0(Room room) {
        return this.LL.Io0(room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean J12() {
        return this.LL.J12();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, X.InterfaceC2183451Acp
    public final boolean J8() {
        return this.LL.J8();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean JF0() {
        return this.LL.JF0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final SurfaceView JM() {
        return this.LL.JM();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC2855018r JO2(Context context, DataChannel dataChannel) {
        return this.LL.JO2(context, dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, X.InterfaceC2183451Acp
    public final int Je() {
        return this.LL.Je();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Jf() {
        return this.LL.Jf();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Jf2() {
        this.LL.Jf2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final AbstractC19484711Kz<String> Jg0(C916750Zxp c916750Zxp) {
        return this.LL.Jg0(c916750Zxp);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void K00(InterfaceC914670ZuT interfaceC914670ZuT) {
        this.LL.K00(interfaceC914670ZuT);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int KS0() {
        return this.LL.KS0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String Kh() {
        return this.LL.Kh();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Kn2() {
        return this.LL.Kn2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Ky1() {
        this.LL.Ky1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Kz() {
        return this.LL.Kz();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Kz1(DataChannel dataChannel) {
        return this.LL.Kz1(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean L20() {
        return this.LL.L20();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean L6() {
        return this.LL.L6();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC2175511ACf LB(C1ACZ c1acz) {
        return this.LL.LB(c1acz);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void LB2(Context context, C1793510wlx c1793510wlx) {
        this.LL.LB2(context, c1793510wlx);
    }

    @Override // X.InterfaceC2183451Acp
    public final Long LIZ() {
        return this.LL.LIZ();
    }

    @Override // X.InterfaceC2183451Acp
    public final long LIZIZ() {
        return this.LL.LIZIZ();
    }

    @Override // X.InterfaceC2183451Acp
    public final int LIZJ() {
        return this.LL.LIZJ();
    }

    @Override // X.InterfaceC2183451Acp
    public final boolean LIZLLL() {
        return this.LL.LIZLLL();
    }

    @Override // X.InterfaceC2183451Acp
    public final boolean LJ() {
        return this.LL.LJ();
    }

    @Override // X.InterfaceC2183451Acp
    public final boolean LJFF() {
        return this.LL.LJFF();
    }

    @Override // X.InterfaceC2183451Acp
    public final int LJII() {
        return this.LL.LJII();
    }

    @Override // X.InterfaceC2183451Acp
    public final void LJIIIIZZ(String str, String str2) {
        this.LL.LJIIIIZZ(str, str2);
    }

    @Override // X.InterfaceC2183451Acp
    public final boolean LJIIIZ() {
        return this.LL.LJIIIZ();
    }

    @Override // X.InterfaceC2183451Acp
    public final long LJIIJ() {
        return this.LL.LJIIJ();
    }

    @Override // X.InterfaceC2183451Acp
    public final long LJIIJJI() {
        return this.LL.LJIIJJI();
    }

    @Override // X.InterfaceC2183451Acp
    public final boolean LJIIL() {
        return this.LL.LJIIL();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void LJIILIIL() {
        this.LL.LJIILIIL();
    }

    @Override // X.InterfaceC2183451Acp
    public final void LJIILJJIL(Context context) {
        this.LL.LJIILJJIL(context);
    }

    @Override // X.InterfaceC2183451Acp
    public final void LJIILL(long j, long j2, Integer num) {
        this.LL.LJIILL(j, j2, num);
    }

    @Override // X.InterfaceC2183451Acp
    public final long LJIILLIIL() {
        return this.LL.LJIILLIIL();
    }

    @Override // X.InterfaceC2183451Acp
    public final SlimRoom.LinkMic LJIIZILJ(String str) {
        return this.LL.LJIIZILJ(str);
    }

    @Override // X.InterfaceC2183451Acp
    public final void LJIJ(Context context, long j, LifecycleOwner lifecycleOwner, C5183020f c5183020f, Function0 function0) {
        this.LL.LJIJ(context, j, lifecycleOwner, c5183020f, function0);
    }

    @Override // X.InterfaceC2183451Acp
    public final long LJIJI(long j) {
        return this.LL.LJIJI(j);
    }

    @Override // X.InterfaceC2183451Acp
    public final boolean LJIJJ() {
        return this.LL.LJIJJ();
    }

    @Override // X.InterfaceC2183451Acp
    public final void LJIJJLI() {
        this.LL.LJIJJLI();
    }

    @Override // X.InterfaceC2183451Acp
    public final boolean LJIL() {
        return this.LL.LJIL();
    }

    @Override // X.InterfaceC2183451Acp
    public final Map<String, String> LJJ(Long l) {
        return this.LL.LJJ(l);
    }

    @Override // X.InterfaceC2183451Acp
    public final boolean LJJI(int i, Long l, Long l2, boolean z) {
        return this.LL.LJJI(i, l, l2, z);
    }

    @Override // X.InterfaceC2183451Acp
    public final void LJJIFFI(String str, boolean z) {
        this.LL.LJJIFFI(str, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean LL2() {
        return this.LL.LL2();
    }

    @Override // X.InterfaceC2183451Acp
    public final List<String> LLZZJLIL() {
        return this.LL.LLZZJLIL();
    }

    @Override // X.InterfaceC2183451Acp
    public final void LLZZLLIL(int i, List<Long> list) {
        this.LL.LLZZLLIL(i, list);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean LT() {
        return this.LL.LT();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Map<String, String> LT0(DataChannel dataChannel, String str) {
        return this.LL.LT0(dataChannel, str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Map<String, Map<String, String>> Lo1(List<String> list, Map<String, String> map, Map<Long, ? extends RivalExtraInfo> map2) {
        return this.LL.Lo1(list, map, map2);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Lv0(InterfaceC923350a8T interfaceC923350a8T) {
        this.LL.Lv0(interfaceC923350a8T);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<User> M30() {
        return this.LL.M30();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC769410UGd M70() {
        return this.LL.M70();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final LiveWidget MK1(RecyclableWidgetManager recyclableWidgetManager) {
        return this.LL.MK1(recyclableWidgetManager);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C1EA4 MU() {
        return this.LL.MU();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void MV1(JSONObject jSONObject) {
        this.LL.MV1(jSONObject);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Mf2(DataChannel dataChannel) {
        this.LL.Mf2(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean N22() {
        return this.LL.N22();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean N70() {
        return this.LL.N70();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C0JG7 ND(User user) {
        return this.LL.ND(user);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Nf2() {
        return this.LL.Nf2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Nk0(DataChannel dataChannel) {
        return this.LL.Nk0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Nm0(C914350Ztx c914350Ztx, C2276781E9s c2276781E9s) {
        this.LL.Nm0(c914350Ztx, c2276781E9s);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String No2() {
        return this.LL.No2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Nt() {
        return this.LL.Nt();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC500690JkJ Nw1(View view) {
        return this.LL.Nw1(view);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void OT1(Room room, Function0<Boolean> function0) {
        this.LL.OT1(room, function0);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Oh1() {
        return this.LL.Oh1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Oo2(int i, DataChannel dataChannel, String str, String str2) {
        this.LL.Oo2(i, dataChannel, str, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean PU() {
        return this.LL.PU();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String Pi2() {
        return this.LL.Pi2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C0UTJ Pl1(DataChannel dataChannel) {
        return this.LL.Pl1(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Pq2(long j, boolean z) {
        this.LL.Pq2(j, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final User Pt1(Long l) {
        return this.LL.Pt1(l);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Q12(Room room) {
        this.LL.Q12(room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String Q92() {
        return this.LL.Q92();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean QL2() {
        return this.LL.QL2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean QV1(boolean z) {
        return this.LL.QV1(z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void QX0(C918350a0P c918350a0P, AwS394S0200000_28 awS394S0200000_28) {
        this.LL.QX0(c918350a0P, awS394S0200000_28);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int QZ() {
        return this.LL.QZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Qu2(C914280Ztq c914280Ztq, InterfaceC914930Zut<C2276691E9j> interfaceC914930Zut) {
        this.LL.Qu2(c914280Ztq, interfaceC914930Zut);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void RA0(Map<String, String> map) {
        this.LL.RA0(map);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean RE0(Long l) {
        return this.LL.RE0(l);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Ry1(EnumC753370Tgt enumC753370Tgt) {
        this.LL.Ry1(enumC753370Tgt);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void S0(String str) {
        this.LL.S0(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String SH2() {
        return this.LL.SH2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Class<? extends LiveRecyclableWidget> SK() {
        return this.LL.SK();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean SN() {
        return this.LL.SN();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Sq0(DataChannel dataChannel) {
        this.LL.Sq0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void T31() {
        this.LL.T31();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String T6() {
        return this.LL.T6();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean T9() {
        return this.LL.T9();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String TT1() {
        return this.LL.TT1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String Ti2() {
        return this.LL.Ti2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Boolean Tn(long j) {
        return this.LL.Tn(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String Tr1(String str) {
        return this.LL.Tr1(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean UN0() {
        return this.LL.UN0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void UP1(C915190ZvJ c915190ZvJ, EnumC20429314wl enumC20429314wl) {
        this.LL.UP1(c915190ZvJ, enumC20429314wl);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Ub1(DataChannel dataChannel) {
        return this.LL.Ub1(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Uh() {
        return this.LL.Uh();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String Uq0(long j) {
        return this.LL.Uq0(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean VD() {
        return this.LL.VD();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean VF2(Long l) {
        return this.LL.VF2(l);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void VU1() {
        this.LL.VU1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Vd0(View view, AbsFragment absFragment, boolean z) {
        this.LL.Vd0(view, absFragment, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Vl0(boolean z, String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z2) {
        this.LL.Vl0(z, str, jSONObject, jSONObject2, z2);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, X.InterfaceC2183451Acp
    public final boolean Vs(String str) {
        return this.LL.Vs(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final AbstractC1100450ek7 W92(Context context, int i, LifecycleOwner lifecycleOwner, DataChannel dataChannel, User user) {
        return this.LL.W92(context, i, lifecycleOwner, dataChannel, user);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final AbstractC937370aV5 WX1(boolean z, Context context, int i, C11RK c11rk, C11RK c11rk2, C11RK c11rk3, C11RK c11rk4, String str, boolean z2, DataChannel dataChannel, ARunnableS117S0100000_17 aRunnableS117S0100000_17) {
        return this.LL.WX1(z, context, i, c11rk, c11rk2, c11rk3, c11rk4, str, z2, dataChannel, aRunnableS117S0100000_17);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Wd1(long j, Function2<? super Integer, ? super String, Unit> function2, Function0<Unit> function0) {
        this.LL.Wd1(j, function2, function0);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void We1(String str, Map<String, String> map) {
        this.LL.We1(str, map);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Wr2() {
        this.LL.Wr2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int XA2() {
        return this.LL.XA2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean XP2() {
        return this.LL.XP2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C0IF3 XY0(long j, C19EG c19eg) {
        return this.LL.XY0(j, c19eg);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final FrameLayout Xf1(long j) {
        return this.LL.Xf1(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Xi2(long j, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        this.LL.Xi2(j, function1, function12);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Xx2(DataChannel dataChannel) {
        this.LL.Xx2(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Y42() {
        this.LL.Y42();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Y51(C2276781E9s c2276781E9s) {
        this.LL.Y51(c2276781E9s);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long YR0(boolean z) {
        return this.LL.YR0(z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> YZ1() {
        return this.LL.YZ1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Ya1() {
        return this.LL.Ya1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final AbstractC970120bLu Yf1(Context context, DataChannel dataChannel, EnumC952890au7 enumC952890au7, C1819180xRM c1819180xRM, C1819160xRK c1819160xRK, C1819220xRQ c1819220xRQ) {
        return this.LL.Yf1(context, dataChannel, enumC952890au7, c1819180xRM, c1819160xRK, c1819220xRQ);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Rect Yx0() {
        return this.LL.Yx0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Yz(String str, Map map) {
        this.LL.Yz(str, map);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Z4() {
        return this.LL.Z4();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Z42(InterfaceC914680ZuU interfaceC914680ZuU) {
        this.LL.Z42(interfaceC914680ZuU);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C0ILL ZM(C19EG c19eg, DataChannel dataChannel) {
        return this.LL.ZM(c19eg, dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<String> ZP2() {
        return this.LL.ZP2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void ZQ(DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15) {
        this.LL.ZQ(dataChannel, awS559S0100000_15);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Zf() {
        return this.LL.Zf();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C1EA5 Zr2() {
        return this.LL.Zr2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean a0() {
        return this.LL.a0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void a00() {
        this.LL.a00();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void aE(C914350Ztx c914350Ztx, C2276771E9r c2276771E9r) {
        this.LL.aE(c914350Ztx, c2276771E9r);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC464090IHv aF0(LiveMode liveMode) {
        return this.LL.aF0(liveMode);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int aU0() {
        return this.LL.aU0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void ad1(Context context) {
        this.LL.ad1(context);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ae() {
        return this.LL.ae();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void au1(int i, int i2, int i3, C1873840yrW c1873840yrW) {
        this.LL.au1(i, i2, i3, c1873840yrW);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<Long> b70() {
        return this.LL.b70();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean bH2(DataChannel dataChannel) {
        return this.LL.bH2(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean bX0(DataChannel dataChannel) {
        return this.LL.bX0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C0JG7 c10(long j) {
        return this.LL.c10(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void c42() {
        this.LL.c42();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC758000ToM cI2() {
        return this.LL.cI2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int cw1() {
        return this.LL.cw1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void d70(RecyclableWidgetManager recyclableWidgetManager) {
        this.LL.d70(recyclableWidgetManager);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean dD(DataChannel dataChannel, boolean z) {
        return this.LL.dD(dataChannel, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void dE2(long j, String str) {
        this.LL.dE2(j, str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final TeamUsersInfo dY0(long j) {
        return this.LL.dY0(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void dZ(DataChannel dataChannel) {
        this.LL.dZ(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC463440IFi dc2() {
        return this.LL.dc2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void du0(String str) {
        this.LL.du0(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean dw1() {
        return this.LL.dw1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC948540an6 e32() {
        return this.LL.e32();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Object ec0() {
        return this.LL.ec0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void ej2() {
        this.LL.ej2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void el0(String str) {
        this.LL.el0(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long er() {
        return this.LL.er();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void et0(Room room) {
        this.LL.et0(room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void fI0(int i, String str) {
        this.LL.fI0(i, str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> fP2() {
        return this.LL.fP2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long ff() {
        return this.LL.ff();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void fu2(DataChannel dataChannel) {
        this.LL.fu2(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, X.InterfaceC2183451Acp
    public final void g1(List list) {
        this.LL.g1(list);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String g90(boolean z, Room room) {
        return this.LL.g90(z, room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean g92() {
        return this.LL.g92();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC937960aW2 gd0(ViewGroup viewGroup) {
        return this.LL.gd0(viewGroup);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long getBattleId() {
        return this.LL.getBattleId();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long getChannelId() {
        return this.LL.getChannelId();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String getConnectionType() {
        return this.LL.getConnectionType();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int getGuestCount() {
        return this.LL.getGuestCount();
    }

    @Override // X.InterfaceC2183451Acp
    public final boolean getLiveEventShieldConfirmValue() {
        return this.LL.getLiveEventShieldConfirmValue();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Map<String, String> getMatchLogParams() {
        return this.LL.getMatchLogParams();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<TeamUsersInfo> gg() {
        return this.LL.gg();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC952240at4 hI2() {
        return this.LL.hI2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void hN(DataChannel dataChannel, String str) {
        this.LL.hN(dataChannel, str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void hO0(DataChannel dataChannel) {
        this.LL.hO0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Map<String, String> ho0() {
        return this.LL.ho0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final User hz1() {
        return this.LL.hz1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, X.InterfaceC2183451Acp
    public final void i3(long j, Function0 function0, Function1 function1) {
        this.LL.i3(j, function0, function1);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void iQ0(DataChannel dataChannel) {
        this.LL.iQ0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ib2() {
        return this.LL.ib2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ig2() {
        return this.LL.ig2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void initPublicScreenConfiguration() {
        this.LL.initPublicScreenConfiguration();
    }

    @Override // X.InterfaceC2183451Acp
    public final void inviteLiveEventUser(Context context, long j, List<Long> list, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Function0<Unit> function02) {
        this.LL.inviteLiveEventUser(context, j, list, lifecycleOwner, function0, function02);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void it1() {
        this.LL.it1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void ji1(long j) {
        this.LL.ji1(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean jq1() {
        return this.LL.jq1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long js() {
        return this.LL.js();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void k30(Map<String, String> map) {
        this.LL.k30(map);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean k61(DataChannel dataChannel) {
        return this.LL.k61(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean k81() {
        return this.LL.k81();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final LiveWidget k90() {
        return this.LL.k90();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean kB() {
        return this.LL.kB();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean kD1() {
        return this.LL.kD1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean kZ() {
        return this.LL.kZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, X.InterfaceC2183451Acp
    public final void kn(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.LL.kn(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void kn1() {
        this.LL.kn1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean l62() {
        return this.LL.l62();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void l70(C944320agI c944320agI) {
        this.LL.l70(c944320agI);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean lL(C916750Zxp c916750Zxp) {
        return this.LL.lL(c916750Zxp);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void lO() {
        this.LL.lO();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void lR0(String str, boolean z) {
        this.LL.lR0(str, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void lX1(long j, DataChannel dataChannel, List list) {
        this.LL.lX1(j, dataChannel, list);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void ls0(DataChannel dataChannel) {
        this.LL.ls0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ls1() {
        return this.LL.ls1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void m00(String str, WeakReference<InterfaceC914420Zu4> weakReference) {
        this.LL.m00(str, weakReference);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C0UTJ mG2() {
        return this.LL.mG2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Rect mI2(long j) {
        return this.LL.mI2(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean mJ() {
        return this.LL.mJ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void mN0(int i, DataChannel dataChannel, String str, String str2) {
        this.LL.mN0(i, dataChannel, str, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String mO1() {
        return this.LL.mO1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, X.InterfaceC2183451Acp
    public final void mj(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.LL.mj(i, str, str2, str3, str4, str5, str6);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean mo2() {
        return this.LL.mo2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean mx1() {
        return this.LL.mx1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean n12() {
        return this.LL.n12();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean n30() {
        return this.LL.n30();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<C923440a8c> nr2() {
        return this.LL.nr2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ny1(String str) {
        return this.LL.ny1(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, X.InterfaceC2183451Acp
    public final boolean o1() {
        return this.LL.o1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void o22(String str, Map<String, String> map) {
        this.LL.o22(str, map);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String oE2() {
        return this.LL.oE2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void oZ0(List<Long> list, long j, Room room) {
        this.LL.oZ0(list, j, room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean oc() {
        return this.LL.oc();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean oh1() {
        return this.LL.oh1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void openLiveEventInviteGuestPanel(Activity activity, String str, long j, GetLiveEventUserResponse getLiveEventUserResponse, MultiGuestLiveEvent multiGuestLiveEvent) {
        this.LL.openLiveEventInviteGuestPanel(activity, str, j, getLiveEventUserResponse, multiGuestLiveEvent);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC939660aYm oz0() {
        return this.LL.oz0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean p00() {
        return this.LL.p00();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean pD1() {
        return this.LL.pD1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void pO() {
        this.LL.pO();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String pY0(DataChannel dataChannel) {
        return this.LL.pY0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideJsbForHost() {
        return this.LL.provideJsbForHost();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long q9() {
        return this.LL.q9();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void qR(DataChannel dataChannel, C11NJ c11nj, String str) {
        this.LL.qR(dataChannel, c11nj, str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean qW(User user) {
        return this.LL.qW(user);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void qm2(DataChannel dataChannel) {
        this.LL.qm2(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean qp0() {
        return this.LL.qp0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean qx0(User user) {
        return this.LL.qx0(user);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void rL() {
        this.LL.rL();
    }

    @Override // X.InterfaceC2183451Acp
    public final void reportLinkMicRelatedEvent(String str, Map<String, String> map) {
        this.LL.reportLinkMicRelatedEvent(str, map);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, X.InterfaceC2183451Acp
    public final void rh(int i, String str, String str2, String str3) {
        this.LL.rh(i, str, str2, str3);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean rl2(String str) {
        return this.LL.rl2(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int rm0(long j) {
        return this.LL.rm0(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String ry() {
        return this.LL.ry();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void sD(DataChannel dataChannel) {
        this.LL.sD(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String sE(long j) {
        return this.LL.sE(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void sO0() {
        this.LL.sO0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Map<String, String> sR(Long l, boolean z) {
        return this.LL.sR(l, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void sX1(InterfaceC923350a8T interfaceC923350a8T) {
        this.LL.sX1(interfaceC923350a8T);
    }

    @Override // X.InterfaceC2183451Acp
    public final void setLiveEventShieldConfirmValue(boolean z) {
        this.LL.setLiveEventShieldConfirmValue(z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean si1() {
        return this.LL.si1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void ss2(InterfaceC914680ZuU interfaceC914680ZuU) {
        this.LL.ss2(interfaceC914680ZuU);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<C923440a8c> tH2() {
        return this.LL.tH2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean tL() {
        return this.LL.tL();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean tk1(boolean z) {
        return this.LL.tk1(z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int tn0() {
        return this.LL.tn0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC758670TpR u7() {
        return this.LL.u7();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean uI2(DataChannel dataChannel) {
        return this.LL.uI2(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void uL0(DataChannel dataChannel) {
        this.LL.uL0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ui2() {
        return this.LL.ui2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC1273910jFt us2() {
        return this.LL.us2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> uz0() {
        return this.LL.uz0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long v81() {
        return this.LL.v81();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean vH0() {
        return this.LL.vH0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> vL1() {
        return this.LL.vL1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Bitmap vl0(String str) {
        return this.LL.vl0(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean vp0() {
        return this.LL.vp0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void vq1(String str, Map<String, ? extends Object> map) {
        this.LL.vq1(str, map);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String vt1() {
        return this.LL.vt1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Map<String, String> w00(Map<String, String> map) {
        return this.LL.w00(map);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String w30() {
        return this.LL.w30();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Pair<String, String> w72() {
        return this.LL.w72();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean w9() {
        return this.LL.w9();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean wc0() {
        return this.LL.wc0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean we0() {
        return this.LL.we0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC463170IEh wl1(ViewGroup viewGroup, DataChannel dataChannel, Fragment fragment) {
        return this.LL.wl1(viewGroup, dataChannel, fragment);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void x30(String str) {
        this.LL.x30(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void xh2(InterfaceC914670ZuT interfaceC914670ZuT) {
        this.LL.xh2(interfaceC914670ZuT);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void xt1(C474500IjA c474500IjA) {
        this.LL.xt1(c474500IjA);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String xw0() {
        return this.LL.xw0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean xz0() {
        return this.LL.xz0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int y91() {
        return this.LL.y91();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final PreviewPageActivePlaybook yK2(DataChannel dataChannel) {
        return this.LL.yK2(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Map<String, Map<String, String>> yh0(List<String> list) {
        return this.LL.yh0(list);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean yk1() {
        return this.LL.yk1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final C0JG7 yq(User user) {
        return this.LL.yq(user);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean z00(C916750Zxp c916750Zxp) {
        return this.LL.z00(c916750Zxp);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void zA(Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        this.LL.zA(function1, function12);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void zV(long j, C1799650wvr c1799650wvr) {
        this.LL.zV(j, c1799650wvr);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<Long> zr2() {
        return this.LL.zr2();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int zt() {
        return this.LL.zt();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void zx0(JSONObject jSONObject) {
        this.LL.zx0(jSONObject);
    }
}
