package X;

import com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment$onCreateView$1$1$7$1", f = "SocialThoughtPanelFragment.kt", l = {}, m = "invokeSuspend")
public final class C341100DYu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ SocialThoughtPanelFragment LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341100DYu(boolean z, SocialThoughtPanelFragment socialThoughtPanelFragment, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C341100DYu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = socialThoughtPanelFragment;
        this.LLILLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C341100DYu(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtPanelFragment@3c57.onCreateView$1$1$7$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL && !this.LLILLL.getValue().booleanValue()) {
            this.LLILLL.setValue(Boolean.TRUE);
            C341220DZg c341220DZg = C341220DZg.LIZ;
            SocialThoughtPanelFragment socialThoughtPanelFragment = this.LLILLJJLI;
            String str = socialThoughtPanelFragment.LLIZLLLIL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = socialThoughtPanelFragment.LLJ;
            if (str3 != null) {
                str2 = str3;
            }
            c341220DZg.getClass();
            C341220DZg.LJIIZILJ("ttsocial_friends_thoughts_entrance_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("position", "guest_thought_view_panel")));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtPanelFragment@3c57.onCreateView$1$1$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
