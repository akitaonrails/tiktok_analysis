package X;

import Y.ARunnableS110S0100000_10;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648460Pc4 extends AbstractC648060PbQ implements Observer<BlockStatus> {
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    @Override // X.AbstractC648060PbQ
    public final void LJ() {
        C19EG c19eg = this.LL.LIZJ;
        if (c19eg != null) {
            if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                LJII();
            } else {
                c19eg.runOnUiThread(new ARunnableS110S0100000_10(this, 137));
            }
        }
        C650300Pf2.LIZLLL.LIZ((InterfaceC650320Pf4) this.LLILLL.getValue());
    }

    public final void LJII() {
        if (this.LL.LIZJ == null || this.LLILLJJLI.getValue() == null) {
            return;
        }
        ((IUserService) this.LLILLJJLI.getValue()).LJI().removeObserver(this);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C647830Pb3 c647830Pb3 = this.LL;
        Fragment fragment = c647830Pb3.LIZ;
        C19EG c19eg = c647830Pb3.LIZJ;
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, c19eg);
        if (lifecycleOwnerLJIJJ != null) {
            ((IUserService) this.LLILLJJLI.getValue()).LJI().observe(lifecycleOwnerLJIJJ, this);
        }
    }

    public C648460Pc4(C647830Pb3 c647830Pb3) {
        super(c647830Pb3);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(557));
        this.LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1048));
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void onChanged(BlockStatus blockStatus) throws JSONException {
        C647830Pb3 c647830Pb3 = this.LL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", blockStatus.userId);
        jSONObject.put("block_status", blockStatus.blockStatus);
        c647830Pb3.LIZ("changeBlockState", jSONObject);
        if (blockStatus.blockStatus == 1) {
            C647830Pb3 c647830Pb32 = this.LL;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uid", blockStatus.userId);
            jSONObject2.put("follow_status", 0);
            c647830Pb32.LIZ("changeFollowState", jSONObject2);
        }
    }
}
