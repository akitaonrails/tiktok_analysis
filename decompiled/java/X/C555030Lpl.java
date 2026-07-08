package X;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCameoDisplayInfo;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import ge.i;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS116S0101000_8;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS23S0001000_8;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS94S0201000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Lpl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555030Lpl extends i<InterfaceC555090Lpr, C556940Lsq, C555130Lpv, C555100Lps> implements InterfaceC379610EuV, InterfaceC555090Lpr {
    public static final C555120Lpu LLJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C553840Lnq LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public boolean LLJJI;
    public List<MentionDataItem> LLJJIII;
    public final AnonymousClass0502 LLJJIJI;
    public String LLJJIJIIJIL;
    public List<MentionDataItem> LLJJIJIL;
    public MentionDataItem LLJJJ;
    public List<C555070Lpp> LLJJJIL;
    public Set<String> LLJJJJ;
    public final CoroutineExceptionHandler LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final MutableLiveData<C551290Ljj> LLJJL;
    public final MutableLiveData<C549360Lgc> LLJJLIIIJLLLLLLLZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Lpu] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C555030Lpl.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJL = new Object() { // from class: X.0Lpu
        };
    }

    public final InterfaceC549370Lgd H4() {
        return (InterfaceC549370Lgd) this.LLJJ.getValue(this, LLJLIL[0]);
    }

    public final AbstractC329610Cw3<Long> P4() {
        return (AbstractC329610Cw3) this.LLJJJJLIIL.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C555130Lpv> o2() {
        return new AwS552S0100000_8(this, 88);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C555100Lps> w2() {
        return new AwS552S0100000_8(this, 90);
    }

    @Override // X.InterfaceC555090Lpr
    public boolean LJLILLLLZI() {
        return T2().LIZ.LIZ.booleanValue();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ.plus(this.LLJJJJJIL), null, new C555060Lpo(this, null), 2);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        i3(AFwS239S0000000_8.get$arr$(32));
    }

    @Override // X.InterfaceC555090Lpr
    public /* bridge */ /* synthetic */ LiveData Jj() {
        return this.LLJJL;
    }

    public MutableLiveData<C551290Ljj> K4() {
        return this.LLJJL;
    }

    public MutableLiveData<C549360Lgc> O4() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC555090Lpr
    public /* bridge */ /* synthetic */ LiveData Sv() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F4(X.InterfaceC1364105Vn<? super java.util.List<X.C555070Lpp>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C555020Lpk
            if (r0 == 0) goto L8e
            r7 = r9
            X.0Lpk r7 = (X.C555020Lpk) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r6 = r7.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 0
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L7a
            if (r0 != r3) goto L99
            X.C155000ia.LIZIZ(r6)
        L24:
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto La1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r6)
            java.lang.Object r1 = X.C13LP.LJJJLL(r2)
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r1 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r1
            if (r1 == 0) goto L74
            kotlin.text.Regex r0 = X.C549450Lgl.LIZ
            java.lang.String r1 = r1.relationType
            java.lang.String r0 = "MySelf"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != r3) goto L74
            java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem> r0 = r8.LLJJIII
            r2.addAll(r3, r0)
        L46:
            java.util.List r1 = X.C13LP.LJJJJI(r2)
            if (r1 == 0) goto La1
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L5b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r2.next()
            int r1 = r4 + 1
            if (r4 < 0) goto L95
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r0 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r0
            X.0Lpp r0 = r8.k5(r0, r4)
            r3.add(r0)
            r4 = r1
            goto L5b
        L74:
            java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem> r0 = r8.LLJJIII
            r2.addAll(r4, r0)
            goto L46
        L7a:
            X.C155000ia.LIZIZ(r6)
            X.0Lnq r0 = r8.LLJILJILJ
            X.0Lnl r0 = r0.getMentionPanelSearchHandler$tools_ai_uikit_df_release()
            if (r0 == 0) goto La1
            r7.LLILLL = r3
            java.lang.Object r6 = r0.LIZIZ(r7)
            if (r6 != r1) goto L24
            return r1
        L8e:
            X.0Lpk r7 = new X.0Lpk
            r7.<init>(r8, r9)
            goto L12
        L95:
            X.C1697810uHb.LJIJI()
            throw r5
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La1:
            X.13BV r3 = X.C13BV.INSTANCE
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555030Lpl.F4(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC555090Lpr
    public void Mo0(C1279504zZ c1279504zZ) {
        this.LLJJIJIIJIL = c1279504zZ.LIZ;
        this.LLJJIJIL = c1279504zZ.LIZIZ;
        if (this.LLJJI && (!this.LLJJIII.isEmpty())) {
            i3(new AwS587S0100000_8(c1279504zZ, 50));
            P4().getOperator().refresh();
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), this.LLJJJJJIL, null, new C555050Lpn(c1279504zZ, this, null), 2);
        }
    }

    @Override // X.InterfaceC555090Lpr
    public void bH(int i) {
        i3(new AwS23S0001000_8(i, 0));
    }

    public final void n5(MentionDataItem mentionDataItem) {
        ArrayList arrayList;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        List<C555070Lpp> list = this.LLJJJIL;
        Integer numValueOf4 = null;
        if (list != null) {
            arrayList = new ArrayList(list);
            C08FL.LIZ(arrayList, AFwS239S0000000_8.get$arr$(33), new AwS217S0300000_8(this, (C555030Lpl) mentionDataItem, (MentionDataItem) list, (List<C555070Lpp>) 8));
        } else {
            arrayList = null;
        }
        this.LLJJJ = mentionDataItem;
        String str = this.LLJJIJIIJIL;
        if (str == null || str.length() == 0 || this.LLJILJILJ.getEnableMyselfRefreshInSearchState$tools_ai_uikit_df_release()) {
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            List<C555070Lpp> list2 = this.LLJJJIL;
            if (list2 != null) {
                numValueOf2 = Integer.valueOf(list2.size());
            } else {
                numValueOf2 = null;
            }
            if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                i3(new AwS587S0100000_8(arrayList, (List<MentionDataItem>) 52));
                return;
            }
            if (list != null) {
                numValueOf3 = Integer.valueOf(list.size());
            } else {
                numValueOf3 = null;
            }
            List<C555070Lpp> list3 = this.LLJJJIL;
            if (list3 != null) {
                numValueOf4 = Integer.valueOf(list3.size());
            }
            if (Intrinsics.LJFF(numValueOf3, numValueOf4)) {
                return;
            }
            n5(mentionDataItem);
        }
    }

    public final void T4(MentionDataItem mentionDataItem, int i) {
        this.LLJJL.setValue(new C551290Ljj(mentionDataItem, true, Integer.valueOf(i), EnumC551350Ljp.PANEL.getFrom(), 16));
    }

    public final void Z4(MentionDataItem mentionDataItem, int i) {
        this.LLJJLIIIJLLLLLLLZ.setValue(new C549360Lgc(mentionDataItem, i));
        InterfaceC549370Lgd interfaceC549370LgdH4 = H4();
        if (interfaceC549370LgdH4 != null) {
            String str = mentionDataItem.uid;
            if (str == null) {
                str = "";
            }
            interfaceC549370LgdH4.nF1(new AIGCCameoDisplayInfo(str, C549450Lgl.LIZJ(mentionDataItem), C0LRE.AFTER_MENTION, i + 1), Boolean.FALSE);
        }
        C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onExpose: ");
        sbLIZ.append(mentionDataItem);
        c547140Ld2.LIZ("InputMentionPanelComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC555090Lpr
    public void jH(InterfaceC549270LgT interfaceC549270LgT, MentionDataItem mentionDataItem) {
        MentionDataItem mentionDataItem2 = this.LLJJJ;
        boolean z = false;
        if (mentionDataItem2 != null) {
            Regex regex = C549450Lgl.LIZ;
            if (mentionDataItem2.cameoId != null) {
                z = true;
            }
        }
        if (z && ((mentionDataItem2 == null || mentionDataItem2.progress == null) && (interfaceC549270LgT instanceof C549280LgU))) {
            return;
        }
        if (mentionDataItem != null) {
            n5(mentionDataItem);
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ.plus(this.LLJJJJJIL), null, new C553780Lnk(this, interfaceC549270LgT, null), 2);
        }
    }

    public final C555070Lpp k5(MentionDataItem mentionDataItem, int i) {
        return new C555070Lpp(mentionDataItem, this.LLJILJILJ.getUiTextConfig$tools_ai_uikit_df_release(), this.LLJILJILJ.getCircleLoadingViewConfig$tools_ai_uikit_df_release(), new AwS94S0201000_8(mentionDataItem, i, this, 0), new AwS94S0201000_8(mentionDataItem, i, this, 1), new AwS116S0101000_8(this, i, 0));
    }

    @Override // X.InterfaceC555090Lpr
    public void sb2(boolean z, List<MentionDataItem> list) {
        boolean z2;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        this.LLJJIII = list;
        if (list.size() >= this.LLJILJILJ.getMentionLimit$tools_ai_uikit_df_release()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJJI = z2;
        i3(new AwS23S0010000_8(z, 1));
    }

    public C555030Lpl(C19A3 c19a3, C553840Lnq c553840Lnq, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c553840Lnq;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJIII = c13bv;
        int mentionLimit$tools_ai_uikit_df_release = c553840Lnq.getMentionLimit$tools_ai_uikit_df_release();
        C555080Lpq uiTextConfig$tools_ai_uikit_df_release = c553840Lnq.getUiTextConfig$tools_ai_uikit_df_release();
        this.LLJJIJI = new AnonymousClass0502(mentionLimit$tools_ai_uikit_df_release, uiTextConfig$tools_ai_uikit_df_release != null ? uiTextConfig$tools_ai_uikit_df_release.LIZIZ : null);
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = c13bv;
        this.LLJJJJ = new LinkedHashSet();
        this.LLJJJJJIL = new C581260Mqy(CoroutineExceptionHandler.LJJLIL, 1);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 89));
        this.LLJJL = new MutableLiveData<>();
        this.LLJJLIIIJLLLLLLLZ = new MutableLiveData<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d5(java.lang.String r6, long r7, X.InterfaceC1364105Vn<? super X.C443120HZe<? extends java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem>, java.lang.Boolean, java.lang.String>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C555010Lpj
            if (r0 == 0) goto L4d
            r4 = r9
            X.0Lpj r4 = (X.C555010Lpj) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 != r2) goto L53
            X.C155000ia.LIZIZ(r1)
        L22:
            if (r1 != 0) goto L38
        L24:
            X.0Ld2 r3 = X.C546820LcW.LIZIZ
            java.lang.String r1 = "InputMentionPanelComponent"
            java.lang.String r0 = "requestSearchResult: no search handler"
            r2 = 0
            r3.LIZIZ(r1, r0, r2)
            X.0HZe r1 = new X.0HZe
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.<init>(r2, r0, r2)
        L38:
            return r1
        L39:
            X.C155000ia.LIZIZ(r1)
            X.0Lnq r0 = r5.LLJILJILJ
            X.0Lnl r0 = r0.getMentionPanelSearchHandler$tools_ai_uikit_df_release()
            if (r0 == 0) goto L24
            r4.LLILLL = r2
            java.lang.Object r1 = r0.LIZ(r6, r7, r4)
            if (r1 != r3) goto L22
            return r3
        L4d:
            X.0Lpj r4 = new X.0Lpj
            r4.<init>(r5, r9)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555030Lpl.d5(java.lang.String, long, X.05Vn):java.lang.Object");
    }
}
