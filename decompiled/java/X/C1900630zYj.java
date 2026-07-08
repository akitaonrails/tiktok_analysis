package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900630zYj extends C09AY implements Function1<C1900430zYP, C1900430zYP> {
    public final /* synthetic */ List<InterfaceC1891350zJl> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ EnumC1900710zYr LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1900630zYj(List<InterfaceC1891350zJl> list, boolean z, EnumC1900710zYr enumC1900710zYr, boolean z2) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = enumC1900710zYr;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1900430zYP invoke(C1900430zYP c1900430zYP) {
        EnumC1889520zGo enumC1889520zGo;
        C1900430zYP c1900430zYP2 = c1900430zYP;
        C291001Au c291001Au = new C291001Au(this.LL);
        if (this.LLILLJJLI && this.LLILLL == EnumC1900710zYr.LOAD_MORE) {
            enumC1889520zGo = EnumC1889520zGo.ERROR;
        } else if (this.LLILZ) {
            enumC1889520zGo = EnumC1889520zGo.HAS_MORE;
        } else {
            enumC1889520zGo = EnumC1889520zGo.COMPLETE;
        }
        return C1900430zYP.LIZ(c1900430zYP2, c291001Au, enumC1889520zGo, new C1623606Xi(Unit.LIZ), null, null, null, null, null, null, null, 1016);
    }
}
