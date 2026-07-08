package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.05i9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1426305i9 {
    public static final ConcurrentHashMap<String, WeakReference<C1426305i9>> LJ = new ConcurrentHashMap<>();
    public final String LIZ;
    public final C05WF LIZIZ;
    public final Map<EnumC1426605iC, C1426405iA> LIZJ;
    public volatile boolean LIZLLL;

    public final void LIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        LJ.remove(this.LIZ);
    }

    public C1426305i9(String str, C1426705iD c1426705iD, C05WF c05wf) {
        this.LIZ = str;
        this.LIZIZ = c05wf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZJ = linkedHashMap;
        EnumC1426605iC enumC1426605iC = EnumC1426605iC.DOWNLOAD_RES;
        linkedHashMap.put(enumC1426605iC, new C1426405iA(enumC1426605iC, c1426705iD.LIZ, 0.0f));
        float f = c1426705iD.LIZ + 0.0f;
        EnumC1426605iC enumC1426605iC2 = EnumC1426605iC.FETCH_MINI_DRAFT;
        linkedHashMap.put(enumC1426605iC2, new C1426405iA(enumC1426605iC2, c1426705iD.LIZIZ, f));
        float f2 = f + c1426705iD.LIZIZ;
        EnumC1426605iC enumC1426605iC3 = EnumC1426605iC.CONVERT_MINI_DRAFT_MODEL;
        linkedHashMap.put(enumC1426605iC3, new C1426405iA(enumC1426605iC3, c1426705iD.LIZJ, f2));
        float f3 = f2 + c1426705iD.LIZJ;
        EnumC1426605iC enumC1426605iC4 = EnumC1426605iC.APPLY_EFFECT;
        linkedHashMap.put(enumC1426605iC4, new C1426405iA(enumC1426605iC4, c1426705iD.LIZLLL, f3));
    }
}
