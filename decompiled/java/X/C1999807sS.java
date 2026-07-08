package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.PlaybackVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07sS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1999807sS extends C2217421BqW implements Function1<C07VG, Unit> {
    public C1999807sS(Object obj) {
        super(1, obj, PlaybackVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/PlaybackCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VG c07vg) {
        C07VG c07vg2 = c07vg;
        this.receiver.getClass();
        if (c07vg2 instanceof C07VF) {
            Context context = ((C07VF) c07vg2).LIZ;
            C19328810je.LIZ(EnumC2174471A8f.PLAYBACK_SETTINGS.getTag());
            SmartRouter.buildRoute(context, "aweme://setting/playback").open();
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
