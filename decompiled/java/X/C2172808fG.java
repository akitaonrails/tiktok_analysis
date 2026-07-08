package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.assem.camera.FeedDMCameraAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.CameraEffectViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.08fG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.assem.camera.FeedDMCameraAssem$initEffectFlip$2$2", f = "FeedDMCameraAssem.kt", l = {210}, m = "invokeSuspend")
public final class C2172808fG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FeedDMCameraAssem LLILLJJLI;
    public final /* synthetic */ InterfaceC2011507uL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2172808fG(FeedDMCameraAssem feedDMCameraAssem, InterfaceC2011507uL interfaceC2011507uL, InterfaceC1364105Vn<? super C2172808fG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = feedDMCameraAssem;
        this.LLILLL = interfaceC2011507uL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2172808fG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("FeedDMCameraAssem@dea3.initEffectFlip$2$2");
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
            SmartImageView smartImageView = (SmartImageView) this.LLILLJJLI.LLJJJJ.getValue();
            C08LC c08lc = (C08LC) this.LLILLL;
            File file = c08lc.LLILLJJLI;
            Effect effect = c08lc.LLILLL;
            this.LL = 1;
            C1DFH c1dfh = C0PEM.LIZ;
            obj = C23250099c.LJI(this, C2107308Nj.LIZ, new C1587606Jm(smartImageView, effect, file, null, false));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FeedDMCameraAssem@dea3.initEffectFlip$2$2");
                return objLJFF;
            }
        }
        CameraEffectViewModel cameraEffectViewModelHp = this.LLILLJJLI.hp();
        cameraEffectViewModelHp.getClass();
        cameraEffectViewModelHp.setState(new AwS582S0100000_3((InterfaceC343480DdK) obj, 38));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedDMCameraAssem@dea3.initEffectFlip$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
