package X;

import Y.ARunnableS131S0100000_31;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.condition.PlayCondition;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.14lI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20358214lI implements PlayCondition {
    public Condition LIZ;
    public DataChannel LIZIZ;
    public C20361214lm LIZJ;
    public LifecycleOwner LIZLLL;
    public InterfaceC946300ajU LJ;

    public void LJIIJ(C20361214lm c20361214lm) {
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public void LJIIIIZZ() {
        C20361214lm c20361214lm = this.LIZJ;
        if (c20361214lm != null) {
            c20361214lm.LJFF.remove(new C20358414lK(this));
        }
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
    }

    public final void LIZ() {
        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS131S0100000_31(this, 154));
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZIZ(DataChannel dataChannel) {
        this.LIZIZ = dataChannel;
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJ(C20361214lm c20361214lm) {
        this.LIZJ = c20361214lm;
        c20361214lm.LJFF.add(new C20358514lL(this));
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJFF(LifecycleOwner lifecycleOwner) {
        this.LIZLLL = lifecycleOwner;
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJI(InterfaceC946300ajU interfaceC946300ajU) {
        this.LJ = interfaceC946300ajU;
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJII(Condition condition) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initCondition ");
        sbLIZ.append(LIZJ());
        sbLIZ.append(": ");
        sbLIZ.append(condition);
        C20441214yg.LIZIZ("playbook_auto_run", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = condition;
    }

    public final void LJIIIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("conditionMatch - ");
        sbLIZ.append(LIZJ());
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C20441214yg.LIZIZ("playbook_auto_run", C2188811AlT.LIZIZ(sbLIZ));
    }
}
