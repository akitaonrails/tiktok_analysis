package X;

import com.bytedance.android.live.broadcast.boards.BoardsPageActionChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Tp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758460Tp6 extends C09AY implements Function1<AbstractC758480Tp8, Unit> {
    public C758460Tp6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC758480Tp8 abstractC758480Tp8) {
        AbstractC758480Tp8 abstractC758480Tp82 = abstractC758480Tp8;
        if (abstractC758480Tp82 instanceof C758490Tp9) {
            C758450Tp5.LL.LIZ();
        } else if (abstractC758480Tp82 instanceof C758500TpA) {
            C758450Tp5.LL.getClass();
            DataChannel dataChannel = C758450Tp5.LLILLJJLI;
            if (dataChannel != null) {
                final Map<String, String> map = C758450Tp5.LLILLL;
                dataChannel.zW(BoardsPageActionChannel.class, new AbstractC758530TpD(map) { // from class: X.0TpF
                });
            }
        }
        return Unit.LIZ;
    }
}
