package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYTaskData;

/* JADX INFO: renamed from: X.0NvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609530NvT {
    public final boolean LIZ;
    public final PTYError LIZIZ;
    public final PTYTaskData LIZJ;

    public C609530NvT() {
        this(null, 15);
    }

    public /* synthetic */ C609530NvT(PTYError pTYError, int i) {
        this(false, (i & 2) != 0 ? null : pTYError, null);
    }

    public C609530NvT(boolean z, PTYError pTYError, PTYTaskData pTYTaskData) {
        this.LIZ = z;
        this.LIZIZ = pTYError;
        this.LIZJ = pTYTaskData;
    }
}
