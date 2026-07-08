package X;

import android.app.Activity;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Azp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.MinisRechargeBeanTask$webpayPayment$1", f = "MinisRechargeBeanTask.kt", l = {918}, m = "invokeSuspend")
public final class C2197711Azp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1791930wjP LL;
    public int LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ HashMap<String, Object> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C2197471AzR LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197711Azp(Activity activity, HashMap<String, Object> map, String str, C2197471AzR c2197471AzR, Function0<Unit> function0, String str2, InterfaceC1364105Vn<? super C2197711Azp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = activity;
        this.LLILZ = map;
        this.LLILZIL = str;
        this.LLILZLL = c2197471AzR;
        this.LLIZ = function0;
        this.LLIZLLLIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2197711Azp(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2197711Azp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
