package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.servicimpl.PhotoStage$fillCreativeModel$canvasData$1$1", f = "PhotoStage.kt", l = {}, m = "invokeSuspend")
public final class C536530L2l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MediaModel LL;
    public final /* synthetic */ CanvasVideoData LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536530L2l(MediaModel mediaModel, CanvasVideoData canvasVideoData, ShortVideoContext shortVideoContext, InterfaceC1364105Vn<? super C536530L2l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mediaModel;
        this.LLILLJJLI = canvasVideoData;
        this.LLILLL = shortVideoContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C536530L2l(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AIGCInfo aIGCInfo;
        AIGCInfo[] aIGCInfoArr;
        ArrayList<AIGCInfo> arrayList;
        C1C7U.LIZ("PhotoStage@abaf.fillCreativeModel$canvasData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MediaModel mediaModel = this.LL;
        if (mediaModel == null || (aIGCInfo = mediaModel.aigcInfo) == null) {
            aIGCInfo = new AIGCInfo(0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 131071, null);
        }
        CanvasVideoData canvasVideoData = this.LLILLJJLI;
        CameraComponentModel cameraComponentModel = this.LLILLL.cameraComponentModel;
        if (cameraComponentModel == null || (arrayList = cameraComponentModel.greenScreenSourceInfos) == null || (aIGCInfoArr = (AIGCInfo[]) arrayList.toArray(new AIGCInfo[0])) == null) {
            aIGCInfoArr = new AIGCInfo[0];
        }
        C140C.LIZIZ(aIGCInfo, (AIGCInfo[]) Arrays.copyOf(aIGCInfoArr, aIGCInfoArr.length));
        canvasVideoData.setAigcInfo(aIGCInfo);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoStage@abaf.fillCreativeModel$canvasData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
