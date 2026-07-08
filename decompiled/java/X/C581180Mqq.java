package X;

import Y.AfS104S0300000_8;
import Y.AkS321S0200000_3;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.p;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrApi;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.ImageResponse;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VEMediaParser;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS157S1100000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.text.a0;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.0Mqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581180Mqq implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7<Bitmap> c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C581180Mqq c581180Mqq, C15O7 c15o7) {
        C1C7U.LIZ("VideoImageMixedBaseAdapter$VideoImageMixedBaseViewHolder@805b.bindClippedVideoCoverData$1$4");
        if (c15o7.LJIILJJIL()) {
            Bitmap bitmap = (Bitmap) c15o7.LJIIL();
            C1322110kVd c1322110kVd = ((C529620Kps) c581180Mqq.l0).LLILLL;
            if (c1322110kVd != null) {
                c1322110kVd.setScaleType(ImageView.ScaleType.CENTER_CROP);
                if (bitmap.getWidth() / bitmap.getHeight() == c1322110kVd.getWidth() / c1322110kVd.getHeight()) {
                    c1322110kVd.setImageBitmap(C423140GiW.LIZ(bitmap, (C418440Gaw.LIZIZ(Float.valueOf(2.0f)) / c1322110kVd.getWidth()) * bitmap.getWidth(), (C418440Gaw.LIZIZ(Float.valueOf(2.0f)) / c1322110kVd.getHeight()) * bitmap.getHeight()));
                } else {
                    c1322110kVd.setImageBitmap(bitmap);
                }
            }
        }
        ((VEMediaParser) c581180Mqq.l1).release();
        C1C7U.LIZIZ("VideoImageMixedBaseAdapter$VideoImageMixedBaseViewHolder@805b.bindClippedVideoCoverData$1$4");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0MP8, java.lang.Object] */
    public static final Object then$1(C581180Mqq c581180Mqq, C15O7 c15o7) {
        boolean z;
        int i;
        k kVarLIZJ;
        k kVarLIZJ2;
        String strLIZLLL;
        C1C7U.LIZ("MvMediaProcessImpl@1cbd.resizeBitmap$3");
        final C0MP7 c0mp7 = (C0MP7) c581180Mqq.l0;
        if (c0mp7.LLIZLLLIL) {
            String strLIZJ = c0mp7.LLILLL.LIZJ();
            final MvCreateVideoData mvCreateVideoData = (MvCreateVideoData) c581180Mqq.l1;
            VEMVAlgorithmConfig mVAlgorithmConfigs = VEUtils.getMVAlgorithmConfigs(strLIZJ, mvCreateVideoData.selectMediaList);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MvMediaProcessImpl serverExecute algorithmConfig is null ");
            if (mVAlgorithmConfigs == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            if (mVAlgorithmConfigs == null) {
                c0mp7.LIZJ().LIZLLL(new AwS552S0100000_8(c0mp7, 902));
                C536880L3u c536880L3u = c0mp7.LLILZLL;
                if (c536880L3u == null) {
                    c536880L3u = null;
                }
                c536880L3u.LIZLLL = System.currentTimeMillis() - c0mp7.LLJILJIL;
                c536880L3u.LIZ = 1;
                c536880L3u.LIZIZ = 102;
                c536880L3u.LIZJ = "algorithmConfig is null";
                C536890L3v c536890L3v = C536890L3v.LIZ;
                C536880L3u c536880L3u2 = c0mp7.LLILZLL;
                if (c536880L3u2 == null) {
                    c536880L3u2 = null;
                }
                MvThemeData mvThemeData = c0mp7.LLILLL;
                if (mvThemeData == null || (strLIZLLL = mvThemeData.LIZLLL()) == null) {
                    strLIZLLL = "";
                }
                c536890L3v.getClass();
                C536890L3v.LIZIZ(c536880L3u2, strLIZLLL, "", "mv");
                C0MP9.LIZ(false, c0mp7.LLILLL, new Pair(102, "algorithmConfig is null"));
            } else {
                final C0MPB c0mpb = (C0MPB) c0mp7.LLJILLL.getValue();
                final ?? r7 = new C0MPC() { // from class: X.0MP8
                    @Override // X.C0MPC
                    public final void LIZ(ArrayList<MvNetFileBean> arrayList) {
                        List<String> list;
                        String strLJIJI;
                        C0MP7 c0mp72 = c0mp7;
                        MvCreateVideoData mvCreateVideoData2 = mvCreateVideoData;
                        for (MvNetFileBean mvNetFileBean : arrayList) {
                            MvThemeData mvThemeData2 = c0mp72.LLILLL;
                            if (mvThemeData2 != null && (list = mvThemeData2.algorithmKeyForSave) != null && list.contains(mvNetFileBean.getAlgorithm()) && ((strLJIJI = C2471909mP.LJIJI(mvNetFileBean.getFilePath())) == null || (!u.LJIIZILJ(strLJIJI, ".mp4", false) && !u.LJIIZILJ(strLJIJI, "/mp4", false)))) {
                                mvCreateVideoData2.photoToSave.add(mvNetFileBean.getFilePath());
                            }
                            mvCreateVideoData2.newMaskFileData.add(mvNetFileBean);
                        }
                        List<MvNetFileBean> list2 = c0mp7.LLJI;
                        MvCreateVideoData mvCreateVideoData3 = mvCreateVideoData;
                        ArrayList arrayList2 = (ArrayList) list2;
                        arrayList2.clear();
                        arrayList2.addAll(mvCreateVideoData3.newMaskFileData);
                        c0mp7.LIZJ().LIZLLL(new AwS409S0200000_8(c0mp7, mvCreateVideoData, 107));
                    }

                    @Override // X.C0MPC
                    public final void LIZIZ(String str, ArrayList arrayList) {
                        String strLIZLLL2;
                        ((ArrayList) c0mp7.LLJI).addAll(arrayList);
                        c0mp7.LIZJ().LIZLLL(new AwS157S1100000_8(str, c0mp7, 9));
                        C0MP7 c0mp72 = c0mp7;
                        C536880L3u c536880L3u3 = c0mp72.LLILZLL;
                        C536880L3u c536880L3u4 = null;
                        if (c536880L3u3 == null) {
                            c536880L3u3 = null;
                        }
                        c536880L3u3.LIZLLL = System.currentTimeMillis() - c0mp72.LLJILJIL;
                        c536880L3u3.LIZ = 1;
                        c536880L3u3.LIZIZ = 103;
                        c536880L3u3.LIZJ = str;
                        C536890L3v c536890L3v2 = C536890L3v.LIZ;
                        C0MP7 c0mp73 = c0mp7;
                        C536880L3u c536880L3u5 = c0mp73.LLILZLL;
                        if (c536880L3u5 != null) {
                            c536880L3u4 = c536880L3u5;
                        }
                        MvThemeData mvThemeData2 = c0mp73.LLILLL;
                        if (mvThemeData2 == null || (strLIZLLL2 = mvThemeData2.LIZLLL()) == null) {
                            strLIZLLL2 = "";
                        }
                        c536890L3v2.getClass();
                        C536890L3v.LIZIZ(c536880L3u4, strLIZLLL2, "", "mv");
                        C0MP9.LIZ(false, c0mp7.LLILLL, new Pair(103, str));
                    }
                };
                c0mpb.getClass();
                final C259800zU c259800zU = new C259800zU();
                c259800zU.element = "";
                final C118300cf c118300cf = new C118300cf();
                c0mpb.LJ.clear();
                ArrayList arrayList = new ArrayList();
                C089E c089e = new C089E(mVAlgorithmConfigs.infos);
                while (true) {
                    if (!c089e.hasNext()) {
                        break;
                    }
                    VEMVAlgorithmConfig.AlgorithmInfo algorithmInfo = (VEMVAlgorithmConfig.AlgorithmInfo) c089e.next();
                    String str = algorithmInfo.photoPath;
                    if (str == null) {
                        arrayList.clear();
                        break;
                    }
                    C1900707cT c1900707cTLIZ = c0mpb.LIZ();
                    c1900707cTLIZ.getClass();
                    String strLIZJ2 = C08HM.LIZJ(str);
                    c1900707cTLIZ.LIZIZ.put(strLIZJ2, str);
                    VEMVAlgorithmConfig.AlgorithmInfo.AlgorithmItem[] algorithmItemArr = algorithmInfo.items;
                    String strLIZIZ = "";
                    String strLIZIZ2 = "";
                    for (VEMVAlgorithmConfig.AlgorithmInfo.AlgorithmItem algorithmItem : algorithmItemArr) {
                        VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE mv_reesult_out_type = algorithmItem.result_out_type;
                        if (mv_reesult_out_type == null) {
                            i = -1;
                        } else {
                            i = C0MPD.LIZ[mv_reesult_out_type.ordinal()];
                        }
                        if (i != 1 && i != 2) {
                            if (i == 3 || i == 4) {
                                C1900707cT c1900707cTLIZ2 = c0mpb.LIZ();
                                c1900707cTLIZ2.getClass();
                                String strLIZJ3 = C08HM.LIZJ(str);
                                c1900707cTLIZ2.LIZIZ.put(strLIZJ3, str);
                                if (algorithmItem.isNeedServerExecute && algorithmItem.algorithmName.length() > 0) {
                                    MvNetFileBean mvNetFileBeanLIZ = c0mpb.LIZ().LIZ(strLIZJ3, algorithmItem.algorithmName);
                                    if (mvNetFileBeanLIZ == null) {
                                        TypedFile typedFile = new TypedFile("image/*", new C0VSJ(str));
                                        new p();
                                        String str2 = algorithmItem.algorithmParamJson;
                                        if (str2 != null && str2.length() != 0) {
                                            try {
                                                kVarLIZJ2 = p.LIZJ(algorithmItem.algorithmParamJson);
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                kVarLIZJ2 = null;
                                            }
                                            if (o.LJIIZILJ.LIZ()) {
                                            }
                                        } else {
                                            kVarLIZJ2 = null;
                                            if (o.LJIIZILJ.LIZ() && o.LJIIZILJ.isLogin()) {
                                                arrayList.add(((AfrApi) c0mpb.LIZIZ.getValue()).getVideoInfo(algorithmItem.algorithmName, strLIZJ3, algorithmItem.result_out_type.ordinal(), typedFile, kVarLIZJ2).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.0MSa
                                                    @Override // X.InterfaceC1487280oo2
                                                    public final Object apply(Object obj) {
                                                        VideoResponse videoResponse = new VideoResponse();
                                                        videoResponse.status_code = -1;
                                                        return videoResponse;
                                                    }
                                                }).LJL(C11S5.LIZ()));
                                            }
                                        }
                                    } else {
                                        c0mpb.LJ.add(mvNetFileBeanLIZ);
                                    }
                                }
                            }
                        } else if (algorithmItem.isNeedServerExecute) {
                            MvNetFileBean mvNetFileBeanLIZ2 = c0mpb.LIZ().LIZ(strLIZJ2, algorithmItem.algorithmName);
                            if (mvNetFileBeanLIZ2 == null) {
                                String str3 = algorithmItem.algorithmParamJson;
                                if (str3 != null && str3.length() != 0) {
                                    C1900707cT c1900707cTLIZ3 = c0mpb.LIZ();
                                    c1900707cTLIZ3.getClass();
                                    String strLIZJ4 = C08HM.LIZJ(str);
                                    c1900707cTLIZ3.LIZIZ.put(strLIZJ4, str);
                                    if (algorithmItem.isNeedServerExecute && C123100dR.LIZ(algorithmItem.algorithmName)) {
                                        MvNetFileBean mvNetFileBeanLIZ3 = c0mpb.LIZ().LIZ(strLIZJ4, algorithmItem.algorithmName);
                                        if (mvNetFileBeanLIZ3 == null) {
                                            TypedFile typedFile2 = new TypedFile("image/*", new C0VSJ(str));
                                            new p();
                                            String str4 = algorithmItem.algorithmParamJson;
                                            if (str4 != null && str4.length() != 0) {
                                                try {
                                                    kVarLIZJ = p.LIZJ(algorithmItem.algorithmParamJson);
                                                } catch (Exception e2) {
                                                    TryCatchGuardChecker.doCheck(e2);
                                                    kVarLIZJ = null;
                                                }
                                                if (o.LJIIZILJ.LIZ()) {
                                                }
                                            } else {
                                                kVarLIZJ = null;
                                                if (o.LJIIZILJ.LIZ() && o.LJIIZILJ.isLogin()) {
                                                    arrayList.add(((AfrApi) c0mpb.LIZIZ.getValue()).getImageInfo(algorithmItem.algorithmName, strLIZJ4, String.valueOf(algorithmItem.result_out_type.ordinal()), typedFile2, kVarLIZJ).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.0MSY
                                                        @Override // X.InterfaceC1487280oo2
                                                        public final Object apply(Object obj) {
                                                            ImageResponse imageResponse = new ImageResponse();
                                                            imageResponse.status_code = -1;
                                                            return imageResponse;
                                                        }
                                                    }).LJL(C11S5.LIZ()));
                                                }
                                            }
                                        } else {
                                            c0mpb.LJ.add(mvNetFileBeanLIZ3);
                                        }
                                    }
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strLIZIZ);
                                    sbLIZ2.append(algorithmItem.algorithmName);
                                    sbLIZ2.append(',');
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(strLIZIZ2);
                                    sbLIZ3.append(algorithmItem.result_out_type.ordinal());
                                    sbLIZ3.append(',');
                                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                                }
                            } else {
                                c0mpb.LJ.add(mvNetFileBeanLIZ2);
                            }
                        }
                    }
                    String strLJJJLL = a0.LJJJLL(",", strLIZIZ);
                    String strLJJJLL2 = a0.LJJJLL(",", strLIZIZ2);
                    if (strLJJJLL.length() > 0 && !o.LJIIZILJ.LIZ() && o.LJIIZILJ.isLogin()) {
                        arrayList.add(((AfrApi) c0mpb.LIZIZ.getValue()).getImageInfo(strLJJJLL, strLIZJ2, strLJJJLL2, new TypedFile("image/*", new C0VSJ(str)), null).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.0MSZ
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj) {
                                ImageResponse imageResponse = new ImageResponse();
                                imageResponse.status_code = -1;
                                return imageResponse;
                            }
                        }).LJL(C11S5.LIZ()));
                    }
                }
                if (arrayList.isEmpty()) {
                    if (c0mpb.LJ.isEmpty()) {
                        C201955140j.LJIJI(C1398350mUb.LIZIZ, "MvNetModule submitRequest afrFileBeanList is empty");
                        r7.LIZIZ((String) c259800zU.element, c0mpb.LJ);
                    } else {
                        r7.LIZ(c0mpb.LJ);
                    }
                } else {
                    c0mpb.LIZLLL = (C11JF) C11NZ.LJLL(arrayList, new AkS321S0200000_3(c118300cf, c259800zU, 0)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0MSX
                        /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
                        @Override // X.InterfaceC1487280oo2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object apply(java.lang.Object r16) {
                            /*
                                Method dump skipped, instruction units count: 507
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0MSX.apply(java.lang.Object):java.lang.Object");
                        }
                    }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new C09JN() { // from class: X.0MPA
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("MvNetModule@b8bc.submitRequest$3");
                            if (c118300cf.element == 0) {
                                r7.LIZ(c0mpb.LJ);
                            } else {
                                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("MvNetModule submitRequest illegalFileCount ");
                                sbLIZ4.append(c118300cf.element);
                                sbLIZ4.append(" errToast ");
                                sbLIZ4.append(c259800zU.element);
                                C201955140j.LJIJI(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ4));
                                r7.LIZIZ(c259800zU.element, c0mpb.LJ);
                            }
                            C1C7U.LIZIZ("MvNetModule@b8bc.submitRequest$3");
                        }
                    }, new AfS104S0300000_8(c259800zU, r7, c0mpb, 0), new C581090Mqh(c0mpb, 0));
                }
            }
        } else {
            c0mp7.LIZJ().LIZLLL(new AwS409S0200000_8((C0MP7) c581180Mqq.l0, (MvCreateVideoData) c581180Mqq.l1, 106));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvMediaProcessImpl@1cbd.resizeBitmap$3");
        return unit;
    }

    public C581180Mqq(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
