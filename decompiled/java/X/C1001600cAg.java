package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ComponentData;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.LiveProduct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0cAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl$requestLiveCardModelAndStuffData$1", f = "CommercializeLiveServiceImpl.kt", l = {497}, m = "invokeSuspend")
public final class C1001600cAg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AwemeRawAd LL;
    public int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ CommercializeLiveServiceImpl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001600cAg(Aweme aweme, CommercializeLiveServiceImpl commercializeLiveServiceImpl, InterfaceC1364105Vn<? super C1001600cAg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aweme;
        this.LLILZ = commercializeLiveServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001600cAg(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AwemeRawAd awemeRawAd;
        LiveAdCardModel liveAdCardModel;
        int componentType;
        long jLongValue;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Aweme aweme;
        C999700c7c c999700c7cLJJ;
        WeakReference<Context> weakReference;
        Context context;
        Object objLIZ = obj;
        C1C7U.LIZ("CommercializeLiveServiceImpl@6b9c.requestLiveCardModelAndStuffData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "request_fail", this.LLILLL.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("card", "refer");
            c1022820ciuLIZLLL.LIZIZ(String.valueOf(th.getMessage()), "fail_reason");
            c1022820ciuLIZLLL.LJII();
        }
        if (i != 0) {
            if (i == 1) {
                awemeRawAd = this.LL;
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            awemeRawAd = this.LLILLL.getAwemeRawAd();
            if (awemeRawAd != null) {
                LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(this.LLILLL);
                liveAdCardModel = null;
                String liveComponentPayload = null;
                if (newLiveRoomDataExt != null) {
                    CommercializeLiveServiceImpl commercializeLiveServiceImpl = this.LLILZ;
                    Aweme aweme2 = this.LLILLL;
                    String strValueOf = String.valueOf(newLiveRoomDataExt.id);
                    String uid = newLiveRoomDataExt.owner.getUid();
                    String secUid = newLiveRoomDataExt.owner.getSecUid();
                    AwemeRawAd awemeRawAd3 = aweme2.getAwemeRawAd();
                    if (awemeRawAd3 != null) {
                        componentType = awemeRawAd3.getComponentType();
                    } else {
                        componentType = 0;
                    }
                    AwemeRawAd awemeRawAd4 = aweme2.getAwemeRawAd();
                    if (awemeRawAd4 != null && (creativeId = awemeRawAd4.getCreativeId()) != null) {
                        jLongValue = creativeId.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    AwemeRawAd awemeRawAd5 = aweme2.getAwemeRawAd();
                    if (awemeRawAd5 != null) {
                        liveComponentPayload = awemeRawAd5.getLiveComponentPayload();
                    }
                    C0X9S c0x9sLJIIJJI = commercializeLiveServiceImpl.LJIIJJI(componentType, strValueOf, uid, jLongValue, secUid, liveComponentPayload);
                    this.LL = awemeRawAd;
                    this.LLILLJJLI = 1;
                    final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                    c0x9sLJIIJJI.enqueue(new InterfaceC594300NSq<LiveAdCardModel>() { // from class: X.0bs3
                        @Override // X.InterfaceC594300NSq
                        public final void onFailure(C0X9S<LiveAdCardModel> c0x9s, Throwable th2) {
                            InterfaceC1364105Vn<LiveAdCardModel> interfaceC1364105Vn = c23260099m;
                            C098200Yq c098200Yq = new C098200Yq(new Throwable("app_tech_problem"));
                            C189200o6.m2constructorimpl(c098200Yq);
                            interfaceC1364105Vn.resumeWith(c098200Yq);
                        }

                        @Override // X.InterfaceC594300NSq
                        public final void onResponse(C0X9S<LiveAdCardModel> c0x9s, C0X52<LiveAdCardModel> c0x52) {
                            ComponentData componentData;
                            CardStruct cardStruct;
                            if (c0x52.LIZJ() && c0x52.LIZIZ.getComponentData() != null && (componentData = c0x52.LIZIZ.getComponentData()) != null && componentData.cardInfo != null) {
                                String componentFailReason = c0x52.LIZIZ.getComponentFailReason();
                                if (componentFailReason != null) {
                                    InterfaceC1364105Vn<LiveAdCardModel> interfaceC1364105Vn = c23260099m;
                                    C098200Yq c098200Yq = new C098200Yq(new Throwable(componentFailReason));
                                    C189200o6.m2constructorimpl(c098200Yq);
                                    interfaceC1364105Vn.resumeWith(c098200Yq);
                                    return;
                                }
                                LiveProduct liveProductCase = c0x52.LIZIZ.getLiveProductCase();
                                Object frontendExtraData = c0x52.LIZIZ.getFrontendExtraData();
                                if (liveProductCase != null) {
                                    if (liveProductCase.productStatus != 1) {
                                        InterfaceC1364105Vn<LiveAdCardModel> interfaceC1364105Vn2 = c23260099m;
                                        C098200Yq c098200Yq2 = new C098200Yq(new Throwable("sold_out"));
                                        C189200o6.m2constructorimpl(c098200Yq2);
                                        interfaceC1364105Vn2.resumeWith(c098200Yq2);
                                        return;
                                    }
                                } else if (frontendExtraData == null) {
                                    InterfaceC1364105Vn<LiveAdCardModel> interfaceC1364105Vn3 = c23260099m;
                                    C098200Yq c098200Yq3 = new C098200Yq(new Throwable("no_live_product"));
                                    C189200o6.m2constructorimpl(c098200Yq3);
                                    interfaceC1364105Vn3.resumeWith(c098200Yq3);
                                    return;
                                }
                                ComponentData componentData2 = c0x52.LIZIZ.getComponentData();
                                if (componentData2 != null && (cardStruct = componentData2.cardInfo) != null && Intrinsics.LJFF(cardStruct.getOnlyTrackEventNotShow(), Boolean.TRUE)) {
                                    InterfaceC1364105Vn<LiveAdCardModel> interfaceC1364105Vn4 = c23260099m;
                                    C098200Yq c098200Yq4 = new C098200Yq(new Throwable("only_track"));
                                    C189200o6.m2constructorimpl(c098200Yq4);
                                    interfaceC1364105Vn4.resumeWith(c098200Yq4);
                                    return;
                                }
                                InterfaceC1364105Vn<LiveAdCardModel> interfaceC1364105Vn5 = c23260099m;
                                LiveAdCardModel liveAdCardModel2 = c0x52.LIZIZ;
                                C189200o6.m2constructorimpl(liveAdCardModel2);
                                interfaceC1364105Vn5.resumeWith(liveAdCardModel2);
                                return;
                            }
                            InterfaceC1364105Vn<LiveAdCardModel> interfaceC1364105Vn6 = c23260099m;
                            C098200Yq c098200Yq5 = new C098200Yq(new Throwable("no_live_product"));
                            C189200o6.m2constructorimpl(c098200Yq5);
                            interfaceC1364105Vn6.resumeWith(c098200Yq5);
                        }
                    });
                    objLIZ = c23260099m.LIZ();
                    if (objLIZ == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                    if (objLIZ == objLJFF) {
                        C1C7U.LIZIZ("CommercializeLiveServiceImpl@6b9c.requestLiveCardModelAndStuffData$1");
                        return objLJFF;
                    }
                }
                awemeRawAd.setLiveAdCardModel(liveAdCardModel);
            }
            awemeRawAd2 = this.LLILLL.getAwemeRawAd();
            if (awemeRawAd2 != null && awemeRawAd2.getLiveAdCardModel() != null) {
                aweme = this.LLILLL;
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "request_success", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL2.LIZJ("card", "refer");
                c1022820ciuLIZLLL2.LJII();
                c999700c7cLJJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJ();
                c999700c7cLJJ.getClass();
                weakReference = C999700c7c.LIZJ;
                if (weakReference != null && (context = weakReference.get()) != null) {
                    c999700c7cLJJ.LJIILL(context, aweme);
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CommercializeLiveServiceImpl@6b9c.requestLiveCardModelAndStuffData$1");
            return unit;
        }
        liveAdCardModel = (LiveAdCardModel) objLIZ;
        awemeRawAd.setLiveAdCardModel(liveAdCardModel);
        awemeRawAd2 = this.LLILLL.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            aweme = this.LLILLL;
            C1022820ciu c1022820ciuLIZLLL22 = C2184171Adz.LIZLLL("draw_ad", "request_success", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL22.LIZJ("card", "refer");
            c1022820ciuLIZLLL22.LJII();
            c999700c7cLJJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJ();
            c999700c7cLJJ.getClass();
            weakReference = C999700c7c.LIZJ;
            if (weakReference != null) {
                c999700c7cLJJ.LJIILL(context, aweme);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommercializeLiveServiceImpl@6b9c.requestLiveCardModelAndStuffData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
