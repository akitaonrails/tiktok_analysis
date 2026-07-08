package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k0S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.CallsManager$getAvailableStartingCallEndpoints$1", f = "CallsManager.kt", l = {406}, m = "invokeSuspend")
public final class C1302780k0S extends C09AX implements Function2<C094D<? super List<? extends C1302410jzr>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1302860k0a LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302780k0S(C1302860k0a c1302860k0a, InterfaceC1364105Vn<? super C1302780k0S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1302860k0a;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1302780k0S c1302780k0S = new C1302780k0S(this.LLILLL, interfaceC1364105Vn);
        c1302780k0S.LLILLJJLI = obj;
        return c1302780k0S;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C094D<? super List<C1302410jzr>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(C094D<? super List<? extends C1302410jzr>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return invoke2((C094D<? super List<C1302410jzr>>) c094d, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0k0R, android.media.AudioDeviceCallback] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<AudioDeviceInfo> listLIZ;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C094D c094d = (C094D) this.LLILLJJLI;
            C1302440jzu.LIZ.getClass();
            final int iLIZLLL = C1302440jzu.LIZLLL();
            AudioManager audioManager = (AudioManager) C786410Ut5.H2(this.LLILLL.LIZ, "audio");
            if (Build.VERSION.SDK_INT >= 31) {
                listLIZ = C1302810k0V.LIZ(audioManager);
            } else {
                listLIZ = C1302820k0W.LIZ(audioManager);
            }
            List listLIZIZ = C1302460jzw.LIZIZ(iLIZLLL, this.LLILLL.LIZ, listLIZ);
            ArrayList arrayList = new ArrayList(listLIZIZ);
            c094d.getChannel();
            final C1302750k0P c1302750k0P = new C1302750k0P(arrayList, c094d);
            final C1302860k0a c1302860k0a = this.LLILLL;
            ?? r1 = new AudioDeviceCallback() { // from class: X.0k0R
                @Override // android.media.AudioDeviceCallback
                public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                    int i2;
                    if (audioDeviceInfoArr != null) {
                        C1302750k0P c1302750k0P2 = c1302750k0P;
                        List<C1302410jzr> listLIZIZ2 = C1302460jzw.LIZIZ(iLIZLLL, c1302860k0a.LIZ, C13LQ.LJJLL(audioDeviceInfoArr));
                        c1302750k0P2.getClass();
                        int i3 = 0;
                        for (C1302410jzr c1302410jzr : listLIZIZ2) {
                            if (c1302410jzr.LIZJ()) {
                                if (!c1302750k0P2.LIZLLL.containsKey(c1302410jzr.LL.toString())) {
                                    c1302750k0P2.LIZLLL.put(c1302410jzr.LL.toString(), c1302410jzr);
                                    c1302750k0P2.LIZ.add(c1302410jzr);
                                    i2 = 1;
                                }
                                i2 = 0;
                            } else {
                                if (!c1302750k0P2.LIZJ.containsKey(Integer.valueOf(c1302410jzr.LLILLJJLI))) {
                                    c1302750k0P2.LIZJ.put(Integer.valueOf(c1302410jzr.LLILLJJLI), c1302410jzr);
                                    c1302750k0P2.LIZ.add(c1302410jzr);
                                    i2 = 1;
                                }
                                i2 = 0;
                            }
                            i3 += i2;
                        }
                        if (i3 > 0) {
                            C08XD.LJIL(c1302750k0P2.LIZ);
                            c1302750k0P2.LIZIZ.LJIIIIZZ(c1302750k0P2.LIZ);
                        }
                    }
                }

                @Override // android.media.AudioDeviceCallback
                public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                    int i2;
                    if (audioDeviceInfoArr != null) {
                        C1302750k0P c1302750k0P2 = c1302750k0P;
                        List<C1302410jzr> listLIZIZ2 = C1302460jzw.LIZIZ(iLIZLLL, c1302860k0a.LIZ, C13LQ.LJJLL(audioDeviceInfoArr));
                        c1302750k0P2.getClass();
                        int i3 = 0;
                        for (C1302410jzr c1302410jzr : listLIZIZ2) {
                            if (c1302410jzr.LIZJ()) {
                                if (c1302750k0P2.LIZLLL.containsKey(c1302410jzr.LL.toString())) {
                                    c1302750k0P2.LIZLLL.remove(c1302410jzr.LL.toString());
                                    i2 = 1;
                                }
                                i2 = 0;
                            } else {
                                if (c1302750k0P2.LIZJ.containsKey(Integer.valueOf(c1302410jzr.LLILLJJLI))) {
                                    c1302750k0P2.LIZJ.remove(Integer.valueOf(c1302410jzr.LLILLJJLI));
                                    i2 = 1;
                                }
                                i2 = 0;
                            }
                            i3 += i2;
                        }
                        if (i3 > 0) {
                            ArrayList arrayList2 = new ArrayList(C13LP.LJLIL(c1302750k0P2.LIZJ.values(), c1302750k0P2.LIZLLL.values()));
                            c1302750k0P2.LIZ = arrayList2;
                            C08XD.LJIL(arrayList2);
                            c1302750k0P2.LIZIZ.LJIIIIZZ(c1302750k0P2.LIZ);
                        }
                    }
                }
            };
            audioManager.registerAudioDeviceCallback(r1, null);
            c094d.LJIIIIZZ(listLIZIZ);
            C1302790k0T c1302790k0T = new C1302790k0T(audioManager, r1, iLIZLLL);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, c1302790k0T, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }
}
