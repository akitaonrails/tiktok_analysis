package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.1BKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203051BKd extends C09AY implements InterfaceC1631620sYq<Long, List<? extends String>, String, Unit> {
    public final /* synthetic */ Map<String, C2203071BKf> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ JSONArray LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203051BKd(String str, Map map, JSONArray jSONArray) {
        super(3);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = jSONArray;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Long l, List<? extends String> list, String str) {
        l.longValue();
        AtomicBoolean atomicBoolean = C2203061BKe.LIZ;
        C2203061BKe.LIZ(this.LL, this.LLILLJJLI, str, this.LLILLL);
        return Unit.LIZ;
    }
}
