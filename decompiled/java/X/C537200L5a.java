package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS409S0200000_8;
import njp.a;

/* JADX INFO: renamed from: X.0L5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.magic.I2VMagicTaskLoadingScene$go2EditFromDraft$1", f = "I2VMagicTaskLoadingScene.kt", l = {}, m = "invokeSuspend")
public final class C537200L5a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0LAO LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537200L5a(String str, Activity activity, int i, C0LAO c0lao, InterfaceC1364105Vn<? super C537200L5a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = activity;
        this.LLILLL = i;
        this.LLILZ = c0lao;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537200L5a(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VMagicTaskLoadingScene@bb43.go2EditFromDraft$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(this.LL, 0, null, 6, null), false, false, false, 14));
        if (awemeDraftLJI == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("I2VMagicTaskLoadingScene@bb43.go2EditFromDraft$1");
            return unit;
        }
        Activity activity = this.LLILLJJLI;
        int i = this.LLILLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final C0LAO c0lao = this.LLILZ;
        C570560MZi.LJ(activity, awemeDraftLJI, i, jCurrentTimeMillis, null, new OnStartEditDraftListener() { // from class: X.0L5b
            @Override // com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener
            public final void onEnd() {
                OnStartEditDraftListener.DefaultImpls.onEnd(this);
            }

            @Override // com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener
            public final void onStart(Intent intent) {
                C01TT.LIZJ(new AwS409S0200000_8(c0lao, awemeDraftLJI, 153));
            }
        }, "page");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("I2VMagicTaskLoadingScene@bb43.go2EditFromDraft$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
