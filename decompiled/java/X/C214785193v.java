package X;

import Y.AObjectS249S0100000_32;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.193v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214785193v extends C193N<InterfaceC214733191v, C190T, C10J1> implements InterfaceC214733191v {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final MutableLiveData<Lifecycle.Event> LLJILJIL;
    public C214799194j LLJILJILJ;
    public InterfaceC214787193x LLJILLL;
    public VideoPublishViewModel LLJJ;
    public final List<C193Z> LLJJI;
    public final Function0<C190T> LLJJIII;
    public final C10J1 LLJJIJI;
    public final InterfaceC1738600vLO LLJJIJIIJIL;
    public final C10J3 LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214785193v.class, "publishOptionsManagerApi", "getPublishOptionsManagerApi()Lcom/ss/android/ugc/aweme/shortvideo/component/option/manager/PublishOptionsManagerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C214785193v.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C214785193v.class, "publishViewModel", "getPublishViewModel()Lcom/ss/android/ugc/aweme/shortvideo/ui/viewmodel/VideoPublishViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C214785193v.class, "optionsManagerApiComponent", "getOptionsManagerApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/option/manager/PublishOptionsManagerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C214785193v.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJJIL = 8;
    }

    private final C193M Z4() {
        return (C193M) this.LLJI.getValue(this, LLJJJ[3]);
    }

    private final C193M d5() {
        return (C193M) this.LLIZ.getValue(this, LLJJJ[0]);
    }

    private final VideoPublishViewModel k5() {
        return (VideoPublishViewModel) this.LLJ.getValue(this, LLJJJ[2]);
    }

    private final AbstractC214814194y n5() {
        return (AbstractC214814194y) this.LLJIJIL.getValue(this, LLJJJ[4]);
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        VideoPublishViewModel videoPublishViewModel = new VideoPublishViewModel();
        videoPublishViewModel.LLILZLL = k5().LLILZLL;
        this.LLJJ = videoPublishViewModel;
        v5();
    }

    public final VideoPublishEditModel T4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJJ[1]);
    }

    public final void s80() {
        C19721612Ec c19721612Ec;
        VideoPublishViewModel videoPublishViewModel = this.LLJJ;
        if (videoPublishViewModel == null) {
            return;
        }
        if (this.LLJILLL == null) {
            videoPublishViewModel.LLILZIL = K4();
            C19721512Eb c19721512Eb = C19721512Eb.LIZ;
            boolean z = T4().creativeModel.transientPostPageModel.LJJIIZI;
            VideoPublishEditModel videoPublishEditModelT4 = T4();
            CommerceToolsTcmModel tcmModel = T4().creativeModel.commerceModel.getTcmModel();
            C193M c193mZ4 = Z4();
            Context context = n5().getContext();
            String string = context != null ? context.getString(2131845179) : null;
            Boolean bool = Boolean.TRUE;
            c19721512Eb.getClass();
            this.LLJILLL = C19721512Eb.LIZ(z, videoPublishEditModelT4, videoPublishViewModel, tcmModel, c193mZ4, string, bool);
        }
        if (this.LLJILJILJ == null) {
            InterfaceC214787193x interfaceC214787193x = this.LLJILLL;
            if (!(interfaceC214787193x instanceof C19721612Ec) || (c19721612Ec = (C19721612Ec) interfaceC214787193x) == null) {
                return;
            }
            C18YA c18ya = new C18YA();
            c18ya.LIZ(new AwS576S0100000_32(c19721612Ec, 287));
            C214799194j c214799194j = c18ya.LIZ;
            c214799194j.LLLII = true;
            c214799194j.LLLI = false;
            c214799194j.LLL = 100;
            c18ya.LIZ.LLJZ = new AwS576S0100000_32(this, 288);
            c18ya.LIZ.LLJLLIL = new AwS576S0100000_32(this, 289);
            c18ya.LIZ.LLJLLL = new AwS576S0100000_32(this, 290);
            if (C10BZ.LIZ()) {
                c18ya.LIZ.LLLIZZ = Float.valueOf(C418440Gaw.LIZIZ(26));
                c18ya.LIZ.LLLILZLLLI = Boolean.TRUE;
            }
            this.LLJILJILJ = c18ya.LIZ;
        }
        O4(Lifecycle.Event.ON_CREATE);
        C214799194j c214799194j2 = this.LLJILJILJ;
        if (c214799194j2 != null) {
            c214799194j2.LLLLL(C1447800nmM.LIZIZ(n5()));
        }
    }

    private final void v5() {
        d5().yg2(C193I.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 7));
    }

    public final List<C19223110Ij> K4() {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (!this.LLJJI.isEmpty()) {
            c13dvLIZIZ.addAll(C214781193r.LIZ(this.LLJJI, true));
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJIJI;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJJIJIL;
    }

    public C10J1 P4() {
        return this.LLJJIJI;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190T> o2() {
        return this.LLJJIII;
    }

    public C214785193v(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C193M.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishViewModel.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), C193M.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLJILJIL = new MutableLiveData<>();
        this.LLJJI = new ArrayList();
        this.LLJJIII = AFwS223S0000000_32.get$arr$(93);
        this.LLJJIJI = new C10J1(new AwS611S0100000_32(this, 122), null);
        this.LLJJIJIIJIL = EnumC214771193h.PRIVACY;
        this.LLJJIJIL = AnonymousClass1938.LIZ;
    }

    public final void O4(Lifecycle.Event event) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LLJILJIL.setValue(event);
        } else {
            this.LLJILJIL.postValue(event);
        }
    }

    public final void t5(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        C580270MpN.LIZIZ(videoPublishEditModel, c0lab, false);
        C20684815ws.LJIILLIIL("click_privacy_settings_entrance", c0lab.LIZ);
    }

    @Override // X.InterfaceC214733191v
    public void LLLLZLLLI(LifecycleOwner lifecycleOwner, Function1<? super Lifecycle.Event, Unit> function1) {
        this.LLJILJIL.observe(lifecycleOwner, new C1405270mfl(function1));
    }
}
