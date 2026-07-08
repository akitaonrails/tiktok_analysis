package X;

import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.bgeffect.BgEffectViewModel$loadLocalMultiEffectOrFetchSingleEffect$1", f = "BgEffectViewModel.kt", l = {83, 96, 115, 125, 137, 140}, m = "invokeSuspend")
public final class C760960Tt8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ BgEffectViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760960Tt8(BgEffectViewModel bgEffectViewModel, String str, InterfaceC1364105Vn<? super C760960Tt8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = bgEffectViewModel;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760960Tt8(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:6:0x001c, B:8:0x0024, B:10:0x004a, B:16:0x0070, B:17:0x0099, B:19:0x009f, B:25:0x00c6, B:26:0x00dd, B:28:0x00e6, B:33:0x010a, B:34:0x0110, B:36:0x0118, B:41:0x013a, B:42:0x0140, B:15:0x006d, B:24:0x00c3, B:32:0x0107, B:40:0x0137), top: B:54:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:6:0x001c, B:8:0x0024, B:10:0x004a, B:16:0x0070, B:17:0x0099, B:19:0x009f, B:25:0x00c6, B:26:0x00dd, B:28:0x00e6, B:33:0x010a, B:34:0x0110, B:36:0x0118, B:41:0x013a, B:42:0x0140, B:15:0x006d, B:24:0x00c3, B:32:0x0107, B:40:0x0137), top: B:54:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110 A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:6:0x001c, B:8:0x0024, B:10:0x004a, B:16:0x0070, B:17:0x0099, B:19:0x009f, B:25:0x00c6, B:26:0x00dd, B:28:0x00e6, B:33:0x010a, B:34:0x0110, B:36:0x0118, B:41:0x013a, B:42:0x0140, B:15:0x006d, B:24:0x00c3, B:32:0x0107, B:40:0x0137), top: B:54:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C760960Tt8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
