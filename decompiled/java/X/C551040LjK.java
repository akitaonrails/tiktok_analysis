package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551040LjK extends C09AY implements Function1<C551080LjO, Unit> {
    public final /* synthetic */ C545520LaQ<C550580Lia<Object>> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551040LjK(C545520LaQ<C550580Lia<Object>> c545520LaQ, String str, boolean z) {
        super(1);
        this.LL = c545520LaQ;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C551080LjO c551080LjO) {
        C551080LjO c551080LjO2 = c551080LjO;
        C545520LaQ<C550580Lia<Object>> c545520LaQ = this.LL;
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        C551030LjJ.LIZ(c551080LjO2, c545520LaQ, str, AFwS239S0000000_8.get$arr$(330));
        c551080LjO2.LIZ(C552690Llz.INSTANCE, new AwS552S0100000_8(c545520LaQ, (C545520LaQ<C550580Lia<Object>>) 1030));
        if (z) {
            c551080LjO2.LIZ(C552470Lld.INSTANCE, new AwS552S0100000_8(c545520LaQ, (C545520LaQ<C550580Lia<Object>>) 1031));
        } else {
            c551080LjO2.LIZ(C552530Llj.INSTANCE, new AwS552S0100000_8(c545520LaQ, (C545520LaQ<C550580Lia<Object>>) 1032));
        }
        return Unit.LIZ;
    }
}
