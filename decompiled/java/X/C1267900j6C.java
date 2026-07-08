package X;

import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0j6C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267900j6C extends C1267910j6D {
    public final WeakReference<TEBundle> LLILLJJLI;
    public final WeakReference<TEBundle> LLILLL;
    public final TEBundle LLILZ;
    public C1269160j8E LLILZIL;
    public boolean LLILZLL;

    @Override // X.C1267910j6D, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        this.LLILZLL = true;
        this.LLILZ.release();
        super.release();
    }

    public C1267900j6C(TEBundle tEBundle, InterfaceC1267920j6E interfaceC1267920j6E) {
        super(interfaceC1267920j6E);
        this.LLILLJJLI = new WeakReference<>(tEBundle);
        this.LLILLL = new WeakReference<>(null);
        this.LLILZ = new TEBundle();
    }

    @Override // X.C1267910j6D, com.ss.ttlivestreamer.core.strategy.LiveAbstractStrategy
    public final void onInfo(int i, int i2, int i3) {
        TEBundle tEBundle;
        TEBundle tEBundle2;
        TEBundle tEBundle3;
        if (!this.LLILZLL && i == 1 && i2 == 1) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        this.LLILZ.setLong("settings_log_interval", 10L);
                        this.LLILZ.setBool("settings_auto_brighten", false);
                        AVLog.disableLogFile(true);
                        AVLog.disableLogIODevice(true);
                        AVLog.disableKibanaLogs(true);
                        WeakReference<TEBundle> weakReference = this.LLILLJJLI;
                        if (weakReference != null && (tEBundle3 = weakReference.get()) != null) {
                            tEBundle3.setBool("estream_psnr_enable", false);
                            tEBundle3.setBool("estream_siti_enable", false);
                            tEBundle3.setBool("estream_transport_delay_enable", false);
                        }
                    }
                } else {
                    this.LLILZ.setLong("settings_log_interval", 5L);
                    this.LLILZ.setBool("settings_auto_brighten", false);
                    AVLog.disableLogFile(true);
                    AVLog.disableLogIODevice(true);
                    AVLog.disableKibanaLogs(false);
                    WeakReference<TEBundle> weakReference2 = this.LLILLJJLI;
                    if (weakReference2 != null && (tEBundle2 = weakReference2.get()) != null) {
                        tEBundle2.setBool("estream_psnr_enable", false);
                        tEBundle2.setBool("estream_siti_enable", false);
                        tEBundle2.setBool("estream_transport_delay_enable", false);
                    }
                }
            } else {
                AVLog.disableLogFile(false);
                AVLog.disableLogIODevice(false);
                AVLog.disableKibanaLogs(false);
                this.LLILZ.setLong("settings_log_interval", 5L);
                this.LLILZ.setBool("settings_auto_brighten", true);
                WeakReference<TEBundle> weakReference3 = this.LLILLJJLI;
                if (weakReference3 != null && this.LLILZIL != null && (tEBundle = weakReference3.get()) != null) {
                    tEBundle.setBool("estream_psnr_enable", this.LLILZIL.LIZ.LJIILL());
                    tEBundle.setBool("estream_siti_enable", false);
                    tEBundle.setBool("estream_transport_delay_enable", true);
                }
            }
            InterfaceC1267920j6E interfaceC1267920j6E = this.LL;
            if (interfaceC1267920j6E != null) {
                TEBundle tEBundle4 = this.LLILLJJLI.get();
                this.LLILLL.get();
                TEBundle tEBundle5 = this.LLILZ;
                C1266350j3h c1266350j3h = (C1266350j3h) interfaceC1267920j6E;
                if (tEBundle4 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLiveOptionChanged:Encode:");
                    sbLIZ.append(tEBundle4.toString());
                    AVLog.logKibana(5, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
                    c1266350j3h.LLJIJIL.setParameter(tEBundle4);
                }
                if (tEBundle5 != null && tEBundle5.contains("settings_auto_brighten")) {
                    tEBundle5.getBool("settings_auto_brighten");
                    InterfaceC1268640j7O interfaceC1268640j7O = c1266350j3h.LLJLILLLLZIIL;
                    if (interfaceC1268640j7O != null) {
                        interfaceC1268640j7O.LJJIII();
                    }
                }
            }
        }
    }
}
