package X;

import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickTemplateDraft;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.asynctask.AsyncTaskManagerServiceImpl$scheduleAutoPickAiAutocutEndAfterDraftTerminal$1", f = "AsyncTaskManagerServiceImpl.kt", l = {419}, m = "invokeSuspend")
public final class C538670LAr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C538790LBd LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AwemeDraft LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538670LAr(C538790LBd c538790LBd, String str, AwemeDraft awemeDraft, boolean z, InterfaceC1364105Vn<? super C538670LAr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c538790LBd;
        this.LLILLL = str;
        this.LLILZ = awemeDraft;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C538670LAr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objLJIJ = obj;
        C1C7U.LIZ("AsyncTaskManagerServiceImpl@7ddd.scheduleAutoPickAiAutocutEndAfterDraftTerminal$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            C538790LBd c538790LBd = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            objLJIJ = c538790LBd.LJIJ(str, this);
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("AsyncTaskManagerServiceImpl@7ddd.scheduleAutoPickAiAutocutEndAfterDraftTerminal$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objLJIJ;
        C0LSZ c0lsz = (C0LSZ) pair.getFirst();
        List list = (List) pair.getSecond();
        C538790LBd c538790LBd2 = this.LLILLJJLI;
        String str2 = this.LLILLL;
        AwemeDraft awemeDraft = this.LLILZ;
        String str3 = awemeDraft.LJJJJIZL.shootWay;
        if (str3 == null) {
            str3 = "";
        }
        AutoPickModel autoPickModel = awemeDraft.LIZ.autoPickModel;
        String str4 = autoPickModel.trackEnterFrom;
        boolean z = this.LLILZIL;
        int i3 = autoPickModel.taskCount;
        List<AutoPickTemplateDraft> list2 = autoPickModel.templateInfos;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator<AutoPickTemplateDraft> it2 = list2.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().getNleDraft().length() > 0 && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        AutoPickModel autoPickModel2 = this.LLILZ.LIZ.autoPickModel;
        String str5 = autoPickModel2.pickId;
        String str6 = autoPickModel2.maeRequestId;
        c538790LBd2.getClass();
        C538790LBd.LJIIZILJ(list, str2, str3, str4, z, "AsyncTaskManagerServiceImpl.processDraftId", c0lsz, i3, i, str5, str6);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AsyncTaskManagerServiceImpl@7ddd.scheduleAutoPickAiAutocutEndAfterDraftTerminal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
