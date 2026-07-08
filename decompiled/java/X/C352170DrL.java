package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.NLEAudioCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS371S0200000_5;
import njp.a;

/* JADX INFO: renamed from: X.0DrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel$compileRecordAudio$2$1", f = "AudioRecordActivityViewModel.kt", l = {181}, m = "invokeSuspend")
public final class C352170DrL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ AudioRecordActivityViewModel LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C0E48 LLILZIL;
    public final /* synthetic */ VideoPublishEditModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352170DrL(AudioRecordActivityViewModel audioRecordActivityViewModel, C259800zU<String> c259800zU, C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C352170DrL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = audioRecordActivityViewModel;
        this.LLILZ = c259800zU;
        this.LLILZIL = c0e48;
        this.LLILZLL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352170DrL(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<String> c259800zU;
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLEEditor nLEEditorLJI;
        NLEModel model;
        NLEModel nLEModelLJI;
        T tLJIJ = obj;
        C1C7U.LIZ("AudioRecordActivityViewModel@463c.compileRecordAudio$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        NLENode nLENodeDeepClone = null;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(tLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(tLJIJ);
            String value = this.LLILLL.LLILZ.getValue();
            if (value != null) {
                Boolean.valueOf(new C0VSJ(value).delete());
            }
            c259800zU = this.LLILZ;
            AudioRecordActivityViewModel audioRecordActivityViewModel = this.LLILLL;
            C0E48 c0e48 = this.LLILZIL;
            VideoPublishEditModel videoPublishEditModel = this.LLILZLL;
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            audioRecordActivityViewModel.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            final C013C c013c = new C013C();
            InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("compose_record");
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append(".wav");
            final String strLJ = pathAdapter.LJ(videoPublishEditModel, C2188811AlT.LIZIZ(sbLIZ));
            C1463860oCG c1463860oCGLIZIZ = C0F9X.LIZIZ("EditorPro-record-audio", null);
            if (c0e48 != null && (nLEEditorLJI = c0e48.LLFII().LJI()) != null && (model = nLEEditorLJI.getModel()) != null) {
                nLENodeDeepClone = model.deepClone(true);
            }
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLENodeDeepClone);
            nLEModelDynamicCast.getMainTrack().setAudioEnable(false);
            VecNLETrackSPtr tracks = nLEModelDynamicCast.getTracks();
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (C350870DpF.LJIIIIZZ(nLETrack2) == NLETrackType.AUDIO && !C351220Dpo.LLILL(nLETrack2)) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                nLEModelDynamicCast.removeTrack((NLETrack) it2.next());
            }
            VecNLETrackSPtr tracks2 = nLEModelDynamicCast.getTracks();
            ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
            Iterator<NLETrack> it3 = tracks2.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(it3.next().getSlots(), arrayList2);
            }
            for (NLETrackSlot nLETrackSlot : arrayList2) {
                if (nLETrackSlot.hasExtra("extra_origin_voice_file_path") && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                    resource.setResourceFile(nLETrackSlot.getExtra("extra_origin_voice_file_path"));
                }
            }
            nLEModelDynamicCast.addToStage(0L);
            c1463860oCGLIZIZ.setDataSource(nLEModelDynamicCast);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            ((C1463840oCE) c1463860oCGLIZIZ.getExporterApi()).compileOnlyAudio(strLJ, new NLEAudioCompileEncodeSettings(), new INLEListenerCompile(c2252611DEt, jCurrentTimeMillis, strLJ) { // from class: X.08mQ
                public float LIZ;
                public final /* synthetic */ InterfaceC20236714Gf<String> LIZJ;
                public final /* synthetic */ String LIZLLL;

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileDone() {
                    C013C c013c2 = this.LIZIZ;
                    if (c013c2.element) {
                        return;
                    }
                    c013c2.element = true;
                    System.currentTimeMillis();
                    InterfaceC20236714Gf<String> interfaceC20236714Gf = this.LIZJ;
                    String str = this.LIZLLL;
                    C189200o6.m2constructorimpl(str);
                    interfaceC20236714Gf.resumeWith(str);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileProgress(float f) {
                    if (Math.abs(f - this.LIZ) > 0.1d) {
                        this.LIZ = f;
                    }
                }

                {
                    this.LIZLLL = strLJ;
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileError(int i2, int i3, float f, String str) {
                    C013C c013c2 = this.LIZIZ;
                    if (c013c2.element) {
                        return;
                    }
                    c013c2.element = true;
                    InterfaceC20236714Gf<String> interfaceC20236714Gf = this.LIZJ;
                    C189200o6.m2constructorimpl("");
                    interfaceC20236714Gf.resumeWith("");
                }
            });
            c2252611DEt.LJJII(new AwS371S0200000_5(audioRecordActivityViewModel, c1463860oCGLIZIZ, 218));
            tLJIJ = c2252611DEt.LJIJ();
            if (tLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (tLJIJ == objLJFF) {
                C1C7U.LIZIZ("AudioRecordActivityViewModel@463c.compileRecordAudio$2$1");
                return objLJFF;
            }
        }
        c259800zU.element = tLJIJ;
        C0E5P c0e5p = C0E5P.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("compileRecordAudio finish: ");
        sbLIZ2.append(this.LLILZ.element);
        C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LLILZ.element.length() > 0 && C301680Bs6.LIZ()) {
            C0E48 c0e482 = this.LLILZIL;
            if (c0e482 != null) {
                nLEModelLJI = C350870DpF.LJI(c0e482);
            } else {
                nLEModelLJI = null;
            }
            NLEModel nLEModelDynamicCast2 = NLEModel.dynamicCast((NLENode) nLEModelLJI);
            if (nLEModelDynamicCast2 == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AudioRecordActivityViewModel@463c.compileRecordAudio$2$1");
                return unit;
            }
            AudioRecordActivityViewModel audioRecordActivityViewModel2 = this.LLILLL;
            VideoPublishEditModel videoPublishEditModel2 = this.LLILZLL;
            String str = this.LLILZ.element;
            audioRecordActivityViewModel2.getClass();
            if (videoPublishEditModel2.getVeAudioRecorderParam() == null) {
                videoPublishEditModel2.setVeAudioRecorderParam(new AudioRecorderParam());
            }
            AudioRecorderParam veAudioRecorderParam = videoPublishEditModel2.getVeAudioRecorderParam();
            if (veAudioRecorderParam != null) {
                veAudioRecorderParam.setAudioUrl(str);
                veAudioRecorderParam.setMStack(AudioRecordActivityViewModel.vQ2(nLEModelDynamicCast2));
                veAudioRecorderParam.setMultiTrackAudio(C346730DiZ.LIZ(nLEModelDynamicCast2));
            }
            videoPublishEditModel2.creativeModel.voiceConversionModel.originalRecordPath = str;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AudioRecordActivityViewModel@463c.compileRecordAudio$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
