package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.AssetType;
import com.ss.android.ugc.aweme.aigc.asynctask.CompositionMediaItem;
import com.ss.android.ugc.aweme.aigc.asynctask.SummarySegment;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0LDX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.composition.SummaryVideoComposer$compose$3", f = "SummaryVideoComposer.kt", l = {399}, m = "invokeSuspend")
public final class C0LDX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C2186008hO>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public NLEVideoEncodeSettings LLILLL;
    public Function2 LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ List<CompositionMediaItem> LLIZLLLIL;
    public final /* synthetic */ C0LDT LLJ;
    public final /* synthetic */ Function2<Float, InterfaceC1364105Vn<? super Unit>, Object> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LDX(List<CompositionMediaItem> list, C0LDT c0ldt, Function2<? super Float, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C0LDX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = list;
        this.LLJ = c0ldt;
        this.LLJI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LDX c0ldx = new C0LDX(this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c0ldx.LLIZ = obj;
        return c0ldx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objLJIJ = obj;
        C1C7U.LIZ("SummaryVideoComposer@6d74.compose$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(objLJIJ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJIJ);
                final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLIZ;
                C539300LDc c539300LDc = C539300LDc.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Starting composition with ");
                sbLIZ.append(this.LLIZLLLIL.size());
                sbLIZ.append(" items");
                C201955140j.LIZLLL(c539300LDc, "SummaryComposer", C2188811AlT.LIZIZ(sbLIZ));
                if (!this.LLJ.LIZLLL) {
                    C537680L6w.LIZ(c539300LDc, "SummaryComposer", "Composer not initialized", null);
                    C098200Yq c098200Yq2 = new C098200Yq(new IllegalStateException("Composer not initialized. Call init() first."));
                    C189200o6.m2constructorimpl(c098200Yq2);
                    C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq2);
                    C1C7U.LIZIZ("SummaryVideoComposer@6d74.compose$3");
                    return c189200o6M1boximpl;
                }
                if (this.LLIZLLLIL.isEmpty()) {
                    C537680L6w.LIZ(c539300LDc, "SummaryComposer", "No media items to compose", null);
                    C098200Yq c098200Yq3 = new C098200Yq(new IllegalArgumentException("Media items list is empty"));
                    C189200o6.m2constructorimpl(c098200Yq3);
                    C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(c098200Yq3);
                    C1C7U.LIZIZ("SummaryVideoComposer@6d74.compose$3");
                    return c189200o6M1boximpl2;
                }
                C0LDT c0ldt = this.LLJ;
                NLEEditor nLEEditor = c0ldt.LIZIZ;
                if (nLEEditor == null) {
                    C098200Yq c098200Yq4 = new C098200Yq(new IllegalStateException("Editor is null"));
                    C189200o6.m2constructorimpl(c098200Yq4);
                    C189200o6 c189200o6M1boximpl3 = C189200o6.m1boximpl(c098200Yq4);
                    C1C7U.LIZIZ("SummaryVideoComposer@6d74.compose$3");
                    return c189200o6M1boximpl3;
                }
                C1463860oCG c1463860oCG = c0ldt.LIZJ;
                if (c1463860oCG == null) {
                    C098200Yq c098200Yq5 = new C098200Yq(new IllegalStateException("Session is null"));
                    C189200o6.m2constructorimpl(c098200Yq5);
                    C189200o6 c189200o6M1boximpl4 = C189200o6.m1boximpl(c098200Yq5);
                    C1C7U.LIZIZ("SummaryVideoComposer@6d74.compose$3");
                    return c189200o6M1boximpl4;
                }
                Pair<Integer, Integer> pairLIZLLL = c0ldt.LIZLLL();
                int iIntValue = pairLIZLLL.getFirst().intValue();
                int iIntValue2 = pairLIZLLL.getSecond().intValue();
                Pair pairLIZ = this.LLJ.LIZ(iIntValue, iIntValue2, this.LLIZLLLIL);
                final List list = (List) pairLIZ.getFirst();
                final long jLongValue = ((Number) pairLIZ.getSecond()).longValue();
                if (list.isEmpty()) {
                    C098200Yq c098200Yq6 = new C098200Yq(new IllegalStateException("No valid segments to compose"));
                    C189200o6.m2constructorimpl(c098200Yq6);
                    C189200o6 c189200o6M1boximpl5 = C189200o6.m1boximpl(c098200Yq6);
                    C1C7U.LIZIZ("SummaryVideoComposer@6d74.compose$3");
                    return c189200o6M1boximpl5;
                }
                nLEEditor.commit();
                c1463860oCG.setDataSource(nLEEditor.getModel());
                C0VSJ c0vsj = new C0VSJ(this.LLJ.LIZ.LIZ);
                if (!c0vsj.exists()) {
                    c0vsj.mkdirs();
                }
                final String absolutePath = new C0VSJ(c0vsj, "summary_video.mp4").getAbsolutePath();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Compiling to: ");
                sbLIZ2.append(absolutePath);
                sbLIZ2.append(", resolution: ");
                sbLIZ2.append(iIntValue);
                sbLIZ2.append('x');
                sbLIZ2.append(iIntValue2);
                C201955140j.LIZLLL(c539300LDc, "SummaryComposer", C2188811AlT.LIZIZ(sbLIZ2));
                C1780100wQK c1780100wQK = new C1780100wQK(2);
                try {
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "summary_composer_force_sw_encoder_killswitch", true, false)) {
                        c1780100wQK.LIZIZ.isSupportHWEncoder = false;
                    }
                    c1780100wQK.LJIIJ(iIntValue, iIntValue2);
                    c1780100wQK.LJII(this.LLJ.LIZ.LJ);
                    c1780100wQK.LJI(VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264);
                    NLEVideoEncodeSettings nLEVideoEncodeSettingsLJ = C1776260wK8.LJ(c1780100wQK.LIZ());
                    final C118300cf c118300cf = new C118300cf();
                    c118300cf.element = -20;
                    final Function2<Float, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLJI;
                    final List<CompositionMediaItem> list2 = this.LLIZLLLIL;
                    this.LLIZ = interfaceC497601wk;
                    this.LL = list;
                    this.LLILLJJLI = absolutePath;
                    this.LLILLL = nLEVideoEncodeSettingsLJ;
                    this.LLILZ = function2;
                    this.LLILZIL = list2;
                    this.LLILZLL = 1;
                    final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                    c2252611DEt.LJIJJ();
                    ((C1463840oCE) c1463860oCG.getExporterApi()).compile(absolutePath, nLEVideoEncodeSettingsLJ, new INLEListenerCompile() { // from class: X.0LDW
                        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                        public final void onCompileDone() {
                            C539300LDc c539300LDc2 = C539300LDc.LIZIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Compilation complete: ");
                            sbLIZ3.append(absolutePath);
                            C201955140j.LIZLLL(c539300LDc2, "SummaryComposer", C2188811AlT.LIZIZ(sbLIZ3));
                            List<SummarySegment> list3 = list;
                            String str = absolutePath;
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                            for (SummarySegment summarySegment : list3) {
                                String str2 = summarySegment.assetId;
                                AssetType assetType = summarySegment.assetType;
                                long j = summarySegment.startTimeMs;
                                long j2 = summarySegment.endTimeMs;
                                long j3 = summarySegment.originalDurationMs;
                                String str3 = summarySegment.originalResolution;
                                summarySegment.getClass();
                                arrayList.add(new SummarySegment(str2, assetType, j, j2, j3, str3, str));
                            }
                            InterfaceC20236714Gf<C189200o6<C2186008hO>> interfaceC20236714Gf = c2252611DEt;
                            C2186008hO c2186008hO = new C2186008hO(absolutePath, arrayList, jLongValue);
                            C189200o6.m2constructorimpl(c2186008hO);
                            C189200o6 c189200o6M1boximpl6 = C189200o6.m1boximpl(c2186008hO);
                            C189200o6.m2constructorimpl(c189200o6M1boximpl6);
                            interfaceC20236714Gf.resumeWith(c189200o6M1boximpl6);
                        }

                        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                        public final void onCompileProgress(float f) {
                            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C502101xT(function2, f, null), 3);
                            int i2 = (int) (f * 100);
                            C118300cf c118300cf2 = c118300cf;
                            if (i2 >= c118300cf2.element + 20) {
                                c118300cf2.element = i2;
                                C539300LDc c539300LDc2 = C539300LDc.LIZIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Compile progress: ");
                                sbLIZ3.append(i2);
                                sbLIZ3.append('%');
                                C201955140j.LIZLLL(c539300LDc2, "SummaryComposer", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }

                        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                        public final void onCompileError(int i2, int i3, float f, String str) {
                            String str2;
                            String str3 = str;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Compile error ");
                            sbLIZ3.append(i2);
                            sbLIZ3.append(" (ext=");
                            sbLIZ3.append(i3);
                            sbLIZ3.append("): ");
                            if (str3 == null) {
                                str3 = "Unknown";
                            }
                            sbLIZ3.append(str3);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            C537680L6w.LIZ(C539300LDc.LIZIZ, "SummaryComposer", strLIZIZ, null);
                            int i4 = 0;
                            for (CompositionMediaItem compositionMediaItem : list2) {
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    CompositionMediaItem compositionMediaItem2 = compositionMediaItem;
                                    String strLJJLJ = a0.LJJLJ('.', compositionMediaItem2.uri, "?");
                                    boolean zExists = new C0VSJ(compositionMediaItem2.uri).exists();
                                    C539300LDc c539300LDc2 = C539300LDc.LIZIZ;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("  segment[");
                                    sbLIZ4.append(i4);
                                    sbLIZ4.append("]: type=");
                                    if (compositionMediaItem2.isVideo) {
                                        str2 = "video";
                                    } else {
                                        str2 = "image";
                                    }
                                    sbLIZ4.append(str2);
                                    sbLIZ4.append(", ext=");
                                    sbLIZ4.append(strLJJLJ);
                                    sbLIZ4.append(", exists=");
                                    sbLIZ4.append(zExists);
                                    sbLIZ4.append(", ");
                                    sbLIZ4.append(compositionMediaItem2.width);
                                    sbLIZ4.append('x');
                                    sbLIZ4.append(compositionMediaItem2.height);
                                    sbLIZ4.append(", uri=");
                                    sbLIZ4.append(compositionMediaItem2.uri);
                                    C537680L6w.LIZ(c539300LDc2, "SummaryComposer", C2188811AlT.LIZIZ(sbLIZ4), null);
                                    i4 = i5;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            InterfaceC20236714Gf<C189200o6<C2186008hO>> interfaceC20236714Gf = c2252611DEt;
                            C098200Yq c098200Yq7 = new C098200Yq(new RuntimeException(strLIZIZ));
                            C189200o6.m2constructorimpl(c098200Yq7);
                            C189200o6 c189200o6M1boximpl6 = C189200o6.m1boximpl(c098200Yq7);
                            C189200o6.m2constructorimpl(c189200o6M1boximpl6);
                            interfaceC20236714Gf.resumeWith(c189200o6M1boximpl6);
                        }
                    });
                    c2252611DEt.LJJII(new AwS587S0100000_8(c1463860oCG, 534));
                    objLJIJ = c2252611DEt.LJIJ();
                    if (objLJIJ == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                    if (objLJIJ == objLJFF) {
                        C1C7U.LIZIZ("SummaryVideoComposer@6d74.compose$3");
                        return objLJFF;
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    C537680L6w.LIZ(C539300LDc.LIZIZ, "SummaryComposer", "Composition failed", e);
                    c098200Yq = new C098200Yq(e);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            }
            c098200Yq = ((C189200o6) objLJIJ).m10unboximpl();
        } catch (Exception e2) {
            e = e2;
        }
        C189200o6 c189200o6M1boximpl6 = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("SummaryVideoComposer@6d74.compose$3");
        return c189200o6M1boximpl6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C2186008hO>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
