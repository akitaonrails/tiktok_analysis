package X;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.1BVO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1BVO {
    LOAD_URL_1,
    LOAD_URL_2,
    ADD_JAVASCRIPT_INTERFACE,
    EVALUATE_JAVASCRIPT,
    DESTROY,
    RELOAD,
    GO_BACK,
    CAN_GO_BACK,
    GO_FORWARD,
    CAN_GO_FORWARD,
    STOP_LOADING,
    INIT;

    public Method LL;

    public static C1BVO valueOf(String str) {
        return (C1BVO) C08FF.LIZ(C1BVO.class, str);
    }

    public final void LIZJ(Method method) {
        if (this.LL == null) {
            this.LL = method;
            method.setAccessible(true);
        }
    }

    public final Object LJFF(Object obj, Object... objArr) {
        return C2204961BRm.a0(this.LL, obj, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFH2MzfgA7DPlu2q2auOVUTB5Pc", null));
    }
}
