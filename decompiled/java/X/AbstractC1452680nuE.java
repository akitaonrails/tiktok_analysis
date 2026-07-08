package X;

import Y.ACallableS70S1100000_22;
import Y.ARunnableS122S0100000_22;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUserConfig;
import com.ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS18S1201000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS21S0100001_5;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS2S0020000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1452680nuE {
    public static final /* synthetic */ int LJJIJIIJI = 0;
    public final C1441900ncq LIZ;
    public MutableLiveData<Boolean> LIZIZ;
    public MutableLiveData<C1452720nuI> LIZJ;
    public MutableLiveData<IAudioEffectParam> LIZLLL;
    public ArrayList<EffectPointModel> LJ;
    public VEEditorAutoStartStopArbiter LJFF;
    public Context LJI;
    public InterfaceC1452170ntP LJII;
    public InterfaceC574340Mfo LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public C364400EQk LJIIJJI;
    public C1450140nq8 LJIIL;
    public boolean LJIILIIL;
    public InterfaceC358220E2q LJIILJJIL;
    public final C358640E4g LJIILL;
    public ExecutorService LJIILLIIL;
    public int LJIIZILJ;
    public SafeHandler LJIJ;
    public final InterfaceC1463990oCT LJIJI;
    public SurfaceView LJIJJ;
    public LifecycleOwner LJIJJLI;
    public InterfaceC1464190oCn LJIL;
    public InterfaceC1452850nuV LJJ;
    public InterfaceC1452800nuQ LJJI;
    public InterfaceC1452860nuW LJJIFFI;
    public Set<String> LJJII;
    public String LJJIII;
    public final AtomicBoolean LJJIIJ;
    public final int LJJIIJZLJL;
    public C1452760nuM LJJIIZ;
    public FilterBean LJJIIZI;
    public float LJJIJ;

    public void LJJIJ(SurfaceView surfaceView) {
    }

    public final void LJIILLIIL() {
        if (this.LJII == null) {
            return;
        }
        InterfaceC1463990oCT interfaceC1463990oCT = this.LJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoEditor");
        sbLIZ.append("enableComposerFilter: mComposerFilterIndex = ");
        sbLIZ.append(this.LJJIIJZLJL);
        interfaceC1463990oCT.i(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final InterfaceC358220E2q LJIIZILJ() {
        InterfaceC358220E2q interfaceC358220E2q = this.LJIILJJIL;
        if (interfaceC358220E2q != null) {
            return interfaceC358220E2q;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final InterfaceC1452170ntP LJIJ() {
        InterfaceC1452170ntP interfaceC1452170ntP = this.LJII;
        if (interfaceC1452170ntP != null) {
            return interfaceC1452170ntP;
        }
        return null;
    }

    public final int LJIJJ() {
        if (this.LJII != null) {
            return LJIJ().mo51if();
        }
        return 0;
    }

    public final ExecutorService LJIJJLI() {
        ExecutorService executorService = this.LJIILLIIL;
        if (executorService != null) {
            return executorService;
        }
        ExecutorService executorServiceH4 = C786410Ut5.h4();
        this.LJIILLIIL = executorServiceH4;
        return executorServiceH4;
    }

    public final C1452760nuM LJIL() {
        C1452760nuM c1452760nuM = this.LJJIIZ;
        if (c1452760nuM != null) {
            return c1452760nuM;
        }
        C1452760nuM c1452760nuM2 = new C1452760nuM();
        final AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 826);
        final AwS566S0100000_22 awS566S0100000_222 = new AwS566S0100000_22(this, 823);
        final AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(262);
        final AFwS261S0000000_22 aFwS261S0000000_222 = AFwS261S0000000_22.get$arr$(263);
        c1452760nuM2.LIZ(new AbstractC1452710nuH(awS566S0100000_22, awS566S0100000_222, aFwS261S0000000_22, aFwS261S0000000_222) { // from class: X.0nuG
            public final Function0<InterfaceC1452170ntP> LIZIZ;
            public final Function0<List<EffectPointModel>> LIZJ;
            public final Function1<Integer, Integer> LIZLLL;
            public final Function1<Integer, Integer> LJ;

            @Override // X.AbstractC1452710nuH
            public final void LIZIZ(C1452720nuI c1452720nuI) {
                List<EffectPointModel> listInvoke = this.LIZJ.invoke();
                Function0<InterfaceC1452170ntP> function0 = this.LIZIZ;
                if (listInvoke != null) {
                    for (EffectPointModel effectPointModel : listInvoke) {
                        if (C1452720nuI.LJ(c1452720nuI)) {
                            int iMo51if = function0.invoke().mo51if();
                            int endPoint = iMo51if - effectPointModel.getEndPoint();
                            int startPoint = iMo51if - effectPointModel.getStartPoint();
                            effectPointModel.setStartPoint(endPoint);
                            effectPointModel.setEndPoint(startPoint);
                        } else if (!C1452720nuI.LIZJ(c1452720nuI) && !C1452720nuI.LIZLLL(c1452720nuI) && !C1452720nuI.LIZIZ(c1452720nuI)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("apply time effect: ");
                            sbLIZ.append(c1452720nuI);
                            sbLIZ.append(" is not supported yet.");
                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
            }

            @Override // X.AbstractC1452710nuH
            public final void LIZJ(C1452720nuI c1452720nuI) {
                List<EffectPointModel> listInvoke = this.LIZJ.invoke();
                Function0<InterfaceC1452170ntP> function0 = this.LIZIZ;
                if (listInvoke != null) {
                    for (EffectPointModel effectPointModel : listInvoke) {
                        if (C1452720nuI.LJ(c1452720nuI)) {
                            int iMo51if = function0.invoke().mo51if();
                            int endPoint = iMo51if - effectPointModel.getEndPoint();
                            int startPoint = iMo51if - effectPointModel.getStartPoint();
                            effectPointModel.setStartPoint(endPoint);
                            effectPointModel.setEndPoint(startPoint);
                        } else if (!C1452720nuI.LIZJ(c1452720nuI) && !C1452720nuI.LIZLLL(c1452720nuI) && !C1452720nuI.LIZIZ(c1452720nuI)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("remove time effect: ");
                            sbLIZ.append(c1452720nuI);
                            sbLIZ.append(" is not supported yet.");
                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
            }

            {
                super(awS566S0100000_22);
                this.LIZIZ = awS566S0100000_22;
                this.LIZJ = awS566S0100000_222;
                this.LIZLLL = aFwS261S0000000_22;
                this.LJ = aFwS261S0000000_222;
            }
        });
        c1452760nuM2.LIZ(new C1450160nqA(awS566S0100000_22, new AwS566S0100000_22(this, 824)));
        final AwS566S0100000_22 awS566S0100000_223 = new AwS566S0100000_22(this, 825);
        c1452760nuM2.LIZ(new AbstractC1452710nuH(awS566S0100000_22, awS566S0100000_223) { // from class: X.0nuK
            public final Function0<MutableLiveData<IAudioEffectParam>> LIZIZ;

            @Override // X.AbstractC1452710nuH
            public final void LIZIZ(C1452720nuI c1452720nuI) {
                IAudioEffectParam value;
                MutableLiveData<IAudioEffectParam> mutableLiveDataInvoke = this.LIZIZ.invoke();
                if (mutableLiveDataInvoke == null || (value = mutableLiveDataInvoke.getValue()) == null) {
                    return;
                }
                int seqIn = value.getSeqIn();
                int seqOut = value.getSeqOut();
                LIZ(c1452720nuI, seqIn);
                LIZ(c1452720nuI, seqOut);
                value.setSeqIn(seqIn);
                value.setSeqOut(seqOut);
                mutableLiveDataInvoke.setValue(value);
            }

            @Override // X.AbstractC1452710nuH
            public final void LIZJ(C1452720nuI c1452720nuI) {
                IAudioEffectParam value;
                MutableLiveData<IAudioEffectParam> mutableLiveDataInvoke = this.LIZIZ.invoke();
                if (mutableLiveDataInvoke == null || (value = mutableLiveDataInvoke.getValue()) == null) {
                    return;
                }
                int seqIn = value.getSeqIn();
                int seqOut = value.getSeqOut();
                LIZLLL(c1452720nuI, seqIn);
                LIZLLL(c1452720nuI, seqOut);
                value.setSeqIn(seqIn);
                value.setSeqOut(seqOut);
                mutableLiveDataInvoke.setValue(value);
            }

            {
                this.LIZIZ = awS566S0100000_223;
            }
        });
        this.LJJIIZ = c1452760nuM2;
        return c1452760nuM2;
    }

    public final InterfaceC1452170ntP LJJ() {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ = LJIJ();
        if (interfaceC1452170ntPLJIJ != null) {
            return interfaceC1452170ntPLJIJ;
        }
        "initVEEditor not called yet".toString();
        throw new IllegalArgumentException("initVEEditor not called yet");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0E4g] */
    public AbstractC1452680nuE(C1441900ncq c1441900ncq) {
        if (c1441900ncq != null) {
            if (Intrinsics.LJFF(c1441900ncq.LIZIZ, "TiktokEditPreviewComponent")) {
                C1435860nT6.LIZJ = true;
                C1435860nT6.LIZ = c1441900ncq.LJII;
                C1435860nT6.LIZLLL = c1441900ncq.LJIIJJI;
                C1435860nT6.LIZIZ = c1441900ncq.LJIIJ;
            } else if (C1435860nT6.LIZJ && Intrinsics.LJFF(c1441900ncq.LIZIZ, "VEVideoPublishEditPresenter")) {
                c1441900ncq.LJIIJ = C1435860nT6.LIZIZ;
                c1441900ncq.LJIIJJI = C1435860nT6.LIZLLL;
                c1441900ncq.LJII = C1435860nT6.LIZ;
            } else if (Intrinsics.LJFF(c1441900ncq.LIZIZ, "MvSaveLocalCompile")) {
                c1441900ncq.LJIIJ = EnumC1441790ncf.MV_THEME;
            } else if (Intrinsics.LJFF(c1441900ncq.LIZIZ, "TextToImagePreviewComponent")) {
                c1441900ncq.LJIIJJI = EnumC1441860ncm.UPLOAD_ONLY_IMAGE;
            }
        } else {
            c1441900ncq = new C1441900ncq();
        }
        this.LIZ = c1441900ncq;
        this.LJIIIZ = -1;
        this.LJIIJ = -1;
        new ArrayList();
        new ArrayList();
        this.LJIILL = new InterfaceC1453220nv6() { // from class: X.0E4g
            @Override // X.InterfaceC1453220nv6
            public final float LIZ(FilterBean filterBean) {
                C817403Hg c817403Hg = new C817403Hg();
                float fLIZLLL = C1643880ssc.LIZLLL(filterBean);
                c817403Hg.element = fLIZLLL;
                if (fLIZLLL == 0.0f) {
                    AbstractC1452680nuE abstractC1452680nuE = this.LIZ;
                    if (abstractC1452680nuE.LJII != null) {
                        C391360FWc.LIZIZ(abstractC1452680nuE, "", abstractC1452680nuE.LJIJ(), new AwS371S0200000_5(c817403Hg, filterBean, 223));
                    }
                }
                return c817403Hg.element;
            }
        };
        this.LJIJI = C2219091BtD.LIZLLL();
        this.LJJIIJ = new AtomicBoolean(false);
        this.LJJIIJZLJL = -1;
        this.LJJIJ = -1.0f;
    }

    public static EffectPointModel LJI(C0EYM c0eym) {
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setType(1);
        effectPointModel.setSelectedColor(c0eym.LJIIIIZZ);
        effectPointModel.setResDir(c0eym.LJIIL);
        effectPointModel.setKey(c0eym.LJIILIIL);
        effectPointModel.setFromEnd(c0eym.LJII);
        effectPointModel.setStartPoint((int) c0eym.LIZJ);
        effectPointModel.setUiStartPoint((int) c0eym.LJ);
        effectPointModel.setUiEndPoint((int) c0eym.LJFF);
        effectPointModel.setName(c0eym.LJIILL);
        effectPointModel.setDuration(c0eym.LJIILLIIL);
        effectPointModel.setCategory(c0eym.LJIIZILJ);
        effectPointModel.setExtra(c0eym.LJIJ);
        effectPointModel.setAdjustParams(c0eym.LJIJI);
        effectPointModel.setIsNewEngineEffect(c0eym.LJIJJ);
        return effectPointModel;
    }

    public static NLETrack LJIJI(C348100Dkm c348100Dkm) {
        NLETrack nLETrackLJIIJ = c348100Dkm.LJIIJ(new AwS584S0100000_5(c348100Dkm, 899));
        if (nLETrackLJIIJ != null && NLETrackMV.dynamicCast((NLENode) nLETrackLJIIJ) == null) {
            return nLETrackLJIIJ;
        }
        return null;
    }

    public final int LIZ(AudioRecorderParam audioRecorderParam) {
        String str;
        InterfaceC1463990oCT interfaceC1463990oCT = this.LJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoEditor");
        sbLIZ.append(" addAudioRecord needDel ");
        sbLIZ.append(audioRecorderParam.getNeedDel());
        sbLIZ.append(" hasRecord ");
        sbLIZ.append(audioRecorderParam.hasRecord());
        sbLIZ.append(" recordIndex ");
        sbLIZ.append(audioRecorderParam.getAudioRecordIndex());
        interfaceC1463990oCT.i(C2188811AlT.LIZIZ(sbLIZ));
        if (audioRecorderParam.getNeedDel()) {
            C391360FWc.LIZIZ(this, "VEVideoEditor.removeAudioRecord", LJIJ(), AFwS234S0000000_5.get$arr$(429));
            audioRecorderParam.setNeedDel(false);
            audioRecorderParam.setAudioRecordIndex(-2);
            this.LJIIJ = -1;
            return -2;
        }
        if (!audioRecorderParam.hasRecord()) {
            return -1;
        }
        C391360FWc.LIZIZ(this, "", LJIJ(), new AwS388S0200000_22(this, audioRecorderParam, 150));
        if (audioRecorderParam.getAudioRecordIndex() >= 0) {
            InterfaceC1463990oCT interfaceC1463990oCT2 = this.LJIJI;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VEVideoEditor");
            sbLIZ2.append(" audioRecordIndex >= 0 return");
            interfaceC1463990oCT2.i(C2188811AlT.LIZIZ(sbLIZ2));
            int audioRecordIndex = audioRecorderParam.getAudioRecordIndex();
            this.LJIIIZ = audioRecordIndex;
            return audioRecordIndex;
        }
        C391360FWc.LIZIZ(this, "VEVideoEditor.addAudioRecord", LJIJ(), new AwS371S0200000_5(this, audioRecorderParam, 219));
        C364400EQk c364400EQk = this.LJIIJJI;
        if (c364400EQk != null) {
            str = c364400EQk.LIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "apply") && this.LJIIJ == -1 && !audioRecorderParam.getHasOriginVoiceConversion() && !audioRecorderParam.getHasDubVoiceConversion()) {
            LJIIIIZZ(c364400EQk);
        }
        audioRecorderParam.setAudioRecordIndex(this.LJIIIZ);
        return this.LJIIIZ;
    }

    public final void LIZJ(String str) {
        C15O7.LIZJ(new ACallableS70S1100000_22(this, str, 2)).LIZLLL(new C1466870oH7(this, 8));
    }

    public final void LIZLLL(C0EYM c0eym) {
        String str;
        if (this.LJ == null) {
            this.LJ = new ArrayList<>();
        }
        ArrayList<EffectPointModel> arrayList = this.LJ;
        if (arrayList == null) {
            return;
        }
        String[] strArr = c0eym.LIZIZ;
        int i = 0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        int i2 = c0eym.LJI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 5) {
                        if (i2 != 10) {
                            if (i2 != 7) {
                                if (i2 != 8) {
                                    return;
                                }
                            }
                        }
                        Iterator<EffectPointModel> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().getUuid(), str)) {
                                if (i >= 0 && i < arrayList.size()) {
                                    ((EffectPointModel) ListProtector.get(arrayList, i)).setStartPoint((int) c0eym.LIZJ);
                                    ((EffectPointModel) ListProtector.get(arrayList, i)).setUiStartPoint((int) c0eym.LJ);
                                    ((EffectPointModel) ListProtector.get(arrayList, i)).setEndPoint((int) c0eym.LIZLLL);
                                    ((EffectPointModel) ListProtector.get(arrayList, i)).setUiEndPoint((int) c0eym.LJFF);
                                    return;
                                }
                                return;
                            }
                            i++;
                        }
                        return;
                    }
                    LJJIJIIJI(c0eym, arrayList);
                    return;
                }
                Iterator<EffectPointModel> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(it3.next().getUuid(), str)) {
                        if (i >= 0 && i < arrayList.size()) {
                            ListProtector.remove(arrayList, i);
                            return;
                        }
                        return;
                    }
                    i++;
                }
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(arrayList, arrayList.size() - 1);
            effectPointModel.setEndPoint((int) c0eym.LIZJ);
            effectPointModel.setUiEndPoint((int) c0eym.LJFF);
            return;
        }
        if (strArr != null && strArr.length != 0) {
            EffectPointModel effectPointModelLJI = LJI(c0eym);
            C391360FWc.LIZJ(this, new AwS423S0200000_22(effectPointModelLJI, c0eym, 75));
            arrayList.add(effectPointModelLJI);
        }
    }

    public final void LJ(C348470DlN c348470DlN) {
        String str;
        String str2;
        if (c348470DlN == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (c348470DlN.LIZ) {
            str = "open";
        } else {
            str = "close";
        }
        sbLIZ.append(str);
        sbLIZ.append(" auto enhance, type: ");
        sbLIZ.append(c348470DlN.LIZIZ);
        sbLIZ.append(", use lens hdr model: ");
        sbLIZ.append(c348470DlN.LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = c348470DlN.LIZIZ;
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 20001:
                    case 20002:
                    case 20003:
                    case 20004:
                        if (c348470DlN.LJFF.LIZIZ) {
                            C391360FWc.LIZIZ(this, "", LJIJ(), new AwS371S0200000_5(c348470DlN, this, 221));
                        } else {
                            C2484209oO.LIZ("VEVideoEditor", "Model acquisition error, not available");
                            C391360FWc.LIZIZ(this, "", LJIJ(), new AwS584S0100000_5(c348470DlN, 896));
                        }
                        break;
                    default:
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Draw frame failed，current type = ");
                        sbLIZ2.append(c348470DlN.LIZIZ);
                        C2484209oO.LIZ("HDREnhance", C2188811AlT.LIZIZ(sbLIZ2));
                        C391360FWc.LIZIZ(this, "", LJIJ(), new AwS584S0100000_5(c348470DlN, 896));
                        break;
                }
                return;
            }
            C391360FWc.LIZIZ(this, "", LJIJ(), new AwS584S0100000_5(c348470DlN, 896));
            return;
        }
        boolean z = c348470DlN.LIZ;
        boolean z2 = c348470DlN.LIZJ;
        C391360FWc.LIZIZ(this, "", LJIJ(), new AwS2S0020000_5(z2, z, 2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("apply light enhance ");
        sbLIZ3.append(z);
        if (z2) {
            str2 = "is";
        } else {
            str2 = "is not";
        }
        sbLIZ3.append(str2);
        sbLIZ3.append(" preview");
        C2188811AlT.LIZIZ(sbLIZ3);
    }

    public final void LJFF(FilterBean filterBean) {
        if (filterBean == null) {
            return;
        }
        InterfaceC358220E2q interfaceC358220E2qLJIIZILJ = LJIIZILJ();
        C358640E4g c358640E4g = this.LJIILL;
        float fLIZLLL = C1453210nv5.LIZLLL(filterBean, interfaceC358220E2qLJIIZILJ.LIZ(filterBean, c358640E4g), c358640E4g);
        if (fLIZLLL == -1.0f) {
            fLIZLLL = 0.8f;
        }
        LJJIIZI(fLIZLLL, filterBean, true);
    }

    public NLEEditor LJII(VEPreviewParams vEPreviewParams) {
        return C346630DiP.LIZ();
    }

    public final void LJIIIIZZ(C364400EQk c364400EQk) {
        String str = c364400EQk.LIZ;
        if (Intrinsics.LJFF(str, "apply")) {
            this.LJIIJJI = c364400EQk;
            C391360FWc.LIZIZ(this, "", LJIJ(), new AwS371S0200000_5(c364400EQk, this, 222));
        } else {
            if (!Intrinsics.LJFF(str, "clear")) {
                return;
            }
            this.LJIIJJI = null;
            C391360FWc.LIZIZ(this, "", LJIJ(), new AwS584S0100000_5(this, 897));
        }
    }

    public final void LJIIIZ(C1452730nuJ c1452730nuJ) {
        VEEditor.SEEK_MODE seek_mode;
        int iYf;
        int i = c1452730nuJ.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        return;
                    } else {
                        seek_mode = VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek;
                    }
                } else {
                    seek_mode = VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing;
                }
                if (c1452730nuJ.LIZJ == null) {
                    iYf = LJIJ().nf((int) c1452730nuJ.LIZIZ, seek_mode);
                } else {
                    iYf = LJIJ().Yf((int) c1452730nuJ.LIZIZ, seek_mode, c1452730nuJ.LIZJ);
                }
                if (iYf == 0) {
                    return;
                }
                InterfaceC1463990oCT interfaceC1463990oCT = this.LJIJI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Seek failed. ret = ");
                sbLIZ.append(iYf);
                sbLIZ.append(" See logs for more details.");
                interfaceC1463990oCT.d(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.LJFF;
            if (vEEditorAutoStartStopArbiter == null) {
                return;
            }
            vEEditorAutoStartStopArbiter.LIZJ(true, false, false);
            return;
        }
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter2 = this.LJFF;
        if (vEEditorAutoStartStopArbiter2 == null) {
            return;
        }
        if (vEEditorAutoStartStopArbiter2.LLILZ) {
            vEEditorAutoStartStopArbiter2.LIZJ(false, false, false);
        } else {
            vEEditorAutoStartStopArbiter2.LIZ();
        }
    }

    public void LJIIL(VEVolumeChangeOp vEVolumeChangeOp) {
        C391360FWc.LIZIZ(this, "", LJIJ(), new AwS388S0200000_22(vEVolumeChangeOp, this, 151));
    }

    public void LJIILL(C1450120nq6 c1450120nq6) {
        C391360FWc.LIZIZ(this, "", LJIJ(), new AwS388S0200000_22(this, c1450120nq6, 154));
    }

    public final void LJJIII(IAudioEffectParam iAudioEffectParam) {
        MutableLiveData<IAudioEffectParam> mutableLiveData = this.LIZLLL;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(iAudioEffectParam);
        }
    }

    public void LJJIIJ(boolean z) {
        boolean z2;
        InterfaceC574340Mfo interfaceC574340Mfo = this.LJIIIIZZ;
        if (interfaceC574340Mfo != null) {
            if (interfaceC574340Mfo.getCanvasWidth() > 0 && interfaceC574340Mfo.getCanvasHeight() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LJIJJ != null && z2) {
                LJIJ().tf(VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
                LJIJ().Vf(interfaceC574340Mfo.getCanvasWidth(), interfaceC574340Mfo.getCanvasHeight());
            }
        }
        LJIJ().setLoopPlay(true);
        if ((this.LJIJJ != null || (interfaceC574340Mfo != null && interfaceC574340Mfo.getVeAudioEffectParam() != null)) && z) {
            if (this.LIZ.LIZJ) {
                LJIJJLI().submit(new ARunnableS122S0100000_22(this, 94));
            } else {
                LJIJ().prepare();
            }
        }
    }

    public final void LJJIIZ(boolean z) {
        this.LJIILIIL = z;
        LJIJ().Pe(Boolean.valueOf(z));
    }

    public final void LJIIJ(FilterBean filterBean, boolean z) {
        float fLIZLLL;
        if (filterBean == null) {
            return;
        }
        if (z) {
            InterfaceC358220E2q interfaceC358220E2qLJIIZILJ = LJIIZILJ();
            C358640E4g c358640E4g = this.LJIILL;
            fLIZLLL = C1453210nv5.LIZLLL(filterBean, interfaceC358220E2qLJIIZILJ.LIZ(filterBean, c358640E4g), c358640E4g);
            if (fLIZLLL == -1.0f) {
                fLIZLLL = 0.8f;
            }
        } else {
            fLIZLLL = 1.0f;
        }
        LJJIIZI(fLIZLLL, filterBean, z);
    }

    public boolean LJIIJJI(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
        C391360FWc.LIZIZ(this, "veEditor#changeMusic", LJIJ(), new AwS231S0300000_22(this, (AbstractC1452680nuE) vEPreviewMusicParams, (VEPreviewMusicParams) list, (List<? extends VEPreviewMusicParams>) 27));
        return false;
    }

    public final void LJIILIIL(C0EYM c0eym, C0EYJ c0eyj) {
        int size;
        String strLJJJLZIJ;
        C348380DlE c348380DlE;
        String strLJJJLZIJ2;
        ArrayList<EffectPointModel> arrayList = this.LJ;
        int i = c0eym.LJI;
        int i2 = 2;
        if (i == 0) {
            String str = "";
            if (TextUtils.isEmpty(c0eym.LJIIL)) {
                c0eym.LJIIL = "";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("changeNormalEffectWithNLE:key=");
                sbLIZ.append(c0eym.LJIILIIL);
                sbLIZ.append(",name:");
                sbLIZ.append(c0eym.LJIILL);
                sbLIZ.append(",category:");
                sbLIZ.append(c0eym.LJIIZILJ);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                C2216241Boc c2216241Boc = C2216241Boc.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("changeNormalEffectWithNLE:key=");
                sbLIZ2.append(c0eym.LJIILIIL);
                sbLIZ2.append(",name:");
                sbLIZ2.append(c0eym.LJIILL);
                sbLIZ2.append(",category:");
                sbLIZ2.append(c0eym.LJIIZILJ);
                c2216241Boc.p(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (this.LIZ.LIZLLL) {
                if (c0eym.LJIJJ.booleanValue()) {
                    C348320Dl8 c348320Dl8 = new C348320Dl8();
                    c348320Dl8.LJJII = LSPassThroughRecordSizeConfig.DEFAULT;
                    if (!this.LIZ.LJ) {
                        i2 = 0;
                    }
                    c348320Dl8.LJJIII = i2;
                    c348320Dl8.LJJIIJ = new JSONObject(c0eym.LJIJI);
                    c348380DlE = c348320Dl8;
                } else {
                    c348380DlE = new C348380DlE() { // from class: X.0Dl9
                    };
                }
            } else {
                c348380DlE = new C348380DlE();
            }
            c348380DlE.LIZIZ = c0eym.LIZJ;
            c348380DlE.LIZJ = -2L;
            c348380DlE.LIZLLL = c0eym.LJIIL;
            c348380DlE.LJ = c0eym.LJIJ;
            c348380DlE.LJFF = c0eym.LJIILIIL;
            c348380DlE.LJI = c0eym.LJIILJJIL;
            c348380DlE.LJII = c0eym.LJIILL;
            String str2 = c0eym.LJIIJ;
            if (str2 == null) {
                str2 = "";
            }
            c348380DlE.LJIILJJIL = str2;
            String str3 = c0eym.LJIIJJI;
            if (str3 != null) {
                str = str3;
            }
            c348380DlE.LJIILL = str;
            c348380DlE.LJIILIIL = c0eym.LJIIIZ;
            c348380DlE.LJIIIIZZ = c0eym.LJIIIIZZ;
            c348380DlE.LJIIIZ = 1;
            c348380DlE.LJIIJ = c0eym.LJIIZILJ;
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(LJJ());
            if (c348100DkmLIZIZ != null) {
                c348380DlE.LJIIJJI = C348400DlG.LIZ(c348100DkmLIZIZ.LIZ.getModel()) + 1;
                if (this.LIZ.LJFF) {
                    C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(LJJ());
                    if (c348100DkmLIZIZ2 != null) {
                        strLJJJLZIJ2 = c348100DkmLIZIZ2.LIZLLL().LIZJ(c348380DlE);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    C348100Dkm c348100DkmLIZIZ3 = C352130DrH.LIZIZ(LJJ());
                    if (c348100DkmLIZIZ3 != null) {
                        strLJJJLZIJ2 = c348100DkmLIZIZ3.LIZLLL().LJJJLZIJ(c348380DlE);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                c0eym.LIZIZ = new String[]{strLJJJLZIJ2};
                EffectPointModel effectPointModelLJI = LJI(c0eym);
                effectPointModelLJI.setUuid(c0eym.LIZIZ[0]);
                arrayList.add(effectPointModelLJI);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 5) {
            LJJIJIIJI(c0eym, arrayList);
            return;
        }
        if (i == 6) {
            if (arrayList.isEmpty() || arrayList.size() - 1 < 0) {
                return;
            }
            while (true) {
                int i3 = size - 1;
                if (!arrayList.isEmpty()) {
                    if (C113I.LIZJ(((EffectPointModel) ListProtector.get(new ArrayList(arrayList), size)).getCategory())) {
                        c0eyj.LJJJJJ(new String[]{((EffectPointModel) ListProtector.get(arrayList, size)).getUuid()});
                        ((EffectPointModel) ListProtector.get(arrayList, size)).setFromEnd(c0eym.LJII);
                        ((EffectPointModel) ListProtector.get(arrayList, size)).setStartPoint((int) c0eym.LIZJ);
                        ((EffectPointModel) ListProtector.get(arrayList, size)).setEndPoint((int) c0eym.LIZLLL);
                        ((EffectPointModel) ListProtector.get(arrayList, size)).setUiStartPoint((int) c0eym.LJ);
                        ((EffectPointModel) ListProtector.get(arrayList, size)).setUiEndPoint((int) c0eym.LJFF);
                        EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(arrayList, size);
                        C348380DlE c348380DlE2 = new C348380DlE();
                        c348380DlE2.LIZIZ = effectPointModel.getStartPoint();
                        c348380DlE2.LIZJ = effectPointModel.getEndPoint();
                        c348380DlE2.LIZLLL = effectPointModel.getResDir();
                        c348380DlE2.LJ = effectPointModel.getExtra();
                        c348380DlE2.LJFF = c0eym.LJIILIIL;
                        c348380DlE2.LJII = c0eym.LJIILL;
                        c348380DlE2.LJIIIIZZ = c0eym.LJIIIIZZ;
                        c348380DlE2.LJIIIZ = 3;
                        c348380DlE2.LJIIJ = c0eym.LJIIZILJ;
                        C348100Dkm c348100DkmLIZIZ4 = C352130DrH.LIZIZ(LJJ());
                        if (c348100DkmLIZIZ4 != null) {
                            c348380DlE2.LJIIJJI = C348400DlG.LIZ(c348100DkmLIZIZ4.LIZ.getModel()) + 1;
                            if (this.LIZ.LJFF) {
                                strLJJJLZIJ = c0eyj.LIZJ(c348380DlE2);
                            } else {
                                strLJJJLZIJ = c0eyj.LJJJLZIJ(c348380DlE2);
                            }
                            ((EffectPointModel) ListProtector.get(arrayList, size)).setUuid(strLJJJLZIJ);
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (i3 < 0) {
                        return;
                    } else {
                        size = i3;
                    }
                } else {
                    return;
                }
            }
        } else {
            if (i == 1) {
                EffectPointModel effectPointModel2 = (EffectPointModel) ListProtector.get(arrayList, arrayList.size() - 1);
                C348380DlE c348380DlELJIIJ = c0eyj.LJIIJ(effectPointModel2.getUuid());
                if (c348380DlELJIIJ != null) {
                    c348380DlELJIIJ.LIZJ = c0eym.LIZJ;
                    c0eyj.LJIJJLI(c348380DlELJIIJ);
                }
                effectPointModel2.setEndPoint((int) c0eym.LIZJ);
                effectPointModel2.setUiEndPoint((int) c0eym.LJFF);
                return;
            }
            if (i != 2 && i != 7) {
                if (i == 3) {
                    c0eyj.LJJJJJ(c0eym.LIZIZ);
                    arrayList.clear();
                    return;
                }
                if (i == 4) {
                    c0eyj.LJJJJJ(c0eym.LIZIZ);
                    int length = c0eym.LIZ.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        if (arrayList.size() > 0) {
                            ListProtector.remove(arrayList, arrayList.size() - 1);
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("removeEffectOnNLE:category:");
                            sbLIZ3.append(c0eym.LJIIZILJ);
                            sbLIZ3.append("; info: ");
                            sbLIZ3.append(c0eym);
                            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                            C2216241Boc c2216241Boc2 = C2216241Boc.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("removeEffectOnNLE:category:");
                            sbLIZ4.append(c0eym.LJIIZILJ);
                            sbLIZ4.append("; info: ");
                            sbLIZ4.append(c0eym);
                            c2216241Boc2.p(C2188811AlT.LIZIZ(sbLIZ4));
                            return;
                        }
                    }
                    return;
                }
                if (i != 8) {
                    return;
                }
                LJJIIJZLJL(c0eym, arrayList);
                LJJIJIIJI(c0eym, arrayList);
                return;
            }
            LJJIIJZLJL(c0eym, arrayList);
        }
    }

    public void LJJI(NLEModel nLEModel, boolean z) {
        LJIJ().yc(nLEModel);
        if (z) {
            C391360FWc.LIZIZ(this, "", LJIJ(), AFwS261S0000000_22.get$arr$(261));
        }
    }

    public void LJJIFFI(String str, boolean z) {
        LJIJ().pf(str);
        LJIJ().jg();
        if (z) {
            C391360FWc.LIZIZ(this, "", LJIJ(), AFwS261S0000000_22.get$arr$(260));
        }
    }

    public final void LJJIIJZLJL(C0EYM c0eym, ArrayList<EffectPointModel> arrayList) {
        String str;
        int[] iArr = c0eym.LIZ;
        if (iArr != null) {
            int length = iArr.length;
        }
        String[] strArr = c0eym.LIZIZ;
        if (strArr == null || strArr.length == 0) {
            str = "";
        } else {
            str = strArr[0];
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C391360FWc.LIZIZ(this, "", LJIJ(), new AwS18S1201000_5(str, (String) arrayList, (ArrayList<EffectPointModel>) i, (int) atomicBoolean, (AtomicBoolean) 3));
            if (atomicBoolean.get()) {
                return;
            }
        }
    }

    public final void LJJIJIIJI(C0EYM c0eym, ArrayList<EffectPointModel> arrayList) {
        EffectPointModel effectPointModel = new EffectPointModel();
        C391360FWc.LIZIZ(this, "", LJIJ(), new AwS214S0300000_5(c0eym, this, effectPointModel, 29));
        effectPointModel.setType(3);
        effectPointModel.setSelectedColor(c0eym.LJIIIIZZ);
        effectPointModel.setResDir(c0eym.LJIIL);
        effectPointModel.setKey(c0eym.LJIILIIL);
        effectPointModel.setFromEnd(c0eym.LJII);
        effectPointModel.setStartPoint((int) c0eym.LIZJ);
        effectPointModel.setEndPoint((int) c0eym.LIZLLL);
        effectPointModel.setUiStartPoint((int) c0eym.LJ);
        effectPointModel.setUiEndPoint((int) c0eym.LJFF);
        effectPointModel.setName(c0eym.LJIILL);
        effectPointModel.setCategory(c0eym.LJIIZILJ);
        effectPointModel.setExtra(c0eym.LJIJ);
        effectPointModel.setAdjustParams(c0eym.LJIJI);
        effectPointModel.setIsNewEngineEffect(c0eym.LJIJJ);
        arrayList.add(effectPointModel);
    }

    public final void LJIILJJIL(C1452720nuI c1452720nuI, C1452720nuI c1452720nuI2, C0EYJ c0eyj) {
        boolean z;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        C1452720nuI c1452720nuILJI;
        C1452720nuI c1452720nuILJI2;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter2 = this.LJFF;
        if (vEEditorAutoStartStopArbiter2 != null) {
            z = vEEditorAutoStartStopArbiter2.LLILZ;
            if (!z) {
                vEEditorAutoStartStopArbiter2.LIZJ(true, false, false);
            }
        } else {
            z = false;
        }
        for (AbstractC1452710nuH abstractC1452710nuH : (ArrayList) LJIL().LIZ) {
            if (c1452720nuI == null) {
                abstractC1452710nuH.getClass();
                c1452720nuILJI2 = C1452720nuI.LJI();
            } else {
                c1452720nuILJI2 = c1452720nuI;
            }
            abstractC1452710nuH.LIZJ(c1452720nuILJI2);
        }
        MutableLiveData<Boolean> mutableLiveData = this.LIZIZ;
        if (c0eyj.LJJJJZ()) {
            if (mutableLiveData != null) {
                mutableLiveData.setValue(Boolean.FALSE);
            }
            c0eyj.LJJJLL(false);
        }
        c0eyj.P5();
        if (C1452720nuI.LJ(c1452720nuI2)) {
            MutableLiveData<Boolean> mutableLiveData2 = this.LIZIZ;
            if (mutableLiveData2 != null) {
                mutableLiveData2.setValue(Boolean.TRUE);
            }
            c0eyj.LJJJLL(true);
        } else if (C1452720nuI.LIZJ(c1452720nuI2)) {
            if (c1452720nuI2 != null) {
                int i = (int) c1452720nuI2.LLILLJJLI;
                int iMin = (int) (Math.min(LJIJJ(), c1452720nuI2.LLILLL) - c1452720nuI2.LLILLJJLI);
                new VERepeatFilterParam();
                VEEditor.TIME_MODE.EDITOR_SLOMO_MODE.ordinal();
                c1452720nuI2.LLILZ = c0eyj.LJJIZ(C347570Djv.LIZ(i, iMin));
                MutableLiveData<C1452720nuI> mutableLiveData3 = this.LIZJ;
                if (mutableLiveData3 != null) {
                    mutableLiveData3.setValue(c1452720nuI2);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        } else if (C1452720nuI.LIZLLL(c1452720nuI2)) {
            if (c1452720nuI2 != null) {
                int i2 = (int) c1452720nuI2.LLILLJJLI;
                int iMin2 = (int) (Math.min(LJIJJ(), c1452720nuI2.LLILLL) - c1452720nuI2.LLILLJJLI);
                new VESlowMotionFilterParam();
                VEEditor.TIME_MODE.EDITOR_SLOMO_MODE.ordinal();
                c1452720nuI2.LLILZ = c0eyj.LJJIZ(C347570Djv.LIZIZ(i2, iMin2));
                MutableLiveData<C1452720nuI> mutableLiveData4 = this.LIZJ;
                if (mutableLiveData4 != null) {
                    mutableLiveData4.setValue(c1452720nuI2);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        for (AbstractC1452710nuH abstractC1452710nuH2 : (ArrayList) LJIL().LIZ) {
            if (c1452720nuI2 == null) {
                abstractC1452710nuH2.getClass();
                c1452720nuILJI = C1452720nuI.LJI();
            } else {
                c1452720nuILJI = c1452720nuI2;
            }
            abstractC1452710nuH2.LIZIZ(c1452720nuILJI);
        }
        if (!z && (vEEditorAutoStartStopArbiter = this.LJFF) != null) {
            vEEditorAutoStartStopArbiter.LIZJ(false, false, false);
        }
    }

    public final void LJJIIZI(float f, FilterBean filterBean, boolean z) {
        if (filterBean == null) {
            return;
        }
        if (C1643880ssc.LJ(filterBean)) {
            LJIILLIIL();
            C391360FWc.LIZIZ(this, "setFilter", LJIJ(), new AwS21S0100001_5(filterBean, f, 1));
            this.LJJIIZI = filterBean;
            this.LJJIJ = f;
            return;
        }
        C391360FWc.LIZIZ(this, "setFilter without composer", LJIJ(), new C348900Dm4(f, filterBean, z));
    }

    public int LJJII(Context context, final InterfaceC574340Mfo interfaceC574340Mfo, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
        SurfaceView surfaceView2;
        VEUserConfig vEUserConfig;
        this.LJI = context;
        this.LJIIIIZZ = interfaceC574340Mfo;
        this.LJIJJ = surfaceView;
        this.LJIJJLI = lifecycleOwner;
        C01TT.LIZLLL(new AwS566S0100000_22(this, 822));
        InterfaceC1452930nud interfaceC1452930nud = null;
        if (interfaceC574340Mfo.isReuseSurfaceView()) {
            surfaceView2 = null;
        } else {
            surfaceView2 = this.LJIJJ;
        }
        C00CM c00cm = C00CM.NLEEditorType;
        if (interfaceC574340Mfo.getNeedVEUserConfig()) {
            vEUserConfig = new VEUserConfig();
            EnumC1463710oC1 enumC1463710oC1 = EnumC1463710oC1.ConfigID_GraphRefactor;
            Boolean bool = Boolean.TRUE;
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(enumC1463710oC1, bool));
            EnumC1463710oC1 enumC1463710oC12 = EnumC1463710oC1.ConfigID_EnableGlobalEffect;
            Boolean bool2 = Boolean.FALSE;
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(enumC1463710oC12, bool2));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_PinRefactor, bool2));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_UseImageAllocator, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_UseNewEngineEffectOpt, 2));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_UseRefaCanvasWrap, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_MaxSoftwareVideoReaderCount, 7));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_MaxSoftwareFreeReaderCount, 2));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_MaxImageTextureBufferCount, 10));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_MaxImageTextureBufferWidth, 2200));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_MaxImageTextureBufferHeight, 2200));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_ForceDropFrameWithoutAudio, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_MaxAudioReaderCount, Integer.MAX_VALUE));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_MaxTexturePoolCount, 50));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_TexturePoolCleanCount, 35));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_UseEffectTransiton, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_ForceDetectFace, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_EnableStickerAmazing, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_LoadImageOptimize, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_EnableHighSpeedChange, bool));
        } else {
            vEUserConfig = null;
        }
        if (interfaceC574340Mfo.getLoadImageOptimizeByVEUserConfig()) {
            if (vEUserConfig == null) {
                vEUserConfig = new VEUserConfig();
            }
            EnumC1463710oC1 enumC1463710oC13 = EnumC1463710oC1.ConfigID_UseImageAllocator;
            Boolean bool3 = Boolean.TRUE;
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(enumC1463710oC13, bool3));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_LoadImageOptimize, bool3));
        }
        if (this.LIZ.LIZLLL) {
            if (vEUserConfig == null) {
                vEUserConfig = new VEUserConfig();
            }
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_UseNewEngineEffectOpt, Integer.valueOf(EnumC558380LvA.EFFECT_NEW_OLD_ENGINE_COEXIST.mode)));
        }
        if (interfaceC574340Mfo.getLoadImageOptimizeByVEUserConfig()) {
            if (vEUserConfig == null) {
                vEUserConfig = new VEUserConfig();
            }
            EnumC1463710oC1 enumC1463710oC14 = EnumC1463710oC1.ConfigID_UseImageAllocator;
            Boolean bool4 = Boolean.TRUE;
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(enumC1463710oC14, bool4));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_LoadImageOptimize, bool4));
        }
        if (interfaceC574340Mfo.getLoadMixImageOptimizeByVEUserConfig()) {
            if (vEUserConfig == null) {
                vEUserConfig = new VEUserConfig();
            }
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_LoadImageOptimize, Boolean.TRUE));
        }
        C1452960nug.LJIIIZ = interfaceC574340Mfo.getNeedTemplateExtra();
        InterfaceC1452930nud interfaceC1452930nud2 = C1452830nuT.LIZ;
        if (interfaceC1452930nud2 != null) {
            interfaceC1452930nud = interfaceC1452930nud2;
        }
        InterfaceC1452820nuS interfaceC1452820nuS = ((C1452810nuR) interfaceC1452930nud).LIZ;
        String workspace = interfaceC574340Mfo.getWorkspace();
        long editorHandler = interfaceC574340Mfo.getEditorHandler();
        interfaceC574340Mfo.getUseVEPublic();
        C1441900ncq c1441900ncq = this.LIZ;
        boolean z = c1441900ncq.LJ;
        boolean z2 = c1441900ncq.LJI;
        int value = c1441900ncq.LJIIJ.getValue();
        C1441900ncq c1441900ncq2 = this.LIZ;
        this.LJII = ((C1452950nuf) interfaceC1452820nuS).LIZ(surfaceView2, new C1452970nuh(c00cm, workspace, editorHandler, vEUserConfig, z, z2, value, c1441900ncq2.LJII, c1441900ncq2.LJIIJJI.getValue(), new Pair(Integer.valueOf(interfaceC574340Mfo.getCanvasWidth()), Integer.valueOf(interfaceC574340Mfo.getCanvasHeight())), this.LIZ.LJIIL));
        if (this.LJIJJ != null) {
            if (interfaceC574340Mfo.getEditorHandler() > 0) {
                LJIJ().enableSimpleProcessor(false);
                LJIJ().setPageMode(0);
            }
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = new VEEditorAutoStartStopArbiter(this.LJI, this.LJIJJLI, LJIJ(), this.LJIJJ, interfaceC574340Mfo.getEnableAutoStart());
            this.LJFF = vEEditorAutoStartStopArbiter;
            vEEditorAutoStartStopArbiter.LLJILJIL = new InterfaceC1462000o9G() { // from class: X.0Mfp
                @Override // X.InterfaceC1462000o9G
                public final boolean LJL(boolean z3) {
                    return false;
                }

                @Override // X.InterfaceC1462000o9G
                public final boolean LLIIIJ() {
                    return false;
                }

                @Override // X.InterfaceC1462000o9G
                public final boolean x0() {
                    return false;
                }

                @Override // X.InterfaceC1462000o9G
                public final boolean b0() {
                    return interfaceC574340Mfo.getInterceptAutoPlay();
                }
            };
            LJJIJ(this.LJIJJ);
            if (this.LJIL != null) {
                LJIJ().We(this.LJIL);
            }
        }
        this.LJIJI.d("yarkey mVEEditor create");
        this.LJIJI.d(Log.getStackTraceString(new Throwable()));
        LJIJ().wf();
        if (this.LJJ != null) {
            LJIJ().df(new InterfaceC1464200oCo() { // from class: X.0nuO
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str) {
                    if (i == 4116) {
                        this.LL.LJJ.LIZ();
                    }
                }
            });
        }
        final InterfaceC1452800nuQ interfaceC1452800nuQ = this.LJJI;
        if (interfaceC1452800nuQ != null) {
            LJIJ().df(new InterfaceC1464200oCo() { // from class: X.0nuP
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str) {
                    InterfaceC1452800nuQ interfaceC1452800nuQ2 = interfaceC1452800nuQ;
                    if (i == 4122) {
                        interfaceC1452800nuQ2.LIZIZ(f);
                        return;
                    }
                    if (i == 4162) {
                        interfaceC1452800nuQ2.LIZ(f);
                    } else if (i == 4163) {
                        interfaceC1452800nuQ2.LIZLLL((int) f);
                    } else {
                        if (i != 4164) {
                            return;
                        }
                        interfaceC1452800nuQ2.LIZJ((int) f);
                    }
                }
            });
        }
        final InterfaceC1452860nuW interfaceC1452860nuW = this.LJJIFFI;
        if (interfaceC1452860nuW != null) {
            this.LJJII = new LinkedHashSet();
            LJIJ().df(new InterfaceC1464200oCo() { // from class: X.0nuL
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str) {
                    AbstractC1452680nuE abstractC1452680nuE;
                    Set<String> set;
                    if (i == 4197 && (set = (abstractC1452680nuE = this.LL).LJJII) != null) {
                        InterfaceC1452860nuW interfaceC1452860nuW2 = interfaceC1452860nuW;
                        if (!set.contains(str)) {
                            set.add(str);
                            interfaceC1452860nuW2.LIZ(i2, (int) f, abstractC1452680nuE.LJJII.size() - 1);
                        }
                    }
                }
            });
        }
        LJIJ().setPreviewFps(interfaceC574340Mfo.getFps());
        if (interfaceC574340Mfo.getMaxPreviewFps() > 0) {
            LJIJ().setPreviewMaxFps(interfaceC574340Mfo.getMaxPreviewFps());
        }
        LJIJ().setPageMode(interfaceC574340Mfo.getPageMode());
        if (interfaceC574340Mfo.getPreviewHeight() > 0 && interfaceC574340Mfo.getPreviewWidth() > 0) {
            LJIJ().Tf(interfaceC574340Mfo.getPreviewWidth(), interfaceC574340Mfo.getPreviewHeight());
            return -1;
        }
        return -1;
    }

    public static void LIZIZ(String str, double d, double d2, double d3, C348100Dkm c348100Dkm) {
        C347470Djl c347470Djl = new C347470Djl(NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER());
        c347470Djl.LJIIIZ = Double.valueOf(d3);
        c347470Djl.LJIIJ = Double.valueOf(d2);
        c347470Djl.LJIIJJI = Double.valueOf(d);
        c348100Dkm.LJFF().LJIILL(str, c347470Djl);
    }
}
