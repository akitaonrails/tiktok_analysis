package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0noM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1449040noM extends C1696260uF6 implements Function2<String, String, Unit> {
    public C1449040noM(Object obj) {
        super(2, obj, HashMap.class, "put", "put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 8);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        ((HashMap) this.receiver).put(str, str2);
        return Unit.LIZ;
    }
}
