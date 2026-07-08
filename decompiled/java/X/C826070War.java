package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0War, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826070War {
    public static final Map<String, InterfaceC826040Wao> LIZ = C2097608Jq.LJIIJ(new Pair("android_id", new InterfaceC826040Wao() { // from class: X.0Waq
        @Override // X.InterfaceC826040Wao
        public final boolean LIZ(Object[] objArr) {
            if (objArr == null || objArr.length == 0 || objArr.length < 2 || !Intrinsics.LJFF(objArr[1], "android_id")) {
                return false;
            }
            return true;
        }
    }));
}
