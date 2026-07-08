package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.toolbar.ToolbarComponent$state$1", f = "ToolbarComponent.kt", l = {}, m = "invokeSuspend")
public final class C1660040tIg extends C09AX implements InterfaceC1631630sYr<List<? extends C443120HZe<? extends InterfaceC1659860tIO, ? extends InterfaceC1664980tQe<? extends InterfaceC1659860tIO, ? extends InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>, ? extends InterfaceC1660130tIp<? extends InterfaceC1659860tIO>>>, Set<? extends InterfaceC1660190tIv>, Effect, InterfaceC1364105Vn<? super C443120HZe<? extends List<? extends C443120HZe<? extends InterfaceC1659860tIO, ? extends InterfaceC1664980tQe<? extends InterfaceC1659860tIO, ? extends InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>, ? extends InterfaceC1660130tIp<? extends InterfaceC1659860tIO>>>, ? extends Set<? extends InterfaceC1660190tIv>, ? extends Effect>>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ Effect LLILLL;
    public final /* synthetic */ C1660030tIf LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660040tIg(InterfaceC1364105Vn interfaceC1364105Vn, C1660030tIf c1660030tIf) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = c1660030tIf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolbarComponent@20f4.state$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        Object obj3 = this.LLILLJJLI;
        Effect effect = this.LLILLL;
        this.LLILZ.LLIZ = effect;
        C443120HZe c443120HZe = new C443120HZe(obj2, obj3, effect);
        C1C7U.LIZIZ("ToolbarComponent@20f4.state$1");
        return c443120HZe;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(List<? extends C443120HZe<? extends InterfaceC1659860tIO, ? extends InterfaceC1664980tQe<? extends InterfaceC1659860tIO, ? extends InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>, ? extends InterfaceC1660130tIp<? extends InterfaceC1659860tIO>>> list, Set<? extends InterfaceC1660190tIv> set, Effect effect, InterfaceC1364105Vn<? super C443120HZe<? extends List<? extends C443120HZe<? extends InterfaceC1659860tIO, ? extends InterfaceC1664980tQe<? extends InterfaceC1659860tIO, ? extends InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>, ? extends InterfaceC1660130tIp<? extends InterfaceC1659860tIO>>>, ? extends Set<? extends InterfaceC1660190tIv>, ? extends Effect>> interfaceC1364105Vn) {
        C1660040tIg c1660040tIg = new C1660040tIg(interfaceC1364105Vn, this.LLILZ);
        c1660040tIg.LL = list;
        c1660040tIg.LLILLJJLI = set;
        c1660040tIg.LLILLL = effect;
        return c1660040tIg.invokeSuspend(Unit.LIZ);
    }
}
