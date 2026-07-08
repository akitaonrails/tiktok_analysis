package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fkc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139200fkc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1139230fkf LL;
    public final /* synthetic */ C1139210fkd LLILLJJLI;
    public final /* synthetic */ AssetsModel LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1139200fkc(C1139230fkf c1139230fkf, C1139210fkd c1139210fkd, AssetsModel assetsModel, long j, long j2, int i) {
        super(0);
        this.LL = c1139230fkf;
        this.LLILLJJLI = c1139210fkd;
        this.LLILLL = assetsModel;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        C0VSJ c0vsj;
        C1139230fkf c1139230fkf = this.LL;
        String[] strArr = c1139230fkf.LIZJ;
        if (strArr == null || (str = strArr[0]) == null) {
            str = "";
        }
        Long l = (Long) ((LinkedHashMap) this.LLILLJJLI.LIZ).get(c1139230fkf.LIZ);
        Long l2 = (Long) ((LinkedHashMap) this.LLILLJJLI.LIZIZ).get(this.LL.LIZ);
        String resourceFormat = this.LLILLL.getResourceFormat(this.LL.LJ);
        ResourceModel resourceModel = this.LLILLL.resourceByteVC1Model;
        String str2 = resourceModel != null ? resourceModel.uri : null;
        C1139230fkf c1139230fkf2 = this.LL;
        String str3 = c1139230fkf2.LJ;
        C1138630fjh c1138630fjh = C1138630fjh.LIZ;
        try {
            c0vsj = new C0VSJ(C1142700fqG.LJFF().LJ(c1139230fkf2, Boolean.FALSE));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        long folderSize = c0vsj.exists() ? FileUtils.INSTANCE.getFolderSize(c0vsj) / ((long) 1024) : 0L;
        long j = this.LLILLL.size;
        Map linkedHashMap = this.LL.LJIIIIZZ;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        C1131070fXV.LJ(this.LLILZ, this.LLILZIL, l, l2, resourceFormat, str2, str, 0, null, this.LLILZLL, str3, str3, Long.valueOf(folderSize), j, linkedHashMap, this.LL.LJII, this.LLILLL.immediateDownload, 384);
        return Unit.LIZ;
    }
}
