package X;

import com.mammon.audiosdk.enums.SAMICoreVopState;
import com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneRecordFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05HG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$show$1$2$1", f = "InstantVoiceCloneView.kt", l = {197}, m = "invokeSuspend")
public final class C05HG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C11VM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HG(C11VM c11vm, InterfaceC1364105Vn<? super C05HG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11vm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05HG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        C1C7U.LIZ("InstantVoiceCloneView@888c.show$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1318805Ec c1318805Ec = new C1318805Ec(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1318805Ec);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InstantVoiceCloneView@888c.show$1$2$1");
                return objLJFF;
            }
        }
        if (((Number) obj).intValue() != SAMICoreVopState.COMPLETED.getValue()) {
            this.LLILLJJLI.LJII();
        } else {
            C11VK c11vk = C11VK.LIZ;
            C11VM c11vm = this.LLILLJJLI;
            String str = c11vm.LLJIJIL;
            InstantCloneRecordFragment instantCloneRecordFragment = c11vm.LLJJI;
            if (instantCloneRecordFragment != null) {
                i = instantCloneRecordFragment.LLILZ;
            } else {
                i = 1;
            }
            c11vk.getClass();
            C11VK.LJI(i, str);
            InstantClonePanelAbility instantClonePanelAbility = this.LLILLJJLI.LLJJIJIIJIL;
            if (instantClonePanelAbility != null) {
                instantClonePanelAbility.closePanel();
            }
            this.LLILLJJLI.LLJJJJ = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstantVoiceCloneView@888c.show$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
