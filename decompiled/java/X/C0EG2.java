package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EG2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.ui.MagicGuideController$tryShowMagicGuide$1", f = "MagicGuideController.kt", l = {76}, m = "invokeSuspend")
public final class C0EG2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0EG3 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C19A3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EG2(C0EG3 c0eg3, String str, C19A3 c19a3, InterfaceC1364105Vn<? super C0EG2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0eg3;
        this.LLILLL = str;
        this.LLILZ = c19a3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EG2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0EG3 c0eg3;
        C1C7U.LIZ("MagicGuideController@fd7a.tryShowMagicGuide$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    C370690Eg7 c370690Eg7 = new C370690Eg7(new C370680Eg6());
                    if (C1415610mwR.LIZIZ() <= 720) {
                        c370690Eg7.LIZ = C2286608xc.LJ(C1415610mwR.LIZIZ());
                        c370690Eg7.LIZIZ = C2286608xc.LJ((int) (C1415610mwR.LIZIZ() * 0.32051283f));
                    }
                    Activity activity = this.LLILLJJLI.LIZ;
                    String str = this.LLILLL;
                    this.LL = 1;
                    obj = C383660F2m.LIZIZ(activity, str, c370690Eg7, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("MagicGuideController@fd7a.tryShowMagicGuide$1");
                        return objLJFF;
                    }
                }
                Bitmap bitmap = (Bitmap) obj;
                Activity activity2 = this.LLILLJJLI.LIZ;
                if (bitmap != null && activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                    this.LLILLJJLI.LIZ(bitmap, this.LLILZ);
                    C0EG3 c0eg32 = this.LLILLJJLI;
                    VideoPublishEditModel videoPublishEditModel = c0eg32.LIZJ;
                    if (videoPublishEditModel != null) {
                        C361680EFy.LJJLIIIJL(videoPublishEditModel, c0eg32.LIZLLL, "show");
                    }
                } else {
                    Function0<Unit> function0 = this.LLILLJJLI.LJI;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    this.LLILLJJLI.LJI = null;
                }
                c0eg3 = this.LLILLJJLI;
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                Function0<Unit> function02 = this.LLILLJJLI.LJI;
                if (function02 != null) {
                    function02.invoke();
                }
                c0eg3 = this.LLILLJJLI;
                c0eg3.LJI = null;
            }
            c0eg3.LJ = false;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MagicGuideController@fd7a.tryShowMagicGuide$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LJ = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
