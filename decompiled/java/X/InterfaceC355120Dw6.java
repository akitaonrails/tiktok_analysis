package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0Dw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC355120Dw6 extends C05YF {
    void changeVolume(float f, EnumC356070Dxd enumC356070Dxd);

    float getCurrentVolumeIntensity();

    float getSaveVolumeIntensity();

    MutableLiveData<C351080Dpa> getSlotSelectChangedEvent();

    MutableLiveData<C351120Dpe> getTrackSelectChangedEvent();

    LiveData<C357250DzX> getVolumeKeyframe();

    MutableLiveData<C350390DoT> getVolumeUpdate();
}
