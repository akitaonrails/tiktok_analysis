package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* JADX INFO: renamed from: X.0Q7A, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q7A {
    public long LIZ;

    public final void LIZ(DynamicPatch dynamicPatch) {
        String str;
        this.LIZ = System.currentTimeMillis();
        if (dynamicPatch == null || (str = dynamicPatch.schema) == null) {
            str = "";
        }
        C0Q76 c0q76 = new C0Q76();
        c0q76.LJIILLIIL("type", "start_load");
        c0q76.LJIJ(2);
        c0q76.LJIILLIIL("schema", str);
        c0q76.LJIILJJIL();
    }
}
