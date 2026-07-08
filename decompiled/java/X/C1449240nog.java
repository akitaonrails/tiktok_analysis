package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449240nog {
    public static final /* synthetic */ int LIZIZ = 0;
    public final CreativeModel LIZ;

    public final void LIZ() {
        Map<Class<?>, Function1<Effect, InterfaceC1282004zy>> map = C1905007dA.LIZ;
        CreativeModel creativeModel = this.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = C1905007dA.LIZIZ.values().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Function1) it2.next()).invoke(creativeModel));
        }
        C1449300nom c1449300nom = this.LIZ.propETGroupModel;
        c1449300nom.LIZ.clear();
        c1449300nom.LIZ.addAll(arrayList);
    }

    public C1449240nog(CreativeModel creativeModel) {
        this.LIZ = creativeModel;
    }
}
