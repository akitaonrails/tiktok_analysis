package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14gH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20327114gH extends C09AY implements Function1<Map<String, String>, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20327114gH(long j, String str) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, String> map) {
        Map<String, String> map2 = map;
        map2.put("duration", String.valueOf(this.LL));
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        map2.put("source_id", str);
        return Unit.LIZ;
    }
}
