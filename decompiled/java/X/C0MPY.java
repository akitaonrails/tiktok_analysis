package X;

import android.content.Context;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLEStyRecognizedWord;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecInt;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.ss.android.ugc.aweme.story.celebration.CelebrationStickerInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS51S0310000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MPY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MPY extends AbstractC2255721DQs<C0MHP> implements InterfaceC379610EuV, C0MHP {
    public static final C567910MPd LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LL;
    public String LLJ;
    public MusicObject LLJI;
    public NLEModel LLJIJIL;
    public C09AE LLJILLL;
    public C09AE LLJJ;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C0MPT.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), Integer.class, "celebration_type");
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), List.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 652));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(295));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 651));
    public String LLJILJILJ = "";
    public final CoroutineExceptionHandler LLJJI = new C581260Mqy(CoroutineExceptionHandler.LJJLIL, 4);
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(296));

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0MPd] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MPY.class, "posterApi", "getPosterApi()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/forward/onthisday/celebration/component/celebration/CelebrationPosterApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0MPY.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new C2217381BqS(C0MPY.class, "publishModel", "getPublishModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C0MPY.class, "celebrationType", "getCelebrationType()I", 0), new C2217381BqS(C0MPY.class, "forwardMedias", "getForwardMedias()Ljava/util/List;", 0)};
        LLJJIJI = new Object() { // from class: X.0MPd
        };
        LLJJIJIL = 8;
    }

    public C0MHP W2() {
        return this;
    }

    @Override // X.C0MHP
    public Long getMusicId() {
        Object c098200Yq;
        try {
            String str = this.LLJ;
            c098200Yq = str != null ? Long.valueOf(CastLongProtector.parseLong(str)) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (Long) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    private final List<ForwardMedia> B3() {
        return (List) this.LLILZLL.getValue(this, LLJJIJIIJIL[4]);
    }

    private final C0MPT E3() {
        return (C0MPT) this.LLILLJJLI.getValue(this, LLJJIJIIJIL[0]);
    }

    private final AbstractC214814194y O3() {
        return (AbstractC214814194y) this.LLILLL.getValue(this, LLJJIJIIJIL[1]);
    }

    private final CelebrationStickerInfo Q3() {
        return (CelebrationStickerInfo) this.LLJILJIL.getValue();
    }

    private final void X1() {
        String str;
        C09AE c09ae = this.LLJILLL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C0MLB c0mlbH4 = H4();
        c0mlbH4.LIZLLL = null;
        c0mlbH4.LJ = null;
        C0MQ2 c0mq2 = C0MQ2.LIZ;
        int iM3 = m3();
        c0mq2.getClass();
        String str2 = C0MQ2.LJIIJ.get(Integer.valueOf(iM3));
        ConcurrentHashMap<Integer, HashMap<String, String>> concurrentHashMap = C0MQ2.LJFF;
        HashMap<String, String> map = concurrentHashMap.get(Integer.valueOf(iM3));
        if (str2 == null || map == null || (str = map.get(str2)) == null) {
            return;
        }
        HashMap<String, String> map2 = new HashMap<>();
        map2.put(str2, str);
        concurrentHashMap.put(Integer.valueOf(iM3), map2);
    }

    private final boolean d5() {
        InterfaceC567940MPg interfaceC567940MPg = C0MLA.LIZ;
        if (interfaceC567940MPg != null) {
            return interfaceC567940MPg.LIZJ(m3(), Integer.valueOf(B3().size()));
        }
        return false;
    }

    private final List<EditVideoSegment> q3() {
        return (List) this.LLIZLLLIL.getValue();
    }

    private final C389400FOo v3() {
        return (C389400FOo) this.LLJJIII.getValue();
    }

    public final VideoPublishEditModel H3() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJJIJIIJIL[2]);
    }

    public final C0MLB H4() {
        return (C0MLB) this.LLIZ.getValue();
    }

    @Override // X.C0MHP
    public C443120HZe<Long, Long, String> Hq2() {
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        String resourceFile;
        NLEModel nLEModel = this.LLJIJIL;
        C443120HZe<Long, Long, String> c443120HZe = null;
        if (nLEModel == null) {
            return null;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (C351220Dpo.LLILZ(next)) {
                    break;
                }
            }
            NLETrack nLETrack = next;
            if (nLETrack != null && (slots = nLETrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null) {
                Long lValueOf = Long.valueOf(nLESegmentAudioDynamicCast.getTimeClipStart());
                Long lValueOf2 = Long.valueOf(nLESegmentAudioDynamicCast.getTimeClipEnd());
                NLEResourceAV aVFile = nLESegmentAudioDynamicCast.getAVFile();
                if (aVFile == null || (resourceFile = aVFile.getResourceFile()) == null) {
                    resourceFile = "";
                }
                c443120HZe = new C443120HZe<>(lValueOf, lValueOf2, resourceFile);
            }
        }
        return c443120HZe;
    }

    @Override // X.C0MHP
    public void PK() {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CeleTemplateApply, initMaterial: videoStore hash = ");
        sbLIZ.append(H4().hashCode());
        sbLIZ.append(", template size = ");
        sbLIZ.append(z4().size());
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        if (d5()) {
            H4().LIZIZ.clear();
            H4().LIZIZ().clear();
        }
    }

    public final int m3() {
        return ((Number) this.LLILZIL.getValue(this, LLJJIJIIJIL[3])).intValue();
    }

    public final void w2() {
        MusicObject musicObject = this.LLJI;
        if (Intrinsics.LJFF(musicObject != null ? MusicBeanUtilKt.getMusicId(musicObject) : null, this.LLJ)) {
            C201955140j.LIZJ(C554890LpX.LIZIZ, "CeleTemplateApply, return, music has been downloaded");
        } else {
            this.LLJJ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), this.LLJJI, null, new C0MPV(this, null), 2);
        }
    }

    private final void Z4() {
        int i;
        int i2;
        CelebrationData celebrationData = H3().creativeModel.celebrationData;
        int i3 = 0;
        if (celebrationData != null) {
            celebrationData.setHasPoster(false);
        }
        List<OnThisDayTiktokMediaModel> list = H4().LJ;
        if (list != null) {
            i = 0;
            i2 = 0;
            i3 = 0;
            for (OnThisDayTiktokMediaModel onThisDayTiktokMediaModel : list) {
                ForwardMedia forwardMedia = onThisDayTiktokMediaModel.forwardMedia;
                if (forwardMedia != null) {
                    if (forwardMedia.isStory()) {
                        i2++;
                    } else {
                        i3++;
                    }
                } else if (C530830Krp.LIZIZ(onThisDayTiktokMediaModel)) {
                    CelebrationData celebrationData2 = H3().creativeModel.celebrationData;
                    if (celebrationData2 != null) {
                        celebrationData2.setHasPoster(true);
                    }
                } else {
                    i++;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        CelebrationData celebrationData3 = H3().creativeModel.celebrationData;
        if (celebrationData3 != null) {
            celebrationData3.setPostCnt(i3);
            celebrationData3.setLocalCnt(i);
            celebrationData3.setStoryCnt(i2);
            celebrationData3.setContentCnt(i2 + i3 + i + (celebrationData3.getHasPoster() ? 1 : 0));
        }
    }

    private final List<C0E4S> z4() {
        return H4().LIZIZ;
    }

    public final boolean O4() {
        List<OnThisDayTiktokMediaModel> list = H4().LJ;
        if (list != null && list.size() == 1) {
            return C530830Krp.LIZIZ((OnThisDayTiktokMediaModel) C13LP.LJJJLL(list));
        }
        return false;
    }

    @Override // X.C0MHP
    public List<EditVideoSegment> ZU1() {
        return q3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C201955140j.LIZJ(C554890LpX.LIZIZ, "CeleTemplateApply, onDestroy");
        X1();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C0MHP
    public MusicObject uE1() {
        return this.LLJI;
    }

    public C0MPY(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final List<Word> F4(NLEStyRecognizedWord nLEStyRecognizedWord) {
        int iIntValue;
        int iIntValue2;
        ArrayList arrayList = new ArrayList();
        VecString text = nLEStyRecognizedWord.getText();
        VecInt startTime = nLEStyRecognizedWord.getStartTime();
        VecInt endTime = nLEStyRecognizedWord.getEndTime();
        int i = 0;
        for (String str : text) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                Integer num = (Integer) C13LP.LJJJLZIJ(i, startTime);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                long j = iIntValue;
                Integer num2 = (Integer) C13LP.LJJJLZIJ(i, endTime);
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                arrayList.add(new Word(iIntValue2, j, str2, "", false, false));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    private final String H2(long j) {
        String str;
        CelebrationStickerInfo celebrationStickerInfoQ3 = Q3();
        if (celebrationStickerInfoQ3 == null || (str = celebrationStickerInfoQ3.dateFormat) == null) {
            str = "L";
        }
        return new BDDateFormat(str).LIZIZ(j, Locale.getDefault());
    }

    private final boolean K4(NLETrack nLETrack) {
        if (nLETrack.getEnable() && C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && !C351220Dpo.LLLII(nLETrack) && !C351220Dpo.LLLJ(nLETrack)) {
            return true;
        }
        return false;
    }

    private final void W1(JSONArray jSONArray) {
        JSONObject jSONObject;
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if ((obj instanceof JSONObject) && (jSONObject = (JSONObject) obj) != null) {
                    jSONObject.put("date", "");
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final float i3(float f) {
        float fFloatValue = ((Number) C304870BxF.LIZ.getValue()).floatValue();
        if (fFloatValue != 0.0f) {
            return ((int) (f * fFloatValue)) / fFloatValue;
        }
        return f;
    }

    private final void k5(Function0<Unit> function0) {
        Context context = O3().getContext();
        if (context == null) {
            function0.invoke();
        } else {
            E3().UI2(context, new AwS374S0200000_8(this, (C0MPY) function0, (Function0<Unit>) 124));
        }
    }

    @Override // X.C0MHP
    public void Tx1(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                if (K4(nLETrack) && (C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.AUDIO || (!Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "SOUND_EFFECT") && !u.LJIJI("SOUND_EFFECT", nLETrack.getExtra("biz_extra_type"), true)))) {
                    VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                    if (slots != null) {
                        for (NLETrackSlot nLETrackSlot : slots) {
                            if (NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment()) != null) {
                                nLETrack.removeSlot(nLETrackSlot);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void o2(boolean z) {
        if (!z) {
            return;
        }
        H4().LIZIZ.clear();
        int i = 0;
        for (ForwardMedia forwardMedia : B3()) {
            int i2 = i + 1;
            if (i >= 0) {
                ForwardMedia forwardMedia2 = forwardMedia;
                C566040MHy c566040MHy = C566040MHy.LIZ;
                CreativeInfo creativeInfo = H3().getCreativeInfo();
                c566040MHy.getClass();
                String strLIZJ = C570490MZb.LIZJ(C566040MHy.LIZIZ(creativeInfo).getAbsolutePath());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZJ);
                sbLIZ.append(forwardMedia2.localFile);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (!C2354709Kn.LIZIZ(strLIZIZ)) {
                    C2286708xd.LJFF(forwardMedia2.localPath, strLIZIZ);
                }
                forwardMedia2.setCreationPath(strLIZIZ);
                C0E4S c0e4sLIZ = C565710MGr.LIZ(forwardMedia2, strLIZIZ);
                if (c0e4sLIZ != null) {
                    H4().LIZIZ.add(c0e4sLIZ);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    private final boolean P4(long j, boolean z) {
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        if (z) {
            return true;
        }
        try {
            CelebrationStickerInfo celebrationStickerInfoQ3 = Q3();
            if (celebrationStickerInfoQ3 != null) {
                j2 = celebrationStickerInfoQ3.dateRangeMin;
            } else {
                j2 = 0;
            }
            long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
            long j5 = j2 * j4;
            CelebrationStickerInfo celebrationStickerInfoQ32 = Q3();
            if (celebrationStickerInfoQ32 != null) {
                j3 = celebrationStickerInfoQ32.dateRangeMax;
            } else {
                j3 = 0;
            }
            long j6 = j3 * j4;
            if (j5 != 0 && j < j5) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (j6 != 0 && j > j6) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z2 && z3) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return true;
        }
    }

    private final ArrayList<String> T2(int i, String str) {
        String str2;
        String str3;
        Context context = O3().getContext();
        if (context == null) {
            return new ArrayList<>();
        }
        String strValueOf = String.valueOf(C426750GoL.LIZLLL(context));
        boolean z = true;
        String str4 = "";
        if (i == 1) {
            CelebrationStickerInfo celebrationStickerInfoQ3 = Q3();
            if (celebrationStickerInfoQ3 == null || (str3 = celebrationStickerInfoQ3.content) == null) {
                str3 = "";
            }
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str3);
            arrayList.add(this.LLJILJILJ);
            arrayList.add(str);
            arrayList.add("");
            arrayList.add(strValueOf);
            return arrayList;
        }
        CelebrationStickerInfo celebrationStickerInfoQ32 = Q3();
        if (celebrationStickerInfoQ32 != null && (str2 = celebrationStickerInfoQ32.content) != null) {
            str4 = str2;
        }
        if (Q3() == null) {
            z = false;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add(str4);
        arrayList2.add(this.LLJILJILJ);
        arrayList2.add(str);
        arrayList2.add(this.LLJILJILJ);
        arrayList2.add(strValueOf);
        arrayList2.add(String.valueOf(z));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String c3(com.bytedance.ies.nle.editor_jni.NLETemplateModel r35, boolean r36) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MPY.c3(com.bytedance.ies.nle.editor_jni.NLETemplateModel, boolean):java.lang.String");
    }

    @Override // X.C0MHP
    public void F40(boolean z, Function1<? super NLEModel, Unit> function1) {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CeleTemplateApply, generatePreviewVideo: isInit = ");
        sbLIZ.append(z);
        sbLIZ.append(", shouldShowPoster = ");
        sbLIZ.append(d5());
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        C581270Mqz c581270Mqz = new C581270Mqz(CoroutineExceptionHandler.LJJLIL, function1, 2);
        C09AE c09ae = this.LLJJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C09AE c09ae2 = this.LLJILLL;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
        if (d5() && z) {
            k5(new AwS51S0310000_8(this, c581270Mqz, z, function1, 1));
        } else {
            this.LLJILLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), c581270Mqz, null, new C0MPX(this, z, function1, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132 A[PHI: r2
      0x0132: PHI (r2v5 boolean) = (r2v2 boolean), (r2v0 boolean) binds: [B:59:0x0130, B:67:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0MHP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object zt0(android.content.Intent r18, X.InterfaceC1364105Vn<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MPY.zt0(android.content.Intent, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n5(com.bytedance.ies.nle.editor_jni.NLEModel r15, android.util.Size r16, java.util.List<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r17) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MPY.n5(com.bytedance.ies.nle.editor_jni.NLEModel, android.util.Size, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel>] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r27v0, types: [X.0MPY] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G2(boolean r28, boolean r29, X.InterfaceC1364105Vn<? super com.bytedance.ies.nle.editor_jni.NLEModel> r30) {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MPY.G2(boolean, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[LOOP:2: B:26:0x0069->B:28:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T4(com.bytedance.ies.nle.editor_jni.NLETemplateModel r84, java.lang.String r85, X.InterfaceC1364105Vn<? super kotlin.Unit> r86) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MPY.T4(com.bytedance.ies.nle.editor_jni.NLETemplateModel, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0514, code lost:
    
        throw new java.lang.IllegalArgumentException("text style is null");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> Z1(android.content.Context r144, android.util.Size r145, java.util.List<? extends com.bytedance.ies.nle.editor_jni.NLETrack> r146, com.bytedance.ies.nle.editor_jni.NLEModel r147) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MPY.Z1(android.content.Context, android.util.Size, java.util.List, com.bytedance.ies.nle.editor_jni.NLEModel):java.util.List");
    }

    @Override // X.C0MHP
    public void CR0(boolean z, boolean z2, long j, String str) {
        String str2;
        if (z2) {
            str2 = "first_render";
        } else {
            str2 = "reapply";
        }
        C568060MPs.LIZ(C568060MPs.LIZ, m3(), str, 0, !z, j, z4().size(), str2, null, null, null, 1920);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e4(boolean r14, java.lang.String r15, boolean r16, X.InterfaceC1364105Vn<? super X.C443120HZe<java.lang.String, X.C532330KuF, ? extends com.bytedance.ies.nle.editor_jni.NLETemplateModel>> r17) {
        /*
            r13 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C567900MPc
            if (r0 == 0) goto L5d
            r12 = r3
            X.0MPc r12 = (X.C567900MPc) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r12.LLILLL = r2
        L14:
            java.lang.Object r5 = r12.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            java.lang.String r3 = ""
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L63
            X.C155000ia.LIZIZ(r5)
        L27:
            if (r5 != 0) goto L2e
            X.0HZe r5 = new X.0HZe
            r5.<init>(r3, r1, r1)
        L2e:
            return r5
        L2f:
            X.C155000ia.LIZIZ(r5)
            java.util.List r0 = r13.z4()
            int r8 = r0.size()
            X.194y r0 = r13.O3()
            android.content.Context r9 = r0.getContext()
            if (r9 != 0) goto L4a
            X.0HZe r0 = new X.0HZe
            r0.<init>(r3, r1, r1)
            return r0
        L4a:
            X.0MQ2 r5 = X.C0MQ2.LIZ
            int r6 = r13.m3()
            r12.LLILLL = r2
            r11 = r16
            r10 = r15
            r7 = r14
            java.lang.Object r5 = r5.LJII(r6, r7, r8, r9, r10, r11, r12)
            if (r5 != r4) goto L27
            return r4
        L5d:
            X.0MPc r12 = new X.0MPc
            r12.<init>(r13, r3)
            goto L14
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MPY.e4(boolean, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
