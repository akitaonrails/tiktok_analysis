package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.08d9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel$zipUsedMobileEffects$2", f = "EffectDraftSubmissionModule.kt", l = {}, m = "invokeSuspend")
public final class C2159708d9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends UploadableMobileEffect>>, Object> {
    public final /* synthetic */ List<UploadableMobileEffect> LL;
    public final /* synthetic */ EffectDraftSubmissionListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2159708d9(List<UploadableMobileEffect> list, EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel, InterfaceC1364105Vn<? super C2159708d9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = effectDraftSubmissionListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2159708d9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectDraftSubmissionListViewModel@533.zipUsedMobileEffects$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<UploadableMobileEffect> list = this.LL;
        ArrayList arrayList = new ArrayList();
        for (UploadableMobileEffect uploadableMobileEffect : list) {
            UploadableMobileEffect uploadableMobileEffect2 = uploadableMobileEffect;
            if (new C0VSJ(uploadableMobileEffect2.zipFilePath).length() > 7340032) {
                uploadableMobileEffect2.enableSubmission = false;
            }
            if (uploadableMobileEffect2.zipFilePath.length() == 0) {
                String str = uploadableMobileEffect2.iconFilePath;
                String strSubstring = str.substring(0, a0.LJJJ(str, "icon.png", 0, false, 6));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strSubstring);
                sbLIZ.append("all.zip");
                uploadableMobileEffect2.zipFilePath = C2188811AlT.LIZIZ(sbLIZ);
            }
            arrayList.add(uploadableMobileEffect);
        }
        this.LLILLJJLI.LLILZLL = arrayList;
        C1C7U.LIZIZ("EffectDraftSubmissionListViewModel@533.zipUsedMobileEffects$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends UploadableMobileEffect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
