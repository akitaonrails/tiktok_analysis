package X;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCameoDisplayInfo;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS116S0101000_8;
import kotlin.jvm.internal.AwS14S0211000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS94S0201000_8;
import kotlin.jvm.internal.AwS96S0110000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0LoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554100LoG extends i<InterfaceC554090LoF, C554270LoX, C554170LoN, C554210LoR> implements InterfaceC379610EuV, InterfaceC554090LoF {
    public static final C554200LoQ LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1DRG LLJILJILJ;
    public final C553990Lo5 LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final Set<String> LLJJIII;
    public final CoroutineExceptionHandler LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final Function0<C554270LoX> LLJJIJIL;
    public final MutableLiveData<C551290Ljj> LLJJJ;
    public final MutableLiveData<C551390Ljt> LLJJJIL;
    public final MutableLiveData<C549360Lgc> LLJJJJ;
    public final MutableLiveData<C551290Ljj> LLJJJJJIL;
    public final MutableLiveData<List<MentionDataItem>> LLJJJJLIIL;
    public List<MentionDataItem> LLJJL;
    public List<MentionDataItem> LLJJLIIIJLLLLLLLZ;
    public List<MentionDataItem> LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public C554160LoM LLJLL;
    public MentionDataItem LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0LoQ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C554100LoG.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C554100LoG.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0)};
        LLJLLL = new Object() { // from class: X.0LoQ
        };
    }

    private final void Z4() {
        MutableLiveData<List<MentionDataItem>> mutableLiveData = this.LLJJJJLIIL;
        ArrayList arrayList = new ArrayList();
        List<MentionDataItem> list = this.LLJJL;
        if (list != null) {
            arrayList.addAll(list);
        }
        List<MentionDataItem> list2 = this.LLJJLIIIJLLLLLLLZ;
        ArrayList arrayList2 = new ArrayList();
        for (MentionDataItem mentionDataItem : list2) {
            List<MentionDataItem> list3 = this.LLJJL;
            if (list3 == null || !list3.contains(mentionDataItem)) {
                arrayList2.add(mentionDataItem);
            }
        }
        arrayList.addAll(arrayList2);
        mutableLiveData.setValue(arrayList);
        i3(new AwS587S0100000_8(this, 61));
    }

    private final int d5() {
        if (this.LLJILLL.getShowSkeleton$tools_ai_uikit_df_release()) {
            return this.LLJILLL.getSkeletonCount$tools_ai_uikit_df_release();
        }
        return 0;
    }

    public final AbstractC329610Cw3<Long> E5() {
        return (AbstractC329610Cw3) this.LLJJIJIIJIL.getValue();
    }

    public final boolean M5() {
        List<MentionDataItem> followPathCurrentUserInfos$tools_ai_uikit_df_release = this.LLJILLL.getFollowPathCurrentUserInfos$tools_ai_uikit_df_release();
        return followPathCurrentUserInfos$tools_ai_uikit_df_release != null && (followPathCurrentUserInfos$tools_ai_uikit_df_release.isEmpty() ^ true) && this.LLJILLL.isFollowPathMode$tools_ai_uikit_df_release();
    }

    @Override // X.InterfaceC554090LoF
    public List<Pair<MentionDataItem, MentionDataItem>> de() {
        Object objLJJJLZIJ;
        ArrayList arrayList = new ArrayList();
        List<MentionDataItem> followPathOriginUserInfos$tools_ai_uikit_df_release = this.LLJILLL.getFollowPathOriginUserInfos$tools_ai_uikit_df_release();
        if (followPathOriginUserInfos$tools_ai_uikit_df_release == null) {
            return C13BV.INSTANCE;
        }
        List<MentionDataItem> value = this.LLJJJJLIIL.getValue();
        if (value != null) {
            int i = 0;
            for (MentionDataItem mentionDataItem : value) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (i < followPathOriginUserInfos$tools_ai_uikit_df_release.size() && !Intrinsics.LJFF(mentionDataItem, C13LP.LJJJLZIJ(i, followPathOriginUserInfos$tools_ai_uikit_df_release)) && (objLJJJLZIJ = C13LP.LJJJLZIJ(i, followPathOriginUserInfos$tools_ai_uikit_df_release)) != null) {
                    arrayList.add(new Pair(objLJJJLZIJ, mentionDataItem));
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJJ.getValue(this, LLJZ[0]);
    }

    @Override // X.InterfaceC554090LoF
    public C1267504xd getCurrentState() {
        boolean z = this.LLJLIL;
        List list = this.LLJL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        List<MentionDataItem> list2 = this.LLJJLIIIJLLLLLLLZ;
        List<MentionDataItem> value = this.LLJJJJLIIL.getValue();
        if (value == null) {
            value = C13BV.INSTANCE;
        }
        return new C1267504xd(list, list2, value, z, false);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C554170LoN> o2() {
        return AFwS194S0000000_8.get$arr$(67);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C554210LoR> w2() {
        return AFwS194S0000000_8.get$arr$(68);
    }

    public final InterfaceC549370Lgd x5() {
        return (InterfaceC549370Lgd) this.LLJJI.getValue(this, LLJZ[1]);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), this.LLJJIJI, null, new C554110LoH(this, null), 2);
        if (M5()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ.plus(this.LLJJIJI), null, new C554120LoI(this, null), 2);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(this.LLJJIJI)), null, null, new C554060LoC(this, null), 3);
    }

    @Override // X.InterfaceC554090LoF
    public /* bridge */ /* synthetic */ LiveData Ao() {
        return this.LLJJJJ;
    }

    public MutableLiveData<C551290Ljj> C5() {
        return this.LLJJJJJIL;
    }

    public MutableLiveData<C549360Lgc> D5() {
        return this.LLJJJJ;
    }

    @Override // ge.i
    public Function0<C554270LoX> E3() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC554090LoF
    public /* bridge */ /* synthetic */ LiveData Po() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC554090LoF
    public /* bridge */ /* synthetic */ LiveData Yb() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    public MutableLiveData<C551390Ljt> k5() {
        return this.LLJJJIL;
    }

    public MutableLiveData<C551290Ljj> n5() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC554090LoF
    public /* bridge */ /* synthetic */ LiveData nn() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC554090LoF
    public /* bridge */ /* synthetic */ LiveData rg() {
        return this.LLJJJ;
    }

    public final C553990Lo5 t5() {
        return this.LLJILLL;
    }

    public MutableLiveData<List<MentionDataItem>> v5() {
        return this.LLJJJJLIIL;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC554090LoF
    public void Bc(List<MentionDataItem> list) {
        ArrayList arrayList;
        Collection collection;
        List<MentionDataItem> followPathOriginUserInfos$tools_ai_uikit_df_release = this.LLJILLL.getFollowPathOriginUserInfos$tools_ai_uikit_df_release();
        if (followPathOriginUserInfos$tools_ai_uikit_df_release != null && !followPathOriginUserInfos$tools_ai_uikit_df_release.isEmpty()) {
            this.LLJJLIIIJLLLLLLLZ = list;
            LiveData liveData = this.LLJJJJLIIL;
            if (liveData != null && (collection = (Collection) liveData.getValue()) != null) {
                arrayList = new ArrayList(collection);
                int size = followPathOriginUserInfos$tools_ai_uikit_df_release.size();
                if (arrayList.size() > size) {
                    arrayList.removeAll(arrayList.subList(size, arrayList.size()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (MentionDataItem mentionDataItem : list) {
                    MentionDataItem mentionDataItem2 = mentionDataItem;
                    if (!arrayList.contains(mentionDataItem2) && C549450Lgl.LIZIZ(mentionDataItem2)) {
                        arrayList2.add(mentionDataItem);
                    }
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList = null;
            }
            liveData.setValue(arrayList);
            if (this.LLJLILLLLZIIL) {
                i3(new AwS587S0100000_8(this, 57));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H5(X.InterfaceC1364105Vn<? super java.util.List<X.C554260LoW>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C554150LoL
            if (r0 == 0) goto L64
            r4 = r7
            X.0LoL r4 = (X.C554150LoL) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L50
            if (r0 != r1) goto L6f
            X.C155000ia.LIZIZ(r3)
        L23:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L77
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
            r2 = 0
        L37:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            if (r2 < 0) goto L6a
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r0 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r0
            X.0LoW r0 = r6.J6(r0, r2)
            r4.add(r0)
            r2 = r1
            goto L37
        L50:
            X.C155000ia.LIZIZ(r3)
            X.0Lo5 r0 = r6.LLJILLL
            X.0LoB r0 = r0.getRecommendDataSource$tools_ai_uikit_df_release()
            if (r0 == 0) goto L77
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZJ(r4)
            if (r3 != r2) goto L23
            return r2
        L64:
            X.0LoL r4 = new X.0LoL
            r4.<init>(r6, r7)
            goto L12
        L6a:
            X.C1697810uHb.LJIJI()
            throw r5
        L6e:
            return r4
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L77:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554100LoG.H5(X.05Vn):java.lang.Object");
    }

    public final void K6(Function1<? super C554160LoM, C554160LoM> function1) {
        C554160LoM c554160LoM = this.LLJLL;
        if (c554160LoM == null) {
            c554160LoM = new C554160LoM(null, null);
        }
        C554160LoM c554160LoMInvoke = function1.invoke(c554160LoM);
        this.LLJLL = c554160LoMInvoke;
        C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateUiState: ");
        sbLIZ.append(c554160LoMInvoke);
        c547140Ld2.LIZJ("MentionDataTest", C2188811AlT.LIZIZ(sbLIZ));
        i3(new AwS587S0100000_8(c554160LoMInvoke, 59));
    }

    public final List<C554260LoW> P4(Integer num) {
        int iD5;
        if ((!this.LLJILLL.getShowSkeleton$tools_ai_uikit_df_release() || d5() <= 0) && num == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            iD5 = num.intValue();
        } else {
            iD5 = d5();
        }
        for (int i = 0; i < iD5; i++) {
            boolean z = false;
            arrayList.add(new C554260LoW(new MentionDataItem(null, null, null, null, 0L, null, null, 1, Boolean.FALSE, null, null, null, Boolean.FALSE), (Boolean) null, true, z, (Function1) AFwS239S0000000_8.get$arr$(37), (Function1) AFwS239S0000000_8.get$arr$(38), z, 202));
        }
        return arrayList;
    }

    private final void R5(MentionDataItem mentionDataItem, int i) {
        InterfaceC549370Lgd interfaceC549370LgdX5 = x5();
        String str = mentionDataItem.uid;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strLIZJ = C549450Lgl.LIZJ(mentionDataItem);
        C0LRE c0lre = C0LRE.UPON_INPUT;
        int i2 = i + 1;
        interfaceC549370LgdX5.D91(new AIGCCameoDisplayInfo(str, strLIZJ, c0lre, i2));
        InterfaceC549370Lgd interfaceC549370LgdX52 = x5();
        String str3 = mentionDataItem.uid;
        if (str3 != null) {
            str2 = str3;
        }
        interfaceC549370LgdX52.nF1(new AIGCCameoDisplayInfo(str2, C549450Lgl.LIZJ(mentionDataItem), c0lre, i2), Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F4(boolean r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554100LoG.F4(boolean, X.05Vn):java.lang.Object");
    }

    public final C554260LoW J6(MentionDataItem mentionDataItem, int i) {
        String str;
        C555080Lpq textConfig$tools_ai_uikit_df_release;
        List<MentionDataItem> list;
        int size;
        boolean z = true;
        boolean z2 = false;
        if (M5()) {
            List<MentionDataItem> followPathCurrentUserInfos$tools_ai_uikit_df_release = this.LLJILLL.getFollowPathCurrentUserInfos$tools_ai_uikit_df_release();
            if (followPathCurrentUserInfos$tools_ai_uikit_df_release != null) {
                size = followPathCurrentUserInfos$tools_ai_uikit_df_release.size();
            } else {
                size = 0;
            }
            if (i < size) {
                z2 = true;
            }
            return new C554260LoW(mentionDataItem, Boolean.TRUE, false, z2, (Function1) new AwS14S0211000_8(z2, this, mentionDataItem, i, 2), (Function1) new AwS116S0101000_8(this, i, 1), M5(), 64);
        }
        if (!this.LLJLIL && ((list = this.LLJL) == null || !list.contains(mentionDataItem))) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        AwS94S0201000_8 awS94S0201000_8 = new AwS94S0201000_8(mentionDataItem, i, this, 2);
        AwS116S0101000_8 awS116S0101000_8 = new AwS116S0101000_8(this, i, 2);
        Regex regex = C549450Lgl.LIZ;
        if (Intrinsics.LJFF(mentionDataItem.relationType, "MySelf") && (textConfig$tools_ai_uikit_df_release = this.LLJILLL.getTextConfig$tools_ai_uikit_df_release()) != null) {
            str = textConfig$tools_ai_uikit_df_release.LJIIIIZZ;
        } else {
            str = null;
        }
        return new C554260LoW(mentionDataItem, boolValueOf, false, false, (Function1<? super MentionDataItem, Unit>) awS94S0201000_8, (Function1<? super MentionDataItem, Unit>) awS116S0101000_8, str, M5());
    }

    public final void K4(MentionDataItem mentionDataItem, int i) {
        if (this.LLJJJJLIIL.getValue() == null) {
            return;
        }
        this.LLJJJIL.setValue(new C551390Ljt(mentionDataItem, i));
        R5(mentionDataItem, i);
    }

    public final void N5(MentionDataItem mentionDataItem, int i) {
        this.LLJJJJ.setValue(new C549360Lgc(mentionDataItem, i));
        InterfaceC549370Lgd interfaceC549370LgdX5 = x5();
        String str = mentionDataItem.uid;
        if (str == null) {
            str = "";
        }
        interfaceC549370LgdX5.nF1(new AIGCCameoDisplayInfo(str, C549450Lgl.LIZJ(mentionDataItem), C0LRE.UPON_INPUT, i + 1), Boolean.FALSE);
        C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onExpose: ");
        sbLIZ.append(mentionDataItem);
        c547140Ld2.LIZ("MentionListComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void O4(MentionDataItem mentionDataItem, Integer num) {
        this.LLJJJ.setValue(new C551290Ljj(mentionDataItem, false, num, 0, 26));
    }

    @Override // X.InterfaceC554090LoF
    public void R9(boolean z, List<MentionDataItem> list) {
        if (this.LLJLIL && z) {
            return;
        }
        this.LLJLIL = z;
        this.LLJL = list;
        K6(new AwS96S0110000_8(z, (boolean) list, (List<MentionDataItem>) 1));
    }

    public final void S5(MentionDataItem mentionDataItem, int i) {
        InterfaceC549370Lgd interfaceC549370LgdX5 = x5();
        String str = mentionDataItem.uid;
        if (str == null) {
            str = "";
        }
        interfaceC549370LgdX5.Z41(new AIGCCameoDisplayInfo(str, C549450Lgl.LIZJ(mentionDataItem), C0LRE.UPON_INPUT, i + 1));
    }

    public final void U5(MentionDataItem mentionDataItem, int i) {
        InterfaceC549370Lgd interfaceC549370LgdX5 = x5();
        String str = mentionDataItem.uid;
        if (str == null) {
            str = "";
        }
        interfaceC549370LgdX5.aO(new AIGCCameoDisplayInfo(str, C549450Lgl.LIZJ(mentionDataItem), C0LRE.UPON_INPUT, i + 1));
    }

    @Override // X.InterfaceC554090LoF
    public void Y1(InterfaceC549270LgT interfaceC549270LgT, MentionDataItem mentionDataItem) {
        if (mentionDataItem != null) {
            this.LLJLLIL = mentionDataItem;
            K6(new AwS587S0100000_8(mentionDataItem, 63));
            return;
        }
        if (!(interfaceC549270LgT instanceof C549300LgW)) {
            this.LLJLLIL = null;
        }
        MentionDataItem mentionDataItem2 = this.LLJLLIL;
        if (mentionDataItem2 == null || d6(interfaceC549270LgT, this, mentionDataItem2) == null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ.plus(this.LLJJIJI), null, new C554030Lo9(this, interfaceC549270LgT, null), 2);
        }
    }

    @Override // X.InterfaceC554090LoF
    public void r9(int i, MentionDataItem mentionDataItem) {
        Iterable iterableLJIIIZ;
        List<MentionDataItem> value;
        MentionDataItem mentionDataItem2;
        List<MentionDataItem> value2 = this.LLJJJJLIIL.getValue();
        if (value2 != null) {
            iterableLJIIIZ = C1697810uHb.LJIIIZ(value2);
        } else {
            iterableLJIIIZ = C08CX.INSTANCE;
        }
        if (C13LP.LJJJJ(Integer.valueOf(i), iterableLJIIIZ) && (value = this.LLJJJJLIIL.getValue()) != null && (mentionDataItem2 = (MentionDataItem) C13LP.LJJJLZIJ(i, value)) != null) {
            InterfaceC549370Lgd interfaceC549370LgdX5 = x5();
            String str = mentionDataItem2.uid;
            if (str == null) {
                str = "";
            }
            interfaceC549370LgdX5.cE(new AIGCCameoDisplayInfo(str, C549450Lgl.LIZJ(mentionDataItem2), C0LRE.UPON_INPUT, i + 1), Boolean.TRUE);
            List<MentionDataItem> list = this.LLJJL;
            if (list != null && i >= 0) {
                try {
                    if (i < list.size()) {
                        list.remove(i);
                        list.add(i, mentionDataItem);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            Z4();
        }
    }

    @Override // X.InterfaceC554090LoF
    public void t2(List<MentionDataItem> list, boolean z) {
        if (z) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ.plus(this.LLJJIJI), null, new C554040LoA(this, list, null), 2);
        } else {
            K6(new AwS587S0100000_8(list, (List<MentionDataItem>) 62));
        }
    }

    public C554100LoG(C19A3 c19a3, C1DRG c1drg, C553990Lo5 c553990Lo5) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c553990Lo5;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), C19EG.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
        this.LLJJIII = new LinkedHashSet();
        this.LLJJIJI = new C581260Mqy(CoroutineExceptionHandler.LJJLIL, 2);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 102));
        this.LLJJIJIL = new AwS552S0100000_8(this, 103);
        this.LLJJJ = new MutableLiveData<>();
        this.LLJJJIL = new MutableLiveData<>();
        this.LLJJJJ = new MutableLiveData<>();
        this.LLJJJJJIL = new MutableLiveData<>();
        List<MentionDataItem> followPathCurrentUserInfos$tools_ai_uikit_df_release = c553990Lo5.getFollowPathCurrentUserInfos$tools_ai_uikit_df_release();
        this.LLJJJJLIIL = new MutableLiveData<>(followPathCurrentUserInfos$tools_ai_uikit_df_release == null ? C13BV.INSTANCE : followPathCurrentUserInfos$tools_ai_uikit_df_release);
        List<MentionDataItem> followPathCurrentUserInfos$tools_ai_uikit_df_release2 = c553990Lo5.getFollowPathCurrentUserInfos$tools_ai_uikit_df_release();
        this.LLJJL = followPathCurrentUserInfos$tools_ai_uikit_df_release2 != null ? new ArrayList(followPathCurrentUserInfos$tools_ai_uikit_df_release2) : null;
        this.LLJJLIIIJLLLLLLLZ = C13BV.INSTANCE;
        this.LLJLIL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.ss.android.ugc.aweme.creative.model.common.MentionDataItem] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.ss.android.ugc.aweme.creative.model.common.MentionDataItem] */
    public static final MentionDataItem d6(InterfaceC549270LgT interfaceC549270LgT, C554100LoG c554100LoG, MentionDataItem mentionDataItem) {
        C259800zU c259800zU = new C259800zU();
        ?? LIZ = MentionDataItem.LIZ(mentionDataItem, null, "MySelf", null, null, null, 8127);
        c259800zU.element = LIZ;
        if (interfaceC549270LgT instanceof C549300LgW) {
            c259800zU.element = MentionDataItem.LIZ(LIZ, null, null, null, null, Integer.valueOf(((C549300LgW) interfaceC549270LgT).LIZ), 7679);
        }
        C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update progress ");
        sbLIZ.append(c259800zU.element);
        c547140Ld2.LIZJ("MentionDataTest", C2188811AlT.LIZIZ(sbLIZ));
        c554100LoG.K6(new AwS587S0100000_8(c259800zU, (C259800zU<MentionDataItem>) 64));
        return (MentionDataItem) c259800zU.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6(int r6, java.util.List<java.lang.Long> r7, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem>, java.lang.Boolean>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C554130LoJ
            if (r0 == 0) goto L44
            r4 = r8
            X.0LoJ r4 = (X.C554130LoJ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L4a
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L2f
        L24:
            kotlin.Pair r3 = new kotlin.Pair
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            r3.<init>(r0, r1)
        L2f:
            return r3
        L30:
            X.C155000ia.LIZIZ(r3)
            X.0Lo5 r0 = r5.LLJILLL
            X.0LoB r0 = r0.getRecommendDataSource$tools_ai_uikit_df_release()
            if (r0 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZLLL(r6, r7, r4)
            if (r3 != r2) goto L22
            return r2
        L44:
            X.0LoJ r4 = new X.0LoJ
            r4.<init>(r5, r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554100LoG.m6(int, java.util.List, X.05Vn):java.lang.Object");
    }
}
