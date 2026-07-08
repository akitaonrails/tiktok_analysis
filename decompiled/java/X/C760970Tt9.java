package X;

import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.bgeffect.BgEffectViewModel$fetchLatestMultiEffect$1", f = "BgEffectViewModel.kt", l = {162, 168, 171, 173, 179, 183, 186, 189}, m = "invokeSuspend")
public final class C760970Tt9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ BgEffectViewModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760970Tt9(BgEffectViewModel bgEffectViewModel, boolean z, InterfaceC1364105Vn<? super C760970Tt9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = bgEffectViewModel;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760970Tt9(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:36:0x0116, B:37:0x0119, B:40:0x014c, B:42:0x0157, B:47:0x017a, B:48:0x0180, B:50:0x0188, B:55:0x01ab, B:56:0x01b1, B:29:0x00e7, B:30:0x00ea, B:32:0x00f2, B:38:0x0130, B:39:0x0133, B:17:0x008c, B:18:0x008f, B:19:0x00a8, B:21:0x00ae, B:25:0x00d2, B:11:0x0049, B:13:0x0071, B:46:0x0177, B:54:0x01a8, B:60:0x01cc), top: B:69:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2 A[Catch: Exception -> 0x01d0, TRY_ENTER, TryCatch #0 {Exception -> 0x01d0, blocks: (B:36:0x0116, B:37:0x0119, B:40:0x014c, B:42:0x0157, B:47:0x017a, B:48:0x0180, B:50:0x0188, B:55:0x01ab, B:56:0x01b1, B:29:0x00e7, B:30:0x00ea, B:32:0x00f2, B:38:0x0130, B:39:0x0133, B:17:0x008c, B:18:0x008f, B:19:0x00a8, B:21:0x00ae, B:25:0x00d2, B:11:0x0049, B:13:0x0071, B:46:0x0177, B:54:0x01a8, B:60:0x01cc), top: B:69:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:36:0x0116, B:37:0x0119, B:40:0x014c, B:42:0x0157, B:47:0x017a, B:48:0x0180, B:50:0x0188, B:55:0x01ab, B:56:0x01b1, B:29:0x00e7, B:30:0x00ea, B:32:0x00f2, B:38:0x0130, B:39:0x0133, B:17:0x008c, B:18:0x008f, B:19:0x00a8, B:21:0x00ae, B:25:0x00d2, B:11:0x0049, B:13:0x0071, B:46:0x0177, B:54:0x01a8, B:60:0x01cc), top: B:69:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:36:0x0116, B:37:0x0119, B:40:0x014c, B:42:0x0157, B:47:0x017a, B:48:0x0180, B:50:0x0188, B:55:0x01ab, B:56:0x01b1, B:29:0x00e7, B:30:0x00ea, B:32:0x00f2, B:38:0x0130, B:39:0x0133, B:17:0x008c, B:18:0x008f, B:19:0x00a8, B:21:0x00ae, B:25:0x00d2, B:11:0x0049, B:13:0x0071, B:46:0x0177, B:54:0x01a8, B:60:0x01cc), top: B:69:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0180 A[Catch: Exception -> 0x01d0, TryCatch #0 {Exception -> 0x01d0, blocks: (B:36:0x0116, B:37:0x0119, B:40:0x014c, B:42:0x0157, B:47:0x017a, B:48:0x0180, B:50:0x0188, B:55:0x01ab, B:56:0x01b1, B:29:0x00e7, B:30:0x00ea, B:32:0x00f2, B:38:0x0130, B:39:0x0133, B:17:0x008c, B:18:0x008f, B:19:0x00a8, B:21:0x00ae, B:25:0x00d2, B:11:0x0049, B:13:0x0071, B:46:0x0177, B:54:0x01a8, B:60:0x01cc), top: B:69:0x0014 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C760970Tt9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
