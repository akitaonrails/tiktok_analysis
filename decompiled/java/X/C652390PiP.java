package X;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchHorizontalCardRecyclerViewSlideOptConfig;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652390PiP extends RecyclerView.ViewHolder {
    public final C0PVK LL;
    public final RecyclerView LLILLJJLI;
    public final ViewGroup LLILLL;
    public final ViewGroup LLILZ;
    public final ViewStub LLILZIL;
    public final C437150HCf LLILZLL;

    public C652390PiP(View view) {
        Field field;
        super(view);
        C0PVK c0pvk = new C0PVK();
        this.LL = c0pvk;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.df_);
        this.LLILLJJLI = recyclerView;
        this.LLILLL = (ViewGroup) view.findViewById(R.id.nks);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.nku);
        view.findViewById(R.id.u3b);
        this.LLILZIL = (ViewStub) view.findViewById(R.id.a5b);
        recyclerView.setMotionEventSplittingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(c0pvk);
        C652410PiR.LIZ.getClass();
        C01GW c01gw = C652410PiR.LIZJ;
        if (((SearchHorizontalCardRecyclerViewSlideOptConfig) c01gw.getValue()).enableHorizontalCardRecyclerViewSlideOpt && (field = C652400PiQ.LIZ) != null) {
            try {
                field.set(recyclerView, Integer.valueOf((int) (ViewConfiguration.get(this.itemView.getContext()).getScaledTouchSlop() * ((SearchHorizontalCardRecyclerViewSlideOptConfig) c01gw.getValue()).horizontalCardViewSlideOptRate)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (C0BRN.LIZ()) {
            C0PS1.LIZ(this.LLILLJJLI);
        }
        if (this.LLILZIL != null && Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchVideoAutoplayGuideLineSwitch(), Boolean.TRUE)) {
            this.LLILZLL = (C437150HCf) C786410Ut5.LJLLLL(this.LLILZIL).findViewById(R.id.a5c);
        }
    }
}
