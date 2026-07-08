package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552230qUn implements InterfaceC1552320qUw, Serializable {
    public final InterfaceC1553480qWo LL;
    public int LLILLJJLI;
    public final List<C1552500qVE> LLILLL;
    public AbstractC1552240qUo LLILZ;
    public Map<String, Object> mBundleData;

    @Override // X.InterfaceC1552320qUw
    public Object restart() {
        this.LLILLJJLI = 0;
        this.LLILZ = null;
        return proceed(null);
    }

    public Object resume() throws C1553110qWD {
        if (this.LLILZ == null) {
            return null;
        }
        try {
            C1552500qVE c1552500qVE = this.LLILLL.get(this.LLILLJJLI - 1);
            AbstractC1552800qVi abstractC1552800qVi = c1552500qVE.LIZIZ;
            C1552230qUn c1552230qUn = new C1552230qUn(this.LLILLL, this.LLILLJJLI, this.LL, this.LLILZ);
            c1552230qUn.mBundleData = this.mBundleData;
            AbstractC1552240qUo abstractC1552240qUo = this.LLILZ;
            IN in = abstractC1552240qUo.LIZIZ;
            abstractC1552240qUo.LIZ(c1552230qUn, abstractC1552240qUo.LIZ, abstractC1552240qUo.LIZJ, abstractC1552800qVi, c1552500qVE.LIZJ);
            AbstractC1552240qUo abstractC1552240qUo2 = this.LLILZ;
            Object objLIZJ = abstractC1552240qUo2.LIZJ(abstractC1552240qUo2.LJ, in);
            AbstractC1552240qUo abstractC1552240qUo3 = this.LLILZ;
            AbstractC1552800qVi abstractC1552800qVi2 = abstractC1552240qUo3.LIZLLL;
            if (abstractC1552800qVi2 == null) {
                return objLIZJ;
            }
            abstractC1552800qVi2.LJ(abstractC1552240qUo3.LJ, abstractC1552240qUo3);
            return objLIZJ;
        } catch (C1553110qWD e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC1552240qUo abstractC1552240qUo4 = this.LLILZ;
            Throwable cause = e.getCause();
            AbstractC1552800qVi abstractC1552800qVi3 = abstractC1552240qUo4.LIZLLL;
            if (abstractC1552800qVi3 != null) {
                abstractC1552800qVi3.LIZ(abstractC1552240qUo4.LJ, abstractC1552240qUo4, cause);
            }
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AbstractC1552240qUo abstractC1552240qUo5 = this.LLILZ;
            AbstractC1552800qVi abstractC1552800qVi4 = abstractC1552240qUo5.LIZLLL;
            if (abstractC1552800qVi4 != null) {
                abstractC1552800qVi4.LIZLLL(abstractC1552240qUo5.LJ, abstractC1552240qUo5, th);
            }
            throw new C1553110qWD(th);
        }
    }

    @Override // X.InterfaceC1552320qUw
    public Object getInputForType(Class cls) {
        for (AbstractC1552240qUo abstractC1552240qUo = this.LLILZ; abstractC1552240qUo != null; abstractC1552240qUo = abstractC1552240qUo.LIZ) {
            if (abstractC1552240qUo.getClass() == cls) {
                return abstractC1552240qUo.LIZIZ;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can not find pre Interceptor , class:");
        sbLIZ.append(cls);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1552320qUw
    public Object getInterceptorByType(Class cls) {
        for (AbstractC1552240qUo abstractC1552240qUo = this.LLILZ; abstractC1552240qUo != null; abstractC1552240qUo = abstractC1552240qUo.LIZ) {
            if (abstractC1552240qUo.getClass() == cls) {
                return abstractC1552240qUo;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can not find pre Interceptor , class:");
        sbLIZ.append(cls);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1552320qUw
    public Object getOutputForType(Class cls) {
        for (AbstractC1552240qUo abstractC1552240qUo = this.LLILZ; abstractC1552240qUo != null; abstractC1552240qUo = abstractC1552240qUo.LIZ) {
            if (abstractC1552240qUo.getClass() == cls) {
                return abstractC1552240qUo.LIZJ;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can not find pre Interceptor , class:");
        sbLIZ.append(cls);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1552320qUw
    public Object getPipelineData(String str) {
        return this.mBundleData.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1552320qUw
    public Object proceed(Object obj) throws IllegalAccessException, InstantiationException, C1553110qWD {
        AbstractC1552240qUo abstractC1552240qUo = this.LLILZ;
        if (abstractC1552240qUo != null) {
            abstractC1552240qUo.LIZJ = obj;
            AbstractC1552800qVi abstractC1552800qVi = abstractC1552240qUo.LIZLLL;
            if (abstractC1552800qVi != null) {
                abstractC1552800qVi.LIZJ(abstractC1552240qUo.LJ, abstractC1552240qUo);
            }
        }
        if (this.LLILLJJLI >= this.LLILLL.size()) {
            return obj;
        }
        C1552500qVE c1552500qVE = (C1552500qVE) ListProtector.get(this.LLILLL, this.LLILLJJLI);
        Class<? extends AbstractC1552240qUo> cls = c1552500qVE.LIZ;
        this.LL.getClass();
        try {
            AbstractC1552240qUo abstractC1552240qUoNewInstance = cls.newInstance();
            if (abstractC1552240qUoNewInstance != null) {
                AbstractC1552800qVi abstractC1552800qVi2 = c1552500qVE.LIZIZ;
                C1552230qUn c1552230qUn = new C1552230qUn(this.LLILLL, this.LLILLJJLI + 1, this.LL, abstractC1552240qUoNewInstance);
                c1552230qUn.mBundleData = this.mBundleData;
                abstractC1552240qUoNewInstance.LIZ(c1552230qUn, this.LLILZ, obj, abstractC1552800qVi2, c1552500qVE.LIZJ);
                AbstractC1552800qVi abstractC1552800qVi3 = abstractC1552240qUoNewInstance.LIZLLL;
                if (abstractC1552800qVi3 != null) {
                    abstractC1552800qVi3.LJI(abstractC1552240qUoNewInstance.LJ, abstractC1552240qUoNewInstance);
                }
                try {
                    Object objLIZJ = abstractC1552240qUoNewInstance.LIZJ(c1552230qUn, obj);
                    AbstractC1552800qVi abstractC1552800qVi4 = abstractC1552240qUoNewInstance.LIZLLL;
                    if (abstractC1552800qVi4 != null) {
                        abstractC1552800qVi4.LJ(abstractC1552240qUoNewInstance.LJ, abstractC1552240qUoNewInstance);
                    }
                    return objLIZJ;
                } catch (C1553110qWD e) {
                    TryCatchGuardChecker.doCheck(e);
                    Throwable cause = e.getCause();
                    AbstractC1552800qVi abstractC1552800qVi5 = abstractC1552240qUoNewInstance.LIZLLL;
                    if (abstractC1552800qVi5 != null) {
                        abstractC1552800qVi5.LIZ(abstractC1552240qUoNewInstance.LJ, abstractC1552240qUoNewInstance, cause);
                    }
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AbstractC1552800qVi abstractC1552800qVi6 = abstractC1552240qUoNewInstance.LIZLLL;
                    if (abstractC1552800qVi6 != null) {
                        abstractC1552800qVi6.LIZLLL(abstractC1552240qUoNewInstance.LJ, abstractC1552240qUoNewInstance, th);
                    }
                    throw new C1553110qWD(th);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("interceptor == null , index = ");
            sbLIZ.append(obj);
            sbLIZ.append(" , class: ");
            sbLIZ.append(cls);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // X.InterfaceC1552320qUw
    public void setPipelineData(String str, Object obj) {
        this.mBundleData.put(str, obj);
    }

    public C1552230qUn(List<C1552500qVE> list, int i, InterfaceC1553480qWo interfaceC1553480qWo, AbstractC1552240qUo abstractC1552240qUo) {
        HashMap map = new HashMap();
        this.mBundleData = map;
        this.LLILLL = list;
        this.LLILLJJLI = i;
        this.LL = interfaceC1553480qWo;
        this.LLILZ = abstractC1552240qUo;
        map.put("req_type", 1);
        this.mBundleData.put("sync_task_id", 0);
    }
}
