package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.MultiMedia;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0MTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl$handleMultiMediaCopy$2", f = "EditServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C569000MTi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ArrayList<MediaModel> LL;
    public final /* synthetic */ EditConfig LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C569000MTi(ArrayList<MediaModel> arrayList, EditConfig editConfig, String str, InterfaceC1364105Vn<? super C569000MTi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = arrayList;
        this.LLILLJJLI = editConfig;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C569000MTi(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EditServiceImpl@7fc6.handleMultiMediaCopy$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList<MediaModel> arrayList = this.LL;
        String str = this.LLILLL;
        for (MediaModel mediaModel : arrayList) {
            if (!C570490MZb.LIZLLL(mediaModel.LJFF())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((IExternalService) ServiceManager.get().getService(IExternalService.class)).creativeStandardPath().genCreativePath(str));
                sbLIZ.append(File.separator);
                sbLIZ.append(new C0VSJ(mediaModel.LJFF()).getName());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (!Intrinsics.LJFF(mediaModel.LJFF(), strLIZIZ)) {
                    C08QA.LJIILLIIL(new C0VSJ(mediaModel.LJFF()), new C0VSJ(strLIZIZ), false, 6);
                    mediaModel.LJIILL(strLIZIZ);
                }
            }
        }
        this.LLILLJJLI.setMediaInfo(new MultiMedia(this.LL));
        this.LLILLJJLI.setCreationId(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditServiceImpl@7fc6.handleMultiMediaCopy$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
