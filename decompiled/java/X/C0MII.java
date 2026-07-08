package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0MII, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aiselfeffect.ScanFaceEffectComponent$processPhotoCaptured$1", f = "ScanFaceEffectComponent.kt", l = {}, m = "invokeSuspend")
public final class C0MII extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0MIK LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MII(C0MIK c0mik, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c0mik;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MII c0mii = new C0MII(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
        c0mii.LL = obj;
        return c0mii;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        Integer numLJ;
        boolean z;
        C1C7U.LIZ("ScanFaceEffectComponent@ddfc.processPhotoCaptured$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        final C0MIK c0mik = this.LLILLL;
        final String str2 = this.LLILZ;
        try {
            float f = CastFloatProtector.parseFloat((String) a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6).get(1));
            int i = CastIntegerProtector.parseInt((String) a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6).get(2));
            VEFrame vEFrameJo = c0mik.LIZLLL.getEffectController().jo(str);
            Integer numLJ2 = null;
            if (vEFrameJo != null) {
                bitmap = vEFrameJo.toBitmap();
            } else {
                bitmap = null;
            }
            C448800Hio c448800Hio = AIGCPictureHandler.Companion;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            sbLIZ.append(c0mik.LJIIIZ.getCreationId());
            sbLIZ.append("_crop.jpeg");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c448800Hio.getClass();
            String strLIZ = C448800Hio.LIZ(strLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("processPhotoCaptured: .bit");
            if (bitmap == null) {
                numLJ = null;
            } else {
                numLJ = C2286608xc.LJ(bitmap.getWidth());
            }
            sbLIZ2.append(numLJ);
            sbLIZ2.append(" x");
            if (bitmap != null) {
                numLJ2 = C2286608xc.LJ(bitmap.getHeight());
            }
            sbLIZ2.append(numLJ2);
            C201955140j.LIZIZ("jaden-aiself", C2188811AlT.LIZIZ(sbLIZ2));
            if (bitmap != null) {
                C2477909nN.LJI(bitmap, strLIZ, Bitmap.CompressFormat.JPEG, 0, 4);
            }
            InterfaceC2215281Bn4 interfaceC2215281Bn4 = new InterfaceC2215281Bn4() { // from class: X.0MIG
                @Override // X.InterfaceC2215281Bn4
                public final void LIZ(int i2) {
                    c0mik.LJ();
                    C566110MIf.LIZ.getClass();
                    C566110MIf.LJ("upload_imagex", false);
                }

                @Override // X.InterfaceC2215281Bn4
                public final void LIZIZ(List<C0MI6> list) {
                    LifecycleCoroutineScope lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope = LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(c0mik.LJFF.getLifecycle());
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope, C2107308Nj.LIZ, null, new C0MIF(c0mik, list, str2, null), 2);
                }
            };
            String str3 = c0mik.LJIIIZ.shootWay;
            if (str3 == null) {
                str3 = "";
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "aime_camera_debug_invalid_popup", true) == 1) {
                z = true;
            } else {
                z = false;
            }
            new AIGCPictureUploadHandler(false, true, str3, "record_page", interfaceC2215281Bn4, z, "AIME_FACE_UPLOAD", false, "").LJIIIIZZ(c0mik.LJIIIIZZ, strLIZ, f, i, new AwS552S0100000_8(c0mik, 197));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScanFaceEffectComponent@ddfc.processPhotoCaptured$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
