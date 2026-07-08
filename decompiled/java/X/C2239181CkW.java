package X;

import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.cutsame.source.model.ProcessorConfig;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1CkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.bytedance.ies.cutsame.source.TemplateSourceServiceImpl$startCompile$1", f = "TemplateSourceService.kt", l = {124}, m = "invokeSuspend")
public final class C2239181CkW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2239171CkV LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC20343514iv LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2239181CkW(C2239171CkV c2239171CkV, String str, String str2, InterfaceC20343514iv interfaceC20343514iv, InterfaceC1364105Vn<? super C2239181CkW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2239171CkV;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = interfaceC20343514iv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2239181CkW c2239181CkW = new C2239181CkW(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c2239181CkW.LLILLJJLI = obj;
        return c2239181CkW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETimeSpaceNode nLETimeSpaceNode;
        String strLIZJ;
        final boolean z;
        C1C7U.LIZ("TemplateSourceServiceImpl@4504.startCompile$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2239171CkV c2239171CkV = this.LLILLL;
            String str = this.LLILZ;
            c2239171CkV.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("/NLETemplate.json");
            final NLETemplateModel nLETemplateModelRestoreFromPath = NLETemplateModel.restoreFromPath(C2188811AlT.LIZIZ(sbLIZ));
            if (nLETemplateModelRestoreFromPath != null && (mainTrack = nLETemplateModelRestoreFromPath.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null && (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLL(sortedSlots)) != null) {
                String str2 = (String) C13LP.LJJJLL(nLETimeSpaceNode.getProcessor());
                boolean zLIZIZ = false;
                if (str2 == null) {
                    C2239171CkV c2239171CkV2 = this.LLILLL;
                    String str3 = this.LLILZ;
                    final InterfaceC20343514iv interfaceC20343514iv = this.LLILZLL;
                    VecNLEResourceNodeSPtr allResources = nLETemplateModelRestoreFromPath.getAllResources();
                    ArrayList arrayList = new ArrayList();
                    for (NLEResourceNode nLEResourceNode : allResources) {
                        if (nLEResourceNode.hasResourceId()) {
                            arrayList.add(nLEResourceNode);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((NLEResourceNode) it2.next()).getResourceId());
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            if (!c2239171CkV2.LIZIZ.hasDavinciResourceCache((String) it3.next())) {
                                z = false;
                                break;
                            }
                        }
                        z = true;
                    } else {
                        z = true;
                    }
                    c2239171CkV2.getClass();
                    try {
                        zLIZIZ = C036E.LIZ.LIZIZ();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (!zLIZIZ && !z) {
                        interfaceC20343514iv.onError(-10000, "NETWORK_ERROR");
                    } else {
                        if (!z) {
                            interfaceC20343514iv.onStart();
                        }
                        Context context = C357430Dzp.LIZ;
                        if (context == null) {
                            context = null;
                        }
                        NLETemplateSource nLETemplateSource = new NLETemplateSource(context, new CutSource(str3, CutSourceType.WORKSPACE), "");
                        nLETemplateSource.LJIIJ(c2239171CkV2.LIZIZ);
                        if (c2239171CkV2.LIZLLL != null) {
                            nLETemplateSource.LJI();
                            nLETemplateSource.LJIIJJI(c2239171CkV2.LIZLLL);
                            nLETemplateSource.LJII(1);
                        }
                        nLETemplateSource.LIZ(new NLEPrepareListener() { // from class: X.14iu
                            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("onPreSuccess, model: ");
                                sbLIZ2.append(nLETemplateModel);
                                C357400Dzm.LIZ("TemplateSourceService", C2188811AlT.LIZIZ(sbLIZ2));
                            }

                            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                            public final void onSuccess(NLETemplateModel nLETemplateModel) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("onSuccess, model: ");
                                sbLIZ2.append(nLETemplateModel);
                                C357400Dzm.LIZ("TemplateSourceService", C2188811AlT.LIZIZ(sbLIZ2));
                                if (nLETemplateModel != null) {
                                    interfaceC20343514iv.LIZ(nLETemplateModel);
                                } else {
                                    interfaceC20343514iv.onError(-10002, "MODEL_ERROR");
                                }
                            }

                            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                            public final void onError(int i2, String str4) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("onError, code: ");
                                sbLIZ2.append(i2);
                                sbLIZ2.append(", message: ");
                                sbLIZ2.append(str4);
                                C357400Dzm.LIZ("TemplateSourceService", C2188811AlT.LIZIZ(sbLIZ2));
                                InterfaceC20343514iv interfaceC20343514iv2 = interfaceC20343514iv;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(i2);
                                sbLIZ3.append('_');
                                sbLIZ3.append(str4);
                                interfaceC20343514iv2.onError(-10002, C2188811AlT.LIZIZ(sbLIZ3));
                            }

                            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                            public final void onProgress(float f, String str4) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("onProgress, progress: ");
                                sbLIZ2.append(f);
                                C357400Dzm.LIZ("TemplateSourceService", C2188811AlT.LIZIZ(sbLIZ2));
                                if (!z) {
                                    interfaceC20343514iv.onProgress((int) (f * 100));
                                }
                            }
                        });
                        nLETemplateSource.LIZJ();
                        c2239171CkV2.LJIIIIZZ = nLETemplateSource;
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TemplateSourceServiceImpl@4504.startCompile$1");
                    return unit;
                }
                final ProcessorConfig processorConfigLIZ = C20479080n.LIZ(str2);
                if (C2229261CMy.LIZ().LJI(this.LLILZIL)) {
                    strLIZJ = C2229261CMy.LIZ().LIZJ(this.LLILZIL);
                } else {
                    strLIZJ = this.LLILZIL;
                }
                C2239171CkV c2239171CkV3 = this.LLILLL;
                c2239171CkV3.getClass();
                c2239171CkV3.LJII = c2239171CkV3.LJ(strLIZJ, processorConfigLIZ);
                if (C2239171CkV.LIZJ(this.LLILLL.LJII)) {
                    NLERenderProxySegment nLERenderProxySegmentLJFF = C2239171CkV.LJFF(this.LLILZ, this.LLILLL.LJII, processorConfigLIZ);
                    NLETrackSlot nLETrackSlot = nLETemplateModelRestoreFromPath.getMainTrack().getSortedSlots().get(0);
                    NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                    nLETrackSlot2.setMainSegment(nLERenderProxySegmentLJFF);
                    nLETrackSlot.setRenderProxy(nLETrackSlot2);
                    this.LLILLL.getClass();
                    this.LLILZLL.LIZ(nLETemplateModelRestoreFromPath);
                } else {
                    final C2239171CkV c2239171CkV4 = this.LLILLL;
                    String str4 = c2239171CkV4.LJII;
                    final InterfaceC20343514iv interfaceC20343514iv2 = this.LLILZLL;
                    final String str5 = this.LLILZ;
                    Function1<? super C2239221Cka, Unit> function1 = new Function1() { // from class: X.1CkY
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            C2239171CkV c2239171CkV5 = c2239171CkV4;
                            NLETemplateModel nLETemplateModel = nLETemplateModelRestoreFromPath;
                            String str6 = str5;
                            ProcessorConfig processorConfig = processorConfigLIZ;
                            InterfaceC20343514iv interfaceC20343514iv3 = interfaceC20343514iv2;
                            String str7 = ((C2239221Cka) obj2).LIZLLL;
                            c2239171CkV5.getClass();
                            NLERenderProxySegment nLERenderProxySegmentLJFF2 = C2239171CkV.LJFF(str6, str7, processorConfig);
                            NLETrackSlot nLETrackSlot3 = nLETemplateModel.getMainTrack().getSortedSlots().get(0);
                            NLETrackSlot nLETrackSlot4 = new NLETrackSlot();
                            nLETrackSlot4.setMainSegment(nLERenderProxySegmentLJFF2);
                            nLETrackSlot3.setRenderProxy(nLETrackSlot4);
                            interfaceC20343514iv3.LIZ(nLETemplateModel);
                            return Unit.LIZ;
                        }
                    };
                    this.LL = 1;
                    if (c2239171CkV4.LIZLLL(strLIZJ, str4, processorConfigLIZ, interfaceC20343514iv2, function1, this) == objLJFF) {
                        C1C7U.LIZIZ("TemplateSourceServiceImpl@4504.startCompile$1");
                        return objLJFF;
                    }
                }
            } else {
                this.LLILZLL.onError(-10001, "CONFIG_ERROR");
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TemplateSourceServiceImpl@4504.startCompile$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateSourceServiceImpl@4504.startCompile$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
