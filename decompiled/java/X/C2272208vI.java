package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08vI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader$createEffects$2", f = "MobileEffectUploader.kt", l = {59}, m = "invokeSuspend")
public final class C2272208vI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C2272408vK>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<UploadableMobileEffect> LLILLL;
    public final /* synthetic */ C2277008w4 LLILZ;
    public final /* synthetic */ UploadImageConfig LLILZIL;
    public final /* synthetic */ UploadImageConfig LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2272208vI(List<UploadableMobileEffect> list, C2277008w4 c2277008w4, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, InterfaceC1364105Vn<? super C2272208vI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c2277008w4;
        this.LLILZIL = uploadImageConfig;
        this.LLILZLL = uploadImageConfig2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2272208vI c2272208vI = new C2272208vI(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c2272208vI.LLILLJJLI = obj;
        return c2272208vI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("MobileEffectUploader@ef88.createEffects$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<UploadableMobileEffect> list = this.LLILLL;
            ArrayList arrayList = new ArrayList();
            for (UploadableMobileEffect uploadableMobileEffect : list) {
                UploadableMobileEffect uploadableMobileEffect2 = uploadableMobileEffect;
                boolean zExists = new C0VSJ(uploadableMobileEffect2.zipFilePath).exists();
                boolean zExists2 = new C0VSJ(uploadableMobileEffect2.iconFilePath).exists();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("upload effect, effectId=");
                sbLIZ.append(uploadableMobileEffect2.effectId);
                sbLIZ.append(", zipExist=");
                sbLIZ.append(zExists);
                sbLIZ.append(", iconExist=");
                sbLIZ.append(zExists2);
                C201955140j.LIZIZ("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
                if (zExists && zExists2) {
                    arrayList.add(uploadableMobileEffect);
                }
            }
            C2277008w4 c2277008w4 = this.LLILZ;
            UploadImageConfig uploadImageConfig = this.LLILZIL;
            UploadImageConfig uploadImageConfig2 = this.LLILZLL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C2272308vJ(c2277008w4, (UploadableMobileEffect) it2.next(), uploadImageConfig, uploadImageConfig2, null), 3));
                i2 = 1;
            }
            this.LL = i2;
            objLIZ = C1D9F.LIZ(arrayList2, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("MobileEffectUploader@ef88.createEffects$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MobileEffectUploader@ef88.createEffects$2");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C2272408vK>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
