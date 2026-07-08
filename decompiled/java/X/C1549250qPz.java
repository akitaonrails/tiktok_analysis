package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549250qPz extends C09AY implements Function0<C201900q9> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ C238400w2 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1549250qPz(String str, Object obj, C013C c013c, long j, long j2, long j3, long j4, C238400w2 c238400w2) {
        super(0);
        this.LL = obj;
        this.LLILLJJLI = c013c;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = j4;
        this.LLIZ = c238400w2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.00q9] */
    @Override // kotlin.jvm.functions.Function0
    public final C201900q9 invoke() {
        final Object obj = this.LL;
        final long j = this.LLILLL;
        final long j2 = this.LLILZ;
        final long j3 = this.LLILZIL;
        final long j4 = this.LLILZLL;
        final long j5 = this.LLIZ.element;
        return new Object(obj, j, j2, j3, j4, j5) { // from class: X.00q9
            public final Object LIZ;

            {
                JSONObject jSONObject = new JSONObject();
                this.LIZ = obj;
                jSONObject.put("Expression Launch", j);
                jSONObject.put("Find Cache", j2);
                jSONObject.put("Parse Finish", j3);
                jSONObject.put("Evaluate Finish", j4);
                long j6 = j2 - j;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(j6);
                sbLIZ.append("ns | %.3fμs");
                jSONObject.put("Find Cost", C786410Ut5.j4(C2188811AlT.LIZIZ(sbLIZ), Arrays.copyOf(new Object[]{Double.valueOf(j6 / 1000.0d)}, 1)));
                long j7 = j3 - j2;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(j7);
                sbLIZ2.append("ns | %.3fμs");
                jSONObject.put("Parse Cost", C786410Ut5.j4(C2188811AlT.LIZIZ(sbLIZ2), Arrays.copyOf(new Object[]{Double.valueOf(j7 / 1000.0d)}, 1)));
                long j8 = j4 - j3;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(j8);
                sbLIZ3.append("ns | %.3fμs");
                jSONObject.put("Evaluate Cost", C786410Ut5.j4(C2188811AlT.LIZIZ(sbLIZ3), Arrays.copyOf(new Object[]{Double.valueOf(j8 / 1000.0d)}, 1)));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(j5);
                sbLIZ4.append("ns | %.3fμs");
                jSONObject.put("Test Parse Cost", C786410Ut5.j4(C2188811AlT.LIZIZ(sbLIZ4), Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1000.0d)}, 1)));
            }
        };
    }
}
