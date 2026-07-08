package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.interfaces.ITemplateMusicService;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0KvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533120KvW {
    public static C07X0 LIZ;
    public static final ConcurrentHashMap<String, InterfaceC533130KvX> LIZIZ = new ConcurrentHashMap<>();

    static {
        LIZJ("effect_platform", new C533220Kvg());
        LIZIZ();
    }

    public static void LIZIZ() {
        final C1877507Wz c1877507Wz;
        C07X0 c07x0 = LIZ;
        if (c07x0 != null) {
            if (c07x0.LIZ != null) {
                LIZJ("music_resource", new AbstractC532930KvD() { // from class: X.0Kv9
                    public final String LIZJ = "WuZhuiDownloader MusicHandler";
                    public final C054G LIZLLL;

                    {
                        C23119094b c23119094bLIZ = C2296908zH.LIZ();
                        C1DFH c1dfh = C0PEM.LIZ;
                        this.LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
                    }

                    @Override // X.AbstractC532930KvD
                    public final String LJ() {
                        return this.LIZJ;
                    }

                    @Override // X.AbstractC532930KvD, X.InterfaceC533130KvX
                    public final void LIZIZ(String str, InterfaceC531800KtO interfaceC531800KtO) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("downloadResource: ");
                        sbLIZ.append(str);
                        LJFF(C2188811AlT.LIZIZ(sbLIZ));
                        C297501Dh c297501Dh = new C297501Dh(str);
                        if (!LJIIIIZZ(c297501Dh, "music_resource", interfaceC531800KtO, str, -10002)) {
                            return;
                        }
                        String str2 = (String) ((LinkedHashMap) c297501Dh.LIZIZ).get("clip_id");
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!LJIIIZ(str2, "clip_id", interfaceC531800KtO, str, -10003)) {
                            return;
                        }
                        ITemplateMusicService iTemplateMusicServiceLIZ = C524940KiK.LIZ();
                        if (iTemplateMusicServiceLIZ == null) {
                            interfaceC531800KtO.onError(str, -1005, "templateMusicService unavailable");
                        } else {
                            C23250099c.LIZLLL(this.LIZLLL, null, null, new C531790KtN(iTemplateMusicServiceLIZ, str2, this, str, interfaceC531800KtO, null), 3);
                        }
                    }
                });
            }
            C07X0 c07x02 = LIZ;
            if (c07x02 != null && (c1877507Wz = c07x02.LIZIZ) != null) {
                LIZJ("url_resource", new AbstractC532930KvD(c1877507Wz) { // from class: X.0Kvc
                    public final C1877507Wz LIZJ;
                    public final String LIZLLL = "WuZhuiDownloader UrlHandler";

                    @Override // X.AbstractC532930KvD
                    public final String LJ() {
                        return this.LIZLLL;
                    }

                    {
                        this.LIZJ = c1877507Wz;
                    }

                    @Override // X.AbstractC532930KvD, X.InterfaceC533130KvX
                    public final void LIZIZ(final String str, final InterfaceC531800KtO interfaceC531800KtO) {
                        C297501Dh c297501Dh = new C297501Dh(str);
                        if (!LJIIIIZZ(c297501Dh, "url_resource", interfaceC531800KtO, str, -10002)) {
                            return;
                        }
                        String str2 = (String) ((LinkedHashMap) c297501Dh.LIZIZ).get("http_url");
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!LJIIIZ(str2, "http_url", interfaceC531800KtO, str, -3001)) {
                            return;
                        }
                        String strLIZ = C08EA.LIZ(str2);
                        if (strLIZ.length() == 0) {
                            interfaceC531800KtO.onError(str, -3001, "File name is empty");
                            return;
                        }
                        if (C123100dR.LIZ("") && !u.LJIIZILJ(strLIZ, "", false)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZ);
                            sbLIZ.append('.');
                            sbLIZ.append("");
                            strLIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        String str3 = this.LIZJ.LIZ;
                        InterfaceC534600Kxu interfaceC534600Kxu = new InterfaceC534600Kxu() { // from class: X.0Kvd
                            @Override // X.InterfaceC534600Kxu
                            public final void LIZ() {
                            }

                            @Override // X.InterfaceC534600Kxu
                            public final void onStart() {
                            }

                            @Override // X.InterfaceC534600Kxu
                            public final void onFailed(String str4) {
                                InterfaceC531800KtO interfaceC531800KtO2 = interfaceC531800KtO;
                                String str5 = str;
                                if (str4 == null) {
                                    str4 = "Download failed";
                                }
                                interfaceC531800KtO2.onError(str5, -3002, str4);
                            }

                            @Override // X.InterfaceC534600Kxu
                            public final void onSuccess(String str4) {
                                LIZLLL(str, str4);
                                interfaceC531800KtO.LJJI(str, str4);
                            }
                        };
                        DownloadTask downloadTaskWith = C2200151B8z.with(C0CHQ.LIZ);
                        downloadTaskWith.url(str2);
                        downloadTaskWith.savePath(str3);
                        downloadTaskWith.name(strLIZ);
                        downloadTaskWith.subThreadListener(new C580800MqE(interfaceC534600Kxu, 1));
                        downloadTaskWith.download();
                    }
                });
                LIZJ("zip_resource", new AbstractC532930KvD(c1877507Wz) { // from class: X.0KvZ
                    public final C1877507Wz LIZJ;
                    public final String LIZLLL = "WuZhuiDownloader ZipHandler";

                    @Override // X.AbstractC532930KvD
                    public final String LJ() {
                        return this.LIZLLL;
                    }

                    {
                        this.LIZJ = c1877507Wz;
                    }

                    @Override // X.AbstractC532930KvD, X.InterfaceC533130KvX
                    public final String LIZJ(String str) {
                        String str2;
                        C297501Dh c297501Dh = new C297501Dh(str);
                        if (!Intrinsics.LJFF(c297501Dh.LIZ, "zip_resource") || (str2 = (String) ((LinkedHashMap) c297501Dh.LIZIZ).get("http_url")) == null || str2.length() == 0) {
                            return "";
                        }
                        String strLIZ = C08EA.LIZ(str2);
                        if (!u.LJIIZILJ(strLIZ, ".zip", false)) {
                            return "";
                        }
                        String strLJJIFFI = u.LJJIFFI(strLIZ, ".zip", "", false);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LIZJ.LIZ);
                        sbLIZ.append(File.separator);
                        sbLIZ.append(strLJJIFFI);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.AbstractC532930KvD, X.InterfaceC533130KvX
                    public final void LIZIZ(final String str, final InterfaceC531800KtO interfaceC531800KtO) {
                        boolean z;
                        C297501Dh c297501Dh = new C297501Dh(str);
                        if (!LJIIIIZZ(c297501Dh, "zip_resource", interfaceC531800KtO, str, -10002)) {
                            return;
                        }
                        final String str2 = (String) ((LinkedHashMap) c297501Dh.LIZIZ).get("http_url");
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!LJIIIZ(str2, "http_url", interfaceC531800KtO, str, -3001)) {
                            return;
                        }
                        final String strLIZ = C08EA.LIZ(str2);
                        if (strLIZ.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            interfaceC531800KtO.onError(str, -3001, "File name is empty");
                            return;
                        }
                        if (!u.LJIIZILJ(strLIZ, "zip", false)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZ);
                            sbLIZ.append(".zip");
                            strLIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        if (!u.LJIIZILJ(strLIZ, ".zip", false)) {
                            interfaceC531800KtO.onError(str, -3001, "Extension must be .zip");
                            return;
                        }
                        String strLJJIFFI = u.LJJIFFI(strLIZ, ".zip", "", false);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(this.LIZJ.LIZ);
                        String str3 = File.separator;
                        sbLIZ2.append(str3);
                        sbLIZ2.append(strLIZ);
                        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(this.LIZJ.LIZ);
                        sbLIZ3.append(str3);
                        sbLIZ3.append(strLJJIFFI);
                        final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        final Application application = C0CHQ.LIZ;
                        final String str4 = this.LIZJ.LIZ;
                        AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.09As
                            @Override // X.InterfaceC300801Eo
                            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                                DownloadTask downloadTaskWith = C2200151B8z.with(application);
                                downloadTaskWith.url(str2);
                                downloadTaskWith.savePath(str4);
                                downloadTaskWith.name(strLIZ);
                                downloadTaskWith.subThreadListener(new C2499809qu((C11KT) interfaceC2329309At, 6));
                                downloadTaskWith.download();
                            }
                        }).LJIIZILJ(new InterfaceC1487280oo2(this) { // from class: X.0Kvz
                            public final /* synthetic */ C533150KvZ LLILLJJLI;

                            {
                                this.LLILLJJLI = this;
                            }

                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj) {
                                final C533150KvZ c533150KvZ = this.LLILLJJLI;
                                final String str5 = str;
                                final String str6 = strLIZIZ2;
                                final String str7 = strLIZIZ;
                                C11LJ c11ljLJIIJJI = AbstractC19486711Lt.LJIIJJI(new InterfaceC781210Ukh() { // from class: X.0Kvy
                                    @Override // X.InterfaceC781210Ukh
                                    public final void run() {
                                        Object c098200Yq;
                                        try {
                                            c098200Yq = C08SA.LIZJ(new C0VSJ(str7), new C0VSJ(str6));
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            c098200Yq = new C098200Yq(th);
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        }
                                        C155000ia.LIZIZ(c098200Yq);
                                        LIZLLL(str5, str6);
                                    }
                                });
                                String str8 = str;
                                C1701890uOB.LIZ(str8, "completionValue is null");
                                return new C19478111Il(c11ljLJIIJJI, null, str8);
                            }
                        }).LJJIJIIJI(C11S5.LIZ()).LIZ(new InterfaceC19474811He<String>() { // from class: X.0Kva
                            @Override // X.InterfaceC19474811He
                            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                            }

                            @Override // X.InterfaceC19474811He
                            public final void onError(Throwable th) {
                                InterfaceC531800KtO interfaceC531800KtO2 = interfaceC531800KtO;
                                String str5 = str;
                                String message = th.getMessage();
                                if (message == null) {
                                    message = "Unknown error";
                                }
                                interfaceC531800KtO2.onError(str5, -4001, message);
                            }

                            @Override // X.InterfaceC19474811He
                            public final void onSuccess(String str5) {
                                interfaceC531800KtO.LJJI(str5, strLIZIZ2);
                            }
                        });
                    }
                });
            }
        }
        LIZJ("material_resource", new C532910KvB());
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_template_aigt_fixed_asset", true, true)) {
            LIZJ("asset", new C532980KvI());
        }
    }

    public static void LIZ(String str, InterfaceC531800KtO interfaceC531800KtO) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WuZhui ResourcerDownloaderManger downLoad: urs = ");
        sbLIZ.append(str);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        C297501Dh c297501Dh = new C297501Dh(str);
        InterfaceC533130KvX interfaceC533130KvX = LIZIZ.get(c297501Dh.LIZ);
        if (interfaceC533130KvX != null) {
            interfaceC533130KvX.LIZIZ(str, interfaceC531800KtO);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("no resource handler for host=");
        sbLIZ2.append(c297501Dh.LIZ);
        interfaceC531800KtO.onError(str, -10004, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LIZJ(String str, AbstractC532930KvD abstractC532930KvD) {
        LIZIZ.put(str, abstractC532930KvD);
    }
}
