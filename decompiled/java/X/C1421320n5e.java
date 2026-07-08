package X;

import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421320n5e extends C09AY implements Function1<C1421230n5V, C1421230n5V> {
    public final /* synthetic */ List<PovItemInfo> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1421350n5h LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421320n5e(List<PovItemInfo> list, boolean z, boolean z2, C1421350n5h c1421350n5h, String str) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c1421350n5h;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1421230n5V invoke(C1421230n5V c1421230n5V) {
        String str;
        C1421230n5V c1421230n5V2 = c1421230n5V;
        C1409810mn5 c1409810mn5 = new C1409810mn5(this.LL, this.LLILLJJLI, this.LLILLL);
        C1421350n5h c1421350n5h = this.LLILZ;
        String str2 = "";
        if (c1421350n5h == null || (str = c1421350n5h.LIZJ) == null) {
            str = "";
        }
        String str3 = this.LLILZIL;
        if (str3 != null) {
            str2 = str3;
        }
        return C1421230n5V.LIZ(c1421230n5V2, false, new C375830EoP(new C1421200n5S(str, str2, C13BV.INSTANCE, true, true)), c1409810mn5, null, 9);
    }
}
