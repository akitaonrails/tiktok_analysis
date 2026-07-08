package X;

import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel$fetchDataNew$1", f = "VoiceEffectViewModel.kt", l = {45, 48, BaseNotice.RECOMMEND_LIVE, 52, 53, 56}, m = "invokeSuspend")
public final class C761020TtE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VoiceEffectViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761020TtE(VoiceEffectViewModel voiceEffectViewModel, InterfaceC1364105Vn<? super C761020TtE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = voiceEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761020TtE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[Catch: Exception -> 0x009e, TryCatch #0 {Exception -> 0x009e, blocks: (B:11:0x0031, B:16:0x004e, B:18:0x0058, B:22:0x006e, B:27:0x0082, B:15:0x004b, B:26:0x007f, B:31:0x009a), top: B:40:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[Catch: Exception -> 0x009e, TRY_ENTER, TryCatch #0 {Exception -> 0x009e, blocks: (B:11:0x0031, B:16:0x004e, B:18:0x0058, B:22:0x006e, B:27:0x0082, B:15:0x004b, B:26:0x007f, B:31:0x009a), top: B:40:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C761020TtE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
