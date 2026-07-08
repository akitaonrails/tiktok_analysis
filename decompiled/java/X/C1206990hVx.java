package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS5S3300000_18;

/* JADX INFO: renamed from: X.0hVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206990hVx extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ C1206950hVt LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206990hVx(Activity activity, C1206950hVt c1206950hVt, Function0<Unit> function0, String str, String str2, String str3, Function0<Unit> function02) {
        super(1);
        this.LL = activity;
        this.LLILLJJLI = c1206950hVt;
        this.LLILLL = function0;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJFF(2131844825, new AwS5S3300000_18(this.LL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLILLL, 1));
        c1397620mTQ2.LJFF(2131844824, new AwS5S3300000_18(this.LL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, 2));
        return Unit.LIZ;
    }
}
