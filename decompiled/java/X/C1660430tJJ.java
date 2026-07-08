package X;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.edit.RevealStoryCreationModel;
import com.ss.android.ugc.aweme.edit.RevealStoryImageInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tJJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.biz.reveal.camera.RevealFakeDualCameraComponent$onCaptureFlowEnd$2", f = "RevealFakeDualCameraComponent.kt", l = {257, 259}, m = "invokeSuspend")
public final class C1660430tJJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ C1660390tJF LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660430tJJ(View view, C1660390tJF c1660390tJF, InterfaceC1364105Vn<? super C1660430tJJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = view;
        this.LLILZ = c1660390tJF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1660430tJJ c1660430tJJ = new C1660430tJJ(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1660430tJJ.LLILLJJLI = obj;
        return c1660430tJJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        C1C7U.LIZ("RevealFakeDualCameraComponent@f872.onCaptureFlowEnd$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                View view = this.LLILLL;
                if (view != null || (view = this.LLILZ.E3().invoke().mView) != null) {
                    Bitmap bitmapLIZ = C19724012Fa.LIZ(view, Bitmap.Config.ARGB_8888);
                    C375830EoP<Bitmap> c375830EoP = this.LLILZ.T2().LIZIZ;
                    Bitmap bitmap2 = null;
                    if (c375830EoP != null) {
                        bitmap = c375830EoP.LIZ;
                    } else {
                        bitmap = null;
                    }
                    C375830EoP<Bitmap> c375830EoP2 = this.LLILZ.T2().LIZ;
                    if (c375830EoP2 != null) {
                        bitmap2 = c375830EoP2.LIZ;
                    }
                    this.LLILZ.N5(bitmapLIZ);
                    StoryShootModel storyShootModel = this.LLILZ.getShortVideoContext().creativeModel.storyModel;
                    RevealStoryImageInfo revealStoryImageInfo = new RevealStoryImageInfo(2, 0);
                    RevealStoryImageInfo revealStoryImageInfo2 = new RevealStoryImageInfo(2, 0);
                    RevealStoryImageInfo revealStoryImageInfo3 = new RevealStoryImageInfo(2, 0);
                    RevealStoryImageInfo revealStoryImageInfo4 = new RevealStoryImageInfo(2, 0);
                    C1529670puP.LIZ.getClass();
                    storyShootModel.setRevealStoryInfos(new RevealStoryCreationModel(revealStoryImageInfo, revealStoryImageInfo2, revealStoryImageInfo3, revealStoryImageInfo4, null, null, null, C1529670puP.LIZ()));
                    C578810Mn1 c578810Mn1T4 = this.LLILZ.T4();
                    C1660390tJF c1660390tJF = this.LLILZ;
                    if (bitmap != null && bitmap2 != null) {
                        Map<Bitmap, ? extends Function1<? super String, Unit>> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(bitmap, new AwS391S0200000_25(c1660390tJF, bitmap, 85)), new Pair(bitmap2, new AwS391S0200000_25(c1660390tJF, bitmap2, 86)));
                        this.LL = 2;
                        if (c578810Mn1T4.LIZ(interfaceC497601wk, bitmapLIZ, c578810Mn1T4.LIZJ(), false, null, AFwS214S0000000_25.get$arr$(451), mapLJIIIIZZ, this) == objLJFF) {
                            C1C7U.LIZIZ("RevealFakeDualCameraComponent@f872.onCaptureFlowEnd$2");
                            return objLJFF;
                        }
                    } else {
                        this.LL = 1;
                        if (c578810Mn1T4.LIZ(interfaceC497601wk, bitmapLIZ, c578810Mn1T4.LIZJ(), false, null, AFwS214S0000000_25.get$arr$(451), C2097608Jq.LJ(), this) == objLJFF) {
                            C1C7U.LIZIZ("RevealFakeDualCameraComponent@f872.onCaptureFlowEnd$2");
                            return objLJFF;
                        }
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    this.LLILZ.E5();
                    C1C7U.LIZIZ("RevealFakeDualCameraComponent@f872.onCaptureFlowEnd$2");
                    return unit;
                }
            }
            this.LLILZ.E5();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RevealFakeDualCameraComponent@f872.onCaptureFlowEnd$2");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZ.E5();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
