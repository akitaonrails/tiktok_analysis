package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookGiftSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935350aRp extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ PlaybookGiftSettingDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C935350aRp(PlaybookGiftSettingDialog playbookGiftSettingDialog) {
        super(1);
        this.LL = playbookGiftSettingDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        long jLJIIL;
        Throwable th2 = th;
        C946050aj5 c946050aj5LIZIZ = this.LL.LLL.LIZIZ();
        if (th2 != null) {
            jLJIIL = PlaybookUtilKt.LJIIL(th2);
        } else {
            jLJIIL = -1000;
        }
        c946050aj5LIZIZ.LIZJ(jLJIIL);
        return Unit.LIZ;
    }
}
