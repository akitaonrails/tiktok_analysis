package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21249118Dp extends C09AY implements Function1<C21246818Cs, String> {
    public C21249118Dp() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(C21246818Cs c21246818Cs) {
        return GsonProtectorUtils.toJson(C18CS.LIZ(), c21246818Cs);
    }
}
