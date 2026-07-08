package X;

import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648410Pbz extends AbstractC649370PdX implements Observer<FollowStatus> {
    public final Fragment LLILZ;
    public final boolean LLILZIL;
    public final C01GW LLILZLL;
    public final AObserverS214S0100000_10 LLIZ;

    @Override // X.AbstractC649370PdX
    public final void LIZIZ() {
        if (this.LL != null) {
            if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                LIZJ();
            } else {
                this.LL.runOnUiThread(new ARunnableS110S0100000_10(this, 138));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C648410Pbz.LIZJ():void");
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(FollowStatus followStatus) throws JSONException {
        String userId;
        C648850Pch c648850Pch;
        FollowStatus followStatus2 = followStatus;
        String userId2 = followStatus2.getUserId();
        if (userId2 != null) {
            int followStatus3 = followStatus2.getFollowStatus();
            C648850Pch c648850Pch2 = this.LLILLJJLI;
            if (c648850Pch2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uid", userId2);
                jSONObject.put("follow_status", followStatus3);
                c648850Pch2.LIZ("changeFollowState", jSONObject);
            }
        }
        if ((followStatus2.getFollowStatus() == 1 || followStatus2.getFollowStatus() == 2 || followStatus2.getFollowStatus() == 4) && (userId = followStatus2.getUserId()) != null && (c648850Pch = this.LLILLJJLI) != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uid", userId);
            jSONObject2.put("block_status", 0);
            c648850Pch.LIZ("changeBlockState", jSONObject2);
        }
    }

    public C648410Pbz(Fragment fragment, boolean z, C19EG c19eg) {
        super(c19eg);
        this.LLILZ = fragment;
        this.LLILZIL = z;
        this.LLILZLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(558));
        this.LLIZ = new AObserverS214S0100000_10(this, 122);
    }
}
