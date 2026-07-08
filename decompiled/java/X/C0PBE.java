package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PBE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.utils.SparkLitePreLayoutHelper$preLayout$1", f = "SparkLitePreLayoutHelper.kt", l = {}, m = "invokeSuspend")
public final class C0PBE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<Context> LL;
    public final /* synthetic */ LifecycleCoroutineScope LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ C0PGG LLIZ;
    public final /* synthetic */ C0PGD LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PBE(C259800zU<Context> c259800zU, LifecycleCoroutineScope lifecycleCoroutineScope, Fragment fragment, C259800zU<String> c259800zU2, String str, Map<String, ? extends Object> map, C0PGG c0pgg, C0PGD c0pgd, String str2, InterfaceC1364105Vn<? super C0PBE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = lifecycleCoroutineScope;
        this.LLILLL = fragment;
        this.LLILZ = c259800zU2;
        this.LLILZIL = str;
        this.LLILZLL = map;
        this.LLIZ = c0pgg;
        this.LLIZLLLIL = c0pgd;
        this.LLJ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PBE(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SparkLitePreLayoutHelper@fd49.preLayout$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C647500PaW c647500PaW = C647500PaW.LIZ;
        Context context = this.LL.element;
        LifecycleCoroutineScope lifecycleCoroutineScope = this.LLILLJJLI;
        Fragment fragment = this.LLILLL;
        String str = this.LLILZ.element;
        String str2 = this.LLILZIL;
        Map<String, Object> map = this.LLILZLL;
        C0PGG c0pgg = this.LLIZ;
        C0PGD c0pgd = this.LLIZLLLIL;
        String str3 = this.LLJ;
        c647500PaW.getClass();
        C647500PaW.LJJII(context, lifecycleCoroutineScope, fragment, str, str2, map, c0pgg, c0pgd, str3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SparkLitePreLayoutHelper@fd49.preLayout$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
