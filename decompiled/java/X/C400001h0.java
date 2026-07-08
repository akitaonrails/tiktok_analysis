package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01h0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchDataNew$1", f = "StickerEffectViewModel.kt", l = {714, 716, 718, 721, 723, 726, 728, 732}, m = "invokeSuspend")
public final class C400001h0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StickerEffectViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C400001h0(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C400001h0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stickerEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C400001h0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:11:0x0033, B:16:0x0047, B:18:0x0051, B:20:0x005b, B:25:0x0074, B:27:0x0087, B:32:0x00a4, B:34:0x00ae, B:35:0x00ba, B:39:0x00d0, B:44:0x00ec, B:46:0x00f6, B:47:0x0102, B:15:0x0044, B:24:0x0071, B:31:0x00a1, B:43:0x00e9, B:51:0x0118), top: B:60:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:11:0x0033, B:16:0x0047, B:18:0x0051, B:20:0x005b, B:25:0x0074, B:27:0x0087, B:32:0x00a4, B:34:0x00ae, B:35:0x00ba, B:39:0x00d0, B:44:0x00ec, B:46:0x00f6, B:47:0x0102, B:15:0x0044, B:24:0x0071, B:31:0x00a1, B:43:0x00e9, B:51:0x0118), top: B:60:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:11:0x0033, B:16:0x0047, B:18:0x0051, B:20:0x005b, B:25:0x0074, B:27:0x0087, B:32:0x00a4, B:34:0x00ae, B:35:0x00ba, B:39:0x00d0, B:44:0x00ec, B:46:0x00f6, B:47:0x0102, B:15:0x0044, B:24:0x0071, B:31:0x00a1, B:43:0x00e9, B:51:0x0118), top: B:60:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:11:0x0033, B:16:0x0047, B:18:0x0051, B:20:0x005b, B:25:0x0074, B:27:0x0087, B:32:0x00a4, B:34:0x00ae, B:35:0x00ba, B:39:0x00d0, B:44:0x00ec, B:46:0x00f6, B:47:0x0102, B:15:0x0044, B:24:0x0071, B:31:0x00a1, B:43:0x00e9, B:51:0x0118), top: B:60:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C400001h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
