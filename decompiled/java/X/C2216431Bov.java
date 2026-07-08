package X;

import Y.AObjectS376S0100000_34;
import Y.AObjectS408S0100000_34;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216431Bov<T> {
    public T LIZ;
    public final MutableLiveData<T> LIZIZ;
    public InterfaceC2216421Bou LIZJ;
    public InterfaceC21368818ju LIZLLL;
    public T LJ;
    public boolean LJFF;

    public C2216431Bov() {
        this.LIZIZ = new MutableLiveData<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2216431Bov(C0FQ0 c0fq0) {
        this.LIZ = c0fq0;
        this.LJ = c0fq0;
        this.LIZIZ = new MutableLiveData<>(c0fq0);
    }

    public final <V> V LIZ(Class<V> cls) throws Exception {
        V v = (V) this.LIZJ;
        if (v != null) {
            return v;
        }
        Class clsLIZ = C2216411Bot.LIZ(cls);
        if (clsLIZ != null) {
            Class cls2 = (Class) ((LinkedHashMap) C2216411Bot.LIZ).get(clsLIZ);
            if (cls2 != null) {
                T tNewInstance = cls2.getConstructor(LiveData.class, Function0.class, Function1.class).newInstance(this.LIZIZ, new AObjectS408S0100000_34(this, 10), new AObjectS376S0100000_34(this, 6));
                this.LIZJ = (InterfaceC2216421Bou) tNewInstance;
                return tNewInstance;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getReaderInternal can not find ");
            sbLIZ.append(cls);
            sbLIZ.append(" readWriter");
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getReaderInternal can not find ");
        sbLIZ2.append(cls);
        sbLIZ2.append(" writer");
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZIZ(T t) {
        this.LIZ = t;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LIZIZ.setValue(this.LIZ);
        } else {
            this.LIZIZ.postValue(this.LIZ);
        }
    }
}
