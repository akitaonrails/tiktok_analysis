package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122570fJn extends C09AY implements Function1<C0KAJ, Unit> {
    public final /* synthetic */ C1122670fJx LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ C1122680fJy LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122570fJn(C1122670fJx c1122670fJx, C1122680fJy c1122680fJy, Room room) {
        super(1);
        this.LL = c1122670fJx;
        this.LLILLJJLI = room;
        this.LLILLL = c1122680fJy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0KAJ c0kaj) {
        if (c0kaj == C0KAJ.AUTO_TIMEOUT) {
            C051E.LIZ("bubble.consume", new Pair("sku", this.LL.LIZ), new Pair("method", c0kaj), new Pair("action", "ignore"));
            Room room = this.LLILLJJLI;
            C1122670fJx c1122670fJx = this.LL;
            C1122680fJy c1122680fJy = this.LLILLL;
            C1122600fJq.LIZ(room, "ignore", c1122670fJx, c1122680fJy.LJI, c1122680fJy.LJIIIIZZ);
        } else {
            C051E.LIZ("bubble.consume", new Pair("sku", this.LL.LIZ), new Pair("method", c0kaj), new Pair("action", "not_reported"));
        }
        return Unit.LIZ;
    }
}
