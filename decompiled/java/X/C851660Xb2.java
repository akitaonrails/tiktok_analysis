package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Xb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851660Xb2 implements InterfaceC851540Xaq {
    public final /* synthetic */ Function2<BaseAccountFlowFragment, Boolean, Unit> LIZ;
    public final /* synthetic */ Function2<String, Integer, Unit> LIZIZ;
    public final /* synthetic */ EnumC852910Xd3 LIZJ;
    public final /* synthetic */ SignUpOrLoginActivity LIZLLL;

    @Override // X.InterfaceC851540Xaq
    public final BaseAccountFlowFragment getCurrentFragment() {
        BaseAccountFlowFragment baseAccountFlowFragment;
        SignUpOrLoginActivity signUpOrLoginActivity = this.LIZLLL;
        Object obj = signUpOrLoginActivity.LLJJI;
        return (!(obj instanceof BaseAccountFlowFragment) || (baseAccountFlowFragment = (BaseAccountFlowFragment) obj) == null) ? signUpOrLoginActivity.LLLLZI() : baseAccountFlowFragment;
    }

    @Override // X.InterfaceC851540Xaq
    public final void LIZ(Bundle bundle) {
        C851990XbZ c851990XbZ = C851990XbZ.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = this.LIZJ;
        EnumC851960XbW enumC851960XbW = EnumC851960XbW.LOAD_OPTIONAL_PAGES;
        c851990XbZ.getClass();
        C851990XbZ.LIZ(enumC852910Xd3, enumC851960XbW);
        this.LIZLLL.LLZ(bundle);
    }

    @Override // X.InterfaceC851540Xaq
    public final void LIZIZ(int i, String str) {
        this.LIZIZ.invoke(str, Integer.valueOf(i));
    }

    @Override // X.InterfaceC851540Xaq
    public final void LIZJ(BaseAccountFlowFragment baseAccountFlowFragment, EnumC852910Xd3 enumC852910Xd3) {
        C851990XbZ c851990XbZ = C851990XbZ.LIZ;
        EnumC851960XbW enumC851960XbW = EnumC851960XbW.DISMISS;
        c851990XbZ.getClass();
        C851990XbZ.LIZ(enumC852910Xd3, enumC851960XbW);
        this.LIZ.invoke(baseAccountFlowFragment, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C851660Xb2(Function2<? super BaseAccountFlowFragment, ? super Boolean, Unit> function2, Function2<? super String, ? super Integer, Unit> function22, EnumC852910Xd3 enumC852910Xd3, SignUpOrLoginActivity signUpOrLoginActivity) {
        this.LIZ = function2;
        this.LIZIZ = function22;
        this.LIZJ = enumC852910Xd3;
        this.LIZLLL = signUpOrLoginActivity;
    }
}
