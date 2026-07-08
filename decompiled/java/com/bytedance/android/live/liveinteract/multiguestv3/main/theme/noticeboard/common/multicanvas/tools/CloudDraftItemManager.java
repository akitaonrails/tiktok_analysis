package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools;

import X.AbstractC19484711Kz;
import X.C09CT;
import X.C09JN;
import X.C0VSJ;
import X.C0VSV;
import X.C11HW;
import X.C11IU;
import X.C11KS;
import X.C11QJ;
import X.C11S5;
import X.C13BV;
import X.C15438062q;
import X.C1701940uOG;
import X.C176600m4;
import X.C19480011Je;
import X.C19482011Jy;
import X.C2188811AlT;
import X.C480460Ism;
import X.C516201zk;
import X.C517301zv;
import X.C786410Ut5;
import X.C916750Zxp;
import X.C917840Zza;
import X.C953230auf;
import X.C953290aul;
import X.C953770avX;
import X.C987170bnP;
import X.InterfaceC1487280oo2;
import X.InterfaceC300801Eo;
import X.InterfaceC915550Zvt;
import X.InterfaceC971680bOQ;
import Y.AkS105S1100000_15;
import Y.AkS42S1000000_15;
import Y.AkS477S0100000_15;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.HandlerThread;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardMaterialContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardMaterialContentResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS2S2200100_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.text.a0;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public final class CloudDraftItemManager {
    public static final BPEAHandler LIZ;
    public static final ConcurrentHashMap<String, C917840Zza> LIZIZ;
    public static final ConcurrentHashMap<Long, Boolean> LIZJ;
    public static final ConcurrentHashMap<Long, C917840Zza> LIZLLL;
    public static final ConcurrentHashMap<Long, List<InterfaceC915550Zvt>> LJ;
    public static final ConcurrentHashMap<Long, C953770avX> LJFF;

    static {
        HandlerThread handlerThread = new HandlerThread("CloudDraftItemManager_Noticeboard");
        handlerThread.start();
        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        LIZ = bPEAHandler;
        C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0auG
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CloudDraftItemManager@9865.<init>$1");
                try {
                    File fileFM2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).fM2("Cloud", false);
                    MultiCanvasUtils.LIZ.getClass();
                    MultiCanvasUtils.LJII(fileFM2);
                    MultiCanvasUtils.LJII(((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).fM2("Template", false));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CloudDraftItemManager@9865.<init>$1");
            }
        });
        LIZIZ = new ConcurrentHashMap<>();
        LIZJ = new ConcurrentHashMap<>();
        LIZLLL = new ConcurrentHashMap<>();
        LJ = new ConcurrentHashMap<>();
        LJFF = new ConcurrentHashMap<>();
    }

    public static void LIZ(InterfaceC915550Zvt interfaceC915550Zvt) {
        C176600m4.LIZJ(new AwS559S0100000_15(interfaceC915550Zvt, 356));
    }

    public static String LIZLLL(String str) {
        String absolutePath;
        try {
            File parentFile = new C0VSJ(str).getParentFile();
            if (parentFile == null || (absolutePath = parentFile.getAbsolutePath()) == null) {
                return "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(absolutePath);
            sbLIZ.append("/thumbnail.png");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            if (bitmapDecodeFile != null) {
                float f = 212;
                float width = bitmapDecodeFile.getWidth();
                float f2 = f / width;
                float height = bitmapDecodeFile.getHeight();
                float f3 = f / height;
                if (f2 < f3) {
                    f2 = f3;
                }
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, (int) (width * f2), (int) (height * f2), true);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, (bitmapCreateScaledBitmap.getWidth() - 212) / 2, (bitmapCreateScaledBitmap.getHeight() - 212) / 2, 212, 212);
                C0VSV c0vsv = new C0VSV(strLIZIZ);
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
                c0vsv.flush();
                c0vsv.close();
            }
            return strLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static C11HW LJ(C916750Zxp c916750Zxp) {
        C19482011Jy c19482011JyLJIL;
        C11IU c11iu = new C11IU(AbstractC19484711Kz.LJII(new C987170bnP(c916750Zxp, 4)), C11QJ.LL.LJIILJJIL(C1701940uOG.LIZ(LIZ.getLooper())));
        long j = c916750Zxp.LIZIZ;
        if (j > 0) {
            C953230auf.LIZ.getClass();
            c19482011JyLJIL = C953230auf.LJIIIIZZ(j).LJIIL(new C516201zk(c916750Zxp, 23)).LJIL(new InterfaceC1487280oo2() { // from class: X.00Gp
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    NoticeboardTemplate noticeboardTemplate = (NoticeboardTemplate) obj;
                    return new Pair(noticeboardTemplate.mediaNodeId, noticeboardTemplate.convertNoticeboardMaterialInfo);
                }
            });
        } else {
            C480460Ism.LIZ().getClass();
            INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
            GetNoticeboardMaterialContentParams getNoticeboardMaterialContentParams = new GetNoticeboardMaterialContentParams();
            getNoticeboardMaterialContentParams.mediaNodeId = c916750Zxp.LIZJ;
            getNoticeboardMaterialContentParams.templateId = c916750Zxp.LIZIZ;
            c19482011JyLJIL = iNoticeboardApi.getNoticeboardMaterial(getNoticeboardMaterialContentParams).LJIIL(new C09JN() { // from class: X.00Sq
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str;
                    C1C7U.LIZ("CloudDraftItemManager@9865.prepareDraftRecord$5");
                    Throwable th = (Throwable) obj;
                    if (th instanceof C477520Io2) {
                        str = ((C477520Io2) th).getxTtLogId();
                    } else {
                        str = "";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("prepareDraft api call fail throwable=");
                    sbLIZ.append(th);
                    sbLIZ.append(" logId=");
                    sbLIZ.append(str);
                    C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("CloudDraftItemManager@9865.prepareDraftRecord$5");
                }
            }).LJIL(new InterfaceC1487280oo2() { // from class: X.00Gl
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    GetNoticeboardMaterialContentResponse.ResponseData responseData = (GetNoticeboardMaterialContentResponse.ResponseData) ((BaseResponse) obj).data;
                    return new Pair(responseData.mediaNodeId, responseData.convertNoticeboardMaterialInfo);
                }
            });
        }
        return c11iu.LJJIFFI(c19482011JyLJIL.LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0auE
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Pair pair = (Pair) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepareDraft api call success resp=");
                sbLIZ.append(pair);
                C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", C2188811AlT.LIZIZ(sbLIZ));
                String str = (String) pair.getFirst();
                ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = (ConvertNoticeboardMaterialInfo) pair.getSecond();
                if (convertNoticeboardMaterialInfo != null) {
                    BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
                    return AbstractC19484711Kz.LJJIZ(CloudDraftItemManager.LIZIZ(str, convertNoticeboardMaterialInfo.backgroundImageUrl, "background", "Cloud"), CloudDraftItemManager.LIZIZ(str, convertNoticeboardMaterialInfo.coverImageUrl, "cover", "Cloud"), CloudDraftItemManager.LIZIZ(str, convertNoticeboardMaterialInfo.configJsonUrl, "config", "Cloud").LJIIZILJ(new AkS42S1000000_15(str, 1)), C952990auH.LIZ);
                }
                throw new C294201Ca() { // from class: X.0auF
                    public static final int $stable = 8;
                };
            }
        }).LJIL(new InterfaceC1487280oo2() { // from class: X.0ZzZ
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C443120HZe c443120HZe = (C443120HZe) obj;
                String str = (String) c443120HZe.getFirst();
                String str2 = (String) c443120HZe.getSecond();
                String str3 = (String) ((C443120HZe) c443120HZe.getThird()).getFirst();
                CloudDraftItemManager.CloudDraftConfig cloudDraftConfig = (CloudDraftItemManager.CloudDraftConfig) ((C443120HZe) c443120HZe.getThird()).getSecond();
                BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
                return new C917840Zza(str, str2, str3, cloudDraftConfig, CloudDraftItemManager.LIZLLL((String) c443120HZe.getSecond()), (String) ((C443120HZe) c443120HZe.getThird()).getThird());
            }
        }).LJIL(new AkS477S0100000_15(c916750Zxp, 6)).LJIIL(new C09JN() { // from class: X.00Qg
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CloudDraftItemManager@9865.prepareDraftRecord$10");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepareDraftItem throwable=");
                sbLIZ.append(obj);
                C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("CloudDraftItemManager@9865.prepareDraftRecord$10");
            }
        }));
    }

    public static C19482011Jy LJIIIZ(C953770avX c953770avX) {
        String str = c953770avX.LJII;
        return AbstractC19484711Kz.LJIJJLI(Unit.LIZ).LJIL(new AkS105S1100000_15(c953770avX, str, 1)).LJIL(new AkS42S1000000_15(str, 3)).LJIL(new AkS105S1100000_15(c953770avX, str, 2));
    }

    public static final class CloudDraftConfig {

        @C09CT("labels")
        public final List<Label> labels;

        @C09CT("node_id")
        public final String nodeId;

        public CloudDraftConfig(String str, List<Label> list) {
            this.nodeId = str;
            this.labels = list;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:12:0x001d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZJ(final java.lang.String r5, final java.lang.String r6) throws java.lang.Throwable {
        /*
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r5)
            X.0VSV r3 = new X.0VSV     // Catch: java.lang.Exception -> L25
            r3.<init>(r6)     // Catch: java.lang.Exception -> L25
            r2 = 0
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L15
            r0 = 100
            r4.compress(r1, r0, r3)     // Catch: java.lang.Throwable -> L15
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L25
            return
        L15:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1a
        L1a:
            r0 = move-exception
            r2 = r1
            goto L1e
        L1d:
            r0 = move-exception
        L1e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1d
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L25
            throw r0     // Catch: java.lang.Exception -> L25
        L25:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.09FE r1 = new X.09FE
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r5, r6, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager.LIZJ(java.lang.String, java.lang.String):void");
    }

    public static C19482011Jy LJIIIIZZ(NLEEditor nLEEditor, C953770avX c953770avX) {
        String str = c953770avX.LJII;
        return AbstractC19484711Kz.LJIJJLI(Unit.LIZ).LJIL(new AkS105S1100000_15(nLEEditor, str, 3)).LJIL(new AkS42S1000000_15(str, 4)).LJIL(new AkS105S1100000_15(c953770avX, str, 4));
    }

    public static C11KS LIZIZ(final String str, final String str2, final String str3, final String str4) {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0pK7
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                String str5 = str2;
                if (str5 == null) {
                    C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", "download remote url is empty");
                    interfaceC2329309At.onError(new C294201Ca() { // from class: X.0pKA
                        public static final int $stable = 8;
                    });
                    return;
                }
                BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
                try {
                    final String strLJJLJ = a0.LJJLJ('.', new URL(str5).getPath(), "");
                    IHostMultiCanvas iHostMultiCanvas = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str4);
                    sbLIZ.append('/');
                    sbLIZ.append(str);
                    sbLIZ.append('/');
                    final File fileFM2 = iHostMultiCanvas.fM2(C2188811AlT.LIZIZ(sbLIZ), false);
                    fileFM2.mkdirs();
                    DownloadTask downloadTaskWith = C2200151B8z.with(C497740JfY.LJII());
                    downloadTaskWith.url(str2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str3);
                    sbLIZ2.append('.');
                    sbLIZ2.append(strLJJLJ);
                    downloadTaskWith.name(C2188811AlT.LIZIZ(sbLIZ2));
                    downloadTaskWith.savePath(fileFM2.getAbsolutePath());
                    downloadTaskWith.retryCount(3);
                    downloadTaskWith.autoRemoveCallback(true);
                    final String str6 = str3;
                    final C11KT c11kt = (C11KT) interfaceC2329309At;
                    downloadTaskWith.subThreadListener(new IDownloadListener() { // from class: X.0pK8
                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onCanceled(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFirstStart(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFirstSuccess(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onPause(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onPrepare(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onProgress(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onStart(DownloadInfo downloadInfo) {
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            InterfaceC2329309At<String> interfaceC2329309At2 = c11kt;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(fileFM2.getAbsolutePath());
                            sbLIZ3.append('/');
                            sbLIZ3.append(str6);
                            sbLIZ3.append('.');
                            sbLIZ3.append(strLJJLJ);
                            interfaceC2329309At2.onSuccess(C2188811AlT.LIZIZ(sbLIZ3));
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, final BaseException baseException) {
                            c11kt.onError(new C294201Ca(baseException) { // from class: X.0pK9
                                public static final int $stable = 8;
                                public final Exception LLILLJJLI;

                                public final Exception getE() {
                                    return this.LLILLJJLI;
                                }

                                {
                                    super("Download file failed");
                                    this.LLILLJJLI = baseException;
                                }
                            });
                        }
                    });
                    downloadTaskWith.download();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C294201Ca() { // from class: X.0pKB
                        public static final int $stable = 8;
                    };
                }
            }
        });
    }

    public static void LJFF(long j, InterfaceC915550Zvt interfaceC915550Zvt, String str, String str2, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo) {
        C176600m4.LIZJ(new AwS2S2200100_15(j, interfaceC915550Zvt, str, str2, convertNoticeboardMaterialInfo, 2));
    }

    public static C19482011Jy LJII(final C917840Zza c917840Zza, final Long l, final String str, final String str2, final String str3) {
        Object objLJJIL;
        C19480011Je c19480011JeLIZIZ;
        if (c917840Zza.LIZLLL.labels.isEmpty()) {
            objLJJIL = AbstractC19484711Kz.LJIJJLI(C13BV.INSTANCE);
        } else {
            ArrayList arrayList = new ArrayList();
            List<Label> list = c917840Zza.LIZLLL.labels;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (Label label : list) {
                MultiCanvasUtils.LIZ.getClass();
                InterfaceC971680bOQ interfaceC971680bOQLJIIJ = MultiCanvasUtils.LJIIJ();
                if (interfaceC971680bOQLJIIJ != null && (c19480011JeLIZIZ = interfaceC971680bOQLJIIJ.LIZIZ(label.font)) != null) {
                    arrayList.add(C953290aul.LIZ(c19480011JeLIZIZ, AbstractC19484711Kz.LJIJJLI(label)));
                }
                arrayList2.add(Unit.LIZ);
            }
            objLJJIL = AbstractC19484711Kz.LJJIL(arrayList, new InterfaceC1487280oo2() { // from class: X.00DU
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Object[] objArr = (Object[]) obj;
                    ArrayList arrayList3 = new ArrayList(objArr.length);
                    for (Object obj2 : objArr) {
                        arrayList3.add(obj2);
                    }
                    return arrayList3;
                }
            });
        }
        return AbstractC19484711Kz.LJIJJLI(0).LJJ(C1701940uOG.LIZIZ()).LJIL(new InterfaceC1487280oo2() { // from class: X.0avZ
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C954080aw2 c954080aw2 = C954080aw2.LIZJ;
                if (!C954080aw2.LIZLLL) {
                    MultiCanvasUtils.LIZ.getClass();
                    C954080aw2.LIZLLL = MultiCanvasUtils.LJIL(2, false);
                }
                return Unit.LIZ;
            }
        }).LJJ(C11S5.LIZ()).LJIIZILJ(new AkS477S0100000_15(c917840Zza, 7)).LJIIZILJ(new C517301zv(objLJJIL, 0)).LJIL(new InterfaceC1487280oo2() { // from class: X.0avb
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Pair pair = (Pair) obj;
                NLEEditor nLEEditor = (NLEEditor) pair.getFirst();
                List<Pair> list2 = (List) pair.getSecond();
                ArrayList arrayList3 = new ArrayList();
                for (Pair pair2 : list2) {
                    String strValueOf = String.valueOf(pair2.getFirst());
                    CloudDraftItemManager.Label label2 = (CloudDraftItemManager.Label) pair2.getSecond();
                    C971360bNu c971360bNu = new C971360bNu(label2.text, label2.color, strValueOf, 8);
                    arrayList3.add(c971360bNu);
                    MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                    float f = label2.centerX;
                    float f2 = label2.centerY;
                    float f3 = label2.rotation;
                    float f4 = label2.scale;
                    int i = label2.zOrder;
                    multiCanvasUtils.getClass();
                    MultiCanvasUtils.LIZIZ(c971360bNu, nLEEditor, f, f2, true, f3, f4, i);
                    nLEEditor.commit();
                    nLEEditor.done();
                }
                C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", "return DraftItem");
                C953770avX c953770avX = new C953770avX();
                C917840Zza c917840Zza2 = c917840Zza;
                String str4 = str;
                String str5 = str2;
                Long l2 = l;
                String str6 = str3;
                c953770avX.LIZ = 3;
                c953770avX.LIZIZ = C1017903yT.LIZ();
                c953770avX.LIZJ = System.currentTimeMillis();
                c953770avX.LIZLLL = c917840Zza2.LIZ;
                c953770avX.LJ = c917840Zza2.LIZIZ;
                c953770avX.LJI = arrayList3;
                c953770avX.LJII = str4;
                c953770avX.LJIIIIZZ = 3;
                c953770avX.LJIIIZ = str5;
                c953770avX.LJIIJ = nLEEditor.store();
                c953770avX.LJIIJJI = false;
                c953770avX.LJIIL = l2;
                if (str6 != null) {
                    c953770avX.LJIILIIL = str6;
                }
                return c953770avX;
            }
        });
    }

    public static final class Label {

        @C09CT("center_x")
        public final float centerX;

        @C09CT("center_y")
        public final float centerY;

        @C09CT("color")
        public final int color;

        @C09CT("font")
        public final String font;

        @C09CT("rotation")
        public final float rotation;

        @C09CT("scale")
        public final float scale;

        @C09CT("text")
        public final String text;

        @C09CT("z_order")
        public final int zOrder;

        public Label(float f, float f2, float f3, int i, String str, int i2, String str2, float f4) {
            this.centerX = f;
            this.centerY = f2;
            this.rotation = f3;
            this.color = i;
            this.text = str;
            this.zOrder = i2;
            this.font = str2;
            this.scale = f4;
        }
    }
}
