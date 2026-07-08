package X;

import com.ss.android.ugc.aweme.services.IFoundationAVService;
import java.util.ArrayList;
import java.util.Arrays;
import jgp.h;

/* JADX INFO: renamed from: X.0tLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661680tLK implements IFoundationAVService.IFetchResourcesListener {
    public final /* synthetic */ h LIZ;

    public C1661680tLK(h hVar) {
        this.LIZ = hVar;
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onFailed(Exception exc) {
        this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onSuccess(String[] strArr) {
        ((ArrayList) C07PS.LIZ).addAll(C1697810uHb.LJIIJJI(Arrays.copyOf(strArr, strArr.length)));
        this.LIZ.LJIIJ();
    }
}
