package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ewt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108370ewt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Room LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108370ewt(Room room) {
        super(0);
        this.LL = room;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.subPinCard = null;
        return Unit.LIZ;
    }
}
