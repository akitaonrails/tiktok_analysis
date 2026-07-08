package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21249218Dq extends C09AY implements Function1<String, C21246818Cs> {
    public C21249218Dq() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.18Cs, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final C21246818Cs invoke(String str) {
        return GsonProtectorUtils.fromJson(C18CS.LIZ(), str, C21246818Cs.class);
    }
}
