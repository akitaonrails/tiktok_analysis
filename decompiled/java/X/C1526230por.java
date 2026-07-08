package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Objects;

/* JADX INFO: renamed from: X.0por, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526230por implements Handler.Callback {
    public final Context LL;
    public C1526250pot LLILZ;
    public long LLILZIL;
    public final C1526570ppP LLILLL = ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config();
    public final BPEAHandler LLILLJJLI = new BPEAHandler(((InterfaceC1525560pnm) C808470VnZ.LIZ(InterfaceC1525560pnm.class)).get(), this);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0pot] */
    public final void LIZIZ() {
        this.LLILZ = new InterfaceC815710VzF<Void>() { // from class: X.0pot
            @Override // X.InterfaceC815710VzF
            public final void LIZ(Void r5) {
                long jLJIIIZ = C1526890ppv.LIZJ(this.LIZ.LL).LIZIZ().LJIIIZ() * 1000;
                C786410Ut5.LJLJLJ(this.LIZ.LLILLJJLI, this.LIZ.LLILLJJLI.obtainMessage(102), jLJIIIZ);
            }
        };
        ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LJIILL(this.LLILZ);
        InterfaceC1526490ppH interfaceC1526490ppH = (InterfaceC1526490ppH) C808470VnZ.LIZ(InterfaceC1526490ppH.class);
        final InterfaceC1525970poR interfaceC1525970poRLIZIZ = C1526890ppv.LIZJ(this.LL).LIZIZ();
        if (interfaceC1525970poRLIZIZ.LJIIIIZZ()) {
            interfaceC1526490ppH.LJJLIIIJJI(new InterfaceC1526540ppM() { // from class: X.0pos
                @Override // X.InterfaceC1526540ppM
                public final void LJI(boolean z) {
                    if (interfaceC1525970poRLIZIZ.LIZJ()) {
                        C1526230por c1526230por = this.LLILLJJLI;
                        c1526230por.getClass();
                        try {
                            if (z) {
                                c1526230por.LLILLJJLI.removeMessages(104);
                                if (!c1526230por.LLILLJJLI.hasMessages(103)) {
                                    BPEAHandler bPEAHandler = c1526230por.LLILLJJLI;
                                    C786410Ut5.LJLJLJ(bPEAHandler, bPEAHandler.obtainMessage(103), 1000L);
                                    return;
                                }
                                return;
                            }
                            c1526230por.LLILLJJLI.removeMessages(103);
                            if (!c1526230por.LLILLJJLI.hasMessages(104)) {
                                BPEAHandler bPEAHandler2 = c1526230por.LLILLJJLI;
                                C786410Ut5.LJLJJL(bPEAHandler2, bPEAHandler2.obtainMessage(104));
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1527890prX.LIZIZ(Log.getStackTraceString(th));
                        }
                    }
                }
            });
        }
        C786410Ut5.LJLJJL(this.LLILLJJLI, this.LLILLJJLI.obtainMessage(106));
        C786410Ut5.LJLJJL(this.LLILLJJLI, this.LLILLJJLI.obtainMessage(101));
        C786410Ut5.LJLJJL(this.LLILLJJLI, this.LLILLJJLI.obtainMessage(105));
    }

    public C1526230por(Context context) {
        this.LL = context;
    }

    public final void LIZ(int i) {
        if (C1526890ppv.LIZJ(this.LL).LIZ()) {
            ((InterfaceC1525730po3) C808470VnZ.LIZ(InterfaceC1525730po3.class)).LJIILLIIL(i, false);
            if (!C08MU.LIZLLL(this.LL)) {
                this.LLILLL.getClass();
            }
            ((InterfaceC1526270pov) C808470VnZ.LIZ(InterfaceC1526270pov.class)).reset();
            ((InterfaceC1526270pov) C808470VnZ.LIZ(InterfaceC1526270pov.class)).LJJJJLI();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 106) {
            try {
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(this.LL, 0, "byte_sync_settings");
                String string = sharedPreferencesLIZJ.getString("bd_sync_sdk_prev_version", "");
                String name = C1526230por.class.getName();
                if (!TextUtils.isEmpty(string) && !Objects.equals(string, name)) {
                    ((InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class)).LIZLLL();
                }
                sharedPreferencesLIZJ.edit().putString("bd_sync_sdk_prev_version", name).apply();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[SyncTiggerV4] check version err:");
                sbLIZ.append(th);
                C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (message.what == 101) {
            LIZ(EnumC1526180pom.Init.getValue());
        }
        if (message.what == 102) {
            LIZ(EnumC1526180pom.Switch.getValue());
        }
        if (message.what == 103) {
            try {
                if (((InterfaceC1526030poX) C808470VnZ.LIZ(InterfaceC1526030poX.class)).LJJJJZ() != 1 || (C1526890ppv.LIZJ(this.LL).LIZIZ().LIZJ() && System.currentTimeMillis() - this.LLILZIL > ((long) C1526890ppv.LIZJ(this.LL).LIZIZ().LJIILIIL()) * 1000)) {
                    C1527890prX.LIZJ("[SyncTiggerV4] long link is online, in order for the server to sense that the long link is online, poll package needs to be sent ");
                    ((InterfaceC1525730po3) C808470VnZ.LIZ(InterfaceC1525730po3.class)).LJIILLIIL(EnumC1526180pom.ReConnect.getValue(), false);
                    this.LLILZIL = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1527890prX.LIZIZ(Log.getStackTraceString(th2));
            }
        }
        if (message.what == 105) {
            try {
                ((InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class)).LJIILIIL(System.currentTimeMillis());
                return false;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        return false;
    }
}
