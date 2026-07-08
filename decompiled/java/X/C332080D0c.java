package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0D0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpPreloadManager$scheduleRecommendationPreload$1", f = "PdpPreloadManager.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "invokeSuspend")
public final class C332080D0c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0D2Y LLILLJJLI;
    public final /* synthetic */ C0D3K LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332080D0c(C0D2Y c0d2y, C0D3K c0d3k, InterfaceC1364105Vn<? super C332080D0c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d2y;
        this.LLILLL = c0d3k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332080D0c(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC332980D3o value;
        AbstractC332980D3o abstractC332980D3oLIZ;
        AbstractC332980D3o value2;
        AbstractC332980D3o abstractC332980D3oLIZIZ;
        AbstractC332980D3o value3;
        AbstractC332980D3o abstractC332980D3oLIZIZ2;
        C1C7U.LIZ("PdpPreloadManager@1b72.scheduleRecommendationPreload$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("PdpPreloadManager@1b72.scheduleRecommendationPreload$1");
                return objLJFF;
            }
        }
        C0D2Y c0d2y = this.LLILLJJLI;
        C0D3K c0d3k = this.LLILLL;
        c0d2y.getClass();
        if (Intrinsics.LJFF(C332170D0l.LIZIZ(), "waterfall_empty")) {
            InterfaceC332260D0u<AbstractC332980D3o> interfaceC332260D0u = c0d2y.LIZJ;
            do {
                value3 = interfaceC332260D0u.getValue();
                abstractC332980D3oLIZIZ2 = value3;
                if (abstractC332980D3oLIZIZ2 instanceof C0D21) {
                    abstractC332980D3oLIZIZ2 = C0D20.LIZIZ((C0D21) abstractC332980D3oLIZIZ2, C332110D0f.INSTANCE);
                }
            } while (!interfaceC332260D0u.compareAndSet(value3, abstractC332980D3oLIZIZ2));
        } else if (Intrinsics.LJFF(C332170D0l.LIZIZ(), "waterfall_failed")) {
            InterfaceC332260D0u<AbstractC332980D3o> interfaceC332260D0u2 = c0d2y.LIZJ;
            do {
                value2 = interfaceC332260D0u2.getValue();
                abstractC332980D3oLIZIZ = value2;
                if (abstractC332980D3oLIZIZ instanceof C0D21) {
                    abstractC332980D3oLIZIZ = C0D20.LIZIZ((C0D21) abstractC332980D3oLIZIZ, new C332100D0e("Failed to load products"));
                }
            } while (!interfaceC332260D0u2.compareAndSet(value2, abstractC332980D3oLIZIZ));
        } else if (Intrinsics.LJFF(C332170D0l.LIZIZ(), "loading")) {
            InterfaceC332260D0u<AbstractC332980D3o> interfaceC332260D0u3 = c0d2y.LIZJ;
            do {
                value = interfaceC332260D0u3.getValue();
                abstractC332980D3oLIZ = value;
                if (abstractC332980D3oLIZ instanceof C0D21) {
                    abstractC332980D3oLIZ = C0D20.LIZ((C0D21) abstractC332980D3oLIZ);
                }
            } while (!interfaceC332260D0u3.compareAndSet(value, abstractC332980D3oLIZ));
        } else {
            C0D27<List<UcpRecommendationItem>> c0d27 = new C0D27<>(c0d2y.LIZIZ, new C0D0Y(c0d2y, c0d3k, null), new AwS548S0100000_4(c0d2y, 107), new AwS370S0200000_4(c0d2y, c0d3k, 16), new AwS583S0100000_4(c0d2y, 63), 0, "UcpRecommendFetcher", new AwS405S0200000_4(c0d2y, c0d3k, 17), 12000L, 12000L, false, 2144);
            c0d2y.LJI = c0d27;
            c0d27.LIZIZ(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpPreloadManager@1b72.scheduleRecommendationPreload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
