package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885060z9c extends C09AY implements InterfaceC1631620sYq<String, Float, Long, Unit> {
    public final /* synthetic */ VideoFeedCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885060z9c(VideoFeedCard videoFeedCard) {
        super(3);
        this.LL = videoFeedCard;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Float f, Long l) {
        f.floatValue();
        long jLongValue = l.longValue();
        if (this.LL.LJJIIZ()) {
            VideoFeedCard videoFeedCard = this.LL;
            if (!videoFeedCard.LLJJIJI) {
                int i = 0;
                videoFeedCard.LLLFF = false;
                Iterator it2 = ((ArrayList) videoFeedCard.LLJJJJ).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((C1885390zA9) it2.next()).LIZ.id, str)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBackClicked index=");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("VideoFeedCard", C2188811AlT.LIZIZ(sbLIZ));
                if (i >= 0) {
                    this.LL.LJJJJZI(i, jLongValue);
                }
            }
        }
        return Unit.LIZ;
    }
}
