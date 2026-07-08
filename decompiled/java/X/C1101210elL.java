package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0elL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.stream.quality.core.GameStreamQualityCenterImpl$updateAdaptiveGearPerfInfo$1", f = "GameStreamQualityCenterImpl.kt", l = {}, m = "invokeSuspend")
public final class C1101210elL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2250031D4v LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1101210elL(C2250031D4v c2250031D4v, InterfaceC1364105Vn<? super C1101210elL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2250031D4v;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1101210elL(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0 A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:16:0x0069, B:18:0x0082, B:20:0x0086, B:28:0x0095, B:30:0x0099, B:32:0x00a3, B:33:0x00a5, B:39:0x00b3, B:40:0x00b7, B:41:0x00ba, B:43:0x00c0, B:44:0x00c4, B:46:0x00ca, B:47:0x00ce, B:49:0x00df, B:54:0x00ee, B:56:0x00f9, B:57:0x00fd, B:58:0x00ff, B:60:0x010a, B:64:0x0116, B:66:0x0120, B:67:0x0125, B:68:0x012b, B:70:0x0142, B:21:0x0089, B:23:0x008d), top: B:75:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:16:0x0069, B:18:0x0082, B:20:0x0086, B:28:0x0095, B:30:0x0099, B:32:0x00a3, B:33:0x00a5, B:39:0x00b3, B:40:0x00b7, B:41:0x00ba, B:43:0x00c0, B:44:0x00c4, B:46:0x00ca, B:47:0x00ce, B:49:0x00df, B:54:0x00ee, B:56:0x00f9, B:57:0x00fd, B:58:0x00ff, B:60:0x010a, B:64:0x0116, B:66:0x0120, B:67:0x0125, B:68:0x012b, B:70:0x0142, B:21:0x0089, B:23:0x008d), top: B:75:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9 A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:16:0x0069, B:18:0x0082, B:20:0x0086, B:28:0x0095, B:30:0x0099, B:32:0x00a3, B:33:0x00a5, B:39:0x00b3, B:40:0x00b7, B:41:0x00ba, B:43:0x00c0, B:44:0x00c4, B:46:0x00ca, B:47:0x00ce, B:49:0x00df, B:54:0x00ee, B:56:0x00f9, B:57:0x00fd, B:58:0x00ff, B:60:0x010a, B:64:0x0116, B:66:0x0120, B:67:0x0125, B:68:0x012b, B:70:0x0142, B:21:0x0089, B:23:0x008d), top: B:75:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120 A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:16:0x0069, B:18:0x0082, B:20:0x0086, B:28:0x0095, B:30:0x0099, B:32:0x00a3, B:33:0x00a5, B:39:0x00b3, B:40:0x00b7, B:41:0x00ba, B:43:0x00c0, B:44:0x00c4, B:46:0x00ca, B:47:0x00ce, B:49:0x00df, B:54:0x00ee, B:56:0x00f9, B:57:0x00fd, B:58:0x00ff, B:60:0x010a, B:64:0x0116, B:66:0x0120, B:67:0x0125, B:68:0x012b, B:70:0x0142, B:21:0x0089, B:23:0x008d), top: B:75:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142 A[Catch: all -> 0x0146, TRY_LEAVE, TryCatch #0 {all -> 0x0146, blocks: (B:16:0x0069, B:18:0x0082, B:20:0x0086, B:28:0x0095, B:30:0x0099, B:32:0x00a3, B:33:0x00a5, B:39:0x00b3, B:40:0x00b7, B:41:0x00ba, B:43:0x00c0, B:44:0x00c4, B:46:0x00ca, B:47:0x00ce, B:49:0x00df, B:54:0x00ee, B:56:0x00f9, B:57:0x00fd, B:58:0x00ff, B:60:0x010a, B:64:0x0116, B:66:0x0120, B:67:0x0125, B:68:0x012b, B:70:0x0142, B:21:0x0089, B:23:0x008d), top: B:75:0x0069 }] */
    /* JADX WARN: Type inference failed for: r0v68, types: [T, X.0ekg] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1101210elL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
