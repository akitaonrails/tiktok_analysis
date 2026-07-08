package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122560fJm extends C09AY implements Function1<C0KAJ, Unit> {
    public final /* synthetic */ Room LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122560fJm(Room room, String str, String str2, Map<String, String> map) {
        super(1);
        this.LL = room;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0KAJ c0kaj) {
        if (c0kaj == C0KAJ.AUTO_TIMEOUT) {
            C20441214yg.LIZIZ("DM_guidance", "showDmCreatorTooltip onAutoTimeout");
            C206200qq.LIZIZ(this.LL, "ignore", this.LLILLJJLI, this.LLILLL, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
