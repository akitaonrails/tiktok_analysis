package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$buildBottom$1$1$1$invokeSuspend$$inlined$parseBizData$2", f = "ProfileIdentifierFragment.kt", l = {}, m = "invokeSuspend")
public final class C1622806Xa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileIdentifierFragment LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1622806Xa(ProfileIdentifierFragment profileIdentifierFragment, Object obj, InterfaceC1364105Vn interfaceC1364105Vn, View view) {
        super(2, interfaceC1364105Vn);
        this.LL = profileIdentifierFragment;
        this.LLILLJJLI = obj;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1622806Xa(this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String remoteText;
        C1C7U.LIZ("ProfileIdentifierFragment@f464.buildBottom$1$1$1$invokeSuspend$$inlined$parseBizData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isAdded() && this.LL.getView() != null) {
            BizBaseData bizBaseData = (BizBaseData) this.LLILLJJLI;
            TextView textView = (TextView) this.LLILLL.findViewById(R.id.s1l);
            if (textView != null) {
                Describe describe = bizBaseData.getDescribe();
                if (describe != null) {
                    remoteText = describe.getRemoteText();
                } else {
                    remoteText = null;
                }
                textView.setText(remoteText);
            }
        } else {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfileIdentifierPage", "Fragment not attached, skip onResult");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildBottom$1$1$1$invokeSuspend$$inlined$parseBizData$2");
        return unit;
    }
}
