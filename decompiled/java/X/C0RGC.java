package X;

import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RGC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RGC extends C09AY implements Function0<InterfaceC19601711mZ> {
    public final /* synthetic */ InteractStickerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RGC(InteractStickerWidget interactStickerWidget) {
        super(0);
        this.LL = interactStickerWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC19601711mZ invoke() {
        return (((Boolean) C272890Aml.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(this.LL.LLJJJIL, "STORY")) ? new C386101el(this.LL.LLJIJIL) : new C20106913lr(this.LL.LLJIJIL);
    }
}
