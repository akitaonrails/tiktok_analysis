package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerPreviewWrapperWidget;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11wd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19664111wd extends C2217421BqW implements Function0<Unit> {
    public C19664111wd(Object obj) {
        super(0, obj, LiveEventStickerPreviewWrapperWidget.class, "clearCurrentSticker", "clearCurrentSticker()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object next;
        C1AJN c1ajn;
        C19663611wY c19663611wY;
        C19665511wr c19665511wr;
        LiveEventStickerPreviewWrapperWidget liveEventStickerPreviewWrapperWidget = (LiveEventStickerPreviewWrapperWidget) this.receiver;
        Iterator it2 = ((ArrayList) liveEventStickerPreviewWrapperWidget.LLILZIL).iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!(next instanceof C19662711wP));
        if ((next instanceof C19662711wP) && (c1ajn = (C1AJN) next) != null && (c19663611wY = (C19663611wY) c1ajn.LL) != null && (c19665511wr = liveEventStickerPreviewWrapperWidget.LLILZLL) != null) {
            c19665511wr.LJII(c19663611wY, new C1085160eLS(liveEventStickerPreviewWrapperWidget), new C19665211wo(liveEventStickerPreviewWrapperWidget));
        }
        return Unit.LIZ;
    }
}
