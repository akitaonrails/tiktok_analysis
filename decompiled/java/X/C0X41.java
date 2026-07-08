package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import xlp.c;

/* JADX INFO: renamed from: X.0X41, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0X41 implements InvocationHandler {
    public final List<String> LL;
    public boolean LLILLJJLI;
    public String LLILLL;

    public C0X41(List<String> list) {
        this.LL = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = c.LIZIZ;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.LLILLJJLI = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.LL;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (this.LL.contains(ListProtector.get(list, i))) {
                        String str = (String) ListProtector.get(list, i);
                        this.LLILLL = str;
                        return str;
                    }
                }
                String str2 = (String) ListProtector.get(this.LL, 0);
                this.LLILLL = str2;
                return str2;
            }
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.LLILLL = (String) objArr[0];
            return null;
        }
        return C2204961BRm.a0(method, this, objArr, new C0WZX("ezR2SBYqDITVW0MkVxyFal/WmgXgBLgsMTyk2yhob+vxM3MeBAU+nnjTDi43hTG+Kys=", null));
    }
}
