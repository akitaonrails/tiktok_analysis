package Y;

import X.C1058910df7;
import X.C1059930dgl;
import X.C1C7U;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS5S0102000_16 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (this.i1 != 47) {
            ARunnableS24S0400000_16 aRunnableS24S0400000_16 = (ARunnableS24S0400000_16) this.l0;
            ((C1059930dgl) aRunnableS24S0400000_16.l3).LIZJ(((C1058910df7) aRunnableS24S0400000_16.l1).LIZLLL);
        }
        ARunnableS24S0400000_16 aRunnableS24S0400000_162 = (ARunnableS24S0400000_16) this.l0;
        C1059930dgl c1059930dgl = (C1059930dgl) aRunnableS24S0400000_162.l3;
        JSONObject jSONObject = (JSONObject) aRunnableS24S0400000_162.l2;
        int i = this.i2;
        c1059930dgl.getClass();
        try {
            jSONObject.put("code", i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ARunnableS24S0400000_16 aRunnableS24S0400000_163 = (ARunnableS24S0400000_16) this.l0;
        C1059930dgl c1059930dgl2 = (C1059930dgl) aRunnableS24S0400000_163.l3;
        c1059930dgl2.LLILLJJLI.LIZ(c1059930dgl2.LLILLL, (JSONObject) aRunnableS24S0400000_163.l0);
    }

    public static final void run$0(ARunnableS5S0102000_16 aRunnableS5S0102000_16) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        C1C7U.LIZ("CommentPowerListAssem@dc7a.scrollToPositionWithOffset$1");
        try {
            if (((CommentPowerListAssem) aRunnableS5S0102000_16.l0).Bp().getParent() != null) {
                RecyclerView.LayoutManager layoutManager = ((CommentPowerListAssem) aRunnableS5S0102000_16.l0).Bp().getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    linearLayoutManager.scrollToPositionWithOffset(aRunnableS5S0102000_16.i1, aRunnableS5S0102000_16.i2);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPowerListAssem@dc7a.scrollToPositionWithOffset$1");
    }

    public static final void run$1(ARunnableS5S0102000_16 aRunnableS5S0102000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeParamMethod@7f80.watchLive$1$1");
        try {
            aRunnableS5S0102000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeParamMethod@7f80.watchLive$1$1");
    }

    public ARunnableS5S0102000_16(CommentPowerListAssem commentPowerListAssem, int i, int i2) {
        this.$t = i2;
        this.l0 = commentPowerListAssem;
        this.i1 = i;
        this.i2 = 0;
    }

    public ARunnableS5S0102000_16(ARunnableS24S0400000_16 aRunnableS24S0400000_16, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = aRunnableS24S0400000_16;
        this.i1 = i;
        this.i2 = i2;
    }
}
