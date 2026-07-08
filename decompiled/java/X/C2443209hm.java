package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.CameraEffectViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS212S0300000_3;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.CameraEffectViewModel$updateCameraEffectState$1", f = "CameraEffectViewModel.kt", l = {90}, m = "invokeSuspend")
public final class C2443209hm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CameraEffectViewModel LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2443209hm(CameraEffectViewModel cameraEffectViewModel, List<String> list, Activity activity, long j, boolean z, Long l, InterfaceC1364105Vn<? super C2443209hm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cameraEffectViewModel;
        this.LLILLL = list;
        this.LLILZ = activity;
        this.LLILZIL = j;
        this.LLILZLL = z;
        this.LLIZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2443209hm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C08LC c08lc;
        C1C7U.LIZ("CameraEffectViewModel@2d3b.updateCameraEffectState$1");
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
            InterfaceC911530ZpP interfaceC911530ZpP = this.LLILLJJLI.LL;
            List<String> list = this.LLILLL;
            Activity activity = this.LLILZ;
            this.LL = 1;
            obj = interfaceC911530ZpP.LIZLLL(list, activity, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CameraEffectViewModel@2d3b.updateCameraEffectState$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            if (this.LLILZLL) {
                CameraEffectViewModel.vQ2(this.LLILLJJLI);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CameraEffectViewModel@2d3b.updateCameraEffectState$1");
            return unit;
        }
        Effect effect = (Effect) pair.getFirst();
        File file = (File) pair.getSecond();
        CameraEffectViewModel cameraEffectViewModel = this.LLILLJJLI;
        Long l = this.LLIZ;
        long j = this.LLILZIL;
        if (cameraEffectViewModel.LLILZIL <= j) {
            cameraEffectViewModel.LLILZIL = j;
            String original_effect_id = effect.getOriginal_effect_id();
            InterfaceC2011507uL interfaceC2011507uL = cameraEffectViewModel.getState().LL;
            String str = null;
            if ((interfaceC2011507uL instanceof C08LC) && (c08lc = (C08LC) interfaceC2011507uL) != null) {
                str = c08lc.LL;
            }
            if (!Intrinsics.LJFF(original_effect_id, str)) {
                cameraEffectViewModel.setState(new AwS212S0300000_3(effect, file, l, 5));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CameraEffectViewModel@2d3b.updateCameraEffectState$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
