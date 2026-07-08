package X;

import X.C1659640tI2;
import Y.AsS35S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDataManager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS12S0101100_8;
import kotlin.jvm.internal.AwS19S1201000_8;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS48S1300000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Knp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528350Knp extends AbstractC528270Knh implements InterfaceC528520Ko6 {
    public ViewOnClickListenerC20639415pY LLLLLLL;
    public InterfaceC528410Knv LLLLLLLLL;
    public boolean LLLLLLLZIL;
    public boolean LLLLLLZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public boolean LLLLZ;
    public ViewStub LLLLZI;
    public View LLLLZIL;
    public LiveRecordingsDataManager LLLZIIL;
    public final String LLLLLLJ = "ChooseLiveRecordingsFragment";
    public boolean LLLLLLLLLL = true;
    public final long LLLLLLZZ = C566050MHz.LIZIZ();
    public boolean LLLLLZL = true;
    public final int LLLLZLL = ((Number) C273140AnA.LIZ.getValue()).intValue();
    public String LLLLZLLIL = "";
    public String LLLLZLLLI = "";
    public String LLLZ = "";
    public String LLLZI = "";
    public final C01GW LLLZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 241));
    public final C01GW LLLZL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 240));

    @Override // X.AbstractC528270Knh
    public final void LLLZ() {
        this.LLLFZ = true;
        final ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class);
        if (chooseMediaViewModel != null) {
            if (!C13LP.LLIIII(chooseMediaViewModel.LLJILJIL).isEmpty()) {
                LLZL(C13LP.LLIIII(chooseMediaViewModel.LLJILJIL), true, true);
            } else {
                this.LLLLLZIL = true;
                LiveRecordingsDataManager liveRecordingsDataManager = this.LLLZIIL;
                if (liveRecordingsDataManager != null) {
                    liveRecordingsDataManager.LIZIZ(new C533680KwQ(this.LLLZ, this.LLLZI, this.LLLLZLLIL, this.LLLLZLLLI), this.LLLLZLL, true, new InterfaceC528570KoB() { // from class: X.0Knr
                        @Override // X.InterfaceC528570KoB
                        public final void onError(Throwable th) {
                            C528350Knp c528350Knp = this.LIZ;
                            c528350Knp.LLLLLZIL = false;
                            c528350Knp.LLZLI();
                            C537680L6w.LIZ(C533770KwZ.LIZIZ, this.LIZ.LLLLLLJ, "loadInitData onError: ", th);
                        }

                        @Override // X.InterfaceC528570KoB
                        public final void LIZ(List<? extends TikTokMediaModel> list, boolean z) {
                            if (list.isEmpty()) {
                                this.LIZ.LLZLI();
                                C537680L6w.LIZ(C533770KwZ.LIZIZ, this.LIZ.LLLLLLJ, "loadInitData onPartialDataLoaded empty data.", null);
                            } else {
                                chooseMediaViewModel.CR2(list, true);
                            }
                            C528350Knp c528350Knp = this.LIZ;
                            c528350Knp.LLLLLZL = z;
                            c528350Knp.LLLLLZIL = false;
                        }
                    });
                }
            }
        }
        final C528610KoF c528610KoF = C528610KoF.LIZ;
        getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseLiveRecordingsFragment$selectMediaList$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_START) {
                    onStart();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public final void onStart() {
                this.LL.getLifecycle().removeObserver(this);
                BaseJediViewModel.iR2((BaseJediViewModel) C1659640tI2.LIZJ(this.LL.mView).LIZ(ChooseMediaViewModel.class), this.LL, ChooseMediaExtensionKt.LIZ(c528610KoF), new AwS374S0200000_8(this, this.LL, 45));
            }
        });
    }

    @Override // X.AbstractC528270Knh
    public final void LLLZI() {
        ViewStub viewStub;
        if (this.LLJJL != null || (viewStub = this.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        C786410Ut5.LJLLLL(viewStub);
        this.LLJJL = this.LLJJJJJIL.findViewById(R.id.kdb);
    }

    public final boolean LLLZZIL() {
        Bundle bundle = this.mArguments;
        if (bundle == null || !bundle.getBoolean("forbid_init_multi_mode", false)) {
            if (this.LLLLLLLLLL) {
                C533730KwV.LIZ.getClass();
                if (!C533730KwV.LIZJ()) {
                }
                return true;
            }
            C533730KwV c533730KwV = C533730KwV.LIZ;
            int i = this.LLLLJI;
            c533730KwV.getClass();
            if (C533730KwV.LIZLLL(i, false)) {
                return true;
            }
        }
        return false;
    }

    public final void LLZ() {
        if (this.LLLFFI && this.LLLLLZ) {
            List<? extends TikTokMediaModel> listLLIIII = C13LP.LLIIII(((ChooseMediaViewModel) C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class)).LLJILJIL);
            if (listLLIIII.size() != this.LLJJJ.LLJLIL.size()) {
                LLZL(listLLIIII, true, true);
            }
        }
    }

    public final void LLZLI() {
        ViewStub viewStub;
        if (this.LLLLZIL == null && (viewStub = this.LLLLZI) != null) {
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            this.LLLLZIL = viewLJLLLL != null ? viewLJLLLL.findViewById(R.id.p_e) : null;
        }
        C339190DRl.LIZLLL(this.LLLLZIL);
        LLLLIL(2004);
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        LiveRecordingsDataManager liveRecordingsDataManager = this.LLLZIIL;
        if (liveRecordingsDataManager != null) {
            liveRecordingsDataManager.LLIZ = true;
        }
    }

    @Override // X.AbstractC528890Koh, com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // X.AbstractC528270Knh, com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void LLLLIIIILLL(boolean z) {
        super.LLLLIIIILLL(z);
        LLZ();
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLLZIL(boolean z) {
        LLLZZ(false);
    }

    public final void LLLZZ(boolean z) {
        String str;
        this.LLLLLLLLLL = z;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLLLLIL(z);
        }
        this.LLJZ = z;
        if (this.mActivity != null) {
            InterfaceC528880Kog interfaceC528880Kog = (InterfaceC528880Kog) this.LLLZIL.getValue();
            if (z) {
                str = "enter_from_multi";
            } else {
                str = "enter_from_single";
            }
            interfaceC528880Kog.setEnterFrom(str);
        }
    }

    @Override // X.AbstractC528270Knh, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        String strLLLLJ;
        int i;
        BaseBundle baseBundle;
        Resources resources;
        int i2;
        super.onActivityCreated(bundle);
        C529740Kq4 c529740Kq4 = new C529740Kq4(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(getLifecycle()), C545820Lau.LIZIZ(this), this.LLJJIJIL, C524710Khx.LIZ(this.LLLIIII), 6, this.LLLI);
        this.LLJJJ = c529740Kq4;
        c529740Kq4.LLJLLIL = this.LLLLLJIL;
        c529740Kq4.LLLIIL = new C530900Krw();
        c529740Kq4.LLLLIIIILLL = this.LLLLIILL;
        int i3 = this.LLLLIIL;
        if (i3 != -1) {
            c529740Kq4.LLLIL(i3, false);
        }
        C529740Kq4 c529740Kq42 = this.LLJJJ;
        c529740Kq42.LLJLILLLLZIIL = this.LLLLJI;
        c529740Kq42.LLLLLL(this.LLLIIII);
        C529740Kq4 c529740Kq43 = this.LLJJJ;
        c529740Kq43.LLJLL = this.LLLLLIL;
        c529740Kq43.LLJLLL = this.LLLLLILLIL;
        if (LLLLL()) {
            z = false;
        } else {
            z = this.LLJZ;
        }
        c529740Kq43.LLLLLLIL(z);
        C529740Kq4 c529740Kq44 = this.LLJJJ;
        c529740Kq44.LLJJIJI = true;
        c529740Kq44.LLJJ = this.LLLLLLLLL;
        C525190Kij c525190Kij = this.LLLLJ;
        if (c525190Kij != null) {
            this.LLJJJ.LLLLLLLLLL(c525190Kij);
        }
        this.LLJJJ.LLJILLL = new InterfaceC529910KqL() { // from class: X.0Khf
            @Override // X.InterfaceC529910KqL
            public final void LIZ(View view, TikTokMediaModel tikTokMediaModel) {
                boolean z2;
                boolean z3;
                InterfaceC528410Knv interfaceC528410Knv = this.LIZ.LLLLLLLLL;
                if (interfaceC528410Knv != null) {
                    interfaceC528410Knv.LJ();
                }
                C528350Knp c528350Knp = this.LIZ;
                if (c528350Knp.LLJJJ.LLJJI) {
                    if (tikTokMediaModel != null && view != null && !c528350Knp.LLLLLLLZIL) {
                        c528350Knp.LLLLLLLZIL = true;
                        if (c528350Knp.LLLLJI != 15) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c528350Knp.LLLZLZ(true, z3, tikTokMediaModel, -1, new AwS252S0300000_8(c528350Knp, tikTokMediaModel, view, 12));
                        return;
                    }
                    return;
                }
                if (!C525490KjD.LIZIZ(tikTokMediaModel, true) && tikTokMediaModel.onlineVideoUrl == null) {
                    Activity activity = this.LIZ.mActivity;
                    if (activity != null) {
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(2131835666);
                        creativeToastBuilder.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activity, 3047, creativeToastBuilder);
                        return;
                    }
                    return;
                }
                C528350Knp c528350Knp2 = this.LIZ;
                if (c528350Knp2.LLLLJI != 15) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c528350Knp2.LLLZLZ(false, z2, tikTokMediaModel, c528350Knp2.LLLLLIL, new AwS409S0200000_8(c528350Knp2, tikTokMediaModel, 37));
            }
        };
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager((Context) null, this.LLJJIJIL);
        wrapGridLayoutManager.LLIZ = new C580770MqB(this, wrapGridLayoutManager, 0);
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView instanceof C540760LIs) {
            ((C540760LIs) recyclerView).setFastScrollEnabled(true);
            ((C540760LIs) this.LLJJJIL).setFastScrollListener(this.LLLLLJLJLL);
        }
        RecyclerView recyclerView2 = this.LLJJJIL;
        if ((recyclerView2 instanceof C540760LIs) && recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new AsS35S0100000_8(this, 2));
        }
        this.LLJJJIL.setHasFixedSize(true);
        this.LLJJJIL.setItemViewCacheSize(this.LLJJIJIL);
        this.LLJJJIL.setItemAnimator(null);
        this.LLJJJIL.setLayoutManager(wrapGridLayoutManager);
        this.LLJJJIL.addItemDecoration(new C0OZZ(this.LLJJIJIL, this.LLLL, true));
        C529740Kq4 c529740Kq45 = this.LLJJJ;
        RecyclerView recyclerView3 = this.LLJJJIL;
        c529740Kq45.LLJL = recyclerView3;
        recyclerView3.setAdapter(c529740Kq45);
        C529740Kq4 c529740Kq46 = this.LLJJJ;
        c529740Kq46.LL = this.LLJLIL;
        c529740Kq46.LLLLLLL(this.LLLILZ);
        this.LLJJJ.LLILZ = LLLLJ();
        C529740Kq4 c529740Kq47 = this.LLJJJ;
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        if (contextLIZIZ == null || (resources = contextLIZIZ.getResources()) == null || (strLLLLJ = resources.getQuantityString(2131755889, (i2 = this.LLJLL), Integer.valueOf(i2))) == null) {
            strLLLLJ = LLLLJ();
        }
        c529740Kq47.LLILZIL = strLLLLJ;
        this.LLJJJ.LLLLLLLZIL(this.LLLIZZ, this.LLLJ);
        this.LLJJJ.LLJJIII = this.LLLLIIIILLL;
        LLLLZLLIL(2004);
        if (this.LLJZ) {
            this.LLJJJ.LLLLLLLLL(this.LLL);
        }
        if (!this.LLLLLLZ && LLLZZIL() && !C527910Kn7.LIZIZ()) {
            if ((this.LLLLJI == 14 && (baseBundle = (BaseBundle) this.LLLZL.getValue()) != null && baseBundle.getBoolean("Key_replace_item", false)) || (i = this.LLLLJI) == 34 || i == 44 || LLLLL()) {
                return;
            }
            this.LLJJJ.LLLLLLIL(true);
            ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY = this.LLLLLLL;
            if (viewOnClickListenerC20639415pY != null) {
                C786410Ut5.H0(viewOnClickListenerC20639415pY, 8);
            }
            ((InterfaceC528880Kog) this.LLLZIL.getValue()).setEnterFrom("enter_from_multi");
        }
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLIL(List<? extends TikTokMediaModel> list, boolean z) {
        if (list == null) {
            return;
        }
        LLZL(list, z, false);
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLL(int i, int i2, int i3) {
        this.LLLLZ = true;
        C0CNO.LIZ(C15O7.LJI, new AwS12S0101100_8(System.currentTimeMillis(), this, i, 0));
    }

    public final void LLZL(List<? extends TikTokMediaModel> list, boolean z, boolean z2) {
        C533770KwZ c533770KwZ = C533770KwZ.LIZIZ;
        String str = this.LLLLLLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshDataList visible:");
        sbLIZ.append(this.LLLFFI);
        sbLIZ.append(",size=");
        sbLIZ.append(list.size());
        sbLIZ.append(",forceRefresh=");
        sbLIZ.append(z2);
        C201955140j.LIZLLL(c533770KwZ, str, C2188811AlT.LIZIZ(sbLIZ));
        LLLLIL(2004);
        if (!this.LLLFFI) {
            this.LLLLLZ = true;
            return;
        }
        this.LLLLLZ = false;
        if (list.isEmpty()) {
            LLZLI();
        } else {
            C339190DRl.LIZIZ(this.LLLLZIL);
        }
        if (z) {
            this.LLJJJ.setData(list);
        } else {
            this.LLJJJ.LLLLLLZ(list);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        char c;
        int i = 0;
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.dgo, viewGroup, false);
        this.LLJJJJJIL = viewGroup2;
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.j5o);
        this.LLJJJIL = recyclerView;
        recyclerView.setRecycledViewPool(C535480KzK.LIZ(this));
        this.LLJJLIIIJLLLLLLLZ = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_loading);
        this.LLLLZI = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_empty_content);
        if (this.LLLLLLLLLL && !this.LLJZ) {
            c = 0;
        } else {
            c = '\b';
        }
        if (!LLLZZIL() && c == 0) {
            ViewStub viewStub = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_multi_select_view);
            if (viewStub != null) {
                C786410Ut5.LJLLLL(viewStub);
            }
            ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY = (ViewOnClickListenerC20639415pY) this.LLJJJJJIL.findViewById(R.id.opn);
            this.LLLLLLL = viewOnClickListenerC20639415pY;
            if (viewOnClickListenerC20639415pY != null) {
                if (!this.LLLLLLLLLL || this.LLJZ) {
                    i = 8;
                }
                C786410Ut5.H0(viewOnClickListenerC20639415pY, i);
            }
            ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY2 = this.LLLLLLL;
            if (viewOnClickListenerC20639415pY2 != null) {
                viewOnClickListenerC20639415pY2.setOnModeChangeListener(new InterfaceC20639515pZ() { // from class: X.0Knw
                    @Override // X.InterfaceC20639515pZ
                    public final void LIZ(boolean z) {
                        this.LIZ.LLJJJ.LLLLLLIL(z);
                        if (z) {
                            ((InterfaceC528880Kog) this.LIZ.LLLZIL.getValue()).setEnterFrom("enter_from_multi");
                        } else {
                            ((InterfaceC528880Kog) this.LIZ.LLLZIL.getValue()).setEnterFrom("enter_from_single");
                        }
                    }
                });
            }
        }
        return this.LLJJJJJIL;
    }

    public final void LLLZLZ(boolean z, boolean z2, MediaModel mediaModel, int i, Function0<Unit> function0) {
        String str;
        long j;
        boolean z3;
        if (z) {
            str = "preview";
            j = 0;
        } else {
            str = "select";
            j = this.LLLLLLZZ;
        }
        InterfaceC528880Kog interfaceC528880Kog = (InterfaceC528880Kog) this.LLLZIL.getValue();
        long j2 = i;
        if (this.LLLLJI != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) mediaModel;
        interfaceC528880Kog.LIZ(mediaModel, z2, j, j2, z3, false, false, new AwS48S1300000_8(tikTokMediaModel, this, str, function0, 0), new AwS19S1201000_8(tikTokMediaModel, this, str, i, 0));
    }

    public static final void LLZIL(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
            c543670LTx.LIZ.put("scene_name", str2);
            c543670LTx.LIZ.put("errorCode", Integer.valueOf(i2));
            c543670LTx.LIZ.put("type", str);
            c543670LTx.LIZ.put("width", Integer.valueOf(mediaModel.width));
            c543670LTx.LIZ.put("height", Integer.valueOf(mediaModel.height));
            C1637890six.LIZJ("aweme_video_import_duration", jSONObject, c543670LTx.LJ());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
