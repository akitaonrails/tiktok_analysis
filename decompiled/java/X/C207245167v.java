package X;

import Y.AfS200S0100000_31;
import Y.AkS159S0000000_31;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.settings.LiveUserRequestRefactorSetting;
import com.bytedance.android.livesdk.userservice.FollowApi;
import com.bytedance.android.livesdk.userservice.FollowResult;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.167v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207245167v implements InterfaceC500940Jki {
    public final C2261991DgD LIZ;
    public InterfaceC2262081DgM LIZIZ;
    public final C098J LIZJ;
    public final IHostUser LIZLLL;
    public final UserApi LJ;
    public final FollowApi LJFF;
    public final C19493011Oe<C784060UpI> LJI;
    public final C11RK<InterfaceC2262081DgM> LJII;
    public final C11RK<FollowPair> LJIIIIZZ;
    public C11RK<InterfaceC2262081DgM> LJIIIZ;
    public final C207242167s LJIIJ;

    @Override // X.InterfaceC500940Jki
    public final boolean LJIILJJIL() {
        IHostUser iHostUser = this.LIZLLL;
        if (iHostUser != null) {
            return iHostUser.isMinorMode() || this.LIZLLL.isDeleteByAgeGate();
        }
        return false;
    }

    @Override // X.InterfaceC500940Jki
    public final AbstractC19484711Kz<InterfaceC2262081DgM> LJIILLIIL() {
        return LJIIL("UserCenter_updateCurrentUserUnknown");
    }

    @Override // X.InterfaceC500940Jki
    public final User LJIJJLI() {
        InterfaceC2262081DgM interfaceC2262081DgM = this.LIZIZ;
        return interfaceC2262081DgM instanceof User ? (User) interfaceC2262081DgM : this.LIZ;
    }

    @Override // X.InterfaceC500940Jki
    public final List<C750550TcL> getAllFriends() {
        return this.LIZLLL.getAllFriends();
    }

    @Override // X.InterfaceC500940Jki
    public final long getCurrentUserId() {
        return this.LIZIZ.getId();
    }

    @Override // X.InterfaceC500940Jki
    public final boolean isLogin() {
        return this.LIZIZ.getId() > 0;
    }

    @Override // X.InterfaceC500940Jki
    public final C11NZ<FollowPair> LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC500940Jki
    public final C11NN<C784060UpI> LJII() {
        return this.LJI;
    }

    @Override // X.InterfaceC500940Jki
    public final InterfaceC2262081DgM getCurrentUser() {
        return this.LIZIZ;
    }

    public C207245167v(final IHostUser iHostUser) {
        C2261991DgD c2261991DgD = new C2261991DgD();
        this.LIZ = c2261991DgD;
        this.LIZIZ = c2261991DgD;
        this.LIZJ = new C098J();
        this.LJI = new C19493011Oe<>();
        this.LJII = new C11RK<>();
        this.LJIIIIZZ = new C11RK<>();
        this.LJIIJ = new C207242167s(this);
        if (iHostUser == null) {
            return;
        }
        this.LIZLLL = iHostUser;
        LJJI(iHostUser.getCurUser());
        C480460Ism.LIZ().getClass();
        this.LJ = (UserApi) C480460Ism.LIZLLL(UserApi.class);
        C480460Ism.LIZ().getClass();
        this.LJFF = (FollowApi) C480460Ism.LIZLLL(FollowApi.class);
        iHostUser.registerCurrentUserUpdateListener(new InterfaceC207240167q() { // from class: X.167u
            @Override // X.InterfaceC207240167q
            public final void LIZ(boolean z) {
                C207245167v c207245167v = this.LIZ;
                IHostUser iHostUser2 = iHostUser;
                c207245167v.getClass();
                if (z) {
                    c207245167v.LJJI(iHostUser2.getCurUser());
                    c207245167v.LJIIL("UserCenter_registerCurrentUserUpdateListener").LIZ(new C16HZ(c207245167v, 0));
                } else {
                    c207245167v.LJJI(new C2261991DgD());
                    c207245167v.LJI.onNext(new C784060UpI(EnumC1098720ehK.Logout, c207245167v.LIZIZ));
                }
            }
        });
        iHostUser.registerFollowStatusListener(new C1839800xyc(this));
        LJIIL("UserCenter_init").LIZ(new C476750Imn());
    }

    @Override // X.InterfaceC500940Jki
    public final C11NZ<FollowPair> LIZ(C1812130xFz c1812130xFz) {
        return LJJ(1, c1812130xFz.LIZ, c1812130xFz.LIZIZ, c1812130xFz.LIZLLL, c1812130xFz.LIZJ, c1812130xFz.LJ, c1812130xFz.LJI, c1812130xFz.LJFF);
    }

    @Override // X.InterfaceC500940Jki
    public final C11NZ<FollowPair> LIZIZ(final long j) {
        return this.LJIIIIZZ.LJJIL(new InterfaceC19483011Ki() { // from class: X.15CB
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((FollowPair) obj).LIZ == j) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // X.InterfaceC500940Jki
    public final void LIZJ(InterfaceC2262081DgM interfaceC2262081DgM) {
        if (interfaceC2262081DgM != null) {
            this.LIZJ.put(Long.valueOf(interfaceC2262081DgM.getId()), interfaceC2262081DgM);
        }
    }

    @Override // X.InterfaceC500940Jki
    public final C11NZ<FollowPair> LIZLLL(C1099330eiJ c1099330eiJ) {
        return LJJ(1, c1099330eiJ.LIZ, c1099330eiJ.LIZIZ, c1099330eiJ.LIZLLL, c1099330eiJ.LIZJ, false, c1099330eiJ.LJI, false);
    }

    @Override // X.InterfaceC500940Jki
    public final C11NZ<FollowPair> LJI(C1812120xFy c1812120xFy) {
        return C11NZ.LJIJJLI(new C1864910yd7(this, c1812120xFy, c1812120xFy, 0));
    }

    @Override // X.InterfaceC500940Jki
    public final AbstractC19484711Kz<User> LJIIIIZZ(long j) {
        return LJ(j, "UserCenter_queryUserWithIdUnknown", "userCenter_queryUserWithIdUnknown");
    }

    @Override // X.InterfaceC500940Jki
    public final C11NZ<InterfaceC2262081DgM> LJIIIZ(final long j) {
        return this.LJII.LJJIL(new InterfaceC19483011Ki() { // from class: X.167y
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                long j2 = j;
                InterfaceC2262081DgM interfaceC2262081DgM = (InterfaceC2262081DgM) obj;
                if (interfaceC2262081DgM != null && interfaceC2262081DgM.getId() == j2) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // X.InterfaceC500940Jki
    public final void LJIIJJI(FollowPair followPair) {
        this.LIZLLL.onFollowStatusChanged(followPair.followStatus, followPair.LIZ);
        C784440Upu.LIZ().LIZIZ(new C473020Igm(followPair));
        this.LJIIIIZZ.onNext(followPair);
    }

    @Override // X.InterfaceC500940Jki
    public final AbstractC19484711Kz<InterfaceC2262081DgM> LJIIL(String str) {
        AbstractC19484711Kz<C470590Icr<User>> abstractC19484711KzQueryUser;
        long curUserId = this.LIZLLL.getCurUserId();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && LiveUserRequestRefactorSetting.INSTANCE.getValue()) {
            abstractC19484711KzQueryUser = this.LJ.queryUser(curUserId, 2L, LJIJ(curUserId), String.valueOf(room.getId()), String.valueOf(room.getOwnerUserId()), str);
        } else {
            abstractC19484711KzQueryUser = this.LJ.queryUser(curUserId, 2L, LJIJ(curUserId), str);
        }
        return abstractC19484711KzQueryUser.LJJIJIIJI(C11S5.LIZ()).LJIL(new AkS159S0000000_31(4)).LJJ(C1701940uOG.LIZIZ()).LJIILL(new AfS200S0100000_31(this, 36));
    }

    @Override // X.InterfaceC500940Jki
    public final AbstractC19484711Kz<User> LJIILIIL(final User user) {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.167x
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At interfaceC2329309At) {
                C207245167v c207245167v = this.LL;
                User user2 = user;
                c207245167v.getClass();
                try {
                    if (user2 != null) {
                        c207245167v.LJII.onNext(user2);
                        c207245167v.LIZJ(user2);
                        interfaceC2329309At.onSuccess(user2);
                        if (LiveUserRequestRefactorSetting.INSTANCE.getValue()) {
                            c207245167v.LIZIZ = user2;
                            return;
                        }
                        return;
                    }
                    interfaceC2329309At.onError(new NullPointerException("Current user is null"));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    interfaceC2329309At.onError(e);
                }
            }
        });
    }

    @Override // X.InterfaceC500940Jki
    public final void LJIIZILJ(User user) {
        this.LIZIZ = user;
    }

    @Override // X.InterfaceC500940Jki
    public final String LJIJ(long j) {
        InterfaceC2262081DgM interfaceC2262081DgM = (InterfaceC2262081DgM) this.LIZJ.get(Long.valueOf(j));
        if (interfaceC2262081DgM != null) {
            return interfaceC2262081DgM.getSecUid();
        }
        return null;
    }

    @Override // X.InterfaceC500940Jki
    public final boolean LJIJI(EnumC1134120fcQ enumC1134120fcQ) {
        return this.LIZLLL.interceptOperation(enumC1134120fcQ.getFunc());
    }

    @Override // X.InterfaceC500940Jki
    public final AbstractC19484711Kz LJIL(HashMap map) {
        return this.LJ.queryUser(map, "profileDialog_batchRequest").LJJIJIIJI(C11S5.LIZ()).LJIILL(new AfS200S0100000_31(this, 37)).LJJ(C1701940uOG.LIZIZ());
    }

    public final void LJJI(InterfaceC2262081DgM interfaceC2262081DgM) {
        if (interfaceC2262081DgM != null) {
            this.LIZIZ = interfaceC2262081DgM;
            this.LJI.onNext(new C784060UpI(EnumC1098720ehK.Update, interfaceC2262081DgM));
            this.LIZJ.put(Long.valueOf(interfaceC2262081DgM.getId()), interfaceC2262081DgM);
            this.LJII.onNext(interfaceC2262081DgM);
            return;
        }
        this.LIZIZ = new C2261991DgD();
    }

    @Override // X.InterfaceC500940Jki
    public final AbstractC19484711Kz LJIIJ(String str, HashMap map) {
        return this.LJ.queryUser(map, str).LJJIJIIJI(C11S5.LIZ()).LJIL(new AkS159S0000000_31(1)).LJIILL(new AfS200S0100000_31(this, 34)).LJJ(C1701940uOG.LIZIZ());
    }

    @Override // X.InterfaceC500940Jki
    public final C11NZ<InterfaceC2262081DgM> LJIILL(Context context, C501600Jlm c501600Jlm) {
        if (context.getResources().getConfiguration().orientation == 2) {
            C784440Upu.LIZ().LIZIZ(new C0IF2("login"));
        }
        C19EG c19egLJ = C500260Jjc.LJ(context);
        if (c19egLJ != null) {
            this.LIZLLL.login(c19egLJ, this.LJIIJ, c501600Jlm.LIZ, c501600Jlm.LIZIZ, c501600Jlm.LIZJ, c501600Jlm.LIZLLL, c501600Jlm.LJ, c501600Jlm.LJFF);
            C11RK<InterfaceC2262081DgM> c11rk = new C11RK<>();
            this.LJIIIZ = c11rk;
            return c11rk.LJJJLZIJ(C1701940uOG.LIZIZ());
        }
        throw new IllegalArgumentException("Argument \"context\" cannot be transformed to FragmentActivity in UserCenter.login() method. ");
    }

    @Override // X.InterfaceC500940Jki
    public final AbstractC19484711Kz<User> LJIJJ(long j, String str) {
        AbstractC19484711Kz<C470590Icr<User>> abstractC19484711KzQueryUser;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && LiveUserRequestRefactorSetting.INSTANCE.getValue()) {
            abstractC19484711KzQueryUser = this.LJ.queryUser(j, 2L, LJIJ(j), String.valueOf(room.getId()), String.valueOf(room.getOwnerUserId()), str);
        } else {
            abstractC19484711KzQueryUser = this.LJ.queryUser(j, 2L, LJIJ(j), str);
        }
        return abstractC19484711KzQueryUser.LJJIJIIJI(C11S5.LIZ()).LJIL(new AkS159S0000000_31(3)).LJIILL(new AfS200S0100000_31(this, 35)).LJJ(C1701940uOG.LIZIZ());
    }

    @Override // X.InterfaceC500940Jki
    public final AbstractC19484711Kz<User> LJ(long j, String str, String str2) {
        AbstractC19484711Kz<C470590Icr<User>> abstractC19484711KzQueryUser;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && LiveUserRequestRefactorSetting.INSTANCE.getValue()) {
            abstractC19484711KzQueryUser = this.LJ.queryUser(j, 2L, LJIJ(j), str, String.valueOf(room.getId()), String.valueOf(room.getOwnerUserId()), str2);
        } else {
            abstractC19484711KzQueryUser = this.LJ.queryUser(j, 2L, LJIJ(j), str, str2);
        }
        return abstractC19484711KzQueryUser.LJJIJIIJI(C11S5.LIZ()).LJIL(new AkS159S0000000_31(2)).LJIILL(new AfS200S0100000_31(this, 33)).LJJ(C1701940uOG.LIZIZ());
    }

    public final C19500811Re LJJ(final int i, final long j, final long j2, final EnumC1812050xFr enumC1812050xFr, final HashMap map, final boolean z, boolean z2, boolean z3) {
        C11NZ<C470590Icr<FollowResult>> c11nzUnfollow;
        if (i == 1) {
            C480460Ism.LIZ().getClass();
            c11nzUnfollow = ((FollowApi) C480460Ism.LIZIZ(FollowApi.class)).follow(i, j, j2, this.LIZIZ.getSecUid(), LJIJ(j), z2, z3);
        } else {
            c11nzUnfollow = this.LJFF.unfollow(i, this.LIZIZ.getSecUid(), j, LJIJ(j), j2);
        }
        C19500811Re c19500811ReLJJLIIJ = c11nzUnfollow.LJIILIIL(new C0UO0()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0xFs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                long j3 = j;
                EnumC1812050xFr enumC1812050xFr2 = enumC1812050xFr;
                int i2 = ((FollowResult) ((BaseResponse) obj).data).followType;
                FollowPair followPair = new FollowPair();
                if (i2 == 1) {
                    followPair.followStatus = 1;
                } else if (i2 == 2) {
                    followPair.followStatus = 2;
                } else {
                    followPair.followStatus = 0;
                }
                followPair.LIZJ = i2;
                followPair.LIZ = j3;
                followPair.LIZLLL = enumC1812050xFr2;
                return followPair;
            }
        }).LJJLIIJ();
        c19500811ReLJJLIIJ.LJJLL(new C09JN() { // from class: X.0xFl
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str;
                C207245167v c207245167v = this.LL;
                HashMap<String, String> map2 = map;
                boolean z4 = z;
                int i2 = i;
                long j3 = j;
                long j4 = j2;
                FollowPair followPair = (FollowPair) obj;
                c207245167v.getClass();
                C1C7U.LIZ("UserCenter@ffac.follow$1L");
                c207245167v.LIZLLL.onFollowStatusChanged(followPair.followStatus, followPair.LIZ);
                followPair.LJFF = map2;
                if (z4) {
                    C784440Upu.LIZ().LIZIZ(new C257100z3(followPair));
                }
                C784440Upu.LIZ().LIZIZ(new C473020Igm(followPair));
                c207245167v.LJIIIIZZ.onNext(followPair);
                InterfaceC2262081DgM interfaceC2262081DgM = c207245167v.LIZIZ;
                if (interfaceC2262081DgM != null) {
                    long id = interfaceC2262081DgM.getId();
                    if (i2 == 1) {
                        str = "ttlive_follow";
                    } else {
                        str = "ttlive_unfollow";
                    }
                    HashMap map3 = new HashMap();
                    map3.put("proponent_id", Long.valueOf(id));
                    map3.put("adopter_id", Long.valueOf(j3));
                    map3.put("room_id", Long.valueOf(j4));
                    C1CC2.LJII(0, C0KQH.LIZ(str), map3);
                }
                C1C7U.LIZIZ("UserCenter@ffac.follow$1L");
            }
        }, new C09JN() { // from class: X.0xA5
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str;
                String message;
                C207245167v c207245167v = this.LL;
                int i2 = i;
                long j3 = j;
                long j4 = j2;
                Throwable th = (Throwable) obj;
                c207245167v.getClass();
                C1C7U.LIZ("UserCenter@ffac.follow$2L");
                InterfaceC2262081DgM interfaceC2262081DgM = c207245167v.LIZIZ;
                if (interfaceC2262081DgM != null) {
                    long id = interfaceC2262081DgM.getId();
                    if (i2 == 1) {
                        str = "ttlive_follow";
                    } else {
                        str = "ttlive_unfollow";
                    }
                    HashMap map2 = new HashMap();
                    map2.put("proponent_id", Long.valueOf(id));
                    map2.put("adopter_id", Long.valueOf(j3));
                    map2.put("room_id", Long.valueOf(j4));
                    if (th != null) {
                        message = th.getMessage();
                        if (th instanceof C501520Jle) {
                            map2.put("error_code", Integer.valueOf(((C501520Jle) th).getErrorCode()));
                        }
                    } else {
                        message = "";
                    }
                    map2.put("error_msg", message);
                    C1CC2.LJII(1, C0KQH.LIZ(str), map2);
                    C1CC2.LJII(1, C0KQH.LIZIZ(str), map2);
                }
                C1C7U.LIZIZ("UserCenter@ffac.follow$2L");
            }
        });
        return c19500811ReLJJLIIJ.LJJLIIJ();
    }
}
