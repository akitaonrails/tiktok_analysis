package X;

import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.16CA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16CA {
    public final List<TikTokMediaModel> LIZ;
    public final boolean LIZIZ;

    public C16CA() {
        this(false, 3);
    }

    public /* synthetic */ C16CA(boolean z, int i) {
        ArrayList arrayList;
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        this(arrayList, (i & 2) != 0 ? true : z);
    }

    public C16CA(List<TikTokMediaModel> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
