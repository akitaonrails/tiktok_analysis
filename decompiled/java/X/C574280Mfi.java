package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoRootScene$goBackToCreation$1$1", f = "CutVideoRootScene.kt", l = {}, m = "invokeSuspend")
public final class C574280Mfi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19768312Wb LL;
    public final /* synthetic */ CutVideoCompileConfigure LLILLJJLI;
    public final /* synthetic */ AIGCInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574280Mfi(C19768312Wb c19768312Wb, CutVideoCompileConfigure cutVideoCompileConfigure, AIGCInfo aIGCInfo, InterfaceC1364105Vn<? super C574280Mfi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19768312Wb;
        this.LLILLJJLI = cutVideoCompileConfigure;
        this.LLILLL = aIGCInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C574280Mfi(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CutVideoRootScene@221b.goBackToCreation$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19768312Wb c19768312Wb = this.LL;
        Activity activity = c19768312Wb.mActivity;
        if (activity != null) {
            CutVideoCompileConfigure cutVideoCompileConfigure = this.LLILLJJLI;
            AIGCInfo aIGCInfo = this.LLILLL;
            CutVideoViewModel cutVideoViewModel = c19768312Wb.LLJJL;
            if (cutVideoViewModel == null) {
                cutVideoViewModel = null;
            }
            cutVideoViewModel.getClass();
            if (cutVideoCompileConfigure != null) {
                Intent intent = new Intent();
                intent.putExtra("videoPath", cutVideoCompileConfigure.LIZIZ());
                intent.putExtra("audioPath", cutVideoCompileConfigure.LIZ());
                VideoEditViewModel videoEditViewModel = c19768312Wb.LLJJLIIIJLLLLLLLZ;
                if (videoEditViewModel == null) {
                    videoEditViewModel = null;
                }
                List<VideoSegment> listZQ2 = videoEditViewModel.zQ2();
                CutVideoListViewModel cutVideoListViewModel = c19768312Wb.LLJLILLLLZIIL;
                if (cutVideoListViewModel == null) {
                    cutVideoListViewModel = null;
                }
                intent.putExtra("videoOriginPath", ((VideoSegment) ListProtector.get(listZQ2, cutVideoListViewModel.LLILZLL)).LJFF(false));
                if (!(aIGCInfo instanceof Serializable)) {
                    aIGCInfo = null;
                }
                intent.putExtra("aigcInfo", (Serializable) aIGCInfo);
                C2204961BRm.LJIIL(-1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhn9fRx58eDPT9mYu5/Qp57oLbVj5lo8yXJ230", null));
                activity.finish();
            } else {
                throw new IllegalStateException("backgroundVideoCompileConfigure expected notNull");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutVideoRootScene@221b.goBackToCreation$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
