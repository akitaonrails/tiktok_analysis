package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0f08, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110380f08 extends AbstractC1110480f0I<String, EmoteModel> {
    public final C513300KBc LIZ;

    public C1110380f08(C513300KBc c513300KBc) {
        this.LIZ = c513300KBc;
    }

    public final Map<EmoteModel, Drawable> LIZ(List<? extends EmoteModel> list, EnumC1110450f0F enumC1110450f0F, Function1<? super Map<EmoteModel, ? extends Drawable>, Unit> function1, LifecycleOwner lifecycleOwner, HashMap<String, EmoteModel> map) {
        Drawable drawableNewDrawable;
        EmoteModel emoteModel;
        if (function1 != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (EmoteModel emoteModel2 : list) {
                if (!map.containsKey(emoteModel2.emoteId) || (emoteModel = map.get(emoteModel2.emoteId)) == null || emoteModel.emoteResource == null) {
                    ArrayList<C1110410f0B<Function1<Map<EmoteModel, ? extends Drawable>, Unit>>> arrayList = C1110390f09.LJIIIIZZ;
                    if (!arrayList.isEmpty()) {
                        arrayList = C1110390f09.LJIIJJI;
                    }
                    arrayList.add(new C1110410f0B<>(new WeakReference(function1), enumC1110450f0F, list, lifecycleOwner));
                }
            }
        }
        int i = C1110390f09.LJI.LIZ.get(enumC1110450f0F.ordinal());
        HashMap map2 = new HashMap();
        this.LIZ.getClass();
        for (Map.Entry entry : C513300KBc.LIZIZ(list, enumC1110450f0F, map, false).entrySet()) {
            Drawable.ConstantState constantState = ((Drawable) entry.getValue()).mutate().getConstantState();
            if (constantState != null && (drawableNewDrawable = constantState.newDrawable()) != null) {
                drawableNewDrawable.setBounds(0, 0, i, i);
                map2.put(entry.getKey(), drawableNewDrawable);
                if (entry.getValue() instanceof GradientDrawable) {
                    C1110390f09.LJ.put(enumC1110450f0F, drawableNewDrawable);
                }
            }
        }
        if (function1 != null) {
            function1.invoke(map2);
            C1110390f09 c1110390f09 = C1110390f09.LIZ;
        }
        return map2;
    }
}
