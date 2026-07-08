package X;

import Y.ACListenerS112S0200000_8;
import Y.AObserverS173S0200000_8;
import Y.AObserverS212S0100000_8;
import Y.ARunnableS108S0100000_8;
import Y.AfS177S0100000_8;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.mention.RecommendMentionAndPrompt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0Ljh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551270Ljh extends AbstractC2255721DQs<InterfaceC551450Ljz> implements InterfaceC551450Ljz, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C549480Lgo LL;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final InterfaceC551450Ljz LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC551310Ljl.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC550010Lhf.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC551280Lji.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
    public final C11NJ LLJ = new C11NJ();
    public final MutableLiveData<C548260Leq> LLJI = new MutableLiveData<>();
    public final MutableLiveData<C537550L6j> LLJIJIL = new MutableLiveData<>();
    public final MutableLiveData<C549360Lgc> LLJILJIL = new MutableLiveData<>();
    public final MutableLiveData<C551290Ljj> LLJILJILJ = new MutableLiveData<>();
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 60));
    public C0P0T LLJJ;
    public RecommendMentionAndPrompt LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C551270Ljh.class, "inputMentionListApi", "getInputMentionListApi()Lcom/ss/android/ugc/aweme/aiuikit/api/components/mentionlist/IMentionListUiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C551270Ljh.class, "choosePhotoApi", "getChoosePhotoApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/album/AICreationAlbumApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C551270Ljh.class, "mentionEditUi", "getMentionEditUi()Lcom/ss/android/ugc/aweme/aiuikit/api/components/input/IMentionEditUiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C551270Ljh.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    private final void i3() {
        LifecycleOwnerExtensionsKt.LIZ(this, new ARunnableS108S0100000_8(this, 7));
        O3();
    }

    private final void m3() {
        List<C551340Ljo> ellipsisMenuItems$tools_ai_uikit_df_release = this.LL.getEllipsisMenuItems$tools_ai_uikit_df_release();
        if (!this.LL.getCameoMenuEnable$tools_ai_uikit_df_release().LIZ().booleanValue() || ellipsisMenuItems$tools_ai_uikit_df_release == null || ellipsisMenuItems$tools_ai_uikit_df_release.isEmpty()) {
            View viewZ1 = Z1();
            if (viewZ1 != null) {
                C786410Ut5.LJLLLLLL(8, viewZ1);
                return;
            }
            return;
        }
        View viewZ12 = Z1();
        if (viewZ12 != null) {
            C786410Ut5.I7(new ACListenerS112S0200000_8(this, ellipsisMenuItems$tools_ai_uikit_df_release, 1), viewZ12);
        }
    }

    private final void q3() {
        String strLIZ;
        TextView textView = (TextView) this.LLILLJJLI.findViewById(R.id.qfd);
        if (textView == null) {
            return;
        }
        C550000Lhe<String> mentionListLeftTopText$tools_ai_uikit_df_release = this.LL.getMentionListLeftTopText$tools_ai_uikit_df_release();
        if (mentionListLeftTopText$tools_ai_uikit_df_release == null || (strLIZ = mentionListLeftTopText$tools_ai_uikit_df_release.LIZ()) == null || strLIZ.length() == 0) {
            C337180DJs.LIZ(textView);
        } else {
            C786410Ut5.LJLLLLLL(0, textView);
            textView.setText(strLIZ);
        }
    }

    private final void v3() {
        InterfaceC551380Ljs interfaceC551380LjsLIZ;
        C259800zU c259800zU = new C259800zU();
        LiveData<InterfaceC549270LgT> selfCameoStatusLiveData$tools_ai_uikit_df_release = this.LL.getSelfCameoStatusLiveData$tools_ai_uikit_df_release();
        if (selfCameoStatusLiveData$tools_ai_uikit_df_release != null) {
            selfCameoStatusLiveData$tools_ai_uikit_df_release.observe(this, new AObserverS173S0200000_8(this, c259800zU, 2));
        }
        w2().rg().observe(this, new AObserverS212S0100000_8(this, 6));
        w2().Po().observe(this, new AObserverS212S0100000_8(this, 7));
        w2().nn().observe(this, new AObserverS212S0100000_8(this, 8));
        w2().Ao().observe(this, new AObserverS212S0100000_8(this, 9));
        w2().Yb().observe(this, new AObserverS212S0100000_8(this, 10));
        MutableLiveData mutableLiveDataSv = G2().Sv();
        if (mutableLiveDataSv != null) {
            mutableLiveDataSv.observe(this, new AObserverS212S0100000_8(this, 11));
        }
        MutableLiveData mutableLiveDataJj = G2().Jj();
        if (mutableLiveDataJj != null) {
            mutableLiveDataJj.observe(this, new AObserverS212S0100000_8(this, 12));
        }
        G2().U8().observe(this, new AObserverS212S0100000_8(this, 13));
        C550000Lhe<InterfaceC551380Ljs> restQuotaProvider$tools_ai_uikit_df_release = this.LL.getRestQuotaProvider$tools_ai_uikit_df_release();
        if (restQuotaProvider$tools_ai_uikit_df_release != null && (interfaceC551380LjsLIZ = restQuotaProvider$tools_ai_uikit_df_release.LIZ()) != null) {
            interfaceC551380LjsLIZ.LIZ(new AwS587S0100000_8(this, 38));
        }
        C11RK<List<InputBlock>> c11rkO0 = G2().O0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.LLJ.LIZ(c11rkO0.LJLILLLLZI(300L, timeUnit).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 4)));
        this.LLJ.LIZ(G2().uo().LJLILLLLZI(200L, timeUnit).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 5)));
        G2().i6().observe(this, new AObserverS212S0100000_8(this, 3));
        X1().LLLLIIL().observe(this, new AObserverS212S0100000_8(this, 4));
        LiveData<RecommendMentionAndPrompt> recommendMentionResultLiveData$tools_ai_uikit_df_release = this.LL.getRecommendMentionResultLiveData$tools_ai_uikit_df_release();
        if (recommendMentionResultLiveData$tools_ai_uikit_df_release != null) {
            recommendMentionResultLiveData$tools_ai_uikit_df_release.observe(this, new AObserverS212S0100000_8(this, 5));
        }
    }

    public final InterfaceC551280Lji G2() {
        return (InterfaceC551280Lji) this.LLIZ.getValue(this, LLJJIII[2]);
    }

    public final InterfaceC549370Lgd H2() {
        return (InterfaceC549370Lgd) this.LLIZLLLIL.getValue(this, LLJJIII[3]);
    }

    public final InterfaceC550010Lhf X1() {
        return (InterfaceC550010Lhf) this.LLILZLL.getValue(this, LLJJIII[1]);
    }

    public final View Z1() {
        return (View) this.LLJILLL.getValue();
    }

    public final InterfaceC551310Ljl w2() {
        return (InterfaceC551310Ljl) this.LLILZIL.getValue(this, LLJJIII[0]);
    }

    private final boolean B3() {
        List list = (List) w2().nn().getValue();
        return list != null && (list.isEmpty() ^ true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O3() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C551270Ljh.O3():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        q3();
        m3();
        v3();
        i3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJ.dispose();
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C0P0T c0p0t = this.LLJJ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.InterfaceC551450Ljz
    public /* bridge */ /* synthetic */ LiveData Ij() {
        return this.LLJILJIL;
    }

    public MutableLiveData<C548260Leq> T2() {
        return this.LLJI;
    }

    public InterfaceC551450Ljz W1() {
        return this.LLILZ;
    }

    public MutableLiveData<C551290Ljj> W2() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC551450Ljz
    public /* bridge */ /* synthetic */ LiveData Xa() {
        return this.LLJILJILJ;
    }

    public MutableLiveData<C549360Lgc> c3() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public MutableLiveData<C537550L6j> o2() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC551450Ljz
    public /* bridge */ /* synthetic */ LiveData u5() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC551450Ljz
    public /* bridge */ /* synthetic */ LiveData vs() {
        return this.LLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Iterable] */
    public final void E3(AbstractC551420Ljw abstractC551420Ljw) {
        ?? arrayList;
        List<MentionDataItem> listSingletonList;
        boolean z;
        List listSingletonList2;
        ArrayList arrayList2;
        Object objLJJJLZIJ;
        String mobValue;
        List<MentionDataItem> listLIZ;
        RecommendMentionAndPrompt recommendMentionAndPrompt;
        List<MentionDataItem> list;
        if (abstractC551420Ljw instanceof C551430Ljx) {
            G2().zq((C551430Ljx) abstractC551420Ljw);
            return;
        }
        if (abstractC551420Ljw instanceof C551410Ljv) {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = G2().uk();
            if (B3()) {
                arrayList = (Iterable) w2().nn().getValue();
            } else {
                Iterable iterable = (Iterable) c259800zU.element;
                arrayList = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    MentionDataItem mentionDataItem = ((InputBlock) it2.next()).userItem;
                    if (mentionDataItem != null) {
                        arrayList.add(mentionDataItem);
                    }
                }
            }
            if (arrayList != 0) {
                listSingletonList = C13LP.LJJJJI(arrayList);
            } else {
                listSingletonList = null;
            }
            int i = 0;
            if (!B3() && ((listSingletonList == null || listSingletonList.isEmpty()) && this.LLJJI != null)) {
                z = true;
            } else {
                z = false;
            }
            if (z && (recommendMentionAndPrompt = this.LLJJI) != null && (list = recommendMentionAndPrompt.mentionData) != null) {
                Collection collection = (Collection) c259800zU.element;
                if (collection != null && !collection.isEmpty()) {
                    MentionDataItem mentionDataItem2 = (MentionDataItem) C13LP.LJJJLL(list);
                    if (mentionDataItem2 != null) {
                        listSingletonList = Collections.singletonList(mentionDataItem2);
                        InputBlock.Companion.getClass();
                        InputBlock inputBlockLIZ = InputBlock.LIZ(C547680Ldu.LIZIZ(mentionDataItem2));
                        ?? arrayList3 = new ArrayList((Collection) c259800zU.element);
                        ListProtector.add(arrayList3, 0, InputBlock.LIZ(C547680Ldu.LIZJ(" ")));
                        ListProtector.add(arrayList3, 0, inputBlockLIZ);
                        c259800zU.element = arrayList3;
                    }
                } else {
                    List<InputBlock> list2 = recommendMentionAndPrompt.prompt;
                    if (list2 != null) {
                        ?? arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<InputBlock> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(InputBlock.LIZ(it3.next()));
                        }
                        c259800zU.element = arrayList4;
                    }
                    listSingletonList = list;
                }
            }
            MediaModel value = X1().LLLLIIL().getValue();
            if (value != null && C123100dR.LIZ(value.LJFF())) {
                listSingletonList2 = Collections.singletonList(value);
            } else {
                listSingletonList2 = C13BV.INSTANCE;
            }
            if (listSingletonList != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
                for (MentionDataItem mentionDataItem3 : listSingletonList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        MentionDataItem mentionDataItem4 = mentionDataItem3;
                        if (!B3()) {
                            Regex regex = C549450Lgl.LIZ;
                            if (!Intrinsics.LJFF(mentionDataItem4.isVirtual, Boolean.TRUE)) {
                                mobValue = EnumC551330Ljn.MANUAL.getMobValue();
                            } else {
                                mobValue = EnumC551330Ljn.AUTO_SELECT.getMobValue();
                            }
                        } else {
                            C550000Lhe<List<MentionDataItem>> initFollowPathUserInfos$tools_ai_uikit_df_release = this.LL.getInitFollowPathUserInfos$tools_ai_uikit_df_release();
                            if (initFollowPathUserInfos$tools_ai_uikit_df_release != null && (listLIZ = initFollowPathUserInfos$tools_ai_uikit_df_release.LIZ()) != null) {
                                objLJJJLZIJ = C13LP.LJJJLZIJ(i, listLIZ);
                            } else {
                                objLJJJLZIJ = null;
                            }
                            if (Intrinsics.LJFF(objLJJJLZIJ, mentionDataItem4)) {
                                mobValue = EnumC551330Ljn.KEEP_ORIGINAL.getMobValue();
                            } else {
                                mobValue = EnumC551330Ljn.MANUAL.getMobValue();
                            }
                        }
                        arrayList2.add(mobValue);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                arrayList2 = null;
            }
            this.LLJI.setValue(new C548260Leq((List) c259800zU.element, listSingletonList2, w2().de(), listSingletonList, arrayList2, B3(), ((C551410Ljv) abstractC551420Ljw).LIZ));
            return;
        }
        if (!(abstractC551420Ljw instanceof C551400Lju)) {
            return;
        }
        int i3 = C551360Ljq.LIZ[((C551400Lju) abstractC551420Ljw).LIZ.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                X1().Wb();
                return;
            }
            throw new C1954807lC();
        }
        X1().LLLLIILL();
    }

    public final void H3(C551290Ljj c551290Ljj) {
        C0LRE c0lre;
        EnumC551300Ljk enumC551300Ljk;
        int i = c551290Ljj.LIZLLL;
        if (i != EnumC551350Ljp.MENTION_LIST.getFrom() && i == EnumC551350Ljp.PANEL.getFrom()) {
            c0lre = C0LRE.AFTER_MENTION;
        } else {
            c0lre = C0LRE.UPON_INPUT;
        }
        MentionDataItem mentionDataItem = c551290Ljj.LIZ;
        Regex regex = C549450Lgl.LIZ;
        Integer num = mentionDataItem.permissionResult;
        int iIntValue = 0;
        if (num != null && num.intValue() == 4) {
            enumC551300Ljk = EnumC551300Ljk.NOT_IN_EXP;
        } else {
            Boolean bool = c551290Ljj.LIZ.isVirtual;
            Boolean bool2 = Boolean.TRUE;
            if (!(!Intrinsics.LJFF(bool, bool2))) {
                enumC551300Ljk = EnumC551300Ljk.IS_VIRTUAL_CAMEO;
            } else if (C549450Lgl.LJI(c551290Ljj.LIZ)) {
                enumC551300Ljk = EnumC551300Ljk.GENERATING;
            } else if (C549450Lgl.LIZ(c551290Ljj.LIZ)) {
                enumC551300Ljk = EnumC551300Ljk.NO_CAMEO_CAN_INVITE;
            } else if (C549450Lgl.LJII(c551290Ljj.LIZ)) {
                MentionDataItem mentionDataItem2 = c551290Ljj.LIZ;
                if (C549450Lgl.LJII(mentionDataItem2) && !Intrinsics.LJFF(mentionDataItem2.invited, bool2)) {
                    enumC551300Ljk = EnumC551300Ljk.NO_CAMEO_CAN_INVITE;
                } else {
                    enumC551300Ljk = EnumC551300Ljk.NO_CAMEO_INVITED;
                }
            } else {
                MentionDataItem mentionDataItem3 = c551290Ljj.LIZ;
                if (mentionDataItem3.cameoId == null) {
                    enumC551300Ljk = EnumC551300Ljk.NO_CAMEO_DISABLE_INVITE;
                } else {
                    if (!C549450Lgl.LIZLLL(mentionDataItem3)) {
                        enumC551300Ljk = EnumC551300Ljk.NO_PERMISSION;
                    }
                    G2().ww(c551290Ljj);
                }
            }
        }
        if (enumC551300Ljk != null) {
            MutableLiveData<C537550L6j> mutableLiveData = this.LLJIJIL;
            MentionDataItem mentionDataItem4 = c551290Ljj.LIZ;
            Integer num2 = c551290Ljj.LIZJ;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            mutableLiveData.setValue(new C537550L6j(mentionDataItem4, enumC551300Ljk, c0lre, Integer.valueOf(iIntValue + 1)));
            return;
        }
        G2().ww(c551290Ljj);
    }

    public C551270Ljh(C549480Lgo c549480Lgo, C19A3 c19a3, C1DRG c1drg) {
        this.LL = c549480Lgo;
        this.LLILLJJLI = c19a3;
        this.LLILLL = c1drg;
    }
}
