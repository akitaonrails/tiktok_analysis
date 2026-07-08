package Y;

import X.AbstractC577050MkB;
import X.C013C;
import X.C094D;
import X.C09JN;
import X.C0BVY;
import X.C0C64;
import X.C0L3L;
import X.C0L3T;
import X.C0MKJ;
import X.C0MMG;
import X.C0MOA;
import X.C0MOZ;
import X.C0VSJ;
import X.C1323050kX9;
import X.C1325120kaU;
import X.C1328060kfE;
import X.C1390380mHk;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1403010mc7;
import X.C1442040nd4;
import X.C1452080ntG;
import X.C1458370o3P;
import X.C1637890six;
import X.C1644050sst;
import X.C1656090tCJ;
import X.C19EG;
import X.C1C7U;
import X.C201955140j;
import X.C201967140v;
import X.C21341918fZ;
import X.C2188811AlT;
import X.C2286708xd;
import X.C371410EhH;
import X.C527460KmO;
import X.C529740Kq4;
import X.C530820Kro;
import X.C535020Kya;
import X.C543670LTx;
import X.C552700Lm0;
import X.C571900Mbs;
import X.C576610MjT;
import X.C576700Mjc;
import X.C576900Mjw;
import X.C577450Mkp;
import X.C578890Mn9;
import X.C579650MoN;
import X.C579660MoO;
import X.C580090Mp5;
import X.C580100Mp6;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC1290810jh9;
import X.InterfaceC1651080t4E;
import X.InterfaceC524590Khl;
import android.graphics.Bitmap;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class AfS144S0200000_8 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) throws Exception {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS144S0200000_8 afS144S0200000_8, Object obj) {
        C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.calculateSingleImageBackgroundColor$1$disposable$1");
        C0MOZ c0moz = (C0MOZ) obj;
        C0MKJ.LJJI(C0MKJ.LIZ, (C094D) afS144S0200000_8.l0, new Pair((C0MMG) afS144S0200000_8.l1, C0MOA.LIZLLL(c0moz, Collections.singletonList(c0moz.LIZ))));
        C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.calculateSingleImageBackgroundColor$1$disposable$1");
    }

    public static final void accept$1(AfS144S0200000_8 afS144S0200000_8, Object obj) {
        C0L3T value;
        C576700Mjc c576700Mjc = (C576700Mjc) afS144S0200000_8.l0;
        C0L3L c0l3l = (C0L3L) afS144S0200000_8.l1;
        c576700Mjc.getClass();
        C1C7U.LIZ("BitmapCacheWrapper@a7ca.getBitmapByCache$1L");
        Bitmap bitmap = (Bitmap) ((Pair) obj).getSecond();
        if (bitmap != null && !bitmap.isRecycled()) {
            if (c576700Mjc.LLILLJJLI) {
                value = C530820Kro.LIZIZ();
            } else {
                value = C0L3T.LL.getValue();
            }
            c0l3l.LIZ(C1323050kX9.LJIJJLI(new C1325120kaU(bitmap, (InterfaceC1290810jh9<Bitmap>) value, C1328060kfE.LIZLLL, 0)));
        }
        C1C7U.LIZIZ("BitmapCacheWrapper@a7ca.getBitmapByCache$1L");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x030f A[PHI: r5 r7 r8
      0x030f: PHI (r5v12 java.lang.String) = (r5v9 java.lang.String), (r5v14 java.lang.String) binds: [B:69:0x0309, B:55:0x026d] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r7v5 int) = (r7v3 int), (r7v6 int) binds: [B:69:0x0309, B:55:0x026d] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r8v4 int) = (r8v3 int), (r8v5 int) binds: [B:69:0x0309, B:55:0x026d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$10(Y.AfS144S0200000_8 r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS144S0200000_8.accept$10(Y.AfS144S0200000_8, java.lang.Object):void");
    }

    public static final void accept$2(AfS144S0200000_8 afS144S0200000_8, Object obj) {
        C1C7U.LIZ("ImageEditPreviewComponent@fb6c.tryStartUploadFrameForAIMusicOrSticker$1");
        String str = (String) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("normal return frame results result: ");
        sbLIZ.append(str);
        sbLIZ.append(", size: ");
        sbLIZ.append(((Number) ((Pair) afS144S0200000_8.l0).getFirst()).intValue());
        C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
        C1458370o3P c1458370o3P = C1458370o3P.LIZ;
        int iIntValue = ((Number) ((Pair) afS144S0200000_8.l0).getFirst()).intValue();
        c1458370o3P.getClass();
        String str2 = C1458370o3P.LJI;
        if (str2 != null) {
            C1458370o3P.LJIIJJI.put(str2, new Pair<>(str, Integer.valueOf(iIntValue)));
        }
        if (!C0BVY.LIZ(((C1452080ntG) afS144S0200000_8.l1).xb()) && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_not_need_pre_request_music_in_panel", true, true)) {
            C201955140j.LJIILIIL("PreEmbTaskManager", "not need preload music in ImageEditPreviewComponent");
        } else {
            C1403010mc7.LIZ.getMusicService().dl().LJIIIZ(C1442040nd4.LJ(((C1452080ntG) afS144S0200000_8.l1).xb(), 0L, false, null, null, false, 0L, false, null, null, false, 1022));
        }
        C1C7U.LIZIZ("ImageEditPreviewComponent@fb6c.tryStartUploadFrameForAIMusicOrSticker$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$3(Y.AfS144S0200000_8 r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS144S0200000_8.accept$3(Y.AfS144S0200000_8, java.lang.Object):void");
    }

    public static final void accept$4(AfS144S0200000_8 afS144S0200000_8, Object obj) {
        C529740Kq4 c529740Kq4 = (C529740Kq4) afS144S0200000_8.l0;
        List<TikTokMediaModel> list = (List) afS144S0200000_8.l1;
        C21341918fZ c21341918fZ = (C21341918fZ) obj;
        c529740Kq4.getClass();
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.setPageLoadData$2L");
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            c529740Kq4.LLLILZ(c21341918fZ, list);
        } else {
            C371410EhH.LIZIZ(new ARunnableS41S0300000_8(c529740Kq4, c21341918fZ, list, 1));
        }
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.setPageLoadData$2L");
    }

    public static final void accept$5(AfS144S0200000_8 afS144S0200000_8, Object obj) {
        C1C7U.LIZ("CameraLayoutToolbarComponent@cea1.onCreate$1$2");
        Pair pair = (Pair) obj;
        ((C577450Mkp) afS144S0200000_8.l0).P4(((InterfaceC1651080t4E) afS144S0200000_8.l1).KY1(), ((Boolean) pair.getFirst()).booleanValue(), (AbstractC577050MkB) pair.getSecond());
        C1C7U.LIZIZ("CameraLayoutToolbarComponent@cea1.onCreate$1$2");
    }

    public static final void accept$6(AfS144S0200000_8 afS144S0200000_8, Object obj) {
        C1C7U.LIZ("CameraLayoutGridComponent@19bd.initGoNextReturnBackObservables$1");
        if (((C576610MjT) afS144S0200000_8.l0).T4().Ce1()) {
            C013C c013c = (C013C) afS144S0200000_8.l1;
            if (!c013c.element) {
                c013c.element = true;
                ((C576610MjT) afS144S0200000_8.l0).x5();
            }
            ((C576610MjT) afS144S0200000_8.l0).N5(false);
            ((C576610MjT) afS144S0200000_8.l0).P4().Em0();
            ((C576610MjT) afS144S0200000_8.l0).pausePlay();
        }
        C1C7U.LIZIZ("CameraLayoutGridComponent@19bd.initGoNextReturnBackObservables$1");
    }

    public static final void accept$7(AfS144S0200000_8 afS144S0200000_8, Object obj) throws Exception {
        boolean zLIZJ;
        boolean zExists;
        C1C7U.LIZ("VideoProcessor@449d.doConcatFinishedEvent$2");
        C579660MoO c579660MoO = (C579660MoO) obj;
        C578890Mn9 c578890Mn9 = (C578890Mn9) afS144S0200000_8.l0;
        C579650MoN c579650MoN = (C579650MoN) afS144S0200000_8.l1;
        AVMusicWaveBean aVMusicWaveBeanLIZ = c579660MoO.LIZ();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordDataLIZIZ = c579660MoO.LIZIZ();
        c578890Mn9.getClass();
        int i = c579650MoN.LIZLLL;
        if (multiEditVideoStatusRecordDataLIZIZ != null) {
            String str = ((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoStatusRecordDataLIZIZ.curMultiEditVideoRecordData.segmentDataList, 0)).videoPath;
            String str2 = ((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoStatusRecordDataLIZIZ.curMultiEditVideoRecordData.segmentDataList, 0)).audioPath;
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onConcatFinished: ");
            sbLIZ.append(i);
            C201955140j.LJIILJJIL(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
            if (i >= 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("recording succeeded with status code ");
                sbLIZ2.append(i);
                C2188811AlT.LIZIZ(sbLIZ2);
                c578890Mn9.LIZJ().cameraComponentModel.extractFramesModel = ((C1656090tCJ) c578890Mn9.LIZ().yP()).LJIIJJI;
                c578890Mn9.LIZJ().currentZoomValue = new BigDecimal(c578890Mn9.LIZJ().cameraComponentModel.latestUsedZoomValue).setScale(1, 4).floatValue();
                c578890Mn9.LIZIZ().KQ();
                ((C580090Mp5) c578890Mn9.LLILZIL.getValue(c578890Mn9, C578890Mn9.LLJI[2])).LIZ(new C576900Mjw(c578890Mn9.LLILLJJLI, new C580100Mp6(c578890Mn9.LIZIZ().Ak(), System.currentTimeMillis(), c578890Mn9.LIZJ(), c578890Mn9.LIZ().LJLJJLL(), aVMusicWaveBeanLIZ, multiEditVideoStatusRecordDataLIZIZ, str, str2)));
                c578890Mn9.LIZ().HT1(false);
            } else {
                if (str != null) {
                    zLIZJ = C2286708xd.LIZJ(str);
                } else {
                    zLIZJ = false;
                }
                if (str2 != null) {
                    zExists = new C0VSJ(str2).exists();
                } else {
                    zExists = false;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(c578890Mn9.LIZJ().cameraComponentModel.mWorkspace.LJ());
                sbLIZ3.append("1_frag_v");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3));
                boolean zExists2 = c0vsj.exists();
                long length = c0vsj.length();
                int i2 = c578890Mn9.LIZJ().cameraComponentModel.mHardEncode;
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("errorCode", Integer.valueOf(i));
                c543670LTx.LIZ.put("videoPath", String.valueOf(str));
                c543670LTx.LIZ.put("audioPath", str2);
                c543670LTx.LIZ.put("videoFileExists", String.valueOf(zLIZJ));
                c543670LTx.LIZ.put("audioFileExists", String.valueOf(zExists));
                c543670LTx.LIZ.put("firstSegmentPath", String.valueOf(zExists2));
                c543670LTx.LIZ.put("firstSegmentLength", String.valueOf(length));
                c543670LTx.LIZ.put("hardEncode", String.valueOf(i2));
                c543670LTx.LIZ.put("abParam", Boolean.TRUE);
                C1637890six.LJ("aweme_concat_success_rate", 1, c543670LTx.LJ());
                String string = c578890Mn9.LLILLJJLI.getString(2131829415, Integer.valueOf(i));
                if (i == -10021 || i == -2000) {
                    string = c578890Mn9.LLILLJJLI.getString(2131830703);
                }
                C19EG c19eg = c578890Mn9.LLILLJJLI;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(string);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(c19eg, 3071, creativeToastBuilder);
            }
            C1C7U.LIZIZ("VideoProcessor@449d.doConcatFinishedEvent$2");
            return;
        }
        c578890Mn9.LIZIZ().tu0(new C1644050sst("go edit activity"));
        C1397580mTM c1397580mTM = new C1397580mTM(c578890Mn9.LLILLJJLI);
        c1397580mTM.LJFF(2131858141);
        c1397580mTM.LIZ(2131858139);
        C985403tE.LIZ(c1397580mTM, new AwS587S0100000_8(c578890Mn9, 643));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C571900Mbs.LIZ("recordData is null");
        throw new Exception();
    }

    public static final void accept$8(AfS144S0200000_8 afS144S0200000_8, Object obj) {
        C1C7U.LIZ("AiContentDataManager@fb1e.incrementalRefreshAiSelfContentData$1");
        C527460KmO c527460KmO = (C527460KmO) afS144S0200000_8.l1;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            TikTokMediaModel tikTokMediaModelLIZ = c527460KmO.LIZ.LIZ((C535020Kya) it2.next());
            if (tikTokMediaModelLIZ != null) {
                arrayList.add(tikTokMediaModelLIZ);
            }
        }
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("incrementalRefreshAiSelfContentData: received ");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(" new items");
        C201955140j.LIZLLL(c552700Lm0, "AiContentDataManager", C2188811AlT.LIZIZ(sbLIZ));
        ((InterfaceC524590Khl) afS144S0200000_8.l0).LIZ(arrayList);
        C1C7U.LIZIZ("AiContentDataManager@fb1e.incrementalRefreshAiSelfContentData$1");
    }

    public static final void accept$9(AfS144S0200000_8 afS144S0200000_8, Object obj) {
        C1C7U.LIZ("AiContentDataManager@fb1e.loadFullAiContentData$1");
        InterfaceC524590Khl interfaceC524590Khl = (InterfaceC524590Khl) afS144S0200000_8.l0;
        C527460KmO c527460KmO = (C527460KmO) afS144S0200000_8.l1;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            TikTokMediaModel tikTokMediaModelLIZ = c527460KmO.LIZ.LIZ((C535020Kya) it2.next());
            if (tikTokMediaModelLIZ != null) {
                arrayList.add(tikTokMediaModelLIZ);
            }
        }
        interfaceC524590Khl.LIZ(arrayList);
        C1C7U.LIZIZ("AiContentDataManager@fb1e.loadFullAiContentData$1");
    }

    public AfS144S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
