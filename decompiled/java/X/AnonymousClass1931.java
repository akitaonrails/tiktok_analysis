package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.shortvideo.component.option.manager.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.1931, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AnonymousClass1931<VIEW_HOLDER extends n, STATE, ACTION> {
    public LifecycleOwner LIZ;
    public final Map<AbstractC1738640vLS, List<Function0<Unit>>> LIZIZ = new LinkedHashMap();

    public abstract void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj);

    public abstract VIEW_HOLDER LJ(Context context, ViewGroup viewGroup);

    public void LJFF(VIEW_HOLDER view_holder) {
    }

    public void LJI(VIEW_HOLDER view_holder) {
    }

    public static void LIZJ(AnonymousClass1931 anonymousClass1931, LiveState liveState, AbstractC1738640vLS abstractC1738640vLS, Function1 function1) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        anonymousClass1931.getClass();
        anonymousClass1931.LIZ(liveState, abstractC1738640vLS, state, new AwS597S0100000_18(function1, (Function1<? super InterfaceC1747020vYy, Unit>) 562));
    }

    public final <T> void LIZ(LiveState<T> liveState, AbstractC1738640vLS abstractC1738640vLS, Lifecycle.State state, Function1<? super T, Unit> function1) {
        LifecycleOwner lifecycleOwner = this.LIZ;
        if (lifecycleOwner == null) {
            ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishOptionViewFactory ");
            sbLIZ.append(this);
            sbLIZ.append(" lifecycleOwner is null");
            C193S.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZIZ;
        Object arrayList = linkedHashMap.get(abstractC1738640vLS);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(abstractC1738640vLS, arrayList);
        }
        ((List) arrayList).add(liveState.LJIIIZ(lifecycleOwner, state, function1));
    }
}
