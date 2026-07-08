package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC578430MmP extends C05YF {
    Bundle BJ2();

    MutableLiveData<Boolean> Gc0();

    void K11();

    void Ng0(Bundle bundle, Function1<? super Bundle, Unit> function1);

    LiveEvent<Boolean> Nw();

    void Ov1();

    LiveEvent<Boolean> SM2();

    LiveEvent<SwitchModePayload> Vh();

    LiveEvent<Unit> Yv0();

    void e80();

    ViewGroup.MarginLayoutParams getLayoutParams();

    void hide();

    void show();

    void xL2(SwitchModePayload switchModePayload, Bundle bundle);
}
