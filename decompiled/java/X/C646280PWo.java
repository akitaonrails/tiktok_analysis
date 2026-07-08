package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646280PWo extends C09AY implements Function1<C0PWA, Object> {
    public C646280PWo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(C0PWA c0pwa) {
        SearchResultParam searchResultParam;
        String string;
        Object obj = c0pwa.LIZJ;
        if (!(obj instanceof SearchResultParam) || (searchResultParam = (SearchResultParam) obj) == null || (string = Integer.valueOf(searchResultParam.getBindingId()).toString()) == null) {
            return "";
        }
        return string;
    }
}
