package X;

import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;

/* JADX INFO: renamed from: X.0n2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419390n2X extends C09AY implements InterfaceC1685420txc<Integer, Integer, String, String, String, C096D> {
    public final /* synthetic */ InterfaceC1419480n2g LL;
    public final /* synthetic */ C23187096r LLILLJJLI;
    public final /* synthetic */ C259800zU<Long> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419390n2X(InterfaceC1419480n2g interfaceC1419480n2g, C23187096r c23187096r, C259800zU<Long> c259800zU, boolean z, boolean z2) {
        super(5);
        this.LL = interfaceC1419480n2g;
        this.LLILLJJLI = c23187096r;
        this.LLILLL = c259800zU;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // X.InterfaceC1685420txc
    public final C096D invoke(Integer num, Integer num2, String str, String str2, String str3) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        String str4 = str;
        String str5 = str3;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        String str6 = C1419410n2Z.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" errorMsg=");
        sbLIZ.append(str4);
        C201955140j.LIZLLL(c1398350mUb, str6, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1419480n2g interfaceC1419480n2g = this.LL;
        if (interfaceC1419480n2g != null) {
            C23187096r c23187096r = this.LLILLJJLI;
            interfaceC1419480n2g.LJ(c23187096r.LJ, false, iIntValue, iIntValue2, str4, "", this.LLILLL.element, str5, c23187096r.LJIILIIL.get("source"), this.LLILZ, this.LLILZIL);
        }
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        if (C306440Bzm.LIZ() && iIntValue == 5000 && (iIntValue2 == -199 || iIntValue2 == -106)) {
            unorderedMapStrStr.put("weak_net", "weak_net");
        }
        unorderedMapStrStr.put("sub_error_code", String.valueOf(iIntValue2));
        return new C096C(3, str4, this.LLILLJJLI.LJIILIIL);
    }
}
