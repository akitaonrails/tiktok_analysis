package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985760bl8 extends C09AY implements Function1<Object, Boolean> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C985760bl8(long j) {
        super(1);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        boolean z;
        if ((obj instanceof C20390914qZ) && ((C20390914qZ) obj).LIZ.playbookId == this.LL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
