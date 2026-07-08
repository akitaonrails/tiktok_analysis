package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.CelebrationParallelDownloadConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ccf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.repo.CelebrationMaterialRepo$downloadAweme$3", f = "CelebrationMaterialRepo.kt", l = {97, 99}, m = "invokeSuspend")
public final class C317590Ccf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0D22>, Object> {
    public int LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<ForwardMedia> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317590Ccf(List<ForwardMedia> list, int i, String str, InterfaceC1364105Vn<? super C317590Ccf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317590Ccf(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        long jCurrentTimeMillis;
        int iIntValue;
        boolean z;
        String strLIZIZ;
        Object objLIZIZ = obj;
        C1C7U.LIZ("CelebrationMaterialRepo@27f7.downloadAweme$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        boolean z2 = false;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    jCurrentTimeMillis = this.LLILLJJLI;
                    size = this.LL;
                    C155000ia.LIZIZ(objLIZIZ);
                    iIntValue = ((Number) objLIZIZ).intValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                jCurrentTimeMillis = this.LLILLJJLI;
                size = this.LL;
                C155000ia.LIZIZ(objLIZIZ);
                iIntValue = ((Number) objLIZIZ).intValue();
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            size = this.LLILZ.size();
            jCurrentTimeMillis = System.currentTimeMillis();
            C01GW c01gw = CelebrationParallelDownloadConfig.LIZIZ;
            if (((CelebrationParallelDownloadConfig.CelebrationDownloadConfig) c01gw.getValue()).enableParallelDownload && ((CelebrationParallelDownloadConfig.CelebrationDownloadConfig) c01gw.getValue()).supportedCelebrationTypes.contains(C2286608xc.LJ(this.LLILZIL)) && ((CelebrationParallelDownloadConfig.CelebrationDownloadConfig) c01gw.getValue()).supportedScenes.contains(this.LLILZLL)) {
                C566620MKe c566620MKe = C566620MKe.LIZ;
                List<ForwardMedia> list = this.LLILZ;
                int i2 = this.LLILZIL;
                this.LL = size;
                this.LLILLJJLI = jCurrentTimeMillis;
                this.LLILLL = 1;
                c566620MKe.getClass();
                objLIZIZ = C2296808zG.LJ(new C317570Ccd(i2, list, null), this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadAweme$3");
                    return objLJFF;
                }
                iIntValue = ((Number) objLIZIZ).intValue();
            } else {
                C566620MKe c566620MKe2 = C566620MKe.LIZ;
                List<ForwardMedia> list2 = this.LLILZ;
                int i3 = this.LLILZIL;
                this.LL = size;
                this.LLILLJJLI = jCurrentTimeMillis;
                this.LLILLL = 2;
                objLIZIZ = c566620MKe2.LIZIZ(list2, i3, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadAweme$3");
                    return objLJFF;
                }
                iIntValue = ((Number) objLIZIZ).intValue();
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C568060MPs c568060MPs = C568060MPs.LIZ;
        int i4 = this.LLILZIL;
        if (iIntValue != size) {
            z = true;
        } else {
            z = false;
        }
        C568060MPs.LIZ(c568060MPs, i4, "fetch_material", iIntValue, z, jCurrentTimeMillis2 - jCurrentTimeMillis, size, this.LLILZLL, null, null, null, 1920);
        if (iIntValue != size) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("part success: download success cnt ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", total cnt ");
            sbLIZ.append(size);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        if (iIntValue == size) {
            z2 = true;
        }
        C0D22 c0d22 = new C0D22(iIntValue, size, strLIZIZ, z2);
        C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadAweme$3");
        return c0d22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0D22> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
