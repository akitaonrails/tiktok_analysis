package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0jKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276980jKq extends C09AY implements Function2<String, EnumC1277330jLP, Unit> {
    public final /* synthetic */ C1276910jKj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1276980jKq(C1276910jKj c1276910jKj) {
        super(2);
        this.LL = c1276910jKj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, EnumC1277330jLP enumC1277330jLP) {
        String str2 = str;
        EnumC1277330jLP enumC1277330jLP2 = enumC1277330jLP;
        String str3 = this.LL.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retry to subscribeAuxStream: streamId:");
        sbLIZ.append(str2);
        sbLIZ.append(", type:");
        sbLIZ.append(enumC1277330jLP2);
        C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
        this.LL.LJJJJJL(str2, enumC1277330jLP2);
        return Unit.LIZ;
    }
}
