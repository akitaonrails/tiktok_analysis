package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950750aqf implements InterfaceC951230arR<Object> {
    public final LiveEffect LIZ;
    public final boolean LIZIZ;

    public C950750aqf() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C950750aqf)) {
            return false;
        }
        C950750aqf c950750aqf = (C950750aqf) obj;
        return Intrinsics.LJFF(this.LIZ, c950750aqf.LIZ) && this.LIZIZ == c950750aqf.LIZIZ;
    }

    public final int hashCode() {
        LiveEffect liveEffect = this.LIZ;
        return ((liveEffect == null ? 0 : liveEffect.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareSingleItem(liveEffect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        String resourceId;
        String resourceId2;
        String strLLJLLIL;
        String strLLJLLIL2;
        String strLJJ;
        if (obj instanceof C950750aqf) {
            C950750aqf c950750aqf = (C950750aqf) obj;
            LiveEffect liveEffect = c950750aqf.LIZ;
            String strLJJ2 = null;
            if (liveEffect != null) {
                resourceId = liveEffect.getResourceId();
            } else {
                resourceId = null;
            }
            LiveEffect liveEffect2 = this.LIZ;
            if (liveEffect2 != null) {
                resourceId2 = liveEffect2.getResourceId();
            } else {
                resourceId2 = null;
            }
            if (Intrinsics.LJFF(resourceId, resourceId2)) {
                LiveEffect liveEffect3 = c950750aqf.LIZ;
                if (liveEffect3 != null) {
                    strLLJLLIL = liveEffect3.LLJLLIL();
                } else {
                    strLLJLLIL = null;
                }
                LiveEffect liveEffect4 = this.LIZ;
                if (liveEffect4 != null) {
                    strLLJLLIL2 = liveEffect4.LLJLLIL();
                } else {
                    strLLJLLIL2 = null;
                }
                if (Intrinsics.LJFF(strLLJLLIL, strLLJLLIL2)) {
                    LiveEffect liveEffect5 = c950750aqf.LIZ;
                    if (liveEffect5 != null) {
                        strLJJ = liveEffect5.LJJ();
                    } else {
                        strLJJ = null;
                    }
                    LiveEffect liveEffect6 = this.LIZ;
                    if (liveEffect6 != null) {
                        strLJJ2 = liveEffect6.LJJ();
                    }
                    if (Intrinsics.LJFF(strLJJ, strLJJ2) && c950750aqf.LIZIZ == this.LIZIZ) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC951230arR
    public final Object LIZLLL(Object obj) {
        String resourceId;
        String resourceId2;
        String strLLJLLIL;
        String strLLJLLIL2;
        String strLJJ;
        String strLJJ2;
        if (!(obj instanceof C950750aqf) || obj == null) {
            return null;
        }
        C950750aqf c950750aqf = (C950750aqf) obj;
        LiveEffect liveEffect = c950750aqf.LIZ;
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        } else {
            resourceId = null;
        }
        LiveEffect liveEffect2 = this.LIZ;
        if (liveEffect2 != null) {
            resourceId2 = liveEffect2.getResourceId();
        } else {
            resourceId2 = null;
        }
        if (!Intrinsics.LJFF(resourceId, resourceId2)) {
            return null;
        }
        LiveEffect liveEffect3 = c950750aqf.LIZ;
        if (liveEffect3 != null) {
            strLLJLLIL = liveEffect3.LLJLLIL();
        } else {
            strLLJLLIL = null;
        }
        LiveEffect liveEffect4 = this.LIZ;
        if (liveEffect4 != null) {
            strLLJLLIL2 = liveEffect4.LLJLLIL();
        } else {
            strLLJLLIL2 = null;
        }
        if (!Intrinsics.LJFF(strLLJLLIL, strLLJLLIL2)) {
            return null;
        }
        LiveEffect liveEffect5 = c950750aqf.LIZ;
        if (liveEffect5 != null) {
            strLJJ = liveEffect5.LJJ();
        } else {
            strLJJ = null;
        }
        LiveEffect liveEffect6 = this.LIZ;
        if (liveEffect6 != null) {
            strLJJ2 = liveEffect6.LJJ();
        } else {
            strLJJ2 = null;
        }
        if (!Intrinsics.LJFF(strLJJ, strLJJ2) || c950750aqf.LIZIZ == this.LIZIZ) {
            return null;
        }
        return C950760aqg.LIZ;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        String resourceId;
        if (obj instanceof C950750aqf) {
            LiveEffect liveEffect = ((C950750aqf) obj).LIZ;
            String resourceId2 = null;
            if (liveEffect != null) {
                resourceId = liveEffect.getResourceId();
            } else {
                resourceId = null;
            }
            LiveEffect liveEffect2 = this.LIZ;
            if (liveEffect2 != null) {
                resourceId2 = liveEffect2.getResourceId();
            }
            if (Intrinsics.LJFF(resourceId, resourceId2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C950750aqf(LiveEffect liveEffect, boolean z) {
        this.LIZ = liveEffect;
        this.LIZIZ = z;
    }
}
