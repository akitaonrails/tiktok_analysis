package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0elu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101560elu extends C09AY implements Function2<String, String, Boolean> {
    public C1101560elu() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(String str, String str2) {
        return Boolean.valueOf(Intrinsics.LJFF(str, str2));
    }
}
