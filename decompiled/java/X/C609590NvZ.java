package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskData;

/* JADX INFO: renamed from: X.0NvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609590NvZ {
    public final boolean LIZ;
    public final PTYError LIZIZ;
    public final PTYTaskData LIZJ;
    public final PTYPackageInfo LIZLLL;

    public C609590NvZ() {
        this(null, 15);
    }

    public /* synthetic */ C609590NvZ(PTYError pTYError, int i) {
        this(false, (i & 2) != 0 ? null : pTYError, null, null);
    }

    public C609590NvZ(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
        this.LIZ = z;
        this.LIZIZ = pTYError;
        this.LIZJ = pTYTaskData;
        this.LIZLLL = pTYPackageInfo;
    }
}
