package X;

import X.AbstractC21169117sn;
import android.content.Context;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import java.io.File;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.17sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21170317sz<CONTEXT extends AbstractC21169117sn> extends AbstractC21169717st<CONTEXT> {
    public final DownloadAbilityProtocol<CONTEXT> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public long LJIIL;
    public final C01GW LJIILIIL;
    public final C21170417t0 LJIILJJIL;

    @Override // X.InterfaceC21170217sy
    public final String LIZIZ() {
        return "DownloadAbility";
    }

    @Override // X.AbstractC21169717st
    public final void LJI() {
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C21170517t1(this, null), 3);
    }

    @Override // X.AbstractC21169717st
    public final void LJII() {
        DownloadMobProtocol<CONTEXT> downloadMobProtocol = this.LJ;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJI();
        }
    }

    public final C21170717t3 LJIILIIL() {
        return (C21170717t3) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC21170217sy
    public final void cancel() {
        this.LJII.LIZ(this.LIZ.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.17t0] */
    public C21170317sz(final CONTEXT context, DownloadAbilityProtocol<CONTEXT> downloadAbilityProtocol) {
        String strLIZIZ;
        super(context);
        this.LJII = downloadAbilityProtocol;
        if (C289400BVy.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.LJ);
            sbLIZ.append("_download");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = context.LJ;
        }
        this.LJIIIIZZ = strLIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(context.LIZIZ());
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(context.LIZIZ);
        this.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ2);
        this.LJIIJJI = "";
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 440));
        this.LJIILJJIL = new AbsDownloadListener() { // from class: X.17t0
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                super.onCanceled(downloadInfo);
                C21170317sz<CONTEXT> c21170317sz = this.LL;
                c21170317sz.LJII.LJI();
                c21170317sz.LJFF.getClass();
                this.LL.LIZJ(downloadInfo.getTargetFilePath());
                InterfaceC21171017t6 interfaceC21171017t6 = this.LL.LJIILIIL().LIZJ;
                if (interfaceC21171017t6 != null) {
                    interfaceC21171017t6.onCancel();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                C21170317sz<CONTEXT> c21170317sz = this.LL;
                int iLIZ = c21170317sz.LIZJ.LIZ(EnumC19357910oL.DOWNLOAD_TYPE, downloadInfo.getDownloadProcess());
                InterfaceC21171017t6 interfaceC21171017t6 = c21170317sz.LJIILIIL().LIZJ;
                if (interfaceC21171017t6 != null) {
                    interfaceC21171017t6.LIZ();
                }
                InterfaceC21168717sj interfaceC21168717sj = c21170317sz.LIZ.LIZLLL;
                if (interfaceC21168717sj != null) {
                    interfaceC21168717sj.onProgress(iLIZ);
                }
                c21170317sz.LJI.onProgress(iLIZ);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                super.onStart(downloadInfo);
                this.LL.LJIIL = System.currentTimeMillis();
                C21170317sz<CONTEXT> c21170317sz = this.LL;
                DownloadMobProtocol<CONTEXT> downloadMobProtocol = c21170317sz.LJ;
                if (downloadMobProtocol != 0) {
                    downloadMobProtocol.LJIIIZ(c21170317sz.LJIIJJI);
                }
                InterfaceC21171017t6 interfaceC21171017t6 = this.LL.LJIILIIL().LIZJ;
                if (interfaceC21171017t6 != null) {
                    interfaceC21171017t6.onStart();
                }
                this.LL.LJFF.getClass();
                this.LL.getClass();
                C1371690lnb.LIZJ("DownloadAbility", "start");
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
            
                if (r8 < com.bytedance.ies.abmock.SettingsManager.LJ("photo_download_hijack_min_size", 0)) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
            
                X.C2222908nL.LIZJ(r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
            
                if (kotlin.text.u.LJJIIJZLJL(r10.LL.LJIIJJI, "http://", false) == false) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
            
                r10.LL.LJII.LJII(r10);
                r3 = r10.LL;
                r2 = kotlin.text.u.LJJIFFI(r3.LJIIJJI, "http://", "https://", false);
                r1 = X.C2188811AlT.LIZ();
                r1.append(r10.LL.LJIIIIZZ);
                r1.append(r2.LIZIZ);
                r3.LJIIL(r2, X.C2188811AlT.LIZIZ(r1), r2.LIZIZ());
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
            
                if (r8 < 2000) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
            
                if (r8 < 2000) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
            
                onFailed(null, new com.ss.android.socialbase.downloader.exception.BaseException(-1, "Download hijacked"));
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00e3, code lost:
            
                r1 = r10.LL;
                r1.LJ(r6, r1.LJIIJJI);
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
            
                return;
             */
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo r11) {
                /*
                    Method dump skipped, instruction units count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21170417t0.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws BaseException {
                String errorMessage;
                int errorCode;
                String targetFilePath;
                File parentFile;
                long totalBytes;
                super.onFailed(downloadInfo, baseException);
                InterfaceC21171017t6 interfaceC21171017t6 = this.LL.LJIILIIL().LIZJ;
                if (interfaceC21171017t6 != null) {
                    interfaceC21171017t6.onFailed();
                }
                C21170317sz<CONTEXT> c21170317sz = this.LL;
                c21170317sz.LJII.LJI();
                c21170317sz.LJFF.getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                if (baseException == null || (errorMessage = baseException.getErrorMessage()) == null) {
                    errorMessage = "exception is null";
                }
                sbLIZ3.append(errorMessage);
                sbLIZ3.append("    ***  Number of Retries *** :");
                sbLIZ3.append(this.LL.LJIIJ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                if (baseException != null) {
                    errorCode = baseException.getErrorCode();
                } else {
                    errorCode = -1;
                }
                C21170317sz<CONTEXT> c21170317sz2 = this.LL;
                boolean z = true;
                if (c21170317sz2.LJIIJ < c21170317sz2.LJIILIIL().LIZ.size() - 1) {
                    C21170317sz<CONTEXT> c21170317sz3 = this.LL;
                    int i = c21170317sz3.LJIIJ + 1;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("retry!!! [count: ");
                    sbLIZ4.append(i);
                    sbLIZ4.append(" errorMsg: ");
                    sbLIZ4.append(strLIZIZ2);
                    sbLIZ4.append(']');
                    C1371690lnb.LIZIZ("DownloadAbility", C2188811AlT.LIZIZ(sbLIZ4));
                    c21170317sz3.LJIILJJIL(i, errorCode, strLIZIZ2);
                    C21170317sz<CONTEXT> c21170317sz4 = this.LL;
                    c21170317sz4.LJIIJ++;
                    c21170317sz4.LJII.LJII(this);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(this.LL.LJIIIIZZ);
                    sbLIZ5.append(context.LIZIZ);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                    if (baseException == null || baseException.getErrorCode() != 1036) {
                        z = false;
                    }
                    String strLIZIZ4 = "";
                    if (!z) {
                        long jLJIIIIZZ = C2199671B7d.LJIIIIZZ(context.LIZIZ());
                        if (downloadInfo != null) {
                            totalBytes = downloadInfo.getTotalBytes();
                        } else {
                            totalBytes = 16384;
                        }
                        if (jLJIIIIZZ >= totalBytes) {
                            C21170317sz<CONTEXT> c21170317sz5 = this.LL;
                            String str = (String) C13LP.LJJJLZIJ(this.LL.LJIIJ, c21170317sz5.LJIILIIL().LIZ);
                            if (str != null) {
                                strLIZIZ4 = str;
                            }
                            c21170317sz5.LJIIL(strLIZIZ4, strLIZIZ3, context.LIZIZ());
                            return;
                        }
                    }
                    C21170317sz<CONTEXT> c21170317sz6 = this.LL;
                    String str2 = c21170317sz6.LJIIJJI;
                    Context context2 = context.LIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    if (context2 != null) {
                        File fileW2 = C786410Ut5.w2(context2);
                        String path = null;
                        if (fileW2 != null && (parentFile = fileW2.getParentFile()) != null) {
                            path = parentFile.getPath();
                        } else if (C786410Ut5.y2(context2, null) == null) {
                            path = C786410Ut5.W3().getPath();
                        } else {
                            File fileY2 = C786410Ut5.y2(context2, null);
                            if (fileY2 != null) {
                                path = fileY2.getPath();
                            }
                        }
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(path);
                        sbLIZ7.append("/share/");
                        strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ7);
                    }
                    sbLIZ6.append(strLIZIZ4);
                    sbLIZ6.append("tmp/");
                    c21170317sz6.LJIIL(str2, strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ6));
                    return;
                }
                C21170817t4 c21170817t4 = this.LL.LJFF;
                if (baseException != null) {
                    baseException.getErrorCode();
                }
                c21170817t4.getClass();
                this.LL.LJFF.getClass();
                AbstractC21169717st abstractC21169717st = this.LL;
                if (downloadInfo == null || (targetFilePath = downloadInfo.getTargetFilePath()) == null) {
                    targetFilePath = this.LL.LJIIIZ;
                }
                abstractC21169717st.LIZLLL(errorCode, targetFilePath, strLIZIZ2, this.LL.LJIIJJI);
            }
        };
    }

    @Override // X.AbstractC21169717st
    public final void LJIIIZ(String str, String str2) {
        DownloadMobProtocol<CONTEXT> downloadMobProtocol = this.LJ;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJIIJ(str, str2);
        }
    }

    public final void LJIIL(String str, String str2, String str3) {
        boolean zLJI = MethodIDManager.LJI(137680);
        this.LJIIJJI = str;
        this.LJII.LIZJ(str, str2, str3);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIILJJIL(int i, int i2, String str) {
        DownloadMobProtocol<CONTEXT> downloadMobProtocol = this.LJ;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJIIIIZZ(i, i2, str);
        }
    }

    @Override // X.AbstractC21169717st
    public final void LJIIIIZZ(int i, String str, String str2, String str3) {
        DownloadMobProtocol<CONTEXT> downloadMobProtocol = this.LJ;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJII(i, str, str3);
        }
    }
}
