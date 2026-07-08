package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS100S1200000_16;

/* JADX INFO: renamed from: X.09fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2430409fi extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2430409fi(String str, String str2, AwS100S1200000_16 awS100S1200000_16) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = awS100S1200000_16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Activity topActivity = ActivityStack.getTopActivity();
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(str);
        this.LLILLL.invoke(Boolean.valueOf(C2430309fh.LIZ(topActivity, str2, C2188811AlT.LIZIZ(sbLIZ))));
        return Unit.LIZ;
    }
}
