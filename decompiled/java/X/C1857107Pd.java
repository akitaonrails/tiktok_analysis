package X;

import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Pd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1857107Pd extends C09AY implements Function0<ArrayList<Integer>> {
    public C1857107Pd() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<Integer> invoke() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(7);
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 26) {
            }
            arrayList.add(11);
            arrayList.add(12);
            return arrayList;
        }
        arrayList.add(26);
        arrayList.add(22);
        arrayList.add(11);
        arrayList.add(12);
        return arrayList;
    }
}
