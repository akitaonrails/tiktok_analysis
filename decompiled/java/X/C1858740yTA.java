package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yTA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858740yTA extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ InterfaceC665370Q7z LLILLJJLI;
    public final /* synthetic */ TakoMultipleSelectVM LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ Long LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1858740yTA(Map<String, String> map, InterfaceC665370Q7z interfaceC665370Q7z, TakoMultipleSelectVM takoMultipleSelectVM, String str, String str2, long j, Long l, String str3, String str4, String str5, String str6, Integer num, String str7) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILLL = takoMultipleSelectVM;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = j;
        this.LLIZ = l;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = num;
        this.LLJILJILJ = str7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        List<C326880Cre> listDQ2;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LL);
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(this.LLILLJJLI, ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT712 = iTakoContextAbility.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
            linkedHashMap.put("chat_bot_source", String.valueOf(c1863850ybP2.LLJJI));
        }
        TakoMultipleSelectVM takoMultipleSelectVM = this.LLILLL;
        if (takoMultipleSelectVM != null) {
            takoMultipleSelectVM.EQ2(linkedHashMap);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1862950yZx c1862950yZx = C1862950yZx.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
        c1862950yZx.getClass();
        C1862330yYx.LJJLJ(c1862330yYx, this.LL, this.LLILZ, this.LLILZIL, Long.valueOf(this.LLILZLL), this.LLIZ, "combine_share", this.LLIZLLLIL, this.LLJ, this.LLJI, null, null, null, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, C1862950yZx.LIZJ(interfaceC665370Q7z), 69120);
        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(this.LLILLJJLI, ITakoContextAbility.class, null);
        if (iTakoContextAbility2 != null && (c13lcT71 = iTakoContextAbility2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            int i = C14FI.LIZ;
            C14FI.LIZ(c1863850ybP.LLILZIL);
        }
        TakoMultipleSelectVM takoMultipleSelectVM2 = this.LLILLL;
        if (takoMultipleSelectVM2 != null && (listDQ2 = takoMultipleSelectVM2.DQ2()) != null) {
            Map<String, String> map = this.LL;
            for (C326880Cre c326880Cre : listDQ2) {
                C1862420yZ6 c1862420yZ6 = C1862420yZ6.LIZ;
                String str = map.get("process_id");
                if (str == null) {
                    str = "";
                }
                String str2 = c326880Cre.LLILLL.uuid;
                String type = EnumC1858730yT9.SHARE.getType();
                c1862420yZ6.getClass();
                C1862420yZ6.LIZ(str, str2, type);
            }
        }
        return Unit.LIZ;
    }
}
