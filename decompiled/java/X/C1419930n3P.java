package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.PairBoolLong;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecPairBoolLong;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMediaService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0n3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419930n3P extends IMetaInfoDelegate {
    public final Context LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(321));

    public final C369601c6 LIZIZ() {
        return (C369601c6) this.LIZIZ.getValue();
    }

    public C1419930n3P(Context context) {
        this.LIZ = context;
    }

    public static boolean LIZ(Meta meta) {
        s sVar = s.LIZ;
        String strLIZLLL = meta.LIZLLL();
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        int iLJ = (int) meta.LJ();
        int iLIZJ = (int) meta.LIZJ();
        sVar.getClass();
        return !s.LJJJ(iLJ, iLIZJ, false, strLIZLLL, 0L);
    }

    public static CreativeInfo LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutMetaInfoDelegate getCreativeInfo: extra = ");
        sbLIZ.append(str);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        try {
            CreativeInfo creativeInfo = (CreativeInfo) new Gson().LJII(str, CreativeInfo.class);
            if (creativeInfo == null) {
                C1417710mzp.LIZ(LogLevel.LEVEL_ERROR, "AutoCutMetaInfoDelegate failed to parse creativeInfo from extra");
                return creativeInfo;
            }
            return creativeInfo;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1417710mzp.LIZ(LogLevel.LEVEL_ERROR, "AutoCutMetaInfoDelegate failed to parse creativeInfo from extra");
            return null;
        }
    }

    public static String LIZJ(Meta meta, CreativeInfo creativeInfo) {
        s sVar = s.LIZ;
        String strLIZLLL = meta.LIZLLL();
        long jLIZIZ = meta.LIZIZ();
        boolean zLJFF = meta.LJFF();
        int iLJ = (int) meta.LJ();
        int iLIZJ = (int) meta.LIZJ();
        sVar.getClass();
        return s.LJIILJJIL(strLIZLLL, jLIZIZ, zLJFF, creativeInfo, iLJ, iLIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    @Override // com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.smartmovie.jni.PictureInfo extractorFrame(com.bytedance.ies.smartmovie.jni.UploadInfo r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419930n3P.extractorFrame(com.bytedance.ies.smartmovie.jni.UploadInfo, java.lang.String):com.bytedance.ies.smartmovie.jni.PictureInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    @Override // com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.smartmovie.jni.Meta getCompressMetaInfo(com.bytedance.ies.smartmovie.jni.Meta r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419930n3P.getCompressMetaInfo(com.bytedance.ies.smartmovie.jni.Meta, java.lang.String):com.bytedance.ies.smartmovie.jni.Meta");
    }

    @Override // com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate
    public final VecPairBoolLong getFrameTimeStamps(long j, VecMeta vecMeta, long j2) {
        Integer numValueOf;
        int size;
        Meta meta;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFrameTimeStamps: index = ");
        sbLIZ.append(j);
        sbLIZ.append(", metaList size = ");
        if (vecMeta != null) {
            numValueOf = Integer.valueOf(vecMeta.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", frameCount = ");
        sbLIZ.append(j2);
        C2188811AlT.LIZIZ(sbLIZ);
        VecPairBoolLong vecPairBoolLong = new VecPairBoolLong();
        if (vecMeta == null || (size = vecMeta.size()) == 0 || j >= size || (meta = (Meta) C13LP.LJJJLZIJ((int) j, vecMeta)) == null) {
            return vecPairBoolLong;
        }
        meta.LIZIZ();
        if (j >= 6) {
            z = true;
        } else {
            z = false;
        }
        vecPairBoolLong.LIZJ(new PairBoolLong(SmartMovieJniJNI.new_PairBoolLong__SWIG_1(z, 0L), true));
        return vecPairBoolLong;
    }

    @Override // com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate
    public final void compressMeta(final Meta meta, String str, boolean z, final CommonRequestCallback commonRequestCallback) throws Throwable {
        String strLIZLLL;
        int i;
        int i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutMetaInfoDelegate compressImage: path = ");
        String str2 = "";
        if (meta == null || (strLIZLLL = meta.LIZLLL()) == null) {
            strLIZLLL = "";
        }
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(", extra = ");
        sbLIZ.append(str);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        CreativeInfo creativeInfoLIZLLL = LIZLLL(str);
        if (creativeInfoLIZLLL == null) {
            if (commonRequestCallback != null) {
                commonRequestCallback.onFailure(SmartMovieErrorCode.COMPRESS_FAILURE.swigValue(), "failed to parse creativeInfo from extra", new UnorderedMapStrStr());
                return;
            }
            return;
        }
        if (meta != null) {
            String strLIZLLL2 = meta.LIZLLL();
            boolean z2 = true;
            if (strLIZLLL2 == null || strLIZLLL2.length() != 0) {
                final String strLIZJ = LIZJ(meta, creativeInfoLIZLLL);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AutoCutMetaInfoDelegate, compressMeta, resizePath = ");
                sbLIZ2.append(strLIZJ);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                try {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    s sVar = s.LIZ;
                    String strLIZLLL3 = meta.LIZLLL();
                    if (strLIZLLL3 == null) {
                        strLIZLLL3 = "";
                    }
                    long jLIZIZ = meta.LIZIZ();
                    sVar.getClass();
                    sbLIZ3.append(s.LJIJ(jLIZIZ, strLIZLLL3));
                    sbLIZ3.append("_isMix=");
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    sbLIZ3.append(i);
                    final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    if (C2286708xd.LIZJ(strLIZJ)) {
                        LIZIZ().LIZJ(strLIZIZ, strLIZJ);
                        if (commonRequestCallback != null) {
                            commonRequestCallback.onSuccess(strLIZJ);
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("hit cache, path=");
                        sbLIZ4.append(meta.LIZLLL());
                        sbLIZ4.append(", resizePath=");
                        sbLIZ4.append(strLIZJ);
                        C2188811AlT.LIZIZ(sbLIZ4);
                    } else {
                        if (!z) {
                            String strLIZ = LIZIZ().LIZ(strLIZIZ);
                            if (C2286708xd.LIZJ(strLIZ)) {
                                C2471909mP.LIZJ(strLIZ, strLIZJ);
                                if (commonRequestCallback != null) {
                                    commonRequestCallback.onSuccess(strLIZJ);
                                }
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("hit cache, mixKey=");
                                sbLIZ5.append(strLIZIZ);
                                sbLIZ5.append(", resizePath=");
                                sbLIZ5.append(strLIZJ);
                                C2188811AlT.LIZIZ(sbLIZ5);
                                return;
                            }
                        }
                        String strLIZ2 = LIZIZ().LIZ(strLIZIZ);
                        if (C2286708xd.LIZJ(strLIZ2)) {
                            C2471909mP.LIZJ(strLIZ2, strLIZJ);
                            if (commonRequestCallback != null) {
                                commonRequestCallback.onSuccess(strLIZJ);
                            }
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("hit cache, notMixKey=");
                            sbLIZ6.append(strLIZIZ);
                            sbLIZ6.append(", resizePath=");
                            sbLIZ6.append(strLIZJ);
                            C2188811AlT.LIZIZ(sbLIZ6);
                            return;
                        }
                        final long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (!meta.LJFF()) {
                            if (LIZ(meta)) {
                                String strLIZLLL4 = meta.LIZLLL();
                                if (strLIZLLL4 == null) {
                                    strLIZLLL4 = "";
                                }
                                C2471909mP.LIZJ(strLIZLLL4, strLIZJ);
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("AutoCutMetaInfoDelegate compressMeta: image. FastImportImage cost=");
                                sbLIZ7.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                                C2188811AlT.LIZIZ(sbLIZ7);
                            } else {
                                ITemplateMediaService iTemplateMediaService = (ITemplateMediaService) ServiceManager.get().getService(ITemplateMediaService.class);
                                Context context = this.LIZ;
                                String strLIZLLL5 = meta.LIZLLL();
                                if (strLIZLLL5 == null) {
                                    strLIZLLL5 = "";
                                }
                                iTemplateMediaService.LIZIZ(context, strLIZLLL5, strLIZJ, C096Y.IMAGE, new C096W(0));
                                LIZIZ().LIZJ(strLIZIZ, strLIZJ);
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("AutoCutMetaInfoDelegate compressMeta: image. compress cost=");
                                sbLIZ8.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                                C2188811AlT.LIZIZ(sbLIZ8);
                                z2 = false;
                            }
                            if (!C2286708xd.LIZJ(strLIZJ)) {
                                if (commonRequestCallback != null) {
                                    if (z2) {
                                        i2 = 1011;
                                    } else {
                                        i2 = 1012;
                                    }
                                    C1417710mzp c1417710mzp = C1417710mzp.LIZ;
                                    MetaExt metaExtLIZIZ = C1418020n0K.LIZIZ(meta);
                                    c1417710mzp.getClass();
                                    commonRequestCallback.onFailure(i2, C1417710mzp.LJI(metaExtLIZIZ), new UnorderedMapStrStr());
                                }
                            } else if (commonRequestCallback != null) {
                                commonRequestCallback.onSuccess(strLIZJ);
                            }
                        } else {
                            String strLIZLLL6 = meta.LIZLLL();
                            int iLJ = (int) meta.LJ();
                            int iLIZJ = (int) meta.LIZJ();
                            long jLIZIZ2 = meta.LIZIZ();
                            sVar.getClass();
                            try {
                                if (s.LJJJ(iLJ, iLIZJ, true, strLIZLLL6, jLIZIZ2)) {
                                    Pair pairLJIJJ = s.LJIJJ((int) meta.LIZIZ(), z);
                                    int[] iArr = (int[]) pairLJIJJ.getFirst();
                                    int[] iArr2 = (int[]) pairLJIJJ.getSecond();
                                    ITemplateMediaService iTemplateMediaService2 = (ITemplateMediaService) ServiceManager.get().getService(ITemplateMediaService.class);
                                    Context context2 = this.LIZ;
                                    String strLIZLLL7 = meta.LIZLLL();
                                    if (strLIZLLL7 == null) {
                                        strLIZLLL7 = "";
                                    }
                                    iTemplateMediaService2.LIZIZ(context2, strLIZLLL7, strLIZJ, C096Y.VIDEO, new C23177096h(s.LJIIL(creativeInfoLIZLLL), iArr, iArr2, new InterfaceC352560Dry() { // from class: X.0n3F
                                        @Override // X.InterfaceC352560Dry
                                        public final void LIZJ(C352570Drz c352570Drz) {
                                        }

                                        @Override // X.InterfaceC352560Dry
                                        public final void onProgress(float f) {
                                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                            sbLIZ9.append("AutoCutMetaInfoDelegate compressImage: path = ");
                                            String strLIZLLL8 = meta.LIZLLL();
                                            if (strLIZLLL8 == null) {
                                                strLIZLLL8 = "";
                                            }
                                            sbLIZ9.append(strLIZLLL8);
                                            sbLIZ9.append(", progress = ");
                                            sbLIZ9.append(f);
                                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ9));
                                        }

                                        @Override // X.InterfaceC352560Dry
                                        public final void LIZIZ(String str3, String str4) {
                                            C2473009ma c2473009ma = C2473009ma.LIZ;
                                            C0VSJ c0vsj = new C0VSJ(str4);
                                            c2473009ma.getClass();
                                            C2473009ma.LJIIIIZZ(c0vsj);
                                        }

                                        @Override // X.InterfaceC352560Dry
                                        public final void LJJI(String str3, String str4) {
                                            String strLJJIFFI = u.LJJIFFI(str4, "//", "/", false);
                                            this.LIZIZ().LIZJ(strLIZIZ, strLJJIFFI);
                                            if (!Intrinsics.LJFF(strLJJIFFI, strLIZJ)) {
                                                CommonRequestCallback commonRequestCallback2 = commonRequestCallback;
                                                if (commonRequestCallback2 != null) {
                                                    commonRequestCallback2.onFailure(SmartMovieErrorCode.COMPRESS_FAILURE.swigValue(), "path of compressed video != dst resizePath", new UnorderedMapStrStr());
                                                }
                                            } else if (!C2286708xd.LIZJ(strLIZJ)) {
                                                CommonRequestCallback commonRequestCallback3 = commonRequestCallback;
                                                if (commonRequestCallback3 != null) {
                                                    C1417710mzp c1417710mzp2 = C1417710mzp.LIZ;
                                                    MetaExt metaExtLIZIZ2 = C1418020n0K.LIZIZ(meta);
                                                    c1417710mzp2.getClass();
                                                    commonRequestCallback3.onFailure(1013, C1417710mzp.LJI(metaExtLIZIZ2), new UnorderedMapStrStr());
                                                }
                                            } else {
                                                CommonRequestCallback commonRequestCallback4 = commonRequestCallback;
                                                if (commonRequestCallback4 != null) {
                                                    commonRequestCallback4.onSuccess(strLJJIFFI);
                                                }
                                            }
                                            C1419930n3P c1419930n3P = this;
                                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                            sbLIZ9.append("AutoCutMetaInfoDelegate compressMeta: video.compress cost=");
                                            sbLIZ9.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                                            C2188811AlT.LIZIZ(sbLIZ9);
                                            c1419930n3P.getClass();
                                        }

                                        @Override // X.InterfaceC352560Dry
                                        public final void LIZ(String str3, String str4, String str5) {
                                            C2473009ma c2473009ma = C2473009ma.LIZ;
                                            C0VSJ c0vsj = new C0VSJ(str4);
                                            c2473009ma.getClass();
                                            C2473009ma.LJIIIIZZ(c0vsj);
                                            CommonRequestCallback commonRequestCallback2 = commonRequestCallback;
                                            if (commonRequestCallback2 != null) {
                                                int iSwigValue = SmartMovieErrorCode.COMPRESS_FAILURE.swigValue();
                                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                sbLIZ9.append("compress video failure, errorInfo = ");
                                                sbLIZ9.append(str5);
                                                commonRequestCallback2.onFailure(iSwigValue, C2188811AlT.LIZIZ(sbLIZ9), new UnorderedMapStrStr());
                                            }
                                        }
                                    }));
                                } else {
                                    String strLIZLLL8 = meta.LIZLLL();
                                    if (strLIZLLL8 == null) {
                                        strLIZLLL8 = "";
                                    }
                                    C2471909mP.LIZJ(strLIZLLL8, strLIZJ);
                                    if (!C2286708xd.LIZJ(strLIZJ)) {
                                        if (commonRequestCallback != null) {
                                            C1417710mzp c1417710mzp2 = C1417710mzp.LIZ;
                                            MetaExt metaExtLIZIZ2 = C1418020n0K.LIZIZ(meta);
                                            c1417710mzp2.getClass();
                                            commonRequestCallback.onFailure(1014, C1417710mzp.LJI(metaExtLIZIZ2), new UnorderedMapStrStr());
                                        }
                                    } else if (commonRequestCallback != null) {
                                        commonRequestCallback.onSuccess(strLIZJ);
                                    }
                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                    sbLIZ9.append("AutoCutMetaInfoDelegate compressMeta: video. FastImportVideo cost=");
                                    sbLIZ9.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                                    C2188811AlT.LIZIZ(sbLIZ9);
                                }
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                if (commonRequestCallback != null) {
                                    int iSwigValue = SmartMovieErrorCode.COMPRESS_FAILURE.swigValue();
                                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                    sbLIZ10.append("failed to compress file, msg = ");
                                    String message = e.getMessage();
                                    if (message != null) {
                                        str2 = message;
                                    }
                                    sbLIZ10.append(str2);
                                    commonRequestCallback.onFailure(iSwigValue, C2188811AlT.LIZIZ(sbLIZ10), new UnorderedMapStrStr());
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutMetaInfoDelegate compressMeta:. total cost=" + (System.currentTimeMillis() - jCurrentTimeMillis));
                return;
            }
        }
        if (commonRequestCallback != null) {
            commonRequestCallback.onFailure(SmartMovieErrorCode.COMPRESS_FAILURE.swigValue(), "empty media path", new UnorderedMapStrStr());
        }
    }
}
