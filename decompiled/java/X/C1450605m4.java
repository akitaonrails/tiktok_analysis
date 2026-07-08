package X;

import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1450605m4 {
    public static final EnumC1450305m1 LIZ(String str, Function1<? super String, GlobalComponentData> function1) {
        GlobalComponentData globalComponentDataInvoke;
        Integer numValueOf;
        if (function1 != null && (globalComponentDataInvoke = function1.invoke(str)) != null && (numValueOf = Integer.valueOf(globalComponentDataInvoke.getShowStrategy())) != null) {
            if (numValueOf.intValue() == 0) {
                return EnumC1450305m1.NORMAL;
            }
            if (numValueOf.intValue() == 1) {
                return EnumC1450305m1.SKIP_AVOID;
            }
            if (numValueOf.intValue() == 2) {
                return EnumC1450305m1.MUST_SHOW;
            }
        }
        return EnumC1450305m1.NORMAL;
    }
}
