package X;

import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0jFV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1273670jFV implements InvocationHandler {
    public final InterfaceC1272540jDg LL;
    public WeakReference<Object> LLILLJJLI;

    public C1273670jFV(InterfaceC1272540jDg interfaceC1272540jDg) {
        this.LL = interfaceC1272540jDg;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String str;
        boolean z = true;
        if (method.getName().equals("onMessageReceived")) {
            if (C1268530j7D.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invoke method:");
                sbLIZ.append(method);
                sbLIZ.append(" args ");
                sbLIZ.append(objArr.length);
                sbLIZ.append(" listener ");
                sbLIZ.append(this.LL);
                AVLog.d("VideoEffectUtilsWrapper", C2188811AlT.LIZIZ(sbLIZ));
            }
            int iIntValue = ((Integer) objArr[0]).intValue();
            int iIntValue2 = ((Integer) objArr[1]).intValue();
            int iIntValue3 = ((Integer) objArr[2]).intValue();
            Object obj2 = objArr[3];
            if (obj2 == null) {
                str = "";
            } else {
                str = (String) obj2;
            }
            InterfaceC1272540jDg interfaceC1272540jDg = this.LL;
            if (interfaceC1272540jDg != null) {
                interfaceC1272540jDg.onMessageReceived(iIntValue, iIntValue2, iIntValue3, str);
            }
            return obj;
        }
        if (objArr == null) {
            objArr = C1272380jDQ.LJ;
        }
        if (objArr.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        if (objArr.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == Object.class) {
            Object obj3 = objArr[0];
            if (obj3 == null) {
                return Boolean.FALSE;
            }
            if (obj == obj3) {
                return Boolean.TRUE;
            }
            Class<?> cls = obj.getClass();
            if ((!cls.isInstance(obj3) && (!Proxy.isProxyClass(obj3.getClass()) || !Arrays.equals(obj3.getClass().getInterfaces(), cls.getInterfaces()))) || !equals(Proxy.getInvocationHandler(obj3))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (objArr.length == 0 && method.getName().equals("toString")) {
            return toString();
        }
        return obj;
    }
}
