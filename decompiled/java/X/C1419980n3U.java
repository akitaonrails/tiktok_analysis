package X;

import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import java.util.Map;

/* JADX INFO: renamed from: X.0n3U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419980n3U implements Map.Entry<String, String> {
    public UnorderedMapStrStr.Iterator LL;
    public final /* synthetic */ UnorderedMapStrStr LLILLJJLI;

    @Override // java.util.Map.Entry
    public final String getKey() {
        UnorderedMapStrStr.Iterator iterator = this.LL;
        return SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getKey(iterator.LIZ, iterator);
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        UnorderedMapStrStr.Iterator iterator = this.LL;
        return SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
    }

    public C1419980n3U(UnorderedMapStrStr unorderedMapStrStr) {
        this.LLILLJJLI = unorderedMapStrStr;
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        UnorderedMapStrStr.Iterator iterator = this.LL;
        String strUnorderedMapStrStr_Iterator_getValue = SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
        UnorderedMapStrStr.Iterator iterator2 = this.LL;
        SmartMovieJniJNI.UnorderedMapStrStr_Iterator_setValue(iterator2.LIZ, iterator2, str);
        return strUnorderedMapStrStr_Iterator_getValue;
    }
}
