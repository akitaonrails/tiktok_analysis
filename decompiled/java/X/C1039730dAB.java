package X;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recording.js.RecordingJsHandler$onPageStart$1", f = "RecordingJsHandler.kt", l = {118, 125}, m = "invokeSuspend")
public final class C1039730dAB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1035880d3y LLILLJJLI;
    public final /* synthetic */ WebView LLILLL;
    public final /* synthetic */ InterfaceC497601wk LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039730dAB(WebView webView, C1035880d3y c1035880d3y, String str, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC497601wk interfaceC497601wk) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1035880d3y;
        this.LLILLL = webView;
        this.LLILZ = interfaceC497601wk;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1035880d3y c1035880d3y = this.LLILLJJLI;
        return new C1039730dAB(this.LLILLL, c1035880d3y, this.LLILZIL, interfaceC1364105Vn, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordingJsHandler@c4f4.onPageStart$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RecordingJsHandler@c4f4.onPageStart$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1042450dEZ.LIZ.getClass();
            long j = C1042260dEG.LIZ().jsInjectTimeFallback;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("RecordingJsHandler@c4f4.onPageStart$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.getRecordingModel().isInjectJs().get()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RecordingJsHandler@c4f4.onPageStart$1");
            return unit2;
        }
        this.LLILLJJLI.getRecordingModel().isInjectJs().set(true);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1039750dAD c1039750dAD = new C1039750dAD(this.LLILLL, this.LLILLJJLI, this.LLILZIL, null, this.LLILZ);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1039750dAD) == objLJFF) {
            C1C7U.LIZIZ("RecordingJsHandler@c4f4.onPageStart$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("RecordingJsHandler@c4f4.onPageStart$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
