package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting;

/* JADX INFO: renamed from: X.0zf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC1904600zf8 extends C19292910dr implements View.OnClickListener {
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    @Override // X.C19292910dr
    /* JADX INFO: renamed from: LJII */
    public final C19319810iC LIZLLL() {
        return new C19319810iC(((ISpeedModeSetting) ServiceManager.get().getService(ISpeedModeSetting.class)).LJFF() == EnumC1493040oxK.ALLOW, this.LLILZIL, this, false, null, null, null, this.LLILZLL, true, false, false, null, 127992);
    }

    @Override // X.C19292910dr, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public ViewOnClickListenerC1904600zf8(Fragment fragment) {
        super(null);
        this.LLILZIL = fragment.getString(2131848352);
        this.LLILZLL = fragment.getString(2131848351);
        this.LLIZ = "speed_mode_on";
        this.LLIZLLLIL = "speed_mode_off";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EnumC1493040oxK enumC1493040oxK;
        LJIIIIZZ();
        boolean z = LIZIZ().LLJJIJIL;
        ISpeedModeSetting iSpeedModeSetting = (ISpeedModeSetting) ServiceManager.get().getService(ISpeedModeSetting.class);
        if (z) {
            enumC1493040oxK = EnumC1493040oxK.ALLOW;
        } else {
            enumC1493040oxK = EnumC1493040oxK.NOT_ALLOW;
        }
        iSpeedModeSetting.LIZJ(enumC1493040oxK);
        if (z) {
            SpeedModeServiceImpl.LIZLLL().start();
            C20684815ws.onEventV3(this.LLIZ);
        } else {
            SpeedModeServiceImpl.LIZLLL().stop();
            C20684815ws.onEventV3(this.LLIZLLLIL);
        }
    }
}
