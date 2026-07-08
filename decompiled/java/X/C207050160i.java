package X;

import Y.ARunnableS100S0200000_31;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.160i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207050160i extends C09AY implements Function2<CLACaptionAssemV2, C291001Au<? extends String>, Unit> {
    public C207050160i() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CLACaptionAssemV2 cLACaptionAssemV2, C291001Au<? extends String> c291001Au) {
        T t;
        VideoItemParams item;
        Aweme aweme;
        String str;
        CLACaptionAssemV2 cLACaptionAssemV22 = cLACaptionAssemV2;
        C291001Au<? extends String> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (t = c291001Au2.LIZ) != 0 && (item = cLACaptionAssemV22.Bp().getItem()) != null && (aweme = item.getAweme()) != null && Intrinsics.LJFF(t, aweme.getAid())) {
            if (!C295340Bhs.LIZ()) {
                C786410Ut5.LJJZZIII(cLACaptionAssemV22.Ep().LLIILII(), new ARunnableS100S0200000_31(cLACaptionAssemV22, aweme, 5));
            }
            if (C295750BiX.LIZ()) {
                C162B c162b = C162B.LIZIZ;
                C161N c161n = C161N.LIZIZ;
                VideoItemParams item2 = cLACaptionAssemV22.Bp().getItem();
                if (item2 != null) {
                    str = item2.mEventType;
                } else {
                    str = null;
                }
                c162b.eh(aweme, c161n.LJJIJIIJIL(null, aweme, str));
            }
        }
        return Unit.LIZ;
    }
}
