package X;

import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523800pkw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1523780pku LLILLL;
    public final /* synthetic */ ECSparkPreloadConfigItem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523800pkw(String str, String str2, C1523780pku c1523780pku, ECSparkPreloadConfigItem eCSparkPreloadConfigItem) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c1523780pku;
        this.LLILZ = eCSparkPreloadConfigItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1523770pkt.LJ.remove(this.LLILLJJLI);
        C1523770pkt c1523770pkt = C1523770pkt.LIZ;
        c1523770pkt.getClass();
        C1523770pkt.LIZJ.remove(this.LL);
        C1523780pku c1523780pku = this.LLILLL;
        String str = this.LL;
        int i = this.LLILZ.preloadType;
        c1523770pkt.getClass();
        C1523770pkt.LIZJ(c1523780pku, str, i, "cleaned", 0L);
        return Unit.LIZ;
    }
}
