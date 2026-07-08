package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839990WxJ extends C09AY implements Function0<Object> {
    public final /* synthetic */ Object LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C839990WxJ(Object obj) {
        super(0);
        this.LL = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        C2086108Ff c2086108Ff = C2086108Ff.LIZ;
        Object obj = this.LL;
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        c2086108Ff.getClass();
        return C2086108Ff.LIZ(str);
    }
}
