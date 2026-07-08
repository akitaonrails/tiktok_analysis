package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09oz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.optimize.UploadPhotoPreprocessManager$waitAllPreProcessJob$job$1", f = "UpLoadPhotoPreprocessManager.kt", l = {204}, m = "invokeSuspend")
public final class C2487909oz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2488009p0 LLILLJJLI;
    public final /* synthetic */ ConcurrentHashMap<MediaModel, String> LLILLL;
    public final /* synthetic */ ConcurrentHashMap<String, MediaModel> LLILZ;
    public final /* synthetic */ C2488309p3 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2487909oz(C2488009p0 c2488009p0, ConcurrentHashMap<MediaModel, String> concurrentHashMap, ConcurrentHashMap<String, MediaModel> concurrentHashMap2, C2488309p3 c2488309p3, InterfaceC1364105Vn<? super C2487909oz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2488009p0;
        this.LLILLL = concurrentHashMap;
        this.LLILZ = concurrentHashMap2;
        this.LLILZIL = c2488309p3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2487909oz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLJI;
        C1C7U.LIZ("UploadPhotoPreprocessManager@b7a4.waitAllPreProcessJob$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<?> anonymousClass0957 = this.LLILLJJLI.LIZLLL;
            if (anonymousClass0957 != null) {
                this.LL = 1;
                if (anonymousClass0957.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("UploadPhotoPreprocessManager@b7a4.waitAllPreProcessJob$job$1");
                    return objLJFF;
                }
            }
        }
        String str = this.LLILLJJLI.LIZJ;
        C0VSJ c0vsj = new C0VSJ(C2488109p1.LIZ(str, true));
        if (c0vsj.exists() && c0vsj.renameTo(new C0VSJ(str))) {
            MediaModel mediaModel = this.LLILLJJLI.LIZ;
            ConcurrentHashMap<String, MediaModel> concurrentHashMap = this.LLILZ;
            String strLJFF = mediaModel.LJFF();
            MediaModel mediaModel2 = new MediaModel(mediaModel.id);
            C2488309p3 c2488309p3 = this.LLILZIL;
            mediaModel2.LJIILL(str);
            mediaModel2.aigcInfo = mediaModel.aigcInfo;
            String strLJFF2 = mediaModel.LJFF();
            if (c2488309p3.LJ.get(strLJFF2) != null) {
                Integer num = c2488309p3.LJ.get(strLJFF2);
                if (num != null) {
                    iLJI = num.intValue();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                C2488709p7.LIZ.getClass();
                iLJI = C2488709p7.LJI(strLJFF2);
                c2488309p3.LJ.put(strLJFF2, Integer.valueOf(iLJI));
            }
            if (iLJI % 180 == 90) {
                mediaModel2.width = mediaModel.height;
                mediaModel2.height = mediaModel.width;
            } else {
                mediaModel2.width = mediaModel.width;
                mediaModel2.height = mediaModel.height;
            }
            mediaModel2.slotId = mediaModel.slotId;
            concurrentHashMap.put(strLJFF, mediaModel2);
        } else {
            this.LLILLL.put(this.LLILLJJLI.LIZ, str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadPhotoPreprocessManager@b7a4.waitAllPreProcessJob$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
