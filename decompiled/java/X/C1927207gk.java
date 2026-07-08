package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.JoinAmplifyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1927207gk extends C2217421BqW implements Function1<C07VY, Unit> {
    public C1927207gk(Object obj) {
        super(1, obj, JoinAmplifyVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/JoinAmplifyCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VY c07vy) {
        C07VY c07vy2 = c07vy;
        JoinAmplifyVM joinAmplifyVM = (JoinAmplifyVM) this.receiver;
        joinAmplifyVM.getClass();
        if (c07vy2 instanceof C07VX) {
            joinAmplifyVM.vQ2(((C07VX) c07vy2).LIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
