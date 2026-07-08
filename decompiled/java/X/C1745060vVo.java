package X;

import androidx.fragment.app.Fragment;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.widget.Widget;

/* JADX INFO: renamed from: X.0vVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745060vVo {
    public static final C19EG LIZ(Object obj) {
        if (obj instanceof Fragment) {
            return ((Fragment) obj).requireActivity();
        }
        if (obj instanceof C19EG) {
            return (C19EG) obj;
        }
        if (obj instanceof Widget) {
            return LIZ(((Widget) obj).LIZJ());
        }
        if (obj instanceof JediViewHolder) {
            return LIZ(((JediViewHolder) obj).R5());
        }
        throw new IllegalStateException();
    }

    public static final Object LIZIZ(Object obj) {
        if (!(obj instanceof Fragment) && !(obj instanceof C19EG)) {
            if (obj instanceof Widget) {
                return ((Widget) obj).LIZJ();
            }
            if (obj instanceof JediViewHolder) {
                return LIZIZ(((JediViewHolder) obj).R5());
            }
            throw new IllegalStateException();
        }
        return obj;
    }
}
