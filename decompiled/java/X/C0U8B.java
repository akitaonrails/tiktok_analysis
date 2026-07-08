package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U8B, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$applyEffectAdapt$1", f = "StickerEffectViewModel.kt", l = {1031, 1039, 1045}, m = "invokeSuspend")
public final class C0U8B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public Object LLILLJJLI;
    public LiveEffect LLILLL;
    public C013C LLILZ;
    public int LLILZIL;
    public final /* synthetic */ LiveEffect LLILZLL;
    public final /* synthetic */ StickerEffectViewModel LLIZ;
    public final /* synthetic */ C0U8C LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U8B(LiveEffect liveEffect, StickerEffectViewModel stickerEffectViewModel, C0U8C c0u8c, InterfaceC1364105Vn<? super C0U8B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = liveEffect;
        this.LLIZ = stickerEffectViewModel;
        this.LLIZLLLIL = c0u8c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U8B(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d4 -> B:21:0x007b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8B.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
