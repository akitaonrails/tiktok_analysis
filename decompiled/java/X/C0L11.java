package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.IAILiveServiceKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L11, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoUploadMVStage$action$1", f = "PhotoUploadMVStage.kt", l = {96, 97}, m = "invokeSuspend")
public final class C0L11 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0L17<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L11(C0L17<Object> c0l17, InterfaceC1364105Vn<? super C0L11> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0l17;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0L11 c0l11 = new C0L11(this.LLILLL, interfaceC1364105Vn);
        c0l11.LLILLJJLI = obj;
        return c0l11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, dmt.av.video.SingleImageCoverBitmapData] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, dmt.av.video.SingleImageCoverBitmapData] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C013C c013c;
        C1C7U.LIZ("PhotoUploadMVStage@5ce.action$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PhotoUploadMVStage@5ce.action$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c013c = (C013C) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c013c = new C013C();
            C0L17<Object> c0l17 = this.LLILLL;
            ArrayList arrayList = new ArrayList();
            C0L13 c0l13 = (C0L13) c0l17;
            for (MediaModel mediaModel : c0l13.LIZJ) {
                if (C522700Kei.LIZ(mediaModel)) {
                    arrayList.add(mediaModel.clone());
                } else {
                    arrayList.add(mediaModel);
                }
            }
            c0l13.LIZJ.clear();
            c0l13.LIZJ.addAll(arrayList);
            c013c.element = C533730KwV.LJIIJJI(C533730KwV.LIZ, c0l13.LIZIZ.creativeInfo, null, c0l13.LIZJ, 1000L, 2);
            if (((C0L13) this.LLILLL).LIZJ.size() == 1) {
                C259800zU c259800zU = new C259800zU();
                SingleImageCoverBitmapData singleImageCoverBitmapData = ((C0L13) this.LLILLL).LIZIZ.singleImageCoverBitmapData;
                if (singleImageCoverBitmapData != null) {
                    int srcWidth = singleImageCoverBitmapData.getSrcWidth();
                    int srcHeight = singleImageCoverBitmapData.getSrcHeight();
                    double d = srcWidth;
                    double d2 = srcHeight;
                    double d3 = d2 * 2.4d;
                    if (d > d3) {
                        c259800zU.element = new SingleImageCoverBitmapData(singleImageCoverBitmapData.getSourcePath(), singleImageCoverBitmapData.getItemCoverWidth(), singleImageCoverBitmapData.getDate(), singleImageCoverBitmapData.getMediaType(), (int) d3, srcHeight, null, false);
                    } else {
                        double d4 = d * 2.4d;
                        if (d2 > d4) {
                            c259800zU.element = new SingleImageCoverBitmapData(singleImageCoverBitmapData.getSourcePath(), singleImageCoverBitmapData.getItemCoverWidth(), singleImageCoverBitmapData.getDate(), singleImageCoverBitmapData.getMediaType(), srcWidth, (int) d4, null, false);
                        }
                    }
                }
                SingleImageCoverBitmapData singleImageCoverBitmapData2 = (SingleImageCoverBitmapData) c259800zU.element;
                if (singleImageCoverBitmapData2 != null) {
                    ((C0L13) this.LLILLL).LIZIZ.singleImageCoverBitmapData = singleImageCoverBitmapData2;
                }
            }
            IAILiveService aiLiveService = IAILiveServiceKt.getAiLiveService();
            if (aiLiveService != null) {
                C0L13 c0l132 = (C0L13) this.LLILLL;
                ShortVideoContext shortVideoContext = c0l132.LIZIZ;
                C19EG c19eg = c0l132.LIZ;
                this.LLILLJJLI = c013c;
                this.LL = 1;
                if (aiLiveService.processMusicFollowingCreation(shortVideoContext, c19eg, this) == objLJFF) {
                    C1C7U.LIZIZ("PhotoUploadMVStage@5ce.action$1");
                    return objLJFF;
                }
            }
        }
        C2238608ps c2238608ps = C2108208Ns.LIZ;
        C0L12 c0l12 = new C0L12(c013c, this.LLILLL, null);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C23250099c.LJI(this, c2238608ps, c0l12) == objLJFF) {
            C1C7U.LIZIZ("PhotoUploadMVStage@5ce.action$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PhotoUploadMVStage@5ce.action$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
