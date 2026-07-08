package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646290PWp extends C09AY implements Function1<C0PWA, Object> {
    public C646290PWp() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(C0PWA c0pwa) {
        String aid;
        Aweme aweme = (Aweme) c0pwa.LIZJ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }
}
