package X;

import X.AbstractC1643460srw;
import com.bytedance.ies.effecteditor.swig.UIAnnotationBase;
import com.bytedance.ies.effecteditor.swig.UIAnnotationCategory;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: X.0tR4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1665240tR4<T extends AbstractC1643460srw<?>, U extends UIAnnotationBase> {
    public T LIZ;
    public final C1643340srk LIZIZ;
    public final U LIZJ;

    public abstract UIAnnotationErrorCode LIZIZ();

    public final String LIZ() {
        U u = this.LIZJ;
        return u != null ? u.getName() : "";
    }

    public AbstractC1665240tR4(U u, C1DPK c1dpk) {
        UIAnnotationCategory category;
        Map<String, C1643340srk> map;
        this.LIZJ = u;
        new WeakReference(c1dpk);
        this.LIZ = null;
        this.LIZIZ = null;
        if (u == null || (category = u.getCategory()) == null || (map = c1dpk.LJFF) == null) {
            return;
        }
        this.LIZIZ = map.get(category.getName());
    }
}
