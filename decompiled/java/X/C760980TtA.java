package X;

import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.bgeffect.BgEffectViewModel$fetchCategoryList$1", f = "BgEffectViewModel.kt", l = {205, 211, 215, 218, 220, 221, 226, 229, 233}, m = "invokeSuspend")
public final class C760980TtA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ BgEffectViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC761010TtD LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760980TtA(BgEffectViewModel bgEffectViewModel, String str, InterfaceC761010TtD interfaceC761010TtD, InterfaceC1364105Vn<? super C760980TtA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = bgEffectViewModel;
        this.LLILZIL = str;
        this.LLILZLL = interfaceC761010TtD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760980TtA(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:11:0x0038, B:13:0x005d, B:19:0x0081, B:20:0x0092, B:22:0x0098, B:32:0x00d9, B:53:0x0168, B:55:0x016e, B:57:0x0174, B:62:0x0193, B:64:0x0197, B:65:0x019b, B:67:0x01a3, B:73:0x01c7, B:75:0x01cb, B:26:0x00b2, B:35:0x00fa, B:37:0x00fe, B:38:0x0108, B:44:0x012a, B:46:0x0132, B:52:0x0157, B:18:0x007e, B:31:0x00d6, B:34:0x00f7, B:43:0x0127, B:51:0x0154, B:61:0x0190, B:72:0x01c4), top: B:87:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:11:0x0038, B:13:0x005d, B:19:0x0081, B:20:0x0092, B:22:0x0098, B:32:0x00d9, B:53:0x0168, B:55:0x016e, B:57:0x0174, B:62:0x0193, B:64:0x0197, B:65:0x019b, B:67:0x01a3, B:73:0x01c7, B:75:0x01cb, B:26:0x00b2, B:35:0x00fa, B:37:0x00fe, B:38:0x0108, B:44:0x012a, B:46:0x0132, B:52:0x0157, B:18:0x007e, B:31:0x00d6, B:34:0x00f7, B:43:0x0127, B:51:0x0154, B:61:0x0190, B:72:0x01c4), top: B:87:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[Catch: Exception -> 0x01d6, TRY_ENTER, TryCatch #0 {Exception -> 0x01d6, blocks: (B:11:0x0038, B:13:0x005d, B:19:0x0081, B:20:0x0092, B:22:0x0098, B:32:0x00d9, B:53:0x0168, B:55:0x016e, B:57:0x0174, B:62:0x0193, B:64:0x0197, B:65:0x019b, B:67:0x01a3, B:73:0x01c7, B:75:0x01cb, B:26:0x00b2, B:35:0x00fa, B:37:0x00fe, B:38:0x0108, B:44:0x012a, B:46:0x0132, B:52:0x0157, B:18:0x007e, B:31:0x00d6, B:34:0x00f7, B:43:0x0127, B:51:0x0154, B:61:0x0190, B:72:0x01c4), top: B:87:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:11:0x0038, B:13:0x005d, B:19:0x0081, B:20:0x0092, B:22:0x0098, B:32:0x00d9, B:53:0x0168, B:55:0x016e, B:57:0x0174, B:62:0x0193, B:64:0x0197, B:65:0x019b, B:67:0x01a3, B:73:0x01c7, B:75:0x01cb, B:26:0x00b2, B:35:0x00fa, B:37:0x00fe, B:38:0x0108, B:44:0x012a, B:46:0x0132, B:52:0x0157, B:18:0x007e, B:31:0x00d6, B:34:0x00f7, B:43:0x0127, B:51:0x0154, B:61:0x0190, B:72:0x01c4), top: B:87:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132 A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:11:0x0038, B:13:0x005d, B:19:0x0081, B:20:0x0092, B:22:0x0098, B:32:0x00d9, B:53:0x0168, B:55:0x016e, B:57:0x0174, B:62:0x0193, B:64:0x0197, B:65:0x019b, B:67:0x01a3, B:73:0x01c7, B:75:0x01cb, B:26:0x00b2, B:35:0x00fa, B:37:0x00fe, B:38:0x0108, B:44:0x012a, B:46:0x0132, B:52:0x0157, B:18:0x007e, B:31:0x00d6, B:34:0x00f7, B:43:0x0127, B:51:0x0154, B:61:0x0190, B:72:0x01c4), top: B:87:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016e A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:11:0x0038, B:13:0x005d, B:19:0x0081, B:20:0x0092, B:22:0x0098, B:32:0x00d9, B:53:0x0168, B:55:0x016e, B:57:0x0174, B:62:0x0193, B:64:0x0197, B:65:0x019b, B:67:0x01a3, B:73:0x01c7, B:75:0x01cb, B:26:0x00b2, B:35:0x00fa, B:37:0x00fe, B:38:0x0108, B:44:0x012a, B:46:0x0132, B:52:0x0157, B:18:0x007e, B:31:0x00d6, B:34:0x00f7, B:43:0x0127, B:51:0x0154, B:61:0x0190, B:72:0x01c4), top: B:87:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197 A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:11:0x0038, B:13:0x005d, B:19:0x0081, B:20:0x0092, B:22:0x0098, B:32:0x00d9, B:53:0x0168, B:55:0x016e, B:57:0x0174, B:62:0x0193, B:64:0x0197, B:65:0x019b, B:67:0x01a3, B:73:0x01c7, B:75:0x01cb, B:26:0x00b2, B:35:0x00fa, B:37:0x00fe, B:38:0x0108, B:44:0x012a, B:46:0x0132, B:52:0x0157, B:18:0x007e, B:31:0x00d6, B:34:0x00f7, B:43:0x0127, B:51:0x0154, B:61:0x0190, B:72:0x01c4), top: B:87:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3 A[Catch: Exception -> 0x01d6, TryCatch #0 {Exception -> 0x01d6, blocks: (B:11:0x0038, B:13:0x005d, B:19:0x0081, B:20:0x0092, B:22:0x0098, B:32:0x00d9, B:53:0x0168, B:55:0x016e, B:57:0x0174, B:62:0x0193, B:64:0x0197, B:65:0x019b, B:67:0x01a3, B:73:0x01c7, B:75:0x01cb, B:26:0x00b2, B:35:0x00fa, B:37:0x00fe, B:38:0x0108, B:44:0x012a, B:46:0x0132, B:52:0x0157, B:18:0x007e, B:31:0x00d6, B:34:0x00f7, B:43:0x0127, B:51:0x0154, B:61:0x0190, B:72:0x01c4), top: B:87:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb A[Catch: Exception -> 0x01d6, TRY_LEAVE, TryCatch #0 {Exception -> 0x01d6, blocks: (B:11:0x0038, B:13:0x005d, B:19:0x0081, B:20:0x0092, B:22:0x0098, B:32:0x00d9, B:53:0x0168, B:55:0x016e, B:57:0x0174, B:62:0x0193, B:64:0x0197, B:65:0x019b, B:67:0x01a3, B:73:0x01c7, B:75:0x01cb, B:26:0x00b2, B:35:0x00fa, B:37:0x00fe, B:38:0x0108, B:44:0x012a, B:46:0x0132, B:52:0x0157, B:18:0x007e, B:31:0x00d6, B:34:0x00f7, B:43:0x0127, B:51:0x0154, B:61:0x0190, B:72:0x01c4), top: B:87:0x0010 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C760980TtA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
