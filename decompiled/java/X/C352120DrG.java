package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.NLEAudioCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS74S1300000_5;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0DrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.VOLogicComponent$prepareSaving$1$1", f = "VOApiComponent.kt", l = {612}, m = "invokeSuspend")
public final class C352120DrG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC352140DrI LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0EZ9 LLILZ;
    public final /* synthetic */ AudioRecorderParam LLILZIL;
    public final /* synthetic */ AudioRecorderParam LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352120DrG(InterfaceC352140DrI interfaceC352140DrI, boolean z, C0EZ9 c0ez9, AudioRecorderParam audioRecorderParam, AudioRecorderParam audioRecorderParam2, InterfaceC1364105Vn<? super C352120DrG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC352140DrI;
        this.LLILLL = z;
        this.LLILZ = c0ez9;
        this.LLILZIL = audioRecorderParam;
        this.LLILZLL = audioRecorderParam2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352120DrG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        NLEModel nLEModelLIZ;
        NLETrack next;
        NLESegment mainSegment;
        NLEResourceNode resource;
        Object objLJIJ = obj;
        C1C7U.LIZ("VOLogicComponent@4430.prepareSaving$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            this.LLILLJJLI.LIZ();
            if (this.LLILLL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILZ.G2());
                sbLIZ.append("compiled_");
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(".wav");
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1452170ntP value = this.LLILZ.JY0().g().getValue();
                str = null;
                if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null) {
                    this.LL = 1;
                    final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                    c2252611DEt.LJIJJ();
                    C1463860oCG c1463860oCGLIZIZ = C0F9X.LIZIZ("AudioEditing", null);
                    NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEModelLIZ.deepClone(true));
                    nLEModelDynamicCast.getMainTrack().setAudioEnable(false);
                    VecNLETrackSPtr tracks = nLEModelDynamicCast.getTracks();
                    ArrayList arrayList = new ArrayList();
                    for (NLETrack nLETrack : tracks) {
                        NLETrack nLETrack2 = nLETrack;
                        if (C350870DpF.LJIIIIZZ(nLETrack2) == NLETrackType.AUDIO && !Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "DUB")) {
                            arrayList.add(nLETrack);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        nLEModelDynamicCast.removeTrack((NLETrack) it2.next());
                    }
                    Iterator<NLETrack> it3 = nLEModelDynamicCast.getTracks().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            NLETrack nLETrack3 = next;
                            if (C350870DpF.LJIIIIZZ(nLETrack3) == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack3.getExtra("AudioTrackType"), "DUB")) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLETrack nLETrack4 = next;
                    if (nLETrack4 != null) {
                        nLETrack4.clearFilter();
                        if (nLETrack4.hasExtra("extra_sc_disable_dub")) {
                            nLETrack4.setEnable(true);
                            nLETrack4.removeExtraWithKey("extra_sc_disable_dub");
                        }
                    }
                    VecNLETrackSPtr tracks2 = nLEModelDynamicCast.getTracks();
                    ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
                    Iterator<NLETrack> it4 = tracks2.iterator();
                    while (it4.hasNext()) {
                        C19719612Di.LJJI(it4.next().getSlots(), arrayList2);
                    }
                    for (NLETrackSlot nLETrackSlot : arrayList2) {
                        if (nLETrackSlot.hasExtra("extra_origin_voice_file_path") && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                            resource.setResourceFile(nLETrackSlot.getExtra("extra_origin_voice_file_path"));
                        }
                    }
                    nLEModelDynamicCast.addToStage(0L);
                    c1463860oCGLIZIZ.setDataSource(nLEModelDynamicCast);
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    ((C1463840oCE) c1463860oCGLIZIZ.getExporterApi()).compileOnlyAudio(strLIZIZ, new NLEAudioCompileEncodeSettings(), new INLEListenerCompile(c2252611DEt, jCurrentTimeMillis, strLIZIZ) { // from class: X.08oY
                        public float LIZ;
                        public final /* synthetic */ InterfaceC20236714Gf<String> LIZIZ;
                        public final /* synthetic */ String LIZJ;

                        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                        public final void onCompileDone() {
                            if (this.LIZIZ.isActive()) {
                                System.currentTimeMillis();
                                InterfaceC20236714Gf<String> interfaceC20236714Gf = this.LIZIZ;
                                String str2 = this.LIZJ;
                                C189200o6.m2constructorimpl(str2);
                                interfaceC20236714Gf.resumeWith(str2);
                            }
                        }

                        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                        public final void onCompileProgress(float f) {
                            if (Math.abs(f - this.LIZ) > 0.1d) {
                                this.LIZ = f;
                            }
                        }

                        {
                            this.LIZJ = strLIZIZ;
                        }

                        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                        public final void onCompileError(int i2, int i3, float f, String str2) {
                            if (this.LIZIZ.isActive()) {
                                InterfaceC20236714Gf<String> interfaceC20236714Gf = this.LIZIZ;
                                C189200o6.m2constructorimpl("");
                                interfaceC20236714Gf.resumeWith("");
                            }
                        }
                    });
                    c2252611DEt.LJJII(new AwS584S0100000_5(c1463860oCGLIZIZ, 39));
                    objLJIJ = c2252611DEt.LJIJ();
                    if (objLJIJ == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                    if (objLJIJ == objLJFF) {
                        C1C7U.LIZIZ("VOLogicComponent@4430.prepareSaving$1$1");
                        return objLJFF;
                    }
                }
            } else {
                str = "";
            }
            C0CNO.LIZLLL(0L, new AwS74S1300000_5(this.LLILZ, str, this.LLILZIL, this.LLILZLL, 0));
            this.LLILLJJLI.LIZIZ();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("VOLogicComponent@4430.prepareSaving$1$1");
            return unit;
        }
        str = (String) objLJIJ;
        C0CNO.LIZLLL(0L, new AwS74S1300000_5(this.LLILZ, str, this.LLILZIL, this.LLILZLL, 0));
        this.LLILLJJLI.LIZIZ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("VOLogicComponent@4430.prepareSaving$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
