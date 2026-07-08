package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageLivePhotoModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS457S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.AwS72S1000000_22;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nM2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431480nM2 extends AbstractC1434490nQt {
    public final Function0<Unit> LLILZLL;
    public C1431070nLN LLIZ;
    public C1434960nRe LLIZLLLIL;
    public C1434970nRf LLJ;
    public VideoCreation LLJI;
    public SynthetiseResult LLJIJIL;
    public InterfaceC1434170nQN LLJILJIL;
    public List<String> LLJILLL;
    public List<C1431550nM9> LLJJ;
    public UploadImageConfig LLJJI;
    public C1431460nM0 LLJJIJI;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C1431990nMr LLL;
    public boolean LLLFF;
    public final C1431560nMA LLJILJILJ = new C1431560nMA();
    public final String LLJJIII = "ImageModeUpload";
    public final List<AbstractImageUploader> LLJJIJIIJIL = new CopyOnWriteArrayList();
    public final List<AbstractC1434250nQV> LLJJIJIL = new CopyOnWriteArrayList();
    public AtomicBoolean LLJJJJ = new AtomicBoolean(false);
    public AtomicBoolean LLJJJJJIL = new AtomicBoolean(false);
    public final int LLJJJJLIIL = 2003;
    public int LLJJL = -1;
    public final Map<String, AbstractImageUploader.ImageUploadInfo> LLJL = new LinkedHashMap();
    public final Map<String, C1431630nMH> LLJLIL = new LinkedHashMap();
    public final Map<String, Integer> LLJLILLLLZIIL = new LinkedHashMap();
    public final Map<String, Integer> LLJLL = new LinkedHashMap();
    public final C1431640nMI LLJLLIL = new C1431640nMI(LSPassThroughRecordSizeConfig.DEFAULT, false);
    public final int LLJLLL = 10;
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(443));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(444));
    public final C1431540nM8 LLLF = new InterfaceC1432000nMs() { // from class: X.0nM8
        @Override // X.InterfaceC1432000nMs
        public final String LIZIZ() {
            try {
                AbstractImageUploader abstractImageUploader = (AbstractImageUploader) C13LP.LJJLIIIJL(this.LIZ.LLJJIJIIJIL);
                if (abstractImageUploader != null) {
                    String strLJIIIIZZ = abstractImageUploader.LJIIIIZZ();
                    if (strLJIIIIZZ != null) {
                        return strLJIIIIZZ;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return "";
        }

        @Override // X.InterfaceC1432000nMs
        public final EnumC1434770nRL LIZ() {
            return EnumC1434770nRL.UPLOAD;
        }
    };

    public final void LJIILL() {
        for (AbstractImageUploader abstractImageUploader : this.LLJJIJIIJIL) {
            if (abstractImageUploader != null) {
                abstractImageUploader.LIZJ();
            }
        }
        for (AbstractC1434250nQV abstractC1434250nQV : this.LLJJIJIL) {
            if (abstractC1434250nQV != null) {
                abstractC1434250nQV.LIZJ();
            }
        }
    }

    public final int LJIILLIIL() {
        return ((Number) this.LLJZ.getValue()).intValue();
    }

    public final void LJIIZILJ() {
        if (this.LLJJJJ.get() && this.LLJJJJJIL.get()) {
            C1431460nM0 c1431460nM0 = this.LLJJIJI;
            if (c1431460nM0 == null) {
                c1431460nM0 = null;
            }
            c1431460nM0.LIZIZ(this.LLJL, this.LLJLIL);
        }
    }

    public final void LJIJJ() {
        if (this.LLJJJJ.get() && this.LLJJJJJIL.get()) {
            ((C1431570nMB) this.LLJZIJLIL.getValue()).LIZ();
            this.LLILZLL.invoke();
        }
    }

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.UPLOAD;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0nM8] */
    public C1431480nM2(Function0<Unit> function0) {
        this.LLILZLL = function0;
    }

    public final C1431600nME LJIILJJIL(int i) {
        int i2 = this.LLJLLL + i;
        List<String> list = this.LLJILLL;
        if (list == null) {
            list = null;
        }
        return new C1431600nME(i, Math.min(i2, list.size()) - i);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0nM4] */
    public final void LJIJJLI(final C1431600nME c1431600nME) {
        List<String> list = null;
        try {
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("image startUpload, startIndex = ");
            sbLIZ.append(c1431600nME.LIZ);
            sbLIZ.append(", uploadSize = ");
            sbLIZ.append(c1431600nME.LIZIZ);
            c1437510nVlLJJLIIIJ.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ));
            UploadImageConfig uploadImageConfig = this.LLJJI;
            if (uploadImageConfig == null) {
                uploadImageConfig = null;
            }
            final C2207831Bb3 c2207831Bb3 = new C2207831Bb3(uploadImageConfig);
            ((CopyOnWriteArrayList) this.LLJJIJIIJIL).add(c2207831Bb3);
            c2207831Bb3.LJIIJJI(C19221910Hx.LJFF());
            C2208411Bbz c2208411Bbz = new C2208411Bbz();
            UploadImageConfig uploadImageConfig2 = this.LLJJI;
            if (uploadImageConfig2 == null) {
                uploadImageConfig2 = null;
            }
            c2208411Bbz.LIZJ(uploadImageConfig2);
            c2207831Bb3.LJIIL(c2208411Bbz.LIZLLL());
            c2207831Bb3.LJIILJJIL(new AwS35S0010000_22(37));
            c2207831Bb3.LJIILJJIL(new AwS601S0100000_22((C1431500nM4) new AbstractC1431590nMD() { // from class: X.0nM4
                @Override // X.AbstractC1431590nMD
                public final String LIZ() {
                    C1434960nRe c1434960nRe = this.LLIZLLLIL;
                    if (c1434960nRe == null) {
                        c1434960nRe = null;
                    }
                    VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("common", C1444210ngZ.LIZ());
                        jSONObject.put("multiMedia", C1444210ngZ.LIZIZ(videoPublishEditModel));
                        C140D.LIZ.getClass();
                        List<AIGCInfo> list2 = C140D.LJJIIZ(videoPublishEditModel).LIZ;
                        boolean z = false;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<AIGCInfo> it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                AIGCInfo next = it2.next();
                                if (next != null && next.getType() == 2) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        if (z) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("contain_c2pa_metadata", 1);
                            jSONObject.put("c2pa_metadata", jSONObject2);
                        }
                        return C786410Ut5.J3(jSONObject);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return "";
                    }
                }

                @Override // X.AbstractC1431590nMD
                public final void LIZIZ(int i, long j) {
                    C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onUploadStage, stage = ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", timestamp = ");
                    sbLIZ2.append(j);
                    sbLIZ2.append(" startIndex = ");
                    sbLIZ2.append(c1431600nME.LIZ);
                    sbLIZ2.append(", uploadSize = ");
                    sbLIZ2.append(c1431600nME.LIZIZ);
                    c1437510nVlLJJLIIIJ2.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ2));
                    if (i == this.LLJJJJLIIL) {
                        C1437510nVl c1437510nVlLJJLIIIJ3 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("image upload done, startIndex = ");
                        sbLIZ3.append(c1431600nME.LIZ);
                        sbLIZ3.append(", uploadSize = ");
                        sbLIZ3.append(c1431600nME.LIZIZ);
                        c1437510nVlLJJLIIIJ3.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ3));
                        C1431600nME c1431600nME2 = c1431600nME;
                        int i2 = c1431600nME2.LIZ + c1431600nME2.LIZIZ;
                        List<String> list2 = this.LLJILLL;
                        if (list2 == null) {
                            list2 = null;
                        }
                        if (i2 >= list2.size()) {
                            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("upload", "image all image upload done");
                            this.LLJJJJ.set(true);
                            this.LJIJJ();
                        } else {
                            C1431480nM2 c1431480nM2 = this;
                            C1431600nME c1431600nME3 = c1431600nME;
                            c1431480nM2.LJIJJLI(c1431480nM2.LJIILJJIL(c1431600nME3.LIZ + c1431600nME3.LIZIZ));
                        }
                    }
                }
            }, 908));
            if (this.LLJJJ) {
                C1431070nLN c1431070nLN = this.LLIZ;
                if (c1431070nLN == null) {
                    c1431070nLN = null;
                }
                c1431070nLN.LIZIZ(new C1405020mfM(LJIILLIIL(), this.LLJJJIL), EnumC2251001D8o.OUTER);
                c2207831Bb3.LJIILJJIL(new AwS35S0001000_22(LJIILLIIL(), 34));
                c2207831Bb3.LJIILJJIL(new AwS35S0001000_22(C0C64.LJIILLIIL().LJIJ(31744, 5242880, "images_pre_upload_slice_size", true), 35));
                if (this.LLJJJIL) {
                    for (AbstractImageUploader abstractImageUploader : (CopyOnWriteArrayList) this.LLJJIJIIJIL) {
                        if (!abstractImageUploader.LIZ) {
                            abstractImageUploader.LIZ();
                        }
                    }
                }
            }
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ImageGroupUploadTask start image upload image start  imagePaths = ");
                List<String> list2 = this.LLJILLL;
                if (list2 == null) {
                    list2 = null;
                }
                sbLIZ2.append(list2.size());
                C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                c2207831Bb3.LJIIJ(new InterfaceC2207871Bb7() { // from class: X.0nM3
                    @Override // X.InterfaceC2207871Bb7
                    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                        c2207831Bb3.LJ();
                        if (i == 6) {
                            C1431480nM2 c1431480nM2 = this;
                            LIZIZ(imageUploadInfo, c1431480nM2, c1431600nME, "ImageComplete", new AwS636S0100000_22(c1431480nM2, 56));
                            return;
                        }
                        c2207831Bb3.LJFF();
                        if (i == 7) {
                            C1431480nM2 c1431480nM22 = this;
                            LIZIZ(imageUploadInfo, c1431480nM22, c1431600nME, "ImageFailed", new AwS636S0100000_22(c1431480nM22, 57));
                            return;
                        }
                        c2207831Bb3.LJII();
                        if (i == 3) {
                            C1431480nM2 c1431480nM23 = this;
                            LIZIZ(imageUploadInfo, c1431480nM23, c1431600nME, "ImagePreUploadCancel", new AwS457S0200000_22(c1431480nM23, c2207831Bb3, 4));
                            return;
                        }
                        c2207831Bb3.LJI();
                        if (i == 1) {
                            C1431480nM2 c1431480nM24 = this;
                            LIZIZ(imageUploadInfo, c1431480nM24, c1431600nME, "ImageProgress", new C1431530nM7(c1431480nM24, j));
                            return;
                        }
                        c2207831Bb3.LIZLLL();
                        if (i != 0) {
                            return;
                        }
                        c2207831Bb3.LIZJ();
                        ((CopyOnWriteArrayList) this.LLJJIJIIJIL).remove(c2207831Bb3);
                        C1431480nM2 c1431480nM25 = this;
                        if (c1431480nM25.LLJJJ) {
                            if (((CopyOnWriteArrayList) c1431480nM25.LLJJIJIIJIL).size() != 0) {
                                return;
                            }
                            this.LLJJJJ.set(true);
                            this.LJIIZILJ();
                            return;
                        }
                        C1431600nME c1431600nME2 = c1431600nME;
                        int i2 = c1431600nME2.LIZ + c1431600nME2.LIZIZ;
                        List<String> list3 = c1431480nM25.LLJILLL;
                        if (list3 == null) {
                            list3 = null;
                        }
                        if (i2 >= list3.size()) {
                            this.LLJJJJ.set(true);
                            this.LJIIZILJ();
                        } else {
                            C1431480nM2 c1431480nM26 = this;
                            C1431600nME c1431600nME3 = c1431600nME;
                            c1431480nM26.LJIJJLI(c1431480nM26.LJIILJJIL(c1431600nME3.LIZ + c1431600nME3.LIZIZ));
                        }
                    }

                    @Override // X.InterfaceC2207871Bb7
                    public final void onLog(int i, int i2, String str) {
                        C2344809Gs.LIZLLL(3, "ImageUploader", str);
                        if (i != 100) {
                            if (i == 101) {
                                C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("[ttmn]onLog: what=");
                                sbLIZ3.append(i);
                                sbLIZ3.append(", code=");
                                sbLIZ3.append(i2);
                                sbLIZ3.append(", info=");
                                sbLIZ3.append(str);
                                c1437510nVlLJJLIIIJ2.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ3));
                                return;
                            }
                            return;
                        }
                        C1437510nVl c1437510nVlLJJLIIIJ3 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("[ttmn]onLog: what=");
                        sbLIZ4.append(i);
                        sbLIZ4.append(", code=");
                        sbLIZ4.append(i2);
                        sbLIZ4.append(", info=");
                        sbLIZ4.append(str);
                        c1437510nVlLJJLIIIJ3.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ4));
                    }

                    public static final void LIZIZ(AbstractImageUploader.ImageUploadInfo imageUploadInfo, C1431480nM2 c1431480nM2, C1431600nME c1431600nME2, String str, Function2<? super Integer, ? super AbstractImageUploader.ImageUploadInfo, Unit> function2) {
                        if (imageUploadInfo == null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(str);
                            sbLIZ3.append(" and Null info ");
                            sbLIZ3.append(c1431480nM2.LLJJIII);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            C1AF0.LIZJ(strLIZIZ);
                            c1431480nM2.LJIILL();
                            if (!c1431480nM2.LLJJLIIIJLLLLLLLZ) {
                                c1431480nM2.LLJJLIIIJLLLLLLLZ = true;
                                c1431480nM2.LJIJ(imageUploadInfo, strLIZIZ);
                                return;
                            }
                            return;
                        }
                        function2.invoke(Integer.valueOf(c1431600nME2.LIZ + imageUploadInfo.mFileIndex), imageUploadInfo);
                    }
                });
                int i = c1431600nME.LIZIZ;
                List<String> list3 = this.LLJILLL;
                if (list3 == null) {
                    list3 = null;
                }
                int i2 = c1431600nME.LIZ;
                c2207831Bb3.LJIIIZ(i, (String[]) list3.subList(i2, i2 + i).toArray(new String[0]));
                if (((Boolean) C0B01.LIZ.getValue()).booleanValue()) {
                    C1434960nRe c1434960nRe = this.LLIZLLLIL;
                    if (c1434960nRe == null) {
                        c1434960nRe = null;
                    }
                    if (C1428470nHB.LJJLIIIIJ(c1434960nRe.LIZ)) {
                        c2207831Bb3.LJIILJJIL(new AwS72S1000000_22(14));
                    }
                }
                c2207831Bb3.LJIILIIL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJIIJIL).iterator();
                while (it2.hasNext()) {
                    ((AbstractImageUploader) it2.next()).LIZJ();
                }
                throw e;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ImageGroupUploadTask start image upload image failed e = ");
            sbLIZ3.append(e2.getMessage());
            sbLIZ3.append(" imagePaths = ");
            List<String> list4 = this.LLJILLL;
            if (list4 != null) {
                list = list4;
            }
            sbLIZ3.append(list.size());
            C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ3));
            LJIJ(new AbstractImageUploader.ImageUploadInfo(-1, null, -39999L, null, null, 0L, null, null), "init crash");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[PHI: r1
      0x001a: PHI (r1v4 ??) = (r1v2 ??), (r1v26 ??), (r1v27 ??) binds: [B:74:0x0145, B:10:0x0018, B:8:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.List<com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel>] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List<com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel>] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r22) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1431480nM2.LJIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static void LJIJI(C1431480nM2 c1431480nM2, C1434330nQd c1434330nQd) {
        C1431990nMr c1431990nMr;
        c1431480nM2.getClass();
        int iLJII = C1431420nLw.LJII(c1434330nQd);
        Integer numValueOf = Integer.valueOf(iLJII);
        C1431070nLN c1431070nLN = c1431480nM2.LLIZ;
        if (c1431070nLN != null && c1431070nLN.LIZJ < C291170Bb9.LIZ() && C0C2T.LIZ(numValueOf)) {
            C0Z6N.LIZ(new AwS566S0100000_22(c1431480nM2, 1003));
            return;
        }
        C1431070nLN c1431070nLN2 = null;
        if (((Set) C115400cC.LIZIZ.getValue()).contains(Integer.valueOf(iLJII))) {
            C1434970nRf c1434970nRf = c1431480nM2.LLJ;
            if (c1434970nRf == null) {
                c1434970nRf = null;
            }
            if (c1434970nRf.LIZ.publishType == 0) {
                C1402780mbk c1402780mbk = C1402780mbk.LIZ;
                C1434960nRe c1434960nRe = c1431480nM2.LLIZLLLIL;
                if (c1434960nRe == null) {
                    c1434960nRe = null;
                }
                VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
                Integer numValueOf2 = Integer.valueOf(iLJII);
                c1402780mbk.getClass();
                C1402780mbk.LIZ(videoPublishEditModel, "/top/v1", numValueOf2);
            }
        }
        if (iLJII == -39996) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ImageFileLostChecker]count: ");
            List<String> list = c1431480nM2.LLJILLL;
            if (list == null) {
                list = null;
            }
            sbLIZ.append(list.size());
            sbLIZ.append(", path: ");
            List<String> list2 = c1431480nM2.LLJILLL;
            if (list2 == null) {
                list2 = null;
            }
            sbLIZ.append(C13LP.LJJLIIIJ(list2, null, null, null, 0, null, null, 63));
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1431070nLN c1431070nLN3 = c1431480nM2.LLIZ;
        if (c1431070nLN3 != null) {
            c1431070nLN2 = c1431070nLN3;
        }
        c1431070nLN2.LIZLLL(iLJII, c1434330nQd);
        if (!C299860BpA.LIZ() || (c1431990nMr = c1431480nM2.LLL) == null) {
            return;
        }
        c1431990nMr.LIZ.remove(c1431480nM2.LLLF);
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        if (!(abstractC1404540mea instanceof C1404550meb) && this.LLJJJ) {
            if (((CopyOnWriteArrayList) this.LLJJIJIIJIL).size() > 0 || ((CopyOnWriteArrayList) this.LLJJIJIL).size() > 0) {
                Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJIIJIL).iterator();
                while (it2.hasNext()) {
                    ((AbstractImageUploader) it2.next()).LIZIZ();
                }
                Iterator it3 = ((CopyOnWriteArrayList) this.LLJJIJIL).iterator();
                while (it3.hasNext()) {
                    ((AbstractC1434250nQV) it3.next()).LIZIZ();
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List<X.0nM9>] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object next;
        Object next2;
        Integer numValueOf;
        ?? arrayList;
        String str;
        List<C1431550nM9> list;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        Integer numValueOf5;
        List<SingleImageData> imageList3;
        C1431990nMr c1431990nMr;
        ?? arrayList2;
        String str2;
        String str3;
        SynthetiseResult synthetiseResult;
        ArrayList arrayList3;
        Object c098200Yq;
        List<SingleImageData> imageList4;
        Object next3;
        C0CH0.LIZ(3);
        this.LLJJJJ = new AtomicBoolean(false);
        this.LLJJJJJIL = new AtomicBoolean(false);
        this.LLIZ = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            List<String> list2 = null;
            C1431070nLN c1431070nLN2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next4 = it2.next();
            if (next4 instanceof C1404770mex) {
                if (next4 != null) {
                    this.LLJI = ((C1404770mex) next4).LIZ;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next5 = it3.next();
                        if (next5 instanceof C1434960nRe) {
                            if (next5 != null) {
                                this.LLIZLLLIL = (C1434960nRe) next5;
                                Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next6 = it4.next();
                                    if (next6 instanceof C1434970nRf) {
                                        if (next6 != null) {
                                            this.LLJ = (C1434970nRf) next6;
                                            Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    break;
                                                }
                                                Object next7 = it5.next();
                                                if (next7 instanceof C1404570med) {
                                                    if (next7 != null) {
                                                        Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                next = it6.next();
                                                                if (next == null || (next instanceof C1431990nMr)) {
                                                                    break;
                                                                }
                                                            } else {
                                                                next = null;
                                                                break;
                                                            }
                                                        }
                                                        if (!(next instanceof C1431990nMr)) {
                                                            next = null;
                                                        }
                                                        this.LLL = (C1431990nMr) next;
                                                        if (C0BYW.LIZ()) {
                                                            Iterator<Object> it7 = c1404610meh.LIZ.iterator();
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    next3 = it7.next();
                                                                    if (next3 instanceof SynthetiseResult) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    next3 = null;
                                                                    break;
                                                                }
                                                            }
                                                            if (!(next3 instanceof SynthetiseResult)) {
                                                                next3 = null;
                                                            }
                                                            SynthetiseResult synthetiseResult2 = (SynthetiseResult) next3;
                                                            if (synthetiseResult2 == null) {
                                                                InterfaceC1434170nQN interfaceC1434170nQN = this.LLJILJIL;
                                                                if (interfaceC1434170nQN != null) {
                                                                    interfaceC1434170nQN.LIZIZ();
                                                                }
                                                                C1431070nLN c1431070nLN3 = this.LLIZ;
                                                                if (c1431070nLN3 != null) {
                                                                    c1431070nLN2 = c1431070nLN3;
                                                                }
                                                                c1431070nLN2.LIZIZ(new C1430840nL0(), EnumC2251001D8o.OUTER);
                                                                return;
                                                            }
                                                            this.LLJIJIL = synthetiseResult2;
                                                        } else {
                                                            Iterator<Object> it8 = c1404610meh.LIZ.iterator();
                                                            while (true) {
                                                                if (!it8.hasNext()) {
                                                                    break;
                                                                }
                                                                Object next8 = it8.next();
                                                                if (next8 instanceof SynthetiseResult) {
                                                                    if (next8 != null) {
                                                                        this.LLJIJIL = (SynthetiseResult) next8;
                                                                    }
                                                                }
                                                            }
                                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.SynthetiseResult");
                                                        }
                                                        Iterator<Object> it9 = c1404610meh.LIZ.iterator();
                                                        while (true) {
                                                            if (it9.hasNext()) {
                                                                next2 = it9.next();
                                                                if (next2 == null || (next2 instanceof InterfaceC1434170nQN)) {
                                                                    break;
                                                                }
                                                            } else {
                                                                next2 = null;
                                                                break;
                                                            }
                                                        }
                                                        if (!(next2 instanceof InterfaceC1434170nQN)) {
                                                            next2 = null;
                                                        }
                                                        this.LLJILJIL = (InterfaceC1434170nQN) next2;
                                                        Iterator<Object> it10 = c1404610meh.LIZ.iterator();
                                                        while (true) {
                                                            if (!it10.hasNext()) {
                                                                break;
                                                            }
                                                            Object next9 = it10.next();
                                                            if (next9 instanceof C1434970nRf) {
                                                                if (next9 != null) {
                                                                    this.LLJJL = ((C1434970nRf) next9).LIZ.publishType;
                                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                    sbLIZ.append("ImageGroupUploadTask start image  size = ");
                                                                    C1434960nRe c1434960nRe = this.LLIZLLLIL;
                                                                    if (c1434960nRe == null) {
                                                                        c1434960nRe = null;
                                                                    }
                                                                    ImageAlbumData imageAlbumData = c1434960nRe.LIZ.getImageAlbumData();
                                                                    if (imageAlbumData != null && (imageList4 = imageAlbumData.getImageList()) != null) {
                                                                        numValueOf = Integer.valueOf(imageList4.size());
                                                                    } else {
                                                                        numValueOf = null;
                                                                    }
                                                                    sbLIZ.append(numValueOf);
                                                                    C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ));
                                                                    Iterator<Object> it11 = c1404610meh.LIZ.iterator();
                                                                    while (true) {
                                                                        if (!it11.hasNext()) {
                                                                            break;
                                                                        }
                                                                        Object next10 = it11.next();
                                                                        if (next10 instanceof C1405220mfg) {
                                                                            if (next10 != null) {
                                                                                C1405220mfg c1405220mfg = (C1405220mfg) next10;
                                                                                c1405220mfg.LIZJ(new AwS601S0100000_22(this, 758));
                                                                                if (this.LLJJL == 2 && LJIILLIIL() > 0 && !c1405220mfg.LIZIZ) {
                                                                                    this.LLJJJ = true;
                                                                                }
                                                                                C1434960nRe c1434960nRe2 = this.LLIZLLLIL;
                                                                                if (c1434960nRe2 == null) {
                                                                                    c1434960nRe2 = null;
                                                                                }
                                                                                C571720Mba.LIZ(c1434960nRe2.LIZ, "ImageGroupUploadTask");
                                                                                VideoCreation videoCreation = this.LLJI;
                                                                                if (videoCreation == null) {
                                                                                    videoCreation = null;
                                                                                }
                                                                                UploadImageConfig uploadImageConfig = ((UploadAuthKeyConfig) videoCreation).photoModeUploadConfig;
                                                                                if (uploadImageConfig == null) {
                                                                                    LJIJI(this, new C1434330nQd(C1431470nM1.LIZ(2001), null, 2, null));
                                                                                    return;
                                                                                }
                                                                                C1434960nRe c1434960nRe3 = this.LLIZLLLIL;
                                                                                if (c1434960nRe3 == null) {
                                                                                    c1434960nRe3 = null;
                                                                                }
                                                                                if (!LJIL(c1434960nRe3.LIZ)) {
                                                                                    return;
                                                                                }
                                                                                if (C296170BjD.LIZ()) {
                                                                                    SynthetiseResult synthetiseResult3 = this.LLJIJIL;
                                                                                    if (synthetiseResult3 == null) {
                                                                                        synthetiseResult = null;
                                                                                        synthetiseResult3 = null;
                                                                                    } else {
                                                                                        synthetiseResult = synthetiseResult3;
                                                                                    }
                                                                                    List<PublishImageModel> list3 = synthetiseResult3.imageSynthesisResult;
                                                                                    if (list3 != null) {
                                                                                        arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                                                                        for (PublishImageModel publishImageModel : list3) {
                                                                                            String str4 = publishImageModel.path;
                                                                                            if (C2471909mP.LJJIIZI(str4)) {
                                                                                                try {
                                                                                                    c098200Yq = UriProtector.parse(str4);
                                                                                                    C189200o6.m2constructorimpl(c098200Yq);
                                                                                                } catch (Throwable th) {
                                                                                                    TryCatchGuardChecker.doCheck(th);
                                                                                                    c098200Yq = new C098200Yq(th);
                                                                                                    C189200o6.m2constructorimpl(c098200Yq);
                                                                                                }
                                                                                                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                                                                                    c098200Yq = null;
                                                                                                }
                                                                                                String strLIZ = C09N5.LIZ(C786410Ut5.M3(C1BWL.LIZ()), (Uri) c098200Yq);
                                                                                                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("upload", "ImageGroupUploadTask -> handle uri path -> oldPath: " + str4 + ", newPath: " + strLIZ);
                                                                                                str4 = strLIZ;
                                                                                            }
                                                                                            arrayList3.add(publishImageModel.copy(str4, publishImageModel.width, publishImageModel.height, publishImageModel.uri, publishImageModel.publishImageLivePhotoModel, publishImageModel.compiled));
                                                                                        }
                                                                                    } else {
                                                                                        arrayList3 = null;
                                                                                    }
                                                                                    synthetiseResult.imageSynthesisResult = arrayList3;
                                                                                }
                                                                                SynthetiseResult synthetiseResult4 = this.LLJIJIL;
                                                                                if (synthetiseResult4 == null) {
                                                                                    synthetiseResult4 = null;
                                                                                }
                                                                                List<PublishImageModel> arrayList4 = synthetiseResult4.imageSynthesisResult;
                                                                                C1434960nRe c1434960nRe4 = this.LLIZLLLIL;
                                                                                if (c1434960nRe4 == null) {
                                                                                    c1434960nRe4 = null;
                                                                                }
                                                                                if (C568750MSj.LIZIZ(c1434960nRe4.LIZ)) {
                                                                                    if (arrayList4 != null) {
                                                                                        int i = 0;
                                                                                        for (Object obj : arrayList4) {
                                                                                            int i2 = i + 1;
                                                                                            if (i >= 0) {
                                                                                                PublishImageModel publishImageModel2 = (PublishImageModel) obj;
                                                                                                if (!publishImageModel2.compiled) {
                                                                                                    if (((Boolean) C281090Azz.LIZ.getValue()).booleanValue()) {
                                                                                                        str3 = publishImageModel2.uri;
                                                                                                        if (str3 == null) {
                                                                                                            str3 = "";
                                                                                                        }
                                                                                                    } else {
                                                                                                        str3 = publishImageModel2.path;
                                                                                                    }
                                                                                                    this.LLJL.put(str3, new AbstractImageUploader.ImageUploadInfo(i, publishImageModel2.uri, 0L, null, null, 0L, null, null));
                                                                                                }
                                                                                                i = i2;
                                                                                            } else {
                                                                                                C1697810uHb.LJIJI();
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                        ArrayList arrayList5 = new ArrayList();
                                                                                        for (Object obj2 : arrayList4) {
                                                                                            if (((PublishImageModel) obj2).compiled) {
                                                                                                arrayList5.add(obj2);
                                                                                            }
                                                                                        }
                                                                                        arrayList = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
                                                                                        Iterator it12 = arrayList5.iterator();
                                                                                        while (it12.hasNext()) {
                                                                                            arrayList.add(((PublishImageModel) it12.next()).path);
                                                                                        }
                                                                                    } else {
                                                                                        arrayList = C13BV.INSTANCE;
                                                                                    }
                                                                                } else if (arrayList4 != null) {
                                                                                    arrayList = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                                                                                    Iterator it13 = arrayList4.iterator();
                                                                                    while (it13.hasNext()) {
                                                                                        arrayList.add(((PublishImageModel) it13.next()).path);
                                                                                    }
                                                                                } else {
                                                                                    arrayList = C13BV.INSTANCE;
                                                                                }
                                                                                this.LLJILLL = arrayList;
                                                                                if (C295670BiP.LIZ()) {
                                                                                    if (arrayList4 != null) {
                                                                                        arrayList2 = new ArrayList();
                                                                                        for (PublishImageModel publishImageModel3 : arrayList4) {
                                                                                            PublishImageLivePhotoModel publishImageLivePhotoModel = publishImageModel3.publishImageLivePhotoModel;
                                                                                            if (publishImageLivePhotoModel != null && (str2 = publishImageLivePhotoModel.path) != null && C1428270nGr.LIZ(str2)) {
                                                                                                arrayList2.add(new C1431550nM9(str2, publishImageModel3.path));
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        arrayList2 = C13BV.INSTANCE;
                                                                                    }
                                                                                    this.LLJJ = arrayList2;
                                                                                }
                                                                                this.LLJJI = uploadImageConfig;
                                                                                if (arrayList4 == null) {
                                                                                    arrayList4 = new ArrayList();
                                                                                }
                                                                                this.LLJJIJI = new C1431460nM0(this, arrayList4);
                                                                                if (C299860BpA.LIZ() && (c1431990nMr = this.LLL) != null) {
                                                                                    c1431990nMr.LIZ.add(this.LLLF);
                                                                                }
                                                                                C1434960nRe c1434960nRe5 = this.LLIZLLLIL;
                                                                                if (c1434960nRe5 == null) {
                                                                                    c1434960nRe5 = null;
                                                                                }
                                                                                if (!C568750MSj.LIZIZ(c1434960nRe5.LIZ)) {
                                                                                    List<String> list4 = this.LLJILLL;
                                                                                    if (list4 == null) {
                                                                                        list4 = null;
                                                                                    }
                                                                                    if (list4.isEmpty()) {
                                                                                        C1AF0.LIZJ("ImageGroupUploadTask empty imagePaths");
                                                                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                                        sbLIZ2.append("ImageGroupUploadTask start image  imagePaths is empty size = ");
                                                                                        C1434960nRe c1434960nRe6 = this.LLIZLLLIL;
                                                                                        if (c1434960nRe6 == null) {
                                                                                            c1434960nRe6 = null;
                                                                                        }
                                                                                        ImageAlbumData imageAlbumData2 = c1434960nRe6.LIZ.getImageAlbumData();
                                                                                        if (imageAlbumData2 != null && (imageList3 = imageAlbumData2.getImageList()) != null) {
                                                                                            numValueOf5 = Integer.valueOf(imageList3.size());
                                                                                        } else {
                                                                                            numValueOf5 = null;
                                                                                        }
                                                                                        sbLIZ2.append(numValueOf5);
                                                                                        C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                                                                                        LJIJI(this, new C1434330nQd(C1431470nM1.LIZ(-39998), null, 2, null));
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                if (C295670BiP.LIZ() && (list = this.LLJJ) != null && !list.isEmpty()) {
                                                                                    this.LLJILJILJ.LJ = new InterfaceC1434290nQZ() { // from class: X.0nM6
                                                                                        @Override // X.InterfaceC1434290nQZ
                                                                                        public final void LIZ() {
                                                                                        }

                                                                                        @Override // X.InterfaceC1434290nQZ
                                                                                        public final void LIZIZ() {
                                                                                        }

                                                                                        @Override // X.InterfaceC1434290nQZ
                                                                                        public final void LJI() {
                                                                                        }

                                                                                        @Override // X.InterfaceC1434290nQZ
                                                                                        public final void LJII() {
                                                                                        }

                                                                                        @Override // X.InterfaceC1434290nQZ
                                                                                        public final void LIZLLL() {
                                                                                            this.LIZ.LLJJJJJIL.set(true);
                                                                                            this.LIZ.LJIIZILJ();
                                                                                        }

                                                                                        @Override // X.InterfaceC1434290nQZ
                                                                                        public final void LIZJ(C1405130mfX c1405130mfX) {
                                                                                            if (c1405130mfX.LIZ == 1003) {
                                                                                                this.LIZ.LJIJJ();
                                                                                            }
                                                                                        }

                                                                                        @Override // X.InterfaceC1434290nQZ
                                                                                        public final void LJIIIIZZ(C1434330nQd c1434330nQd) {
                                                                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                                            sbLIZ3.append("ImageGroupUploadTask start video upload video failed exception = ");
                                                                                            sbLIZ3.append(c1434330nQd.getErrorCode());
                                                                                            sbLIZ3.append(' ');
                                                                                            C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ3));
                                                                                            C1431480nM2.LJIJI(this.LIZ, c1434330nQd);
                                                                                        }

                                                                                        @Override // X.InterfaceC1434290nQZ
                                                                                        public final void LJ(AbstractC1434250nQV abstractC1434250nQV, C1431630nMH c1431630nMH) {
                                                                                            abstractC1434250nQV.LIZJ();
                                                                                            ((CopyOnWriteArrayList) this.LIZ.LLJJIJIL).remove(abstractC1434250nQV);
                                                                                            C1434330nQd c1434330nQd = new C1434330nQd(c1431630nMH, null, 2, null);
                                                                                            C1431420nLw.LJFF(c1434330nQd);
                                                                                            C1431480nM2 c1431480nM2 = this.LIZ;
                                                                                            if (c1431480nM2.LLJJJ) {
                                                                                                if (((CopyOnWriteArrayList) c1431480nM2.LLJJIJIL).size() == 0) {
                                                                                                    C1431480nM2.LJIJI(this.LIZ, c1434330nQd);
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            C1431480nM2.LJIJI(c1431480nM2, c1434330nQd);
                                                                                        }

                                                                                        @Override // X.InterfaceC1434290nQZ
                                                                                        public final void LJFF(C1431550nM9 c1431550nM9, float f) {
                                                                                            this.LIZ.LLJLL.put(c1431550nM9.LIZIZ, Integer.valueOf((int) f));
                                                                                            C1431480nM2 c1431480nM2 = this.LIZ;
                                                                                            C1431640nMI.LIZ(c1431480nM2.LLJLLIL, new C1431510nM5(c1431480nM2));
                                                                                        }

                                                                                        @Override // X.InterfaceC1434290nQZ
                                                                                        public final void LJIIIZ(C1431550nM9 c1431550nM9, C1431630nMH c1431630nMH) {
                                                                                            this.LIZ.LLJLIL.put(c1431550nM9.LIZIZ, c1431630nMH);
                                                                                            this.LIZ.LLJLL.put(c1431550nM9.LIZIZ, 100);
                                                                                        }
                                                                                    };
                                                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                                    sbLIZ3.append("ImageGroupUploadTask start video upload  liveVideoPaths = ");
                                                                                    List<C1431550nM9> list5 = this.LLJJ;
                                                                                    if (list5 != null) {
                                                                                        numValueOf2 = Integer.valueOf(list5.size());
                                                                                    } else {
                                                                                        numValueOf2 = null;
                                                                                    }
                                                                                    sbLIZ3.append(numValueOf2);
                                                                                    sbLIZ3.append(" image size = ");
                                                                                    C1434960nRe c1434960nRe7 = this.LLIZLLLIL;
                                                                                    if (c1434960nRe7 == null) {
                                                                                        c1434960nRe7 = null;
                                                                                    }
                                                                                    ImageAlbumData imageAlbumData3 = c1434960nRe7.LIZ.getImageAlbumData();
                                                                                    if (imageAlbumData3 != null && (imageList2 = imageAlbumData3.getImageList()) != null) {
                                                                                        numValueOf3 = Integer.valueOf(imageList2.size());
                                                                                    } else {
                                                                                        numValueOf3 = null;
                                                                                    }
                                                                                    sbLIZ3.append(numValueOf3);
                                                                                    C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ3));
                                                                                    List<C1431550nM9> list6 = this.LLJJ;
                                                                                    if (list6 != null) {
                                                                                        for (C1431550nM9 c1431550nM9 : list6) {
                                                                                            C1431560nMA c1431560nMA = this.LLJILJILJ;
                                                                                            synchronized (c1431560nMA.LIZLLL) {
                                                                                                try {
                                                                                                    c1431560nMA.LIZ++;
                                                                                                } catch (Throwable th2) {
                                                                                                    TryCatchGuardChecker.doCheck(th2);
                                                                                                    throw th2;
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                                                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                                                sbLIZ4.append("video group startUpload,path = ");
                                                                                                sbLIZ4.append(c1431550nM9);
                                                                                                c1437510nVlLJJLIIIJ.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ4));
                                                                                                InterfaceC1434300nQa interfaceC1434300nQaLJIIIZ = LJIIIZ();
                                                                                                C1431070nLN c1431070nLN4 = this.LLIZ;
                                                                                                if (c1431070nLN4 == null) {
                                                                                                    c1431070nLN4 = null;
                                                                                                }
                                                                                                C1434220nQS c1434220nQS = new C1434220nQS(interfaceC1434300nQaLJIIIZ, c1431070nLN4, c1431550nM9);
                                                                                                C1434960nRe c1434960nRe8 = this.LLIZLLLIL;
                                                                                                if (c1434960nRe8 == null) {
                                                                                                    c1434960nRe8 = null;
                                                                                                }
                                                                                                VideoCreation videoCreation2 = this.LLJI;
                                                                                                if (videoCreation2 == null) {
                                                                                                    videoCreation2 = null;
                                                                                                }
                                                                                                AbstractC1434250nQV abstractC1434250nQVLIZ = c1434220nQS.LIZ(c1434960nRe8, videoCreation2, LJIIIZ(), LJIILLIIL(), this.LLJJJIL, this.LLJILJILJ, AFwS261S0000000_22.get$arr$(317));
                                                                                                if (abstractC1434250nQVLIZ != null) {
                                                                                                    ((CopyOnWriteArrayList) this.LLJJIJIL).add(abstractC1434250nQVLIZ);
                                                                                                    AbstractC1434250nQV abstractC1434250nQV = c1434220nQS.LIZIZ;
                                                                                                    if (abstractC1434250nQV != null) {
                                                                                                        abstractC1434250nQV.LJJII();
                                                                                                    }
                                                                                                }
                                                                                            } catch (Exception e) {
                                                                                                TryCatchGuardChecker.doCheck(e);
                                                                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                                                                sbLIZ5.append("ImageGroupUploadTask start video upload  failed e = ");
                                                                                                sbLIZ5.append(e.getMessage());
                                                                                                sbLIZ5.append(" size = ");
                                                                                                C1434960nRe c1434960nRe9 = this.LLIZLLLIL;
                                                                                                if (c1434960nRe9 == null) {
                                                                                                    c1434960nRe9 = null;
                                                                                                }
                                                                                                ImageAlbumData imageAlbumData4 = c1434960nRe9.LIZ.getImageAlbumData();
                                                                                                if (imageAlbumData4 != null && (imageList = imageAlbumData4.getImageList()) != null) {
                                                                                                    numValueOf4 = Integer.valueOf(imageList.size());
                                                                                                } else {
                                                                                                    numValueOf4 = null;
                                                                                                }
                                                                                                sbLIZ5.append(numValueOf4);
                                                                                                C1450070nq1.LJI(C2188811AlT.LIZIZ(sbLIZ5));
                                                                                                LJIJ(new AbstractImageUploader.ImageUploadInfo(-1, null, -39999L, null, null, 0L, null, null), "uploadImageGroupWaveTask securityException");
                                                                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                                                                sbLIZ6.append(" UploadImageGroupWaveTask uploadVideo error = ");
                                                                                                sbLIZ6.append(e.getMessage());
                                                                                                C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ6));
                                                                                            }
                                                                                            C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                                                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                                                            sbLIZ7.append("ImageGroupUploadTask -> UploadVideoGroupWaveTask -> imagePath = ");
                                                                                            sbLIZ7.append(c1431550nM9);
                                                                                            c1437510nVlLJJLIIIJ2.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ7));
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    this.LLJJJJJIL.set(true);
                                                                                }
                                                                                C1434960nRe c1434960nRe10 = this.LLIZLLLIL;
                                                                                if (c1434960nRe10 == null) {
                                                                                    c1434960nRe10 = null;
                                                                                }
                                                                                if (C568750MSj.LIZIZ(c1434960nRe10.LIZ)) {
                                                                                    List<String> list7 = this.LLJILLL;
                                                                                    if (list7 == null) {
                                                                                        list7 = null;
                                                                                    }
                                                                                    if (list7.isEmpty()) {
                                                                                        C1450070nq1.LJI("ImageGroupUploadTask SupportReEditeImage upload image is empty");
                                                                                        this.LLJJJJ.set(true);
                                                                                        LJIIZILJ();
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                List<String> list8 = this.LLJILLL;
                                                                                if (list8 != null) {
                                                                                    list2 = list8;
                                                                                }
                                                                                for (String str5 : list2) {
                                                                                    C1437510nVl c1437510nVlLJJLIIIJ3 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                                                                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                                                    sbLIZ8.append("ImageGroupUploadTask -> UploadImageGroupWaveTask -> imagePath = ");
                                                                                    sbLIZ8.append(str5);
                                                                                    c1437510nVlLJJLIIIJ3.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ8));
                                                                                }
                                                                                List<String> list9 = this.LLJILLL;
                                                                                if (list9 != null && (str = (String) C13LP.LJJJLZIJ(0, list9)) != null) {
                                                                                    C1EE2 c1ee2 = C1EE2.LIZIZ;
                                                                                    c1ee2.LJJJJJ(c1ee2.LJIL(str));
                                                                                }
                                                                                LJIJJLI(LJIILJJIL(0));
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
    }

    public final void LJIJ(AbstractImageUploader.ImageUploadInfo imageUploadInfo, String str) {
        C1431460nM0 c1431460nM0 = null;
        if (imageUploadInfo == null) {
            C1431460nM0 c1431460nM02 = this.LLJJIJI;
            if (c1431460nM02 != null) {
                c1431460nM0 = c1431460nM02;
            }
            c1431460nM0.LIZ(new C1431450nLz(-1L, str));
            return;
        }
        C1444650nhH c1444650nhH = C1444650nhH.LIZ;
        long j = imageUploadInfo.mErrorCode;
        c1444650nhH.getClass();
        C1444650nhH.LIZLLL(j);
        C1431460nM0 c1431460nM03 = this.LLJJIJI;
        if (c1431460nM03 != null) {
            c1431460nM0 = c1431460nM03;
        }
        c1431460nM0.LIZ(new C1431450nLz(imageUploadInfo.mErrorCode, str));
    }
}
