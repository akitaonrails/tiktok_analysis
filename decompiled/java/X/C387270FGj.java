package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS475S0200000_6;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS66S0301000_5;
import kotlin.jvm.internal.AwS91S0201000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387270FGj extends i<InterfaceC385950FBh, C389300FOe, C387490FHf, C387340FGq> implements InterfaceC379610EuV, InterfaceC385950FBh {
    public static final C387370FGt LLJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public boolean LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public Boolean LLJJIII;
    public List<C0FGS> LLJJIJI;
    public List<C0FGZ> LLJJIJIIJIL;
    public InterfaceC387360FGs LLJJIJIL;
    public TextStickerModel LLJJJ;
    public EnumC371580EhY LLJJJIL;
    public C09AE LLJJJJ;
    public C09AE LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final Function0<C387490FHf> LLJJL;
    public final Function0<C387340FGq> LLJJLIIIJLLLLLLLZ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0FGt] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C387270FGj.class, "textResourceService", "getTextResourceService()Lcom/ss/android/ugc/aweme/tools/sticker/core/text/resource/TextResourceRepository;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C387270FGj.class, "textMobService", "getTextMobService()Lcom/ss/android/ugc/aweme/tools/sticker/core/text/ITextStickerMobService;", 0)};
        LLJL = new Object() { // from class: X.0FGt
        };
        LLJLILLLLZIIL = 8;
    }

    public final void LLILZLL() {
        i3(AFwS234S0000000_5.get$arr$(80));
        K4();
    }

    public final C0FGR T4() {
        return (C0FGR) this.LLJJI.getValue(this, LLJLIL[1]);
    }

    @Override // X.InterfaceC385950FBh
    public void UQ1() {
        i3(AFwS234S0000000_5.get$arr$(79));
        C09AE c09ae = this.LLJJJJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C09AE c09ae2 = this.LLJJJJJIL;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
    }

    public final C0FDM Z4() {
        return (C0FDM) this.LLJJ.getValue(this, LLJLIL[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [T, java.util.List<X.0FGS>] */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, java.util.List<X.0FGZ>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    @Override // X.InterfaceC385950FBh
    public void r4() {
        T arrayList;
        boolean z = C0F8Y.LJIIIIZZ(this.LLJJJ) && this.LLJILJILJ;
        C259800zU c259800zU = new C259800zU();
        List<C0FGS> list = T2().LIZIZ;
        ?? r0 = (list == null || list.isEmpty()) ? this.LLJJIJI : T2().LIZIZ;
        c259800zU.element = r0;
        if (r0 == 0 || r0.isEmpty()) {
            return;
        }
        C259800zU c259800zU2 = new C259800zU();
        List<C0FGZ> list2 = T2().LIZJ;
        c259800zU2.element = (list2 == null || list2.isEmpty()) ? this.LLJJIJIIJIL : T2().LIZJ;
        if (!Intrinsics.LJFF(this.LLJJIII, Boolean.valueOf(z))) {
            this.LLJJIII = Boolean.valueOf(z);
            if (z) {
                c259800zU.element = this.LLJJIJI;
                c259800zU2.element = this.LLJJIJIIJIL;
            } else {
                List<C0FGS> list3 = this.LLJJIJI;
                T arrayList2 = 0;
                if (list3 != null) {
                    arrayList = new ArrayList();
                    for (C0FGS c0fgs : list3) {
                        if (!Intrinsics.LJFF(c0fgs.LIZIZ, "caption_animation")) {
                            arrayList.add(c0fgs);
                        }
                    }
                } else {
                    arrayList = 0;
                }
                c259800zU.element = arrayList;
                List<C0FGZ> list4 = this.LLJJIJIIJIL;
                if (list4 != null) {
                    arrayList2 = new ArrayList();
                    for (C0FGZ c0fgz : list4) {
                        if (!Intrinsics.LJFF(c0fgz.LIZ, "caption_animation")) {
                            arrayList2.add(c0fgz);
                        }
                    }
                }
                c259800zU2.element = arrayList2;
            }
        }
        int iP4 = (this.LLJJJ.getTextMotionModel().motionCategoryId.length() == 0 && C0F8Y.LJIIIIZZ(this.LLJJJ)) ? P4("caption_animation", (List) c259800zU.element) : P4(this.LLJJJ.getTextMotionModel().motionCategoryId, (List) c259800zU.element);
        Integer num = T2().LIZLLL;
        if (num == null || iP4 != num.intValue()) {
            this.LLJJJJLIIL = true;
        }
        TextMotionModel textMotionModel = this.LLJJJ.getTextMotionModel();
        if (textMotionModel.motionEnabled == 1) {
            String str = textMotionModel.motionId;
            C118300cf c118300cf = new C118300cf();
            if (C363290EMd.LIZ(this.LLJJJ.getTextMotionModel())) {
                c118300cf.element = -1;
            }
            i3(new C387220FGe(c259800zU, c259800zU2, str, textMotionModel, c118300cf, iP4));
            return;
        }
        List<C0FGS> list5 = T2().LIZIZ;
        if (list5 != null) {
            Iterator<C0FGS> it2 = list5.iterator();
            while (it2.hasNext()) {
                Iterator<C0FGT> it3 = it2.next().LIZ.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZJ = false;
                }
            }
        }
        i3(new AwS91S0201000_5(c259800zU, (C259800zU<List<C0FGS>>) c259800zU2, (C259800zU<List<C0FGZ>>) iP4, 1));
    }

    private final void K4() {
        List<C0FGS> list = T2().LIZIZ;
        if (list == null || list.isEmpty()) {
            C09AE c09ae = this.LLJJJJ;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            i3(AFwS234S0000000_5.get$arr$(77));
            this.LLJJJJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C387240FGg(this, null), 2);
        }
    }

    private final String O4() {
        C0FGS c0fgs;
        Integer num = T2().LIZLLL;
        int iIntValue = num != null ? num.intValue() : 0;
        List<C0FGS> list = T2().LIZIZ;
        if (list == null || (c0fgs = (C0FGS) C13LP.LJJJLZIJ(iIntValue, list)) == null) {
            return null;
        }
        return c0fgs.LIZIZ;
    }

    public final void F4() {
        List<C0FGS> list = T2().LIZIZ;
        if (list != null) {
            int i = 0;
            for (C0FGS c0fgs : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                Iterator<C0FGT> it2 = c0fgs.LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ = false;
                }
                i = i2;
            }
        }
        i3(AFwS234S0000000_5.get$arr$(76));
        C01TT.LIZLLL(new AwS549S0100000_5(this, 146));
    }

    @Override // X.InterfaceC385950FBh
    public void ys2() {
        show();
        i3(AFwS234S0000000_5.get$arr$(81));
        List<C0FGS> list = T2().LIZIZ;
        if (list == null || list.isEmpty()) {
            K4();
        } else {
            r4();
        }
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C387490FHf> o2() {
        return this.LLJJL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C387340FGq> w2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC385950FBh
    public void LJJLIIIJJIZ(TextStickerModel textStickerModel) {
        TextStickerModel textStickerModel2 = this.LLJJJ;
        this.LLJJJ = textStickerModel;
        if (textStickerModel.getBaseStickerModel().getId() != C364540EQy.LIZ(textStickerModel2)) {
            r4();
        }
    }

    @Override // X.InterfaceC385950FBh
    public void V0(int i) {
        i3(new AwS20S0001000_5(i, 4));
    }

    @Override // X.InterfaceC385950FBh
    public void Y0(EnumC371580EhY enumC371580EhY) {
        this.LLJJJIL = enumC371580EhY;
        EnumC371580EhY enumC371580EhY2 = EnumC371580EhY.SHOW;
        if (enumC371580EhY == enumC371580EhY2) {
            i3(AFwS234S0000000_5.get$arr$(83));
        } else {
            if (T2().LIZ != enumC371580EhY2) {
                return;
            }
            i3(AFwS234S0000000_5.get$arr$(84));
            i3(AFwS234S0000000_5.get$arr$(85));
        }
    }

    public final void onPageSelected(int i) {
        C0FGR c0fgrT4;
        String str;
        C0FGZ c0fgz;
        i3(new AwS20S0001000_5(i, 5));
        String str2 = this.LLJJJ.getTextMotionModel().motionCategoryId;
        if (str2.length() > 0 && P4(str2, T2().LIZIZ) == i) {
            r4();
        }
        if (!this.LLJJJJLIIL && (c0fgrT4 = T4()) != null) {
            List<C0FGZ> list = T2().LIZJ;
            if (list != null && (c0fgz = (C0FGZ) C13LP.LJJJLZIJ(i, list)) != null) {
                str = c0fgz.LIZ;
            } else {
                str = null;
            }
            c0fgrT4.LJIJJ(str, "motion_pager");
        }
        this.LLJJJJLIIL = false;
    }

    @Override // X.InterfaceC385950FBh
    public void uP0(InterfaceC387360FGs interfaceC387360FGs) {
        this.LLJJIJIL = interfaceC387360FGs;
    }

    private final int P4(String str, List<C0FGS> list) {
        int iIntValue;
        if (list != null) {
            Iterator<C0FGS> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().LIZIZ, str)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf == null || (iIntValue = numValueOf.intValue()) < 0) {
                return 0;
            }
            return iIntValue;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H4(com.ss.android.ugc.effectmanager.effect.model.Effect r8, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C387290FGl
            if (r0 == 0) goto L56
            r6 = r9
            X.0FGl r6 = (X.C387290FGl) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L5c
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
        L28:
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            X.0soe r1 = X.EnumC1641420soe.DOWNLOADING
            r0 = 0
            r7.x5(r8, r1, r0)
            X.00w2 r3 = new X.00w2
            r3.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r3.element = r0
            X.0FDM r2 = r7.Z4()
            if (r2 == 0) goto L64
            kotlin.jvm.internal.AwS214S0300000_5 r1 = new kotlin.jvm.internal.AwS214S0300000_5
            r0 = 5
            r1.<init>(r3, r7, r8, r0)
            r6.LLILLL = r4
            java.lang.Object r0 = r2.LIZIZ(r8, r1, r6)
            if (r0 != r5) goto L28
            return r5
        L56:
            X.0FGl r6 = new X.0FGl
            r6.<init>(r7, r9)
            goto L12
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L64:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387270FGj.H4(com.ss.android.ugc.effectmanager.effect.model.Effect, X.05Vn):java.lang.Object");
    }

    public final void v5(Effect effect, int i) {
        TextMotionData textMotionData = (TextMotionData) C362890EKp.LIZIZ(effect, TextMotionData.class);
        if (textMotionData == null) {
            return;
        }
        String strO4 = O4();
        if (Intrinsics.LJFF(strO4, "caption_animation") && this.LLJJJ.getWords().isEmpty()) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(C1664590tQ1.LJII(this)) != null) {
                C632670Orh.LIZIZ(C1664590tQ1.LJII(this), new C19719212De(578430123, new AwS475S0200000_6(this, effect, 2), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(C1664590tQ1.LJII(this));
            c1397580mTM.LJFF(2131828370);
            c1397580mTM.LIZ(2131828368);
            C985403tE.LIZ(c1397580mTM, new AwS371S0200000_5(this, effect, 19));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        if (!C2281551ESb.LIZIZ.LJJIJ()) {
            i3(new AwS584S0100000_5(effect, 140));
        }
        String unzipPath = effect.getUnzipPath();
        float f = textMotionData.motionDuration;
        float f2 = LSPassThroughRecordSizeConfig.DEFAULT;
        float f3 = f2 * f * f2;
        int i2 = textMotionData.motionType;
        String effectId = effect.getEffectId();
        if (strO4 == null) {
            strO4 = "";
        }
        TextMotionModel textMotionModel = new TextMotionModel(unzipPath, f3, i2, effectId, strO4, effect.getResource_id(), 1, true, false, false);
        textMotionModel.autoWrapLine = textMotionData.autoWrapLine;
        C01TT.LIZLLL(new AwS66S0301000_5(this, textMotionModel, i, effect, 0));
    }

    public C387270FGj(boolean z, C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = z;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0FDM.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), C0FGR.class, null);
        this.LLJJJ = new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
        this.LLJJJIL = EnumC371580EhY.HIDE;
        this.LLJJL = AFwS191S0000000_5.get$arr$(68);
        this.LLJJLIIIJLLLLLLLZ = new AwS549S0100000_5(this, 147);
    }

    private final void d5(int i, int i2, C0FGT c0fgt) {
        boolean z;
        C0FGZ c0fgz;
        C09AE c09ae = this.LLJJJJJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        Effect effect = c0fgt.LIZ;
        if (effect == null) {
            return;
        }
        C0FDM c0fdmZ4 = Z4();
        if (c0fdmZ4 != null && c0fdmZ4.LIZ.LJIJJLI(effect)) {
            v5(effect, i);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<C0FGZ> list = T2().LIZJ;
        if (list != null && (c0fgz = (C0FGZ) C13LP.LJJJLZIJ(i, list)) != null && Intrinsics.LJFF(c0fgz.LIZ, "caption_animation")) {
            z = true;
        } else {
            z = false;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJJJJIL = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C387260FGi(this, effect, z, jCurrentTimeMillis, i, null), 2);
    }

    private final void n5(int i, int i2, C0FGT c0fgt) {
        boolean z;
        C0FGZ c0fgz;
        C09AE c09ae = this.LLJJJJJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        Effect effect = c0fgt.LIZ;
        if (effect == null) {
            return;
        }
        i3(new AwS584S0100000_5(effect, 139));
        C0FDM c0fdmZ4 = Z4();
        if (c0fdmZ4 != null && c0fdmZ4.LIZ.LJIJJLI(effect)) {
            v5(effect, i);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<C0FGZ> list = T2().LIZJ;
        if (list != null && (c0fgz = (C0FGZ) C13LP.LJJJLZIJ(i, list)) != null && Intrinsics.LJFF(c0fgz.LIZ, "caption_animation")) {
            z = true;
        } else {
            z = false;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJJJJIL = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C387280FGk(this, effect, z, jCurrentTimeMillis, i, null), 2);
    }

    public final void k5(int i, int i2, C0FGT c0fgt) {
        if (C2281551ESb.LIZIZ.LJJIJ()) {
            n5(i, i2, c0fgt);
        } else {
            d5(i, i2, c0fgt);
        }
    }

    public final void t5(int i, int i2, C0FGT c0fgt) {
        C0FGR c0fgrT4;
        String resourceId;
        C0FGZ c0fgz;
        if (this.LLJJJIL != EnumC371580EhY.SHOW && (c0fgrT4 = T4()) != null) {
            Effect effect = c0fgt.LIZ;
            String str = null;
            if (effect != null) {
                resourceId = effect.getResourceId();
            } else {
                resourceId = null;
            }
            List<C0FGZ> list = T2().LIZJ;
            if (list != null && (c0fgz = (C0FGZ) C13LP.LJJJLZIJ(i, list)) != null) {
                str = c0fgz.LIZ;
            }
            c0fgrT4.LJIJJLI(resourceId, str);
        }
    }

    public final void x5(Effect effect, EnumC1641420soe enumC1641420soe, int i) {
        String resourceId;
        List<C0FGS> list = T2().LIZIZ;
        if (list != null) {
            Iterator<C0FGS> it2 = list.iterator();
            while (it2.hasNext()) {
                for (C0FGT c0fgt : it2.next().LIZ) {
                    Effect effect2 = c0fgt.LIZ;
                    if (effect2 != null) {
                        resourceId = effect2.getResourceId();
                    } else {
                        resourceId = null;
                    }
                    if (Intrinsics.LJFF(resourceId, effect.getResourceId())) {
                        c0fgt.LIZLLL = enumC1641420soe;
                        c0fgt.LJ = i;
                    }
                }
            }
        }
        i3(AFwS234S0000000_5.get$arr$(82));
    }
}
