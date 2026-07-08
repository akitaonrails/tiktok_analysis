package X;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1385950mAb extends C2217421BqW implements Function1<Integer, Map<String, ? extends Object>> {
    public C1385950mAb(Object obj) {
        super(1, obj, C1385990mAf.class, "generatePostDelimiterUnderscoreMatcher", "generatePostDelimiterUnderscoreMatcher(I)Ljava/util/Map;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, ? extends Object> invoke(Integer num) {
        int iIntValue = num.intValue();
        this.receiver.getClass();
        return C2097608Jq.LJIIIIZZ(new Pair("matcher", C2097608Jq.LJIIIIZZ(new Pair("type", "post_delimiter"), new Pair("delimiter", "_"), new Pair("event_tracking", C2097908Jt.LIZJ(new Pair("match_type", "delimiter_underscore"))))), new Pair("query_preprocessor", Collections.singletonList(C2097908Jt.LIZJ(new Pair("type", "case")))), new Pair("target_preprocessor", Collections.singletonList(C2097908Jt.LIZJ(new Pair("type", "case")))), new Pair("dimension", Integer.valueOf(iIntValue)), new Pair("threshold", Double.valueOf(1.0d)));
    }
}
