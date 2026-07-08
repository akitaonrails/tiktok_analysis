package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.vesdk.algorithm.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HLO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.network.SocialAvatarGenerator$cropImageWithSlowPath$2", f = "SocialAvatarGenerator.kt", l = {235}, m = "invokeSuspend")
public final class C0HLO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public C013C LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HLO(String str, InterfaceC1364105Vn<? super C0HLO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HLO c0hlo = new C0HLO(this.LLILZ, interfaceC1364105Vn);
        c0hlo.LLILLL = obj;
        return c0hlo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0HLZ c0hlz;
        C013C c013c;
        C1C7U.LIZ("SocialAvatarGenerator@55bc.cropImageWithSlowPath$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        String str = null;
        if (i != 0) {
            if (i == 1) {
                c013c = this.LL;
                c0hlz = (C0HLZ) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            C0HYP c0hyp = C0HYP.LIZ;
            C0HLR c0hlr = C0HLR.CROP;
            c0hyp.getClass();
            C0HYP.LJI(c0hlr);
            c0hlz = new C0HLZ();
            String str2 = this.LLILZ;
            c0hlz.picturePath = str2;
            c0hlz.LIZ = false;
            c0hlz.LIZIZ = null;
            c0hlz.LIZJ = null;
            C448800Hio c448800Hio = AIGCPictureHandler.Companion;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            sbLIZ.append(str2.hashCode());
            sbLIZ.append("_slow.jpeg");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c448800Hio.getClass();
            c0hlz.LIZLLL = C448800Hio.LIZ(strLIZIZ);
            c013c = new C013C();
            C2170308er c2170308er = new C2170308er(C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C2170408es(c013c, c0hlz, null), 2), null);
            this.LLILLL = c0hlz;
            this.LL = c013c;
            this.LLILLJJLI = 1;
            obj = C099A.LIZJ(4000L, c2170308er, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarGenerator@55bc.cropImageWithSlowPath$2");
                return objLJFF;
            }
        }
        s sVar = (s) obj;
        c013c.element = true;
        if (sVar != null && sVar.retCode == 0) {
            String str3 = c0hlz.LIZLLL;
            C1C7U.LIZIZ("SocialAvatarGenerator@55bc.cropImageWithSlowPath$2");
            return str3;
        }
        EnumC439400HKw enumC439400HKw = EnumC439400HKw.FAILURE_IMAGE_NO_FACE;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("VEFaceDetectCropResult fail reason:");
        if (sVar != null) {
            str = sVar.reason;
        }
        sbLIZ2.append(str);
        throw new C0HKR(enumC439400HKw, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
