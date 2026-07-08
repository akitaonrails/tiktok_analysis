package Y;

import X.AbstractC401801hI;
import X.C0U74;
import X.C2296808zG;
import X.C396001gM;
import X.C396401gQ;
import X.C403601ha;
import X.C491401vk;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import X.InterfaceC760840Tsw;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class AgS77S1200000_12 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS77S1200000_12 agS77S1200000_12, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object next;
        AbstractC401801hI abstractC401801hI = (AbstractC401801hI) obj;
        if (abstractC401801hI instanceof C396001gM) {
            C396001gM c396001gM = (C396001gM) abstractC401801hI;
            if (Intrinsics.LJFF(c396001gM.LIZ, "multi")) {
                List<T> list = c396001gM.LIZIZ;
                String str = agS77S1200000_12.s0;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LiveEffect liveEffect = (LiveEffect) next;
                if (liveEffect != null) {
                    ((InterfaceC760840Tsw) agS77S1200000_12.l1).LIZ(liveEffect);
                }
                C2296808zG.LIZJ((InterfaceC497601wk) agS77S1200000_12.l2, null);
            }
        } else if ((abstractC401801hI instanceof C491401vk) && Intrinsics.LJFF(((C491401vk) abstractC401801hI).LIZ, "multi")) {
            C2296808zG.LIZJ((InterfaceC497601wk) agS77S1200000_12.l2, null);
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS77S1200000_12 agS77S1200000_12, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object next;
        AbstractC401801hI abstractC401801hI = (AbstractC401801hI) obj;
        if (abstractC401801hI instanceof C403601ha) {
            C403601ha c403601ha = (C403601ha) abstractC401801hI;
            if (!c403601ha.LIZ.isEmpty() && !((C0U74) ListProtector.get(c403601ha.LIZ, 0)).LIZIZ.isEmpty()) {
                List<T> list = ((C0U74) ListProtector.get(c403601ha.LIZ, 0)).LIZIZ;
                String str = agS77S1200000_12.s0;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LiveEffect liveEffect = (LiveEffect) next;
                if (liveEffect == null) {
                    InterfaceC760840Tsw interfaceC760840Tsw = (InterfaceC760840Tsw) ((WeakReference) agS77S1200000_12.l1).get();
                    if (interfaceC760840Tsw != null) {
                        interfaceC760840Tsw.onFail();
                    }
                } else {
                    InterfaceC760840Tsw interfaceC760840Tsw2 = (InterfaceC760840Tsw) ((WeakReference) agS77S1200000_12.l1).get();
                    if (interfaceC760840Tsw2 != null) {
                        interfaceC760840Tsw2.LIZ(liveEffect);
                    }
                }
            } else {
                InterfaceC760840Tsw interfaceC760840Tsw3 = (InterfaceC760840Tsw) ((WeakReference) agS77S1200000_12.l1).get();
                if (interfaceC760840Tsw3 != null) {
                    interfaceC760840Tsw3.onFail();
                }
            }
            C2296808zG.LIZJ((InterfaceC497601wk) agS77S1200000_12.l2, null);
        } else if (abstractC401801hI instanceof C396401gQ) {
            InterfaceC760840Tsw interfaceC760840Tsw4 = (InterfaceC760840Tsw) ((WeakReference) agS77S1200000_12.l1).get();
            if (interfaceC760840Tsw4 != null) {
                interfaceC760840Tsw4.onFail();
            }
            C2296808zG.LIZJ((InterfaceC497601wk) agS77S1200000_12.l2, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS77S1200000_12(Object obj, WeakReference<InterfaceC760840Tsw> weakReference, InterfaceC497601wk interfaceC497601wk, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = weakReference;
        this.s0 = interfaceC497601wk;
    }
}
