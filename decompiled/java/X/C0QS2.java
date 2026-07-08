package X;

import android.content.Context;
import android.text.Editable;
import android.widget.EditText;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.viewmodel.TakoButtonViewModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QS2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem$takoEntranceClicked$1", f = "BaseTakoFloatingButtonAssem.kt", l = {319}, m = "invokeSuspend")
public final class C0QS2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ BaseTakoFloatingButtonAssem LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QS2(long j, BaseTakoFloatingButtonAssem baseTakoFloatingButtonAssem, boolean z, String str, boolean z2, InterfaceC1364105Vn<? super C0QS2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = baseTakoFloatingButtonAssem;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QS2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String string;
        Editable editableLLJILLL;
        String str2;
        String str3;
        String str4;
        C0QS4 c0qs4;
        C1C7U.LIZ("BaseTakoFloatingButtonAssem@f3a0.takoEntranceClicked$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("BaseTakoFloatingButtonAssem@f3a0.takoEntranceClicked$1");
                return objLJFF;
            }
        }
        if (!this.LLILLL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BaseTakoFloatingButtonAssem@f3a0.takoEntranceClicked$1");
            return unit;
        }
        if (this.LLILLL.No() == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BaseTakoFloatingButtonAssem@f3a0.takoEntranceClicked$1");
            return unit2;
        }
        TakoButtonViewModel takoButtonViewModelVo = this.LLILLL.Vo();
        Context context = this.LLILLL.getContext();
        boolean z = this.LLILZ;
        if (z) {
            str = "click_voice_button";
        } else {
            str = "keyboard_above_icon_click";
        }
        if (z) {
            string = "";
        } else {
            BaseTakoFloatingButtonAssem baseTakoFloatingButtonAssem = this.LLILLL;
            C0QJB c0qjbKQ = baseTakoFloatingButtonAssem.LLJJIJIL;
            if (c0qjbKQ == null) {
                synchronized (baseTakoFloatingButtonAssem) {
                    c0qjbKQ = baseTakoFloatingButtonAssem.LLJJIJIL;
                    if (c0qjbKQ == null) {
                        c0qjbKQ = ((C0QJD) baseTakoFloatingButtonAssem.LLIZLLLIL.getValue()).KQ();
                        baseTakoFloatingButtonAssem.LLJJIJIL = c0qjbKQ;
                    }
                }
            }
            EditText editTextYr = c0qjbKQ.Yr();
            if (editTextYr == null || (editableLLJILLL = C2204961BRm.LLJILLL(editTextYr, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI7pbmFdf/uQTLAJbRF2Pp7H0SzFDqWLEImM905TnT7OEhYOJqr/3O9mWfst2ZOjioIfGP1kku0=", null))) == null || (string = editableLLJILLL.toString()) == null) {
                string = "";
            }
        }
        String str5 = this.LLILZIL;
        boolean z2 = this.LLILZ;
        boolean z3 = this.LLILZLL;
        if (takoButtonViewModelVo.LLIZLLLIL == 1) {
            str2 = "search_blankpage_tikbot";
        } else {
            str2 = "search_sug_tikbot";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from_last_page", str5);
        linkedHashMap.put("raw_query", string);
        if (z3) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_voice_bubble", str3);
        if (takoButtonViewModelVo.LLJI) {
            str4 = "keyboard_show";
        } else {
            str4 = "keyboard_hide";
        }
        linkedHashMap.put("icon_state", str4);
        if (context != null) {
            C682830QqP.LIZ(str2, str, new C20233614Fa(string, z2, linkedHashMap)).LJII(context);
        }
        if (C07CQ.LIZ() && this.LLILZ) {
            c0qs4 = C0QS4.VOICE_BUTTON;
        } else {
            c0qs4 = C0QS4.TAKO_BUTTON;
        }
        this.LLILLL.hp(this.LLILZLL, c0qs4);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BaseTakoFloatingButtonAssem@f3a0.takoEntranceClicked$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
