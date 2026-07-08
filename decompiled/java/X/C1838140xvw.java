package X;

import com.bytedance.android.livesdk.dialog.CommonBottomConfirmDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0xvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838140xvw extends C09AY implements Function1<CommonBottomConfirmDialog, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838140xvw(int i, int i2, int i3, Function0<Unit> function0) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CommonBottomConfirmDialog commonBottomConfirmDialog) {
        CommonBottomConfirmDialog commonBottomConfirmDialog2 = commonBottomConfirmDialog;
        commonBottomConfirmDialog2.LLJLLIL = R.layout.g0w;
        commonBottomConfirmDialog2.LLJLILLLLZIIL = this.LL;
        commonBottomConfirmDialog2.LLJLL = this.LLILLJJLI;
        int i = this.LLILLL;
        AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(this.LLILZ, (Function0<Unit>) 65);
        commonBottomConfirmDialog2.LLJLLL = i;
        commonBottomConfirmDialog2.LLJZ = awS606S0100000_27;
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(25);
        commonBottomConfirmDialog2.LLJZIJLIL = 0;
        commonBottomConfirmDialog2.LLL = aFwS269S0000000_27;
        return Unit.LIZ;
    }
}
