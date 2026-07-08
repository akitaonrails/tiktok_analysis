package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Nlr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603570Nlr extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C013C LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C603570Nlr(long j, String str, String str2, String str3, String str4, String str5, String str6, C013C c013c, C118300cf c118300cf) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = c013c;
        this.LLJ = c118300cf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("room_id", Long.valueOf(this.LL));
        linkedHashMap.put("room_ids", this.LLILLJJLI);
        linkedHashMap.put("enter_from_merge", this.LLILLL);
        linkedHashMap.put("enter_method", this.LLILZ);
        linkedHashMap.put("has_stream_data", Integer.valueOf(!a0.LJJJIL(this.LLILZIL) ? 1 : 0));
        linkedHashMap.put("has_owner", Integer.valueOf(!a0.LJJJIL(this.LLILZLL) ? 1 : 0));
        linkedHashMap.put("player_tag", this.LLIZ);
        linkedHashMap.put("reuse_player", Integer.valueOf(this.LLIZLLLIL.element ? 1 : 0));
        linkedHashMap.put("reuse_player_error_code", Integer.valueOf(this.LLJ.element));
        c957403oi2.getClass();
        ((HashMap) c957403oi2.LIZ).putAll(linkedHashMap);
        return Unit.LIZ;
    }
}
