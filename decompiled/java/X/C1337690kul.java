package X;

import androidx.activity.ComponentActivity;
import com.ss.android.ugc.aweme.tako.aivideo.detail.alphaplayer.TakoAlphaPlayerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.alphaplayer.TakoAlphaPlayerAssem$onCreate$1", f = "TakoAlphaPlayerAssem.kt", l = {68, 70, 78}, m = "invokeSuspend")
public final class C1337690kul extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ TakoAlphaPlayerAssem LLILZIL;
    public final /* synthetic */ ComponentActivity LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337690kul(boolean z, TakoAlphaPlayerAssem takoAlphaPlayerAssem, ComponentActivity componentActivity, InterfaceC1364105Vn<? super C1337690kul> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = z;
        this.LLILZIL = takoAlphaPlayerAssem;
        this.LLILZLL = componentActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1337690kul c1337690kul = new C1337690kul(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1337690kul.LLILLL = obj;
        return c1337690kul;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.0kuo] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1337690kul.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
