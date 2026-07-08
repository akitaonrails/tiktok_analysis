package X;

import com.ss.android.ugc.aweme.aime.MobModule;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lnn.q;
import t28.h;

/* JADX INFO: renamed from: X.0MG8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MG8 extends C09AY implements Function2<String, String, Unit> {
    public final /* synthetic */ h LL;
    public final /* synthetic */ InterfaceC1648020szI LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MG8(h hVar, InterfaceC1648020szI interfaceC1648020szI, String str, boolean z) {
        super(2);
        this.LL = hVar;
        this.LLILLJJLI = interfaceC1648020szI;
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String str3 = str2;
        h hVar = this.LL;
        if (!hVar.LLJJJJLIIL) {
            ((MobModule) hVar.LLJJIII.getValue()).LIZJ("aime_tab");
        }
        h hVar2 = this.LL;
        InterfaceC1648020szI interfaceC1648020szI = this.LLILLJJLI;
        boolean z = hVar2.LLJJJJLIIL;
        String str4 = this.LLILLL;
        boolean z2 = this.LLILZ;
        C1664740tQG c1664740tQG = hVar2.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = h.LLJJLIIIJLLLLLLLZ;
        InterfaceC1650190t2n interfaceC1650190t2n = (InterfaceC1650190t2n) c1664740tQG.getValue(hVar2, interfaceC2217461BqaArr[2]);
        if (interfaceC1650190t2n != null) {
            interfaceC1650190t2n.Zl0(new C1663770tOh(false, false, false));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("panel", "aiself");
        q qVar = (q) hVar2.LLJJJJJIL.getValue(hVar2, interfaceC2217461BqaArr[6]);
        if (qVar != null) {
            qVar.C0().getStickerRepository().LJIJJ().LJJIJIIJI(Collections.singletonList(str), false, linkedHashMap, new C581070Mqf(new C579110MnV(qVar, interfaceC1648020szI, str3, z, z2, str4), 1));
        }
        return Unit.LIZ;
    }
}
