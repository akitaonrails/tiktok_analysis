package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tiW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676060tiW extends C09AY implements Function1<Integer, CharSequence> {
    public final /* synthetic */ C1692150u8T LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1676060tiW(C1692150u8T c1692150u8T, String str) {
        super(1);
        this.LL = c1692150u8T;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Integer num) {
        return C1676150tif.LJIIIZ(this.LL, this.LLILLJJLI, num.intValue());
    }
}
