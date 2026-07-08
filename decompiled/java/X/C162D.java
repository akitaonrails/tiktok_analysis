package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.162D, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C162D extends C09AY implements Function0<C00I7> {
    public final /* synthetic */ WeakReference<Context> LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C162D(WeakReference<Context> weakReference, Aweme aweme, String str) {
        super(0);
        this.LL = weakReference;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C00I7 invoke() {
        return C161N.LIZIZ.LJJIJIIJIL(this.LL, this.LLILLJJLI, this.LLILLL);
    }
}
