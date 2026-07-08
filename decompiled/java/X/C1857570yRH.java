package X;

import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS39S0010000_27;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yRH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857570yRH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TakoMultipleSelectVM LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1857570yRH(TakoMultipleSelectVM takoMultipleSelectVM, boolean z, InterfaceC665370Q7z interfaceC665370Q7z, Map<String, String> map, String str) {
        super(0);
        this.LL = takoMultipleSelectVM;
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = map;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        TakoMultipleSelectVM takoMultipleSelectVM = this.LL;
        if (takoMultipleSelectVM != null) {
            takoMultipleSelectVM.setState(new AwS39S0010000_27(true, 29));
        }
        C1857420yR2.LIZJ = false;
        if (this.LLILLJJLI) {
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(this.LLILLL, ITakoContextAbility.class, null);
            C1862330yYx.LJLJJLL(24, C1862330yYx.LIZ, "conversation", "button_click", null, iTakoContextAbility != null ? iTakoContextAbility.getCommonParams() : null);
        } else {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str = this.LLILZ.get("enter_from");
            if (str == null) {
                str = "";
            }
            String str2 = this.LLILZ.get("enter_method");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.LLILZ.get("process_id");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = this.LLILZ.get("tako_session_id");
            C1862330yYx.LJJI(c1862330yYx, str, str2, str3, str4 != null ? str4 : "", this.LLILZ.get("tako_chat_id"), "share", null, null, null, C2097908Jt.LIZJ(new Pair("message_id", this.LLILZIL)), 960);
        }
        return Unit.LIZ;
    }
}
