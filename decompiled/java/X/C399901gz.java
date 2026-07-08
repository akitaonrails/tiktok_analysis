package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchRecentEffect$1", f = "StickerEffectViewModel.kt", l = {185, 187, 189, 191}, m = "invokeSuspend")
public final class C399901gz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Pair LL;
    public int LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C399901gz(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C399901gz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C399901gz(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:11:0x0023, B:21:0x007b, B:22:0x007e, B:24:0x008a, B:25:0x00a0, B:17:0x0046, B:18:0x0049, B:14:0x002d), top: B:41:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C399901gz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
