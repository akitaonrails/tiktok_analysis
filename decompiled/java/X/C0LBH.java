package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LBH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.epaigctask.EditorProAIGCServiceImpl$onAsyncTaskClicked$1$1$1", f = "EditorProAIGCServiceImpl.kt", l = {141}, m = "invokeSuspend")
public final class C0LBH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ C538890LBn LLILLL;
    public final /* synthetic */ AwemeDraft LLILZ;
    public final /* synthetic */ C538870LBl LLILZIL;
    public final /* synthetic */ Activity LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LBH(VideoPublishEditModel videoPublishEditModel, C538890LBn c538890LBn, AwemeDraft awemeDraft, C538870LBl c538870LBl, Activity activity, InterfaceC1364105Vn<? super C0LBH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = c538890LBn;
        this.LLILZ = awemeDraft;
        this.LLILZIL = c538870LBl;
        this.LLILZLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LBH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        C1C7U.LIZ("EditorProAIGCServiceImpl@dfdd.onAsyncTaskClicked$1$1$1");
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
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null) {
                String creationId = this.LLILLJJLI.getCreationId();
                this.LL = 1;
                if (iCreationAsyncTaskManagerLIZ.LJJIJLIJ(creationId, this) == objLJFF) {
                    C1C7U.LIZIZ("EditorProAIGCServiceImpl@dfdd.onAsyncTaskClicked$1$1$1");
                    return objLJFF;
                }
            }
        }
        EnumC545550LaT enumC545550LaT = this.LLILLL.LIZ;
        EnumC545550LaT enumC545550LaT2 = EnumC545550LaT.COMPLETE;
        if (enumC545550LaT == enumC545550LaT2) {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ2 = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ2 != null && iCreationAsyncTaskManagerLIZ2.LJIILIIL() != null) {
                C0LCT.LIZLLL(this.LLILZ.LIZ(), true);
            }
        } else if (enumC545550LaT == EnumC545550LaT.FAILED) {
            this.LLILLJJLI.creativeModel.isAsyncTaskFailed = true;
        }
        C538890LBn c538890LBn = this.LLILLL;
        if (c538890LBn.LIZ == enumC545550LaT2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LLILZIL.getClass();
        C538870LBl.LJIILIIL(c538890LBn, str, 2397);
        C538870LBl c538870LBl = this.LLILZIL;
        if (this.LLILLL.LIZ == enumC545550LaT2) {
            z = true;
        } else {
            z = false;
        }
        c538870LBl.getClass();
        C538870LBl.LJIILJJIL(2397, true, z);
        C570560MZi.LJIIL(this.LLILZLL, this.LLILZ, true, this.LLILLJJLI, 6, System.currentTimeMillis());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProAIGCServiceImpl@dfdd.onAsyncTaskClicked$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
