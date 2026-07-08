package X;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051260dSm extends C09AY implements Function0<InterfaceC1051160dSc> {
    public final /* synthetic */ AbstractC1051250dSl LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Bundle LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1051290dSp LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1051260dSm(AbstractC1051250dSl abstractC1051250dSl, Context context, String str, Bundle bundle, String str2, C1051290dSp c1051290dSp) {
        super(0);
        this.LL = abstractC1051250dSl;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = bundle;
        this.LLILZIL = str2;
        this.LLILZLL = c1051290dSp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1051160dSc invoke() {
        InterfaceC1020440cf4 interfaceC1020440cf4;
        AbstractC1051250dSl abstractC1051250dSl = this.LL;
        Context context = this.LLILLJJLI;
        String str = this.LLILLL;
        Bundle bundle = this.LLILZ;
        String str2 = this.LLILZIL;
        AbstractC1542100qES abstractC1542100qES = abstractC1051250dSl.renderLoadCallback;
        C1051290dSp c1051290dSp = this.LLILZLL;
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        String str3 = null;
        if (c1049260dPY != null) {
            interfaceC1020440cf4 = c1049260dPY.LJ;
            str3 = c1049260dPY.LIZ;
        } else {
            interfaceC1020440cf4 = null;
        }
        abstractC1051250dSl.sparkMixture = abstractC1051250dSl.createSparkMixture(context, str, bundle, str2, abstractC1542100qES, interfaceC1020440cf4, str3, abstractC1051250dSl.buildSparkInitParam(c1051290dSp));
        C811103Ev.LIZ(this.LL.getTag());
        return this.LL.sparkMixture;
    }
}
