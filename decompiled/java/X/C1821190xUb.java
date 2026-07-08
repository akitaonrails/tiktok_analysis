package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBSetupInfoResponse;

/* JADX INFO: renamed from: X.0xUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821190xUb extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C1821180xUa LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C09AJ<C470590Icr<SMBSetupInfoResponse.ResponseData>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821190xUb(C1821180xUa c1821180xUa, String str, C19482611Ke c19482611Ke) {
        super(1);
        this.LL = c1821180xUa;
        this.LLILLJJLI = str;
        this.LLILLL = c19482611Ke;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C1821180xUa c1821180xUa = this.LL;
        C11NZ<C470590Icr<SMBSetupInfoResponse.ResponseData>> sMBOneStopSetupState = c1821180xUa.LL.LL.getSMBOneStopSetupState(this.LLILLJJLI, true);
        final C09AJ<C470590Icr<SMBSetupInfoResponse.ResponseData>> c09aj = this.LLILLL;
        this.LLILLL.setDisposable(sMBOneStopSetupState.LJJLL(new C09JN() { // from class: X.0Cca
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("OneStopPageRepo@3def.operator$1$createCacheObservable$1$2$disposable$1");
                c09aj.onNext(obj);
                c09aj.onComplete();
                C1C7U.LIZIZ("OneStopPageRepo@3def.operator$1$createCacheObservable$1$2$disposable$1");
            }
        }, new C09JN() { // from class: X.0CdL
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("OneStopPageRepo@3def.operator$1$createCacheObservable$1$2$disposable$2");
                c09aj.onError((Throwable) obj);
                C1C7U.LIZIZ("OneStopPageRepo@3def.operator$1$createCacheObservable$1$2$disposable$2");
            }
        }));
        return Unit.LIZ;
    }
}
