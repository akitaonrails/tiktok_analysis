package X;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mAZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1385930mAZ extends C2217421BqW implements Function1<Integer, Map<String, ? extends Object>> {
    public C1385930mAZ(Object obj) {
        super(1, obj, C1385990mAf.class, "generateFuzzyMatcher", "generateFuzzyMatcher(I)Ljava/util/Map;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, ? extends Object> invoke(Integer num) {
        int iIntValue = num.intValue();
        this.receiver.getClass();
        return C2097608Jq.LJIIIIZZ(new Pair("matcher", C2097608Jq.LJIIIIZZ(new Pair("type", "psp"), new Pair("scene_key", "social_search_matcher"), new Pair("strategy_key", "damerau_levenshtein_matcher"), new Pair("extra_params", C2097908Jt.LIZJ(new Pair("max_edit_distance", 1))), new Pair("event_tracking", C2097908Jt.LIZJ(new Pair("match_type", "fuzzy_dl"))))), new Pair("filter", C2097608Jq.LJIIIIZZ(new Pair("type", "psp"), new Pair("scene_key", "social_search_matching_filter"), new Pair("strategy_key", "query>=3_diff<=1_count<=1000"), new Pair("extra_params", C2097908Jt.LIZJ(new Pair("include_source", Boolean.TRUE))))), new Pair("query_preprocessor", Collections.singletonList(C2097908Jt.LIZJ(new Pair("type", "case")))), new Pair("target_preprocessor", Collections.singletonList(C2097908Jt.LIZJ(new Pair("type", "case")))), new Pair("dimension", Integer.valueOf(iIntValue)), new Pair("threshold", Double.valueOf(1.0d)));
    }
}
