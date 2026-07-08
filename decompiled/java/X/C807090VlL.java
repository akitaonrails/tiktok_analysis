package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807090VlL {
    public final String LIZ;
    public final C807160VlS LIZIZ;
    public EnumC807010VlD LIZJ;
    public C807210VlX LIZLLL;
    public JSONObject LJ;
    public Object LJFF;
    public Long LJI;

    public C807090VlL(String str, C807160VlS c807160VlS, InterfaceC794710VFl interfaceC794710VFl, int i) {
        EnumC807010VlD enumC807010VlD;
        if ((i & 8) != 0) {
            enumC807010VlD = EnumC807010VlD.UNKNOWN_LOG;
        } else {
            enumC807010VlD = null;
        }
        interfaceC794710VFl = (i & 64) != 0 ? null : interfaceC794710VFl;
        this.LIZ = str;
        this.LIZIZ = c807160VlS;
        this.LIZJ = enumC807010VlD;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = interfaceC794710VFl;
        this.LJI = null;
    }
}
