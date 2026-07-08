package X;

import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.app.Activity;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MemeSoundMusicParam;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS65S1300000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11b6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19530611b6 extends AbstractC19531111bB<InterfaceC19530111b1> implements InterfaceC19530111b1 {
    public static final C19531011bA LLLJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLL;
    public final InterfaceC19530111b1 LLJZIJLIL;
    public Function1<? super StickerModel, Unit> LLL;
    public final C01GW LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public final InterfaceC1731706qJ LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final InterfaceC1731706qJ LLLIIII;
    public C1412800mru LLLIIIIL;
    public C1782550wUH LLLIIIL;
    public volatile TextStickerData LLLIIL;
    public volatile TTSModel LLLIILIL;
    public volatile CopyOnWriteArrayList<String> LLLIL;
    public C0FWT LLLILZ;
    public final InterfaceC1731706qJ LLLILZJ;
    public volatile boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public final C560530Lyd<Integer> LLLJ;
    public final LiveEvent<Integer> LLLJIL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.11bA] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19530611b6.class, "privacySettingApi", "getPrivacySettingApi()Lcom/ss/android/ugc/aweme/shortvideo/privacy/PrivacySettingApi;", 0);
        C13LE.LIZ.getClass();
        LLLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19530611b6.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0), new C2217381BqS(C19530611b6.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0), new C2217381BqS(C19530611b6.class, "mixEditingMaterialApi", "getMixEditingMaterialApi()Lcom/ss/android/ugc/gamora/editor/mixediting/VideoMixEditingAssetsApi;", 0), new C2217381BqS(C19530611b6.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0)};
        LLLJL = new Object() { // from class: X.11bA
        };
    }

    @Override // X.AbstractC19531111bB
    public boolean P6() {
        return true;
    }

    @Override // X.AbstractC19531111bB
    public boolean S6() {
        return true;
    }

    @Override // X.AbstractC19531111bB
    public void W7() {
    }

    @Override // X.AbstractC19531111bB
    public int k5() {
        return R.layout.eqs;
    }

    private final InterfaceC1413540mt6 J9() {
        return (InterfaceC1413540mt6) this.LLLII.getValue(this, LLLL[2]);
    }

    private final InterfaceC1415760mwg P9() {
        return (InterfaceC1415760mwg) this.LLLIIII.getValue(this, LLLL[3]);
    }

    private final InterfaceC1444410ngt T9() {
        return (InterfaceC1444410ngt) this.LLLFZ.getValue(this, LLLL[0]);
    }

    private final InterfaceC1417050myl t9() {
        return (InterfaceC1417050myl) this.LLLI.getValue(this, LLLL[1]);
    }

    private final InterfaceC1453200nv4 w9() {
        return (InterfaceC1453200nv4) this.LLLILZJ.getValue(this, LLLL[4]);
    }

    @Override // X.InterfaceC19530111b1
    public void Bk() {
        List<TextStickerModel> listSb;
        C201955140j.LIZJ(C19522211Zk.LIZIZ, "removeCaption begin");
        K6().creativeModel.stickerModel.isAiCaptionAdded = false;
        TextStickerModel textStickerModel = null;
        K6().creativeModel.stickerModel.memeSoundMusicParam = null;
        C0FVT c0fvtD6 = d6();
        if (c0fvtD6 != null && (listSb = c0fvtD6.Sb()) != null) {
            Iterator<TextStickerModel> it2 = listSb.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TextStickerModel next = it2.next();
                if (C0F8Y.LJII(next)) {
                    textStickerModel = next;
                    break;
                }
            }
            TextStickerModel textStickerModel2 = textStickerModel;
            if (textStickerModel2 != null) {
                C0FVT c0fvtD62 = d6();
                if (c0fvtD62 != null) {
                    c0fvtD62.Fj(textStickerModel2.getBaseStickerModel().getId());
                }
                U9();
            }
        }
        C201955140j.LIZJ(C19522211Zk.LIZIZ, "removeCaption end");
    }

    public final InterfaceC377540ErA I9() {
        return (InterfaceC377540ErA) this.LLLF.getValue();
    }

    public final void V9() {
        String uuid;
        AbstractC1452680nuE abstractC1452680nuEGc;
        NLEModel nLEModelLIZ;
        C0FWT c0fwt;
        String str;
        AbstractC1452680nuE abstractC1452680nuEGc2;
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        AbstractC1452680nuE abstractC1452680nuEGc3;
        NLEModel nLEModelLIZ2;
        VecNLETrackSPtr tracks;
        AbstractC1452680nuE abstractC1452680nuEGc4;
        NLEModel nLEModelLIZ3;
        VecNLETrackSPtr tracks2;
        if (this.LLLIILIL == null || this.LLLIIL == null || Vf() != null) {
            return;
        }
        ArrayList<NLETrack> arrayList = new ArrayList();
        InterfaceC1455860nzM interfaceC1455860nzMU5 = U5();
        String str2 = "";
        if (interfaceC1455860nzMU5 == null || (abstractC1452680nuEGc4 = interfaceC1455860nzMU5.gc()) == null || (nLEModelLIZ3 = C352130DrH.LIZ(abstractC1452680nuEGc4.LJJ())) == null || (tracks2 = nLEModelLIZ3.getTracks()) == null) {
            uuid = "";
        } else {
            uuid = "";
            for (NLETrack nLETrack : tracks2) {
                if (nLETrack.getTrackType() == NLETrackType.AUDIO && Intrinsics.LJFF(C348350DlB.LIZ(nLETrack), "TEXT_SPEAK")) {
                    for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                        TTSModel tTSModel = this.LLLIILIL;
                        if (Intrinsics.LJFF(tTSModel != null ? tTSModel.nleUuid : null, nLETrackSlot.getUUID())) {
                            uuid = nLETrackSlot.getUUID();
                        }
                    }
                }
                if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                    Iterator<NLETrackSlot> it2 = nLETrack.getSlots().iterator();
                    while (it2.hasNext()) {
                        if (this.LLLIL.contains(it2.next().getUUID())) {
                            arrayList.add(nLETrack);
                        }
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reconfirmRemoveTTSTrack--> track size:");
        InterfaceC1455860nzM interfaceC1455860nzMU52 = U5();
        sbLIZ.append((interfaceC1455860nzMU52 == null || (abstractC1452680nuEGc3 = interfaceC1455860nzMU52.gc()) == null || (nLEModelLIZ2 = C352130DrH.LIZ(abstractC1452680nuEGc3.LJJ())) == null || (tracks = nLEModelLIZ2.getTracks()) == null) ? null : Integer.valueOf(tracks.size()));
        sbLIZ.append(" ttsUuid:");
        sbLIZ.append(uuid);
        sbLIZ.append(" cur tts:");
        TTSModel tTSModel2 = this.LLLIILIL;
        sbLIZ.append(tTSModel2 != null ? tTSModel2.nleUuid : null);
        sbLIZ.append(" needDeleteStickerTrack:");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(" curMemeAudioSlotUuid:");
        sbLIZ.append(this.LLLIL.size());
        C2188811AlT.LIZIZ(sbLIZ);
        if (C703302op.LIZ(uuid)) {
            InterfaceC1455860nzM interfaceC1455860nzMU53 = U5();
            if (interfaceC1455860nzMU53 != null && (abstractC1452680nuEGc2 = interfaceC1455860nzMU53.gc()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(abstractC1452680nuEGc2.LJJ())) != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null) {
                C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
                c347650Dk3.LIZJ = uuid;
                interfaceC391070FUzLJFF.LJJJI(c347650Dk3);
            }
            TextStickerData textStickerData = this.LLLIIL;
            if (textStickerData != null && (c0fwt = this.LLLILZ) != null) {
                TTSModel tTSModel3 = this.LLLIILIL;
                if (tTSModel3 != null && (str = tTSModel3.speakerID) != null) {
                    str2 = str;
                }
                c0fwt.KJ(str2, textStickerData);
            }
            TextStickerData textStickerData2 = this.LLLIIL;
            if (textStickerData2 != null) {
                kI(C0F7U.LJ(textStickerData2, null, 3));
            }
        }
        for (NLETrack nLETrack2 : arrayList) {
            InterfaceC1455860nzM interfaceC1455860nzMU54 = U5();
            if (interfaceC1455860nzMU54 != null && (abstractC1452680nuEGc = interfaceC1455860nzMU54.gc()) != null && (nLEModelLIZ = C352130DrH.LIZ(abstractC1452680nuEGc.LJJ())) != null) {
                nLEModelLIZ.removeTrack(nLETrack2);
            }
        }
        this.LLLIILIL = null;
        this.LLLIIL = null;
        this.LLLIL.clear();
    }

    @Override // X.InterfaceC19530111b1
    public String j11() {
        String str;
        List<TextStickerModel> listSb;
        str = "";
        if (this.LLJJJIL.isEmpty() || this.LLJJJJ == null) {
            return "";
        }
        C0FVT c0fvtD6 = d6();
        TextStickerModel textStickerModel = null;
        if (c0fvtD6 != null && (listSb = c0fvtD6.Sb()) != null) {
            Iterator<TextStickerModel> it2 = listSb.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TextStickerModel next = it2.next();
                if (C0F8Y.LJII(next)) {
                    textStickerModel = next;
                    break;
                }
            }
            TextStickerModel textStickerModel2 = textStickerModel;
            if (textStickerModel2 != null) {
                String textStr = C0F7U.LIZJ(textStickerModel2).getTextStr();
                return textStr != null ? textStr : "";
            }
        }
        int i = this.LLJJJJJIL;
        if (i == 0) {
            List<String> list = this.LLJJJ;
            return (String) (i < list.size() ? ListProtector.get(list, i) : "");
        }
        List<String> list2 = this.LLJJJ;
        int i2 = i - 1;
        if (i2 >= 0 && i2 < list2.size()) {
            str = ListProtector.get(list2, i2);
        }
        return (String) str;
    }

    @Override // X.AbstractC19531111bB
    public void n7() {
        this.LLLJ.LJIIJ(0);
    }

    private final void U9() {
        C390090FRf c390090FRfD5;
        InterfaceC19530911b9 interfaceC19530911b9Sd2;
        TextStickerModel textStickerModelX5 = x5();
        if (textStickerModelX5 == null || !C0F8Y.LJII(textStickerModelX5) || (c390090FRfD5 = D5()) == null) {
            return;
        }
        c390090FRfD5.LJIJ(c390090FRfD5.LJJIIJZLJL(), false);
        c390090FRfD5.setVisible(false);
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj == null || (interfaceC19530911b9Sd2 = interfaceC391240FVqQj.sd2()) == null) {
            return;
        }
        interfaceC19530911b9Sd2.LJJIIZI();
    }

    private final void ma() {
        if (D5() == null && !this.LLLIIIL.LIZ && this.LLLFF) {
            this.LLLILZLLLI = true;
            r8();
            this.LLLFF = false;
        }
    }

    @Override // X.InterfaceC19530111b1
    public void Km1() {
        y8();
        i3(AFwS273S0000000_29.get$arr$(22));
    }

    @Override // X.AbstractC19531111bB
    public void P8() {
        if (K6().creativeModel.stickerModel.isAiCaptionAdded || K6().mIsFromDraft) {
            T8(K6().creativeModel.stickerModel.aiCaptionShuffleTexts, K6().creativeModel.stickerModel.aiCaptionShuffleTTSDatas);
            this.LLJJJJJIL = K6().creativeModel.stickerModel.aiCaptionShuffleIndex;
            this.LLJJJJ = K6().creativeModel.stickerModel.memeSoundMusicParam;
        }
    }

    @Override // X.InterfaceC19530111b1
    public TextStickerData Vf() {
        C0FVT c0fvtD6;
        List<TextStickerModel> listSb;
        TextStickerModel next;
        if ((j11().length() == 0) || (c0fvtD6 = d6()) == null || (listSb = c0fvtD6.Sb()) == null) {
            return null;
        }
        Iterator<TextStickerModel> it2 = listSb.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (C0F8Y.LJII(next)) {
                break;
            }
        }
        TextStickerModel textStickerModel = next;
        if (textStickerModel != null) {
            return C0F7U.LIZJ(textStickerModel);
        }
        return null;
    }

    public final void da() {
        C390090FRf c390090FRfD5;
        InterfaceC19530911b9 interfaceC19530911b9Sd2;
        TextStickerModel textStickerModelX5 = x5();
        if (textStickerModelX5 == null || !C0F8Y.LJII(textStickerModelX5) || (c390090FRfD5 = D5()) == null) {
            return;
        }
        c390090FRfD5.LJIJ(c390090FRfD5.LJJIIJZLJL(), true);
        c390090FRfD5.setVisible(true);
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj == null || (interfaceC19530911b9Sd2 = interfaceC391240FVqQj.sd2()) == null) {
            return;
        }
        interfaceC19530911b9Sd2.LJIIL();
    }

    @Override // X.AbstractC19531111bB
    public void k7() {
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS608S0100000_29(this, 53));
    }

    @Override // X.AbstractC19531111bB, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        U5().ww2().observe(this, new AObserverS231S0100000_29(this, 33));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLLIL.clear();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLLFFI = true;
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        this.LLLFFI = false;
    }

    @Override // X.InterfaceC19530111b1
    public void aL2() {
        z8();
    }

    @Override // X.InterfaceC19530111b1
    public LiveEvent<Integer> eF2() {
        return this.LLLJIL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC19530111b1
    public boolean oh() {
        return this.LLLILZLLLI;
    }

    public InterfaceC19530111b1 q9() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC19530111b1
    public void Ma1(Function1<? super StickerModel, Unit> function1) {
        this.LLL = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0083 A[PHI: r17
      0x0083: PHI (r17v12 java.lang.String) = (r17v1 java.lang.String), (r17v13 java.lang.String) binds: [B:9:0x0081, B:7:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d A[PHI: r17
      0x008d: PHI (r17v2 java.lang.String) = (r17v1 java.lang.String), (r17v12 java.lang.String), (r17v12 java.lang.String) binds: [B:9:0x0081, B:11:0x0085, B:13:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[PHI: r17 r18
      0x0091: PHI (r17v11 java.lang.String) = (r17v2 java.lang.String), (r17v12 java.lang.String) binds: [B:15:0x008f, B:13:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r18v10 java.lang.String) = (r18v1 java.lang.String), (r18v11 java.lang.String) binds: [B:15:0x008f, B:13:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[PHI: r17 r18
      0x009b: PHI (r17v3 java.lang.String) = (r17v2 java.lang.String), (r17v11 java.lang.String), (r17v11 java.lang.String) binds: [B:15:0x008f, B:17:0x0093, B:19:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v10 java.lang.String), (r18v10 java.lang.String) binds: [B:15:0x008f, B:17:0x0093, B:19:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[PHI: r17 r18 r19
      0x009f: PHI (r17v10 java.lang.String) = (r17v3 java.lang.String), (r17v11 java.lang.String) binds: [B:21:0x009d, B:19:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r18v9 java.lang.String) = (r18v2 java.lang.String), (r18v10 java.lang.String) binds: [B:21:0x009d, B:19:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r19v8 java.lang.String) = (r19v1 java.lang.String), (r19v9 java.lang.String) binds: [B:21:0x009d, B:19:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3 A[PHI: r17 r18 r19
      0x00a3: PHI (r17v9 java.lang.String) = (r17v3 java.lang.String), (r17v10 java.lang.String) binds: [B:21:0x009d, B:23:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r18v8 java.lang.String) = (r18v2 java.lang.String), (r18v9 java.lang.String) binds: [B:21:0x009d, B:23:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r19v7 java.lang.String) = (r19v1 java.lang.String), (r19v8 java.lang.String) binds: [B:21:0x009d, B:23:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7 A[PHI: r4 r17 r18 r19
      0x00a7: PHI (r4v1 java.lang.String) = (r4v6 java.lang.String), (r4v7 java.lang.String) binds: [B:25:0x00a5, B:23:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r17v4 java.lang.String) = (r17v9 java.lang.String), (r17v10 java.lang.String) binds: [B:25:0x00a5, B:23:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r18v3 java.lang.String) = (r18v8 java.lang.String), (r18v9 java.lang.String) binds: [B:25:0x00a5, B:23:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r19v2 java.lang.String) = (r19v7 java.lang.String), (r19v8 java.lang.String) binds: [B:25:0x00a5, B:23:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[PHI: r4 r17 r18 r19
      0x00ab: PHI (r4v5 java.lang.String) = (r4v1 java.lang.String), (r4v6 java.lang.String) binds: [B:27:0x00a9, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r17v8 java.lang.String) = (r17v4 java.lang.String), (r17v9 java.lang.String) binds: [B:27:0x00a9, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r18v7 java.lang.String) = (r18v3 java.lang.String), (r18v8 java.lang.String) binds: [B:27:0x00a9, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r19v6 java.lang.String) = (r19v2 java.lang.String), (r19v7 java.lang.String) binds: [B:27:0x00a9, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[PHI: r1 r4 r17 r18 r19
      0x00af: PHI (r1v4 java.lang.String) = (r1v1 java.lang.String), (r1v5 java.lang.String) binds: [B:27:0x00a9, B:29:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r4v4 java.lang.String) = (r4v1 java.lang.String), (r4v5 java.lang.String) binds: [B:27:0x00a9, B:29:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r17v7 java.lang.String) = (r17v4 java.lang.String), (r17v8 java.lang.String) binds: [B:27:0x00a9, B:29:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r18v6 java.lang.String) = (r18v3 java.lang.String), (r18v7 java.lang.String) binds: [B:27:0x00a9, B:29:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r19v5 java.lang.String) = (r19v2 java.lang.String), (r19v6 java.lang.String) binds: [B:27:0x00a9, B:29:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC19531111bB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel d5(java.lang.String r65) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19530611b6.d5(java.lang.String):com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
    }

    @Override // X.InterfaceC19530111b1
    public void hp2(C0FWT c0fwt) {
        this.LLLILZ = c0fwt;
    }

    @Override // X.InterfaceC19530111b1
    public void j7(TextStickerModel textStickerModel) {
        if (!C0F8Y.LJII(textStickerModel)) {
            return;
        }
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj != null) {
            interfaceC391240FVqQj.k3(textStickerModel, EnumC356070Dxd.COMMIT);
        }
        AbstractC19531111bB.O4(this, false, 1, null);
        P4();
        C390090FRf c390090FRfD5 = D5();
        if (c390090FRfD5 != null) {
            c390090FRfD5.LJIJ(c390090FRfD5.LJJIIJZLJL(), true);
            c390090FRfD5.setVisible(true);
        }
        C391280FVu c391280FVu = AbstractC19531111bB.LLJLLL;
        C0FVT c0fvtD6 = d6();
        InterfaceC391240FVq interfaceC391240FVqQj2 = qj();
        c391280FVu.getClass();
        C391280FVu.LIZ(c0fvtD6, interfaceC391240FVqQj2);
    }

    @Override // X.InterfaceC19530111b1
    public void kI(TextStickerModel textStickerModel) {
        C347650Dk3 c347650Dk3LJJJJIZL;
        String memeSoundBgmUuid;
        String str;
        AbstractC1452680nuE abstractC1452680nuEGc;
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        AbstractC1452680nuE abstractC1452680nuEGc2;
        C348100Dkm c348100DkmLIZIZ2;
        InterfaceC391070FUz interfaceC391070FUzLJFF2;
        TextStickerCompatModel compatModel;
        AbstractC1452680nuE abstractC1452680nuEGc3;
        C348100Dkm c348100DkmLIZIZ3;
        InterfaceC391070FUz interfaceC391070FUzLJFF3;
        InterfaceC1455860nzM interfaceC1455860nzMU5 = U5();
        if (interfaceC1455860nzMU5 != null && (abstractC1452680nuEGc3 = interfaceC1455860nzMU5.gc()) != null && (c348100DkmLIZIZ3 = C352130DrH.LIZIZ(abstractC1452680nuEGc3.LJJ())) != null && (interfaceC391070FUzLJFF3 = c348100DkmLIZIZ3.LJFF()) != null) {
            c347650Dk3LJJJJIZL = interfaceC391070FUzLJFF3.LJJJJIZL(EnumC355960DxS.MEME_SOUND_BGM);
        } else {
            c347650Dk3LJJJJIZL = null;
        }
        if (textStickerModel != null && (compatModel = textStickerModel.getCompatModel()) != null) {
            memeSoundBgmUuid = compatModel.getMemeSoundBgmUuid();
        } else {
            memeSoundBgmUuid = null;
        }
        if (c347650Dk3LJJJJIZL != null) {
            str = c347650Dk3LJJJJIZL.LIZJ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(memeSoundBgmUuid, str)) {
            InterfaceC1455860nzM interfaceC1455860nzMU52 = U5();
            if (interfaceC1455860nzMU52 != null && (abstractC1452680nuEGc2 = interfaceC1455860nzMU52.gc()) != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(abstractC1452680nuEGc2.LJJ())) != null && (interfaceC391070FUzLJFF2 = c348100DkmLIZIZ2.LJFF()) != null) {
                interfaceC391070FUzLJFF2.LJJIJIL(EnumC355960DxS.MEME_SOUND_BGM);
            }
            K6().creativeModel.stickerModel.memeSoundMusicParam = null;
            return;
        }
        if (textStickerModel != null) {
            return;
        }
        InterfaceC1455860nzM interfaceC1455860nzMU53 = U5();
        if (interfaceC1455860nzMU53 != null && (abstractC1452680nuEGc = interfaceC1455860nzMU53.gc()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(abstractC1452680nuEGc.LJJ())) != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null) {
            interfaceC391070FUzLJFF.LJJIJIL(EnumC355960DxS.MEME_SOUND_BGM);
        }
        K6().creativeModel.stickerModel.memeSoundMusicParam = null;
    }

    public final C347650Dk3 n9(MemeSoundMusicParam memeSoundMusicParam) {
        long maxEnd;
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor;
        NLEModel model;
        NLETrack mainTrack;
        C348100Dkm c348100DkmLIZIZ3;
        InterfaceC391070FUz interfaceC391070FUzLJFF2;
        C347650Dk3 c347650Dk3LJJJJIZL;
        AbstractC1452680nuE abstractC1452680nuEGc = U5().gc();
        if (abstractC1452680nuEGc != null && (c348100DkmLIZIZ3 = C352130DrH.LIZIZ(abstractC1452680nuEGc.LJJ())) != null && (interfaceC391070FUzLJFF2 = c348100DkmLIZIZ3.LJFF()) != null && (c347650Dk3LJJJJIZL = interfaceC391070FUzLJFF2.LJJJJIZL(EnumC355960DxS.MEME_SOUND_BGM)) != null) {
            return c347650Dk3LJJJJIZL;
        }
        AbstractC1452680nuE abstractC1452680nuEGc2 = U5().gc();
        if (abstractC1452680nuEGc2 != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(abstractC1452680nuEGc2.LJJ())) != null && (nLEEditor = c348100DkmLIZIZ2.LIZ) != null && (model = nLEEditor.getModel()) != null && (mainTrack = model.getMainTrack()) != null) {
            maxEnd = mainTrack.getMaxEnd() / 1000;
            if (maxEnd > memeSoundMusicParam.getDuration()) {
                maxEnd = memeSoundMusicParam.getDuration();
            }
        } else {
            maxEnd = -2;
        }
        AbstractC1452680nuE abstractC1452680nuEGc3 = U5().gc();
        if (abstractC1452680nuEGc3 == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(abstractC1452680nuEGc3.LJJ())) == null || (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) == null) {
            return null;
        }
        C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.MEME_SOUND_BGM);
        c347650Dk3.LIZIZ = memeSoundMusicParam.getPath();
        c347650Dk3.LJFF = 0L;
        c347650Dk3.LJI = maxEnd;
        c347650Dk3.LIZLLL = 0L;
        c347650Dk3.LJ = memeSoundMusicParam.getDuration();
        c347650Dk3.LJII = memeSoundMusicParam.getDuration();
        interfaceC391070FUzLJFF.LJJIJ(c347650Dk3, true);
        return c347650Dk3;
    }

    @Override // X.AbstractC19531111bB
    public void o7(StickerModel stickerModel) {
        TextStickerModel textStickerModel;
        C347650Dk3 c347650Dk3N9;
        String placeholderSlotId;
        NLEModel nLEModelLIZ;
        VecNLETrackSPtr tracks;
        String str;
        String musicId;
        String placeholderSlotId2;
        TextStickerModel textStickerModel2;
        TextStickerCompatModel compatModel;
        String str2;
        TextStickerCompatModel compatModel2;
        String musicId2;
        super.o7(stickerModel);
        boolean z = stickerModel instanceof TextStickerModel;
        if (z && (textStickerModel = (TextStickerModel) stickerModel) != null && C0F8Y.LJII(textStickerModel)) {
            MemeSoundMusicParam memeSoundMusicParam = this.LLJJJJ;
            if (memeSoundMusicParam == null) {
                c347650Dk3N9 = null;
            } else {
                c347650Dk3N9 = n9(memeSoundMusicParam);
            }
            if (z) {
                TextStickerModel textStickerModel3 = (TextStickerModel) stickerModel;
                if (textStickerModel3 != null && (compatModel2 = textStickerModel3.getCompatModel()) != null) {
                    if (memeSoundMusicParam != null) {
                        musicId2 = memeSoundMusicParam.getMusicId();
                    } else {
                        musicId2 = null;
                    }
                    compatModel2.setMemeSoundMusicId(musicId2);
                }
                if (z && (textStickerModel2 = (TextStickerModel) stickerModel) != null && (compatModel = textStickerModel2.getCompatModel()) != null) {
                    if (c347650Dk3N9 != null) {
                        str2 = c347650Dk3N9.LIZJ;
                    } else {
                        str2 = null;
                    }
                    compatModel.setMemeSoundBgmUuid(str2);
                }
            }
            this.LLLIL.add(((TextStickerModel) stickerModel).getUuid());
            Function1<? super StickerModel, Unit> function1 = this.LLL;
            if (function1 != null) {
                function1.invoke(stickerModel);
            }
            this.LLLILZLLLI = false;
            TextStickerData textStickerDataVf = Vf();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStickerAdded-->placeholderSlotId:");
            if (textStickerDataVf != null) {
                placeholderSlotId = textStickerDataVf.getPlaceholderSlotId();
            } else {
                placeholderSlotId = null;
            }
            sbLIZ.append(placeholderSlotId);
            C2188811AlT.LIZIZ(sbLIZ);
            AbstractC1452680nuE abstractC1452680nuEGc = U5().gc();
            if (abstractC1452680nuEGc != null && (nLEModelLIZ = C352130DrH.LIZ(abstractC1452680nuEGc.LJJ())) != null && (tracks = nLEModelLIZ.getTracks()) != null) {
                for (NLETrack nLETrack : tracks) {
                    if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                        Iterator<NLETrackSlot> it2 = nLETrack.getSlots().iterator();
                        boolean z2 = false;
                        while (it2.hasNext()) {
                            String uuid = it2.next().getUUID();
                            if (textStickerDataVf != null) {
                                placeholderSlotId2 = textStickerDataVf.getPlaceholderSlotId();
                            } else {
                                placeholderSlotId2 = null;
                            }
                            if (Intrinsics.LJFF(uuid, placeholderSlotId2)) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            nLETrack.setExtra("is_ai_caption", "1");
                            if (c347650Dk3N9 != null) {
                                str = c347650Dk3N9.LIZJ;
                            } else {
                                str = null;
                            }
                            nLETrack.setExtra("meme_sound_bgm_uuid", str);
                            if (memeSoundMusicParam != null) {
                                musicId = memeSoundMusicParam.getMusicId();
                            } else {
                                musicId = null;
                            }
                            nLETrack.setExtra("meme_sound_music_id", musicId);
                        }
                    }
                }
            }
            InterfaceC1413540mt6 interfaceC1413540mt6J9 = J9();
            if (interfaceC1413540mt6J9 != null) {
                interfaceC1413540mt6J9.lz(null);
            }
            this.LLLJ.LJIIJ(1);
        }
    }

    @Override // X.AbstractC19531111bB
    public void s7(int i) {
        TextStickerModel textStickerModelX5 = x5();
        if (textStickerModelX5 != null && textStickerModelX5.getId() == i) {
            AbstractC19531111bB.O4(this, false, 1, null);
            C390090FRf c390090FRfD5 = D5();
            if (c390090FRfD5 != null) {
                c390090FRfD5.LJIJ(c390090FRfD5.LJJIIJZLJL(), true);
            }
            if (!Intrinsics.LJFF(K6().mShootWay, "story")) {
                U9();
                return;
            }
            MemeSoundMusicParam memeSoundMusicParam = this.LLJJJJ;
            if (memeSoundMusicParam == null) {
                return;
            }
            kI(null);
            n9(memeSoundMusicParam);
        }
    }

    @Override // X.AbstractC19531111bB
    public float u6(BaseStickerModel baseStickerModel) {
        if (baseStickerModel == null) {
            return 0.0f;
        }
        return baseStickerModel.getTranslateY() - ((((baseStickerModel.getHeight() / 2.0f) * baseStickerModel.getScale()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) * ((float) Math.cos(Math.toRadians(baseStickerModel.getRotation()))));
    }

    @Override // X.AbstractC19531111bB
    public void y7(int i) {
        String str;
        super.y7(i);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("creation_id", K6().getCreationId());
        if (i == 0) {
            str = "icon";
        } else {
            str = "text_more";
        }
        c0lab.LJ("enter_method", str);
        C20684815ws.LJIILLIIL("shuffle_meme_audio", c0lab.LIZ);
    }

    public C19530611b6(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJZIJLIL = this;
        this.LLLF = C452501pT.LIZIZ(new AwS566S0100000_22(c1drg, 38));
        this.LLLFFI = true;
        this.LLLFZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444410ngt.class, null);
        this.LLLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417050myl.class, null);
        this.LLLII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
        this.LLLIIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1415760mwg.class, null);
        this.LLLIIIL = new C1782550wUH("", false, true, true, true);
        this.LLLIL = new CopyOnWriteArrayList<>();
        this.LLLILZJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
        C560530Lyd<Integer> c560530Lyd = new C560530Lyd<>();
        this.LLLJ = c560530Lyd;
        this.LLLJIL = c560530Lyd;
    }

    @Override // X.AbstractC19531111bB
    public void I7(String str, TTSModel tTSModel) {
        z8();
        TextStickerModel textStickerModelD5 = d5(str);
        C0F7U.LJIIJ(C1664590tQ1.LJIIIZ(this), U5(), "AI caption", C0F7U.LIZJ(textStickerModelD5), new AwS65S1300000_29(textStickerModelD5, this, tTSModel, str, 1));
    }

    @Override // X.AbstractC19531111bB
    public void u7(StickerModel stickerModel, String str) {
        super.u7(stickerModel, str);
        K6().creativeModel.stickerModel.memeSoundMusicParam = null;
        kI((TextStickerModel) stickerModel);
        InterfaceC1413540mt6 interfaceC1413540mt6J9 = J9();
        if (interfaceC1413540mt6J9 != null) {
            interfaceC1413540mt6J9.lz(null);
        }
        this.LLLILZLLLI = false;
        if (Intrinsics.LJFF(str, "SLIDE_UP")) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_method", "drag");
            C20684815ws.LJIILLIIL("delete_meme_audio", c0lab.LIZ);
        }
        if (!Intrinsics.LJFF(str, "SYNC_FROM_EDITOR_PRO") && !Intrinsics.LJFF(this.LLLIIIL.LIZLLL, "auto_cut")) {
            C2487409ou.LIZLLL(200L, new ARunnableS129S0100000_29(this, 16));
        }
        this.LLLJ.LJIIJ(2);
    }

    @Override // X.InterfaceC19530111b1
    public void Cu0(List<String> list, List<TTSModel> list2, MemeSoundMusicParam memeSoundMusicParam) {
        if (this.LLLILZLLLI) {
            return;
        }
        if (list.size() != list2.size()) {
            this.LLLILZLLLI = false;
            return;
        }
        if (Vf() != null) {
            this.LLLILZLLLI = false;
            return;
        }
        this.LLLIIL = null;
        this.LLLIILIL = null;
        y8();
        PX(list, list2, memeSoundMusicParam);
        InterfaceC377540ErA interfaceC377540ErAI9 = I9();
        if ((interfaceC377540ErAI9 != null && interfaceC377540ErAI9.isShowing()) || this.LLLIIIL.LIZ) {
            Function1<? super StickerModel, Unit> function1 = this.LLL;
            if (function1 != null) {
                function1.invoke(null);
            }
            this.LLLFF = true;
            this.LLLILZLLLI = false;
            return;
        }
        this.LLLILZLLLI = true;
        r8();
    }

    @Override // X.InterfaceC19530111b1
    public void PX(List<String> list, List<TTSModel> list2, MemeSoundMusicParam memeSoundMusicParam) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().toUpperCase(Locale.ROOT));
        }
        int i = 0;
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                String str = (String) obj;
                if (i2 < list2.size()) {
                    ((TTSModel) ListProtector.get(list2, i2)).audioText = str;
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (this.LLJJJJJIL != 0 && Intrinsics.LJFF(C13LP.LJJJLL(this.LLJJJ), C13LP.LJJJLL(arrayList))) {
            i = this.LLJJJJJIL - 1;
        }
        this.LLJJJJJIL = i;
        this.LLJJJJ = memeSoundMusicParam;
        T8(arrayList, list2);
    }

    @Override // X.AbstractC19531111bB
    public void T4(TextStickerModel textStickerModel, TTSModel tTSModel, boolean z, Function1<? super TextStickerModel, Unit> function1) {
        IAnotherMusicService iAnotherMusicService;
        Class<?> cls;
        boolean z2;
        Map<String, String> map;
        TTSModel ttsModel = textStickerModel.getTtsModel();
        if (ttsModel != null && (map = ttsModel.ttsExtraMap) != null) {
            map.put("is_meme_audio", "1");
        }
        InterfaceC1623990sMX interfaceC1623990sMXLJJJJL = C0CHQ.LIZ().LJJJJL();
        Class<?> clsLIZJ = null;
        if (interfaceC1623990sMXLJJJJL instanceof IAnotherMusicService) {
            iAnotherMusicService = (IAnotherMusicService) interfaceC1623990sMXLJJJJL;
        } else {
            iAnotherMusicService = null;
        }
        Activity activityLIZIZ = C19713312Ax.LIZIZ();
        if (activityLIZIZ != null) {
            cls = activityLIZIZ.getClass();
        } else {
            cls = null;
        }
        if (iAnotherMusicService != null) {
            clsLIZJ = iAnotherMusicService.LIZJ();
        }
        boolean zLJFF = Intrinsics.LJFF(cls, clsLIZJ);
        boolean z3 = this.LLLIIIL.LIZIZ;
        if (!zLJFF && this.LLLFFI && z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.T4(textStickerModel, tTSModel, z2, new AwS608S0100000_29(this, 52));
    }

    @Override // X.InterfaceC19530111b1
    public void mt1(boolean z, boolean z2, boolean z3, String str, boolean z4) {
        AVMusic aVMusicLJI;
        List<C0FTJ<StickerModel>> listLLLLLZ;
        String str2;
        TextStickerModel textStickerModel;
        TTSModel ttsModel;
        Map<String, String> map;
        InterfaceC19530911b9 interfaceC19530911b9Sd2;
        LiveEvent<AVMusic> liveEventB7;
        this.LLLIIIL.getClass();
        this.LLLIIIL = new C1782550wUH(str, z, z2, z3, z4);
        C19522211Zk c19522211Zk = C19522211Zk.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBuildMemeAudioConfig-->");
        sbLIZ.append(this.LLLIIIL);
        C201955140j.LIZJ(c19522211Zk, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1453200nv4 interfaceC1453200nv4W9 = w9();
        if (interfaceC1453200nv4W9 != null && (liveEventB7 = interfaceC1453200nv4W9.b7()) != null) {
            aVMusicLJI = liveEventB7.LJI();
        } else {
            aVMusicLJI = null;
        }
        if (!z && aVMusicLJI == null) {
            ma();
            da();
        } else {
            U9();
        }
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj != null && (interfaceC19530911b9Sd2 = interfaceC391240FVqQj.sd2()) != null) {
            interfaceC19530911b9Sd2.LIZ(z3);
        }
        InterfaceC391240FVq interfaceC391240FVqQj2 = qj();
        if (interfaceC391240FVqQj2 != null && (listLLLLLZ = interfaceC391240FVqQj2.LLLLLZ(EnumC1466150oFx.TEXT)) != null) {
            for (C0FTJ<StickerModel> c0ftj : listLLLLLZ) {
                StickerModel stickerModelLJLI = c0ftj.LJLI();
                if ((stickerModelLJLI instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModelLJLI) != null && (ttsModel = textStickerModel.getTtsModel()) != null && (map = ttsModel.ttsExtraMap) != null) {
                    str2 = map.get("is_meme_audio");
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, "1")) {
                    c0ftj.LJFF(z4);
                }
            }
        }
    }
}
