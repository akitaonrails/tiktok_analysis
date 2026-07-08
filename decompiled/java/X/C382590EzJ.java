package X;

import Y.AObjectS240S0100000_5;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.ImageGenTaskConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS113S0101000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS233S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0EzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382590EzJ extends C0ETZ<InterfaceC379060Etc, C383030F0b, C382650EzP, C0F0H> implements InterfaceC379060Etc {
    public static final C382710EzV LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C19A3 LLJJI;
    public final C1DRG LLJJIII;
    public final Function0<C383030F0b> LLJJIJI;
    public final Function0<C382650EzP> LLJJIJIIJIL;
    public final Function0<C0F0H> LLJJIJIL;
    public volatile Function0<Unit> LLJJJ;
    public volatile boolean LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final h0<List<C379170Etn>> LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public boolean LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0EzV] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C382590EzJ.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelContext;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C382590EzJ.class, "editorProLoaderApi", "getEditorProLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0), new C2217381BqS(C382590EzJ.class, "topBarApiComponent", "getTopBarApiComponent()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/topbar/EPAICreateTopBarApiComponent;", 0), new C2217381BqS(C382590EzJ.class, "editTextApiComponent", "getEditTextApiComponent()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditTextComponent;", 0), new C2217381BqS(C382590EzJ.class, "configComponent", "getConfigComponent()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/configurations/EPAIGCConfigurationApiComponent;", 0), new C2217381BqS(C382590EzJ.class, "navApi", "getNavApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelNavApiComponent;", 0), new C2217381BqS(C382590EzJ.class, "rootApi", "getRootApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelRootApiComponent;", 0)};
        LLJLLL = new Object() { // from class: X.0EzV
        };
        LLJZIJLIL = 8;
    }

    private final String E5() {
        Object next;
        String[] strArr = new String[3];
        AIGCGenerationParam aIGCGenerationParam = Z4().LLJI;
        strArr[0] = aIGCGenerationParam != null ? aIGCGenerationParam.i2vSlotID : null;
        strArr[1] = Z4().LJII().LJIIJJI;
        strArr[2] = Z4().LLJIJIL;
        Iterator it2 = C13LQ.LJIJI(strArr).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!a0.LJJJIL((String) next)) {
                break;
            }
        }
        String str = (String) next;
        if (str == null) {
            return null;
        }
        return str;
    }

    private final InterfaceC379180Eto K4() {
        return (InterfaceC379180Eto) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJZ[4]);
    }

    private final C0EY2 P4() {
        return (C0EY2) this.LLJJJJJIL.getValue(this, LLJZ[1]);
    }

    private final C0ETQ T4() {
        return (C0ETQ) this.LLJL.getValue(this, LLJZ[5]);
    }

    private final InterfaceC379160Etm k5() {
        return (InterfaceC379160Etm) this.LLJLILLLLZIIL.getValue(this, LLJZ[6]);
    }

    private final InterfaceC379270Etx n5() {
        return (InterfaceC379270Etx) this.LLJJJJLIIL.getValue(this, LLJZ[2]);
    }

    private final void nD1() {
        this.LLJLIL.LIZ(this, new AObjectS240S0100000_5(this, 51));
        T4().Gs1().LIZ(this, new AObjectS240S0100000_5(this, 52));
    }

    @Override // X.InterfaceC379060Etc
    public List<C379170Etn> Ni1() {
        List<C379170Etn> listLIZJ = this.LLJLIL.LIZJ();
        return listLIZJ == null ? C13BV.INSTANCE : listLIZJ;
    }

    public final C382830Ezh O4() {
        return (C382830Ezh) this.LLJJL.getValue(this, LLJZ[3]);
    }

    public final C379120Eti Z4() {
        return (C379120Eti) this.LLJJJJ.getValue(this, LLJZ[0]);
    }

    public final InterfaceC381940EyG d5() {
        return (InterfaceC381940EyG) this.LLJLL.getValue();
    }

    public final void v5() {
        if (this.LLJJJIL) {
            return;
        }
        this.LLJJJIL = true;
        Function0<Unit> function0 = this.LLJJJ;
        this.LLJJJ = null;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void x5() {
        if (this.LLJLLIL) {
            this.LLJLLIL = false;
            O4().Tw2();
        }
    }

    private final NLETrackSlot H5() {
        NLETrackSlot next;
        Iterator<NLETrackSlot> it2 = C352250DrT.LJFF(C350870DpF.LJI(Z4().LLILLJJLI)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.getUUID(), E5())) {
                break;
            }
        }
        return next;
    }

    public final VideoPublishEditModel getEditModel() {
        return P4().getEditModel();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        nD1();
    }

    @Override // X.InterfaceC379060Etc
    public List<String> vv2() {
        return T2().LIZJ;
    }

    @Override // ge.i
    public Function0<C383030F0b> E3() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC379060Etc
    public C385670FAf<List<C379170Etn>> EJ1() {
        return this.LLJLIL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C382650EzP> o2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0F0H> w2() {
        return this.LLJJIJIL;
    }

    public static final String R5(String str) {
        String string = a0.LJLIIIL(str).toString();
        if (!(!a0.LJJJIL(string))) {
            return null;
        }
        return string;
    }

    @Override // X.InterfaceC379060Etc
    public void Bb1(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && c0vsj.isFile()) {
                if (c0vsj.delete()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Successfully deleted old persistent AIGC file: ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Failed to delete old persistent AIGC file: ");
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D5(X.InterfaceC1364105Vn<? super java.lang.String> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof X.C382640EzO
            if (r0 == 0) goto L97
            r7 = r15
            X.0EzO r7 = (X.C382640EzO) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r1 = r7.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r6 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L27
            if (r0 == r9) goto L7d
            if (r0 != r6) goto L9e
            X.C155000ia.LIZIZ(r1)
        L26:
            return r1
        L27:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r14.getEditModel()
            if (r4 != 0) goto L31
            return r5
        L31:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r3 = r14.H5()
            if (r3 != 0) goto L38
            return r5
        L38:
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r3.getMainSegment()
            com.bytedance.ies.nle.editor_jni.NLESegmentVideo r0 = com.bytedance.ies.nle.editor_jni.NLESegmentVideo.dynamicCast(r0)
            if (r0 == 0) goto L7a
            long r12 = r0.getTimeClipEnd()
        L46:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0Moe r0 = r0.LJJIIJZLJL()
            X.0MYj r11 = r0.getPathService()
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r10 = r4.getCreativeInfo()
            X.14Cw r2 = X.EnumC20228014Cw.EP_FRAME
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            java.lang.String r2 = r11.LJIJ(r10, r2, r1, r0)
            X.0DtI r1 = X.C353380DtI.LIZ
            java.lang.Long r0 = X.C2286608xc.LJFF(r12)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r7.LL = r4
            r7.LLILZ = r9
            java.lang.Object r1 = r1.LIZ(r3, r0, r2, r7)
            if (r1 != r8) goto L82
            return r8
        L7a:
            r12 = 0
            goto L46
        L7d:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L82:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = X.C13LP.LJJJLL(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto La6
            r7.LL = r5
            r7.LLILZ = r6
            java.lang.Object r1 = X.C353380DtI.LIZJ(r4, r0, r7)
            if (r1 != r8) goto L26
            return r8
        L97:
            X.0EzO r7 = new X.0EzO
            r7.<init>(r14, r15)
            goto L12
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382590EzJ.D5(X.05Vn):java.lang.Object");
    }

    public final Float M5(C379170Etn c379170Etn) {
        NLETrackSlot nLETrackSlotH5;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEResourceNode resource;
        if (c379170Etn.LIZJ() && (nLETrackSlotH5 = H5()) != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotH5.getMainSegment())) != null && (resource = nLESegmentVideoDynamicCast.getResource()) != null) {
            float width = resource.getWidth();
            float height = resource.getHeight();
            if (width > 0.0f && height > 0.0f) {
                return Float.valueOf(width / height);
            }
        }
        return null;
    }

    @Override // X.InterfaceC379060Etc
    public void Nv0(boolean z) {
        i3(new AwS20S0010000_5(z, 11));
    }

    @Override // X.InterfaceC379060Etc
    public void PC0(boolean z) {
        i3(new AwS20S0010000_5(z, 13));
    }

    public final void S5(List<C379170Etn> list) {
        if (Intrinsics.LJFF(list, this.LLJLIL.LIZJ())) {
            return;
        }
        k5().J02(new C378960EtS(null, null, list, 3), false);
    }

    public final void U5(String str) {
        O4().LLLLIIIILLL(str);
        K4().rv2(EnumC382880Ezm.BY_HINT);
    }

    @Override // X.InterfaceC379060Etc
    public void fN0(boolean z) {
        i3(new AwS20S0010000_5(z, 12));
    }

    @Override // X.InterfaceC379060Etc
    public void iK1(Function0<Unit> function0) {
        if (this.LLJJJIL) {
            function0.invoke();
        } else {
            this.LLJJJ = function0;
        }
    }

    @Override // X.InterfaceC379060Etc
    public Object jo0(InterfaceC1364105Vn<? super List<C379170Etn>> interfaceC1364105Vn) {
        List<C379170Etn> listNi1 = Ni1();
        if (listNi1.isEmpty()) {
            return null;
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C382600EzK(listNi1, this, null));
    }

    public final void t5(C0F04 c0f04) {
        if (n5().N7() == EnumC378720Et4.TEXT_TO_VIDEO_CREATION) {
            C378370EsV c378370EsV = C378370EsV.LIZ;
            AbstractC359300E6u abstractC359300E6u = Z4().LLJILJIL;
            c378370EsV.getClass();
            C378370EsV.LJIIIZ(abstractC359300E6u, c0f04);
            return;
        }
        C378370EsV c378370EsV2 = C378370EsV.LIZ;
        AbstractC359300E6u abstractC359300E6u2 = Z4().LLJILJIL;
        c378370EsV2.getClass();
        C378370EsV.LJIIIIZZ(abstractC359300E6u2, c0f04);
    }

    @Override // X.InterfaceC379060Etc
    public void yA(int i) {
        VideoPublishEditModel editModel;
        boolean z;
        i3(new AwS113S0101000_5(this, i, 2));
        this.LLJLLIL = true;
        Activity activity = this.LLJJI.mActivity;
        if (activity != null && (editModel = getEditModel()) != null) {
            C363500EMy.LIZ.getClass();
            boolean z2 = false;
            if (C363500EMy.LJIILJJIL(editModel) && C286450BKp.LIZ()) {
                C0L1K c0l1k = C0L1K.LIZ;
                if (n5().N7() == EnumC378720Et4.TEXT_TO_IMAGE_CREATION) {
                    z2 = true;
                }
                c0l1k.getClass();
                Bundle bundleLIZ = C0L1K.LIZ(editModel, true);
                if (z2) {
                    bundleLIZ.putBoolean("key_is_ep_ai_image_panel", true);
                }
                C1660680tJi.LIZ().LIZJ(activity, bundleLIZ, 10008, 10008);
                return;
            }
            C0L1K c0l1k2 = C0L1K.LIZ;
            if (n5().N7() == EnumC378720Et4.TEXT_TO_IMAGE_CREATION) {
                z = true;
            } else {
                z = false;
            }
            c0l1k2.getClass();
            Bundle bundleLIZ2 = C0L1K.LIZ(editModel, false);
            if (z) {
                bundleLIZ2.putBoolean("key_is_ep_ai_image_panel", true);
            }
            C1660680tJi.LIZ().LJIIIZ(activity, bundleLIZ2, 10008, 10008);
        }
    }

    @Override // X.InterfaceC379060Etc
    public void zH0(C378970EtT c378970EtT) {
        C380190EvR c380190EvR = c378970EtT.LIZ;
        if (!T2().LJI) {
            i3(AFwS234S0000000_5.get$arr$(150));
        }
        if (c380190EvR.LJIIJ != null && (!r0.isEmpty())) {
            i3(AFwS234S0000000_5.get$arr$(151));
        } else {
            if (c380190EvR.LJIIIZ != null && (!r0.isEmpty())) {
                Iterator<ImageGenTaskConfig> it2 = c380190EvR.LJIIIZ.iterator();
                if (it2.hasNext()) {
                    int i = it2.next().imageMaxRefCount;
                    while (it2.hasNext()) {
                        int i2 = it2.next().imageMaxRefCount;
                        if (i < i2) {
                            i = i2;
                        }
                    }
                    i3(new AwS233S0000000_5(i, 0));
                } else {
                    throw new NoSuchElementException();
                }
            }
        }
        List<C379170Etn> list = c378970EtT.LIZLLL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C379170Etn c379170Etn : list) {
                if (c379170Etn.LIZJ() && c379170Etn.LIZJ == null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C382610EzL(list, this, null), 3);
                    return;
                }
            }
        }
        this.LLJLIL.LJII(list);
        i3(new AwS584S0100000_5(list, (List<Pair<Long, Float>>) 265));
    }

    public C382590EzJ(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = c1drg;
        this.LLJJIJI = AFwS191S0000000_5.get$arr$(95);
        this.LLJJIJIIJIL = AFwS191S0000000_5.get$arr$(94);
        this.LLJJIJIL = new AwS549S0100000_5(this, 271);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), C379120Eti.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), C0EY2.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379270Etx.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), C382830Ezh.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379180Eto.class, null);
        this.LLJL = C1664770tQJ.LIZ(getDiContainer(), C0ETQ.class, null);
        this.LLJLIL = new h0<>(null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379160Etm.class, null);
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 270));
    }

    public static final String N5(String str, boolean z) {
        if (u.LJJIIJZLJL(str, "content://", false)) {
            if (z) {
                return "mp4";
            }
            return "jpg";
        }
        String strLJIJ = C08QA.LJIJ(new C0VSJ(str));
        if (a0.LJJJIL(strLJIJ)) {
            if (z) {
                return "mp4";
            }
            return "jpg";
        }
        if (strLJIJ.length() > 8) {
            if (z) {
                return "mp4";
            }
            return "jpg";
        }
        for (int i = 0; i < strLJIJ.length(); i++) {
            if (!Character.isDigit(strLJIJ.charAt(i))) {
                return strLJIJ;
            }
        }
        if (z) {
            return "mp4";
        }
        return "jpg";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C5(X.C379170Etn r6, X.InterfaceC1364105Vn<? super X.C379170Etn> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C382630EzN
            if (r0 == 0) goto L22
            r4 = r7
            X.0EzN r4 = (X.C382630EzN) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.0Etn r6 = r4.LL
            goto L48
        L22:
            X.0EzN r4 = new X.0EzN
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = r6.LIZJ()
            if (r0 == 0) goto L72
            java.lang.String r0 = r6.LIZJ
            if (r0 != 0) goto L72
            r4.LL = r6     // Catch: java.lang.Throwable -> L59
            r4.LLILZ = r1     // Catch: java.lang.Throwable -> L59
            java.lang.Object r3 = r5.D5(r4)     // Catch: java.lang.Throwable -> L59
            if (r3 != r2) goto L4b
            return r2
        L48:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L59
        L4b:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L59
            if (r3 != 0) goto L51
            r0 = r6
            goto L55
        L51:
            X.0Etn r0 = X.C379170Etn.LIZ(r6, r3)     // Catch: java.lang.Throwable -> L59
        L55:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L59
            goto L65
        L59:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L65:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r1 != 0) goto L6c
            return r0
        L6c:
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L71
            throw r1
        L71:
            return r6
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382590EzJ.C5(X.0Etn, X.05Vn):java.lang.Object");
    }

    public final Object H4(List<String> list, InterfaceC1364105Vn<? super List<C378700Et2>> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        d5().LIZJ(list, new AwS584S0100000_5(c2252611DEt, 264));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC379060Etc
    public void Y22(String str, String str2) {
        C379170Etn c379170EtnLIZ = C379220Ets.LIZ(str);
        if (c379170EtnLIZ.LIZJ()) {
            if (str2 != null) {
                i3(new AwS584S0100000_5(C379170Etn.LIZ(c379170EtnLIZ, str2), 267));
                return;
            } else {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C382620EzM(this, c379170EtnLIZ, null), 3);
                return;
            }
        }
        i3(new AwS584S0100000_5(c379170EtnLIZ, 269));
    }
}
