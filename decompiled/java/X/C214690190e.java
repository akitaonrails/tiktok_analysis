package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.port.in.IAVMixFeedService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS82S1000000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.190e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214690190e extends C193N<InterfaceC856590Xiz, C190T, C10J1> implements InterfaceC856590Xiz {
    public static final C214691190f LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public static final int LLJJI = 0;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final Function0<C190T> LLJ;
    public final C10J1 LLJI;
    public final InterfaceC1738600vLO LLJIJIL;
    public final C10J3 LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.190f] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214690190e.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C214690190e.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
        LLJILJILJ = new Object() { // from class: X.190f
        };
        LLJJ = 8;
    }

    private final void K4() {
        i3(AFwS278S0000000_32.get$arr$(78));
        T4().creativeModel.transientPostPageModel.LJJJ = "";
        T4().creativeModel.transientPostPageModel.LJJJJ = "";
        T4().creativeModel.transientPostPageModel.LJJJI = 0;
        T4().playlist_id = "";
        T4().playlist_name = "";
        T4().creativeModel.transientPostPageModel.LJJJJI.clear();
    }

    public final C19EG P4() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJILLL[1]);
    }

    public final VideoPublishEditModel T4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJILLL[0]);
    }

    private final void d5() {
        if (T4().isPrivate != 4 || !T4().creativeModel.privacySettingModel.isSubscribeOnly) {
            T4().creativeModel.transientPostPageModel.LJJJIL = false;
            i3(AFwS278S0000000_32.get$arr$(80));
            return;
        }
        T4().creativeModel.transientPostPageModel.LJJJIL = true;
        T4().creativeModel.transientPostPageModel.LJJJJ = T4().playlist_name;
        T4().creativeModel.transientPostPageModel.LJJJ = T4().playlist_id;
        i3(new AwS611S0100000_32(this, 119));
    }

    @Override // X.C193O
    public void O3() {
        super.O3();
        ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJ();
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        if (TextUtils.isEmpty(T4().playlist_name) || TextUtils.isEmpty(T4().playlist_id)) {
            return;
        }
        if (T4().isPrivate != 0 || C857680Xkk.LIZIZ(T4())) {
            if (C298660BnE.LIZ()) {
                d5();
                return;
            } else {
                T4().creativeModel.transientPostPageModel.LJJJIL = false;
                i3(AFwS278S0000000_32.get$arr$(79));
                return;
            }
        }
        T4().creativeModel.transientPostPageModel.LJJJIL = true;
        T4().creativeModel.transientPostPageModel.LJJJJ = T4().playlist_name;
        T4().creativeModel.transientPostPageModel.LJJJ = T4().playlist_id;
        i3(new AwS611S0100000_32(this, 118));
    }

    public final void Z4() {
        if (T4().creativeModel.transientPostPageModel.LJJIJIIJI) {
            if (!T4().creativeModel.transientPostPageModel.LJJJIL) {
                C19EG c19egP4 = P4();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(T4().creativeModel.privacySettingModel.isSubscribeOnly ? 2131849242 : 2131850548);
                C1390380mHk.LIZ(c19egP4, 2004, creativeToastBuilder);
                return;
            }
            C20684815ws.LJIILLIIL("click_add_playlist_entrance", C856120XiE.LIZ(T4()).LIZ);
            IAVMixFeedService iAVMixFeedService = (IAVMixFeedService) ServiceManager.get().getService(IAVMixFeedService.class);
            C19EG c19egP42 = P4();
            InterfaceC1169300gXA interfaceC1169300gXA = new InterfaceC1169300gXA() { // from class: X.190d
                @Override // X.InterfaceC1169320gXC
                public final void LIZ(String str, String str2, boolean z) {
                    LIZIZ(0, str, str2, z);
                }

                @Override // X.InterfaceC1169300gXA
                public final void LIZIZ(int i, String str, String str2, boolean z) {
                    String str3;
                    int i2 = 1;
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        this.LIZ.i3(new AwS82S1000000_32(str2, 4));
                        this.LIZ.T4().creativeModel.transientPostPageModel.LJJJJ = str2;
                        this.LIZ.T4().creativeModel.transientPostPageModel.LJJJ = str;
                        if (!C298660BnE.LIZ() || !this.LIZ.T4().creativeModel.privacySettingModel.isSubscribeOnly || i != 0) {
                            i2 = i;
                        }
                        this.LIZ.T4().creativeModel.transientPostPageModel.LJJJI = i2;
                        this.LIZ.T4().playlist_id = this.LIZ.T4().creativeModel.transientPostPageModel.LJJJ;
                        this.LIZ.T4().playlist_name = this.LIZ.T4().creativeModel.transientPostPageModel.LJJJJ;
                        if (z && str != null) {
                            this.LIZ.T4().creativeModel.transientPostPageModel.LJJJJI.add(str);
                        }
                        C214690190e c214690190e = this.LIZ;
                        if (str2 == null) {
                            str2 = "";
                        }
                        c214690190e.k5(str2, i, z);
                        return;
                    }
                    if (SplitVideoServiceImpl.LIZ().showPlayList() && !TextUtils.isEmpty(str2)) {
                        this.LIZ.i3(new AwS82S1000000_32(str2, 5));
                        C854860XgC c854860XgC = this.LIZ.T4().creativeModel.transientPostPageModel;
                        if (Intrinsics.LJFF(str2, this.LIZ.P4().getString(2131840537))) {
                            str3 = "playlist_default_name";
                        } else {
                            str3 = str2;
                        }
                        c854860XgC.LJJJJ = str3;
                        this.LIZ.T4().creativeModel.transientPostPageModel.LJJJ = "";
                        C854860XgC c854860XgC2 = this.LIZ.T4().creativeModel.transientPostPageModel;
                        if (!this.LIZ.T4().creativeModel.privacySettingModel.isSubscribeOnly) {
                            i2 = i;
                        }
                        c854860XgC2.LJJJI = i2;
                        this.LIZ.T4().playlist_id = this.LIZ.T4().creativeModel.transientPostPageModel.LJJJ;
                        this.LIZ.T4().playlist_name = this.LIZ.T4().creativeModel.transientPostPageModel.LJJJJ;
                        if (z && str != null) {
                            this.LIZ.T4().creativeModel.transientPostPageModel.LJJJJI.add(str);
                        }
                        C214690190e c214690190e2 = this.LIZ;
                        if (str2 == null) {
                            str2 = "";
                        }
                        c214690190e2.k5(str2, i, z);
                        return;
                    }
                    this.LIZ.i3(AFwS278S0000000_32.get$arr$(83));
                    this.LIZ.T4().creativeModel.transientPostPageModel.LJJJ = "";
                    this.LIZ.T4().creativeModel.transientPostPageModel.LJJJJ = "";
                    this.LIZ.T4().playlist_id = "";
                    this.LIZ.T4().playlist_name = "";
                }
            };
            String str = T4().creativeModel.transientPostPageModel.LJJJ;
            if (str == null) {
                str = "";
            }
            String str2 = T4().creativeModel.transientPostPageModel.LJJJJ;
            if (str2 == null) {
                str2 = "";
            }
            iAVMixFeedService.showAddToMixInPublishPage(c19egP42, interfaceC1169300gXA, "video_post_page", "post", str, str2);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJ();
    }

    @Override // X.C193O
    public boolean z4() {
        return T4().creativeModel.transientPostPageModel.LJJIJIIJI;
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJIJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJIL;
    }

    public C10J1 O4() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190T> o2() {
        return this.LLJ;
    }

    public C214690190e(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJ = AFwS223S0000000_32.get$arr$(92);
        this.LLJI = new C10J1(new AwS611S0100000_32(this, 117), null);
        this.LLJIJIL = EnumC214771193h.ADD_TO_PLAYLIST;
        this.LLJILJIL = new AnonymousClass1936(AFwS190S0000000_4.get$arr$(1954));
    }

    @Override // X.InterfaceC856590Xiz
    public void setEnable(boolean z) {
        if (z) {
            T4().creativeModel.transientPostPageModel.LJJJIL = true;
            i3(AFwS278S0000000_32.get$arr$(81));
            return;
        }
        T4().creativeModel.transientPostPageModel.LJJJIL = false;
        T4().creativeModel.transientPostPageModel.LJJJ = "";
        T4().creativeModel.transientPostPageModel.LJJJJ = "";
        T4().creativeModel.transientPostPageModel.LJJJI = 0;
        T4().creativeModel.transientPostPageModel.LJJJJI.clear();
        T4().playlist_id = "";
        T4().playlist_name = "";
        i3(AFwS278S0000000_32.get$arr$(82));
    }

    public final void k5(String str, int i, boolean z) {
        if (z || !C298660BnE.LIZ() || !T4().creativeModel.privacySettingModel.isSubscribeOnly || i != 0 || a0.LJJJIL(str)) {
            return;
        }
        C19EG c19egP4 = P4();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(P4().getString(2131839686, str));
        C1390380mHk.LIZ(c19egP4, 0, creativeToastBuilder);
    }
}
