package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682860QqS extends C09AY implements Function0<Integer> {
    public C682860QqS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Integer numLJIIJJI;
        String strLJ = C0CP7.LIZ.LJ("search_lynx_preload", "uid_recent_search_day15");
        return Integer.valueOf((strLJ == null || (numLJIIJJI = C2095008Iq.LJIIJJI(strLJ)) == null) ? -1 : numLJIIJJI.intValue());
    }
}
