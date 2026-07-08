package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.160k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207052160k extends C09AY implements Function2<CLACaptionAssemV2, C291001Au<? extends Integer>, Unit> {
    public C207052160k() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CLACaptionAssemV2 cLACaptionAssemV2, C291001Au<? extends Integer> c291001Au) {
        final Aweme aweme;
        VideoItemParams item;
        final CLACaptionAssemV2 cLACaptionAssemV22 = cLACaptionAssemV2;
        C291001Au<? extends Integer> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            int iIntValue = ((Number) c291001Au2.LIZ).intValue();
            VideoItemParams item2 = cLACaptionAssemV22.Bp().getItem();
            if (item2 != null && (aweme = item2.getAweme()) != null && (item = cLACaptionAssemV22.Bp().getItem()) != null && iIntValue == item.currentPosition && C295340Bhs.LIZ()) {
                C786410Ut5.LJJZZIII(cLACaptionAssemV22.Ep().LLIILII(), new Runnable() { // from class: X.160r
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CLACaptionAssemV2@7287.subscribePlayViewModel$2$1");
                        try {
                            cLACaptionAssemV22.Gp(aweme);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CLACaptionAssemV2@7287.subscribePlayViewModel$2$1");
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}
