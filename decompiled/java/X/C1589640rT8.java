package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589640rT8 implements IFriendsFeedService {
    public static final C1589640rT8 LIZIZ = new C1589640rT8();
    public final /* synthetic */ IFriendsFeedService LIZ = (IFriendsFeedService) ServiceManager.get().getService(IFriendsFeedService.class);

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean A2() {
        return this.LIZ.A2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String B2(C19EG c19eg, String str, String str2) {
        return this.LIZ.B2(c19eg, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean C2() {
        return this.LIZ.C2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean D1() {
        return this.LIZ.D1();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void D2(InterfaceC1392880mLm interfaceC1392880mLm) {
        this.LIZ.D2(interfaceC1392880mLm);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void E1() {
        this.LIZ.E1();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean E2() {
        return this.LIZ.E2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean F2() {
        return this.LIZ.F2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void G2() {
        this.LIZ.G2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void H2(InterfaceC1392880mLm interfaceC1392880mLm) {
        this.LIZ.H2(interfaceC1392880mLm);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void I2(String str) {
        this.LIZ.I2(str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final int J2() {
        return this.LIZ.J2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void K2(User user, Fragment fragment, Activity activity, EnumC1393020mM0 enumC1393020mM0, EnumC1392960mLu enumC1392960mLu, View view, Function1<? super Boolean, Unit> function1) {
        this.LIZ.K2(user, fragment, activity, enumC1393020mM0, enumC1392960mLu, view, function1);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String L2(Aweme aweme, Activity activity) {
        return this.LIZ.L2(aweme, activity);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final C0WHU LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LLLLLLL() {
        return this.LIZ.LLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void M2(Activity activity, View view, Fragment fragment, C1393190mMH c1393190mMH, EnumC1393020mM0 enumC1393020mM0, EnumC1392960mLu enumC1392960mLu, User user, Function1 function1) {
        this.LIZ.M2(activity, view, fragment, c1393190mMH, enumC1393020mM0, enumC1392960mLu, user, function1);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final int N2() {
        return this.LIZ.N2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean O2() {
        return this.LIZ.O2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void P2(Context context) {
        this.LIZ.P2(context);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final Object Q2(InterfaceC691450RAh interfaceC691450RAh) {
        return this.LIZ.Q2(interfaceC691450RAh);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void R1(boolean z) {
        this.LIZ.R1(z);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void R2(boolean z) {
        this.LIZ.R2(z);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void S1() {
        this.LIZ.S1();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final int S2() {
        return this.LIZ.S2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean T1() {
        return this.LIZ.T1();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void T2() {
        this.LIZ.T2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String U1() {
        return this.LIZ.U1();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final long U2() {
        return this.LIZ.U2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean V1() {
        return this.LIZ.V1();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String V2() {
        return this.LIZ.V2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void W1(String str, String str2) {
        this.LIZ.W1(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean W2() {
        return this.LIZ.W2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String X1() {
        return this.LIZ.X1();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void X2() {
        this.LIZ.X2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> Y1() {
        return this.LIZ.Y1();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void Y2(Context context) {
        this.LIZ.Y2(context);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void Z1(long j) {
        this.LIZ.Z1(j);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void Z2() {
        this.LIZ.Z2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void a2(int i) {
        this.LIZ.a2(i);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final Aweme a3() {
        return this.LIZ.a3();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final Boolean b2(String str, EnumC1392960mLu enumC1392960mLu) {
        return this.LIZ.b2(str, enumC1392960mLu);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void b3(Context context, Fragment fragment, User user, EnumC1393020mM0 enumC1393020mM0, C1393160mME c1393160mME, C1393110mM9 c1393110mM9) {
        this.LIZ.b3(context, fragment, user, enumC1393020mM0, c1393160mME, c1393110mM9);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final View c2(Context context) {
        return this.LIZ.c2(context);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void c3(int i) {
        this.LIZ.c3(i);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void d2() {
        this.LIZ.d2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final Object d3(View view, Fragment fragment) {
        return this.LIZ.d3(view, fragment);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void e2() {
        this.LIZ.e2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void e3() {
        this.LIZ.e3();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void f2(EnumC1392960mLu enumC1392960mLu, String str, boolean z) {
        this.LIZ.f2(enumC1392960mLu, str, z);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void f3(boolean z) {
        this.LIZ.f3(z);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void g2(FriendsTabTopExperiment.FriendsTabTopConfig friendsTabTopConfig, Integer num) {
        this.LIZ.g2(friendsTabTopConfig, num);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void g3(int i) {
        this.LIZ.g3(i);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean h2() {
        return this.LIZ.h2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void h3() {
        this.LIZ.h3();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void i2(C19EG c19eg) {
        this.LIZ.i2(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void i3(String str, String str2, String str3) {
        this.LIZ.i3(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final List<String> j2() {
        return this.LIZ.j2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void j3(boolean z) {
        this.LIZ.j3(z);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void k2(List<String> list, boolean z) {
        this.LIZ.k2(list, z);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void k3(C19EG c19eg) {
        this.LIZ.k3(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean l2() {
        return this.LIZ.l2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean l3() {
        return this.LIZ.l3();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final C1587420rPY m2() {
        return this.LIZ.m2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void m3() {
        this.LIZ.m3();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void n2(String str) {
        this.LIZ.n2(str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void n3() {
        this.LIZ.n3();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void o2(String str, ArrayList arrayList) {
        this.LIZ.o2(str, arrayList);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void o3(String str, String str2, String str3) {
        this.LIZ.o3(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void onAwemeRead(int i, Aweme aweme, String str) {
        boolean zLJI = MethodIDManager.LJI(71698);
        this.LIZ.onAwemeRead(i, aweme, str);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void onFriendsV3StoryDetailRead(int i, Aweme aweme, String str) {
        this.LIZ.onFriendsV3StoryDetailRead(i, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void p2(boolean z) {
        this.LIZ.p2(z);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void q2() {
        this.LIZ.q2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final IInterceptor r2() {
        return this.LIZ.r2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean s2() {
        return this.LIZ.s2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean shouldShowFriendsTab() {
        return this.LIZ.shouldShowFriendsTab();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean t2(Fragment fragment) {
        return this.LIZ.t2(fragment);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean u2() {
        return this.LIZ.u2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final C0TRR v2() {
        return this.LIZ.v2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean w2() {
        return this.LIZ.w2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final View x2(Context context) {
        return this.LIZ.x2(context);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void y2(String str, String str2) {
        this.LIZ.y2(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void z2(List<String> list) {
        this.LIZ.z2(list);
    }
}
