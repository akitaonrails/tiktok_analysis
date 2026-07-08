package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.search.ISearchServiceLite;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceLiteImpl;

/* JADX INFO: renamed from: X.0QzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688420QzQ implements ISearchServiceLite {
    public static final C688420QzQ LIZIZ = new C688420QzQ();
    public final /* synthetic */ ISearchServiceLite LIZ;

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LIZ(long j, String str) {
        this.LIZ.LIZ(j, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LIZJ(String str) {
        this.LIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LIZLLL(String str) {
        this.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LJ(Context context, Bundle bundle) {
        this.LIZ.LJ(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LJFF(View view, Throwable th) {
        this.LIZ.LJFF(view, th);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LJI(C19EG c19eg, Bundle bundle) {
        this.LIZ.LJI(c19eg, bundle);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LJII(Throwable th) {
        this.LIZ.LJII(th);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchServiceLite
    public final void LJIIIIZZ(String str, long j) {
        this.LIZ.LJIIIIZZ(str, j);
    }

    public C688420QzQ() {
        Object objLIZ = C04TD.LIZ(ISearchServiceLite.class, false);
        this.LIZ = objLIZ != null ? (ISearchServiceLite) objLIZ : new SearchServiceLiteImpl();
    }
}
