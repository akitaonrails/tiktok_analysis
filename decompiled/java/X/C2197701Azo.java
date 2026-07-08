package X;

import android.app.Activity;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Azo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.subscription.flow.MinisSubscriptionBaseTask$webpayPayment$1", f = "MinisSubscriptionBaseTask.kt", l = {1586}, m = "invokeSuspend")
public final class C2197701Azo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1791930wjP LL;
    public int LLILLJJLI;
    public final /* synthetic */ HashMap<String, Object> LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C2197541AzY LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197701Azo(HashMap<String, Object> map, Activity activity, String str, C2197541AzY c2197541AzY, String str2, String str3, InterfaceC1364105Vn<? super C2197701Azo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = map;
        this.LLILZ = activity;
        this.LLILZIL = str;
        this.LLILZLL = c2197541AzY;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2197701Azo(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2197701Azo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
