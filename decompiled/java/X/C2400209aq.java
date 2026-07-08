package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09aq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.epaigctask.EditorProAIGCServiceImpl$onAIPlaygroundAsyncTaskClicked$1$2$1", f = "EditorProAIGCServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C2400209aq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2400209aq(Integer num, String str, AwemeDraft awemeDraft, Activity activity, InterfaceC1364105Vn<? super C2400209aq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = awemeDraft;
        this.LLILZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2400209aq(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProAIGCServiceImpl@dfdd.onAIPlaygroundAsyncTaskClicked$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bundle bundle = new Bundle();
        Integer num = this.LL;
        if (num != null) {
            bundle.putInt("extra_ai_playground_error_code", num.intValue());
        }
        String str = this.LLILLJJLI;
        if (str != null) {
            C786410Ut5.LJJJI("extra_ai_playground_error_msg", str, bundle);
        }
        AwemeDraft awemeDraft = this.LLILLL;
        awemeDraft.LIZ.creativeInfo = awemeDraft.LIZIZ();
        C0MUK.LJIIJ(bundle, this.LLILLL.LIZ);
        C786410Ut5.LJJJI("shoot_way", this.LLILLL.LJJJJIZL.shootWay, bundle);
        C786410Ut5.LJJJI("shoot_from", this.LLILLL.LJJJJIZL.shootFrom, bundle);
        C786410Ut5.LJJJI("extra_ai_playground_create_from", "in_app_push", bundle);
        bundle.putBoolean("extra_keep_original_creation_id", true);
        C0MWH.LJIIL(this.LLILZ, bundle, "AIPlaygroundBaseScene", null, null, null, false, 120);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProAIGCServiceImpl@dfdd.onAIPlaygroundAsyncTaskClicked$1$2$1");
        return unit;
    }
}
