package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01hO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$searchSticker$2", f = "StickerEffectViewModel.kt", l = {923, 932, 934, 938, 943, 945, 952}, m = "invokeSuspend")
public final class C402401hO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C402401hO(StickerEffectViewModel stickerEffectViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = stickerEffectViewModel;
        this.LLILZ = str;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C402401hO(this.LLILLL, this.LLILZ, interfaceC1364105Vn, this.LLILZIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:6:0x0018, B:16:0x004a, B:18:0x0050, B:19:0x0060, B:44:0x00ac, B:47:0x00ba, B:49:0x00c2, B:51:0x00c8, B:53:0x00da, B:55:0x00e8, B:58:0x00ef, B:62:0x0107, B:65:0x0110, B:69:0x0122, B:27:0x006f, B:30:0x0075, B:36:0x008f, B:38:0x0095, B:43:0x00a9, B:35:0x008c, B:42:0x00a6), top: B:83:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:6:0x0018, B:16:0x004a, B:18:0x0050, B:19:0x0060, B:44:0x00ac, B:47:0x00ba, B:49:0x00c2, B:51:0x00c8, B:53:0x00da, B:55:0x00e8, B:58:0x00ef, B:62:0x0107, B:65:0x0110, B:69:0x0122, B:27:0x006f, B:30:0x0075, B:36:0x008f, B:38:0x0095, B:43:0x00a9, B:35:0x008c, B:42:0x00a6), top: B:83:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:6:0x0018, B:16:0x004a, B:18:0x0050, B:19:0x0060, B:44:0x00ac, B:47:0x00ba, B:49:0x00c2, B:51:0x00c8, B:53:0x00da, B:55:0x00e8, B:58:0x00ef, B:62:0x0107, B:65:0x0110, B:69:0x0122, B:27:0x006f, B:30:0x0075, B:36:0x008f, B:38:0x0095, B:43:0x00a9, B:35:0x008c, B:42:0x00a6), top: B:83:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C402401hO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
