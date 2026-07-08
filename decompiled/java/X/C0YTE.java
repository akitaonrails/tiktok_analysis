package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.api.ext.SendMessageEventListenerAdaptersKt$toBatchSendMessageEventListener$2$4", f = "SendMessageEventListenerAdapters.kt", l = {}, m = "invokeSuspend")
public final class C0YTE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YTK LL;
    public final /* synthetic */ C259800zU<C0Y8T> LLILLJJLI;
    public final /* synthetic */ InterfaceC873750YPl LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YTE(C0YTK c0ytk, C259800zU<C0Y8T> c259800zU, InterfaceC873750YPl interfaceC873750YPl, boolean z, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0YTE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ytk;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = interfaceC873750YPl;
        this.LLILZ = z;
        this.LLILZIL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YTE(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMessageEventListenerAdaptersKt@ae45.toBatchSendMessageEventListener$2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0YTK c0ytk = this.LL;
            if (c0ytk != null) {
                C0Y8T c0y8t = this.LLILLJJLI.element;
                ArrayList arrayList = new ArrayList(((C0YPX) this.LLILLL).LIZ);
                List<C0YQ0> list = ((C0YPX) this.LLILLL).LIZIZ;
                C054G c054g = C0YTP.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
                for (C0YQ0 c0yq0 : list) {
                    C869590Y9l c869590Y9l = c0yq0.LIZIZ;
                    if (c869590Y9l != null) {
                        linkedHashMap.put(c869590Y9l, c0yq0.LIZJ.toIMError());
                    }
                }
                c0ytk.LIZIZ(c0y8t, arrayList, linkedHashMap);
            }
            if (this.LLILZ) {
                C2296808zG.LIZJ(this.LLILZIL, null);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SendMessageEventListenerAdaptersKt@ae45.toBatchSendMessageEventListener$2$4");
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
