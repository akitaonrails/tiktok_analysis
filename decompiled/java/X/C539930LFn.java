package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.v2t.nle.CameraNLEPlayerForTemplateScene$initVEVideoPlayer$1$1$2", f = "CameraNLEPlayerForTemplateScene.kt", l = {}, m = "invokeSuspend")
public final class C539930LFn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C539910LFl LL;
    public final /* synthetic */ List<C539860LFg> LLILLJJLI;
    public final /* synthetic */ String[] LLILLL;
    public final /* synthetic */ String[] LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539930LFn(C539910LFl c539910LFl, List<C539860LFg> list, String[] strArr, String[] strArr2, InterfaceC1364105Vn<? super C539930LFn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c539910LFl;
        this.LLILLJJLI = list;
        this.LLILLL = strArr;
        this.LLILZ = strArr2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539930LFn(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String[] strArr;
        int[] iArr;
        int[] iArr2;
        String str;
        C1C7U.LIZ("CameraNLEPlayerForTemplateScene@f18f.initVEVideoPlayer$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C539910LFl c539910LFl = this.LL;
        List<C539860LFg> list = this.LLILLJJLI;
        String[] strArr2 = this.LLILLL;
        String[] strArr3 = this.LLILZ;
        c539910LFl.getClass();
        if (strArr2.length != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<C539860LFg> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().LIZJ));
            }
            int[] iArrLLII = C13LP.LLII(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator<C539860LFg> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(it3.next().LIZLLL));
            }
            int[] iArrLLII2 = C13LP.LLII(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator<C539860LFg> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList3.add(Integer.valueOf(it4.next().LJ));
            }
            int[] iArrLLII3 = C13LP.LLII(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            Iterator<C539860LFg> it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList4.add(Integer.valueOf(it5.next().LJFF));
            }
            int[] iArrLLII4 = C13LP.LLII(arrayList4);
            if (iArrLLII.length != 0 && iArrLLII2.length != 0) {
                if (iArrLLII.length == iArrLLII2.length && iArrLLII.length == strArr2.length) {
                    if (strArr3.length != strArr2.length) {
                        int length = strArr2.length;
                        String[] strArr4 = new String[length];
                        for (int i = 0; i < length; i++) {
                            if (i < strArr3.length) {
                                str = strArr3[i];
                            } else {
                                str = "";
                            }
                            strArr4[i] = str;
                        }
                        strArr3 = strArr4;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<C539860LFg> it6 = list.iterator();
                    while (it6.hasNext()) {
                        String str2 = it6.next().LJII;
                        if (str2 != null) {
                            arrayList5.add(str2);
                        }
                    }
                    boolean zIsEmpty = arrayList5.isEmpty();
                    C348100Dkm c348100DkmLIZLLL = c539910LFl.LLLLLJLJLL().LIZLLL();
                    if (c348100DkmLIZLLL != null) {
                        NLEEditor nLEEditor = c348100DkmLIZLLL.LIZ;
                        nLEEditor.getModel().clearTrack();
                        c539910LFl.LLJJJJJIL = nLEEditor;
                        C1DOU c1dou = new C1DOU(strArr2);
                        c1dou.LIZ = new String[]{strArr2[0]};
                        if (zIsEmpty) {
                            strArr = new String[0];
                        } else {
                            strArr = new String[]{strArr3[0]};
                        }
                        c1dou.LJ = strArr;
                        c1dou.LIZIZ = new int[]{iArrLLII[0]};
                        c1dou.LIZJ = new int[]{iArrLLII2[0]};
                        if (zIsEmpty) {
                            iArr = new int[0];
                        } else {
                            iArr = new int[]{iArrLLII3[0]};
                        }
                        c1dou.LJI = iArr;
                        if (zIsEmpty) {
                            iArr2 = new int[0];
                        } else {
                            iArr2 = new int[]{iArrLLII4[0]};
                        }
                        c1dou.LJII = iArr2;
                        c1dou.LJIIJ = EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL;
                        c1dou.LJIIIIZZ = new float[]{1.0f};
                        C571670MbV.LIZ(c1dou, nLEEditor);
                        int i2 = iArrLLII2[0] - iArrLLII[0];
                        if (strArr2.length >= 2) {
                            int length2 = strArr2.length;
                            for (int i3 = 1; i3 < length2; i3++) {
                                String str3 = strArr2[i3];
                                String str4 = strArr3[i3];
                                int i4 = iArrLLII[i3];
                                int i5 = iArrLLII2[i3];
                                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                                NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                                if (C2286708xd.LJIILL(str3)) {
                                    nLESegmentVideo.setAVFile(C571670MbV.LIZIZ(str3));
                                } else {
                                    nLESegmentVideo.setAVFile(C571670MbV.LIZJ(str3));
                                }
                                long j = ((long) i4) * 1000;
                                nLESegmentVideo.setTimeClipStart(j);
                                long j2 = ((long) i5) * 1000;
                                nLESegmentVideo.setTimeClipEnd(j2);
                                nLETrackSlot.setMainSegment(nLESegmentVideo);
                                NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                                NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
                                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                                nLEResourceAV.setResourceType(NLEResType.AUDIO);
                                nLEResourceAV.setResourceFile(str4);
                                nLESegmentAudio.setAVFile(nLEResourceAV);
                                nLESegmentAudio.setTimeClipStart(j);
                                nLESegmentAudio.setTimeClipEnd(j2);
                                nLETrackSlot2.setMainSegment(nLESegmentAudio);
                                long j3 = ((long) i2) * 1000;
                                nLETrackSlot.setStartTime(j3);
                                nLETrackSlot2.setStartTime(j3);
                                Pair pair = new Pair(nLETrackSlot, nLETrackSlot2);
                                NLETrackSlot nLETrackSlot3 = (NLETrackSlot) pair.getFirst();
                                NLETrackSlot nLETrackSlot4 = (NLETrackSlot) pair.getSecond();
                                i2 += iArrLLII2[i3] - iArrLLII[i3];
                                NLETrack mainTrack = nLEEditor.getModel().getMainTrack();
                                if (mainTrack != null) {
                                    mainTrack.addSlot(nLETrackSlot3);
                                }
                                VecNLETrackSPtr tracks = nLEEditor.getModel().getTracks();
                                ArrayList arrayList6 = new ArrayList();
                                for (NLETrack nLETrack : tracks) {
                                    if (NLETrackType.AUDIO == nLETrack.getTrackType()) {
                                        arrayList6.add(nLETrack);
                                    }
                                }
                                NLETrack nLETrack2 = (NLETrack) C13LP.LJJJLL(arrayList6);
                                if (nLETrack2 != null) {
                                    nLETrack2.addSlot(nLETrackSlot4);
                                }
                            }
                        }
                        C348100Dkm c348100DkmLIZLLL2 = c539910LFl.LLLLLJLJLL().LIZLLL();
                        if (c348100DkmLIZLLL2 != null) {
                            NLEEditor nLEEditor2 = c348100DkmLIZLLL2.LIZ;
                            NLETrack nLETrack3 = new NLETrack();
                            NLETrackSlot nLETrackSlot5 = new NLETrackSlot();
                            String musicPath = c539910LFl.LLJJJIL.getMusicPath();
                            if (musicPath != null && musicPath.length() != 0) {
                                NLESegmentAudio nLESegmentAudio2 = new NLESegmentAudio();
                                NLEResourceAV nLEResourceAV2 = new NLEResourceAV();
                                nLEResourceAV2.setResourceType(NLEResType.AUDIO);
                                nLEResourceAV2.setResourceFile(c539910LFl.LLJJJIL.getMusicPath());
                                nLESegmentAudio2.setAVFile(nLEResourceAV2);
                                nLESegmentAudio2.setTimeClipStart(((long) ((int) c539910LFl.LLJJJIL.LJIILJJIL())) * 1000);
                                nLESegmentAudio2.setTimeClipEnd(((long) c539910LFl.LLJJJIL.cameraComponentModel.musicEndTime) * 1000);
                                nLETrackSlot5.setMainSegment(nLESegmentAudio2);
                                nLETrackSlot5.setStartTime(((long) 0) * 1000);
                                nLETrackSlot5.setEndTime(c539910LFl.LLJJJIL.cameraComponentModel.mMaxDuration * 1000);
                                nLETrack3.addSlot(nLETrackSlot5);
                                nLETrack3.setExtra("AudioTrackType", "BGM");
                            }
                            nLEEditor2.getModel().addTrack(nLETrack3);
                            nLEEditor.commit();
                            C1463670oBx c1463670oBxLLLLLJLJLL = c539910LFl.LLLLLJLJLL();
                            c1463670oBxLLLLLJLJLL.getClass();
                            c1463670oBxLLLLLJLJLL.setLoopPlay(true);
                            if (!C1452440ntq.LIZ(c539910LFl.LLLLLJLJLL())) {
                                c539910LFl.LLLLLJLJLL().prepare();
                            }
                            if (c539910LFl.isVisible()) {
                                c539910LFl.LLLLLJLJLL().play();
                            }
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Array size mismatch: vTrimIns=");
                    sbLIZ.append(iArrLLII.length);
                    sbLIZ.append(", vTrimOuts=");
                    sbLIZ.append(iArrLLII2.length);
                    sbLIZ.append(", videoPaths=");
                    sbLIZ.append(strArr2.length);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CameraNLEPlayerForTemplateScene@f18f.initVEVideoPlayer$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
