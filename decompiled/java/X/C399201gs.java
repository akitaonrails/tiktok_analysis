package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchCategoryList$1", f = "StickerEffectViewModel.kt", l = {254, 255, 257, 260, 262, 266, 268, 270, 272, 276}, m = "invokeSuspend")
public final class C399201gs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C767500U8u LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ StickerEffectViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C399201gs(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C399201gs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C399201gs c399201gs = new C399201gs(this.LLILZIL, interfaceC1364105Vn);
        c399201gs.LLILZ = obj;
        return c399201gs;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:6:0x0019, B:8:0x0025, B:14:0x003e, B:21:0x0061, B:23:0x0069, B:31:0x008d, B:32:0x0090, B:34:0x0098, B:40:0x00c1, B:46:0x00e5, B:48:0x00ed, B:54:0x0116, B:56:0x011e, B:58:0x0124, B:62:0x0140, B:64:0x0148, B:68:0x0163, B:13:0x003b, B:20:0x005e, B:30:0x008a, B:39:0x00be, B:45:0x00e2, B:53:0x0113), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:6:0x0019, B:8:0x0025, B:14:0x003e, B:21:0x0061, B:23:0x0069, B:31:0x008d, B:32:0x0090, B:34:0x0098, B:40:0x00c1, B:46:0x00e5, B:48:0x00ed, B:54:0x0116, B:56:0x011e, B:58:0x0124, B:62:0x0140, B:64:0x0148, B:68:0x0163, B:13:0x003b, B:20:0x005e, B:30:0x008a, B:39:0x00be, B:45:0x00e2, B:53:0x0113), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:6:0x0019, B:8:0x0025, B:14:0x003e, B:21:0x0061, B:23:0x0069, B:31:0x008d, B:32:0x0090, B:34:0x0098, B:40:0x00c1, B:46:0x00e5, B:48:0x00ed, B:54:0x0116, B:56:0x011e, B:58:0x0124, B:62:0x0140, B:64:0x0148, B:68:0x0163, B:13:0x003b, B:20:0x005e, B:30:0x008a, B:39:0x00be, B:45:0x00e2, B:53:0x0113), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140 A[Catch: Exception -> 0x017e, TRY_ENTER, TryCatch #0 {Exception -> 0x017e, blocks: (B:6:0x0019, B:8:0x0025, B:14:0x003e, B:21:0x0061, B:23:0x0069, B:31:0x008d, B:32:0x0090, B:34:0x0098, B:40:0x00c1, B:46:0x00e5, B:48:0x00ed, B:54:0x0116, B:56:0x011e, B:58:0x0124, B:62:0x0140, B:64:0x0148, B:68:0x0163, B:13:0x003b, B:20:0x005e, B:30:0x008a, B:39:0x00be, B:45:0x00e2, B:53:0x0113), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148 A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:6:0x0019, B:8:0x0025, B:14:0x003e, B:21:0x0061, B:23:0x0069, B:31:0x008d, B:32:0x0090, B:34:0x0098, B:40:0x00c1, B:46:0x00e5, B:48:0x00ed, B:54:0x0116, B:56:0x011e, B:58:0x0124, B:62:0x0140, B:64:0x0148, B:68:0x0163, B:13:0x003b, B:20:0x005e, B:30:0x008a, B:39:0x00be, B:45:0x00e2, B:53:0x0113), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163 A[Catch: Exception -> 0x017e, TRY_ENTER, TryCatch #0 {Exception -> 0x017e, blocks: (B:6:0x0019, B:8:0x0025, B:14:0x003e, B:21:0x0061, B:23:0x0069, B:31:0x008d, B:32:0x0090, B:34:0x0098, B:40:0x00c1, B:46:0x00e5, B:48:0x00ed, B:54:0x0116, B:56:0x011e, B:58:0x0124, B:62:0x0140, B:64:0x0148, B:68:0x0163, B:13:0x003b, B:20:0x005e, B:30:0x008a, B:39:0x00be, B:45:0x00e2, B:53:0x0113), top: B:80:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C399201gs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
