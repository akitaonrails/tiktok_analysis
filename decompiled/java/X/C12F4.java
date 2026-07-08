package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S7810100_27;
import kotlin.jvm.internal.AwS141S0400000_12;

/* JADX INFO: renamed from: X.12F4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12F4 extends C09AY implements Function1<C12F3, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ TakoMultipleSelectVM LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ Long LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ Integer LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ TakoCardAbility LLJJI;
    public final /* synthetic */ IMessageAbility LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12F4(long j, View view, InterfaceC665370Q7z interfaceC665370Q7z, TakoCardAbility takoCardAbility, TakoMultipleSelectVM takoMultipleSelectVM, IMessageAbility iMessageAbility, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = takoMultipleSelectVM;
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = map;
        this.LLILZIL = str;
        this.LLILZLL = view;
        this.LLIZ = str2;
        this.LLIZLLLIL = j;
        this.LLJ = l;
        this.LLJI = str3;
        this.LLJIJIL = str4;
        this.LLJILJIL = str5;
        this.LLJILJILJ = str6;
        this.LLJILLL = num;
        this.LLJJ = str7;
        this.LLJJI = takoCardAbility;
        this.LLJJIII = iMessageAbility;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C12F3 c12f3) {
        C12F3 c12f32 = c12f3;
        TakoMultipleSelectVM takoMultipleSelectVM = this.LLILLJJLI;
        boolean z = this.LL;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
        Map<String, String> map = this.LLILZ;
        String str = this.LLILZIL;
        View view = this.LLILZLL;
        String str2 = this.LLIZ;
        long j = this.LLIZLLLIL;
        Long l = this.LLJ;
        String str3 = this.LLJI;
        String str4 = this.LLJIJIL;
        String str5 = this.LLJILJIL;
        String str6 = this.LLJILJILJ;
        new AwS0S7810100_27(j, view, interfaceC665370Q7z, this.LLJJI, takoMultipleSelectVM, this.LLJJIII, this.LLJILLL, l, str, str2, str3, str4, str5, str6, this.LLJJ, map, z, 0).invoke(c12f32.LIZIZ);
        if (C298810BnT.LIZ() && !this.LL) {
            c12f32.LIZ(new C12F1(this.LLILZ, this.LLILLL, this.LLILLJJLI, this.LLILZIL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJIJIL, this.LLJI, this.LLJILJIL, this.LLJJ));
        } else if (C298810BnT.LIZ()) {
            C12F2.LIZ(c12f32, new AwS141S0400000_12(this.LLILLJJLI, (TakoMultipleSelectVM) this.LLILLL, (InterfaceC665370Q7z) this.LLILZ, (Map<String, String>) this.LLILZLL, (View) 3), new AwS141S0400000_12(this.LLILLJJLI, (TakoMultipleSelectVM) this.LLILLL, (InterfaceC665370Q7z) this.LLILZ, (Map<String, String>) this.LLILZLL, (View) 4), true, this.LLILLJJLI);
        } else {
            c12f32.LIZ(new C12F0(this.LLILZ, this.LLILLL, this.LLILLJJLI, this.LLILZIL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJIJIL, this.LLJI, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ));
        }
        return Unit.LIZ;
    }
}
