package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11wL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19662311wL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ LiveEventStickerWrapperWidget LLILLJJLI;
    public final /* synthetic */ C19663611wY LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19662311wL(boolean z, LiveEventStickerWrapperWidget liveEventStickerWrapperWidget, C19663611wY c19663611wY) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = liveEventStickerWrapperWidget;
        this.LLILLL = c19663611wY;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL) {
            LiveEventStickerWrapperWidget liveEventStickerWrapperWidget = this.LLILLJJLI;
            C19663611wY c19663611wY = this.LLILLL;
            AnonymousClass0956 anonymousClass0956 = liveEventStickerWrapperWidget.LLJILJILJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            liveEventStickerWrapperWidget.LLJILJILJ = null;
            liveEventStickerWrapperWidget.LLJILJILJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveEventStickerWrapperWidget), null, null, new C19662211wK(liveEventStickerWrapperWidget, c19663611wY, null), 3);
        }
        return Unit.LIZ;
    }
}
