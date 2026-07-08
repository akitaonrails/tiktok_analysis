package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144000fsM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144000fsM(int i, Context context, String str, String str2, String str3, boolean z) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1143980fsK c1143980fsK = C1143980fsK.LIZ;
        Context context = this.LL;
        boolean z = this.LLILLJJLI;
        String str = this.LLILLL;
        int i = this.LLILZ;
        String str2 = this.LLILZIL;
        String str3 = this.LLILZLL;
        c1143980fsK.getClass();
        C1143980fsK.LJIIIZ(i, context, str, str2, str3, z);
        return Unit.LIZ;
    }
}
