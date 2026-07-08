package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1CwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246411CwB extends C09AY implements Function1<C2246381Cw8, C2246381Cw8> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ EnumC2246361Cw6 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2246411CwB(boolean z, String str, int i, EnumC2246361Cw6 enumC2246361Cw6) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = enumC2246361Cw6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2246381Cw8 invoke(C2246381Cw8 c2246381Cw8) {
        String str;
        Pair<Integer, Integer> pair;
        C2246381Cw8 c2246381Cw82 = c2246381Cw8;
        boolean z = this.LL;
        if (z) {
            str = c2246381Cw82.LLILLJJLI;
        } else {
            str = this.LLILLJJLI;
        }
        if (z) {
            pair = c2246381Cw82.LLILZ;
        } else {
            pair = new Pair<>(Integer.valueOf(this.LLILLL), Integer.valueOf(this.LLILLL));
        }
        return C2246381Cw8.LIZ(c2246381Cw82, null, str, this.LLILLJJLI, pair, null, this.LLILZ, false, null, 209);
    }
}
