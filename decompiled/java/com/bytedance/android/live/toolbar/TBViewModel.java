package com.bytedance.android.live.toolbar;

import X.C0KX7;
import X.C1102510enR;
import X.C1102780ens;
import X.EnumC992450bvv;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveToolbarExpandAndCommentSetting;

/* JADX INFO: loaded from: classes18.dex */
public final class TBViewModel extends ViewModel {
    public final MutableLiveData<Drawable> LL = new MutableLiveData<>();
    public final MutableLiveData<String> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<String> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<C1102780ens> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Drawable> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<Float> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<C1102510enR> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJ = new MutableLiveData<>();
    public final MutableLiveData<EnumC992450bvv> LLJI = new MutableLiveData<>();
    public final MutableLiveData<String> LLJIJIL = new MutableLiveData<>();
    public final MutableLiveData<Drawable> LLJILJIL = new MutableLiveData<>();

    public final boolean isVisible() {
        C1102510enR value = this.LLIZ.getValue();
        return value != null && value.LIZ;
    }

    public final boolean wQ2() {
        C1102780ens value = this.LLILZ.getValue();
        return (value != null ? value.LIZ : null) == C0KX7.FILL_REMAINING && LiveToolbarExpandAndCommentSetting.INSTANCE.enableToolbarExpand();
    }

    public final void AQ2(C0KX7 c0kx7) {
        MutableLiveData<C1102780ens> mutableLiveData = this.LLILZ;
        C1102780ens value = mutableLiveData.getValue();
        if (value == null) {
            value = new C1102780ens(0);
        }
        mutableLiveData.setValue(C1102780ens.LIZ(value, c0kx7, null, null, 6));
    }

    public final void vQ2(LifecycleOwner lifecycleOwner) {
        this.LL.removeObservers(lifecycleOwner);
        this.LLILLJJLI.removeObservers(lifecycleOwner);
        this.LLILLL.removeObservers(lifecycleOwner);
        this.LLILZIL.removeObservers(lifecycleOwner);
        this.LLILZLL.removeObservers(lifecycleOwner);
        this.LLIZ.removeObservers(lifecycleOwner);
        this.LLIZLLLIL.removeObservers(lifecycleOwner);
        this.LLJ.removeObservers(lifecycleOwner);
        this.LLJI.removeObservers(lifecycleOwner);
        this.LLJIJIL.removeObservers(lifecycleOwner);
        this.LLJILJIL.removeObservers(lifecycleOwner);
    }

    public final void xQ2(Integer num) {
        MutableLiveData<C1102780ens> mutableLiveData = this.LLILZ;
        C1102780ens value = mutableLiveData.getValue();
        if (value == null) {
            value = new C1102780ens(0);
        }
        mutableLiveData.setValue(C1102780ens.LIZ(value, null, null, num, 3));
    }

    public final void yQ2(Integer num) {
        MutableLiveData<C1102780ens> mutableLiveData = this.LLILZ;
        C1102780ens value = mutableLiveData.getValue();
        if (value == null) {
            value = new C1102780ens(0);
        }
        mutableLiveData.setValue(C1102780ens.LIZ(value, null, num, null, 5));
    }

    public final void zQ2(boolean z, boolean z2) {
        this.LLIZ.setValue(new C1102510enR(z, z2));
    }
}
