package X;

import Y.ARunnableS25S1200000_21;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.experiment.CommentImagePublishOptExp;
import com.ss.android.ugc.aweme.comment.model.CommentBaseMediaUploadAuth;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuthKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.bduploader.BDImageXUploaderListener;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderBase;
import com.ss.bduploader.BDVideoUploaderListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS278S0300000_34;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208181Bbc {
    public static final int LJII;
    public static final Object LJIIIIZZ;
    public static volatile CommentImageUploadAuth LJIIIZ;
    public static final Map<Integer, C2208351Bbt> LJIIJ;
    public static final C054G LJIIJJI;
    public static AnonymousClass0956 LJIIL;
    public static final ConcurrentHashMap<Integer, Long> LJIILIIL;
    public List<C2207801Bb0> LIZ;
    public List<BDVideoUploader> LIZIZ;
    public boolean LIZLLL;
    public ARunnableS25S1200000_21 LJFF;
    public final C2208321Bbq LJI;
    public final Object LIZJ = new Object();
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

    public final void LIZ() {
        ARunnableS25S1200000_21 aRunnableS25S1200000_21 = this.LJFF;
        if (aRunnableS25S1200000_21 != null) {
            this.LJ.removeCallbacks(aRunnableS25S1200000_21);
        }
        this.LJFF = null;
    }

    public final void LIZIZ() {
        List<C2207801Bb0> list = this.LIZ;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((C2207801Bb0) it2.next()).LIZ();
            }
        }
        List<C2207801Bb0> list2 = this.LIZ;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        List<BDVideoUploader> list3 = this.LIZIZ;
        if (list3 != null) {
            Iterator it3 = ((ArrayList) list3).iterator();
            while (it3.hasNext()) {
                ((BDVideoUploaderBase) it3.next()).close();
            }
        }
        List<BDVideoUploader> list4 = this.LIZIZ;
        if (list4 != null) {
            ((ArrayList) list4).clear();
        }
        LJFF();
        LJIILIIL.clear();
        Map<Integer, C2208351Bbt> map = LJIIJ;
        if (!map.isEmpty()) {
            if (CommentImagePublishOptExp.LIZ()) {
                C19719612Di.LJJIII(((LinkedHashMap) map).entrySet(), new AwS613S0100000_34(this, 168), true);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    if (Intrinsics.LJFF(((C2208351Bbt) entry.getValue()).LIZ, this)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        if (CommentImagePublishOptExp.LIZ()) {
            C0XQ7.LJ();
            C0XQ7.LIZ.LJI(this.LJI);
        } else {
            C0XQ7.LJ();
            C0XQ7.LIZ.LJIILL(this.LJI);
        }
    }

    public final boolean LJ() {
        boolean z;
        synchronized (this.LIZJ) {
            try {
                z = !this.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final void LJFF() {
        synchronized (this.LIZJ) {
            try {
                this.LIZLLL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZ();
    }

    static {
        SettingsManager.LIZLLL().getClass();
        LJII = SettingsManager.LJ("comment_image_upload_threshold", 3) * 1024 * 1024;
        LJIIIIZZ = new Object();
        LJIIJ = new LinkedHashMap();
        LJIIJJI = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        LJIILIIL = new ConcurrentHashMap<>();
    }

    public C2208181Bbc() {
        C2208321Bbq c2208321Bbq = C2208321Bbq.LL;
        this.LJI = c2208321Bbq;
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(c2208321Bbq);
    }

    public static String LJI(CommentImageModel commentImageModel) {
        String compressedVideoPath = commentImageModel.getCompressedVideoPath();
        if (compressedVideoPath != null && C2260008tK.LJFF(compressedVideoPath)) {
            return compressedVideoPath;
        }
        String videoPath = commentImageModel.getVideoPath();
        if (videoPath == null || !C2260008tK.LJFF(videoPath)) {
            return null;
        }
        return videoPath;
    }

    public final void LJII(String str, Function0<Unit> function0) {
        LIZ();
        ARunnableS25S1200000_21 aRunnableS25S1200000_21 = new ARunnableS25S1200000_21(this, str, function0, 2);
        this.LJFF = aRunnableS25S1200000_21;
        C786410Ut5.LJLIIL(30000L, this.LJ, aRunnableS25S1200000_21);
    }

    public final void LJIIJ(final CommentImageModel commentImageModel, final InterfaceC2207911BbB interfaceC2207911BbB) {
        CommentImageUploadAuth commentImageUploadAuth;
        final boolean zLJIIZILJ = C2208191Bbd.LJIIZILJ(commentImageModel);
        if (zLJIIZILJ) {
            LJFF();
        }
        if (C2208191Bbd.LJII() && (!zLJIIZILJ || CommentImageUploadAuthKt.isTypeValid(LJIIIZ, "live"))) {
            C1344030l4z.LIZJ("CommentImageUploadController", "has valid auth, start upload");
            if (zLJIIZILJ) {
                LJII("live photo image upload timeout", new AwS278S0300000_34(commentImageModel, this, interfaceC2207911BbB, 10));
            }
            C2208281Bbm.LIZ.getClass();
            C2208291Bbn c2208291BbnLJIIIIZZ = C2208281Bbm.LJIIIIZZ(commentImageModel, null);
            c2208291BbnLJIIIIZZ.LIZIZ = C2208281Bbm.LJI;
            c2208291BbnLJIIIIZZ.LIZJ = C2208281Bbm.LJII;
            c2208291BbnLJIIIIZZ.LIZLLL = C2208281Bbm.LJIIIIZZ;
            c2208291BbnLJIIIIZZ.LJ = C2208281Bbm.LJIIIZ;
            c2208291BbnLJIIIIZZ.LJFF = C2208281Bbm.LJIIJ;
            C2208281Bbm.LJI = 0L;
            C2208281Bbm.LJII = 0L;
            C2208281Bbm.LJIIIIZZ = 0;
            C2208281Bbm.LJIIIZ = -1L;
            C2208281Bbm.LJIIJ = "";
            if (CommentImagePublishOptExp.LIZ()) {
                synchronized (LJIIIIZZ) {
                    try {
                        commentImageUploadAuth = LJIIIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                commentImageUploadAuth = LJIIIZ;
            }
            LIZJ(commentImageModel, commentImageUploadAuth, interfaceC2207911BbB, zLJIIZILJ);
            return;
        }
        C1344030l4z.LIZJ("CommentImageUploadController", "has invalid auth, fetch authConfig");
        C2208281Bbm.LIZ.getClass();
        C2208281Bbm.LJIIZILJ(commentImageModel);
        C11J7 c11j7LJL = ((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).LIZIZ(0).LJL(C11S5.LIZ());
        if (!CommentImagePublishOptExp.LIZJ()) {
            c11j7LJL = c11j7LJL.LJJJLZIJ(C1701940uOG.LIZIZ());
        }
        c11j7LJL.LIZIZ(new InterfaceC626120Oh8<CommentImageUploadAuth>() { // from class: X.1Bbf
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th2) {
                if (zLJIIZILJ) {
                    C2208181Bbc.LIZLLL(this, commentImageModel, interfaceC2207911BbB, -1L, "fetch authConfig error", null, 48);
                } else {
                    interfaceC2207911BbB.LIZ(-1L, "fetch authConfig error");
                }
                C2208281Bbm.LJI(C2208281Bbm.LIZ, commentImageModel, -1, Long.valueOf(C2252408s6.LIZIZ(th2)), th2.getMessage(), null, 16);
                C1344030l4z.LIZJ("CommentImageUploadController", "fetch authConfig error");
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(CommentImageUploadAuth commentImageUploadAuth2) {
                String imprId;
                CommentImageUploadAuth commentImageUploadAuth3 = commentImageUploadAuth2;
                if (CommentImageUploadAuthKt.isValid(commentImageUploadAuth3) && (!zLJIIZILJ || CommentImageUploadAuthKt.isTypeValid(commentImageUploadAuth3, "live"))) {
                    C1344030l4z.LIZJ("CommentImageUploadController", "fetch valid authConfig success");
                    int i = C2208181Bbc.LJII;
                    if (CommentImagePublishOptExp.LIZ()) {
                        synchronized (C2208181Bbc.LJIIIIZZ) {
                            try {
                                C2208181Bbc.LJIIIZ = commentImageUploadAuth3;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
                    } else {
                        C2208181Bbc.LJIIIZ = commentImageUploadAuth3;
                    }
                    String json = GsonProtectorUtils.toJson(C08JS.LIZIZ(), commentImageUploadAuth3);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cmt_img_auth_");
                    sbLIZ.append(C2208191Bbd.LJI());
                    C0TSK.LJFF(C2188811AlT.LIZIZ(sbLIZ), json);
                    if (zLJIIZILJ) {
                        C2208181Bbc c2208181Bbc = this;
                        c2208181Bbc.LJII("live photo image upload timeout", new AwS278S0300000_34(commentImageModel, c2208181Bbc, interfaceC2207911BbB, 12));
                    }
                    this.LIZJ(commentImageModel, commentImageUploadAuth3, interfaceC2207911BbB, zLJIIZILJ);
                    C2208281Bbm.LJI(C2208281Bbm.LIZ, commentImageModel, 1, null, null, null, 28);
                    return;
                }
                C1344030l4z.LIZJ("CommentImageUploadController", "fetch invalid authConfig!");
                if (zLJIIZILJ) {
                    C2208181Bbc.LIZLLL(this, commentImageModel, interfaceC2207911BbB, -1L, "fetch invalid authConfig!", null, 48);
                } else {
                    interfaceC2207911BbB.LIZ(-1L, "fetch invalid authConfig!");
                }
                C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                CommentImageModel commentImageModel2 = commentImageModel;
                LogPbBean logPd = commentImageUploadAuth3.getLogPd();
                if (logPd != null) {
                    imprId = logPd.getImprId();
                } else {
                    imprId = null;
                }
                C2208281Bbm.LJI(c2208281Bbm, commentImageModel2, -1, null, "auth is invalid", imprId, 4);
            }
        });
    }

    public final void LJIIIIZZ(CommentImageModel commentImageModel, InterfaceC2207911BbB interfaceC2207911BbB, boolean z) {
        List<String> urlList;
        String lowerCase;
        if (commentImageModel != null && (urlList = commentImageModel.getUrlList()) != null && !urlList.isEmpty()) {
            boolean zLJIIZILJ = C2208191Bbd.LJIIZILJ(commentImageModel);
            if (zLJIIZILJ) {
                C2208201Bbe.LIZ.getClass();
                if (C2208201Bbe.LJ(commentImageModel)) {
                    C2208201Bbe.LIZLLL.put(Integer.valueOf(System.identityHashCode(commentImageModel)), new C2208261Bbk(System.currentTimeMillis(), z, C2208201Bbe.LJ(commentImageModel)));
                }
            }
            String strLJ = C2208191Bbd.LJ(commentImageModel);
            if (strLJ != null && strLJ.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("upload file: ");
                sbLIZ.append(strLJ);
                C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
                String format = commentImageModel.getFormat();
                if (format == null || (lowerCase = format.toLowerCase(Locale.ROOT)) == null) {
                    lowerCase = "";
                }
                if (zLJIIZILJ) {
                    C2208191Bbd.LIZIZ(commentImageModel);
                    C2208191Bbd.LIZLLL(commentImageModel, interfaceC2207911BbB, 5L);
                }
                if (C2208191Bbd.LJIIIZ(commentImageModel) && !C2208191Bbd.LJIIJ(commentImageModel)) {
                    LJIIJ(commentImageModel, interfaceC2207911BbB);
                    return;
                } else {
                    LJIIIZ(commentImageModel, strLJ, lowerCase, interfaceC2207911BbB, "webp", false);
                    return;
                }
            }
            C1344030l4z.LIZJ("CommentImageUploadController", "upload filePath is null!");
            if (zLJIIZILJ) {
                C2208201Bbe.LIZ.getClass();
                C2208201Bbe.LJI(commentImageModel, "setup", "upload filePath is null!", 0L, "");
            }
            interfaceC2207911BbB.LIZ(-1L, "upload filePath is null!");
            return;
        }
        C1344030l4z.LIZJ("CommentImageUploadController", "upload image is null!");
        interfaceC2207911BbB.LIZ(-1L, "upload image is null!");
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.1Bba] */
    public final void LIZJ(final CommentImageModel commentImageModel, CommentImageUploadAuth commentImageUploadAuth, final InterfaceC2207911BbB interfaceC2207911BbB, final boolean z) {
        String strLJ;
        boolean z2;
        if (commentImageModel.isCompressed()) {
            strLJ = commentImageModel.getCompressedFilePath();
        } else {
            strLJ = C2208191Bbd.LJ(commentImageModel);
        }
        if (strLJ != null && strLJ.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("upload error filePath is null! image.isCompressed: ");
            sbLIZ.append(commentImageModel.isCompressed());
            C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("upload error filePath is null! image.isCompressed: ");
                sbLIZ2.append(commentImageModel.isCompressed());
                LIZLLL(this, commentImageModel, interfaceC2207911BbB, -1L, C2188811AlT.LIZIZ(sbLIZ2), null, 48);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("upload error filePath is null! image.isCompressed: ");
            sbLIZ3.append(commentImageModel.isCompressed());
            interfaceC2207911BbB.LIZ(-1L, C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (CommentImagePublishOptExp.LIZIZ() && !C2260008tK.LJFF(strLJ)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("upload file not exists before SDK upload: ");
            sbLIZ4.append(strLJ);
            sbLIZ4.append(", isCompressed: ");
            sbLIZ4.append(commentImageModel.isCompressed());
            C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ4));
            if (z) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("upload file not exists, image.isCompressed: ");
                sbLIZ5.append(commentImageModel.isCompressed());
                LIZLLL(this, commentImageModel, interfaceC2207911BbB, -1L, C2188811AlT.LIZIZ(sbLIZ5), null, 48);
                return;
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("upload file not exists, image.isCompressed: ");
            sbLIZ6.append(commentImageModel.isCompressed());
            interfaceC2207911BbB.LIZ(-1L, C2188811AlT.LIZIZ(sbLIZ6));
            return;
        }
        if (commentImageUploadAuth == null) {
            C1344030l4z.LIZJ("CommentImageUploadController", "upload error auth is null!");
            if (z) {
                LIZLLL(this, commentImageModel, interfaceC2207911BbB, -1L, "upload error auth is null!", null, 48);
                return;
            } else {
                interfaceC2207911BbB.LIZ(-1L, "upload error auth is null!");
                return;
            }
        }
        C2208281Bbm.LIZ.getClass();
        C2208291Bbn c2208291BbnLJIIIIZZ = C2208281Bbm.LJIIIIZZ(commentImageModel, null);
        c2208291BbnLJIIIIZZ.LJJIIZ = z;
        if (!z) {
            c2208291BbnLJIIIIZZ.LJJIIZI = false;
        }
        final C2207801Bb0 c2207801Bb0 = new C2207801Bb0(commentImageUploadAuth);
        c2207801Bb0.LIZIZ.setFilePath(1, new String[]{strLJ});
        final ?? r11 = new InterfaceC2207911BbB() { // from class: X.1Bba
            @Override // X.InterfaceC2207911BbB
            public final void onComplete(String str) {
                CommentImageUploadAuth commentImageUploadAuth2;
                boolean z3;
                String serviceId;
                String uploadDomain;
                c2207801Bb0.LIZ();
                List<C2207801Bb0> list = this.LIZ;
                if (list != null) {
                    ((ArrayList) list).remove(c2207801Bb0);
                }
                if (commentImageModel.isCompressed()) {
                    int i = C2208181Bbc.LJII;
                    C2208191Bbd.LJIILLIIL(commentImageModel.getCompressedFilePath());
                }
                if (z && !this.LJ()) {
                    return;
                }
                C2208281Bbm.LJII(C2208281Bbm.LIZ, commentImageModel, 1, null, null, !z, 12);
                if (z) {
                    C2208201Bbe.LJIIJJI(C2208201Bbe.LIZ, commentImageModel);
                }
                final C2208181Bbc c2208181Bbc = this;
                final CommentImageModel commentImageModel2 = commentImageModel;
                final InterfaceC2207911BbB interfaceC2207911BbB2 = interfaceC2207911BbB;
                boolean z4 = z;
                c2208181Bbc.getClass();
                commentImageModel2.setUri(str);
                CommentBaseMediaUploadAuth commentBaseMediaUploadAuth = null;
                if (!z4) {
                    int i2 = C2208181Bbc.LJII;
                    C2208191Bbd.LIZ(commentImageModel2, true);
                    commentImageModel2.setVideoPath(null);
                    commentImageModel2.setLivePhotoInfo(null);
                    interfaceC2207911BbB2.onComplete(str);
                    return;
                }
                c2208181Bbc.LJII("live photo video upload timeout", new AwS278S0300000_34(commentImageModel2, c2208181Bbc, interfaceC2207911BbB2, 11));
                C2208201Bbe.LIZ.getClass();
                C2208201Bbe.LJIIL(commentImageModel2);
                int i3 = C2208181Bbc.LJII;
                C2208191Bbd.LIZLLL(commentImageModel2, interfaceC2207911BbB2, 65L);
                String strLJI = C2208181Bbc.LJI(commentImageModel2);
                if (strLJI != null && strLJI.length() != 0) {
                    if (CommentImagePublishOptExp.LIZ()) {
                        synchronized (C2208181Bbc.LJIIIIZZ) {
                            try {
                                commentImageUploadAuth2 = C2208181Bbc.LJIIIZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    } else {
                        commentImageUploadAuth2 = C2208181Bbc.LJIIIZ;
                    }
                    String strLJI2 = C2208181Bbc.LJI(commentImageModel2);
                    if (strLJI2 != null && strLJI2.length() != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        C1344030l4z.LIZJ("CommentImageUploadController", "live photo video path is empty");
                        C2208181Bbc.LIZLLL(c2208181Bbc, commentImageModel2, interfaceC2207911BbB2, -1L, "live photo video path is empty", null, 48);
                        return;
                    }
                    if (!C2260008tK.LJFF(strLJI2)) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("live photo video file not exist: ");
                        sbLIZ7.append(strLJI2);
                        C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ7));
                        C2208181Bbc.LIZLLL(c2208181Bbc, commentImageModel2, interfaceC2207911BbB2, -1L, "live photo video file not exist", null, 48);
                        return;
                    }
                    if (commentImageUploadAuth2 != null && CommentImageUploadAuthKt.isTypeValid(commentImageUploadAuth2, "live")) {
                        final BDVideoUploader bDVideoUploader = new BDVideoUploader();
                        List<CommentBaseMediaUploadAuth> config = commentImageUploadAuth2.getConfig();
                        if (config != null) {
                            Iterator<CommentBaseMediaUploadAuth> it2 = config.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                CommentBaseMediaUploadAuth next = it2.next();
                                if (Intrinsics.LJFF(next.getType(), "live")) {
                                    commentBaseMediaUploadAuth = next;
                                    break;
                                }
                            }
                            CommentBaseMediaUploadAuth commentBaseMediaUploadAuth2 = commentBaseMediaUploadAuth;
                            if (commentBaseMediaUploadAuth2 != null && (serviceId = commentBaseMediaUploadAuth2.getServiceId()) != null && serviceId.length() != 0 && (uploadDomain = commentBaseMediaUploadAuth2.getUploadDomain()) != null && uploadDomain.length() != 0) {
                                bDVideoUploader.setSpaceName(commentBaseMediaUploadAuth2.getServiceId());
                                bDVideoUploader.setBusinessTag("comment_livephoto");
                                bDVideoUploader.setTopSecretKey(commentBaseMediaUploadAuth2.getSecretKey());
                                bDVideoUploader.setTopAccessKey(commentBaseMediaUploadAuth2.getAccessKey());
                                bDVideoUploader.setTopSessionToken(commentBaseMediaUploadAuth2.getSessionToken());
                                bDVideoUploader.setUploadDomain(commentBaseMediaUploadAuth2.getUploadDomain());
                                bDVideoUploader.setEnableLogCallBack(true);
                                bDVideoUploader.setPathName(strLJI2);
                                bDVideoUploader.setListener(new BDVideoUploaderListener() { // from class: X.1Bbb
                                    @Override // com.ss.bduploader.BDVideoUploaderListener
                                    public final String getStringFromExtern(int i4) {
                                        return "";
                                    }

                                    @Override // com.ss.bduploader.BDVideoUploaderListener
                                    public final void onLog(int i4, int i5, String str2) {
                                    }

                                    @Override // com.ss.bduploader.BDVideoUploaderListener
                                    public final int videoUploadCheckNetState(int i4, int i5) {
                                        return 0;
                                    }

                                    @Override // com.ss.bduploader.BDVideoUploaderListener
                                    public final void onUploadVideoStage(int i4, long j) {
                                        boolean z5;
                                        if (!c2208181Bbc.LJ()) {
                                            return;
                                        }
                                        int i5 = C2208181Bbc.LJII;
                                        CommentImageModel commentImageModel3 = commentImageModel2;
                                        InterfaceC2207911BbB interfaceC2207911BbB3 = interfaceC2207911BbB2;
                                        if (0 <= j && j < 101) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        long j2 = 65;
                                        if (z5) {
                                            j2 = 65 + ((j * 30) / 100);
                                        } else if (i4 > 0) {
                                            if (i4 == 1) {
                                                j2 = 78;
                                            } else if (i4 == 2) {
                                                j2 = 87;
                                            } else {
                                                j2 = 95;
                                            }
                                        }
                                        C2208191Bbd.LIZLLL(commentImageModel3, interfaceC2207911BbB3, j2);
                                    }

                                    @Override // com.ss.bduploader.BDVideoUploaderListener
                                    public final void onNotify(int i4, long j, BDVideoInfo bDVideoInfo) {
                                        String str2;
                                        Long lValueOf;
                                        long j2;
                                        String str3;
                                        if (!c2208181Bbc.LJ()) {
                                            bDVideoUploader.close();
                                            List<BDVideoUploader> list2 = c2208181Bbc.LIZIZ;
                                            if (list2 != null) {
                                                ((ArrayList) list2).remove(bDVideoUploader);
                                                return;
                                            }
                                            return;
                                        }
                                        String str4 = null;
                                        if (i4 != 0) {
                                            if (i4 != 2) {
                                                if (i4 == 3) {
                                                    C1344030l4z.LIZJ("CommentImageUploadController", "live photo video upload canceled");
                                                    C2208181Bbc.LIZLLL(c2208181Bbc, commentImageModel2, interfaceC2207911BbB2, -1L, "live photo video upload canceled", null, 48);
                                                    bDVideoUploader.close();
                                                    List<BDVideoUploader> list3 = c2208181Bbc.LIZIZ;
                                                    if (list3 != null) {
                                                        ((ArrayList) list3).remove(bDVideoUploader);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                            sbLIZ8.append("live photo video upload fail, code: ");
                                            if (bDVideoInfo != null) {
                                                lValueOf = Long.valueOf(bDVideoInfo.mErrorCode);
                                            } else {
                                                lValueOf = null;
                                            }
                                            sbLIZ8.append(lValueOf);
                                            sbLIZ8.append(" msg: ");
                                            if (bDVideoInfo != null) {
                                                str4 = bDVideoInfo.mErrorMsg;
                                            }
                                            sbLIZ8.append(str4);
                                            C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ8));
                                            C2208181Bbc c2208181Bbc2 = c2208181Bbc;
                                            CommentImageModel commentImageModel3 = commentImageModel2;
                                            InterfaceC2207911BbB interfaceC2207911BbB3 = interfaceC2207911BbB2;
                                            if (bDVideoInfo != null) {
                                                j2 = bDVideoInfo.mErrorCode;
                                            } else {
                                                j2 = -1;
                                            }
                                            if (bDVideoInfo == null || (str3 = bDVideoInfo.mErrorMsg) == null) {
                                                str3 = "live photo video upload fail";
                                            }
                                            C2208181Bbc.LIZLLL(c2208181Bbc2, commentImageModel3, interfaceC2207911BbB3, j2, str3, new AwS578S0100000_34(bDVideoInfo, 213), 16);
                                            bDVideoUploader.close();
                                            List<BDVideoUploader> list4 = c2208181Bbc.LIZIZ;
                                            if (list4 == null) {
                                                return;
                                            }
                                            ((ArrayList) list4).remove(bDVideoUploader);
                                            return;
                                        }
                                        if (bDVideoInfo != null) {
                                            str2 = bDVideoInfo.mVideoId;
                                        } else {
                                            str2 = null;
                                        }
                                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                        sbLIZ9.append("live photo video upload succeeded, vid: ");
                                        sbLIZ9.append(str2);
                                        C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ9));
                                        if (str2 != null && str2.length() != 0) {
                                            commentImageModel2.setVideoId(str2);
                                            c2208181Bbc.LIZ();
                                            interfaceC2207911BbB2.onProgress(100L);
                                            int i5 = C2208181Bbc.LJII;
                                            C2208191Bbd.LIZIZ(commentImageModel2);
                                            C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                                            CommentImageModel commentImageModel4 = commentImageModel2;
                                            c2208281Bbm.getClass();
                                            C2208291Bbn c2208291BbnLJIIIIZZ2 = C2208281Bbm.LJIIIIZZ(commentImageModel4, null);
                                            c2208291BbnLJIIIIZZ2.LJJIIZI = true;
                                            c2208291BbnLJIIIIZZ2.LJJII = System.currentTimeMillis();
                                            C2208191Bbd.LIZ(commentImageModel2, true);
                                            C2208181Bbc c2208181Bbc3 = c2208181Bbc;
                                            AwS435S0200000_34 awS435S0200000_34 = new AwS435S0200000_34(commentImageModel2, interfaceC2207911BbB2, 31);
                                            synchronized (c2208181Bbc3.LIZJ) {
                                                try {
                                                    if (!c2208181Bbc3.LIZLLL) {
                                                        c2208181Bbc3.LIZLLL = true;
                                                        c2208181Bbc3.LIZ();
                                                        awS435S0200000_34.invoke();
                                                    }
                                                } catch (Throwable th2) {
                                                    TryCatchGuardChecker.doCheck(th2);
                                                    throw th2;
                                                }
                                            }
                                        } else {
                                            C2208181Bbc.LIZLLL(c2208181Bbc, commentImageModel2, interfaceC2207911BbB2, -1L, "live photo video upload completed without video id", null, 48);
                                        }
                                        bDVideoUploader.close();
                                        List<BDVideoUploader> list5 = c2208181Bbc.LIZIZ;
                                        if (list5 == null) {
                                            return;
                                        }
                                        ((ArrayList) list5).remove(bDVideoUploader);
                                    }
                                });
                                try {
                                    if (c2208181Bbc.LIZIZ == null) {
                                        c2208181Bbc.LIZIZ = new ArrayList();
                                    }
                                    List<BDVideoUploader> list2 = c2208181Bbc.LIZIZ;
                                    if (list2 != null) {
                                        ((ArrayList) list2).add(bDVideoUploader);
                                    }
                                    bDVideoUploader.start();
                                    return;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append("start live photo video   failed: ");
                                    sbLIZ8.append(e.getMessage());
                                    C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ8));
                                    C2208181Bbc.LIZLLL(c2208181Bbc, commentImageModel2, interfaceC2207911BbB2, -1L, "start live photo video upload failed", null, 48);
                                    bDVideoUploader.close();
                                    List<BDVideoUploader> list3 = c2208181Bbc.LIZIZ;
                                    if (list3 == null) {
                                        return;
                                    }
                                    ((ArrayList) list3).remove(bDVideoUploader);
                                    return;
                                }
                            }
                        }
                        C1344030l4z.LIZJ("CommentImageUploadController", "live photo video auth missing serviceId/uploadDomain");
                        C2208181Bbc.LIZLLL(c2208181Bbc, commentImageModel2, interfaceC2207911BbB2, -1L, "live photo video auth invalid", null, 48);
                        return;
                    }
                    C1344030l4z.LIZJ("CommentImageUploadController", "live photo video auth invalid");
                    C2208181Bbc.LIZLLL(c2208181Bbc, commentImageModel2, interfaceC2207911BbB2, -1L, "live photo video auth invalid", null, 48);
                    return;
                }
                C1344030l4z.LIZJ("CommentImageUploadController", "live photo video path is empty");
                C2208181Bbc.LIZLLL(c2208181Bbc, commentImageModel2, interfaceC2207911BbB2, -1L, "live photo video path is empty", null, 48);
            }

            @Override // X.InterfaceC2207911BbB
            public final void onProgress(long j) {
                if (z) {
                    if (this.LJ()) {
                        int i = C2208181Bbc.LJII;
                        C2208191Bbd.LIZLLL(commentImageModel, interfaceC2207911BbB, ((C13LZ.LJFF(j, 0L, 100L) * 35) / 100) + 5);
                        return;
                    }
                    return;
                }
                interfaceC2207911BbB.onProgress(j);
            }

            @Override // X.InterfaceC2207911BbB
            public final void LIZ(long j, String str) {
                if (z) {
                    C2208181Bbc.LIZLLL(this, commentImageModel, interfaceC2207911BbB, j, str, null, 48);
                } else {
                    interfaceC2207911BbB.LIZ(j, str);
                }
                c2207801Bb0.LIZ();
                List<C2207801Bb0> list = this.LIZ;
                if (list != null) {
                    ((ArrayList) list).remove(c2207801Bb0);
                }
                if (commentImageModel.isCompressed()) {
                    int i = C2208181Bbc.LJII;
                    C2208191Bbd.LJIILLIIL(commentImageModel.getCompressedFilePath());
                }
                C2208281Bbm.LJII(C2208281Bbm.LIZ, commentImageModel, -1, Long.valueOf(j), str, false, 16);
            }
        };
        c2207801Bb0.LIZIZ.setListener(new BDImageXUploaderListener() { // from class: X.1BbA
            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final void onLog(int i, int i2, String str) {
            }

            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final int imageXUploadCheckNetState(int i, int i2) {
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
                try {
                    return C036E.LIZ.LIZIZ() ? 1 : 0;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return 0;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[PHI: r1
              0x001b: PHI (r1v5 long) = (r1v2 long), (r1v7 long) binds: [B:11:0x0013, B:13:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.ss.bduploader.BDImageXUploaderListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onNotify(int r6, long r7, com.ss.bduploader.BDImageXInfo r9) {
                /*
                    r5 = this;
                    r0 = 1
                    java.lang.String r4 = "CommentImageUploader"
                    if (r6 == r0) goto L64
                    r0 = 124(0x7c, float:1.74E-43)
                    if (r6 == r0) goto L50
                    r0 = 6
                    r1 = -1
                    if (r6 == r0) goto L26
                    r0 = 7
                    if (r6 != r0) goto L25
                    X.1BbB r3 = r1
                    if (r9 == 0) goto L1b
                    long r1 = r9.mErrorCode
                    java.lang.String r0 = r9.mErrorMsg
                    if (r0 != 0) goto L1d
                L1b:
                    java.lang.String r0 = "upload onError: MsgIsSingleImageFail"
                L1d:
                    r3.LIZ(r1, r0)
                    java.lang.String r0 = "upload onError:"
                    X.C1344030l4z.LIZJ(r4, r0)
                L25:
                    return
                L26:
                    if (r9 == 0) goto L45
                    X.1BbB r1 = r1
                    java.lang.String r0 = r9.mImageTosKey
                    r1.onComplete(r0)
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "upload onComplete: "
                    r1.append(r0)
                    java.lang.String r0 = r9.mImageTosKey
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C1344030l4z.LIZJ(r4, r0)
                    return
                L45:
                    java.lang.String r3 = "upload onComplete info is null!"
                    X.C1344030l4z.LIZJ(r4, r3)
                    X.1BbB r0 = r1
                    r0.LIZ(r1, r3)
                    return
                L50:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "upload onPreHeatResultUsed: "
                    r1.append(r0)
                    r1.append(r7)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C1344030l4z.LIZJ(r4, r0)
                    return
                L64:
                    X.1BbB r0 = r1
                    r0.onProgress(r7)
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "upload onProgress: "
                    r1.append(r0)
                    r1.append(r7)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C1344030l4z.LIZJ(r4, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2207901BbA.onNotify(int, long, com.ss.bduploader.BDImageXInfo):void");
            }
        });
        c2207801Bb0.LIZIZ.start();
        C1344030l4z.LIZJ("CommentImageUploader", "start");
        int width = commentImageModel.getWidth();
        int height = commentImageModel.getHeight();
        long size = commentImageModel.getSize();
        C2208291Bbn c2208291BbnLJIIIIZZ2 = C2208281Bbm.LJIIIIZZ(commentImageModel, null);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("startUploadImage: ");
        sbLIZ7.append(commentImageModel);
        C2188811AlT.LIZIZ(sbLIZ7);
        c2208291BbnLJIIIIZZ2.LJJIFFI = System.currentTimeMillis();
        c2208291BbnLJIIIIZZ2.LJIJJLI = width;
        c2208291BbnLJIIIIZZ2.LJIL = height;
        c2208291BbnLJIIIIZZ2.LJJ = size;
        if (this.LIZ == null) {
            this.LIZ = new ArrayList();
        }
        List<C2207801Bb0> list = this.LIZ;
        if (list != null) {
            ((ArrayList) list).add(c2207801Bb0);
        }
    }

    public final void LJIIIZ(final CommentImageModel commentImageModel, final String str, final String str2, final InterfaceC2207911BbB interfaceC2207911BbB, final String str3, final boolean z) {
        if (commentImageModel.getCompressedStatus() == 0 || commentImageModel.getCompressedStatus() == 3 || (commentImageModel.getCompressedStatus() == 2 && !C2260008tK.LJFF(commentImageModel.getCompressedFilePath()))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("image.size: ");
            sbLIZ.append(commentImageModel.getSize());
            sbLIZ.append(", try to compress, isRetry: ");
            sbLIZ.append(z);
            C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
            commentImageModel.setCompressedStatus(1);
            C2208281Bbm.LIZ.getClass();
            C2208281Bbm.LJIIL(commentImageModel, str2, false);
            InterfaceC19728212Gq interfaceC19728212Gq = new InterfaceC19728212Gq() { // from class: X.1Bbg
                @Override // X.InterfaceC19728212Gq
                public final void LIZJ() {
                    if (!z && CommentImagePublishOptExp.LIZIZ()) {
                        C1344030l4z.LIZJ("CommentImageUploadController", "compress failed, retrying once");
                        commentImageModel.setCompressedStatus(3);
                        this.LJIIIZ(commentImageModel, str, str2, interfaceC2207911BbB, str3, true);
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("compress completed error, isRetry: ");
                    sbLIZ2.append(z);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C1344030l4z.LIZJ("CommentImageUploadController", strLIZIZ);
                    C2208181Bbc c2208181Bbc = this;
                    CommentImageModel commentImageModel2 = commentImageModel;
                    c2208181Bbc.getClass();
                    if (C2208191Bbd.LJIIZILJ(commentImageModel2)) {
                        C2208201Bbe.LIZ.getClass();
                        C2208201Bbe.LJI(commentImageModel, "still", strLIZIZ, -1, "ImageCompressCallback");
                    }
                    int i = C2208181Bbc.LJII;
                    C2208191Bbd.LIZIZ(commentImageModel);
                    interfaceC2207911BbB.LIZ(-1L, strLIZIZ);
                    commentImageModel.setCompressedStatus(3);
                    C2208281Bbm.LIZ(C2208281Bbm.LIZ, commentImageModel, -1, 0, 0, 0L, Long.valueOf(-1), strLIZIZ, 28);
                }

                @Override // X.InterfaceC19728212Gq
                public final void LIZ(C2208361Bbu c2208361Bbu) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("compress completed: ");
                    sbLIZ2.append(c2208361Bbu.LIZ);
                    sbLIZ2.append(" now image.format:{");
                    sbLIZ2.append(commentImageModel.getFormat());
                    sbLIZ2.append('}');
                    C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ2));
                    commentImageModel.setFormat(str3);
                    commentImageModel.setCompressed(true);
                    commentImageModel.setCompressedFilePath(c2208361Bbu.LIZ);
                    commentImageModel.setCompressedStatus(2);
                    C2208281Bbm.LIZ(C2208281Bbm.LIZ, commentImageModel, 1, c2208361Bbu.LIZIZ, c2208361Bbu.LIZJ, c2208361Bbu.LIZLLL, null, null, 96);
                    this.LJIIJ(commentImageModel, interfaceC2207911BbB);
                }
            };
            float size = commentImageModel.getSize() / LJII;
            if (CommentImagePublishOptExp.LIZJ()) {
                C20182113xz c20182113xz = C20182113xz.LIZ;
                C054G c054g = LJIIJJI;
                int width = commentImageModel.getWidth();
                int height = commentImageModel.getHeight();
                c20182113xz.getClass();
                LJIIL = C20182113xz.LIZJ(c054g, str, width, height, size, interfaceC19728212Gq);
                return;
            }
            C20182113xz c20182113xz2 = C20182113xz.LIZ;
            int width2 = commentImageModel.getWidth();
            int height2 = commentImageModel.getHeight();
            c20182113xz2.getClass();
            C15O7.LIZJ(new CallableC19728112Gp(width2, height2, size, str)).LJ(new C19774512Yl(interfaceC19728212Gq, 18), C15O7.LJIIIIZZ, null);
            return;
        }
        if (commentImageModel.getCompressedStatus() == 2) {
            C1344030l4z.LIZJ("CommentImageUploadController", "compress status is complete");
            LJIIJ(commentImageModel, interfaceC2207911BbB);
        } else {
            if (commentImageModel.getCompressedStatus() != 1) {
                return;
            }
            C1344030l4z.LIZJ("CommentImageUploadController", "compress status is compressing");
            C1344030l4z.LIZJ("CommentImageUploadController", "pre-compress savePendingInfo");
            LJIIJ.put(Integer.valueOf(commentImageModel.hashCode()), new C2208351Bbt(this, interfaceC2207911BbB));
            C2208281Bbm.LIZ.getClass();
            C2208281Bbm.LJIIL(commentImageModel, str2, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C2208181Bbc r13, com.ss.android.ugc.aweme.comment.model.CommentImageModel r14, X.InterfaceC2207911BbB r15, long r16, java.lang.String r18, kotlin.jvm.internal.AwS578S0100000_34 r19, int r20) {
        /*
            r12 = r19
            r0 = r20 & 16
            r2 = 1
            r4 = 0
            if (r0 == 0) goto La3
            r1 = 1
        L9:
            r0 = r20 & 32
            r5 = 0
            if (r0 == 0) goto Lf
            r12 = r5
        Lf:
            r3 = r13
            r3.getClass()
            X.1Bbe r0 = X.C2208201Bbe.LIZ
            r0.getClass()
            r8 = r18
            if (r8 == 0) goto La0
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r8.toLowerCase(r0)
            if (r6 == 0) goto La0
            java.lang.String r7 = "timeout"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r7, r4)
            if (r0 != 0) goto L3e
            java.lang.String r7 = "auth"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r7, r4)
            if (r0 != 0) goto L3e
            java.lang.String r0 = "video path is empty"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r4)
            if (r0 == 0) goto L6a
            java.lang.String r7 = "motion_missing"
        L3e:
            java.lang.String r11 = "CommentImageUploadController"
            r9 = r16
            r6 = r14
            X.C2208201Bbe.LJI(r6, r7, r8, r9, r11)
            X.C2208191Bbd.LIZIZ(r6)
            X.1Bbm r0 = X.C2208281Bbm.LIZ
            r0.getClass()
            X.1Bbn r0 = X.C2208281Bbm.LJIIIIZZ(r6, r5)
            r0.LJJIIZI = r4
            long r4 = java.lang.System.currentTimeMillis()
            r0.LJJII = r4
            X.C2208191Bbd.LIZ(r6, r1)
            X.1Bbs r11 = new X.1Bbs
            r13 = r15
            r14 = r9
            r16 = r8
            r11.<init>(r12, r13, r14, r16)
            java.lang.Object r1 = r3.LIZJ
            monitor-enter(r1)
            goto La6
        L6a:
            java.lang.String r0 = "filepath is null"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r4)
            if (r0 != 0) goto L9d
            java.lang.String r0 = "file path is null"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r4)
            if (r0 != 0) goto L9d
            java.lang.String r0 = "file not exist"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r4)
            if (r0 != 0) goto L9d
            java.lang.String r0 = "auth is null"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r4)
            if (r0 != 0) goto L9d
            java.lang.String r0 = "invalid authconfig"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r4)
            if (r0 != 0) goto L3e
            java.lang.String r0 = "video"
            boolean r0 = kotlin.text.a0.LJJIIZI(r6, r0, r4)
            if (r0 == 0) goto La0
            java.lang.String r7 = "motion"
            goto L3e
        L9d:
            java.lang.String r7 = "setup"
            goto L3e
        La0:
            java.lang.String r7 = "still"
            goto L3e
        La3:
            r1 = 0
            goto L9
        La6:
            boolean r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lac
            monitor-exit(r1)
            return
        Lac:
            r3.LIZLLL = r2     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r1)
            r3.LIZ()
            r11.invoke()
            return
        Lb6:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2208181Bbc.LIZLLL(X.1Bbc, com.ss.android.ugc.aweme.comment.model.CommentImageModel, X.1BbB, long, java.lang.String, kotlin.jvm.internal.AwS578S0100000_34, int):void");
    }
}
