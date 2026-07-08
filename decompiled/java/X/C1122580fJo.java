package X;

import com.bytedance.android.livesdk.model.DateFrequencyModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122580fJo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1122670fJx LL;
    public final /* synthetic */ C1122680fJy LLILLJJLI;
    public final /* synthetic */ Room LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122580fJo(C1122670fJx c1122670fJx, C1122680fJy c1122680fJy, Room room) {
        super(0);
        this.LL = c1122670fJx;
        this.LLILLJJLI = c1122680fJy;
        this.LLILLL = room;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C051E.LIZ("bubble.show", new Pair("sku", this.LL.LIZ));
        C1122630fJt c1122630fJt = this.LLILLJJLI.LIZ;
        EnumC1122660fJw enumC1122660fJw = this.LL.LIZ;
        if (c1122630fJt.LIZLLL.invoke().booleanValue()) {
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("sku", enumC1122660fJw);
            pairArr[1] = new Pair("reason", "test_bypass");
            pairArr[2] = new Pair("session", Integer.valueOf(c1122630fJt.LJ));
            pairArr[3] = new Pair("daily", Integer.valueOf(C1122630fJt.LIZIZ()));
            Integer num = (Integer) ((LinkedHashMap) c1122630fJt.LJFF).get(enumC1122660fJw);
            pairArr[4] = new Pair("sku_count", Integer.valueOf(num != null ? num.intValue() : 0));
            C051E.LIZ("frequency.record_show.skip", pairArr);
        } else {
            c1122630fJt.LJ++;
            Map<EnumC1122660fJw, Integer> map = c1122630fJt.LJFF;
            Integer num2 = (Integer) ((LinkedHashMap) map).get(enumC1122660fJw);
            map.put(enumC1122660fJw, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
            c1122630fJt.LJI = System.currentTimeMillis();
            c1122630fJt.LJII = 0;
            C20337914i1<DateFrequencyModel> c20337914i1 = InterfaceC1106030et7.Y7;
            DateFrequencyModel dateFrequencyModelLIZIZ = c20337914i1.LIZIZ();
            if (dateFrequencyModelLIZIZ == null) {
                dateFrequencyModelLIZIZ = new DateFrequencyModel(0L, 0);
            }
            if (!C1387310mCn.LJII(dateFrequencyModelLIZIZ.timestamp)) {
                dateFrequencyModelLIZIZ.timestamp = System.currentTimeMillis();
                dateFrequencyModelLIZIZ.frequencyCount = 0;
            }
            dateFrequencyModelLIZIZ.frequencyCount++;
            c20337914i1.LJFF(dateFrequencyModelLIZIZ);
            C051E.LIZ("frequency.record_show", new Pair("sku", enumC1122660fJw), new Pair("session", Integer.valueOf(c1122630fJt.LJ)), new Pair("daily", Integer.valueOf(C1122630fJt.LIZIZ())), new Pair("sku_count", ((LinkedHashMap) c1122630fJt.LJFF).get(enumC1122660fJw)));
        }
        Room room = this.LLILLL;
        C1122670fJx c1122670fJx = this.LL;
        C1122680fJy c1122680fJy = this.LLILLJJLI;
        C1122600fJq.LIZ(room, "show", c1122670fJx, c1122680fJy.LJI, c1122680fJy.LJIIIIZZ);
        return Unit.LIZ;
    }
}
