package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.event.IFollowApiEventReporter;
import com.ss.android.ugc.aweme.friends.model.RelationDataSource;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.RecommendCellInfo;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ihZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM$followWithOfflineWrite$1", f = "RelationViewVM.kt", l = {107}, m = "invokeSuspend")
public final class C1252630ihZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1252380ihA LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function2<Boolean, C0XIR, Unit> LLILZ;
    public final /* synthetic */ RelationViewVM LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1252630ihZ(C1252380ihA c1252380ihA, String str, Function2<? super Boolean, ? super C0XIR, Unit> function2, RelationViewVM relationViewVM, InterfaceC1364105Vn<? super C1252630ihZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1252380ihA;
        this.LLILLL = str;
        this.LLILZ = function2;
        this.LLILZIL = relationViewVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1252630ihZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        User userM307clone;
        User userM307clone2;
        C1C7U.LIZ("RelationViewVM@8ffd.followWithOfflineWrite$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1252430ihF c1252430ihF = C1252430ihF.LIZ;
            C1252380ihA c1252380ihA = this.LLILLJJLI;
            String str = this.LLILLL;
            c1252430ihF.getClass();
            final int iLIZIZ = C1252430ihF.LIZIZ(c1252380ihA.LIZLLL, c1252380ihA.LJIIJJI, c1252380ihA.LJIILIIL);
            C1336205Ku.LIZ(false).getImSayHiService().LJIIJ(new FollowStatus(c1252380ihA.LIZ, iLIZIZ));
            if (Intrinsics.LJFF(str, "share_user_info_card")) {
                EventLiveData<FollowStatus> eventLiveData = RelationDataSource.INSTANCE.get();
                String str2 = c1252380ihA.LIZ;
                int i2 = c1252380ihA.LJIIJJI;
                User user = c1252380ihA.LJIILL;
                if (user != null) {
                    userM307clone2 = user.m307clone();
                } else {
                    userM307clone2 = null;
                }
                eventLiveData.postValue(new FollowStatus(0, iLIZIZ, null, 0, str2, null, true, true, Integer.valueOf(i2), c1252380ihA.LJ, userM307clone2, null, -1, true));
            } else {
                EventLiveData<FollowStatus> eventLiveData2 = RelationDataSource.INSTANCE.get();
                String str3 = c1252380ihA.LIZ;
                int i3 = c1252380ihA.LJIIJJI;
                User user2 = c1252380ihA.LJIILL;
                if (user2 != null) {
                    userM307clone = user2.m307clone();
                } else {
                    userM307clone = null;
                }
                eventLiveData2.postValue(new FollowStatus(0, iLIZIZ, null, 0, str3, null, true, true, Integer.valueOf(i3), c1252380ihA.LJ, userM307clone, null, -1, false));
            }
            if (C1601110rld.LIZ()) {
                InterfaceC728100ShE interfaceC728100ShELJJLIIIJLJLI = C1618440sDa.LIZIZ.LJJLIIIJLJLI();
                FollowStatus followStatus = new FollowStatus(c1252380ihA.LIZ, iLIZIZ);
                followStatus.setFollowerStatus(Integer.valueOf(c1252380ihA.LJIIJJI));
                interfaceC728100ShELJJLIIIJLJLI.LJFF(followStatus);
            }
            if (C816930W2x.LIZ()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2449009ii(c1252380ihA, null), 3);
            }
            InterfaceC346201Wa interfaceC346201WaLIZ = C0OF5.LIZ(this.LLILLJJLI.LIZ, C0OF5.LIZIZ(this.LLILLJJLI));
            final C1252380ihA c1252380ihA2 = this.LLILLJJLI;
            final Function2<Boolean, C0XIR, Unit> function2 = this.LLILZ;
            final String str4 = this.LLILLL;
            final RelationViewVM relationViewVM = this.LLILZIL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0ihc
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
                    Object rawResponse;
                    String imprId;
                    Integer numValueOf;
                    int errorCode;
                    FollowStatus followStatus2;
                    LogPbBean logPb;
                    C0O7A c0o7a = (C0O7A) obj2;
                    if (c0o7a instanceof C0O79) {
                        C0O79 c0o79 = (C0O79) c0o7a;
                        FollowStatus followStatus3 = ((C613150O3d) c0o79.LJ).LIZ;
                        C1252380ihA c1252380ihA3 = c1252380ihA2;
                        Integer num = null;
                        User userM307clone3 = null;
                        FollowStatus followStatusCopy = followStatus3.copy(followStatus3.watchStatus, followStatus3.followStatus, followStatus3.contactName, followStatus3.isEnterprise, c1252380ihA3.LIZ, c1252380ihA3.LIZIZ, followStatus3.isFollowSuccess, followStatus3.isFollowChange, followStatus3.followerStatus, followStatus3.followFrom, followStatus3.user, followStatus3.logPb, followStatus3.preStatus, followStatus3.isFromSharerCard);
                        Function2<Boolean, C0XIR, Unit> function22 = function2;
                        if (function22 != null) {
                            function22.invoke(true, null);
                        }
                        C1252430ihF c1252430ihF2 = C1252430ihF.LIZ;
                        C1252380ihA c1252380ihA4 = c1252380ihA2;
                        String str5 = str4;
                        NextLiveData<Pair<RecommendCellInfo, Boolean>> nextLiveData = relationViewVM.LLILLJJLI;
                        int i4 = iLIZIZ;
                        c1252430ihF2.getClass();
                        if (i4 != followStatusCopy.getFollowStatus()) {
                            if (Intrinsics.LJFF(str5, "share_user_info_card")) {
                                EventLiveData<FollowStatus> eventLiveData3 = RelationDataSource.INSTANCE.get();
                                String str6 = c1252380ihA4.LIZ;
                                int followStatus4 = followStatusCopy.getFollowStatus();
                                int i5 = c1252380ihA4.LJIIJJI;
                                User user3 = c1252380ihA4.LJIILL;
                                if (user3 != null) {
                                    userM307clone3 = user3.m307clone();
                                }
                                num = null;
                                eventLiveData3.postValue(new FollowStatus(0, followStatus4, null, 0, str6, null, true, true, Integer.valueOf(i5), c1252380ihA4.LJ, userM307clone3, null, -1, true));
                            } else {
                                EventLiveData<FollowStatus> eventLiveData4 = RelationDataSource.INSTANCE.get();
                                String str7 = c1252380ihA4.LIZ;
                                int followStatus5 = followStatusCopy.getFollowStatus();
                                int i6 = c1252380ihA4.LJIIJJI;
                                User user4 = c1252380ihA4.LJIILL;
                                if (user4 != null) {
                                    userM307clone3 = user4.m307clone();
                                }
                                eventLiveData4.postValue(new FollowStatus(0, followStatus5, null, 0, str7, null, true, true, Integer.valueOf(i6), c1252380ihA4.LJ, userM307clone3, null, -1, false));
                            }
                        }
                        RecommendCellInfo recommendCellInfo = new RecommendCellInfo(c1252380ihA4.LIZ, c1252380ihA4.LJIJI);
                        if (nextLiveData != null) {
                            nextLiveData.postValue(new Pair<>(recommendCellInfo, Boolean.TRUE));
                        }
                        InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
                        User user5 = c1252380ihA4.LJIILL;
                        IMUser.Companion.getClass();
                        imUserService.LJIILJJIL(C2201941BFw.LIZJ(user5));
                        C1252390ihB c1252390ihB = C1252390ihB.LIZ;
                        String userId = followStatusCopy.getUserId();
                        int followStatus6 = followStatusCopy.getFollowStatus();
                        String str8 = "";
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str9 = c1252380ihA4.LJI;
                        if (str9 != null) {
                            str8 = str9;
                        }
                        c1252390ihB.getClass();
                        C1252390ihB.LIZ(followStatus6, userId, str5, str8);
                        int i7 = C2187451AjH.LIZ;
                        C1720106oR.LJI("FollowFunnel", "logicAfterFollowSuccess, follow finish, follow result: success");
                        if (followStatusCopy.getFollowStatus() == 0) {
                            C1595060rbs.LIZIZ.LJIIJ();
                        }
                        String imprId2 = null;
                        IFollowApiEventReporter iFollowApiEventReporter = (IFollowApiEventReporter) PluggableExtentionKt.pluggableSpi$default(IFollowApiEventReporter.class, false, false, false, 14, num);
                        if (iFollowApiEventReporter != null) {
                            Integer numValueOf2 = Integer.valueOf(followStatusCopy.getFollowStatus());
                            long j = c1252380ihA4.LJIIZILJ;
                            String str10 = c1252380ihA4.LJI;
                            LogPbBean logPb2 = followStatusCopy.getLogPb();
                            if (logPb2 != null) {
                                imprId2 = logPb2.getImprId();
                            }
                            iFollowApiEventReporter.LIZ(j, numValueOf2, num, str10, num, imprId2, true);
                        }
                        C1252430ihF.LIZ(c1252380ihA4, followStatusCopy, true);
                        if (C0O7F.LIZJ(c0o79.LIZJ) == EnumC614130O6x.Net) {
                            C1076010e6h.LIZJ.LIZIZ().LJFF().postValue(followStatusCopy);
                        }
                    } else if (c0o7a instanceof C0O7B) {
                        if (!C0O7E.LIZIZ(c0o7a)) {
                            C0O7B c0o7b = (C0O7B) c0o7a;
                            C0XIR c0xirLIZIZ = C0O3Q.LIZIZ(c0o7b.LIZLLL);
                            if (c0xirLIZIZ != null) {
                                rawResponse = c0xirLIZIZ.getRawResponse();
                            } else {
                                rawResponse = null;
                            }
                            if ((rawResponse instanceof FollowStatus) && (followStatus2 = (FollowStatus) rawResponse) != null && (logPb = followStatus2.getLogPb()) != null) {
                                imprId = logPb.getImprId();
                            } else {
                                imprId = null;
                            }
                            Function2<Boolean, C0XIR, Unit> function23 = function2;
                            if (function23 != null) {
                                function23.invoke(false, c0xirLIZIZ);
                            }
                            C1252430ihF c1252430ihF3 = C1252430ihF.LIZ;
                            C1252380ihA c1252380ihA5 = c1252380ihA2;
                            C614090O6t c614090O6t = c0o7b.LIZLLL;
                            NextLiveData<Pair<RecommendCellInfo, Boolean>> nextLiveData2 = relationViewVM.LLILLJJLI;
                            c1252430ihF3.getClass();
                            RecommendCellInfo recommendCellInfo2 = new RecommendCellInfo(c1252380ihA5.LIZ, c1252380ihA5.LJIJI);
                            if (nextLiveData2 != null) {
                                nextLiveData2.postValue(new Pair<>(recommendCellInfo2, Boolean.FALSE));
                            }
                            EventLiveData<FollowStatus> eventLiveData5 = RelationDataSource.INSTANCE.get();
                            String str11 = c1252380ihA5.LIZ;
                            int i8 = c1252380ihA5.LJIIJ;
                            int i9 = c1252380ihA5.LJIIJJI;
                            eventLiveData5.postValue(new FollowStatus(0, i8, null, 0, str11, null, true, true, Integer.valueOf(i9), c1252380ihA5.LJ, c1252380ihA5.LJIILL, null, -1, false));
                            C0XIR c0xirLIZIZ2 = C0O3Q.LIZIZ(c614090O6t);
                            if (c0xirLIZIZ2 != null) {
                                numValueOf = Integer.valueOf(c0xirLIZIZ2.getErrorCode());
                            } else {
                                numValueOf = null;
                            }
                            IFollowApiEventReporter iFollowApiEventReporter2 = (IFollowApiEventReporter) PluggableExtentionKt.pluggableSpi$default(IFollowApiEventReporter.class, false, false, false, 14, null);
                            if (iFollowApiEventReporter2 != null) {
                                iFollowApiEventReporter2.LIZ(c1252380ihA5.LJIIZILJ, Integer.valueOf(c1252380ihA5.LJIIJ), numValueOf, c1252380ihA5.LJI, C0O3Q.LIZJ(c614090O6t), imprId, false);
                            }
                            FollowStatus followStatus7 = new FollowStatus(c1252380ihA5.LIZ, C0SY7.UNFOLLOW.getValue());
                            C0XIR c0xirLIZIZ3 = C0O3Q.LIZIZ(c614090O6t);
                            if (c0xirLIZIZ3 != null) {
                                errorCode = c0xirLIZIZ3.getErrorCode();
                            } else {
                                errorCode = -1;
                            }
                            followStatus7.status_code = errorCode;
                            C1252430ihF.LIZ(c1252380ihA5, followStatus7, false);
                            int i10 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("logicAfterFollowFailed, errorCode ");
                            sbLIZ.append(numValueOf);
                            sbLIZ.append(", errorReason ");
                            sbLIZ.append(C0O3Q.LIZJ(c614090O6t));
                            sbLIZ.append(", followStatus ");
                            sbLIZ.append(c1252380ihA5.LJIIJ);
                            sbLIZ.append(", eventType ");
                            sbLIZ.append(c1252380ihA5.LJI);
                            sbLIZ.append(", logId ");
                            sbLIZ.append(imprId);
                            C1720106oR.LIZ("FollowFunnel", C2188811AlT.LIZIZ(sbLIZ));
                            if (c1252380ihA2.LJIJ) {
                                Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2108208Ns.LIZ, new C598160Nd8(c0o7a, null));
                                if (objLJI == C099R.LJFF()) {
                                    return objLJI;
                                }
                                return Unit.LIZ;
                            }
                        }
                    } else {
                        throw new C1954807lC();
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("RelationViewVM@8ffd.followWithOfflineWrite$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RelationViewVM@8ffd.followWithOfflineWrite$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
