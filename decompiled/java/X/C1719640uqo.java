package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719640uqo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719640uqo(long j, String str, int i, boolean z, Map map) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        HashMap map = new HashMap();
        int i = this.LL;
        boolean z = this.LLILLJJLI;
        String str = this.LLILLL;
        long j = this.LLILZ;
        Map<String, String> map2 = this.LLILZIL;
        map.put("ec_message_cnt", String.valueOf(i));
        map.put("is_load_data", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        map.put("quit_type", str);
        map.put("stay_time", String.valueOf(j));
        map.putAll(map2);
        C20684815ws.LJIILLIIL("tiktokec_stay_page", map);
        return Unit.LIZ;
    }
}
