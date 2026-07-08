package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iDO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233920iDO extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233920iDO(int i, TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, String str, String str2, List list, boolean z) {
        super(1);
        this.LL = twoStepVerificationActivityViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = list;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            this.LL.wQ2("totp_verify", str2, this.LLILZIL, this.LLILLJJLI, this.LLILZLL);
        } else {
            this.LL.wQ2(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILZLL);
        }
        return Unit.LIZ;
    }
}
