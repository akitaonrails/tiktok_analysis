package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioBaseModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioStatusResponse;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioSticker;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioTask;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl$startPolling$1$1", f = "MixStudioStatusRepoImpl.kt", l = {}, m = "invokeSuspend")
public final class C441360HSk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MixStudioStatusResponse LLILLJJLI;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441360HSk(MixStudioStatusResponse mixStudioStatusResponse, MixStudioStatusRepoImpl mixStudioStatusRepoImpl, int i, boolean z, InterfaceC1364105Vn<? super C441360HSk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioStatusResponse;
        this.LLILLL = mixStudioStatusRepoImpl;
        this.LLILZ = i;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C441360HSk c441360HSk = new C441360HSk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c441360HSk.LL = obj;
        return c441360HSk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<MixStudioBaseModel> list;
        MixStudioBaseModel mixStudioBaseModel;
        Integer numLJ;
        C1C7U.LIZ("MixStudioStatusRepoImpl@50f0.startPolling$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        MixStudioTask mixStudioTask = this.LLILLJJLI.mixStudioTask;
        List<MixStudioSticker> list2 = null;
        if (mixStudioTask != null && (list = mixStudioTask.baseModels) != null && (mixStudioBaseModel = (MixStudioBaseModel) C13LP.LJJJLL(list)) != null && (numLJ = C2286608xc.LJ(mixStudioBaseModel.idType)) != null) {
            MixStudioStatusRepoImpl mixStudioStatusRepoImpl = this.LLILLL;
            int iIntValue = numLJ.intValue();
            MixStudioTask mixStudioTask2 = this.LLILLJJLI.mixStudioTask;
            if (mixStudioTask2 != null) {
                list2 = mixStudioTask2.results;
            }
            mixStudioStatusRepoImpl.LJJIJIIJI(interfaceC497601wk, iIntValue, list2, this.LLILZ, this.LLILZIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.startPolling$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
