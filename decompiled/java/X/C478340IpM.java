package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.LiveTab;
import webcast.api.feed.LiveTabMG;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM$requestTopModuleInternal$1$onSuccess$1", f = "MultiTopLiveInteractModuleVM.kt", l = {202}, m = "invokeSuspend")
public final class C478340IpM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaseListResponse<FeedItem, FeedExtra> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZLL;
    public final /* synthetic */ EnumC479370Ir1 LLIZ;
    public final /* synthetic */ Function1<TabMGTopLive, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C478340IpM(BaseListResponse<FeedItem, FeedExtra> baseListResponse, String str, long j, Function1<? super Throwable, Unit> function1, EnumC479370Ir1 enumC479370Ir1, Function1<? super TabMGTopLive, Unit> function12, InterfaceC1364105Vn<? super C478340IpM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baseListResponse;
        this.LLILZ = str;
        this.LLILZIL = j;
        this.LLILZLL = function1;
        this.LLIZ = enumC479370Ir1;
        this.LLIZLLLIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C478340IpM c478340IpM = new C478340IpM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c478340IpM.LLILLJJLI = obj;
        return c478340IpM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<LiveTab> list;
        List<MGModuleInteraction> list2;
        boolean z;
        LiveTab next;
        boolean z2;
        C1C7U.LIZ("MultiTopLiveInteractModuleVM@63ef.requestTopModuleInternal$1$onSuccess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = "";
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                BaseListResponse<FeedItem, FeedExtra> baseListResponse = this.LLILLL;
                FeedExtra feedExtra = (FeedExtra) baseListResponse.extra;
                if (feedExtra != null && (list = feedExtra.tabs) != null) {
                    Iterator<LiveTab> it2 = list.iterator();
                    while (true) {
                        list2 = null;
                        z = false;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.type == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    LiveTab liveTab = next;
                    if (liveTab != null) {
                        LiveTabMG liveTabMG = (LiveTabMG) C19748512Ol.LIZJ.LJII(liveTab.content, LiveTabMG.class);
                        if (liveTabMG != null && liveTabMG.contentType == 2) {
                            z = true;
                        }
                        if (z) {
                            TabMGTopLive tabMGTopLive = liveTabMG.topLive;
                            if (tabMGTopLive != null) {
                                list2 = tabMGTopLive.interactionModule;
                            }
                            String str2 = this.LLILZ;
                            C477500Io0 c477500Io0 = C477500Io0.LIZ;
                            long j = this.LLILZIL;
                            c477500Io0.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - j;
                            String str3 = this.LLILLL.LIZLLL;
                            if (str3 == null) {
                                str3 = "";
                            }
                            C477860Ioa.LJIIL(new C477910Iof(96, jCurrentTimeMillis, str2, "MultiTopLiveInteractModuleVM # requestTopModuleInternal, onSuccess", "success", str3, (String) null));
                            C1DFH c1dfh = C0PEM.LIZ;
                            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                            C478350IpN c478350IpN = new C478350IpN(list2, liveTabMG, this.LLIZLLLIL, this.LLIZ, null);
                            this.LL = 1;
                            if (C23250099c.LJI(this, abstractC2238408pq, c478350IpN) == objLJFF) {
                                C1C7U.LIZIZ("MultiTopLiveInteractModuleVM@63ef.requestTopModuleInternal$1$onSuccess$1");
                                return objLJFF;
                            }
                        }
                    } else {
                        String str4 = this.LLILZ;
                        C477500Io0 c477500Io02 = C477500Io0.LIZ;
                        long j2 = this.LLILZIL;
                        c477500Io02.getClass();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - j2;
                        String str5 = this.LLILLL.LIZLLL;
                        if (str5 != null) {
                            str = str5;
                        }
                        C477860Ioa.LJIIL(new C477910Iof(32, jCurrentTimeMillis2, str4, "MultiTopLiveInteractModuleVM # requestTopModuleInternal, onSuccess but mgTab == true", "empty", str, "mgTab == true"));
                    }
                } else {
                    EnumC479370Ir1 enumC479370Ir1 = this.LLIZ;
                    String str6 = this.LLILZ;
                    long j3 = this.LLILZIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MultiTopLiveTopModuleVM request top_module data is null. scene: ");
                    sbLIZ.append(enumC479370Ir1);
                    C20441214yg.LJ("MultiTopLiveTopModuleVM", C2188811AlT.LIZIZ(sbLIZ));
                    C477500Io0.LIZ.getClass();
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - j3;
                    String str7 = baseListResponse.LIZLLL;
                    if (str7 != null) {
                        str = str7;
                    }
                    C477860Ioa.LJIIL(new C477910Iof(32, jCurrentTimeMillis3, str6, "MultiTopLiveInteractModuleVM # requestTopModuleInternal, onSuccess but response.extra?.tabs == null", "empty", str, "response.extra?.tabs == null"));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MultiTopLiveInteractModuleVM@63ef.requestTopModuleInternal$1$onSuccess$1");
                    return unit;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZLL.invoke(th);
            String str8 = this.LLILZ;
            C477500Io0 c477500Io03 = C477500Io0.LIZ;
            long j4 = this.LLILZIL;
            c477500Io03.getClass();
            long jCurrentTimeMillis4 = System.currentTimeMillis() - j4;
            String str9 = this.LLILLL.LIZLLL;
            if (str9 != null) {
                str = str9;
            }
            C477860Ioa.LJIIL(new C477910Iof(32, jCurrentTimeMillis4, str8, "MultiTopLiveInteractModuleVM # requestTopModuleInternal, onSuccess but catch error", "error", str, th.getMessage()));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MultiTopLiveTopModuleVM scene: ");
            sbLIZ2.append(this.LLIZ);
            sbLIZ2.append(", Parse skylight data failed:");
            C20441214yg.LJFF("MultiTopLiveTopModuleVM", C2188811AlT.LIZIZ(sbLIZ2), th);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLiveInteractModuleVM@63ef.requestTopModuleInternal$1$onSuccess$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
