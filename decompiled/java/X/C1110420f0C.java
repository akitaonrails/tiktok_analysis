package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0f0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110420f0C<T> extends AbstractC1110430f0D<Function1<? super SpannableStringBuilder, ? extends Unit>, EmoteWithIndex> {
    public final T LJ;
    public final Resources LJFF;
    public final WeakReference<Function1<EmoteModel, Unit>> LJI;
    public final WeakReference<Function0<Unit>> LJII;

    @Override // X.AbstractC1110430f0D
    public final boolean LIZ(HashMap<String, EmoteModel> map) {
        String str;
        List<M> list = this.LIZJ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (M m : list) {
                EmoteModel emoteModel = m.emoteModel;
                String str2 = null;
                if (emoteModel != null) {
                    str = emoteModel.emoteId;
                } else {
                    str = null;
                }
                if (map.containsKey(str)) {
                    EmoteModel emoteModel2 = m.emoteModel;
                    if (emoteModel2 != null) {
                        str2 = emoteModel2.emoteId;
                    }
                    EmoteModel emoteModel3 = map.get(str2);
                    if (emoteModel3 != null && emoteModel3.emoteResource != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public C1110420f0C(WeakReference<Function1<SpannableStringBuilder, Unit>> weakReference, EnumC1110450f0F enumC1110450f0F, List<? extends EmoteWithIndex> list, LifecycleOwner lifecycleOwner, T t, Resources resources, WeakReference<Function1<EmoteModel, Unit>> weakReference2, WeakReference<Function0<Unit>> weakReference3) {
        super(weakReference, enumC1110450f0F, list, lifecycleOwner);
        this.LJ = t;
        this.LJFF = resources;
        this.LJI = weakReference2;
        this.LJII = weakReference3;
    }
}
