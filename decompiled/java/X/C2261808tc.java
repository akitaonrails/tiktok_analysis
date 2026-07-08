package X;

import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionTask$preFeatureExtraction$1", f = "MixEditingFeatureExtractionTask.kt", l = {}, m = "invokeSuspend")
public final class C2261808tc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Set<String> LLILLJJLI;
    public final /* synthetic */ C2277408w8 LLILLL;
    public final /* synthetic */ InterfaceC1337805Lk LLILZ;
    public final /* synthetic */ InterfaceC1337805Lk LLILZIL;
    public final /* synthetic */ C2263508tt LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261808tc(Set<String> set, C2277408w8 c2277408w8, InterfaceC1337805Lk interfaceC1337805Lk, InterfaceC1337805Lk interfaceC1337805Lk2, C2263508tt c2263508tt, InterfaceC1364105Vn<? super C2261808tc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = set;
        this.LLILLL = c2277408w8;
        this.LLILZ = interfaceC1337805Lk;
        this.LLILZIL = interfaceC1337805Lk2;
        this.LLILZLL = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2261808tc c2261808tc = new C2261808tc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c2261808tc.LL = obj;
        return c2261808tc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixEditingFeatureExtractionTask@c1fc.preFeatureExtraction$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        Set<String> set = this.LLILLJJLI;
        C2277408w8 c2277408w8 = this.LLILLL;
        InterfaceC1337805Lk interfaceC1337805Lk = this.LLILZ;
        InterfaceC1337805Lk interfaceC1337805Lk2 = this.LLILZIL;
        C2263508tt c2263508tt = this.LLILZLL;
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            c2277408w8.LIZLLL(interfaceC497601wk, (String) it2.next(), interfaceC1337805Lk, interfaceC1337805Lk2, c2263508tt);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixEditingFeatureExtractionTask@c1fc.preFeatureExtraction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
