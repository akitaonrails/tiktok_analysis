package X;

import Y.AComparatorS35S0000000_16;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dKR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.rich.impression.impl.staticviewability.StaticImpressionSDKService$shouldSendEvent$1$1$1", f = "StaticImpressionSDKService.kt", l = {}, m = "invokeSuspend")
public final class C1046090dKR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Float, ? extends Long>>, Object> {
    public final /* synthetic */ C1046110dKT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1046090dKR(C1046110dKT c1046110dKT, InterfaceC1364105Vn<? super C1046090dKR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1046110dKT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1046090dKR(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float f;
        char c;
        int iLIZ;
        C1C7U.LIZ("StaticImpressionSDKService@4e49.shouldSendEvent$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1046110dKT c1046110dKT = this.LL;
        if (c1046110dKT.LIZJ && c1046110dKT.LIZLLL != null) {
            Context applicationContext = C2214471Bll.LIZIZ().getApplicationContext();
            C1046070dKP c1046070dKP = c1046110dKT.LIZLLL;
            char c2 = 0;
            C1046070dKP c1046070dKPLIZIZ = c1046070dKP.LIZIZ(new C1046070dKP(0, 0, C0KWF.LIZIZ(applicationContext), C0KWF.LIZ(applicationContext), c1046070dKP.LJ));
            ArrayList<C1046070dKP> arrayListLIZ = C1046080dKQ.LIZ(c1046070dKPLIZIZ, c1046110dKT.LJ);
            ArrayList<C1046070dKP> arrayList = new ArrayList<>();
            for (int i = 0; i < arrayListLIZ.size(); i++) {
                if (((C1046070dKP) ListProtector.get(arrayListLIZ, i)).LIZ < ((C1046070dKP) ListProtector.get(arrayListLIZ, i)).LIZJ && ((C1046070dKP) ListProtector.get(arrayListLIZ, i)).LIZIZ < ((C1046070dKP) ListProtector.get(arrayListLIZ, i)).LIZLLL) {
                    arrayList.add(ListProtector.get(arrayListLIZ, i));
                }
            }
            c1046110dKT.LJFF = arrayList;
            if (arrayList.size() == 0) {
                iLIZ = c1046070dKPLIZIZ.LIZ();
            } else {
                int size = arrayList.size();
                int[][] iArr = new int[size][];
                int i2 = 0;
                while (true) {
                    c = 2;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    iArr[i2] = new int[]{((C1046070dKP) ListProtector.get(arrayList, i2)).LIZ, ((C1046070dKP) ListProtector.get(arrayList, i2)).LIZIZ, ((C1046070dKP) ListProtector.get(arrayList, i2)).LIZJ, ((C1046070dKP) ListProtector.get(arrayList, i2)).LIZLLL};
                    i2++;
                }
                int i3 = size * 2;
                int[][] iArr2 = new int[i3][];
                HashSet hashSet = new HashSet();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    int[] iArr3 = iArr[i5];
                    int i6 = i4 + 1;
                    iArr2[i4] = new int[]{iArr3[1], 1, iArr3[0], iArr3[2]};
                    i4 = i6 + 1;
                    int i7 = iArr3[0];
                    iArr2[i6] = new int[]{iArr3[3], -1, i7, iArr3[2]};
                    hashSet.add(Integer.valueOf(i7));
                    hashSet.add(Integer.valueOf(iArr3[2]));
                }
                Arrays.sort(iArr2, new AComparatorS35S0000000_16(4));
                Integer[] numArr = (Integer[]) hashSet.toArray(new Integer[0]);
                Arrays.sort(numArr);
                HashMap map = new HashMap();
                for (int i8 = 0; i8 < numArr.length; i8++) {
                    map.put(numArr[i8], Integer.valueOf(i8));
                }
                C1046140dKW c1046140dKW = new C1046140dKW(0, numArr.length - 1, numArr);
                int i9 = iArr2[0][0];
                long j = 0;
                int i10 = 0;
                long jLIZ = 0;
                while (i10 < i3) {
                    int[] iArr4 = iArr2[i10];
                    int i11 = iArr4[c2];
                    j += jLIZ * ((long) (i11 - i9));
                    jLIZ = c1046140dKW.LIZ(((Integer) map.get(Integer.valueOf(iArr4[c]))).intValue(), ((Integer) map.get(Integer.valueOf(iArr4[3]))).intValue(), iArr4[1]);
                    i10++;
                    i9 = i11;
                    c2 = 0;
                    c = 2;
                }
                iLIZ = c1046070dKPLIZIZ.LIZ() - ((int) j);
            }
            f = iLIZ;
        } else {
            f = 0.0f;
        }
        Pair pair = new Pair(C2286608xc.LIZLLL(f), C2286608xc.LJFF(SystemClock.elapsedRealtime() - jElapsedRealtime));
        C1C7U.LIZIZ("StaticImpressionSDKService@4e49.shouldSendEvent$1$1$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Float, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
