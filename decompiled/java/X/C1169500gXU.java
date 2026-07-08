package X;

import Y.AfS187S0100000_18;
import com.ss.android.ugc.aweme.mix.api.response.CheckPlayResponse;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0gXU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169500gXU extends C09AY implements Function1<C1169480gXS, Unit> {
    public final /* synthetic */ EditPlayListNameEditTextVM LL;
    public final /* synthetic */ int LLILLJJLI = 1;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1169500gXU(EditPlayListNameEditTextVM editPlayListNameEditTextVM, String str) {
        super(1);
        this.LL = editPlayListNameEditTextVM;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1169480gXS c1169480gXS) {
        if (!(c1169480gXS.LL instanceof C1623706Xj)) {
            this.LL.setStateImmediate(AFwS256S0000000_18.get$arr$(150));
            EditPlayListNameEditTextVM editPlayListNameEditTextVM = this.LL;
            C11NZ<CheckPlayResponse> c11nzCheckPlaylistName = ((InterfaceC1169460gXQ) editPlayListNameEditTextVM.LLILZIL.getValue().getOperator()).checkPlaylistName(this.LLILLJJLI, this.LLILLL);
            EditPlayListNameEditTextVM editPlayListNameEditTextVM2 = this.LL;
            editPlayListNameEditTextVM.disposeOnClear(c11nzCheckPlaylistName.LJJLL(new AfS187S0100000_18(editPlayListNameEditTextVM2, 19), new AfS187S0100000_18(editPlayListNameEditTextVM2, 20)));
        }
        return Unit.LIZ;
    }
}
