package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Kmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aiselfeffect.ScanFaceEffectComponent$updateLoadSceneUIAndPoll$4$1", f = "ScanFaceEffectComponent.kt", l = {227}, m = "invokeSuspend")
public final class C527770Kmt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0MIK LLILLJJLI;
    public final /* synthetic */ C527790Kmv LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527770Kmt(C0MIK c0mik, C527790Kmv c527790Kmv, String str, String str2, InterfaceC1364105Vn<? super C527770Kmt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mik;
        this.LLILLL = c527790Kmv;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C527770Kmt(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIL;
        String musicId;
        C1C7U.LIZ("ScanFaceEffectComponent@ddfc.updateLoadSceneUIAndPoll$4$1");
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
            C0MIK c0mik = this.LLILLJJLI;
            C527790Kmv c527790Kmv = this.LLILLL;
            List<String> list = c527790Kmv.LIZ;
            String str = c527790Kmv.LIZLLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            boolean z = c0mik.LJIIL;
            this.LL = 1;
            IAIMEServices iAIMEServices = c0mik.LJ;
            if (iAIMEServices != null) {
                Activity activity = c0mik.LJIIIIZZ;
                ShortVideoContext shortVideoContext = c0mik.LJIIIZ;
                String str4 = shortVideoContext.shootWay;
                if (str4 == null) {
                    str4 = "";
                }
                if (C527780Kmu.LIZ) {
                    musicId = shortVideoContext.getMusicId();
                } else {
                    musicId = null;
                }
                objLJIL = iAIMEServices.LJIL(activity, str2, str3, list, str, str4, musicId, z, new AwS552S0100000_8(c0mik, 207), this);
                if (objLJIL != C099R.LJFF()) {
                    objLJIL = Unit.LIZ;
                }
            } else {
                objLJIL = Unit.LIZ;
            }
            if (objLJIL == objLJFF) {
                C1C7U.LIZIZ("ScanFaceEffectComponent@ddfc.updateLoadSceneUIAndPoll$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScanFaceEffectComponent@ddfc.updateLoadSceneUIAndPoll$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
