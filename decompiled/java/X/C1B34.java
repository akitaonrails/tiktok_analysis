package X;

import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.entity.WebAuthV2Response;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1B34, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B34 implements C1B31 {
    public final /* synthetic */ AuthCommonViewModel LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.C1B31
    public final void LIZ(WebAuthV2Response webAuthV2Response) {
        this.LIZ.LLJJJJLIIL.postValue(new Pair<>(webAuthV2Response, this.LIZIZ));
    }

    public C1B34(AuthCommonViewModel authCommonViewModel, String str) {
        this.LIZ = authCommonViewModel;
        this.LIZIZ = str;
    }
}
