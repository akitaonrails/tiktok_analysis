package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import dmt.av.video.VEPreviewMusicParams;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nrb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1451050nrb extends InterfaceC1446740nke {
    void AK0(List<SingleImageData> list, boolean z);

    void Ai0(int i);

    MutableLiveData<Boolean> DE();

    LiveData<Boolean> E41();

    void F71(int i, SingleImageData singleImageData);

    LiveData<Unit> JS();

    FrameLayout Jz2();

    void K92(boolean z);

    View LLLIIIIL();

    void LLLJIL();

    void LLLZ(List<SingleImageData> list);

    void LLLZLL(int i);

    void LW1();

    void Lr2(boolean z);

    InterfaceC572870MdR N0();

    LiveData<Boolean> PV1();

    void Q22(int i, SingleImageData singleImageData);

    MutableLiveData<Runnable> Qn2();

    void Sq2(int i, int i2);

    LiveData<Integer> UA1();

    void Up1(List<SingleImageData> list, List<Integer> list2);

    void Vx1(VEPreviewMusicParams vEPreviewMusicParams);

    void Wg0();

    void Z9(InterfaceC572870MdR interfaceC572870MdR);

    MutableLiveData<Boolean> gJ();

    InterfaceC1451400nsA getItem(int i);

    int h7();

    boolean ic0();

    void mz(boolean z);

    void r40(int i, SingleImageData singleImageData);

    void r7();

    void rO(String str);

    MutableLiveData<Boolean> sH1();

    C1450090nq3 wD0();

    LiveEvent<Unit> yd1();
}
