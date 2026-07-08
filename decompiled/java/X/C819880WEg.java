package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819880WEg implements InterfaceC820060WEy<C819880WEg> {
    public static final C819910WEj LIZLLL = new C0WF0() { // from class: X.0WEj
        @Override // X.C0WF8
        public final void LIZ(Object obj, C0WF5 c0wf5) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Couldn't find encoder for type ");
            sbLIZ.append(obj.getClass().getCanonicalName());
            throw new C820040WEw(C2188811AlT.LIZIZ(sbLIZ));
        }
    };
    public final Map<Class<?>, C0WF0<?>> LIZ = new HashMap();
    public final Map<Class<?>, C0WF4<?>> LIZIZ = new HashMap();
    public final C819910WEj LIZJ = LIZLLL;

    @Override // X.InterfaceC820060WEy
    public final InterfaceC820060WEy LIZ(Class cls, C0WF0 c0wf0) {
        ((HashMap) this.LIZ).put(cls, c0wf0);
        ((HashMap) this.LIZIZ).remove(cls);
        return this;
    }
}
