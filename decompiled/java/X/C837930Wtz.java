package X;

import android.util.LruCache;
import com.bytedance.bpea.basics.Cert;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wtz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837930Wtz extends C09AY implements Function0<String> {
    public final /* synthetic */ Locale LL;
    public final /* synthetic */ Cert LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C837930Wtz(Locale locale, Cert cert) {
        super(0);
        this.LL = locale;
        this.LLILLJJLI = cert;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        LruCache<Integer, String> lruCache = C0SRQ.LIZ;
        return C837920Wty.LIZ(this.LL, this.LLILLJJLI);
    }
}
