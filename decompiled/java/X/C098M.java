package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AIPlaygroundAIGCChooseResultImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098M, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AIPlaygroundAIGCChooseResultImpl$onChosenResult$1$1$1", f = "AIPlaygroundAIGCChooseResultImpl.kt", l = {}, m = "invokeSuspend")
public final class C098M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ArrayList<MediaModel> LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ AIPlaygroundAIGCChooseResultImpl LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C098M(ArrayList<MediaModel> arrayList, CreativeInfo creativeInfo, AIPlaygroundAIGCChooseResultImpl aIPlaygroundAIGCChooseResultImpl, List<String> list, InterfaceC1364105Vn<? super C098M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = arrayList;
        this.LLILLL = creativeInfo;
        this.LLILZ = aIPlaygroundAIGCChooseResultImpl;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C098M c098m = new C098M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c098m.LL = obj;
        return c098m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("AIPlaygroundAIGCChooseResultImpl@3555.onChosenResult$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList<MediaModel> arrayList = this.LLILLJJLI;
        CreativeInfo creativeInfo = this.LLILLL;
        AIPlaygroundAIGCChooseResultImpl aIPlaygroundAIGCChooseResultImpl = this.LLILZ;
        List<String> list = this.LLILZIL;
        for (MediaModel mediaModel : arrayList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, C0MI0.EDITOR_PRO, null, 12));
            sbLIZ.append("reference_");
            sbLIZ.append(mediaModel.id);
            sbLIZ.append(".jpg");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            try {
                aIPlaygroundAIGCChooseResultImpl.LIZLLL(C2471909mP.LJIJ(mediaModel), strLIZIZ);
                c098200Yq = Boolean.valueOf(list.add(strLIZIZ));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C201955140j.LJIIJ(C559380Lwm.LIZIZ, "AIPlaygroundAIGCChooseResultImpl", thM5exceptionOrNullimpl);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPlaygroundAIGCChooseResultImpl@3555.onChosenResult$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
