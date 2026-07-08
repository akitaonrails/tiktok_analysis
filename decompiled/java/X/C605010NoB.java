package X;

import android.view.View;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinVoiceCell$applyConfigForChatRedesign$loadStyleBackground$1", f = "BulletinVoiceCell.kt", l = {290}, m = "invokeSuspend")
public final class C605010NoB extends C09AX implements InterfaceC1631620sYq<Boolean, String, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ InterfaceC605070NoH LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605010NoB(View view, InterfaceC605070NoH interfaceC605070NoH, InterfaceC1364105Vn<? super C605010NoB> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = view;
        this.LLILZIL = interfaceC605070NoH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoiceCell@97ec.applyConfigForChatRedesign$loadStyleBackground$1");
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
            boolean z = this.LLILLJJLI;
            String str = (String) this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoiceCell: loadBackgroundPath finish; imageSuccess:");
            sbLIZ.append(z);
            sbLIZ.append(", imagePath = xxx");
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            if (!z) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BulletinVoiceCell@97ec.applyConfigForChatRedesign$loadStyleBackground$1");
                return unit;
            }
            C605100NoK c605100NoK = C605100NoK.LIZ;
            View view = this.LLILZ;
            InterfaceC605070NoH interfaceC605070NoH = this.LLILZIL;
            this.LL = 1;
            if (c605100NoK.LIZIZ(view, str, interfaceC605070NoH, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinVoiceCell@97ec.applyConfigForChatRedesign$loadStyleBackground$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoiceCell@97ec.applyConfigForChatRedesign$loadStyleBackground$1");
        return unit2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C605010NoB c605010NoB = new C605010NoB(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c605010NoB.LLILLJJLI = zBooleanValue;
        c605010NoB.LLILLL = str;
        return c605010NoB.invokeSuspend(Unit.LIZ);
    }
}
