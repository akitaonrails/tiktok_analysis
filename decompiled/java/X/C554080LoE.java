package X;

import Y.AObserverS212S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LoE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554080LoE extends C19A3 {
    public final C553990Lo5 LLJILLL;
    public C554100LoG LLJJ;
    public final MutableLiveData<C551290Ljj> LLJJI = new MutableLiveData<>();
    public final MutableLiveData<C551390Ljt> LLJJIII = new MutableLiveData<>();
    public final MutableLiveData<C549360Lgc> LLJJIJI = new MutableLiveData<>();
    public final MutableLiveData<C551290Ljj> LLJJIJIIJIL = new MutableLiveData<>();
    public final MutableLiveData<List<MentionDataItem>> LLJJIJIL = new MutableLiveData<>(C13BV.INSTANCE);

    public C554080LoE(C553990Lo5 c553990Lo5) {
        this.LLJILLL = c553990Lo5;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        LiveData liveDataNn;
        LiveData liveDataYb;
        LiveData liveDataAo;
        LiveData liveDataPo;
        LiveData liveDataRg;
        super.onViewCreated(view, bundle);
        C1664590tQ1.LIZLLL(this, null, true, AFwS239S0000000_8.get$arr$(319), 1);
        C1664600tQ2.LIZ(this, null, new AwS587S0100000_8(this, 675));
        C554100LoG c554100LoG = this.LLJJ;
        if (c554100LoG != null && (liveDataRg = c554100LoG.rg()) != null) {
            liveDataRg.observe(this, new AObserverS212S0100000_8(this, 88));
        }
        C554100LoG c554100LoG2 = this.LLJJ;
        if (c554100LoG2 != null && (liveDataPo = c554100LoG2.Po()) != null) {
            liveDataPo.observe(this, new AObserverS212S0100000_8(this, 89));
        }
        C554100LoG c554100LoG3 = this.LLJJ;
        if (c554100LoG3 != null && (liveDataAo = c554100LoG3.Ao()) != null) {
            liveDataAo.observe(this, new AObserverS212S0100000_8(this, 90));
        }
        C554100LoG c554100LoG4 = this.LLJJ;
        if (c554100LoG4 != null && (liveDataYb = c554100LoG4.Yb()) != null) {
            liveDataYb.observe(this, new AObserverS212S0100000_8(this, 91));
        }
        C554100LoG c554100LoG5 = this.LLJJ;
        if (c554100LoG5 != null && (liveDataNn = c554100LoG5.nn()) != null) {
            liveDataNn.observe(this, new AObserverS212S0100000_8(this, 92));
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ob, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
