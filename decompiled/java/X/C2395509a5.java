package X;

import Y.ARunnableS103S0100000_3;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.09a5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2395509a5<T> implements InterfaceC1501660pBE<TypedInput, T> {
    public static volatile ExecutorService LJI;
    public final Type LIZ;
    public final Annotation[] LIZIZ;
    public final Retrofit LIZJ;
    public final List<AbstractC2343909Gj> LIZLLL;
    public final AbstractC2343909Gj LJ;
    public volatile InterfaceC1501660pBE<TypedInput, T> LJFF;

    public final void LIZIZ() {
        if (this.LJFF == null) {
            synchronized (this) {
                try {
                    if (this.LJFF == null) {
                        this.LJFF = LIZJ(this.LJ, this.LIZ, this.LIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC1501660pBE
    public final Object LIZ(TypedInput typedInput) {
        LIZIZ();
        return this.LJFF.LIZ(typedInput);
    }

    public final <T> InterfaceC1501660pBE<TypedInput, T> LIZJ(AbstractC2343909Gj abstractC2343909Gj, Type type, Annotation[] annotationArr) {
        if (type != null) {
            if (annotationArr != null) {
                int iIndexOf = this.LIZLLL.indexOf(abstractC2343909Gj) + 1;
                int size = this.LIZLLL.size();
                for (int i = iIndexOf; i < size; i++) {
                    InterfaceC1501660pBE<TypedInput, T> interfaceC1501660pBE = (InterfaceC1501660pBE<TypedInput, T>) ((AbstractC2343909Gj) ListProtector.get(this.LIZLLL, i)).LJ(type, annotationArr, this.LIZJ);
                    if (interfaceC1501660pBE != null) {
                        return interfaceC1501660pBE;
                    }
                }
                StringBuilder sb = new StringBuilder("Could not locate TypeInput converter for ");
                sb.append(type);
                sb.append(".\n");
                if (abstractC2343909Gj != null) {
                    sb.append("  Skipped:");
                    for (int i2 = 0; i2 < iIndexOf; i2++) {
                        sb.append("\n   * ");
                        sb.append(ListProtector.get(this.LIZLLL, i2).getClass().getName());
                    }
                    sb.append('\n');
                }
                sb.append("  Tried:");
                int size2 = this.LIZLLL.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    sb.append("\n   * ");
                    sb.append(ListProtector.get(this.LIZLLL, i3).getClass().getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("annotations == null");
        }
        throw new NullPointerException("type == null");
    }

    public C2395509a5(Type type, Annotation[] annotationArr, Retrofit retrofit, List<AbstractC2343909Gj> list, AbstractC2343909Gj abstractC2343909Gj) {
        this.LIZ = type;
        this.LIZIZ = annotationArr;
        this.LIZJ = retrofit;
        this.LIZLLL = list;
        this.LJ = abstractC2343909Gj;
        if (LJI == null) {
            synchronized (C2395509a5.class) {
                try {
                    if (LJI == null) {
                        LJI = C823050WQl.LIZLLL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LJI.submit(new ARunnableS103S0100000_3(this, 170));
    }
}
