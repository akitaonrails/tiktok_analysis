package X;

import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530760pwA extends C1536330q59 {
    public final String LLILLJJLI;
    public final Long LLILLL;
    public final String LLILZ;
    public EnumC994680bzW LLILZIL;
    public Integer LLILZLL;
    public Integer LLIZ;
    public Integer LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public Long LLJJI;
    public Long LLJJIII;
    public Float LLJJIJI;
    public Float LLJJIJIIJIL;
    public Long LLJJIJIL;
    public Long LLJJJ;
    public SSPResponse.Data LLJJJIL;
    public volatile int LLJJJJ;
    public volatile int LLJJJJJIL;

    public C1530760pwA() {
        this(null, null, null);
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load start. url: ");
        sbLIZ.append(str);
        sbLIZ.append(", timestamp:");
        sbLIZ.append(System.currentTimeMillis());
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SspLifeCycle_", 2);
        if (Intrinsics.LJFF(str, this.LLILLJJLI)) {
            this.LLJJIJIL = Long.valueOf(System.currentTimeMillis());
        }
    }

    public C1530760pwA(String str, Long l, String str2) {
        this.LLILLJJLI = str;
        this.LLILLL = l;
        this.LLILZ = str2;
        this.LLJILLL = "";
    }
}
