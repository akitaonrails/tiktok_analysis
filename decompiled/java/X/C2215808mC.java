package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.im.core.message.media.sendingstep.CheckNotDeletedStep$execute$missingFile$1", f = "CheckNotDeletedStep.kt", l = {}, m = "invokeSuspend")
public final class C2215808mC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ Context $appContext;
    public final /* synthetic */ boolean $enableReadabilityCheck;
    public final /* synthetic */ C873910YQb $intermediates;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2215808mC(C873910YQb c873910YQb, boolean z, Context context, InterfaceC1364105Vn<? super C2215808mC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.$intermediates = c873910YQb;
        this.$enableReadabilityCheck = z;
        this.$appContext = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2215808mC(this.$intermediates, this.$enableReadabilityCheck, this.$appContext, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2215808mC.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
