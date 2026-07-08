package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.SmartCoverExtractor$loadCover$2", f = "SmartCoverExtractor.kt", l = {148}, m = "invokeSuspend")
public final class C1219810hqd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<InterfaceC1452170ntP> LLILLJJLI;
    public final /* synthetic */ C1457050o1H LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ LifecycleOwner LLILZLL;
    public final /* synthetic */ InterfaceC1457170o1T LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219810hqd(C259800zU<InterfaceC1452170ntP> c259800zU, C1457050o1H c1457050o1H, String str, Context context, LifecycleOwner lifecycleOwner, InterfaceC1457170o1T interfaceC1457170o1T, InterfaceC1364105Vn<? super C1219810hqd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c1457050o1H;
        this.LLILZ = str;
        this.LLILZIL = context;
        this.LLILZLL = lifecycleOwner;
        this.LLIZ = interfaceC1457170o1T;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219810hqd(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartCoverExtractor@7b55.loadCover$2");
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
            C1457100o1M c1457100o1M = C1457100o1M.LIZ;
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLILLJJLI.element;
            C1457050o1H c1457050o1H = this.LLILLL;
            String str = this.LLILZ;
            Context context = this.LLILZIL;
            LifecycleOwner lifecycleOwner = this.LLILZLL;
            InterfaceC1457170o1T interfaceC1457170o1T = this.LLIZ;
            this.LL = 1;
            if (c1457100o1M.LJ(interfaceC1452170ntP, c1457050o1H, str, context, lifecycleOwner, interfaceC1457170o1T, this) == objLJFF) {
                C1C7U.LIZIZ("SmartCoverExtractor@7b55.loadCover$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartCoverExtractor@7b55.loadCover$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
