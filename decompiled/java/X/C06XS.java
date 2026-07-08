package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.model.ProfileIdentifierCellInfo;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.model.ProfileIdentifierCellInfoContent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06XS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$buildContentSectionInfoListBaseItem$2$1$invokeSuspend$$inlined$parseBizData$2", f = "ProfileIdentifierFragment.kt", l = {}, m = "invokeSuspend")
public final class C06XS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileIdentifierFragment LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LinearLayout LLILLL;
    public final /* synthetic */ ProfileIdentifierFragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06XS(ProfileIdentifierFragment profileIdentifierFragment, Object obj, InterfaceC1364105Vn interfaceC1364105Vn, LinearLayout linearLayout, ProfileIdentifierFragment profileIdentifierFragment2) {
        super(2, interfaceC1364105Vn);
        this.LL = profileIdentifierFragment;
        this.LLILLJJLI = obj;
        this.LLILLL = linearLayout;
        this.LLILZ = profileIdentifierFragment2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06XS(this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileIdentifierFragment@f464.buildContentSectionInfoListBaseItem$2$1$invokeSuspend$$inlined$parseBizData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isAdded() && this.LL.getView() != null) {
            ProfileIdentifierCellInfo profileIdentifierCellInfo = (ProfileIdentifierCellInfo) this.LLILLJJLI;
            TextView textView = (TextView) this.LLILLL.findViewById(R.id.s1u);
            if (textView != null) {
                textView.setText(profileIdentifierCellInfo.getTitle());
            }
            List<ProfileIdentifierCellInfoContent> content = profileIdentifierCellInfo.getContent();
            if (content != null) {
                for (ProfileIdentifierCellInfoContent profileIdentifierCellInfoContent : content) {
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ.getContext()), R.layout.ef7, this.LLILLL, false);
                    this.LLILLL.addView(viewTd);
                    TextView textView2 = (TextView) viewTd.findViewById(R.id.s1s);
                    if (textView2 != null) {
                        textView2.setText(profileIdentifierCellInfoContent.getSubtitle());
                    }
                    TextView textView3 = (TextView) viewTd.findViewById(R.id.s1t);
                    if (textView3 != null) {
                        textView3.setText(profileIdentifierCellInfoContent.getText());
                    }
                }
            }
        } else {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfileIdentifierPage", "Fragment not attached, skip onResult");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildContentSectionInfoListBaseItem$2$1$invokeSuspend$$inlined$parseBizData$2");
        return unit;
    }
}
