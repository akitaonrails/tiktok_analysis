package X;

import android.text.SpannableString;
import android.widget.TextView;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoStaticInfoAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ppw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoStaticInfoAssem$bindDescription$2", f = "SearchPhotoStaticInfoAssem.kt", l = {421}, m = "invokeSuspend")
public final class C657060Ppw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchPhotoStaticInfoAssem LLILLJJLI;
    public final /* synthetic */ SpannableString LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C657060Ppw(SearchPhotoStaticInfoAssem searchPhotoStaticInfoAssem, SpannableString spannableString, InterfaceC1364105Vn<? super C657060Ppw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchPhotoStaticInfoAssem;
        this.LLILLL = spannableString;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C657060Ppw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchPhotoStaticInfoAssem@e320.bindDescription$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            TextView textView = this.LLILLJJLI.LLL;
            if (textView == null) {
                textView = null;
            }
            this.LL = 1;
            obj = C0R1A.LIZ(textView, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchPhotoStaticInfoAssem@e320.bindDescription$2");
                return objLJFF;
            }
        }
        SearchPhotoStaticInfoAssem searchPhotoStaticInfoAssem = this.LLILLJJLI;
        SpannableString spannableString = this.LLILLL;
        int iIntValue = ((Number) obj).intValue();
        IAdjustAbility iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchPhotoStaticInfoAssem), IAdjustAbility.class, null);
        if (iAdjustAbility != null) {
            iAdjustAbility.qw1(EnumC657070Ppx.DESC, new C656980Ppo(spannableString.toString(), iIntValue));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPhotoStaticInfoAssem@e320.bindDescription$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
