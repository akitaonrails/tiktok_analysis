package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookLayoutSettingDialogV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C947840aly extends C2217421BqW implements Function1<Integer, Unit> {
    public C947840aly(Object obj) {
        super(1, obj, PlaybookLayoutSettingDialogV3.class, "logChangeFailed", "logChangeFailed(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((PlaybookLayoutSettingDialogV3) this.receiver).LLL.LIZIZ().LIZJ(num.intValue());
        return Unit.LIZ;
    }
}
