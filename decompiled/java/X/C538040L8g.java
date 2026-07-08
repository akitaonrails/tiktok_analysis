package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0L8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538040L8g extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C538050L8h LL;
    public final /* synthetic */ C0FQS LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ List<C537990L8b> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C259800zU<C537990L8b> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538040L8g(C538050L8h c538050L8h, C0FQS c0fqs, CreativeInfo creativeInfo, List<C537990L8b> list, int i, C259800zU<C537990L8b> c259800zU, String str) {
        super(1);
        this.LL = c538050L8h;
        this.LLILLJJLI = c0fqs;
        this.LLILLL = creativeInfo;
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = c259800zU;
        this.LLIZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C538050L8h c538050L8h = this.LL;
        C259800zU<C537990L8b> c259800zU = this.LLILZLL;
        String str2 = this.LLIZ;
        int i = this.LLILZIL;
        synchronized (c538050L8h) {
            try {
                c538050L8h.LJII++;
                c538050L8h.LJIIJJI.LIZ(c259800zU.element.LIZ, str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("compressNextVideo Success: index=");
                sbLIZ.append(i);
                sbLIZ.append(", CompletedCount=");
                sbLIZ.append(c538050L8h.LJII);
                sbLIZ.append(", destPath=");
                sbLIZ.append(str2);
                C381530Exb.LIZIZ(c538050L8h, C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C383980F3s.LIZIZ(new AwS552S0100000_8(this.LL, 1075));
        this.LL.LJJIJIIJIL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL + 1);
        return Unit.LIZ;
    }
}
