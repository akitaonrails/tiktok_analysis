package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03Hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C817003Hc extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ List<DialogButton> LL;
    public final /* synthetic */ C1397580mTM LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function1<FetchInfo, Unit> LLILZ;
    public final /* synthetic */ Function1<ButtonAction, Boolean> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C817003Hc(List list, C1397580mTM c1397580mTM, Function0 function0, AwS580S0100000_1 awS580S0100000_1, Function1 function1, int i) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = c1397580mTM;
        this.LLILLL = function0;
        this.LLILZ = awS580S0100000_1;
        this.LLILZIL = function1;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        String str = "";
        if (C13LP.LJJJLL(this.LL) != null) {
            String str2 = ((DialogButton) C13LP.LJJJJZI(this.LL)).text;
            if (str2 == null) {
                str2 = "";
            }
            c1397620mTQ2.LIZJ(0, str2, new C039K(this.LLILLJJLI.LIZ, ((DialogButton) C13LP.LJJJJZI(this.LL)).buttonAction, this.LLILLL, this.LLILZ, this.LLILZIL));
        }
        if (C13LP.LJJJLZIJ(1, this.LL) != null) {
            String str3 = ((DialogButton) ListProtector.get(this.LL, 1)).text;
            if (str3 == null) {
                str3 = "";
            }
            c1397620mTQ2.LIZJ(1, str3, new C039K(this.LLILLJJLI.LIZ, ((DialogButton) ListProtector.get(this.LL, 1)).buttonAction, this.LLILLL, this.LLILZ, this.LLILZIL));
        }
        if (C13LP.LJJJLZIJ(2, this.LL) != null) {
            String str4 = ((DialogButton) ListProtector.get(this.LL, 2)).text;
            if (str4 != null) {
                str = str4;
            }
            c1397620mTQ2.LIZJ(2, str, new C039K(this.LLILLJJLI.LIZ, ((DialogButton) ListProtector.get(this.LL, 2)).buttonAction, this.LLILLL, this.LLILZ, this.LLILZIL));
        }
        if (this.LLILZLL == 1) {
            c1397620mTQ2.LJFF = true;
        }
        return Unit.LIZ;
    }
}
