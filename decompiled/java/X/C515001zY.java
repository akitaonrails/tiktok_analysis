package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import webcast.api.game.TnsPiracyDetail;

/* JADX INFO: renamed from: X.01zY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C515001zY implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public static final void run$0(C515001zY c515001zY) {
        Map<String, Object> map = C1338270kvh.LIZ;
        Iterator it2 = ((List) c515001zY.l0).iterator();
        while (it2.hasNext()) {
            C471201sU.LIZIZ((TnsPiracyDetail) it2.next());
            it2.remove();
        }
    }

    public static final void run$1(C515001zY c515001zY) {
        Function2 function2 = (Function2) c515001zY.l0;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, -5003);
        }
    }

    public static final void run$2(C515001zY c515001zY) {
        ((Function0) c515001zY.l0).invoke();
    }

    public C515001zY(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
