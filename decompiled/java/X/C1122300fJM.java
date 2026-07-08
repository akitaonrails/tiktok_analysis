package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0fJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122300fJM extends C09AY implements Function1<AbstractC1122140fJ6, Unit> {
    public final /* synthetic */ C1122470fJd LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Room LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122300fJM(C1122470fJd c1122470fJd, String str, Room room) {
        super(1);
        this.LL = c1122470fJd;
        this.LLILLJJLI = str;
        this.LLILLL = room;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1122140fJ6 abstractC1122140fJ6) throws JSONException {
        AbstractC1122140fJ6 abstractC1122140fJ62 = abstractC1122140fJ6;
        boolean z = true;
        if (abstractC1122140fJ62 instanceof C1122130fJ5) {
            float fLIZ = C1122290fJL.LIZ(((C1122130fJ5) abstractC1122140fJ62).LIZ);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("score", Float.valueOf(fLIZ));
            pairArr[1] = new Pair("threshold", Float.valueOf(0.5f));
            if (fLIZ <= 0.5f) {
                z = false;
            }
            pairArr[2] = new Pair("triggered", Boolean.valueOf(z));
            C051E.LIZ("comment.client.result", pairArr);
            if (fLIZ > 0.5f) {
                this.LL.LIZ();
            }
        } else if (abstractC1122140fJ62 instanceof C1122120fJ4) {
            C051E.LIZ("comment.client.error", new Pair("fallback", "server_ai"));
            this.LL.LIZIZ(this.LLILLL, this.LLILLJJLI);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
