package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* JADX INFO: renamed from: X.0PdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649250PdL {
    public long LIZ;
    public long LIZIZ;

    public final void LIZ(DynamicPatch dynamicPatch) {
        String str;
        this.LIZ = System.currentTimeMillis();
        if (dynamicPatch == null || (str = dynamicPatch.schema) == null) {
            str = "";
        }
        C647890Pb9 c647890Pb9 = new C647890Pb9();
        c647890Pb9.LJIIZILJ("type", "start_load");
        c647890Pb9.LJJIFFI(2);
        c647890Pb9.LJIIZILJ("schema", str);
        c647890Pb9.LJIILJJIL();
    }
}
