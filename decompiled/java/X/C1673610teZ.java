package X;

import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0teZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673610teZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1673620tea LL;
    public final /* synthetic */ C13ES<C1673620tea> LLILLJJLI;
    public final /* synthetic */ C1689500u4C LLILLL;
    public final /* synthetic */ IUpdateSettingService LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ ISettingService LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673610teZ(C1673620tea c1673620tea, C13ES<C1673620tea> c13es, C1689500u4C c1689500u4C, IUpdateSettingService iUpdateSettingService, InterfaceC497601wk interfaceC497601wk, String str, String str2, ISettingService iSettingService) {
        super(0);
        this.LL = c1673620tea;
        this.LLILLJJLI = c13es;
        this.LLILLL = c1689500u4C;
        this.LLILZ = iUpdateSettingService;
        this.LLILZIL = interfaceC497601wk;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = iSettingService;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1673620tea c1673620tea = this.LL;
        boolean z = !c1673620tea.LIZLLL;
        ListIterator<C1673620tea> listIterator = this.LLILLJJLI.listIterator();
        int i = 0;
        while (true) {
            C13EU c13eu = (C13EU) listIterator;
            if (!c13eu.hasNext()) {
                break;
            }
            if (!Intrinsics.LJFF(((C1673620tea) c13eu.next()).LIZ, c1673620tea.LIZ)) {
                i++;
            } else if (i >= 0) {
                C1689500u4C c1689500u4C = this.LLILLL;
                String str = this.LL.LIZ;
                c1689500u4C.getClass();
                String str2 = Intrinsics.LJFF(str, "in_app_story_reveal_push") ? "unlock_by_friends" : Intrinsics.LJFF(str, "in_app_story_reveal_remind_push") ? "daily_reminder" : null;
                if (str2 != null) {
                    String str3 = this.LLILZLL;
                    String str4 = this.LLIZ;
                    C1673620tea c1673620tea2 = this.LL;
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    String str5 = c1673620tea2.LIZLLL ? "on" : "off";
                    String str6 = z ? "on" : "off";
                    c735840Sti.getClass();
                    C20684815ws.LJIILLIIL("ttsocial_story_reveal_notification_popup_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str3), new Pair("enter_method", str4), new Pair("from_status", str5), new Pair("button_name", str2), new Pair("to_status", str6)));
                }
                this.LLILLJJLI.set(i, C1673620tea.LIZ(this.LL, z));
                this.LLILZ.f6(z ? 1 : 0, this.LL.LIZ);
                C23250099c.LIZLLL(this.LLILZIL, null, null, new C1673640tec(this.LLIZLLLIL, this.LL, z ? 1 : 0, this.LLILLJJLI, i, z, this.LLILZ, null), 3);
            }
        }
        return Unit.LIZ;
    }
}
