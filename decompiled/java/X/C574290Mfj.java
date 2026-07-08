package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoRootScene$goBackToCreation$1", f = "CutVideoRootScene.kt", l = {740, 741}, m = "invokeSuspend")
public final class C574290Mfj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19768312Wb LLILLJJLI;
    public final /* synthetic */ CutVideoCompileConfigure LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574290Mfj(C19768312Wb c19768312Wb, CutVideoCompileConfigure cutVideoCompileConfigure, InterfaceC1364105Vn<? super C574290Mfj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19768312Wb;
        this.LLILLL = cutVideoCompileConfigure;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C574290Mfj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutVideoRootScene@221b.goBackToCreation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CutVideoRootScene@221b.goBackToCreation$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            VideoEditViewModel videoEditViewModel = this.LLILLJJLI.LLJJLIIIJLLLLLLLZ;
            if (videoEditViewModel == null) {
                videoEditViewModel = null;
            }
            List<VideoSegment> listZQ2 = videoEditViewModel.zQ2();
            CutVideoListViewModel cutVideoListViewModel = this.LLILLJJLI.LLJLILLLLZIIL;
            if (cutVideoListViewModel == null) {
                cutVideoListViewModel = null;
            }
            String strLJFF = ((VideoSegment) ListProtector.get(listZQ2, cutVideoListViewModel.LLILZLL)).LJFF(false);
            C140D c140d = C140D.LIZ;
            MediaModel mediaModel = new MediaModel(UUID.randomUUID().toString());
            mediaModel.LJIILL(strLJFF);
            this.LL = 1;
            c140d.getClass();
            obj = c140d.LJIILJJIL(mediaModel, null, C140D.LJIIZILJ(), null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CutVideoRootScene@221b.goBackToCreation$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C574280Mfi c574280Mfi = new C574280Mfi(this.LLILLJJLI, this.LLILLL, (AIGCInfo) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c574280Mfi) == objLJFF) {
            C1C7U.LIZIZ("CutVideoRootScene@221b.goBackToCreation$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CutVideoRootScene@221b.goBackToCreation$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
