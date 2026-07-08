package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.album.AlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.album.AlbumUpdateGuideViewModel$openPreviewForUri$localMediaModel$1", f = "AlbumUpdateGuideViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2356109Lb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MediaModel>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ C07WI LLILLJJLI;
    public final /* synthetic */ AlbumUpdateGuideViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2356109Lb(Activity activity, C07WI c07wi, AlbumUpdateGuideViewModel albumUpdateGuideViewModel, InterfaceC1364105Vn<? super C2356109Lb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = c07wi;
        this.LLILLL = albumUpdateGuideViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2356109Lb(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeToolsPluginService creativeToolsPluginService;
        C1C7U.LIZ("AlbumUpdateGuideViewModel@c21.openPreviewForUri$localMediaModel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZ = C09N5.LIZ(this.LL, this.LLILLJJLI.LIZ);
        if (strLIZ == null) {
            strLIZ = this.LLILLJJLI.LIZ.getPath();
        }
        MediaModel mediaModel = null;
        if (strLIZ != null) {
            this.LLILLL.getClass();
            if (strLIZ.length() != 0 && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
                C0I0B.LJFF.LIZJ();
                if (creativeToolsPluginService.LJI(C894660Z7w.LIZ())) {
                    int[] iArr = new int[10];
                    if (C574790MgX.LIZIZ(strLIZ, iArr) == 0) {
                        mediaModel = new MediaModel(-1L);
                        mediaModel.LJIILL(strLIZ);
                        mediaModel.width = iArr[0];
                        mediaModel.height = iArr[1];
                        mediaModel.duration = iArr[3];
                        mediaModel.type = 1;
                    }
                }
            }
        }
        C1C7U.LIZIZ("AlbumUpdateGuideViewModel@c21.openPreviewForUri$localMediaModel$1");
        return mediaModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MediaModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
