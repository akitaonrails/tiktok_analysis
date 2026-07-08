package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0f0B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110410f0B<T> extends AbstractC1110430f0D<T, EmoteModel> {
    @Override // X.AbstractC1110430f0D
    public final boolean LIZ(HashMap<String, EmoteModel> map) {
        EmoteModel emoteModel;
        List<M> list = this.LIZJ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (M m : list) {
                if (map.containsKey(m.emoteId) && (emoteModel = map.get(m.emoteId)) != null && emoteModel.emoteResource != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public C1110410f0B(WeakReference<T> weakReference, EnumC1110450f0F enumC1110450f0F, List<? extends EmoteModel> list, LifecycleOwner lifecycleOwner) {
        super(weakReference, enumC1110450f0F, list, lifecycleOwner);
    }
}
