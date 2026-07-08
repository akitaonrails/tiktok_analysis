package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885250z9v extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ VideoFeedCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885250z9v(VideoFeedCard videoFeedCard) {
        super(1);
        this.LL = videoFeedCard;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        final String str2 = str;
        final VideoFeedCard videoFeedCard = this.LL;
        RunnableC781530UlD runnableC781530UlD = videoFeedCard.LLJJJ;
        if (runnableC781530UlD != null) {
            C476770Imp.LIZJ(runnableC781530UlD, new Runnable() { // from class: X.0z9Z
                public final void LIZ() {
                    VideoFeedCard videoFeedCard2 = videoFeedCard;
                    if (videoFeedCard2.LLJJIJI) {
                        return;
                    }
                    List<C1885390zA9> list = videoFeedCard2.LLJJJJ;
                    String str3 = str2;
                    Iterator it2 = ((ArrayList) list).iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(((C1885390zA9) it2.next()).LIZ.id, str3)) {
                            if (i >= 0) {
                                if (Math.abs(i - videoFeedCard.LLLF) >= 1 || i >= 2) {
                                    Unit unit = null;
                                    videoFeedCard.LJJJI(null, "try_expand_page");
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("smoothScrollToPosition =");
                                    sbLIZ.append(i);
                                    sbLIZ.append(' ');
                                    C20441214yg.LIZIZ("VideoFeedCard", C2188811AlT.LIZIZ(sbLIZ));
                                    try {
                                        RunnableC781530UlD runnableC781530UlD2 = videoFeedCard.LLJJJ;
                                        if (runnableC781530UlD2 != null) {
                                            runnableC781530UlD2.smoothScrollToPosition(i);
                                            unit = Unit.LIZ;
                                        }
                                        C189200o6.m2constructorimpl(unit);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C189200o6.m2constructorimpl(new C098200Yq(th));
                                    }
                                    if (i >= 2) {
                                        return;
                                    }
                                }
                                videoFeedCard.LJJL();
                                return;
                            }
                            return;
                        }
                        i++;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoFeedCard@7810.setupVideoFeedConfig$scrollCallback$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoFeedCard@7810.setupVideoFeedConfig$scrollCallback$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
