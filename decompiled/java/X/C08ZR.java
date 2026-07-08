package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ZR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel$setImageData$1", f = "EffectDraftSubmissionModule.kt", l = {}, m = "invokeSuspend")
public final class C08ZR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Uri LL;
    public final /* synthetic */ EffectDraftSubmissionListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08ZR(Uri uri, EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel, InterfaceC1364105Vn<? super C08ZR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uri;
        this.LLILLJJLI = effectDraftSubmissionListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08ZR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String parent;
        C1C7U.LIZ("EffectDraftSubmissionListViewModel@533.setImageData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String path = this.LL.getPath();
        if (path != null) {
            EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel = this.LLILLJJLI;
            C0VSJ c0vsj = new C0VSJ(path);
            if (c0vsj.exists() && c0vsj.getParent() != null && (parent = c0vsj.getParent()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(parent);
                sbLIZ.append('/');
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(".png");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C2354709Kn.LJIL(path, strLIZIZ);
                effectDraftSubmissionListViewModel.LL.setValue(Uri.fromFile(new C0VSJ(strLIZIZ)));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectDraftSubmissionListViewModel@533.setImageData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
