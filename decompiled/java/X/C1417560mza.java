package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417560mza extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1417330mzD LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417560mza(String str, C1417330mzD c1417330mzD, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c1417330mzD;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str = this.LL;
        if (str != null) {
            this.LLILLJJLI.ed(str, null);
        }
        if (this.LLILLL != null) {
            C19EG activity = this.LLILLJJLI.getActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(this.LLILLL);
            C1390380mHk.LIZ(activity, 1030, creativeToastBuilder);
        } else {
            C19EG activity2 = this.LLILLJJLI.getActivity();
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131825365);
            C1390380mHk.LIZ(activity2, 1030, creativeToastBuilder2);
        }
        return Unit.LIZ;
    }
}
