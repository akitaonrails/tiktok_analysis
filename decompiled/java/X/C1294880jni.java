package X;

import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294880jni {
    public final List<AbstractC1295190joD<C1293780jlw, Path>> LIZ;
    public final List<AbstractC1295190joD<Integer, Integer>> LIZIZ;
    public final List<C1295690jp1> LIZJ;

    public C1294880jni(List<C1295690jp1> list) {
        this.LIZJ = list;
        this.LIZ = new ArrayList(list.size());
        this.LIZIZ = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            List<AbstractC1295190joD<C1293780jlw, Path>> list2 = this.LIZ;
            C1294530jn9 c1294530jn9 = ((C1295690jp1) ListProtector.get(list, i)).LIZIZ;
            c1294530jn9.getClass();
            ((ArrayList) list2).add(new C1294450jn1(c1294530jn9.LIZ));
            C1295460joe c1295460joe = ((C1295690jp1) ListProtector.get(list, i)).LIZJ;
            ((ArrayList) this.LIZIZ).add(c1295460joe.LIZ());
        }
    }
}
