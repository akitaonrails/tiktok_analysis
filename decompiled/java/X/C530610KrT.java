package X;

import com.ss.android.ugc.aweme.creative.model.CameraSlotModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530610KrT extends C09AY implements Function1<C530600KrS, C530600KrS> {
    public final /* synthetic */ CameraSlotModel LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ ArrayList<CutSameVideoImageExtraData> LLILLL;
    public final /* synthetic */ ArrayList<TikTokMediaModel> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C530610KrT(CameraSlotModel cameraSlotModel, int i, ArrayList<CutSameVideoImageExtraData> arrayList, ArrayList<TikTokMediaModel> arrayList2) {
        super(1);
        this.LL = cameraSlotModel;
        this.LLILLJJLI = i;
        this.LLILLL = arrayList;
        this.LLILZ = arrayList2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C530600KrS invoke(C530600KrS c530600KrS) {
        return C530600KrS.LIZ(c530600KrS, new C375830EoP(new C530530KrL(this.LL.getTemplateSlots().size(), this.LLILLJJLI, this.LLILLL, this.LLILZ)), null, null, null, null, null, null, 254);
    }
}
