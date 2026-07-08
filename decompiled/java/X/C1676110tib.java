package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676110tib extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C1692150u8T LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1676110tib(C1692150u8T c1692150u8T, C1677480tko<Float, C1677280tkU> c1677480tko) {
        super(0);
        this.LL = c1692150u8T;
        this.LLILLJJLI = c1677480tko;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        C1692150u8T c1692150u8T = this.LL;
        return Integer.valueOf(c1692150u8T != null ? C1676150tif.LJII(c1692150u8T, this.LLILLJJLI.LIZLLL().floatValue()) : 0);
    }
}
