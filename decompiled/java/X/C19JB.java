package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19JB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JB {
    public final List<C19J9> LIZ;
    public List<C19J8> LIZIZ = new ArrayList();
    public final Context LIZJ;
    public final C19JH LIZLLL;

    public C19JB(Context context, C19JH c19jh, List<C19J9> list) {
        this.LIZLLL = c19jh;
        this.LIZJ = context;
        this.LIZ = list;
        if (!list.isEmpty()) {
            for (int i = 0; i < this.LIZ.size(); i++) {
                C19J9 c19j9 = (C19J9) ListProtector.get(this.LIZ, i);
                if (c19j9 != null) {
                    ((ArrayList) this.LIZIZ).add(new C19J8(this.LIZJ, this.LIZLLL, c19j9));
                }
            }
        }
    }
}
