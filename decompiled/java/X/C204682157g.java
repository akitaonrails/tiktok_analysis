package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.157g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C204682157g extends C2217421BqW implements Function0<Unit> {
    public C204682157g(C204679157d c204679157d) {
        super(0, c204679157d, C204679157d.class, "reportSlideOutFeedbackEvent", "reportSlideOutFeedbackEvent()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.receiver.getClass();
        C786410Ut5.LJJZZIII(C0IK5.LIZ(), new Runnable() { // from class: X.157e
            public static void LIZ() {
                Object obj;
                C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
                Iterator it2 = ((ArrayList) C204679157d.LIZIZ).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    C204681157f c204681157f = (C204681157f) next;
                    if (Intrinsics.LJFF(c204681157f.LIZ, c0ir5 != null ? c0ir5.LIZJ : null) && c204681157f.LJIIJJI) {
                        obj = next;
                        break;
                    }
                }
                C204681157f c204681157f2 = (C204681157f) obj;
                if (c204681157f2 != null) {
                    C204679157d c204679157d = C204679157d.LIZ;
                    c204681157f2.LJIIJ = "livesdk_room_slide_out_error";
                    c204679157d.getClass();
                    C204679157d.LIZIZ(c204681157f2, false);
                }
                C19719512Dh.LIZ(C204679157d.LIZIZ).remove(c204681157f2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveSlideReporter@7bd.reportSlideOutFeedbackEvent$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveSlideReporter@7bd.reportSlideOutFeedbackEvent$1");
            }
        });
        return Unit.LIZ;
    }
}
