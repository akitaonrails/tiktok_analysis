package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01hM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchTrendingTabList$1", f = "StickerEffectViewModel.kt", l = {539, 542, 545, 549, 550, 557, 562, 565}, m = "invokeSuspend")
public final class C402201hM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C767500U8u LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ StickerEffectViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C402201hM(StickerEffectViewModel stickerEffectViewModel, String str, InterfaceC1364105Vn<? super C402201hM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = stickerEffectViewModel;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C402201hM(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectLoadOptSetting.INSTANCE.allowPageLoad() == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: Exception -> 0x01f8, TryCatch #0 {Exception -> 0x01f8, blocks: (B:6:0x001f, B:12:0x003c, B:19:0x005a, B:21:0x007d, B:27:0x0099, B:28:0x00b2, B:34:0x00ce, B:36:0x00d6, B:42:0x00f4, B:44:0x00fc, B:61:0x016f, B:63:0x0177, B:65:0x017f, B:71:0x019d, B:72:0x01b7, B:74:0x01bf, B:46:0x0104, B:48:0x011e, B:51:0x0125, B:57:0x013d, B:59:0x0149, B:60:0x0155, B:31:0x00c1, B:18:0x0057, B:26:0x0096, B:41:0x00f1, B:56:0x013a, B:70:0x019a), top: B:86:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[Catch: Exception -> 0x01f8, TryCatch #0 {Exception -> 0x01f8, blocks: (B:6:0x001f, B:12:0x003c, B:19:0x005a, B:21:0x007d, B:27:0x0099, B:28:0x00b2, B:34:0x00ce, B:36:0x00d6, B:42:0x00f4, B:44:0x00fc, B:61:0x016f, B:63:0x0177, B:65:0x017f, B:71:0x019d, B:72:0x01b7, B:74:0x01bf, B:46:0x0104, B:48:0x011e, B:51:0x0125, B:57:0x013d, B:59:0x0149, B:60:0x0155, B:31:0x00c1, B:18:0x0057, B:26:0x0096, B:41:0x00f1, B:56:0x013a, B:70:0x019a), top: B:86:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce A[Catch: Exception -> 0x01f8, TryCatch #0 {Exception -> 0x01f8, blocks: (B:6:0x001f, B:12:0x003c, B:19:0x005a, B:21:0x007d, B:27:0x0099, B:28:0x00b2, B:34:0x00ce, B:36:0x00d6, B:42:0x00f4, B:44:0x00fc, B:61:0x016f, B:63:0x0177, B:65:0x017f, B:71:0x019d, B:72:0x01b7, B:74:0x01bf, B:46:0x0104, B:48:0x011e, B:51:0x0125, B:57:0x013d, B:59:0x0149, B:60:0x0155, B:31:0x00c1, B:18:0x0057, B:26:0x0096, B:41:0x00f1, B:56:0x013a, B:70:0x019a), top: B:86:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e A[Catch: Exception -> 0x01f8, TryCatch #0 {Exception -> 0x01f8, blocks: (B:6:0x001f, B:12:0x003c, B:19:0x005a, B:21:0x007d, B:27:0x0099, B:28:0x00b2, B:34:0x00ce, B:36:0x00d6, B:42:0x00f4, B:44:0x00fc, B:61:0x016f, B:63:0x0177, B:65:0x017f, B:71:0x019d, B:72:0x01b7, B:74:0x01bf, B:46:0x0104, B:48:0x011e, B:51:0x0125, B:57:0x013d, B:59:0x0149, B:60:0x0155, B:31:0x00c1, B:18:0x0057, B:26:0x0096, B:41:0x00f1, B:56:0x013a, B:70:0x019a), top: B:86:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149 A[Catch: Exception -> 0x01f8, TryCatch #0 {Exception -> 0x01f8, blocks: (B:6:0x001f, B:12:0x003c, B:19:0x005a, B:21:0x007d, B:27:0x0099, B:28:0x00b2, B:34:0x00ce, B:36:0x00d6, B:42:0x00f4, B:44:0x00fc, B:61:0x016f, B:63:0x0177, B:65:0x017f, B:71:0x019d, B:72:0x01b7, B:74:0x01bf, B:46:0x0104, B:48:0x011e, B:51:0x0125, B:57:0x013d, B:59:0x0149, B:60:0x0155, B:31:0x00c1, B:18:0x0057, B:26:0x0096, B:41:0x00f1, B:56:0x013a, B:70:0x019a), top: B:86:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177 A[Catch: Exception -> 0x01f8, TryCatch #0 {Exception -> 0x01f8, blocks: (B:6:0x001f, B:12:0x003c, B:19:0x005a, B:21:0x007d, B:27:0x0099, B:28:0x00b2, B:34:0x00ce, B:36:0x00d6, B:42:0x00f4, B:44:0x00fc, B:61:0x016f, B:63:0x0177, B:65:0x017f, B:71:0x019d, B:72:0x01b7, B:74:0x01bf, B:46:0x0104, B:48:0x011e, B:51:0x0125, B:57:0x013d, B:59:0x0149, B:60:0x0155, B:31:0x00c1, B:18:0x0057, B:26:0x0096, B:41:0x00f1, B:56:0x013a, B:70:0x019a), top: B:86:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bf A[Catch: Exception -> 0x01f8, TryCatch #0 {Exception -> 0x01f8, blocks: (B:6:0x001f, B:12:0x003c, B:19:0x005a, B:21:0x007d, B:27:0x0099, B:28:0x00b2, B:34:0x00ce, B:36:0x00d6, B:42:0x00f4, B:44:0x00fc, B:61:0x016f, B:63:0x0177, B:65:0x017f, B:71:0x019d, B:72:0x01b7, B:74:0x01bf, B:46:0x0104, B:48:0x011e, B:51:0x0125, B:57:0x013d, B:59:0x0149, B:60:0x0155, B:31:0x00c1, B:18:0x0057, B:26:0x0096, B:41:0x00f1, B:56:0x013a, B:70:0x019a), top: B:86:0x0014 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C402201hM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
