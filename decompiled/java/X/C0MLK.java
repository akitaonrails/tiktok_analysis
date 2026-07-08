package X;

import android.os.Bundle;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.onthisday.OnThisDayService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import wh6.AbS325S0300000_8;

/* JADX INFO: renamed from: X.0MLK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MLK extends AbstractC2255721DQs<C0MLL> implements InterfaceC379610EuV, C0MLL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), Integer.class, "celebration_type");
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C0MMK.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), List.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 654));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MLK.class, "celebrationType", "getCelebrationType()I", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MLK.class, "forwardConfig", "getForwardConfig()Lcom/ss/android/ugc/aweme/creative/model/forward/ForwardConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MLK.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0MLK.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0MLK.class, "forwardMedias", "getForwardMedias()Ljava/util/List;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0MLK.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJI = 8;
    }

    public C0MLL W1() {
        return this;
    }

    private final int G2() {
        return ((Number) this.LLIZLLLIL.getValue()).intValue();
    }

    private final VideoPublishEditModel H2() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJ[3]);
    }

    private final AbstractC214814194y T2() {
        return (AbstractC214814194y) this.LLIZ.getValue(this, LLJ[5]);
    }

    private final Bundle X1() {
        Bundle bundle = new Bundle();
        int iG2 = G2() - 1;
        bundle.putInt("key_photo_select_min_count", 0);
        bundle.putInt("key_video_select_min_count", 0);
        bundle.putInt("key_photo_select_max_count", iG2);
        bundle.putInt("key_video_select_max_count", iG2);
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext != null) {
            shortVideoContext.enterFrom = "on_this_day_page";
        }
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", getShortVideoContext());
        bundle.putInt("key_default_landing_tab", EnumC538250L9b.ALL.getType());
        bundle.putInt("key_choose_scene", 47);
        return bundle;
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJ[2]);
    }

    private final C0MMK o2() {
        return (C0MMK) this.LLILLL.getValue(this, LLJ[1]);
    }

    private final List<ForwardMedia> w2() {
        return (List) this.LLILZLL.getValue(this, LLJ[4]);
    }

    public final void Iw1() {
        C0ML8 c0ml8 = C0ML8.LIZ;
        CreativeModel creativeModel = H2().creativeModel;
        c0ml8.getClass();
        C0ML8.LIZIZ("click_select_more", creativeModel);
        C0ML8.LIZ("on_this_day_page", H2().creativeModel);
        String str = MvChoosePhotoActivity._pnsPageId;
        C0L0F.LIZJ(T2().requireActivity(), X1(), 37, 12356);
    }

    public final int Z1() {
        return ((Number) this.LLILLJJLI.getValue(this, LLJ[0])).intValue();
    }

    public final void W2() {
        OnThisDayService onThisDayService = (OnThisDayService) ServiceManager.get().getService(OnThisDayService.class);
        C0MLB c0mlbLIZJ = C0MLC.LIZ.LIZJ(Z1());
        Pair pair = new Pair(c0mlbLIZJ.LIZLLL, c0mlbLIZJ.LJ);
        List list = (List) pair.getFirst();
        List list2 = (List) pair.getSecond();
        if (list == null || list.isEmpty()) {
            onThisDayService.startMaterialSelectScene(T2(), w2(), w2(), o2(), getShortVideoContext(), 2, 12356, Z1());
            return;
        }
        Bundle bundle = new Bundle();
        if (list != null) {
            C786410Ut5.LJJIZ(bundle, "all_select_model", (Serializable) list);
        }
        if (list2 != null) {
            C786410Ut5.LJJIZ(bundle, "default_select_model", (Serializable) list2);
        }
        onThisDayService.startMaterialSelectScene(T2(), bundle, o2(), getShortVideoContext(), 2, 12356, Z1());
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0MLK(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final boolean c3(boolean z) {
        InterfaceC567940MPg interfaceC567940MPg;
        if (!z || (interfaceC567940MPg = C0MLA.LIZ) == null) {
            return false;
        }
        return interfaceC567940MPg.LJ(Z1(), w2().size());
    }

    @Override // X.C0MLL
    public void WU1(TuxTextView tuxTextView, boolean z, C568720MSg c568720MSg, Function0<Unit> function0) {
        if (c3(z) && !C0MQ1.LJFF(Z1())) {
            tuxTextView.setText(2131827423);
            C786410Ut5.I7(new AbS325S0300000_8(function0, c568720MSg, this, 0), tuxTextView);
        } else {
            tuxTextView.setText(2131838703);
            C786410Ut5.I7(new AbS325S0300000_8(function0, c568720MSg, this, 1), tuxTextView);
        }
    }
}
