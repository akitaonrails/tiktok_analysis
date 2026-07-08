package X;

import Y.ARunnableS1S0220000_9;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.0OvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634950OvN implements C15LG {
    public RunnableC588690N7b LL;
    public final /* synthetic */ C634930OvL LLILLJJLI;

    @Override // X.C15LG
    public final void Sx(MusicModel musicModel) {
    }

    @Override // X.C15LG
    public final void fB(Effect effect, MusicModel musicModel) {
    }

    @Override // X.C15LG
    public final boolean h4() {
        return true;
    }

    @Override // X.C15LG
    public final void k8() {
    }

    @Override // X.C15LG
    public final void sa(int i, boolean z) {
    }

    public C634950OvN(C634930OvL c634930OvL) {
        this.LLILLJJLI = c634930OvL;
    }

    public final void LIZ(boolean z) {
        RunnableC588690N7b runnableC588690N7b = this.LL;
        if (runnableC588690N7b != null) {
            runnableC588690N7b.LLILLJJLI = true;
        }
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLILLJJLI.LJI;
        if (progressDialogC1399760mWs != null && progressDialogC1399760mWs.isShowing()) {
            ProgressDialogC1399760mWs progressDialogC1399760mWs2 = this.LLILLJJLI.LJI;
            if (progressDialogC1399760mWs2 != null) {
                progressDialogC1399760mWs2.dismiss();
            }
            this.LLILLJJLI.LJI = null;
        }
    }

    @Override // X.C15LG
    public final void Nw(MusicModel musicModel, boolean z) {
        ExecutorC1592406Li executorC1592406Li = ExecutorC1592406Li.LLILLJJLI;
        RunnableC588690N7b runnableC588690N7b = new RunnableC588690N7b(new AwS575S0100000_31(this.LLILLJJLI, 1054));
        this.LL = runnableC588690N7b;
        executorC1592406Li.LIZ(300L, runnableC588690N7b);
    }

    @Override // X.C15LG
    public final void hb(boolean z, boolean z2) {
        ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS1S0220000_9(this, z, z2, this.LLILLJJLI, 0));
    }

    @Override // X.C15LG
    public final void eL(int i, MusicModel musicModel, String str) {
        LIZ(false);
        this.LLILLJJLI.LJI(musicModel, str);
        AddYourRecordParam addYourRecordParam = this.LLILLJJLI.LIZJ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI.LJII;
        String musicId = musicModel.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        C634940OvM.LIZ(addYourRecordParam, true, jCurrentTimeMillis, musicId, this.LLILLJJLI.LJIIIIZZ);
    }
}
