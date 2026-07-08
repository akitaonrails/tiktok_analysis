package X;

import Y.ARunnableS110S0100000_10;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648420Pc0 extends AbstractC649370PdX implements Observer<BlockStatus> {
    public final Fragment LLILZ;
    public final C01GW LLILZIL;

    @Override // X.AbstractC649370PdX
    public final void LIZIZ() {
        if (this.LL != null) {
            if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                LIZJ();
            } else {
                this.LL.runOnUiThread(new ARunnableS110S0100000_10(this, 136));
            }
        }
    }

    public final void LIZJ() {
        if (this.LL == null) {
            return;
        }
        NextLiveData<BlockStatus> nextLiveDataLJI = ((IUserService) this.LLILZIL.getValue()).LJI();
        nextLiveDataLJI.removeObserver(this);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragment = this.LLILZ;
        C19EG c19eg = this.LL;
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, c19eg);
        if (lifecycleOwnerLJIJJ != null) {
            nextLiveDataLJI.observe(lifecycleOwnerLJIJJ, this);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(BlockStatus blockStatus) throws JSONException {
        BlockStatus blockStatus2 = blockStatus;
        String str = blockStatus2.userId;
        int i = blockStatus2.blockStatus;
        C648850Pch c648850Pch = this.LLILLJJLI;
        if (c648850Pch != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", str);
            jSONObject.put("block_status", i);
            c648850Pch.LIZ("changeBlockState", jSONObject);
        }
    }

    public C648420Pc0(Fragment fragment, C19EG c19eg) {
        super(c19eg);
        this.LLILZ = fragment;
        this.LLILZIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(556));
    }
}
