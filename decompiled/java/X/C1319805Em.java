package X;

import com.ss.android.ugc.aweme.services.audio.InstantClonePanelAbility;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneRecordFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$startOverDialogShow$1$2$1", f = "InstantVoiceCloneView.kt", l = {609}, m = "invokeSuspend")
public final class C1319805Em extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C11VM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1319805Em(C11VM c11vm, InterfaceC1364105Vn<? super C1319805Em> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11vm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1319805Em(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantVoiceCloneView@888c.startOverDialogShow$1$2$1");
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
            this.LLILLJJLI.LJIIIZ();
            C1DFB c1dfb = C0PEM.LIZJ;
            C1319705El c1319705El = new C1319705El(null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c1319705El) == objLJFF) {
                C1C7U.LIZIZ("InstantVoiceCloneView@888c.startOverDialogShow$1$2$1");
                return objLJFF;
            }
        }
        InstantClonePanelAbility instantClonePanelAbility = this.LLILLJJLI.LLJJIJIIJIL;
        if (instantClonePanelAbility != null) {
            instantClonePanelAbility.voiceDeleted();
        }
        this.LLILLJJLI.LJ("record_page");
        InstantCloneRecordFragment instantCloneRecordFragment = this.LLILLJJLI.LLJJI;
        if (instantCloneRecordFragment != null) {
            instantCloneRecordFragment.NR();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstantVoiceCloneView@888c.startOverDialogShow$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
