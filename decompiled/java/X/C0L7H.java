package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateApplyService;
import com.ss.android.ugc.aweme.interfaces.ITemplateMediaService;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L7H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L7H extends AbstractC2255721DQs<InterfaceC532280KuA> implements InterfaceC532280KuA {
    public static final C0L7N LLJILJILJ = new Object() { // from class: X.0L7N
    };
    public static final int LLJILLL = 8;
    public final C19A3 LL;
    public final int LLILLJJLI;
    public C0L7P LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public C0L7M LLIZ;
    public List<? extends MediaModel> LLIZLLLIL;
    public CreativeInfo LLJ;
    public C09AE LLJI;
    public final InterfaceC532280KuA LLILLL = this;
    public final C0L7G LLJIJIL = new C0L7G(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    public final C0L7G LLJILJIL = new C0L7G(10.0f, 0.0f, 30.0f, 60.0f, 0.0f);

    @Override // X.InterfaceC532280KuA
    public void exit() {
        W2(null, null, null, null, null);
        C09AE c09ae = this.LLJI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C0L7G c0l7g = this.LLJIJIL;
        c0l7g.LIZ = 0.0f;
        c0l7g.LIZIZ = 0.0f;
        c0l7g.LIZJ = 0.0f;
        c0l7g.LIZLLL = 0.0f;
        c0l7g.LJ = 0.0f;
        C0L7P c0l7p = this.LLILZ;
        if (c0l7p != null) {
            c0l7p.cancel();
        }
        C01TT.LIZLLL(new AwS552S0100000_8(this, 806));
    }

    private final int Z1() {
        C0L7G c0l7g = this.LLJIJIL;
        float f = c0l7g.LIZ;
        C0L7G c0l7g2 = this.LLJILJIL;
        return (int) ((((((f * c0l7g2.LIZ) + (c0l7g.LIZIZ * c0l7g2.LIZIZ)) + (c0l7g.LIZJ * c0l7g2.LIZJ)) + (c0l7g.LJ * c0l7g2.LJ)) + (c0l7g.LIZLLL * c0l7g2.LIZLLL)) / 100);
    }

    public final void T2() {
        C0L7P c0l7p = this.LLILZ;
        if (c0l7p != null) {
            c0l7p.cancel();
        }
        C0L7G c0l7g = this.LLJIJIL;
        c0l7g.LIZ = 0.0f;
        c0l7g.LIZIZ = 0.0f;
        c0l7g.LIZJ = 0.0f;
        c0l7g.LIZLLL = 0.0f;
        c0l7g.LJ = 0.0f;
    }

    public final void o2() {
        C0L7M c0l7m = this.LLIZ;
        if (c0l7m != null) {
            c0l7m.LJFF(new C0L7F(null, Z1(), null, 13), false);
        }
    }

    public InterfaceC532280KuA H2() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    public C0L7H(C19A3 c19a3, int i) {
        this.LL = c19a3;
        this.LLILLJJLI = i;
    }

    private final void G2(long j, Function1<? super Float, Unit> function1) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C407001i8(this, j, function1, null), 3);
    }

    private final void w2(Context context, List<? extends MediaModel> list, CreativeInfo creativeInfo, InterfaceC23176096g interfaceC23176096g) throws Throwable {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateComp#compressMedias: mediaList = ");
        sbLIZ.append(C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS239S0000000_8.get$arr$(241), 31));
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C09AE c09ae = this.LLJI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MediaModel mediaModel : list) {
            AutoCutMediaModel.Companion.getClass();
            AutoCutMediaModel autoCutMediaModelLIZ = C526710KlB.LIZ(context, mediaModel);
            if (C2286708xd.LIZJ(autoCutMediaModelLIZ.filePath)) {
                str = autoCutMediaModelLIZ.filePath;
            } else {
                str = autoCutMediaModelLIZ.fileUriPath;
            }
            s sVar = s.LIZ;
            long j = autoCutMediaModelLIZ.duration;
            boolean z = autoCutMediaModelLIZ.isVideoType;
            int i = mediaModel.width;
            int i2 = mediaModel.height;
            sVar.getClass();
            String str2 = str;
            String strLJIILJJIL = s.LJIILJJIL(str2, j, z, creativeInfo, i, i2);
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new C23179096j(str2, strLJIILJJIL, autoCutMediaModelLIZ.isVideoType, (int) mediaModel.duration, mediaModel.startTime, mediaModel.endTime, mediaModel.speed, mediaModel.width, mediaModel.height, mediaModel.slotId));
        }
        this.LLJI = ((ITemplateMediaService) ServiceManager.get().getService(ITemplateMediaService.class)).LIZ(context, arrayList, s.LJIIL(creativeInfo), interfaceC23176096g);
    }

    public final C573920Mf8 W1(String str, EnumC1412640mre enumC1412640mre, String str2, String str3) {
        C0L95 c0l95;
        if (this.LLILLJJLI == 29) {
            c0l95 = C0L95.ANCHOR;
        } else {
            c0l95 = C0L95.AUTOCUT_LIST;
        }
        BinderC532620Kui binderC532620Kui = new BinderC532620Kui("AutoCutTemplateComp", str, 2);
        BinderC532620Kui.LIZIZ(binderC532620Kui, EnumC1412640mre.AUTOCUT_TEMPLATE.getValue(), c0l95.getValue(), null, 60);
        EnumC539100LCi enumC539100LCiLIZ = C0LBC.LIZ(2);
        C1429050nI7.LIZ.getClass();
        return new C573920Mf8(binderC532620Kui, enumC539100LCiLIZ, C0LCZ.LIZ(enumC1412640mre, null, str2, str3), 3, C1429050nI7.LIZ());
    }

    public final NLEModel X1(C0L7B c0l7b, List<C23179096j> list, boolean z, EnumC1412640mre enumC1412640mre) {
        NLETemplateModel nLETemplateModel;
        NLEResType nLEResType;
        VecNLETrackSlotSPtr slots;
        NLEResourceNode resource;
        NLEResType resourceType;
        if (c0l7b != null) {
            nLETemplateModel = c0l7b.LIZ;
        } else {
            nLETemplateModel = null;
        }
        if ((list.isEmpty() && !C533090KvT.LIZIZ.LJFF()) || nLETemplateModel == null) {
            return null;
        }
        if (C294050Bfn.LIZ()) {
            NLETrack mainTrack = nLETemplateModel.getMainTrack();
            boolean z2 = false;
            if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                ArrayList arrayList = new ArrayList();
                for (NLETrackSlot nLETrackSlot : slots) {
                    NLESegment mainSegment = nLETrackSlot.getMainSegment();
                    if (mainSegment != null) {
                        resource = mainSegment.getResource();
                    } else {
                        resource = null;
                    }
                    NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) resource);
                    if (nLEResourceAVDynamicCast != null) {
                        resourceType = nLEResourceAVDynamicCast.getResourceType();
                    } else {
                        resourceType = null;
                    }
                    if (resourceType == NLEResType.VIDEO) {
                        arrayList.add(nLETrackSlot);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) it2.next()).getMainSegment());
                        if (nLESegmentVideoDynamicCast != null && nLESegmentVideoDynamicCast.getVolume() > 0.0f) {
                            z2 = true;
                            break;
                        }
                    }
                }
            }
            C0EYQ.LJII(nLETemplateModel, enumC1412640mre.getValue(), c0l7b.LJII, z2);
        } else {
            C0EYQ.LJI(nLETemplateModel, enumC1412640mre.getValue(), c0l7b.LJII);
        }
        NLETemplateModel nLETemplateModelRestore = NLETemplateModel.restore(nLETemplateModel.store());
        ArrayList<C0E4S> arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C23179096j c23179096j : list) {
            String str = c23179096j.LIZIZ;
            if (c23179096j.LIZJ) {
                nLEResType = NLEResType.VIDEO;
            } else {
                nLEResType = NLEResType.IMAGE;
            }
            arrayList2.add(new C0E4S(str, nLEResType, c23179096j.LIZLLL, c23179096j.LJI, c23179096j.LJ, c23179096j.LJFF, c23179096j.LJIIIZ, null, 128));
        }
        ITemplateApplyService iTemplateApplyService = (ITemplateApplyService) ServiceManager.get().getService(ITemplateApplyService.class);
        ITemplateApplyService.LIZ.getClass();
        C1412390mrF c1412390mrF = C0E4Y.LIZIZ;
        EnumC1412640mre enumC1412640mre2 = EnumC1412640mre.AUTOCUT_TEMPLATE;
        C844470XAv.LIZ.getClass();
        iTemplateApplyService.LIZ(nLETemplateModelRestore, arrayList2, c1412390mrF, enumC1412640mre2, C844470XAv.LIZ(), C0E4V.CIRCLE, C298910Bnd.LIZ(), z, false);
        s sVar = s.LIZ;
        Integer numValueOf = Integer.valueOf(EnumC1412640mre.CUT_SAME.getValue());
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        for (C0E4S c0e4s : arrayList2) {
            arrayList3.add(new C443120HZe(c0e4s.LJI, Long.valueOf(c0e4s.LJ), Long.valueOf(c0e4s.LJFF)));
        }
        String str2 = c0l7b.LJII;
        sVar.getClass();
        c0l7b.LJIIJJI = s.LJJIJIIJIL(numValueOf, nLETemplateModelRestore, arrayList3, str2, true);
        return NLETemplateModel.saveToDraft(nLETemplateModelRestore);
    }

    public final void W2(String str, String str2, List<? extends MediaModel> list, CreativeInfo creativeInfo, C0L7M c0l7m) {
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZLLLIL = list;
        this.LLJ = creativeInfo;
        this.LLIZ = c0l7m;
    }

    @Override // X.InterfaceC532280KuA
    public void TA1(String str, EnumC1412640mre enumC1412640mre, String str2, String str3, C1418100n0S c1418100n0S, final C0L7M c0l7m, Function0<Unit> function0) {
        String[] strArr;
        TemplateSourceConfig templateSourceConfigLIZ;
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateComp preDownload");
        C540290LGx.LIZ.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        if (!C533930Kwp.LIZIZ(strArr)) {
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateComp preDownload fail: no storage permission");
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        W2(str, str2, null, null, c0l7m);
        C0L7G c0l7g = this.LLJIJIL;
        c0l7g.LIZ = 0.0f;
        c0l7g.LIZIZ = 0.0f;
        c0l7g.LIZJ = 0.0f;
        c0l7g.LIZLLL = 0.0f;
        c0l7g.LJ = 0.0f;
        Context sceneContext = this.LL.getSceneContext();
        if (sceneContext == null) {
            return;
        }
        if (((Boolean) C0B7U.LIZ.getValue()).booleanValue()) {
            C0LE8.LIZ.getClass();
            templateSourceConfigLIZ = C0LE8.LIZ();
        } else {
            C1419810n3D.LIZ.getClass();
            templateSourceConfigLIZ = C1419810n3D.LIZ();
        }
        this.LLILZ = ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class)).LIZLLL(sceneContext, str, enumC1412640mre, null, str2, str3, null, W1(str, enumC1412640mre, str2, str3), templateSourceConfigLIZ, c1418100n0S, false, new C0L7K() { // from class: X.0L7J
            @Override // X.C0L7K
            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
            }

            @Override // X.C0L7K
            public final void LIZLLL(C0L7B c0l7b, boolean z) {
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateComp preDownload success");
                C0L7M c0l7m2 = c0l7m;
                if (c0l7m2 != null) {
                    c0l7m2.LIZLLL(c0l7b, z);
                }
            }

            @Override // X.C0L7K
            public final void LJFF(C0L7F c0l7f, boolean z) {
                C0L7M c0l7m2 = c0l7m;
                if (c0l7m2 != null) {
                    c0l7m2.LJFF(c0l7f, z);
                }
            }

            @Override // X.C0L7K
            public final void LIZJ(int i, String str4, boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AutoCutTemplateComp preDownload failure: errCode = ");
                sbLIZ.append(i);
                sbLIZ.append(", errMsg = ");
                sbLIZ.append(str4);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
                C0L7M c0l7m2 = c0l7m;
                if (c0l7m2 != null) {
                    c0l7m2.LIZJ(i, str4, z);
                }
                C0L7P c0l7p = this.LLILZ;
                if (c0l7p != null) {
                    c0l7p.cancel();
                }
            }

            @Override // X.C0L7K
            public final void LJ(String str4, String str5, boolean z) {
                C0L7M c0l7m2 = c0l7m;
                if (c0l7m2 != null) {
                    c0l7m2.LJ(str4, str5, z);
                }
            }
        });
    }

    @Override // X.InterfaceC532280KuA
    public void gd2(final String str, final EnumC1412640mre enumC1412640mre, final String str2, final String str3, List<? extends MediaModel> list, CreativeInfo creativeInfo, final int i, final C1418100n0S c1418100n0S, final C0L7M c0l7m) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateComp#downloadWithLoading: templateId = ");
        sbLIZ.append(str);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(str2);
        sbLIZ.append(", mediaList = ");
        sbLIZ.append(C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS239S0000000_8.get$arr$(242), 31));
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        if (creativeInfo == null) {
            return;
        }
        W2(str, str2, list, creativeInfo, c0l7m);
        C0L7G c0l7g = this.LLJIJIL;
        c0l7g.LIZ = 0.0f;
        c0l7g.LIZIZ = 0.0f;
        c0l7g.LIZJ = 0.0f;
        c0l7g.LIZLLL = 0.0f;
        c0l7g.LJ = 0.0f;
        if (C545820Lau.LIZIZ(this.LL) != null && !C545820Lau.LJ(this.LL)) {
            G2(40L, new AwS587S0100000_8(this, 525));
            if (c0l7m != null) {
                c0l7m.LJ(str, str2, false);
            }
            Activity activity = this.LL.mActivity;
            if (activity != null) {
                if (c0l7m != null) {
                    c0l7m.LIZ(list);
                }
                w2(activity, list, creativeInfo, new InterfaceC23176096g() { // from class: X.0L7I
                    @Override // X.InterfaceC23176096g
                    public final void onFailure() {
                        this.LIZ.W2(null, null, null, null, null);
                        C0L7M c0l7m2 = c0l7m;
                        if (c0l7m2 != null) {
                            c0l7m2.LIZJ(1001, null, false);
                        }
                        this.LIZ.T2();
                    }

                    @Override // X.InterfaceC23176096g
                    public final void onSuccess(final List list2) {
                        this.LIZ.LLJIJIL.LIZLLL = 100.0f;
                        C0L7M c0l7m2 = c0l7m;
                        if (c0l7m2 != null) {
                            c0l7m2.LIZIZ(list2);
                        }
                        Context sceneContext = this.LIZ.LL.getSceneContext();
                        if (sceneContext == null) {
                            return;
                        }
                        C0L7H c0l7h = this.LIZ;
                        ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
                        String str4 = str;
                        EnumC1412640mre enumC1412640mre2 = enumC1412640mre;
                        String str5 = str2;
                        String str6 = str3;
                        C573920Mf8 c573920Mf8W1 = this.LIZ.W1(str4, enumC1412640mre2, str5, str6);
                        C1419810n3D.LIZ.getClass();
                        TemplateSourceConfig templateSourceConfigLIZ = C1419810n3D.LIZ();
                        C1418100n0S c1418100n0S2 = c1418100n0S;
                        final C0L7H c0l7h2 = this.LIZ;
                        final EnumC1412640mre enumC1412640mre3 = enumC1412640mre;
                        final int i2 = i;
                        final C0L7M c0l7m3 = c0l7m;
                        c0l7h.LLILZ = iTemplateResourceService.LIZLLL(sceneContext, str4, enumC1412640mre2, null, str5, str6, null, c573920Mf8W1, templateSourceConfigLIZ, c1418100n0S2, false, new C0L7K() { // from class: X.0L7E
                            @Override // X.C0L7K
                            public final void LJ(String str7, String str8, boolean z) {
                            }

                            @Override // X.C0L7K
                            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
                            /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
                            /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
                            @Override // X.C0L7K
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZLLL(X.C0L7B r11, boolean r12) {
                                /*
                                    r10 = this;
                                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                    java.lang.String r0 = "AutoCutTemplateComp downloadTemplate success: "
                                    r1.append(r0)
                                    r1.append(r11)
                                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                                    X.C1417710mzp.LIZIZ(r0)
                                    X.0mre r3 = r2
                                    r2 = 0
                                    if (r11 == 0) goto L7c
                                    boolean r0 = r11.LJIIJ
                                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                                    com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r11.LJIIIIZZ
                                    if (r0 == 0) goto L7d
                                    java.lang.String r0 = r0.getMusicId()
                                L26:
                                    java.lang.String r2 = r11.LJIIIZ
                                L28:
                                    boolean r3 = X.C0LCZ.LIZ(r3, r1, r0, r2)
                                    if (r11 == 0) goto L3a
                                    X.0L7H r2 = r1
                                    java.util.List<X.096j> r1 = r3
                                    X.0mre r0 = r2
                                    com.bytedance.ies.nle.editor_jni.NLEModel r0 = r2.X1(r11, r1, r3, r0)
                                    r11.LIZIZ = r0
                                L3a:
                                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                    java.lang.String r0 = "AutoCutTemplateComp buildNLEModel: clipNum = "
                                    r1.append(r0)
                                    int r0 = r4
                                    r1.append(r0)
                                    java.lang.String r0 = ", compressedMediaList = "
                                    r1.append(r0)
                                    java.util.List<X.096j> r2 = r3
                                    r3 = 0
                                    r6 = 0
                                    r0 = 243(0xf3, float:3.4E-43)
                                    kotlin.jvm.internal.AFwS239S0000000_8 r8 = kotlin.jvm.internal.AFwS239S0000000_8.get$arr$(r0)
                                    r9 = 31
                                    r4 = r3
                                    r5 = r3
                                    r7 = r3
                                    java.lang.String r0 = X.C13LP.LJJLIIIJ(r2, r3, r4, r5, r6, r7, r8, r9)
                                    r1.append(r0)
                                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                                    X.C1417710mzp.LIZIZ(r0)
                                    X.0L7H r0 = r1
                                    r1 = r3
                                    r2 = r3
                                    r3 = r3
                                    r4 = r3
                                    r5 = r3
                                    r0.W2(r1, r2, r3, r4, r5)
                                    X.0L7M r0 = r5
                                    if (r0 == 0) goto L7b
                                    r0.LIZLLL(r11, r12)
                                L7b:
                                    return
                                L7c:
                                    r1 = r2
                                L7d:
                                    r0 = r2
                                    if (r11 == 0) goto L28
                                    goto L26
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C0L7E.LIZLLL(X.0L7B, boolean):void");
                            }

                            @Override // X.C0L7K
                            public final void LJFF(C0L7F c0l7f, boolean z) {
                                if (c0l7f == null) {
                                    return;
                                }
                                String str7 = c0l7f.LIZ;
                                if (Intrinsics.LJFF(str7, "stage_download_music")) {
                                    c0l7h2.LLJIJIL.LIZ = c0l7f.LIZIZ;
                                } else if (Intrinsics.LJFF(str7, "stage_download_template")) {
                                    c0l7h2.LLJIJIL.LIZJ = c0l7f.LIZIZ;
                                }
                                c0l7h2.o2();
                            }

                            @Override // X.C0L7K
                            public final void LIZJ(int i3, String str7, boolean z) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("AutoCutTemplateComp downloadTemplate failure: errCode = ");
                                sbLIZ2.append(i3);
                                sbLIZ2.append(", errMsg = ");
                                sbLIZ2.append(str7);
                                sbLIZ2.append(", reCallback = ");
                                sbLIZ2.append(z);
                                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                                c0l7h2.W2(null, null, null, null, null);
                                C0L7M c0l7m4 = c0l7m3;
                                if (c0l7m4 != null) {
                                    c0l7m4.LIZJ(i3, str7, z);
                                }
                                c0l7h2.T2();
                            }
                        });
                    }
                });
            }
        }
    }
}
