package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* JADX INFO: renamed from: X.0PaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647410PaN {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DynamicPatch dynamicPatch, C647340PaG c647340PaG) {
        String docId = dynamicPatch.getDocId();
        if (docId != null) {
            c647340PaG.LIZJ.put("docId", docId);
        }
        String alaSrc = dynamicPatch.getAlaSrc();
        if (alaSrc != null) {
            c647340PaG.LIZJ.put("alaSrc", alaSrc);
        }
    }
}
