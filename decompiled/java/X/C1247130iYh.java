package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.ur.alias.IAliasService;
import java.util.List;

/* JADX INFO: renamed from: X.0iYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247130iYh {
    public final List<C1247510iZJ> LIZ;
    public final int LIZIZ;

    public C1247130iYh(List<C1247510iZJ> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }

    public final void LIZ(FragmentManager fragmentManager, String str, C1243410iSh c1243410iSh) {
        if (this.LIZ != null && (!r0.isEmpty())) {
            ((IAliasService) ServiceManager.get().getService(IAliasService.class)).LJIIJ(c1243410iSh);
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJI(this.LIZ);
            c1390850mIV.LIZLLL(this.LIZIZ);
            c1390850mIV.LIZJ().show(fragmentManager, str);
        }
    }
}
