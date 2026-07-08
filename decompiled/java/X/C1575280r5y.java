package X;

import android.util.Base64;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteParam;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import okio.ByteString;

/* JADX INFO: renamed from: X.0r5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel$inviteUser$1", f = "VibeFeedEntranceViewModel.kt", l = {243}, m = "invokeSuspend")
public final class C1575280r5y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VibeFeedInviteParam LLILLL;
    public final /* synthetic */ VibeFeedEntranceViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1575280r5y(VibeFeedInviteParam vibeFeedInviteParam, VibeFeedEntranceViewModel vibeFeedEntranceViewModel, String str, Function1<? super Integer, Unit> function1, InterfaceC1364105Vn<? super C1575280r5y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = vibeFeedInviteParam;
        this.LLILZ = vibeFeedEntranceViewModel;
        this.LLILZIL = str;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1575280r5y c1575280r5y = new C1575280r5y(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1575280r5y.LLILLJJLI = obj;
        return c1575280r5y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final String conversationId;
        Throwable th;
        Object c098200Yq;
        boolean z;
        Long l;
        Long l2;
        String str;
        boolean z2;
        String str2;
        Object objLLLLLLIL = obj;
        C1C7U.LIZ("VibeFeedEntranceViewModel@aaa3.inviteUser$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                conversationId = (String) this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(objLLLLLLIL);
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLLLLLLIL);
            conversationId = this.LLILLL.getConversationId();
            VibeFeedEntranceViewModel vibeFeedEntranceViewModel = this.LLILZ;
            String str3 = this.LLILZIL;
            VibeFeedInviteParam vibeFeedInviteParam = this.LLILLL;
            try {
                InterfaceC629290OmF interfaceC629290OmF = (InterfaceC629290OmF) vibeFeedEntranceViewModel.LLILZIL.getValue().getOperator();
                String toUserId = vibeFeedInviteParam.getToUserId();
                EnumC912680ZrG enumC912680ZrG = vibeFeedEntranceViewModel.LLJIJIL;
                this.LLILLJJLI = conversationId;
                this.LL = 1;
                objLLLLLLIL = interfaceC629290OmF.LLLLLLIL(str3, toUserId, conversationId, enumC912680ZrG, this);
                if (objLLLLLLIL == objLJFF) {
                    C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.inviteUser$1");
                    return objLJFF;
                }
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = (VibeFeedInviteResponse) objLLLLLLIL;
        C189200o6.m2constructorimpl(c098200Yq);
        final VibeFeedInviteParam vibeFeedInviteParam2 = this.LLILLL;
        Function1<Integer, Unit> function1 = this.LLILZLL;
        VibeFeedEntranceViewModel vibeFeedEntranceViewModel2 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            VibeFeedInviteResponse vibeFeedInviteResponse = (VibeFeedInviteResponse) c098200Yq;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get sendInvite success response:");
            sbLIZ.append(vibeFeedInviteResponse);
            C2188811AlT.LIZIZ(sbLIZ);
            if (C1575980r76.LIZJ(vibeFeedInviteResponse)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (vibeFeedInviteResponse != null) {
                    l = vibeFeedInviteResponse.inviteTimeStamp;
                } else {
                    l = null;
                }
                C1575210r5r c1575210r5r = C1575210r5r.LLILLJJLI;
                String conversationId2 = vibeFeedInviteParam2.getConversationId();
                c1575210r5r.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                ConcurrentHashMap<String, EnumC1575230r5t> concurrentHashMap = C1575210r5r.LLILLL;
                EnumC1575230r5t enumC1575230r5t = EnumC1575230r5t.INVITE;
                concurrentHashMap.put(conversationId2, enumC1575230r5t);
                long jLongValue = 0;
                if (l == null) {
                    l2 = 0L;
                } else {
                    l2 = l;
                }
                C1575210r5r.LLILZ = l2;
                C1575210r5r.LLILZIL = Long.valueOf(jCurrentTimeMillis);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateFromInvite, vibeFeedState:");
                sbLIZ2.append(concurrentHashMap);
                sbLIZ2.append(" inviteTime: ");
                sbLIZ2.append(l);
                C299700Bou.LIZIZ("VibeFeedStateController", C2188811AlT.LIZIZ(sbLIZ2));
                c1575210r5r.LJFF(enumC1575230r5t, conversationId2);
                String strLIZ = C1575440r6E.LIZ();
                if (strLIZ == null) {
                    strLIZ = "";
                }
                Keva kevaLIZLLL = C1575210r5r.LIZLLL(strLIZ);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("invite_send_timestamp_");
                sbLIZ3.append(conversationId2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                kevaLIZLLL.storeLong(strLIZIZ, jLongValue);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("invite_send_timestamp_local_");
                sbLIZ4.append(conversationId2);
                kevaLIZLLL.storeLong(C2188811AlT.LIZIZ(sbLIZ4), jCurrentTimeMillis);
                if (vibeFeedInviteResponse != null) {
                    str = vibeFeedInviteResponse.inviteCardContentPB;
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (function1 != null) {
                        function1.invoke(C2286608xc.LJ(1));
                    }
                } else {
                    BaseTemplate baseTemplateLIZLLL = C2241931Cox.LIZLLL(C1496910p3Z.LIZJ(ByteString.Companion, Base64.decode(str, 0)), DynamicCardTemplate.class);
                    if (baseTemplateLIZLLL == null) {
                        if (function1 != null) {
                            function1.invoke(C2286608xc.LJ(1));
                        }
                    } else {
                        if (function1 != null) {
                            function1.invoke(C2286608xc.LJ(0));
                        }
                        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
                        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
                        c874730YTfLIZ.LIZIZ.LJIILIIL = C2097608Jq.LJIIJ(new Pair("enter_type", vibeFeedInviteParam2.getEntranceType()), new Pair("enter_method", vibeFeedInviteParam2.getEntranceType()), new Pair("enter_from", "chat"), new Pair("panel_source", "shared_feed_invite_panel"));
                        if (vibeFeedEntranceViewModel2.LLJIJIL.isGroup()) {
                            str2 = "ci_share_feed_group_invitation";
                        } else {
                            str2 = "PRM_ci_share_feed_invitation";
                        }
                        c874730YTfLIZ.LIZIZ.LJIIL = str2;
                        c874730YTfLIZ.LIZJ(baseTemplateLIZLLL);
                        c874730YTfLIZ.LIZIZ.LJFF = conversationId;
                        c874730YTfLIZ.LJFF(new C0YTK() { // from class: X.0r60
                            @Override // X.C0YTK
                            public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
                            }

                            @Override // X.C0YTY
                            public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
                            }

                            @Override // X.C0YTY
                            public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                            }

                            @Override // X.C0YTK
                            public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                                String str4;
                                String str5 = conversationId;
                                if (str5 != null) {
                                    VibeFeedInviteParam vibeFeedInviteParam3 = vibeFeedInviteParam2;
                                    C1575290r5z c1575290r5z = C1575290r5z.LIZ;
                                    int i2 = C1575310r61.LIZ[vibeFeedInviteParam3.getPanelType().ordinal()];
                                    if (i2 != 1) {
                                        if (i2 != 2) {
                                            str4 = "";
                                        } else {
                                            str4 = "resend_invite";
                                        }
                                    } else {
                                        str4 = "send_invite";
                                    }
                                    EnumC912680ZrG mutualFeedScene = vibeFeedInviteParam3.getMutualFeedScene();
                                    c1575290r5z.getClass();
                                    C1575290r5z.LIZJ(str5, str4, mutualFeedScene);
                                }
                            }

                            @Override // X.C0YTK
                            public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                            }

                            @Override // X.C0YTK
                            public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                            }
                        });
                    }
                }
            }
        }
        Function1<Integer, Unit> function12 = this.LLILZLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C299700Bou.LIZ("VibeFeedEntranceViewModel", "get item_list error");
            if (thM5exceptionOrNullimpl instanceof C0XIR) {
                if (function12 != null) {
                    function12.invoke(C2286608xc.LJ(((C23112093u) thM5exceptionOrNullimpl).getErrorCode()));
                }
            } else if (function12 != null) {
                function12.invoke(C2286608xc.LJ(-1));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.inviteUser$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
