package X;

import Y.AObjectS241S0100000_8;
import Y.AObserverS212S0100000_8;
import Y.AUListenerS67S0101000_8;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommercePhotoSearchModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ecom.search.ExtendAlbumScene;
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import ge.i;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LF3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LF3 extends i<InterfaceC535720Kzi, ExtendAlbumScene, C0LF5, C0LFC> implements InterfaceC535720Kzi, InterfaceC379610EuV {
    public static final C0LF6 LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final int LLJLLL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC535720Kzi LLJJ;
    public MutableLiveData<List<MediaModel>> LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final C01GW LLJJJ;
    public final ChooseMediaViewModel LLJJJIL;
    public final Function0<C0LF5> LLJJJJ;
    public final Function0<C0LFC> LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final Bundle LLJLIL;
    public boolean LLJLILLLLZIIL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0LF6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0LF3.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0LF3.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C0LF3.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(C0LF3.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(C0LF3.class, "dockBarApiComponent", "getDockBarApiComponent()Lcom/ss/android/ugc/gamora/recorder/control/DockBarApiComponent;", 0), new C2217381BqS(C0LF3.class, "lighteningControlProgressApiComponent", "getLighteningControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0)};
        LLJLL = new Object() { // from class: X.0LF6
        };
        LLJLLL = 8;
    }

    private final AbstractBinderC539700LEq O4() {
        return (AbstractBinderC539700LEq) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLJJIJIL.getValue(this, LLJLLIL[3]);
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJJIJIIJIL.getValue(this, LLJLLIL[2]);
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLJJIII.getValue(this, LLJLLIL[0]);
    }

    private final void n5() {
        BaseJediViewModel.iR2(this.LLJJJIL, this, new C2217381BqS() { // from class: X.0KxJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
            }
        }, new AwS587S0100000_8(this, 152));
        BaseJediViewModel.iR2(this.LLJJJIL, this, new C2217381BqS() { // from class: X.0KzO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getClosingChooseMediaPageState();
            }
        }, new AwS587S0100000_8(this, 153));
    }

    public final InterfaceC1648870t0f K4() {
        return (InterfaceC1648870t0f) this.LLJJJJLIIL.getValue(this, LLJLLIL[4]);
    }

    public final void N3() throws JSONException {
        C0LF7 c0lf7 = C0LF7.LIZ;
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = this.LLJLIL;
        jSONObject.put("search_entrance", bundle != null ? bundle.getString("search_entrance") : null);
        Bundle bundle2 = this.LLJLIL;
        jSONObject.put("source_page_name", bundle2 != null ? bundle2.getString("source_page_name") : null);
        Bundle bundle3 = this.LLJLIL;
        jSONObject.put("enter_from", bundle3 != null ? bundle3.getString("enter_from") : null);
        Bundle bundle4 = this.LLJLIL;
        jSONObject.put("enter_from_second", bundle4 != null ? bundle4.getString("enter_from_second") : null);
        Bundle bundle5 = this.LLJLIL;
        jSONObject.put("photo_search_module", bundle5 != null ? bundle5.getString("photo_search_module") : null);
        jSONObject.put("slide_direction", "upward");
        c0lf7.getClass();
        C20684815ws.LJIJ("album_extend_slide", jSONObject);
        getCameraApiComponent().c11(new InterfaceC2183551Acz() { // from class: X.0LF4
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                C531110KsH c531110KsH = C531110KsH.LIZ;
                C0LF3 c0lf3 = this.LIZ;
                C19A3 c19a3 = c0lf3.LLJILJILJ;
                ShortVideoContext shortVideoContext = c0lf3.getShortVideoContext();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Bundle bundle6 = new Bundle();
                bundle6.putBoolean("is_from_extend_album", true);
                C531110KsH.LIZJ(c531110KsH, c19a3, shortVideoContext, true, jCurrentTimeMillis, bundle6, false, null, false, false, false, false, 2016);
            }
        });
        n5();
    }

    public final InterfaceC1630630sXF P4() {
        return (InterfaceC1630630sXF) this.LLJJL.getValue(this, LLJLLIL[5]);
    }

    public final ExtendAlbumScene T4() {
        return (ExtendAlbumScene) this.LLJJJ.getValue();
    }

    public final void Z4() throws JSONException {
        C0LF7 c0lf7 = C0LF7.LIZ;
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = this.LLJLIL;
        jSONObject.put("search_entrance", bundle != null ? bundle.getString("search_entrance") : null);
        Bundle bundle2 = this.LLJLIL;
        jSONObject.put("source_page_name", bundle2 != null ? bundle2.getString("source_page_name") : null);
        Bundle bundle3 = this.LLJLIL;
        jSONObject.put("enter_from", bundle3 != null ? bundle3.getString("enter_from") : null);
        Bundle bundle4 = this.LLJLIL;
        jSONObject.put("enter_from_second", bundle4 != null ? bundle4.getString("enter_from_second") : null);
        Bundle bundle5 = this.LLJLIL;
        jSONObject.put("photo_search_module", bundle5 != null ? bundle5.getString("photo_search_module") : null);
        jSONObject.put("slide_direction", "downward");
        c0lf7.getClass();
        C20684815ws.LJIJ("album_extend_slide", jSONObject);
        hide();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJIJI.getValue(this, LLJLLIL[1]);
    }

    public final void hJ() {
        if (this.LLJLILLLLZIIL) {
            C0LFH.LIZ(new AwS552S0100000_8(this, 269));
            this.LLJLILLLLZIIL = false;
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        if (this.LLJLILLLLZIIL) {
            C0LFH.LIZ(new AwS552S0100000_8(this, 268));
            this.LLJLILLLLZIIL = false;
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        if (this.LLJLILLLLZIIL) {
            return;
        }
        C0LFH.LIZ(new AwS552S0100000_8(this, 272));
        this.LLJLILLLLZIIL = true;
    }

    private final void Xi() {
        Vd2().observe(this, new AObserverS212S0100000_8(this, 39));
        getPlanCUIApiComponent().QU1().LIZ(this, new AObjectS241S0100000_8(this, 17));
        BaseJediViewModel.iR2(this.LLJJJIL, this, new C2217381BqS() { // from class: X.0KxI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
            }
        }, new AwS587S0100000_8(this, 151));
    }

    public final void F4() {
        getCameraApiComponent().IU1().LIZLLL(EnumC545560LaU.EXTEND_ALBUM_SCENE, C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_ALBUM_OPEN_EXTEND_ALBUM, EnumC1641610sox.PAGE_INVISIBLE));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    public final void openCameraByAlbumClosed() {
        getCameraApiComponent().IU1().LIZIZ(EnumC545560LaU.EXTEND_ALBUM_SCENE, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_BY_ALBUM_CLOSE_EXTEND_ALBUM, null), Boolean.FALSE);
    }

    public InterfaceC535720Kzi H4() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC535720Kzi
    public MutableLiveData<List<MediaModel>> Vd2() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
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
    public Function0<C0LF5> o2() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0LFC> w2() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC535720Kzi
    public void EF2(MutableLiveData<List<MediaModel>> mutableLiveData) {
        this.LLJJI = mutableLiveData;
    }

    public final void d5(MediaModel mediaModel) throws JSONException {
        String string;
        String string2;
        String string3;
        String string4;
        if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            C19EG activity = getActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131835933);
            creativeToastBuilder.isTuxToast(true);
            C1390380mHk.LIZ(activity, 6001, creativeToastBuilder);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("return_ecommerce_photo_search_model", new ReturnEcommercePhotoSearchModel(PageType.ALBUM, C2471909mP.LJIJ(mediaModel), C533930Kwp.LIZJ(), C533930Kwp.LIZLLL("android.permission.CAMERA"), "choose_album_extend_panel"));
        C0LF7 c0lf7 = C0LF7.LIZ;
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = this.LLJLIL;
        String string5 = null;
        if (bundle != null) {
            string = bundle.getString("search_entrance");
        } else {
            string = null;
        }
        jSONObject.put("search_entrance", string);
        Bundle bundle2 = this.LLJLIL;
        if (bundle2 != null) {
            string2 = bundle2.getString("source_page_name");
        } else {
            string2 = null;
        }
        jSONObject.put("source_page_name", string2);
        Bundle bundle3 = this.LLJLIL;
        if (bundle3 != null) {
            string3 = bundle3.getString("enter_from");
        } else {
            string3 = null;
        }
        jSONObject.put("enter_from", string3);
        Bundle bundle4 = this.LLJLIL;
        if (bundle4 != null) {
            string4 = bundle4.getString("enter_from_second");
        } else {
            string4 = null;
        }
        jSONObject.put("enter_from_second", string4);
        Bundle bundle5 = this.LLJLIL;
        if (bundle5 != null) {
            string5 = bundle5.getString("photo_search_module");
        }
        jSONObject.put("photo_search_module", string5);
        jSONObject.put("album_type", "extend_panel");
        jSONObject.put("click_type", "click");
        c0lf7.getClass();
        C20684815ws.LJIJ("album_photo_click", jSONObject);
        AbstractBinderC539700LEq abstractBinderC539700LEqO4 = O4();
        if (abstractBinderC539700LEqO4 != null) {
            abstractBinderC539700LEqO4.LIZJ(getActivity(), 0, intent);
        }
        hJ();
    }

    public final void k5(View view) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams2.bottomMargin;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.bottomMargin = i - this.LLJL;
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public C0LF3(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = this;
        this.LLJJI = new MutableLiveData<>();
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 270));
        this.LLJJJIL = (ChooseMediaViewModel) C1659640tI2.LIZIZ(getActivity(), c19a3).LIZ(ChooseMediaViewModel.class);
        this.LLJJJJ = new AwS552S0100000_8(this, 266);
        this.LLJJJJJIL = new AwS552S0100000_8(this, 271);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648870t0f.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 267));
        this.LLJLIL = C786410Ut5.g3(getActivity().getIntent(), "extraParams");
    }

    public final void t5(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2 = 0;
        ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(0, i);
        valueAnimatorOfInt.setDuration(300L);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i2 = marginLayoutParams.bottomMargin;
        }
        valueAnimatorOfInt.addUpdateListener(new AUListenerS67S0101000_8(i2, view, 1));
        valueAnimatorOfInt.start();
    }
}
