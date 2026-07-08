package X;

import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$setEffect$2", f = "StickerEffectViewModel.kt", l = {}, m = "invokeSuspend")
public final class C399001gq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StickerEffectViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ LiveEffect LLILLL;
    public final /* synthetic */ C259800zU<LiveEffect> LLILZ;
    public final /* synthetic */ DataChannel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C399001gq(StickerEffectViewModel stickerEffectViewModel, boolean z, LiveEffect liveEffect, C259800zU<LiveEffect> c259800zU, DataChannel dataChannel, InterfaceC1364105Vn<? super C399001gq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = stickerEffectViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = liveEffect;
        this.LLILZ = c259800zU;
        this.LLILZIL = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C399001gq(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.bytedance.android.livesdkapi.depend.model.LiveEffect] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.setEffect$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objLJJJLL = C13LP.LJJJLL(C0UA1.LIZ().qr(this.LL.LLILZ.LJIJ()));
        if (this.LLILLJJLI && !Intrinsics.LJFF(objLJJJLL, this.LLILLL)) {
            this.LLILZ.element = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replace current sticker: ");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LIZIZ("StickerEffectViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C0UA1.LIZ().LJIIIIZZ(this.LLILLL, this.LL.LLILZ.LJIJ());
            DataChannel dataChannel = this.LLILZIL;
            if (dataChannel != null) {
                dataChannel.zW(StickerSelectChannel.class, this.LLILLL);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerEffectViewModel@d809.setEffect$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
