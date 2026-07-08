package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api.DMBotInteraction;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel$insertSuggestedReplyFromFirstResponse$2", f = "SmartReplySuggestedReplyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1507905vJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Boolean>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SmartReplySuggestedReplyViewModel LLILLJJLI;
    public final /* synthetic */ DMBotInteraction LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C0Y8T LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507905vJ(SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel, DMBotInteraction dMBotInteraction, String str, String str2, C0Y8T c0y8t, InterfaceC1364105Vn<? super C1507905vJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = smartReplySuggestedReplyViewModel;
        this.LLILLL = dMBotInteraction;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1507905vJ c1507905vJ = new C1507905vJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1507905vJ.LL = obj;
        return c1507905vJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartReplySuggestedReplyViewModel@aef2.insertSuggestedReplyFromFirstResponse$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C2296808zG.LJFF(interfaceC497601wk);
        String string = UUID.randomUUID().toString();
        SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel = this.LLILLJJLI;
        DMBotInteraction dMBotInteraction = this.LLILLL;
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        C0Y8T c0y8t = this.LLILZLL;
        smartReplySuggestedReplyViewModel.getClass();
        C1736806r8 c1736806r8AQ2 = SmartReplySuggestedReplyViewModel.AQ2(string, dMBotInteraction, str, str2, c0y8t);
        C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
        if (c1736806r8AQ2 == null) {
            Pair pair = new Pair(false, true);
            C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.insertSuggestedReplyFromFirstResponse$2");
            return pair;
        }
        C1508405vO c1508405vO = this.LLILLJJLI.LLJJIJI;
        if (c1508405vO != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1508405vO.LIZJ = jCurrentTimeMillis;
            c1508405vO.LIZLLL = jCurrentTimeMillis;
            C1508705vR.LL.getClass();
            C1508705vR.LJIIJ(c1508405vO);
        }
        String uuid = null;
        this.LLILLJJLI.LLJJIJI = null;
        this.LLILLJJLI.LLJILJIL = true;
        this.LLILLJJLI.LLJIJIL = c1736806r8AQ2.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Suggested Reply (one_shot) Successful ");
        C869590Y9l c869590Y9l = this.LLILLJJLI.LLJIJIL;
        if (c869590Y9l != null) {
            uuid = c869590Y9l.getUuid();
        }
        sbLIZ.append(uuid);
        C2188811AlT.LIZIZ(sbLIZ);
        Pair pair2 = new Pair(true, false);
        C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.insertSuggestedReplyFromFirstResponse$2");
        return pair2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
