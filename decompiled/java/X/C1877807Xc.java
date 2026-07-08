package X;

import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07Xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1877807Xc extends C09AY implements Function1<String, Boolean> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1877807Xc(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        return Boolean.valueOf(a0.LJJIIZI(str, this.LL, false));
    }
}
