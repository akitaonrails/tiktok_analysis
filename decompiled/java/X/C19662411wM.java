package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11wM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19662411wM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ LiveEventStickerWrapperWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19662411wM(boolean z, LiveEventStickerWrapperWidget liveEventStickerWrapperWidget) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = liveEventStickerWrapperWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL) {
            LiveEventStickerWrapperWidget liveEventStickerWrapperWidget = this.LLILLJJLI;
            AnonymousClass0956 anonymousClass0956 = liveEventStickerWrapperWidget.LLJILJILJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            liveEventStickerWrapperWidget.LLJILJILJ = null;
        }
        return Unit.LIZ;
    }
}
