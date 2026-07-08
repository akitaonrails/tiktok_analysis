package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067H, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.ui.ImageEditRootScene$applyAutoCutMode$1$2", f = "ImageEditRootScene.kt", l = {3452, 3453}, m = "invokeSuspend")
public final class C067H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ImageEditRootScene LLILLJJLI;
    public final /* synthetic */ ArrayList<MediaModel> LLILLL;
    public final /* synthetic */ C1DRG LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067H(C1DRG c1drg, ImageEditRootScene imageEditRootScene, ArrayList arrayList, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageEditRootScene;
        this.LLILLL = arrayList;
        this.LLILZ = c1drg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C067H(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageEditRootScene@a14e.applyAutoCutMode$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ImageEditRootScene@a14e.applyAutoCutMode$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMediaPlayerManagerService iMediaPlayerManagerService = (IMediaPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IMediaPlayerManagerService.class, false, false, false, 14, null);
            if (iMediaPlayerManagerService != null) {
                VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI.LLJL;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
                this.LL = 1;
                if (C13044058o.LIZ(iMediaPlayerManagerService, musicBuzModel, "applyAutoCutMode", true, this, 8) == objLJFF) {
                    C1C7U.LIZIZ("ImageEditRootScene@a14e.applyAutoCutMode$1$2");
                    return objLJFF;
                }
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C067I c067i = new C067I(this.LLILZ, this.LLILLJJLI, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c067i) == objLJFF) {
            C1C7U.LIZIZ("ImageEditRootScene@a14e.applyAutoCutMode$1$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditRootScene@a14e.applyAutoCutMode$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
