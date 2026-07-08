package X;

import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568330qul extends C09AY implements Function1<C0RUS, Unit> {
    public C1568330qul() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        C19719912Dl c19719912DlLJIIL;
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        C0RUS c0rus2 = c0rus;
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null) {
            c19719912DlLJIIL = interfaceC1577280r9CLIZ.LJIIL();
        } else {
            c19719912DlLJIIL = null;
        }
        c0rus2.LL = c19719912DlLJIIL;
        return Unit.LIZ;
    }
}
