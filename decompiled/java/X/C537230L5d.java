package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS409S0200000_8;
import njp.a;

/* JADX INFO: renamed from: X.0L5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.magic.I2VMagicTaskLoadingScene$I2VDelegateFromConsume$go2Edit$1", f = "I2VMagicTaskLoadingScene.kt", l = {493}, m = "invokeSuspend")
public final class C537230L5d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AwemeDraft LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0LAO LLILZ;
    public final /* synthetic */ Activity LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537230L5d(String str, C0LAO c0lao, Activity activity, InterfaceC1364105Vn<? super C537230L5d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c0lao;
        this.LLILZIL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537230L5d(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AwemeDraft awemeDraftLJI;
        Intent intent;
        Object objLJII = obj;
        C1C7U.LIZ("I2VMagicTaskLoadingScene$I2VDelegateFromConsume@cf33.go2Edit$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                awemeDraftLJI = this.LL;
                C155000ia.LIZIZ(objLJII);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJII);
            awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(this.LLILLL, 0, null, 6, null), false, false, false, 14));
            if (awemeDraftLJI == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("I2VMagicTaskLoadingScene$I2VDelegateFromConsume@cf33.go2Edit$1");
                return unit;
            }
            InterfaceC545580LaW interfaceC545580LaWLIZIZ = C0CHQ.LIZ().LJI().LIZIZ();
            final Activity activity = this.LLILZIL;
            C542550LPp c542550LPp = new C542550LPp(new InterfaceC537370L5r(activity) { // from class: X.0L5e
                public final Context LIZ;

                @Override // X.InterfaceC537370L5r
                public final IDraftListener LIZ() {
                    return null;
                }

                @Override // X.InterfaceC537370L5r
                public final boolean LIZIZ() {
                    return false;
                }

                @Override // X.InterfaceC537370L5r
                public final LifecycleOwner getLifecycleOwner() {
                    return C537270L5h.LIZ(this);
                }

                @Override // X.InterfaceC537370L5r
                public final Context getContext() {
                    return this.LIZ;
                }

                {
                    this.LIZ = activity;
                }
            }, awemeDraftLJI, new C0M2T(false, null, null, 0, false, 31));
            this.LL = awemeDraftLJI;
            this.LLILLJJLI = 1;
            objLJII = interfaceC545580LaWLIZIZ.LJII(c542550LPp, this);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("I2VMagicTaskLoadingScene$I2VDelegateFromConsume@cf33.go2Edit$1");
                return objLJFF;
            }
        }
        VideoPublishEditModel videoPublishEditModel = ((C0LBJ) objLJII).LIZIZ;
        if (videoPublishEditModel == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("I2VMagicTaskLoadingScene$I2VDelegateFromConsume@cf33.go2Edit$1");
            return unit2;
        }
        if (this.LLILZ.mArguments == null) {
            intent = this.LLILZIL.getIntent();
        } else {
            intent = new Intent();
            Bundle bundle = this.LLILZ.mArguments;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
        }
        C580250MpL.LIZ(intent, videoPublishEditModel, false);
        intent.putExtra("draft_to_edit_from", 8);
        String str = VECutVideoActivity._pnsPageId;
        C0L4B.LIZIZ(this.LLILZIL, intent, false, false);
        C01TT.LIZJ(new AwS409S0200000_8(this.LLILZ, awemeDraftLJI, 152));
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("I2VMagicTaskLoadingScene$I2VDelegateFromConsume@cf33.go2Edit$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
