package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.poi.PokerBundle;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.channel.poker.EffectPokerHandler$geocode$2", f = "EffectPokerHandler.kt", l = {}, m = "invokeSuspend")
public final class C1407650mjb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1407680mje LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407650mjb(int i, C1407680mje c1407680mje, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1407680mje;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407650mjb(this.LLILLL, this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IllegalAccessException {
        int i;
        C1C7U.LIZ("EffectPokerHandler@5799.geocode$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1407680mje c1407680mje = this.LL;
        String str = this.LLILLJJLI;
        c1407680mje.getClass();
        JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("body");
        if (jSONObjectOptJSONObject != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble("long_data");
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("lati_data");
            if (!Double.isNaN(dOptDouble) && !Double.isNaN(dOptDouble2)) {
                Pair pair = new Pair(Double.valueOf(dOptDouble), Double.valueOf(dOptDouble2));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Effect interface: ");
                this.LL.getClass();
                sbLIZ.append("POKER");
                sbLIZ.append(" geocode spi call");
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                LruCache<String, PokerBundle> lruCache = C1407700mjg.LIZ;
                Object second = pair.getSecond();
                Object first = pair.getFirst();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(second);
                sbLIZ2.append(',');
                sbLIZ2.append(first);
                String strLIZJ = C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                LruCache<String, PokerBundle> lruCache2 = C1407700mjg.LIZ;
                PokerBundle pokerBundle = lruCache2.get(strLIZJ);
                lruCache2.remove(strLIZJ);
                PokerBundle pokerBundle2 = pokerBundle;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("type", "POKER");
                if (pokerBundle2 == null) {
                    i = -1;
                } else {
                    this.LL.getClass();
                    if (C1407680mje.LJFF(pokerBundle2)) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                }
                c2344009Gk.LIZJ(i, "result");
                C20684815ws.LJIILLIIL("effect_channel_message_result", c2344009Gk.LIZ);
                if (pokerBundle2 != null) {
                    C1407680mje c1407680mje2 = this.LL;
                    long j = this.LLILLL;
                    c1407680mje2.getClass();
                    C1411250mpP.LIZIZ(c1407680mje2, j, C786410Ut5.J3(C1407680mje.LJ(1 ^ (C1407680mje.LJFF(pokerBundle2) ? 1 : 0), pokerBundle2)));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EffectPokerHandler@5799.geocode$2");
                    return unit;
                }
                throw new IllegalAccessException("IPoiService geocode return null");
            }
            throw new IllegalArgumentException("require long or lati is null");
        }
        throw new IllegalArgumentException("require body is null");
    }
}
