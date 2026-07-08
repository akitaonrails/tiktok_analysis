package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446940nky {
    public final Set<String> LIZ = new LinkedHashSet();

    public static void LIZ(C1446940nky c1446940nky, Function1 function1) {
        Set setSingleton = Collections.singleton(EnumC1403260mcW.ALL);
        c1446940nky.getClass();
        Map<String, Pair<Set<EnumC1403260mcW>, Function1<VideoPublishEditModel, List<String>>>> map = C1446960nl0.LIZIZ;
        if (!((ConcurrentHashMap) map).containsKey("tiktok_vc_audio")) {
            c1446940nky.LIZ.add("tiktok_vc_audio");
            ((ConcurrentHashMap) map).put("tiktok_vc_audio", new Pair(setSingleton, new C1155804fc("tiktok_vc_audio", function1)));
        }
    }
}
