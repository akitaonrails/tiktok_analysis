package X;

import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.jvm.functions.Function2;
import r4m.i;

/* JADX INFO: renamed from: X.0n9S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423680n9S extends C09AY implements Function2<Integer, Asset, C1419590n2r> {
    public final /* synthetic */ i LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423680n9S(i iVar, int i) {
        super(2);
        this.LL = iVar;
        this.LLILLJJLI = i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function2
    public final C1419590n2r invoke(Integer num, Asset asset) {
        C1419590n2r c1419590n2r;
        int iIntValue = num.intValue();
        InterfaceC1423480n98<ORI_DATA, DATA> interfaceC1423480n98 = this.LL.LIZ;
        if (interfaceC1423480n98 != 0 && (c1419590n2r = (C1419590n2r) interfaceC1423480n98.LIZ((ORI_DATA) asset)) != null) {
            c1419590n2r.LIZJ = this.LLILLJJLI;
            c1419590n2r.LIZLLL = iIntValue;
            return c1419590n2r;
        }
        return null;
    }
}
