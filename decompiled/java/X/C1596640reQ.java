package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0reQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596640reQ {
    public static AbstractC1596590reL LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new AbstractC1596590reL() { // from class: X.0reo
                    };
                }
                return new AbstractC1596590reL() { // from class: X.0reK
                    @Override // X.AbstractC1596590reL, X.InterfaceC1596870ren
                    public final InterfaceC1596200rdi LIZ() {
                        return new InterfaceC1596200rdi() { // from class: X.0reV
                            @Override // X.InterfaceC1596200rdi
                            public final boolean LJIILIIL() {
                                return false;
                            }

                            @Override // X.InterfaceC1596200rdi
                            public final boolean LJIIZILJ() {
                                return ((Number) C277860Aum.LIZ.getValue()).intValue() != 1 && C0IVH.LIZ(C0IVJ.FOLLOW);
                            }

                            public static FollowingInterestUsersResponse LIZ(Pair pair) {
                                Object c098200Yq;
                                String nickName;
                                String username;
                                ImageModel avatarThumb;
                                ImageModel avatarMedium;
                                LogPbBean logPbBean = new LogPbBean();
                                String str = (String) pair.getSecond();
                                if (str == null) {
                                    str = "";
                                }
                                logPbBean.setImprId(str);
                                ArrayList arrayList = new ArrayList();
                                List<Room> list = (List) pair.getFirst();
                                if (list != null) {
                                    for (Room room : list) {
                                        long id = 0;
                                        if (room.getId() > 0) {
                                            long ownerUserId = room.getOwnerUserId();
                                            if (ownerUserId <= 0) {
                                                User owner = room.getOwner();
                                                if (owner != null) {
                                                    id = owner.getId();
                                                }
                                            } else {
                                                id = ownerUserId;
                                            }
                                            com.ss.android.ugc.aweme.profile.model.User user = new com.ss.android.ugc.aweme.profile.model.User();
                                            try {
                                                c098200Yq = C08JS.LIZLLL(room);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            }
                                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                                c098200Yq = "";
                                            }
                                            user.roomData = (String) c098200Yq;
                                            user.roomId = room.getId();
                                            user.setUid(String.valueOf(id));
                                            User owner2 = room.getOwner();
                                            ImageModel avatarLarge = null;
                                            if (owner2 == null || (nickName = owner2.getNickName()) == null) {
                                                nickName = "";
                                            }
                                            user.setNickname(nickName);
                                            User owner3 = room.getOwner();
                                            if (owner3 == null || (username = owner3.getUsername()) == null) {
                                                username = "";
                                            }
                                            user.setUniqueId(username);
                                            User owner4 = room.getOwner();
                                            if (owner4 != null) {
                                                avatarThumb = owner4.getAvatarThumb();
                                            } else {
                                                avatarThumb = null;
                                            }
                                            user.setAvatarThumb(C1382820m5Y.LIZ(avatarThumb));
                                            User owner5 = room.getOwner();
                                            if (owner5 != null) {
                                                avatarMedium = owner5.getAvatarMedium();
                                            } else {
                                                avatarMedium = null;
                                            }
                                            user.setAvatarMedium(C1382820m5Y.LIZ(avatarMedium));
                                            User owner6 = room.getOwner();
                                            if (owner6 != null) {
                                                avatarLarge = owner6.getAvatarLarge();
                                            }
                                            user.setAvatarLarger(C1382820m5Y.LIZ(avatarLarge));
                                            C1382820m5Y.LIZIZ(room, user);
                                            arrayList.add(new FollowingInterestUser(user, false, logPbBean, 0, null));
                                        }
                                    }
                                }
                                return new FollowingInterestUsersResponse(0, arrayList, new ArrayList(), 0, 0L, logPbBean, null);
                            }

                            @Override // X.InterfaceC1596200rdi
                            public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJFF(boolean z, boolean z2) {
                                try {
                                    FollowingInterestUsersResponse followingInterestUsersResponseLIZ = LIZ(C0IVH.LIZJ());
                                    C1596130rdb.LIZ.getClass();
                                    C1596130rdb.LJIILIIL(2, followingInterestUsersResponseLIZ);
                                    List<FollowingInterestUser> followingInterestUsers = followingInterestUsersResponseLIZ.getFollowingInterestUsers();
                                    if (followingInterestUsers == null) {
                                        followingInterestUsers = C13BV.INSTANCE;
                                    }
                                    if (!followingInterestUsers.isEmpty()) {
                                        List<Object> listLIZ = C1596310rdt.LIZ(C1596310rdt.LIZLLL(followingInterestUsers, z, z2), z2, z);
                                        EnumC1595320rcI enumC1595320rcI = EnumC1595320rcI.COMPLETE;
                                        ArrayList arrayList = new ArrayList();
                                        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcC = new C1595260rcC<>(enumC1595320rcI, arrayList, CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
                                        arrayList.addAll(listLIZ);
                                        return c1595260rcC;
                                    }
                                    return new C1595260rcC<>(EnumC1595320rcI.COMPLETE, new ArrayList(), CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return new C1595260rcC<>(EnumC1595320rcI.FAIL, new ArrayList(), CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
                                }
                            }
                        };
                    }

                    @Override // X.AbstractC1596590reL, X.InterfaceC1596870ren
                    public final InterfaceC1596210rdj LIZIZ() {
                        return new C1596460re8();
                    }

                    @Override // X.AbstractC1596590reL, X.InterfaceC1596870ren
                    public final InterfaceC1596220rdk LIZJ() {
                        return new InterfaceC1596230rdl() { // from class: X.0reC
                            @Override // X.InterfaceC1596220rdk
                            public final String LIZ() {
                                return null;
                            }

                            @Override // X.InterfaceC1596220rdk
                            public final boolean LJJIFFI(boolean z) {
                                return z;
                            }

                            @Override // X.InterfaceC1596230rdl
                            public final SkylightFollowingUserResponse LJIIJ() {
                                try {
                                    return C1596470re9.LIZ().LIZ().execute().LIZIZ;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return null;
                                }
                            }

                            @Override // X.InterfaceC1596220rdk
                            public final FollowingInterestUsersResponse LJIJ(int i2) {
                                return C1596470re9.LIZIZ(null, Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE), true, 2);
                            }
                        };
                    }
                };
            }
            return new AbstractC1596590reL() { // from class: X.0rel
                @Override // X.AbstractC1596590reL, X.InterfaceC1596870ren
                public final InterfaceC1596200rdi LIZ() {
                    return new InterfaceC1596200rdi() { // from class: X.0rek
                        @Override // X.InterfaceC1596200rdi
                        public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJFF(boolean z, boolean z2) {
                            return null;
                        }

                        @Override // X.InterfaceC1596200rdi
                        public final boolean LJIILIIL() {
                            return true;
                        }

                        @Override // X.InterfaceC1596200rdi
                        public final boolean LJIIZILJ() {
                            return false;
                        }
                    };
                }

                @Override // X.AbstractC1596590reL, X.InterfaceC1596870ren
                public final InterfaceC1596220rdk LIZJ() {
                    return new InterfaceC1596220rdk() { // from class: X.0rem
                        @Override // X.InterfaceC1596220rdk
                        public final String LIZ() {
                            return null;
                        }

                        @Override // X.InterfaceC1596220rdk
                        public final boolean LJJIFFI(boolean z) {
                            return z;
                        }

                        @Override // X.InterfaceC1596220rdk
                        public final FollowingInterestUsersResponse LJIJ(int i2) {
                            return C1596470re9.LIZIZ(Integer.valueOf(i2), false, false, 14);
                        }
                    };
                }
            };
        }
        return new AbstractC1596590reL() { // from class: X.0reR
            @Override // X.AbstractC1596590reL, X.InterfaceC1596870ren
            public final InterfaceC1596200rdi LIZ() {
                return new C1595280rcE();
            }

            @Override // X.AbstractC1596590reL, X.InterfaceC1596870ren
            public final InterfaceC1596220rdk LIZJ() {
                return new InterfaceC1596220rdk() { // from class: X.0reY
                    @Override // X.InterfaceC1596220rdk
                    public final String LIZ() {
                        if (C296330BjT.LIZ()) {
                            return C1589640rT8.LIZIZ.X1();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1596220rdk
                    public final FollowingInterestUsersResponse LJIJ(int i2) {
                        if (C0ACG.LIZ()) {
                            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                            if (iLiveOuterService != null && iLiveOuterService.LIZLLL() != null) {
                                Pair pairLIZ = C473360IhK.LIZ(C2097608Jq.LJ());
                                return C20639915pd.LIZ((String) pairLIZ.getSecond(), (List) pairLIZ.getFirst());
                            }
                            return C1596470re9.LIZIZ(null, false, false, 14);
                        }
                        return C1596470re9.LIZIZ(null, false, false, 14);
                    }

                    @Override // X.InterfaceC1596220rdk
                    public final boolean LJJIFFI(boolean z) {
                        if (C0ACG.LIZ() && z && ((Boolean) C0BLF.LIZ.getValue()).booleanValue()) {
                            return true;
                        }
                        return false;
                    }
                };
            }
        };
    }
}
