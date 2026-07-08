package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import jv6.a;

/* JADX INFO: renamed from: X.13zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20194113zv extends AbstractC1434490nQt {
    public final VideoPublishEditModel LLILZLL;
    public final Context LLIZ = C786410Ut5.M3(C0CHQ.LIZ);
    public final C20194313zx LLIZLLLIL = new C1BL7() { // from class: X.13zx
        @Override // X.C1BL7
        public final void LIZ() {
        }

        @Override // X.C1BL7
        public final void LIZIZ() {
        }

        @Override // X.C1BL7
        public final void LIZJ() {
        }

        @Override // X.C1BL7
        public final void LIZLLL() {
        }

        @Override // X.C1BL7
        public final void LJ() {
        }
    };

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.VE_CODEC_DOWNLOAD;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.13zx] */
    public C20194113zv(VideoPublishEditModel videoPublishEditModel) {
        this.LLILZLL = videoPublishEditModel;
    }

    public final void LJIILJJIL(C1431070nLN c1431070nLN) {
        try {
            LoadSoLancet.LIZJ("bytevc1enc10b");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("bytevc1enc10b");
            LoadSoLancet.LJ(jUptimeMillis, "bytevc1enc10b");
            LoadSoLancet.LIZLLL(jUptimeMillis, "bytevc1enc10b");
            LoadSoLancet.LIZIZ("bytevc1enc10b");
            LoadSoLancet.LIZJ("vebytevc1enc10bwrapper");
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            Librarian.LJFF("vebytevc1enc10bwrapper");
            LoadSoLancet.LJ(jUptimeMillis2, "vebytevc1enc10bwrapper");
            LoadSoLancet.LIZLLL(jUptimeMillis2, "vebytevc1enc10bwrapper");
            LoadSoLancet.LIZIZ("vebytevc1enc10bwrapper");
            C201955140j.LIZ("VECodecDownloadTask -> VECodec loadLibrary: libbytevc1enc10b.so and libvebytevc1enc10bwrapper Success");
            this.LLILZLL.creativeModel.hdrModel.veCodecIsReady = true;
            c1431070nLN.LJ(null, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZLL.creativeModel.hdrModel.veCodecIsReady = false;
            c1431070nLN.LJ(null, true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VECodecDownloadTask -> VECodec loadLibrary: libbytevc1enc10b.so and libvebytevc1enc10bwrapper failed, error: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", cause = ");
            sbLIZ.append(th.getCause());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, final C1431070nLN c1431070nLN) {
        int i;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_HDR_full_link", true, false) && ((i = this.LLILZLL.creativeModel.hdrModel.videoCodeType) == 67 || i == 2084)) {
            final IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            try {
                if (iPluginService.checkPluginInstalled("com.ss.android.ugc.ve.codec")) {
                    C201955140j.LIZ("VECodecDownloadTask -> VECodec Plugin has been installed");
                    if (iPluginService.LIZLLL() != null) {
                        a.install(this.LLIZ);
                        LJIILJJIL(c1431070nLN);
                        return;
                    }
                    return;
                }
                C201955140j.LIZ("VECodecDownloadTask -> start install");
                C844020X9c c844020X9c = new C844020X9c();
                c844020X9c.LIZIZ = false;
                c844020X9c.LIZ = "com.ss.android.ugc.ve.codec";
                AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                anonymousClass1403.LIZIZ = false;
                anonymousClass1403.LIZJ = false;
                anonymousClass1403.LIZLLL = false;
                anonymousClass1403.LJIIIZ = false;
                anonymousClass1403.LJIIJ = this.LLIZLLLIL;
                c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
                c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.13zw
                    @Override // X.InterfaceC842850X4p
                    public final void LIZJ(String str, boolean z) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VECodecDownloadTask -> VECodec plugin install success, packageName is ");
                        sbLIZ.append(str);
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        try {
                            if (iPluginService.LIZLLL() != null) {
                                C20194113zv c20194113zv = this;
                                C1431070nLN c1431070nLN2 = c1431070nLN;
                                C1BLW.LIZIZ(str, true);
                                a.install(c20194113zv.LLIZ);
                                c20194113zv.LJIILJJIL(c1431070nLN2);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c1431070nLN.LJ(null, true);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("VECodecDownloadTask -> VECodec plugin onPluginInstallSuccess callback failed");
                            sbLIZ2.append(th.getMessage());
                            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }

                    @Override // X.InterfaceC842850X4p
                    public final void LIZ(int i2, String str, boolean z) {
                        if (iPluginService.LIZLLL() != null) {
                            C1BLW.LIZIZ(str, false);
                        }
                        c1431070nLN.LJ(null, true);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VECodecDownloadTask -> VECodec plugin download failed, reason = ");
                        sbLIZ.append(i2);
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
                iPluginService.LJJI(new C202068144s(c844020X9c));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1431070nLN.LJ(null, true);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VECodecDownloadTask -> VECodecPluginInstallTask run failed ");
                sbLIZ.append(th.getMessage());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        C201955140j.LIZ("VECodecDownloadTask -> don't need to download vecodec");
        c1431070nLN.LJ(null, true);
    }
}
