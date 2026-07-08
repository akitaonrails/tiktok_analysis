package X;

import Y.AObserverS234S0100000_32;
import Y.ARunnableS101S0200000_32;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import ge.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS138S0101000_32;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18S2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18S2 extends i<InterfaceC1851400yHK, C21285918Rt, C18S0, C18RY> implements InterfaceC379610EuV, InterfaceC1851400yHK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final CreativeModel LLJJ;
    public final Map<AIGenerationType, C1851240yH4> LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final C389450FOt LLJJIJIIJIL;
    public final Map<AIGenerationType, C18S3> LLJJIJIL;
    public final MutableLiveData<C1838890xx9> LLJJJ;
    public final MutableLiveData<String> LLJJJIL;
    public final Function0<C18S0> LLJJJJ;
    public final Function0<C18RY> LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18S2.class, "aiPlaygroundHeaderApi", "getAiPlaygroundHeaderApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundHeaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C18S2.class, "aiPlaygroundGenerateApi", "getAiPlaygroundGenerateApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundGenerateApi;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJL = 8;
    }

    private final InterfaceC1851490yHT O4() {
        return (InterfaceC1851490yHT) this.LLJJIJI.getValue(this, LLJJJJLIIL[1]);
    }

    private final InterfaceC1851410yHL P4() {
        return (InterfaceC1851410yHL) this.LLJJIII.getValue(this, LLJJJJLIIL[0]);
    }

    public final void C5() {
        this.LLJJI.put(T2().LIZIZ, T2().LIZ);
    }

    @Override // X.InterfaceC1851400yHK
    public void LLLIL() {
        this.LLJJI.clear();
        t5(T2().LIZIZ);
        F4();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[PHI: r0
      0x0074: PHI (r0v14 java.lang.String) = (r0v13 java.lang.String), (r0v23 java.lang.String) binds: [B:31:0x0071, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // X.InterfaceC1851400yHK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getResourceId() {
        /*
            r4 = this;
            java.util.Map<com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType, X.18S3> r1 = r4.LLJJIJIL
            java.lang.Object r0 = r4.T2()
            X.18S0 r0 = (X.C18S0) r0
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType r0 = r0.LIZIZ
            java.lang.Object r1 = r1.get(r0)
            X.18S3 r1 = (X.C18S3) r1
            r0 = -1
            if (r1 == 0) goto L1a
            int r3 = r1.LIZIZ
        L15:
            java.lang.String r2 = ""
            if (r3 != r0) goto L1c
            return r2
        L1a:
            r3 = -1
            goto L15
        L1c:
            boolean r0 = X.C255770A0p.LIZ()
            if (r0 == 0) goto L4b
            java.util.Map<com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType, X.18S3> r1 = r4.LLJJIJIL
            java.lang.Object r0 = r4.T2()
            X.18S0 r0 = (X.C18S0) r0
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType r0 = r0.LIZIZ
            java.lang.Object r0 = r1.get(r0)
            X.18S3 r0 = (X.C18S3) r0
            if (r0 == 0) goto L4a
            java.util.List<com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel> r1 = r0.LIZJ
            if (r1 == 0) goto L4a
            int r0 = r1.size()
            if (r3 >= r0) goto L4a
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r3)
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel r0 = (com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel) r0
            if (r0 == 0) goto L4a
            java.lang.String r0 = r0.id
            if (r0 != 0) goto L74
        L4a:
            return r2
        L4b:
            java.util.Map<com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType, X.18S3> r1 = r4.LLJJIJIL
            java.lang.Object r0 = r4.T2()
            X.18S0 r0 = (X.C18S0) r0
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType r0 = r0.LIZIZ
            java.lang.Object r0 = r1.get(r0)
            X.18S3 r0 = (X.C18S3) r0
            if (r0 == 0) goto L4a
            java.util.List<com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel> r1 = r0.LIZ
            if (r1 == 0) goto L4a
            int r0 = r1.size()
            if (r3 >= r0) goto L4a
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r3)
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel r0 = (com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel) r0
            if (r0 == 0) goto L4a
            java.lang.String r0 = r0.id
            if (r0 != 0) goto L74
            return r2
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18S2.getResourceId():java.lang.String");
    }

    @Override // X.InterfaceC1851400yHK
    public void pE1() {
        i3(AFwS278S0000000_32.get$arr$(20));
    }

    private final void F4() {
        List<AIPlaygroundChipsModel> list;
        List<AIPlaygroundChipsModel> list2;
        if (C255770A0p.LIZ()) {
            C18S3 c18s3 = this.LLJJIJIL.get(T2().LIZIZ);
            if (c18s3 == null || (list2 = c18s3.LIZJ) == null) {
                return;
            }
            N5(-1);
            i3(new AwS611S0100000_32(list2, (List<AIPlaygroundChipsModel>) 36));
            return;
        }
        C18S3 c18s32 = this.LLJJIJIL.get(T2().LIZIZ);
        if (c18s32 == null || (list = c18s32.LIZ) == null) {
            return;
        }
        N5(-1);
        i3(new AwS611S0100000_32(list, (List<AIPlaygroundChipsModel>) 37));
    }

    private final void nD1() {
        MutableLiveData<AIGenerationType> mutableLiveDataII1;
        InterfaceC1851410yHL interfaceC1851410yHLP4 = P4();
        if (interfaceC1851410yHLP4 == null || (mutableLiveDataII1 = interfaceC1851410yHLP4.iI1()) == null) {
            return;
        }
        mutableLiveDataII1.observe(this, new AObserverS234S0100000_32(this, 5));
    }

    public final void H4() {
        if (C255770A0p.LIZ()) {
            i3(AFwS278S0000000_32.get$arr$(17));
        } else {
            i3(AFwS278S0000000_32.get$arr$(18));
        }
    }

    @Override // X.InterfaceC1851400yHK
    public boolean LJJIL() {
        if (T2().LJFF.LIZ != EnumC1749680vdG.OPEN) {
            return false;
        }
        i3(AFwS278S0000000_32.get$arr$(16));
        return true;
    }

    @Override // X.InterfaceC1851400yHK
    public EnumC382880Ezm getPromptType() {
        return T2().LIZ.LIZIZ;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        nD1();
    }

    public final void v5() {
        Z4(T2().LIZIZ);
    }

    @Override // X.InterfaceC1851400yHK
    public String yQ() {
        return T2().LIZ.LIZ;
    }

    @Override // X.InterfaceC1851400yHK
    public MutableLiveData<String> Od1() {
        return this.LLJJJIL;
    }

    public final CreativeModel T4() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C18S0> o2() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1851400yHK
    public MutableLiveData<C1838890xx9> oP2() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C18RY> w2() {
        return this.LLJJJJJIL;
    }

    private final void x5(C1838890xx9 c1838890xx9) {
        C1838890xx9 c1838890xx92 = new C1838890xx9(c1838890xx9.LIZIZ, T2().LIZIZ, c1838890xx9.LIZ);
        oP2().setValue(c1838890xx92);
        i3(new AwS611S0100000_32(c1838890xx92, 42));
    }

    public final void D5(List<AIPlaygroundChipsModel> list) {
        C18S3 c18s3;
        AIGenerationType aIGenerationType = T2().LIZIZ;
        Map<AIGenerationType, C18S3> map = this.LLJJIJIL;
        C18S3 c18s32 = map.get(aIGenerationType);
        if (c18s32 != null) {
            c18s3 = new C18S3(c18s32.LIZ, -1, list);
        } else {
            c18s3 = new C18S3(list, -1, list);
        }
        map.put(aIGenerationType, c18s3);
    }

    public final void K4(AIGenerationType aIGenerationType) {
        ArrayList<AIPlaygroundChipsModel> arrayList;
        C389450FOt c389450FOt = this.LLJJIJIIJIL;
        c389450FOt.getClass();
        String strLIZ = C389450FOt.LIZ(aIGenerationType);
        if (strLIZ.length() != 0 && (arrayList = c389450FOt.LIZLLL.get(strLIZ)) != null && (!arrayList.isEmpty())) {
            if (C255770A0p.LIZ()) {
                i3(new AwS611S0100000_32(arrayList, (List<AIPlaygroundChipsModel>) 38));
                return;
            } else {
                i3(new AwS611S0100000_32(arrayList, (List<AIPlaygroundChipsModel>) 39));
                return;
            }
        }
        H4();
    }

    public final void N5(int i) {
        AIGenerationType aIGenerationType = T2().LIZIZ;
        C18S3 c18s3 = this.LLJJIJIL.get(aIGenerationType);
        if (c18s3 != null) {
            this.LLJJIJIL.put(aIGenerationType, new C18S3(c18s3.LIZ, i, c18s3.LIZJ));
        }
    }

    public final void Z4(AIGenerationType aIGenerationType) {
        List<AIPlaygroundChipsModel> list;
        int i;
        String str;
        List<AIPlaygroundChipsModel> list2;
        if (aIGenerationType == AIGenerationType.AI_TRANSITION) {
            return;
        }
        C18S3 c18s3 = this.LLJJIJIL.get(aIGenerationType);
        if (c18s3 != null) {
            list = c18s3.LIZ;
        } else {
            list = null;
        }
        C18S3 c18s32 = this.LLJJIJIL.get(aIGenerationType);
        if (c18s32 != null) {
            i = c18s32.LIZIZ;
        } else {
            i = -1;
        }
        if (list != null) {
            if (C255770A0p.LIZ()) {
                C18S3 c18s33 = this.LLJJIJIL.get(aIGenerationType);
                if (c18s33 != null && (list2 = c18s33.LIZJ) != null) {
                    i3(new AwS138S0101000_32(list2, (List<AIPlaygroundChipsModel>) i, 1));
                    return;
                }
                return;
            }
            i3(new AwS138S0101000_32(list, (List<AIPlaygroundChipsModel>) i, 2));
            return;
        }
        final C389450FOt c389450FOt = this.LLJJIJIIJIL;
        final boolean zLIZ = C255770A0p.LIZ();
        final AwS433S0200000_32 awS433S0200000_32 = new AwS433S0200000_32(this, aIGenerationType, 9);
        final AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 91);
        c389450FOt.getClass();
        final String strLIZ = C389450FOt.LIZ(aIGenerationType);
        if (c389450FOt.LIZLLL.get(strLIZ) == null) {
            if (zLIZ) {
                str = "ai_video_tool_text_card";
            } else {
                str = "ai_video_tool_image_card";
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            c389450FOt.LIZJ.sg(str, strLIZ, 200, 0, 0, null, new IFetchCategoryEffectListener() { // from class: X.0FOs
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    Integer numValueOf;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetch effect list failed,code: ");
                    String msg = null;
                    if (exceptionResult != null) {
                        numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(" msg: ");
                    if (exceptionResult != null) {
                        msg = exceptionResult.getMsg();
                    }
                    sbLIZ.append(msg);
                    C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
                    awS576S0100000_32.invoke();
                    C389450FOt c389450FOt2 = c389450FOt;
                    String str2 = strLIZ;
                    boolean z = zLIZ;
                    long j = jCurrentTimeMillis;
                    c389450FOt2.getClass();
                    C389450FOt.LIZJ(j, str2, false, z);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    final CategoryEffectModel categoryEffects;
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    if (categoryPageModel2 != null && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null) {
                        final C389450FOt c389450FOt2 = c389450FOt;
                        final String str2 = strLIZ;
                        final boolean z = zLIZ;
                        long j = jCurrentTimeMillis;
                        final Function0<Unit> function0 = awS576S0100000_32;
                        final Function0<Unit> function02 = awS433S0200000_32;
                        ArrayList arrayList = new ArrayList(categoryEffects.getEffects());
                        final long jCurrentTimeMillis2 = System.currentTimeMillis();
                        c389450FOt2.LIZJ.og(arrayList, new IFetchEffectListListener() { // from class: X.0FOu
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                            public final void onFail(ExceptionResult exceptionResult) {
                                function0.invoke();
                                C389450FOt c389450FOt3 = c389450FOt2;
                                String str3 = str2;
                                boolean z2 = z;
                                long j2 = jCurrentTimeMillis2;
                                c389450FOt3.getClass();
                                C389450FOt.LIZIZ(j2, str3, z2);
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(List<Effect> list3) {
                                String category_key = categoryEffects.getCategory_key();
                                C389450FOt c389450FOt3 = c389450FOt2;
                                boolean z2 = z;
                                C23250099c.LIZLLL(c389450FOt3.LIZ, null, null, new C05CW(c389450FOt3, category_key, new AwS549S0100000_5(function02, (Function0<Unit>) 1197), list3, z2, null), 3);
                                C389450FOt c389450FOt4 = c389450FOt2;
                                boolean z3 = z;
                                long j2 = jCurrentTimeMillis2;
                                c389450FOt4.getClass();
                                C389450FOt.LIZIZ(j2, category_key, z3);
                            }
                        });
                        C389450FOt.LIZJ(j, str2, true, z);
                        return;
                    }
                    C389450FOt c389450FOt3 = c389450FOt;
                    String str3 = strLIZ;
                    boolean z2 = zLIZ;
                    long j2 = jCurrentTimeMillis;
                    Function0<Unit> function03 = awS576S0100000_32;
                    C201955140j.LJ("fetch effect list success but rsp is null");
                    c389450FOt3.getClass();
                    C389450FOt.LIZJ(j2, str3, false, z2);
                    function03.invoke();
                }
            });
            return;
        }
        awS433S0200000_32.invoke();
    }

    public final void d5(String str) {
        InterfaceC1851490yHT interfaceC1851490yHTO4 = O4();
        if (interfaceC1851490yHTO4 != null) {
            interfaceC1851490yHTO4.cS0(str);
        }
    }

    public final void k5(C1838890xx9 c1838890xx9) {
        if (c1838890xx9.LIZ) {
            if (T2().LJFF.LIZ != EnumC1749680vdG.OPEN) {
                i3(new AwS611S0100000_32(c1838890xx9, 40));
                x5(new C1838890xx9(true, c1838890xx9.LIZIZ, 4));
                return;
            }
            return;
        }
        if (T2().LJFF.LIZ == EnumC1749680vdG.CLOSE) {
            return;
        }
        x5(new C1838890xx9(false, T2().LJFF.LIZIZ, 4));
        i3(AFwS278S0000000_32.get$arr$(19));
    }

    public final void n5(List<AIPlaygroundChipsModel> list) {
        C18S3 c18s3 = this.LLJJIJIL.get(T2().LIZIZ);
        if (c18s3 == null) {
            return;
        }
        List<AIPlaygroundChipsModel> listLJIIZILJ = c18s3.LIZ;
        if (listLJIIZILJ.isEmpty()) {
            return;
        }
        HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(list);
        ArrayList arrayList = new ArrayList();
        for (AIPlaygroundChipsModel aIPlaygroundChipsModel : listLJIIZILJ) {
            if (!hashSetLLIFFJFJJ.contains(aIPlaygroundChipsModel)) {
                arrayList.add(aIPlaygroundChipsModel);
            }
        }
        C19994913Lf c19994913Lf = AbstractC19994813Le.Default;
        if (!arrayList.isEmpty()) {
            listLJIIZILJ = C1697810uHb.LJIIZILJ(arrayList, c19994913Lf);
        }
        i3(new AwS611S0100000_32(listLJIIZILJ, (List<AIPlaygroundChipsModel>) 41));
    }

    public final void t5(AIGenerationType aIGenerationType) {
        C1851240yH4 c1851240yH4 = this.LLJJI.get(aIGenerationType);
        if (c1851240yH4 != null) {
            M5(c1851240yH4.LIZ, c1851240yH4.LIZIZ);
        } else {
            M5("", EnumC382880Ezm.BY_USER);
        }
    }

    private final void M5(String str, EnumC382880Ezm enumC382880Ezm) {
        i3(new AwS146S1100000_32(str, enumC382880Ezm, 1));
    }

    public final void E5(C1851240yH4 c1851240yH4, boolean z) {
        C18S3 c18s3;
        i3(new AwS611S0100000_32(c1851240yH4, 43));
        C12WG.LIZJ(this.LLJILJILJ, new ARunnableS101S0200000_32(this, c1851240yH4, 15));
        if (!z && (c18s3 = this.LLJJIJIL.get(T2().LIZIZ)) != null && c18s3.LIZIZ != -1) {
            F4();
        }
    }

    @Override // X.InterfaceC1851400yHK
    public void qj2(String str, boolean z) {
        EnumC382880Ezm enumC382880Ezm;
        if (z) {
            enumC382880Ezm = EnumC382880Ezm.BY_HINT;
        } else {
            enumC382880Ezm = EnumC382880Ezm.BY_USER;
        }
        M5(str, enumC382880Ezm);
    }

    public C18S2(C19A3 c19a3, C1DRG c1drg, CreativeModel creativeModel) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = creativeModel;
        this.LLJJI = new LinkedHashMap();
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851410yHL.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851490yHT.class, null);
        this.LLJJIJIIJIL = new C389450FOt(LifecycleOwnerKt.getLifecycleScope(this));
        this.LLJJIJIL = new LinkedHashMap();
        this.LLJJJ = new MutableLiveData<>();
        this.LLJJJIL = new MutableLiveData<>();
        this.LLJJJJ = AFwS223S0000000_32.get$arr$(36);
        this.LLJJJJJIL = new AwS576S0100000_32(this, 92);
    }

    public final void R5(List<AIPlaygroundChipsModel> list, int i, List<AIPlaygroundChipsModel> list2) {
        this.LLJJIJIL.put(T2().LIZIZ, new C18S3(list, i, list2));
    }
}
