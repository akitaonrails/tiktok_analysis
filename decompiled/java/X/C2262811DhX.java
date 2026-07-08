package X;

import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.IUIService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1DhX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262811DhX extends C09AY implements Function0<C2262801DhW> {
    public C2262811DhX() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1DhW] */
    @Override // kotlin.jvm.functions.Function0
    public final C2262801DhW invoke() {
        return new AsyncAVService() { // from class: X.1DhW
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(443));

            @Override // com.ss.android.ugc.aweme.services.AsyncAVService
            public final IUIService uiService() {
                return (C575320MhO) this.LIZ.getValue();
            }
        };
    }
}
