package X;

import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767570U9b extends C09AY implements Function1<C767590U9d, Unit> {
    public final /* synthetic */ StickerShortCutWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767570U9b(StickerShortCutWidget stickerShortCutWidget) {
        super(1);
        this.LL = stickerShortCutWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C767590U9d c767590U9d) {
        LiveEffect liveEffect;
        C767590U9d c767590U9d2 = c767590U9d;
        StickerShortCutWidget stickerShortCutWidget = this.LL;
        stickerShortCutWidget.LLJJIJIIJIL = c767590U9d2.LIZLLL;
        stickerShortCutWidget.LLJJIJIL = c767590U9d2.LIZJ;
        if (stickerShortCutWidget.isShowing()) {
            StickerShortCutWidget stickerShortCutWidget2 = this.LL;
            if (stickerShortCutWidget2.LLJJIJIIJIL) {
                stickerShortCutWidget2.D1();
            } else if (c767590U9d2.LIZJ && (liveEffect = stickerShortCutWidget2.LLJJJ) != null && !Intrinsics.LJFF(stickerShortCutWidget2.LLJJI, liveEffect)) {
                if (C13LP.LJJJJ(stickerShortCutWidget2.LLJJJ, stickerShortCutWidget2.C1().LL)) {
                    C0U9N c0u9nC1 = stickerShortCutWidget2.C1();
                    LiveEffect liveEffect2 = stickerShortCutWidget2.LLJJJ;
                    c0u9nC1.getClass();
                    if (liveEffect2 != null) {
                        c0u9nC1.LLZILL(false, false);
                        c0u9nC1.LLLZZIL(liveEffect2);
                        c0u9nC1.LLLLLLIL(liveEffect2);
                    }
                } else {
                    LiveEffectOld liveEffectOld = new LiveEffectOld();
                    liveEffectOld.LJJLJ = C0U9E.NONE;
                    List<? extends LiveEffect> listLJIILJJIL = C1697810uHb.LJIILJJIL(liveEffectOld);
                    LiveEffect liveEffect3 = stickerShortCutWidget2.LLJJJ;
                    if (liveEffect3 != null) {
                        listLJIILJJIL.add(liveEffect3);
                    }
                    listLJIILJJIL.addAll(((ArrayList) stickerShortCutWidget2.C1().LL).subList(1, ((ArrayList) stickerShortCutWidget2.C1().LL).size()));
                    stickerShortCutWidget2.C1().LLZZJLIL(listLJIILJJIL, stickerShortCutWidget2.LLJJJ, true);
                }
            }
        } else {
            StickerShortCutWidget stickerShortCutWidget3 = this.LL;
            stickerShortCutWidget3.A1(new AwS413S0200000_12(stickerShortCutWidget3, c767590U9d2, 6));
        }
        return Unit.LIZ;
    }
}
