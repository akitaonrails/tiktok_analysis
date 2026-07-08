package X;

import com.ss.android.ugc.aweme.shortvideo.ui.component.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import pyl.q;

/* JADX INFO: renamed from: X.0sv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645440sv8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ u LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1645440sv8(int i, boolean z, u uVar) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.LL;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    q qVarLIZIZ = this.LLILLJJLI ? q.LIZIZ() : q.LIZ();
                    qVarLIZIZ.LIZJ = Boolean.TRUE;
                    this.LLILLL.getCameraApiComponent().Zd1().LJII(qVarLIZIZ, C1DPV.LIZIZ.LIZIZ(C1DPW.SWITCH_CAMERA_MSG_PROP, null), null);
                }
            } else if (this.LLILLJJLI) {
                C2253191DGz c2253191DGzZd1 = this.LLILLL.getCameraApiComponent().Zd1();
                q qVarLIZIZ2 = q.LIZIZ();
                qVarLIZIZ2.LIZJ = Boolean.TRUE;
                c2253191DGzZd1.LJII(qVarLIZIZ2, C1DPV.LIZIZ.LIZIZ(C1DPW.SWITCH_CAMERA_MSG_PROP_REAR, null), null);
            }
        } else if (!this.LLILLJJLI) {
            C2253191DGz c2253191DGzZd12 = this.LLILLL.getCameraApiComponent().Zd1();
            q qVarLIZ = q.LIZ();
            qVarLIZ.LIZJ = Boolean.TRUE;
            c2253191DGzZd12.LJII(qVarLIZ, C1DPV.LIZIZ.LIZIZ(C1DPW.SWITCH_CAMERA_MSG_PROP_FRONT, null), null);
        }
        return Unit.LIZ;
    }
}
