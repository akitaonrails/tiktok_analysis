package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.os.Build;
import android.widget.FrameLayout;
import com.lynx.base.log.LynxLog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1AML, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1AML extends FrameLayout {
    public InterfaceC1491100ouC LL;
    public final C01GW LLILLJJLI;

    public abstract void LIZJ(C1491120ouE c1491120ouE);

    public abstract boolean LIZLLL();

    public abstract void LJFF();

    public abstract void setPlayParams(Map<String, ? extends Object> map);

    private final C1AMR getMAudioFocusManager() {
        return (C1AMR) this.LLILLJJLI.getValue();
    }

    public final InterfaceC1491100ouC getMediaView() {
        return this.LL;
    }

    public C1AML(Context context) {
        new LinkedHashMap();
        super(context);
        this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C1AMT(context));
    }

    public final void LIZ(C1AMO c1amo) {
        LynxLog.i("LynxMediaEngineBaseView", "invoke abandonAudioFocus");
        if (this.LL != null) {
            C1AMR mAudioFocusManager = getMAudioFocusManager();
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = mAudioFocusManager.LIZIZ;
                if (audioFocusRequest != null) {
                    mAudioFocusManager.LIZ.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            mAudioFocusManager.LIZ.abandonAudioFocus(c1amo);
        }
    }

    public final void LIZIZ(C1491120ouE c1491120ouE) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            LynxLog.i("LynxMediaEngineBaseView", "invoke pause");
            interfaceC1491100ouC.LJIIZILJ(c1491120ouE);
        }
    }

    public final void LJ(C1AMO c1amo) {
        LynxLog.i("LynxMediaEngineBaseView", "invoke requestAudioFocus");
        if (this.LL != null) {
            C1AMR mAudioFocusManager = getMAudioFocusManager();
            if (Build.VERSION.SDK_INT >= 26) {
                mAudioFocusManager.getClass();
                AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(c1amo).build();
                mAudioFocusManager.LIZIZ = audioFocusRequestBuild;
                C786410Ut5.p4(mAudioFocusManager.LIZ, audioFocusRequestBuild);
                return;
            }
            C786410Ut5.q4(mAudioFocusManager.LIZ, c1amo, 3, 1);
        }
    }

    public final void setCacheSize(int i) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke setCacheSize ");
            sbLIZ.append(i);
            LynxLog.i("LynxMediaEngineBaseView", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1491100ouC.LJIILL(C2097908Jt.LIZJ(new Pair("cache-size", Integer.valueOf(i))));
        }
    }

    public final void setDataSource(InterfaceC1467770oIZ interfaceC1467770oIZ) {
        InterfaceC1491100ouC interfaceC1491100ouC;
        if (interfaceC1467770oIZ != null && (interfaceC1491100ouC = this.LL) != null) {
            LynxLog.i("LynxMediaEngineBaseView", "trigger setDataSource");
            interfaceC1491100ouC.LJIIIIZZ(interfaceC1467770oIZ);
        }
    }

    public final void setLoop(boolean z) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke setLoop ");
            sbLIZ.append(z);
            LynxLog.i("LynxMediaEngineBaseView", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1491100ouC.LJIILL(C2097908Jt.LIZJ(new Pair("loop", Boolean.valueOf(z))));
        }
    }

    public final void setMediaVideoEngineCallback(InterfaceC1473620oS0 interfaceC1473620oS0) {
        InterfaceC1491100ouC interfaceC1491100ouC;
        if (interfaceC1473620oS0 != null && (interfaceC1491100ouC = this.LL) != null) {
            LynxLog.i("LynxMediaEngineBaseView", "trigger setVideoEngineInfoListener");
            interfaceC1491100ouC.LJIIIZ(interfaceC1473620oS0);
        }
    }

    public final void setMediaView(InterfaceC1491100ouC interfaceC1491100ouC) {
        this.LL = interfaceC1491100ouC;
    }

    public final void setMuted(boolean z) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke setMuted ");
            sbLIZ.append(z);
            LynxLog.i("LynxMediaEngineBaseView", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1491100ouC.LJIILL(C2097908Jt.LIZJ(new Pair("muted", Boolean.valueOf(z))));
        }
    }

    public final void setPlayOptions(Map<Integer, ? extends Pair<? extends Object, ? extends EnumC1473790oSH>> map) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            LynxLog.i("LynxMediaEngineBaseView", "trigger setPlayOptions");
            interfaceC1491100ouC.LJ(map);
        }
    }

    public final void setProgressUpdateInterval(int i) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke setProgressUpdateInterval ");
            sbLIZ.append(i);
            LynxLog.i("LynxMediaEngineBaseView", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1491100ouC.LJIILL(C2097908Jt.LIZJ(new Pair("progress_update_interval", Integer.valueOf(i))));
        }
    }

    public final void setResolution(String str) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke setResolution ");
            sbLIZ.append(str);
            LynxLog.i("LynxMediaEngineBaseView", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1491100ouC.LJIILL(C2097908Jt.LIZJ(new Pair("resolution", str)));
        }
    }

    public final void setSpeed(float f) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke setSpeed ");
            sbLIZ.append(f);
            LynxLog.i("LynxMediaEngineBaseView", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1491100ouC.LJIILL(C2097908Jt.LIZJ(new Pair("speed", Float.valueOf(f))));
        }
    }

    public final void setSubTag(String str) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke setSubTag ");
            sbLIZ.append(str);
            LynxLog.i("LynxMediaEngineBaseView", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1491100ouC.LJIILL(C2097908Jt.LIZJ(new Pair("sub_tag", str)));
        }
    }

    public final void setTag(String str) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke setTag ");
            sbLIZ.append(str);
            LynxLog.i("LynxMediaEngineBaseView", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1491100ouC.LJIILL(C2097908Jt.LIZJ(new Pair("tag", str)));
        }
    }

    public final void setVideoEngineCallback(InterfaceC1469360oL8 interfaceC1469360oL8) {
        InterfaceC1491100ouC interfaceC1491100ouC;
        if (interfaceC1469360oL8 != null && (interfaceC1491100ouC = this.LL) != null) {
            LynxLog.i("LynxMediaEngineBaseView", "trigger setVideoEngineCallback");
            interfaceC1491100ouC.LIZLLL(interfaceC1469360oL8);
        }
    }

    public final void setVideoEngineInfoListener(InterfaceC1467780oIa interfaceC1467780oIa) {
        InterfaceC1491100ouC interfaceC1491100ouC;
        if (interfaceC1467780oIa != null && (interfaceC1491100ouC = this.LL) != null) {
            LynxLog.i("LynxMediaEngineBaseView", "trigger setVideoEngineInfoListener");
            interfaceC1491100ouC.LJIIJ(interfaceC1467780oIa);
        }
    }

    public final void setVolume(float f) {
        InterfaceC1491100ouC interfaceC1491100ouC = this.LL;
        if (interfaceC1491100ouC != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke setVolume ");
            sbLIZ.append(f);
            LynxLog.i("LynxMediaEngineBaseView", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1491100ouC.LJIILL(C2097908Jt.LIZJ(new Pair("volume", Float.valueOf(f))));
        }
    }
}
