package X;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import androidx.core.telecom.internal.MuteStateReceiver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302260jzc extends Connection implements AutoCloseable {
    public final ParcelUuid LL;
    public final Context LLILLJJLI;
    public final C1302880k0c LLILLL;
    public final C1302920k0g LLILZ;
    public final CoroutineContext LLILZIL;
    public final Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> LLILZLL;
    public final Function2<DisconnectCause, InterfaceC1364105Vn<? super Unit>, Object> LLIZ;
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LLIZLLLIL;
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LLJ;
    public final InterfaceC1631620sYq<String, Bundle, InterfaceC1364105Vn<? super Unit>, Object> LLJI;
    public final C05YC<EnumC1302210jzX> LLJIJIL;
    public final C1302410jzr LLJILJIL;
    public final C05XL<Unit> LLJILJILJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public C1302410jzr LLJJIJI;
    public C1302410jzr LLJJIJIIJIL;
    public C1302410jzr LLJJJ;
    public final int LLJJJIL;
    public final MuteStateReceiver LLJJJJ;
    public final C099F LLJJJJJIL;
    public final String LLJILLL = C1302260jzc.class.getSimpleName();
    public final ArrayList<BluetoothDevice> LLJJ = new ArrayList<>();
    public List<C1302410jzr> LLJJIJIL = new ArrayList();

    @Override // android.telecom.Connection
    public final void onDisconnect() {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302300jzg(this, null), 3);
    }

    @Override // android.telecom.Connection
    public final void onHold() {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302120jzO(this, null), 3);
    }

    @Override // android.telecom.Connection
    public final void onReject() {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302290jzf(this, null), 3);
    }

    @Override // android.telecom.Connection
    public final void onUnhold() {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302130jzP(this, null), 3);
    }

    public final AbstractC1302360jzm LJIILL() {
        setActive();
        C013C c013c = new C013C();
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302140jzQ(this, c013c, null), 3);
        return c013c.element ? new C1302350jzl(1) : new C1302340jzk();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        MuteStateReceiver muteStateReceiver;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("close: CallSessionLegacyId=[");
        sbLIZ.append(this.LLJJJIL);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        C1302440jzu c1302440jzu = C1302440jzu.LIZ;
        int i = this.LLJJJIL;
        c1302440jzu.getClass();
        C1302440jzu.LIZ(i);
        C1302930k0h.LIZ.getClass();
        if (Build.VERSION.SDK_INT < 28 || (muteStateReceiver = this.LLJJJJ) == null) {
            return;
        }
        C786410Ut5.LJJIFFI(this.LLILLJJLI, muteStateReceiver);
    }

    public final void LIZ(Exception exc) {
        LIZLLL(EnumC1302210jzX.DISCONNECTED);
        LJIILLIIL(new DisconnectCause(2));
        this.LLJILJILJ.LJIIZILJ(Unit.LIZ);
        throw exc;
    }

    public final void LIZLLL(EnumC1302210jzX enumC1302210jzX) {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302160jzS(this, enumC1302210jzX, null), 3);
    }

    public final void LJFF(boolean z) {
        C094N.LIZJ(this.LLILZ.LIZJ.LJIIIIZZ(Boolean.valueOf(z)));
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302170jzT(z, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1302360jzm LJI(X.C1302410jzr r10) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302260jzc.LJI(X.0jzr):X.0jzm");
    }

    public final void LJII(CallAudioState callAudioState) throws Throwable {
        int i = this.LLJJJIL;
        ArrayList arrayList = new ArrayList();
        int supportedRouteMask = callAudioState.getSupportedRouteMask();
        if ((supportedRouteMask & 1) == 1) {
            String strLIZ = C1302460jzw.LIZ(1);
            C1302440jzu.LIZ.getClass();
            arrayList.add(new C1302410jzr(strLIZ, 1, C1302440jzu.LIZIZ(i, 1, "")));
        }
        if ((supportedRouteMask & 2) == 2) {
            if (Build.VERSION.SDK_INT >= 28) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<BluetoothDevice> it2 = callAudioState.getSupportedBluetoothDevices().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C1302320jzi.LIZ(it2.next(), i));
                }
                arrayList.addAll(arrayList2);
            } else {
                String strLIZ2 = C1302460jzw.LIZ(2);
                C1302440jzu c1302440jzu = C1302440jzu.LIZ;
                String strLIZ3 = C1302460jzw.LIZ(2);
                c1302440jzu.getClass();
                arrayList.add(new C1302410jzr(strLIZ2, 2, C1302440jzu.LIZIZ(i, 2, strLIZ3)));
            }
        }
        if ((supportedRouteMask & 4) == 4) {
            String strLIZ4 = C1302460jzw.LIZ(3);
            C1302440jzu.LIZ.getClass();
            arrayList.add(new C1302410jzr(strLIZ4, 3, C1302440jzu.LIZIZ(i, 3, "")));
        }
        if ((supportedRouteMask & 8) == 8) {
            String strLIZ5 = C1302460jzw.LIZ(4);
            C1302440jzu.LIZ.getClass();
            arrayList.add(new C1302410jzr(strLIZ5, 4, C1302440jzu.LIZIZ(i, 4, "")));
        }
        if ((supportedRouteMask & 16) == 16) {
            String strLIZ6 = C1302460jzw.LIZ(5);
            C1302440jzu.LIZ.getClass();
            arrayList.add(new C1302410jzr(strLIZ6, 5, C1302440jzu.LIZIZ(i, 5, "")));
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(LJIJJLI((C1302410jzr) it3.next()));
        }
        List<C1302410jzr> listLJLLJ = C13LP.LJLLJ(arrayList3);
        ArrayList arrayList4 = new ArrayList(listLJLLJ);
        this.LLJJIJIL = arrayList4;
        C1302460jzw.LJFF(arrayList4);
        C094N.LIZJ(this.LLILZ.LIZIZ.LJIIIIZZ(listLJLLJ));
    }

    public final C1302340jzk LJIILLIIL(DisconnectCause disconnectCause) {
        setDisconnected(disconnectCause);
        destroy();
        LIZLLL(EnumC1302210jzX.DISCONNECTED);
        return new C1302340jzk();
    }

    public final void LJIIZILJ(CallAudioState callAudioState) throws Throwable {
        int i;
        C1302410jzr c1302410jzr;
        this.LLJJIJI = this.LLJJIJIIJIL;
        int i2 = this.LLJJJIL;
        int route = callAudioState.getRoute();
        if (route != 1) {
            if (route != 2) {
                i = 4;
                if (route != 4) {
                    if (route != 8) {
                        i = route != 16 ? -1 : 5;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
                if (Build.VERSION.SDK_INT >= 28 && callAudioState.getActiveBluetoothDevice() != null) {
                    c1302410jzr = C1302320jzi.LIZ(callAudioState.getActiveBluetoothDevice(), i2);
                }
                C1302410jzr c1302410jzrLJIJJLI = LJIJJLI(c1302410jzr);
                this.LLJJIJIIJIL = c1302410jzrLJIJJLI;
                C094N.LIZJ(this.LLILZ.LIZ.LJIIIIZZ(c1302410jzrLJIJJLI));
            }
        } else {
            i = 1;
        }
        String strLIZ = C1302460jzw.LIZ(i);
        C1302440jzu.LIZ.getClass();
        c1302410jzr = new C1302410jzr(strLIZ, i, C1302440jzu.LIZIZ(i2, i, ""));
        C1302410jzr c1302410jzrLJIJJLI2 = LJIJJLI(c1302410jzr);
        this.LLJJIJIIJIL = c1302410jzrLJIJJLI2;
        C094N.LIZJ(this.LLILZ.LIZ.LJIIIIZZ(c1302410jzrLJIJJLI2));
    }

    public final void LJIJJ(List<C1302410jzr> list) {
        if (this.LLJILJIL != null) {
            if (!this.LLJJI) {
                C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302250jzb(list, this, null), 3);
            }
        } else {
            C1302410jzr c1302410jzr = this.LLJJIJIIJIL;
            if (!this.LLJJIII && this.LLILLL.LIZLLL == 2) {
                try {
                    C1302410jzr c1302410jzrLIZLLL = C1302460jzw.LIZLLL(list);
                    if (C1302460jzw.LJ(c1302410jzr) && c1302410jzrLIZLLL != null) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302240jza(list, this, c1302410jzrLIZLLL, null), 3);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("maybeSwitchToSpeaker: hit exception=[");
                    sbLIZ.append(e);
                    sbLIZ.append(']');
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                this.LLJJIII = true;
            }
        }
        this.LLJJI = true;
    }

    public final C1302410jzr LJIJJLI(C1302410jzr c1302410jzr) {
        C1302440jzu c1302440jzu = C1302440jzu.LIZ;
        int i = this.LLJJJIL;
        int i2 = c1302410jzr.LLILLJJLI;
        String string = c1302410jzr.LL.toString();
        c1302440jzu.getClass();
        C1302410jzr c1302410jzr2 = new C1302410jzr(c1302410jzr.LL, c1302410jzr.LLILLJJLI, C1302440jzu.LIZIZ(i, i2, string));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" n=[");
        sbLIZ.append((Object) c1302410jzr.LL);
        sbLIZ.append("]  plat=[");
        sbLIZ.append(c1302410jzr);
        sbLIZ.append("] --> jet=[");
        sbLIZ.append(c1302410jzr2);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        return c1302410jzr2;
    }

    @Override // android.telecom.Connection
    public final void onAnswer(int i) {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302110jzN(this, i, null), 3);
    }

    @Override // android.telecom.Connection
    public final void onCallAudioStateChanged(CallAudioState callAudioState) throws Throwable {
        Integer numValueOf;
        Integer numValueOf2;
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList<BluetoothDevice> arrayList = this.LLJJ;
            arrayList.clear();
            arrayList.addAll(callAudioState.getSupportedBluetoothDevices());
        }
        try {
            LJIIZILJ(callAudioState);
            LJII(callAudioState);
            LJFF(callAudioState.isMuted());
            LJIJJ(this.LLJJIJIL);
            C1302410jzr c1302410jzr = this.LLJJIJIIJIL;
            if (c1302410jzr != null) {
                LIZIZ(c1302410jzr, this.LLJJIJI, this.LLJJIJIL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCallAudioStateChanged: caught=[");
            sbLIZ.append(C13SZ.LIZIZ(e));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1302410jzr c1302410jzr2 = this.LLJJJ;
        if (c1302410jzr2 != null) {
            numValueOf = Integer.valueOf(c1302410jzr2.LLILLJJLI);
        } else {
            numValueOf = null;
        }
        C1302410jzr c1302410jzr3 = this.LLJJIJIIJIL;
        if (c1302410jzr3 != null) {
            numValueOf2 = Integer.valueOf(c1302410jzr3.LLILLJJLI);
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
            this.LLJJJ = null;
        }
    }

    @Override // android.telecom.Connection
    public final void onReject(int i) {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302270jzd(this, null), 3);
    }

    @Override // android.telecom.Connection
    public final void onStateChanged(int i) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateChanged: state=");
        switch (i) {
            case 0:
                str = "INITIALIZING";
                break;
            case 1:
                str = "NEW";
                break;
            case 2:
                str = "RINGING";
                break;
            case 3:
                str = "DIALING";
                break;
            case 4:
                str = "ACTIVE";
                break;
            case 5:
                str = "HOLDING";
                break;
            case 6:
                str = "DISCONNECTED";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i != 2 && i != 3) {
            return;
        }
        this.LLJJJJJIL.LJJLIIIJILLIZJL(Unit.LIZ);
    }

    @Override // android.telecom.Connection
    public final void onReject(String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1302280jze(this, null), 3);
    }

    @Override // android.telecom.Connection
    public final void onCallEvent(String str, Bundle bundle) {
        super.onCallEvent(str, bundle);
        if (str == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LLILZIL), null, null, new C1301800jys(this, str, bundle, null), 3);
    }

    public final void LIZIZ(C1302410jzr c1302410jzr, C1302410jzr c1302410jzr2, List<C1302410jzr> list) {
        C1302410jzr c1302410jzrLIZLLL;
        try {
            if (this.LLILLL.LIZLLL == 2 && C1302460jzw.LJ(c1302410jzr) && c1302410jzr2 != null) {
                int i = c1302410jzr2.LLILLJJLI;
                if ((i == 2 || i == 3) && !C1302460jzw.LJ(this.LLJJJ) && (c1302410jzrLIZLLL = C1302460jzw.LIZLLL(list)) != null) {
                    LJI(c1302410jzrLIZLLL);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("maybeSwitchToSpeakerOnHeadsetDisconnect: exception=[");
            sbLIZ.append(e);
            sbLIZ.append(']');
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1302260jzc(ParcelUuid parcelUuid, Context context, C1302880k0c c1302880k0c, C1302920k0g c1302920k0g, CoroutineContext coroutineContext, Function2<? super Integer, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, Function2<? super DisconnectCause, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function22, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function12, InterfaceC1631620sYq<? super String, ? super Bundle, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, C05YC<EnumC1302210jzX> c05yc, C1302410jzr c1302410jzr, C05XL<Unit> c05xl) throws Exception {
        this.LL = parcelUuid;
        this.LLILLJJLI = context;
        this.LLILLL = c1302880k0c;
        this.LLILZ = c1302920k0g;
        this.LLILZIL = coroutineContext;
        this.LLILZLL = function2;
        this.LLIZ = function22;
        this.LLIZLLLIL = function1;
        this.LLJ = function12;
        this.LLJI = interfaceC1631620sYq;
        this.LLJIJIL = c05yc;
        this.LLJILJIL = c1302410jzr;
        this.LLJILJILJ = c05xl;
        C1302440jzu.LIZ.getClass();
        this.LLJJJIL = C1302440jzu.LIZLLL();
        this.LLJJJJJIL = C090F.LIZIZ();
        C1302930k0h.LIZ.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            MuteStateReceiver muteStateReceiver = new MuteStateReceiver(new C1302230jzZ(this));
            this.LLJJJJ = muteStateReceiver;
            C786410Ut5.LJIJJ(context, muteStateReceiver, new IntentFilter("android.media.action.MICROPHONE_MUTE_CHANGED"));
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(coroutineContext), null, null, new C1302220jzY(this, null), 3);
    }
}
