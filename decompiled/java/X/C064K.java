package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.story.celebration.entrance.OpenCelebrationCreateAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.064K, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.celebration.entrance.OpenCelebrationCreateAction$open$1", f = "OpenCelebrationCreateAction.kt", l = {}, m = "invokeSuspend")
public final class C064K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OpenCelebrationCreateAction LL;
    public final /* synthetic */ C259800zU<Integer> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ Bundle LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C064K(OpenCelebrationCreateAction openCelebrationCreateAction, C259800zU<Integer> c259800zU, String str, Context context, Bundle bundle, InterfaceC1364105Vn<? super C064K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = openCelebrationCreateAction;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = str;
        this.LLILZ = context;
        this.LLILZIL = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C064K(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e8  */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v55, types: [T, java.lang.String] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C064K.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
