package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RWR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RWR extends C09AY implements Function2<VideoTagContainer, C291001Au<? extends C0R9E>, Unit> {
    public C0RWR() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoTagContainer videoTagContainer, C291001Au<? extends C0R9E> c291001Au) {
        VideoTagContainer videoTagContainer2 = videoTagContainer;
        if (c291001Au != null) {
            if (videoTagContainer2.Fp()) {
                C697210RWl c697210RWlBp = videoTagContainer2.Bp();
                CopyOnWriteArrayList<PriorityProtocol> value = c697210RWlBp.LLJIJIL.getValue();
                if (value != null) {
                    value.clear();
                }
                C0RYF.LIZIZ(c697210RWlBp.LLJIJIL, new CopyOnWriteArrayList());
                Iterator<Map.Entry<String, InterfaceC697230RWn>> it2 = c697210RWlBp.LIZIZ().entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().ya();
                }
            } else {
                C697210RWl c697210RWlBp2 = videoTagContainer2.Bp();
                CopyOnWriteArrayList<PriorityProtocol> value2 = c697210RWlBp2.LLJIJIL.getValue();
                if (value2 != null) {
                    value2.clear();
                }
                C0RYF.LIZIZ(c697210RWlBp2.LLJIJIL, new CopyOnWriteArrayList());
            }
        }
        return Unit.LIZ;
    }
}
