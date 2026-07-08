package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0L3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536870L3t extends C09AY implements Function2<Integer, String, Unit> {
    public final /* synthetic */ C536880L3u LL;
    public final /* synthetic */ C537840L7m LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536870L3t(long j, C537840L7m c537840L7m, C536880L3u c536880L3u) {
        super(2);
        this.LL = c536880L3u;
        this.LLILLJJLI = c537840L7m;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        int iIntValue = num.intValue();
        String str2 = str;
        C536880L3u c536880L3uLIZ = this.LL.LIZ();
        c536880L3uLIZ.LIZLLL = System.currentTimeMillis() - this.LLILLL;
        c536880L3uLIZ.LIZ = 1;
        c536880L3uLIZ.LIZIZ = iIntValue;
        if (str2 == null) {
            str2 = "";
        }
        c536880L3uLIZ.LIZJ = str2;
        C536890L3v c536890L3v = C536890L3v.LIZ;
        CutsameDataItem cutsameDataItem = this.LLILLJJLI.LIZIZ;
        String str3 = cutsameDataItem.templateUrl;
        String strValueOf = String.valueOf(cutsameDataItem.md5);
        c536890L3v.getClass();
        C536890L3v.LIZJ(c536880L3uLIZ, str3, strValueOf);
        return Unit.LIZ;
    }
}
