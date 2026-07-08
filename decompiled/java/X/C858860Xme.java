package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo.CheckInfringementResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Xme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo.EditLongVideoAudioCopyrightController$showAuthorizeDialogIfNeed$1", f = "EditLongVideoAudioCopyrightController.kt", l = {71}, m = "invokeSuspend")
public final class C858860Xme extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C856690Xj9 LLILLJJLI;
    public final /* synthetic */ FragmentManager LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C858860Xme(C856690Xj9 c856690Xj9, FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, int i, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C858860Xme> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c856690Xj9;
        this.LLILLL = fragmentManager;
        this.LLILZ = context;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = i;
        this.LLIZ = function0;
        this.LLIZLLLIL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C858860Xme(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CheckInfringementResponse checkInfringementResponse;
        boolean zLJFF;
        C1C7U.LIZ("EditLongVideoAudioCopyrightController@31d.showAuthorizeDialogIfNeed$1");
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
            try {
                checkInfringementResponse = ((InterfaceC858880Xmg) new C858870Xmf().LIZ.getValue()).LIZ().execute().LIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                checkInfringementResponse = null;
            }
            if (checkInfringementResponse != null) {
                zLJFF = Intrinsics.LJFF(checkInfringementResponse.isInfringement(), true);
            } else {
                zLJFF = false;
            }
            if (!zLJFF) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EditLongVideoAudioCopyrightController@31d.showAuthorizeDialogIfNeed$1");
                return unit;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C858830Xmb c858830Xmb = new C858830Xmb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c858830Xmb) == objLJFF) {
                C1C7U.LIZIZ("EditLongVideoAudioCopyrightController@31d.showAuthorizeDialogIfNeed$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditLongVideoAudioCopyrightController@31d.showAuthorizeDialogIfNeed$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
