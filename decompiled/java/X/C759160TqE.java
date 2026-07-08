package X;

import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet$onViewCreated$1", f = "LiveCommercialContentToggleFragmentSheet.kt", l = {189}, m = "invokeSuspend")
public final class C759160TqE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveCommercialContentToggleFragmentSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759160TqE(LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet, InterfaceC1364105Vn<? super C759160TqE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveCommercialContentToggleFragmentSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C759160TqE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C759160TqE.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
