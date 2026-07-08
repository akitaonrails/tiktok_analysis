package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092290eWx extends C09AY implements Function1<C1092220eWq, Boolean> {
    public C1092290eWx() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C1092220eWq c1092220eWq) {
        boolean z;
        if (c1092220eWq.getBoardItemType() != 6) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
