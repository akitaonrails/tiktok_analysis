package X;

import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.ss.android.ugc.aweme.live.liveevent.anchor.LiveEventCtaAnchorProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.liveevent.anchor.LiveEventCtaAnchorProvider$provideCustomEvents$2$1$invoke$3$succeed$1", f = "LiveEventCtaAnchorProvider.kt", l = {130, 132}, m = "invokeSuspend")
public final class C468920IaA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ LiveEventCtaAnchorProvider LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468920IaA(boolean z, LiveEventCtaAnchorProvider liveEventCtaAnchorProvider, String str, InterfaceC1364105Vn<? super C468920IaA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = liveEventCtaAnchorProvider;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C468920IaA(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$3$succeed$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                ILiveEventService iLiveEventService = (ILiveEventService) this.LLILLL.LL.getValue();
                String str = this.LLILZ;
                this.LL = 1;
                obj = iLiveEventService.NH2(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$3$succeed$1");
                    return objLJFF;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                ILiveEventService iLiveEventService2 = (ILiveEventService) this.LLILLL.LL.getValue();
                String str2 = this.LLILZ;
                this.LL = 2;
                obj = iLiveEventService2.ZC2(str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$3$succeed$1");
                    return objLJFF;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$3$succeed$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
