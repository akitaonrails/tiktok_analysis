package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1639700sls implements InterfaceC1639300slE {
    public final Context LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final List<Pair<int[], String>> LIZLLL;
    public final InterfaceC1456340o08<C1639750slx> LJ;
    public final InterfaceC1639790sm1 LJFF;
    public final C01GW LJI;

    public boolean LJFF() {
        throw null;
    }

    public final void LIZLLL() {
        if (this.LIZJ == this.LJFF.LIZIZ() && LJFF()) {
            return;
        }
        for (Pair<int[], String> pair : this.LIZLLL) {
            Context context = this.LIZ;
            int[] first = pair.getFirst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(pair.getSecond());
            sbLIZ.append("Filter_00/");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (TextUtils.equals(Build.BRAND, "Xiaomi") && !C1961207mE.LIZ("android.content.res.MiuiResourcesImpl")) {
                C1961207mE.LIZ("android.content.res.MiuiResources");
            }
            for (int i : first) {
                C08SA.LIZLLL(context, i, strLIZIZ);
            }
        }
        this.LJFF.LIZ(this.LIZJ);
    }

    public final C1639750slx LJ() {
        return (C1639750slx) this.LJI.getValue();
    }

    @Override // X.InterfaceC1639300slE
    public final void invalidate() {
        this.LJFF.LIZ(-1);
    }

    @Override // X.InterfaceC1639300slE
    public final boolean LIZ(C1639670slp c1639670slp) {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c1639670slp.LIZ);
        if (lLJIILIIL != null && lLJIILIIL.longValue() >= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // X.InterfaceC1639300slE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1639400slO LIZIZ(java.lang.String r5) {
        /*
            r4 = this;
            r0 = -1
            long r2 = (long) r0
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r5)
            if (r0 == 0) goto L50
            long r0 = r0.longValue()
        Lc:
            long r2 = r2 - r0
            int r0 = (int) r2
            java.lang.String r0 = r4.LJI(r0)
            java.lang.String r3 = X.C365201bO.LIZ(r0)
            X.0slO r2 = new X.0slO
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L4d
            X.0VSJ r1 = new X.0VSJ
            r1.<init>(r3)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L4d
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L4d
            java.io.File r0 = r1.getParentFile()
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L4d
            boolean r0 = r1.exists()
            if (r0 == 0) goto L4d
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L4d
            java.lang.String r0 = r1.getAbsolutePath()
        L49:
            r2.<init>(r3, r0)
            return r2
        L4d:
            java.lang.String r0 = ""
            goto L49
        L50:
            r0 = -1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1639700sls.LIZIZ(java.lang.String):X.0slO");
    }

    public final String LJI(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1489060oqu.LIZ(this.LIZIZ));
        sbLIZ.append(LJ().LIZLLL[i]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1639700sls(Context context, String str, int i, List list, C1639720slu c1639720slu) {
        InterfaceC1456340o08 interfaceC1456340o08 = new InterfaceC1456340o08() { // from class: X.0sly
            @Override // X.InterfaceC1456340o08
            public final Object get() {
                Resources resources = C0CHQ.LIZ.getResources();
                String[] stringArray = resources.getStringArray(R.array.ay);
                String[] stringArray2 = resources.getStringArray(R.array.ax);
                TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(R.array.az);
                ArrayList arrayList = new ArrayList(stringArray.length);
                int length = stringArray.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    arrayList.add(Integer.valueOf(typedArrayObtainTypedArray.getResourceId(i3, 0)));
                    i2++;
                    i3++;
                }
                Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
                typedArrayObtainTypedArray.recycle();
                ArrayList arrayList2 = new ArrayList(stringArray.length);
                int length2 = stringArray.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2) {
                    arrayList2.add(C786410Ut5.j4("Filter_%02d/", Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1)));
                    i4++;
                    i5++;
                }
                return new C1639750slx(stringArray, stringArray2, numArr, (String[]) arrayList2.toArray(new String[0]));
            }
        };
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = list;
        this.LJ = interfaceC1456340o08;
        this.LJFF = c1639720slu;
        this.LJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 836));
    }
}
