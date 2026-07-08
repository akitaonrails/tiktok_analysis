package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0yPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.longpress.TakoLongPressUtil$clickToPostImage$1", f = "TakoLongPressUtil.kt", l = {741}, m = "invokeSuspend")
public final class C1856680yPq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ Message LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ List<String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856680yPq(InterfaceC665370Q7z interfaceC665370Q7z, View view, List<String> list, Message message, Map<String, String> map, boolean z, List<String> list2, InterfaceC1364105Vn<? super C1856680yPq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = view;
        this.LLILZIL = list;
        this.LLILZLL = message;
        this.LLIZ = map;
        this.LLIZLLLIL = z;
        this.LLJ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1856680yPq c1856680yPq = new C1856680yPq(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1856680yPq.LLILLJJLI = obj;
        return c1856680yPq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoLongPressUtil@966e.clickToPostImage$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C07QI.LIZ.getClass();
            if (C07QI.LIZ()) {
                ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(this.LLILLL, ITakoChatPageAbility.class, null);
                if (iTakoChatPageAbility != null) {
                    iTakoChatPageAbility.t4(true);
                }
                C09AE c09ae = (C09AE) interfaceC497601wk.getCoroutineContext().get(C09AE.LJJLJ);
                if (c09ae != null) {
                    c09ae.LJII(new AwS606S0100000_27(this.LLILLL, 434));
                }
            }
            View view = this.LLILZ;
            List<String> list = this.LLILZIL;
            String str = this.LLILZLL.uuid;
            Map<String, String> map = this.LLIZ;
            boolean z = this.LLIZLLLIL;
            List<String> list2 = this.LLJ;
            this.LL = 1;
            if (C12FK.LIZIZ(view, list, str, map, z, list2, this) == objLJFF) {
                C1C7U.LIZIZ("TakoLongPressUtil@966e.clickToPostImage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoLongPressUtil@966e.clickToPostImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
