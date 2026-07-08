package X;

import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$fetchDataNew$1", f = "SoundEffectViewModel.kt", l = {131, 135, 140, 153, 155, 158, 161, 165, 167}, m = "invokeSuspend")
public final class C761050TtH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ SoundEffectViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761050TtH(SoundEffectViewModel soundEffectViewModel, InterfaceC1364105Vn<? super C761050TtH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = soundEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761050TtH(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0145: INVOKE (r0 I:boolean) = (r3 I:java.util.List) INTERFACE call: java.util.List.isEmpty():boolean A[MD:():boolean (c)] (LINE:16777541), block:B:67:0x0142 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: Exception -> 0x0141, TryCatch #1 {Exception -> 0x0141, blocks: (B:12:0x003c, B:18:0x005c, B:20:0x0066, B:22:0x006c, B:23:0x0070, B:25:0x0076, B:31:0x008c, B:32:0x008f, B:34:0x0095, B:44:0x00d4, B:46:0x00da, B:48:0x00e0, B:52:0x00fc, B:54:0x0104, B:58:0x011e, B:38:0x00af, B:65:0x013d), top: B:86:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: Exception -> 0x0141, TryCatch #1 {Exception -> 0x0141, blocks: (B:12:0x003c, B:18:0x005c, B:20:0x0066, B:22:0x006c, B:23:0x0070, B:25:0x0076, B:31:0x008c, B:32:0x008f, B:34:0x0095, B:44:0x00d4, B:46:0x00da, B:48:0x00e0, B:52:0x00fc, B:54:0x0104, B:58:0x011e, B:38:0x00af, B:65:0x013d), top: B:86:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[Catch: Exception -> 0x0141, TryCatch #1 {Exception -> 0x0141, blocks: (B:12:0x003c, B:18:0x005c, B:20:0x0066, B:22:0x006c, B:23:0x0070, B:25:0x0076, B:31:0x008c, B:32:0x008f, B:34:0x0095, B:44:0x00d4, B:46:0x00da, B:48:0x00e0, B:52:0x00fc, B:54:0x0104, B:58:0x011e, B:38:0x00af, B:65:0x013d), top: B:86:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: Exception -> 0x0141, TRY_ENTER, TryCatch #1 {Exception -> 0x0141, blocks: (B:12:0x003c, B:18:0x005c, B:20:0x0066, B:22:0x006c, B:23:0x0070, B:25:0x0076, B:31:0x008c, B:32:0x008f, B:34:0x0095, B:44:0x00d4, B:46:0x00da, B:48:0x00e0, B:52:0x00fc, B:54:0x0104, B:58:0x011e, B:38:0x00af, B:65:0x013d), top: B:86:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[Catch: Exception -> 0x0141, TRY_ENTER, TryCatch #1 {Exception -> 0x0141, blocks: (B:12:0x003c, B:18:0x005c, B:20:0x0066, B:22:0x006c, B:23:0x0070, B:25:0x0076, B:31:0x008c, B:32:0x008f, B:34:0x0095, B:44:0x00d4, B:46:0x00da, B:48:0x00e0, B:52:0x00fc, B:54:0x0104, B:58:0x011e, B:38:0x00af, B:65:0x013d), top: B:86:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104 A[Catch: Exception -> 0x0141, TryCatch #1 {Exception -> 0x0141, blocks: (B:12:0x003c, B:18:0x005c, B:20:0x0066, B:22:0x006c, B:23:0x0070, B:25:0x0076, B:31:0x008c, B:32:0x008f, B:34:0x0095, B:44:0x00d4, B:46:0x00da, B:48:0x00e0, B:52:0x00fc, B:54:0x0104, B:58:0x011e, B:38:0x00af, B:65:0x013d), top: B:86:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e A[Catch: Exception -> 0x0141, TRY_ENTER, TryCatch #1 {Exception -> 0x0141, blocks: (B:12:0x003c, B:18:0x005c, B:20:0x0066, B:22:0x006c, B:23:0x0070, B:25:0x0076, B:31:0x008c, B:32:0x008f, B:34:0x0095, B:44:0x00d4, B:46:0x00da, B:48:0x00e0, B:52:0x00fc, B:54:0x0104, B:58:0x011e, B:38:0x00af, B:65:0x013d), top: B:86:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C761050TtH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
