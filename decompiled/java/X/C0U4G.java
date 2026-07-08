package X;

import com.bytedance.android.live.effect.micseatemoji.MicSeatEmojiViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U4G, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.micseatemoji.MicSeatEmojiViewModel$fetchEffectList$1", f = "MicSeatEmojiViewModel.kt", l = {31, 32, LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT, 39}, m = "invokeSuspend")
public final class C0U4G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ MicSeatEmojiViewModel LLILZIL;
    public final /* synthetic */ InterfaceC445970HeF<LiveEffect> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U4G(MicSeatEmojiViewModel micSeatEmojiViewModel, InterfaceC445970HeF<LiveEffect> interfaceC445970HeF, InterfaceC1364105Vn<? super C0U4G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = micSeatEmojiViewModel;
        this.LLILZLL = interfaceC445970HeF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U4G(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0 A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:43:0x00fe, B:44:0x0101, B:47:0x0117, B:49:0x0120, B:50:0x012f, B:52:0x0137, B:53:0x0146, B:34:0x00cf, B:35:0x00d2, B:36:0x00da, B:38:0x00e0, B:45:0x0109, B:46:0x010c, B:19:0x0079, B:20:0x007c, B:22:0x0084, B:27:0x00a2, B:29:0x00b5, B:15:0x005b), top: B:61:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120 A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:43:0x00fe, B:44:0x0101, B:47:0x0117, B:49:0x0120, B:50:0x012f, B:52:0x0137, B:53:0x0146, B:34:0x00cf, B:35:0x00d2, B:36:0x00da, B:38:0x00e0, B:45:0x0109, B:46:0x010c, B:19:0x0079, B:20:0x007c, B:22:0x0084, B:27:0x00a2, B:29:0x00b5, B:15:0x005b), top: B:61:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:43:0x00fe, B:44:0x0101, B:47:0x0117, B:49:0x0120, B:50:0x012f, B:52:0x0137, B:53:0x0146, B:34:0x00cf, B:35:0x00d2, B:36:0x00da, B:38:0x00e0, B:45:0x0109, B:46:0x010c, B:19:0x0079, B:20:0x007c, B:22:0x0084, B:27:0x00a2, B:29:0x00b5, B:15:0x005b), top: B:61:0x0013 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U4G.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
