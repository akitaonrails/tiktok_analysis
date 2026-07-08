package com.bytedance.android.live.effect.sticker.data;

import X.C01GW;
import X.C0UBH;
import X.C20337914i1;
import X.C20441214yg;
import X.C452501pT;
import X.InterfaceC401501hF;
import X.InterfaceC934710aQn;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectCheckUpdateInterval;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiGuestStickerViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(28));
    public final MutableLiveData<List<LiveEffect>> LLILLJJLI = new MutableLiveData<>(new ArrayList());
    public final MutableLiveData<List<LiveEffect>> LLILLL = new MutableLiveData<>(new ArrayList());
    public final MutableLiveData<List<C0UBH>> LLILZ = new MutableLiveData<>(new ArrayList());
    public LiveEffect LLILZIL;

    public static boolean wQ2() {
        C20337914i1<Long> c20337914i1 = InterfaceC934710aQn.Vb;
        if ((System.currentTimeMillis() - c20337914i1.LIZIZ().longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) <= LiveEffectCheckUpdateInterval.INSTANCE.getInterval()) {
            return false;
        }
        c20337914i1.LJFF(Long.valueOf(System.currentTimeMillis()));
        C20441214yg.LIZIZ("EffectMemoryOpt", "shouldCheckUpdate is true.");
        return true;
    }

    public final InterfaceC401501hF vQ2() {
        return (InterfaceC401501hF) this.LL.getValue();
    }
}
