package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514960KHm extends C09AY implements Function1<String, Boolean> {
    public final /* synthetic */ Function1<String, Boolean> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514960KHm(C514490KFr c514490KFr) {
        super(1);
        this.LL = c514490KFr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        return this.LL.invoke(str);
    }
}
