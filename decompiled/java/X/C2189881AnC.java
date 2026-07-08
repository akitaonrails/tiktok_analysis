package X;

import android.text.TextUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1AnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2189881AnC extends C09AY implements Function2<String, String, Unit> {
    public final /* synthetic */ C2189871AnB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2189881AnC(C2189871AnB c2189871AnB) {
        super(2);
        this.LL = c2189871AnB;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C2189871AnB c2189871AnB = this.LL;
        c2189871AnB.getClass();
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            c2189871AnB.LLLL.put(str3, str4);
        }
        return Unit.LIZ;
    }
}
