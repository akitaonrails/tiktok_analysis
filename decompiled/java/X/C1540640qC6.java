package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qC6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540640qC6 implements Function1<String, Unit> {
    public final Context LL;
    public final String LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 202));
    public final SparseArray<C2286651Eet> LLILZ = new SparseArray<>();

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        InterfaceC1538960q9O nativeStorageVisitor;
        InterfaceC1870830ymf interfaceC1870830ymfLIZ;
        Object objLJIIIZ;
        String string;
        String str2 = str;
        int size = this.LLILZ.size();
        for (int i = 0; i < size; i++) {
            this.LLILZ.valueAt(i).getClass();
            if (Intrinsics.LJFF(null, str2)) {
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
                if (c1538050q7v != null && (nativeStorageVisitor = c1538050q7v.getNativeStorageVisitor()) != null && (interfaceC1870830ymfLIZ = nativeStorageVisitor.LIZ(this.LL)) != null && (objLJIIIZ = interfaceC1870830ymfLIZ.LJIIIZ(this.LLILLJJLI, str2)) != null && (string = objLJIIIZ.toString()) != null) {
                    boolean z = C1058250de3.LIZ(string, Map.class) instanceof Map;
                    throw null;
                }
            }
        }
        return Unit.LIZ;
    }

    public C1540640qC6(Context context, String str) {
        this.LL = context;
        this.LLILLJJLI = str;
    }
}
