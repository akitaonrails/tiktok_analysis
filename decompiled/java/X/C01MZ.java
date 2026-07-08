package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01MZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.live.listprovider.DrawRoomListProvider$preCheckDNSStatus$1", f = "DrawRoomListProvider.kt", l = {}, m = "invokeSuspend")
public final class C01MZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ArrayList<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01MZ(ArrayList<String> arrayList, InterfaceC1364105Vn<? super C01MZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01MZ(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.String] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01MZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
