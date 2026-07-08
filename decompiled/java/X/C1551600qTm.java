package X;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0qTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551600qTm extends AbstractC1551580qTk<UpdatePackage, Pair<Uri, UpdatePackage>> {
    public int LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1551580qTk
    public final Pair<Uri, UpdatePackage> LIZLLL() {
        UpdatePackage updatePackage = (UpdatePackage) this.LIZIZ;
        List<String> urlList = updatePackage.getPackage().getUrlList();
        int i = this.LJIIIZ;
        this.LJIIIZ = i + 1;
        return new Pair<>(UriProtector.parse((String) ListProtector.get(urlList, i)), updatePackage);
    }
}
