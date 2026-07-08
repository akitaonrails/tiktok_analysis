package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.BackgroundAudioVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1927307gl extends C2217421BqW implements Function1<C07VE, Unit> {
    public C1927307gl(Object obj) {
        super(1, obj, BackgroundAudioVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/BackgroundAudioCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VE c07ve) {
        C07VE c07ve2 = c07ve;
        BackgroundAudioVM backgroundAudioVM = (BackgroundAudioVM) this.receiver;
        backgroundAudioVM.getClass();
        if (c07ve2 instanceof C07VD) {
            backgroundAudioVM.vQ2(((C07VD) c07ve2).LIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
