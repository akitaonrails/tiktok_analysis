package X;

import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yaq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863500yaq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C12F5 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC665370Q7z LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Long LLIZ;
    public final /* synthetic */ Long LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Integer LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ TakoMultipleSelectVM LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863500yaq(C12F5 c12f5, boolean z, Map<String, String> map, String str, InterfaceC665370Q7z interfaceC665370Q7z, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, Integer num, String str7, TakoMultipleSelectVM takoMultipleSelectVM) {
        super(0);
        this.LL = c12f5;
        this.LLILLJJLI = z;
        this.LLILLL = map;
        this.LLILZ = str;
        this.LLILZIL = interfaceC665370Q7z;
        this.LLILZLL = str2;
        this.LLIZ = l;
        this.LLIZLLLIL = l2;
        this.LLJ = str3;
        this.LLJI = str4;
        this.LLJIJIL = str5;
        this.LLJILJIL = str6;
        this.LLJILJILJ = num;
        this.LLJILLL = str7;
        this.LLJJ = takoMultipleSelectVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (Intrinsics.LJFF(C12FB.LIZ, this.LL)) {
            this.LL.dismiss();
            if (!this.LLILLJJLI) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str = this.LLILLL.get("enter_from");
                if (str == null) {
                    str = "";
                }
                String str2 = this.LLILLL.get("enter_method");
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = this.LLILLL.get("process_id");
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = this.LLILLL.get("tako_session_id");
                if (str4 == null) {
                    str4 = "";
                }
                C1862330yYx.LJJ(c1862330yYx, str, str2, str3, str4, this.LLILLL.get("tako_chat_id"), "share", "click_cancel", null, null, null, null, null, null, null, C2097908Jt.LIZJ(new Pair("message_id", this.LLILZ)), 49024);
            }
            C1862330yYx c1862330yYx2 = C1862330yYx.LIZ;
            C1862950yZx c1862950yZx = C1862950yZx.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZIL;
            c1862950yZx.getClass();
            C1862330yYx.LJJLJ(c1862330yYx2, this.LLILLL, this.LLILZ, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, "delete_combine_share", this.LLJ, this.LLJI, this.LLJIJIL, null, null, null, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, C1862950yZx.LIZJ(interfaceC665370Q7z), 69120);
            C12FB.LIZIZ(this.LLJJ);
        }
        return Unit.LIZ;
    }
}
