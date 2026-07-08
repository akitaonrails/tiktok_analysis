package X;

import com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05HP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$initFragments$2$playAudition$1", f = "InstantVoiceCloneView.kt", l = {549}, m = "invokeSuspend")
public final class C05HP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PlayAuditionCallback LLILLL;
    public final /* synthetic */ C11VM LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HP(PlayAuditionCallback playAuditionCallback, C11VM c11vm, String str, InterfaceC1364105Vn<? super C05HP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = playAuditionCallback;
        this.LLILZ = c11vm;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05HP c05hp = new C05HP(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c05hp.LLILLJJLI = obj;
        return c05hp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC497601wk interfaceC497601wk;
        String absolutePath;
        String str;
        C1C7U.LIZ("InstantVoiceCloneView@888c.initFragments$2$playAudition$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            this.LLILLL.oPrepare();
            if (!C2296808zG.LJI(interfaceC497601wk)) {
                this.LLILLL.onStop();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("InstantVoiceCloneView@888c.initFragments$2$playAudition$1");
                return unit;
            }
            if (this.LLILZ.LIZJ()) {
                C11VM c11vm = this.LLILZ;
                File parentFile = new C0VSJ(C2279708wV.LIZ()).getParentFile();
                if (parentFile != null) {
                    absolutePath = parentFile.getAbsolutePath();
                } else {
                    absolutePath = null;
                }
                c11vm.LLJJJIL = absolutePath;
            }
            this.LLILZ.getVopInstantCloneCameraService().initAudioSDKHandler(this.LLILZ.LLJJJIL);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1318605Ea c1318605Ea = new C1318605Ea(null);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1318605Ea);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InstantVoiceCloneView@888c.initFragments$2$playAudition$1");
                return objLJFF;
            }
        }
        C05HK c05hk = (C05HK) obj;
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            this.LLILLL.onStop();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("InstantVoiceCloneView@888c.initFragments$2$playAudition$1");
            return unit2;
        }
        if (c05hk != null && (str = c05hk.LIZJ) != null) {
            this.LLILZ.getVopInstantCloneCameraService().playAudition(this.LLILZIL, str, str, this.LLILLL);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("InstantVoiceCloneView@888c.initFragments$2$playAudition$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
