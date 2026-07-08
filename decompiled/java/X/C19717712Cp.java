package X;

import Y.ACListenerS162S0100000_28;
import Y.ACListenerS163S0100000_29;
import Y.AObjectS245S0100000_22;
import Y.AObjectS247S0100000_29;
import Y.AObserverS231S0100000_29;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.music.batchreplace.BatchReplaceBannerServiceImpl;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;

/* JADX INFO: renamed from: X.12Cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19717712Cp extends AbstractC1664490tPr<C19718112Ct, C19718212Cu> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C1DRG LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C1664750tQH LLJJJJJIL;
    public final C1664750tQH LLJJJJLIIL;
    public final C1664750tQH LLJJL;
    public final C1664740tQG LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public C197039127h LLJLIL;
    public View LLJLILLLLZIIL;
    public C197039127h LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19717712Cp.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19717712Cp.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19717712Cp.class, "replaceMusicToolbarApi", "getReplaceMusicToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/ReplaceMusicToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19717712Cp.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19717712Cp.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C19717712Cp.class, "chooseMusicConfig", "getChooseMusicConfig()Lcom/ss/android/ugc/aweme/port/in/music/ChooseMusicConfig;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public final InterfaceC1455860nzM LLLLLJLJLL() {
        return (InterfaceC1455860nzM) this.LLJJJJLIIL.getValue(this, LLJLLIL[3]);
    }

    public final VideoPublishEditModel LLLLLL() {
        return (VideoPublishEditModel) this.LLJJL.getValue(this, LLJLLIL[4]);
    }

    public final void LLLLLLJ() {
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.LLJLILLLLZIIL;
        if (view == null) {
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        C1457860o2a c1457860o2a = (C1457860o2a) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLLIL[5]);
        if (c1457860o2a != null) {
            int i = c1457860o2a.LIZLLL;
            View view2 = this.LLJLILLLLZIIL;
            if (view2 == null) {
                view2 = null;
            }
            C426750GoL.LJIIIZ(view2, null, Integer.valueOf(i), null, null, false, 29);
        }
        C786410Ut5.W5(view, layoutParams);
        View view3 = this.LLJLILLLLZIIL;
        if (view3 == null) {
            view3 = null;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        ViewGroup.LayoutParams layoutParams2 = this.mView.getLayoutParams();
        C1462920oAk.LIZJ(view3, iLIZIZ, (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) ? 0 : marginLayoutParams.topMargin);
        if (!C1462920oAk.LIZLLL() || (viewFindViewById = findViewById(R.id.m94)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        marginLayoutParams2.bottomMargin = c1660590tJZ != null ? c1660590tJZ.LIZIZ() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        C786410Ut5.W5(viewFindViewById, marginLayoutParams2);
    }

    public final void LLLLLJIL() {
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
        Intent intent = new Intent(this.mActivity, C19221910Hx.LIZJ());
        intent.addFlags(603979776);
        Activity activityRequireActivity = requireActivity();
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityRequireActivity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activityRequireActivity);
        C2204961BRm.LJIILLIIL(activityRequireActivity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0CJgTfHDFqUhVE4CDSGv++9U5S43w7kT9elJq+mmooZQ=", null));
    }

    public final void LLLLLLL() {
        if (LLLLILI().LIZ.LIZIZ || LLLLILI().LIZ.LIZJ) {
            C197039127h c197039127h = this.LLJLIL;
            (c197039127h != null ? c197039127h : null).setButtonVariant(0);
            return;
        }
        C197039127h c197039127h2 = this.LLJLIL;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        c197039127h2.setButtonVariant(2);
        C197039127h c197039127h3 = this.LLJLIL;
        (c197039127h3 != null ? c197039127h3 : null).setTextColor(-7829368);
    }

    public final void LLLLLLLLL() {
        boolean z = false;
        boolean z2 = LLLLILI().LIZ.LIZLLL;
        C1456890o11 value = LLLLLJLJLL().Yh().getValue();
        if (value != null && value.LIZ) {
            z = true;
        }
        if (z2 && z) {
            C337180DJs.LIZJ(this.LLJL);
        } else {
            C337180DJs.LIZ(this.LLJL);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C0CHQ.LIZ().LJIIJ().LJFF();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJJIL;
    }

    public C19717712Cp(C1DRG c1drg) {
        this.LLJJJIL = c1drg;
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1457600o2A.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1459020o4S.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJJL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(c1drg, C1457860o2a.class, null);
    }

    public final void LLLLLLIL(Function1<? super Integer, Unit> function1) {
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) this.LLJJJIL.LJII(C0ETY.class, null)).Sd(InterfaceC1457600o2A.class, new AwS395S0200000_29(this, function1, 44));
            return;
        }
        InterfaceC1457610o2B interfaceC1457610o2B = (InterfaceC1457610o2B) this.LLJJJJ.getValue(this, LLJLLIL[1]);
        if (interfaceC1457610o2B == null) {
            return;
        }
        interfaceC1457610o2B.In0(this, new AwS608S0100000_29(function1, 416));
    }

    public final void LLLLLLLLLL(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup = this.LLJL;
        if (viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
            C786410Ut5.X5(marginLayoutParams, viewGroup);
            if (C1462920oAk.LIZLLL() && !(LLLLLJLJLL() instanceof InterfaceC572860MdQ)) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                C1462920oAk.LIZJ(viewGroup, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        InterfaceC1446740nke interfaceC1446740nke;
        LiveData<Unit> liveDataTe1;
        super.onViewCreated(view, bundle);
        this.LLJLILLLLZIIL = requireViewById(R.id.bmy);
        this.LLJLIL = (C197039127h) requireViewById(R.id.rj4);
        this.LLJLL = (C197039127h) requireViewById(R.id.af3);
        if (C1453970nwJ.LIZJ() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && C1453970nwJ.LIZIZ(LLLLLL())) {
            C197039127h c197039127h = this.LLJLIL;
            if (c197039127h == null) {
                c197039127h = null;
            }
            c197039127h.setText(2131826858);
            C197039127h c197039127h2 = this.LLJLL;
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, new ACListenerS163S0100000_29(this, 149));
            }
            C197039127h c197039127h3 = this.LLJLL;
            if (c197039127h3 != null) {
                c197039127h3.LJJJJL(new AwS585S0100000_6(this, 216));
            }
        }
        if (C1416310mxZ.LJJJJI(LLLLLL())) {
            C197039127h c197039127h4 = this.LLJLIL;
            if (c197039127h4 == null) {
                c197039127h4 = null;
            }
            c197039127h4.setText(2131839838);
        }
        ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ();
        int iLJII = C1911640zqU.LJII();
        if (LLLLLL().creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene() && iLJII == 1) {
            C197039127h c197039127h5 = this.LLJLIL;
            if (c197039127h5 == null) {
                c197039127h5 = null;
            }
            c197039127h5.setText(2131821943);
        }
        C197039127h c197039127h6 = this.LLJLIL;
        if (c197039127h6 == null) {
            c197039127h6 = null;
        }
        C786410Ut5.LLLLLLJ(c197039127h6, 0);
        if (Intrinsics.LJFF(LLLLLL().getEnterFrom(), "unmute_posts_page")) {
            BatchReplaceBannerServiceImpl.LIZ().setClickPost(false);
            C197039127h c197039127h7 = this.LLJLIL;
            if (c197039127h7 == null) {
                c197039127h7 = null;
            }
            c197039127h7.setText(2131857900);
        }
        View view2 = this.LLJLILLLLZIIL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.11eO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                AbstractC214814194y abstractC214814194yLIZ = C535690Kzf.LIZ(view3);
                if (abstractC214814194yLIZ != null) {
                    abstractC214814194yLIZ.finish();
                }
            }
        }, view2);
        LLLLLL().setMusicVolume(0.0f);
        C197039127h c197039127h8 = this.LLJLIL;
        if (c197039127h8 == null) {
            c197039127h8 = null;
        }
        C786410Ut5.U8(c197039127h8, new ACListenerS162S0100000_28(this, 78));
        if (!C1416310mxZ.LJJJJI(LLLLLL())) {
            LLLLLJLJLL().g().observe(this, new AObjectS245S0100000_22(this, 231));
        }
        LLLLLJLJLL().Yh().observe(this, new AObjectS247S0100000_29(this, 90));
        Integer num = C1450870nrJ.LJI;
        if (num != null) {
            LLLLLLLLLL(num.intValue());
        }
        LLLLLLIL(new AwS608S0100000_29(this, 421));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12Cs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19718112Ct) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 215));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12Cq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19718112Ct) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 417));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.12Cr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19718112Ct) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 418));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.10Hz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C19718112Ct) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 419));
        C1443030nef.LJII().LJI = C857680Xkk.LIZIZ(LLLLLL());
        InterfaceC1455860nzM interfaceC1455860nzMLLLLLJLJLL = LLLLLJLJLL();
        if ((interfaceC1455860nzMLLLLLJLJLL instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMLLLLLJLJLL) != null && (liveDataTe1 = interfaceC1446740nke.Te1()) != null) {
            liveDataTe1.observe(this, new AObserverS231S0100000_29(this, 112));
        }
        LLLLLLIL(new AwS608S0100000_29(this, 420));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.erh, viewGroup, false);
        this.LLJL = viewGroup2;
        return viewGroup2;
    }
}
