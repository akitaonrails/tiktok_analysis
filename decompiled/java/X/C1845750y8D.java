package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0y8D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel$updateRssLink$1$2", f = "RssLinkViewModel.kt", l = {86}, m = "invokeSuspend")
public final class C1845750y8D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RssLinkViewModel LLILLL;
    public final /* synthetic */ C1845670y85 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845750y8D(RssLinkViewModel rssLinkViewModel, C1845670y85 c1845670y85, InterfaceC1364105Vn<? super C1845750y8D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = rssLinkViewModel;
        this.LLILZ = c1845670y85;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1845750y8D c1845750y8D = new C1845750y8D(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1845750y8D.LLILLJJLI = obj;
        return c1845750y8D;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        EnumC1779050wOd enumC1779050wOd;
        boolean z;
        C1C7U.LIZ("RssLinkViewModel@2a7c.updateRssLink$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                RssLinkViewModel rssLinkViewModel = this.LLILLL;
                C1845670y85 c1845670y85 = this.LLILZ;
                InterfaceC1165170gQV interfaceC1165170gQV = rssLinkViewModel.LLILLJJLI;
                String str = c1845670y85.LL;
                this.LL = 1;
                obj = interfaceC1165170gQV.LIZ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RssLinkViewModel@2a7c.updateRssLink$1$2");
                    return objLJFF;
                }
            }
            c098200Yq = (C1166120gS2) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        RssLinkViewModel rssLinkViewModel2 = this.LLILLL;
        C1845670y85 c1845670y852 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C1166120gS2 c1166120gS2 = (C1166120gS2) c098200Yq;
            Integer num = c1166120gS2.LIZIZ;
            if (num != null && num.intValue() == 0) {
                rssLinkViewModel2.getClass();
                C291001Au<EnumC1779050wOd> c291001Au = c1845670y852.LLILLL;
                if (c291001Au == null || (enumC1779050wOd = c291001Au.LIZ) == null) {
                    enumC1779050wOd = EnumC1779050wOd.NEW;
                }
                int i2 = C1779060wOe.LIZ[enumC1779050wOd.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        String str2 = c1166120gS2.LIZ;
                        if (str2 != null && str2.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            rssLinkViewModel2.setState(AFwS269S0000000_27.get$arr$(356));
                            rssLinkViewModel2.withState(new AwS393S0200000_27(rssLinkViewModel2, EnumC1845770y8F.UNLINK, 73));
                        } else {
                            rssLinkViewModel2.setState(AFwS269S0000000_27.get$arr$(357));
                            RssLinkViewModel.wQ2(rssLinkViewModel2, 1, null, 2);
                            rssLinkViewModel2.withState(new AwS393S0200000_27(rssLinkViewModel2, EnumC1845770y8F.DONE, 73));
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    rssLinkViewModel2.setState(AFwS269S0000000_27.get$arr$(355));
                    RssLinkViewModel.wQ2(rssLinkViewModel2, 1, null, 2);
                    rssLinkViewModel2.withState(new AwS393S0200000_27(rssLinkViewModel2, EnumC1845770y8F.DONE, 73));
                }
            } else {
                rssLinkViewModel2.vQ2(c1166120gS2);
            }
        }
        RssLinkViewModel rssLinkViewModel3 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C1164860gQ0) {
                rssLinkViewModel3.setState(new AwS606S0100000_27(thM5exceptionOrNullimpl, 332));
            } else {
                C2344809Gs.LJI(thM5exceptionOrNullimpl);
                rssLinkViewModel3.vQ2(null);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RssLinkViewModel@2a7c.updateRssLink$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
