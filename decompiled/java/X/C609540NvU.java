package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609540NvU extends C09AY implements Function0<String> {
    public final /* synthetic */ C814730Vxf LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ PTYError LLILLL;
    public final /* synthetic */ PTYTaskData LLILZ;
    public final /* synthetic */ PTYPackageInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C609540NvU(C814730Vxf c814730Vxf, boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
        super(0);
        this.LL = c814730Vxf;
        this.LLILLJJLI = z;
        this.LLILLL = pTYError;
        this.LLILZ = pTYTaskData;
        this.LLILZIL = pTYPackageInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LL.id);
        sbLIZ.append("] success: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", error: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" outputDataPTY: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" packageInfo: ");
        sbLIZ.append(this.LLILZIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
