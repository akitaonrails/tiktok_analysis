package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Phj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651970Phj implements C0QW5<C651970Phj> {
    public static final C651980Phk LLILLL = new C651980Phk();
    public static final List<String> LLILZ = C1697810uHb.LJIIJJI("general_search", "search_result", "goods_search", "inspiration_detail", "visual_search", "smart_search", "smart_search_title");
    public static final List<String> LLILZIL = C1697810uHb.LJIIJJI("homepage_follow", "homepage_hot", "homepage_friends", "homepage_popular", "homepage_topic", "homepage_now", "homepage_nearby", "homepage_explore", "discovery");
    public static final List<String> LLILZLL = C1697810uHb.LJIIJJI("tt_music_consume", "tt_music_create");
    public static final List<String> LLIZ = C1697810uHb.LJIIJJI("tt_lyrics_create", "tt_lyrics_consume");
    public final Map<String, String> LL;
    public final Map<String, Map<String, String>> LLILLJJLI;

    public C651970Phj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C651970Phj)) {
            return false;
        }
        C651970Phj c651970Phj = (C651970Phj) obj;
        return Intrinsics.LJFF(this.LL, c651970Phj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c651970Phj.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchExtraSource(extraParamMap=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", lynxPassThroughParamMap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C651970Phj(int i) {
        this(new LinkedHashMap(), new LinkedHashMap());
    }

    public C651970Phj(Map<String, String> map, Map<String, Map<String, String>> map2) {
        this.LL = map;
        this.LLILLJJLI = map2;
        UUID.randomUUID().toString();
    }
}
