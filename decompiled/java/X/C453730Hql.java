package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS7S3400000_6;

/* JADX INFO: renamed from: X.0Hql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453730Hql {
    public final String LIZ;
    public final Function1<InterfaceC1364105Vn<? super CharSequence>, Object> LIZIZ;
    public final Function0<Unit> LIZJ;

    public C453730Hql(String str, Function1 function1, AwS7S3400000_6 awS7S3400000_6, int i) {
        str = (i & 1) != 0 ? null : str;
        function1 = (i & 2) != 0 ? null : function1;
        awS7S3400000_6 = (i & 4) != 0 ? null : awS7S3400000_6;
        this.LIZ = str;
        this.LIZIZ = function1;
        this.LIZJ = awS7S3400000_6;
    }
}
