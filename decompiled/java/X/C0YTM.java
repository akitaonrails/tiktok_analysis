package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.api.ext.SendMessageEventListenerAdaptersKt$toSendMessageEventListener$2$3", f = "SendMessageEventListenerAdapters.kt", l = {}, m = "invokeSuspend")
public final class C0YTM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC873750YPl LL;
    public final /* synthetic */ C0YTK LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YTM(C0YTK c0ytk, InterfaceC873750YPl interfaceC873750YPl, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC497601wk interfaceC497601wk, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC873750YPl;
        this.LLILLJJLI = c0ytk;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        InterfaceC873750YPl interfaceC873750YPl = this.LL;
        return new C0YTM(this.LLILLJJLI, interfaceC873750YPl, interfaceC1364105Vn, this.LLILZIL, this.LLILLL, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<C869590Y9l, C0YMW> linkedHashMap;
        C1C7U.LIZ("SendMessageEventListenerAdaptersKt@ae45.toSendMessageEventListener$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0YMW iMError = ((C0YQ0) this.LL).LIZJ.toIMError();
            C0YTK c0ytk = this.LLILLJJLI;
            if (c0ytk != null) {
                InterfaceC873750YPl interfaceC873750YPl = this.LL;
                c0ytk.LJII(((C0YQ0) interfaceC873750YPl).LIZ, ((C0YQ0) interfaceC873750YPl).LIZIZ, iMError);
            }
            if (this.LLILLL) {
                C869590Y9l c869590Y9l = ((C0YQ0) this.LL).LIZIZ;
                if (c869590Y9l != null) {
                    linkedHashMap = C2097608Jq.LJIIJ(new Pair(c869590Y9l, iMError));
                } else {
                    linkedHashMap = new LinkedHashMap<>();
                }
                C0YTK c0ytk2 = this.LLILLJJLI;
                if (c0ytk2 != null) {
                    c0ytk2.LIZIZ(((C0YQ0) this.LL).LIZ, new ArrayList(), linkedHashMap);
                }
            }
            if (this.LLILZ) {
                C2296808zG.LIZJ(this.LLILZIL, null);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SendMessageEventListenerAdaptersKt@ae45.toSendMessageEventListener$2$3");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLILZ) {
                C2296808zG.LIZJ(this.LLILZIL, null);
            }
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
