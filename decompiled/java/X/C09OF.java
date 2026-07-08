package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.VEUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.09OF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.MediaModelUtils$covert2MediaModel$2", f = "MediaModelUtils.kt", l = {119, 131}, m = "invokeSuspend")
public final class C09OF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MediaModel>, Object> {
    public MediaModel LL;
    public Object LLILLJJLI;
    public MediaModel LLILLL;
    public int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09OF(String str, long j, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = j;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OF(this.LLILZLL, this.LLILZIL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MediaModel mediaModel;
        MediaModel mediaModel2;
        String str;
        MediaModel mediaModel3;
        Object objLJIILJJIL = obj;
        C1C7U.LIZ("MediaModelUtils@eeea.covert2MediaModel$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    mediaModel = this.LLILLL;
                    str = (String) this.LLILLJJLI;
                    mediaModel3 = this.LL;
                    C155000ia.LIZIZ(objLJIILJJIL);
                    AIGCInfo aIGCInfo = (AIGCInfo) objLJIILJJIL;
                    aIGCInfo.setAiGeneratedSource(str);
                    mediaModel.aigcInfo = aIGCInfo;
                    C1C7U.LIZIZ("MediaModelUtils@eeea.covert2MediaModel$2");
                    return mediaModel3;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaModel2 = (MediaModel) this.LLILLJJLI;
            mediaModel = this.LL;
            C155000ia.LIZIZ(objLJIILJJIL);
            AIGCInfo aIGCInfo2 = (AIGCInfo) objLJIILJJIL;
            aIGCInfo2.setAiGeneratedSource(this.LLIZ);
            mediaModel2.aigcInfo = aIGCInfo2;
            C1C7U.LIZIZ("MediaModelUtils@eeea.covert2MediaModel$2");
            return mediaModel;
        }
        C155000ia.LIZIZ(objLJIILJJIL);
        mediaModel = new MediaModel(this.LLILZIL);
        boolean zLJJIII = C2471909mP.LJJIII(this.LLILZLL, true, 4);
        String strLJIJJLI = C2471909mP.LJIJJLI(this.LLILZLL, true);
        String[] strArr = C2471909mP.LJI;
        int length = strArr.length;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (a0.LJJIIZI(strLJIJJLI, strArr[i3], false)) {
                z = true;
                break;
            }
            i3++;
        }
        long j = 3000;
        if (!zLJJIII && !z) {
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LLILZLL);
            if (videoFileInfo != null) {
                String str2 = this.LLILZLL;
                str = this.LLIZ;
                long j2 = videoFileInfo.duration;
                if (j2 > 0) {
                    j = j2;
                }
                mediaModel.duration = j;
                mediaModel.width = videoFileInfo.width;
                mediaModel.height = videoFileInfo.height;
                mediaModel.LJIILL(str2);
                mediaModel.type = 4;
                C140D c140d = C140D.LIZ;
                this.LL = mediaModel;
                this.LLILLJJLI = str;
                this.LLILLL = mediaModel;
                this.LLILZ = 2;
                c140d.getClass();
                objLJIILJJIL = c140d.LJIILJJIL(mediaModel, null, C140D.LJIIZILJ(), null, this);
                if (objLJIILJJIL == objLJFF) {
                    C1C7U.LIZIZ("MediaModelUtils@eeea.covert2MediaModel$2");
                    return objLJFF;
                }
                mediaModel3 = mediaModel;
                AIGCInfo aIGCInfo3 = (AIGCInfo) objLJIILJJIL;
                aIGCInfo3.setAiGeneratedSource(str);
                mediaModel.aigcInfo = aIGCInfo3;
                C1C7U.LIZIZ("MediaModelUtils@eeea.covert2MediaModel$2");
                return mediaModel3;
            }
            String str3 = this.LLILZLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openVideoEdit ; file invalid :");
            sbLIZ.append(str3);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            C1C7U.LIZIZ("MediaModelUtils@eeea.covert2MediaModel$2");
            return null;
        }
        Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(this.LLILZLL);
        mediaModel.duration = 3000L;
        mediaModel.width = pairLIZJ.getFirst().intValue();
        mediaModel.height = pairLIZJ.getSecond().intValue();
        mediaModel.LJIILL(this.LLILZLL);
        if (zLJJIII) {
            i2 = 1;
        }
        mediaModel.type = i2;
        C140D c140d2 = C140D.LIZ;
        this.LL = mediaModel;
        this.LLILLJJLI = mediaModel;
        this.LLILZ = 1;
        c140d2.getClass();
        objLJIILJJIL = c140d2.LJIILJJIL(mediaModel, null, C140D.LJIIZILJ(), null, this);
        if (objLJIILJJIL == objLJFF) {
            C1C7U.LIZIZ("MediaModelUtils@eeea.covert2MediaModel$2");
            return objLJFF;
        }
        mediaModel2 = mediaModel;
        AIGCInfo aIGCInfo22 = (AIGCInfo) objLJIILJJIL;
        aIGCInfo22.setAiGeneratedSource(this.LLIZ);
        mediaModel2.aigcInfo = aIGCInfo22;
        C1C7U.LIZIZ("MediaModelUtils@eeea.covert2MediaModel$2");
        return mediaModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MediaModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
