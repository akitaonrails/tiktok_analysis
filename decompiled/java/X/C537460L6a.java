package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.service.AITheaterSocialServiceImpl$onClickAITheaterActionBar$1", f = "AITheaterSocialServiceImpl.kt", l = {80, 85, 122, 126}, m = "invokeSuspend")
public final class C537460L6a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public LifecycleCoroutineScope LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ List<String> LLJ;
    public final /* synthetic */ LifecycleCoroutineScope LLJI;
    public final /* synthetic */ Context LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537460L6a(List<String> list, LifecycleCoroutineScope lifecycleCoroutineScope, Context context, boolean z, String str, String str2, String str3, InterfaceC1364105Vn<? super C537460L6a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = list;
        this.LLJI = lifecycleCoroutineScope;
        this.LLJIJIL = context;
        this.LLJILJIL = z;
        this.LLJILJILJ = str;
        this.LLJILLL = str2;
        this.LLJJ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537460L6a(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C537460L6a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
