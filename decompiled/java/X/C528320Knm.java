package X;

import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.LifecycleKt;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.optimization.PreloadContextReplaceHelper;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS19S1201000_8;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS48S1300000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Knm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528320Knm extends AbstractC528270Knh implements InterfaceC528520Ko6 {
    public TextView LLLLLLJ;
    public ViewStub LLLLLLL;
    public Drawable LLLLLLLLL;
    public C523090KfL LLLLLLZ;
    public boolean LLLLLLZZ;
    public ACListenerS143S0100000_8 LLLLLZIL;
    public ACListenerS143S0100000_8 LLLLLZL;
    public C525340Kiy LLLLZ;
    public ArrayList<String> LLLLZI;
    public List<? extends TikTokMediaModel> LLLLZIL;
    public C530020KqW LLLLZLL;
    public Map<String, LivePhotoInfo> LLLLZLLIL;
    public C522290Ke3 LLLLZLLLI;
    public C524890KiF LLLZIIL;
    public boolean LLLLLLLLLL = true;
    public boolean LLLLLLLZIL = true;
    public final long LLLLLZ = C566050MHz.LIZIZ();
    public final C01GW LLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 282));
    public final C01GW LLLZI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 279));
    public final C528360Knq LLLZIL = new C528360Knq(new AwS552S0100000_8(this, 280));
    public boolean LLLZL = true;
    public final C580740Mq8 LLLZLL = new C580740Mq8(this, 1);

    @Override // X.AbstractC528270Knh
    public final void LLLZ() {
        this.LLLFZ = true;
        ChooseMediaExtensionKt.LIZJ(this, C528590KoD.LIZ);
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

    public final void LLZL() {
        List<InterfaceC529800KqA> list = this.LLLILZ;
        C522290Ke3 c522290Ke3 = this.LLLLZLLLI;
        int iIndexOf = list.indexOf(c522290Ke3 != null ? c522290Ke3.LIZ() : null);
        if (iIndexOf != -1) {
            ListProtector.remove(this.LLLILZ, iIndexOf);
            this.LLJJJ.LLLLLLL(this.LLLILZ);
            this.LLJJJ.notifyItemRemoved(iIndexOf);
            return;
        }
        List<InterfaceC529800KqA> list2 = this.LLLILZJ;
        C522290Ke3 c522290Ke32 = this.LLLLZLLLI;
        int iIndexOf2 = list2.indexOf(c522290Ke32 != null ? c522290Ke32.LIZ() : null);
        if (iIndexOf2 != -1) {
            ListProtector.remove(this.LLLILZJ, iIndexOf2);
            this.LLJJJ.LLLLLLZZ(this.LLLILZJ);
            this.LLJJJ.notifyItemRemoved(this.LLLILZ.size() + ((this.LLJJJ.getItemCount() - this.LLLILZ.size()) - this.LLLILZJ.size()) + iIndexOf2);
        }
    }

    public final void LLZLI() {
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLJJJ.clear();
            List<String> list = c529740Kq4.LLJJJJ;
            if (list != null && !list.isEmpty()) {
                c529740Kq4.LLJJJJ.clear();
            }
            c529740Kq4.LLJJL = null;
            for (TikTokMediaModel tikTokMediaModel : c529740Kq4.LLJ) {
                tikTokMediaModel.selectionScenario = null;
                InterfaceC528410Knv interfaceC528410Knv = c529740Kq4.LLJJ;
                if (interfaceC528410Knv != null) {
                    interfaceC528410Knv.LJI(false, tikTokMediaModel, C0L90.ALBUM);
                    c529740Kq4.LLJJ.LJIIJ(c529740Kq4.LLJ, C0L9I.THUMBNAIL, tikTokMediaModel);
                }
            }
            c529740Kq4.LLLLL();
            if (C523650KgF.LIZ()) {
                return;
            }
            c529740Kq4.LLJLIL.clear();
        }
    }

    @Override // X.AbstractC528270Knh, X.AbstractC528890Koh, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        Context contextLIZIZ;
        super.onDestroyView();
        if (!C298320Bmg.LIZ() || (contextLIZIZ = C545820Lau.LIZIZ(this)) == null) {
            return;
        }
        LocalBroadcastManager.LIZ(contextLIZIZ).LIZLLL(this.LLLZLL);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (!LLLLLL().LIZ()) {
            LLLZLZ(false, false);
            return;
        }
        LLLZLZ(true, false);
        if (!LLLLLL().LIZIZ()) {
            if (C523360Kfm.LIZJ()) {
                LLLLIL(1007);
            }
        } else {
            C525340Kiy c525340Kiy = this.LLLLZ;
            if (c525340Kiy != null) {
                c525340Kiy.invoke();
            }
        }
    }

    @Override // X.AbstractC528270Knh, com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void LLLLIIIILLL(boolean z) {
        super.LLLLIIIILLL(z);
        if (z) {
            LLLZLZ(LLLLLL().LIZ(), true);
        }
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLLZIL(boolean z) {
        String str;
        this.LLLLLLLLLL = z;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLLLLIL(z);
        }
        if (this.mActivity != null) {
            InterfaceC528880Kog interfaceC528880Kog = (InterfaceC528880Kog) this.LLLZ.getValue();
            if (z) {
                str = "enter_from_multi";
            } else {
                str = "enter_from_single";
            }
            interfaceC528880Kog.setEnterFrom(str);
        }
    }

    public final Drawable LLLZZIL(Context context) {
        Drawable drawableLIZ = this.LLLLLLLLL;
        if (drawableLIZ == null) {
            if (needDarkMode()) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.rd;
                drawableLIZ = c0hti.LIZ(new ContextThemeWrapper(C545820Lau.LIZIZ(this), R.style.y0));
            } else {
                C0HTI c0hti2 = new C0HTI();
                c0hti2.LIZ = R.drawable.rd;
                drawableLIZ = c0hti2.LIZ(context);
            }
            this.LLLLLLLLL = drawableLIZ;
        }
        return drawableLIZ;
    }

    public final void LLZLL(C522290Ke3 c522290Ke3) {
        this.LLLLZLLLI = c522290Ke3;
    }

    public final void LLZLLIL(TikTokMediaModel tikTokMediaModel) {
        if (this.LLLF.longValue() == 0 || this.LLLLILI) {
            return;
        }
        this.LLLZIL.LJ(tikTokMediaModel, "ai_content");
    }

    public final void LLZLLLL(TikTokMediaModel tikTokMediaModel) {
        if (this.LLLF.longValue() == 0 || this.LLLLILI) {
            return;
        }
        this.LLLZIL.LJ(tikTokMediaModel, "live_recordings");
    }

    @Override // X.AbstractC528270Knh, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C529740Kq4 c529740Kq4 = new C529740Kq4(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(getLifecycle()), C545820Lau.LIZIZ(this), this.LLJJIJIL, C524710Khx.LIZ(this.LLLIIII), 3, this.LLLI);
        this.LLJJJ = c529740Kq4;
        c529740Kq4.LLJLLIL = this.LLLLLJIL;
        c529740Kq4.LLLLIIIILLL = this.LLLLIILL;
        int i = this.LLLLIIL;
        if (i != -1) {
            c529740Kq4.LLLIL(i, false);
        }
        C529740Kq4 c529740Kq42 = this.LLJJJ;
        c529740Kq42.LLJLILLLLZIIL = this.LLLLJI;
        c529740Kq42.LLJLL = this.LLLLLIL;
        c529740Kq42.LLJLLL = this.LLLLLILLIL;
        c529740Kq42.LLLLLL(this.LLLIIII);
        if (LLLLL()) {
            this.LLJJJ.LLLLLLIL(false);
        } else {
            this.LLJJJ.LLLLLLIL(this.LLLLLLLLLL);
        }
        C529740Kq4 c529740Kq43 = this.LLJJJ;
        c529740Kq43.LLJJIJI = true;
        c529740Kq43.LLJJ = this.LLLLLLZ;
        c529740Kq43.LLLLLLL(this.LLLILZ);
        this.LLJJJ.LLLLLLZZ(this.LLLILZJ);
        C529740Kq4 c529740Kq44 = this.LLJJJ;
        c529740Kq44.LLLILZLLLI = this.LLLILZLLLI;
        c529740Kq44.LLJJIII = this.LLLLIIIILLL;
        C525190Kij c525190Kij = this.LLLLJ;
        if (c525190Kij != null) {
            this.LLJJJ.LLLLLLLLLL(c525190Kij);
        }
        C529740Kq4 c529740Kq45 = this.LLJJJ;
        c529740Kq45.LLJJJJ = this.LLLLZI;
        c529740Kq45.LLJJL = this.LLLLZIL;
        c529740Kq45.LLJJJJJIL = this.LLLLZLL;
        c529740Kq45.LLJJJJLIIL = this.LLLLZLLIL;
        c529740Kq45.LLLLJI(new InterfaceC529920KqM() { // from class: X.0KgD
            @Override // X.InterfaceC529920KqM
            public final void LIZ(int i2, View view, TikTokMediaModel tikTokMediaModel) {
                C522290Ke3 c522290Ke3;
                String string;
                boolean z = C13LP.LJJJLZIJ(i2, this.LIZ.LLLILZ) instanceof C523620KgC;
                C528320Knm c528320Knm = this.LIZ;
                boolean z2 = C13LP.LJJJLZIJ(i2 - (c528320Knm.LLJJJ.getItemCount() - this.LIZ.LLLILZJ.size()), c528320Knm.LLLILZJ) instanceof C523620KgC;
                if (z || z2) {
                    C528320Knm c528320Knm2 = this.LIZ;
                    if (!c528320Knm2.LLLIIL && (c522290Ke3 = c528320Knm2.LLLLZLLLI) != null) {
                        Bundle bundle2 = c528320Knm2.mArguments;
                        String str = "";
                        if (bundle2 != null && (string = bundle2.getString("creation_id", "")) != null) {
                            str = string;
                        }
                        c522290Ke3.LIZ().onDisplayed(view, this.LIZ.needDarkMode());
                        if (!C522290Ke3.LIZIZ) {
                            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                            if (((Boolean) C286750BLt.LIZ.getValue()).booleanValue()) {
                                if (!C523640KgE.LIZIZ && C523640KgE.LIZ) {
                                    C523640KgE.LIZ(C530010KqV.LIZ() / ((long) C538540LAe.LLJJJIL), curUserId);
                                }
                            } else {
                                C312590CNd value = C312590CNd.LIZIZ.getValue();
                                int i3 = C522290Ke3.LIZJ;
                                Keva keva = value.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ten_min_plus_video_displayed_base_key_");
                                sbLIZ.append(curUserId);
                                sbLIZ.append('_');
                                sbLIZ.append(i3);
                                keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                            }
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("creation_id", str);
                            C20684815ws.LJIILLIIL("longer_upload_banner_show", c2344009Gk.LIZ);
                            C522290Ke3.LIZIZ = true;
                        }
                    }
                }
            }
        });
        C523920Kgg c523920Kgg = this.LLLJL;
        if (c523920Kgg != null) {
            this.LLJJJ.LLLLJI(c523920Kgg);
        }
        this.LLJJJ.LLJILLL = new InterfaceC529910KqL() { // from class: X.0KhZ
            /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
            @Override // X.InterfaceC529910KqL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r14, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r15) {
                /*
                    Method dump skipped, instruction units count: 512
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C524470KhZ.LIZ(android.view.View, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel):void");
            }
        };
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(C545820Lau.LIZIZ(this), this.LLJJIJIL);
        wrapGridLayoutManager.LLIZ = new C580770MqB(this, wrapGridLayoutManager, 2);
        this.LLJJJIL.setHasFixedSize(true);
        this.LLJJJIL.setItemViewCacheSize(this.LLJJIJIL);
        this.LLJJJIL.setItemAnimator(null);
        this.LLJJJIL.setLayoutManager(wrapGridLayoutManager);
        this.LLJJJIL.addItemDecoration(new C0OZZ(this.LLJJIJIL, this.LLLL, true));
        C529740Kq4 c529740Kq46 = this.LLJJJ;
        RecyclerView recyclerView = this.LLJJJIL;
        c529740Kq46.LLJL = recyclerView;
        recyclerView.setAdapter(c529740Kq46);
        C529740Kq4 c529740Kq47 = this.LLJJJ;
        c529740Kq47.LL = this.LLJLIL;
        c529740Kq47.LLILZ = LLLLJ();
        this.LLJJJ.LLLLLLLZIL(this.LLLIZZ, this.LLLJ);
        C529740Kq4 c529740Kq48 = this.LLJJJ;
        c529740Kq48.LLLIIII = this.LLLLIILLL;
        c529740Kq48.LLLIIIIL = this.LLLLIL;
        LLLLZLLIL(1007);
        if (this.LLJZ) {
            this.LLJJJ.LLLLLLLLL(this.LLL);
        }
        this.LLJJJIL.getRecycledViewPool().clear();
        C528360Knq c528360Knq = this.LLLZIL;
        c528360Knq.getClass();
        LiveRecordingsService.LIZ.getClass();
        LiveRecordingsService liveRecordingsServiceLIZ = C522560KeU.LIZ();
        if (liveRecordingsServiceLIZ != null && liveRecordingsServiceLIZ.isEnable()) {
            BaseJediViewModel.iR2((BaseJediViewModel) C1659640tI2.LIZJ(c528360Knq.LIZIZ).LIZ(ChooseMediaViewModel.class), this, new C2217381BqS() { // from class: X.0KfC
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getShowLiveRecordingsFloatingGuide();
                }
            }, new AwS587S0100000_8(c528360Knq, 188));
        }
        if (C301610Brz.LIZ()) {
            BaseJediViewModel.iR2((BaseJediViewModel) C1659640tI2.LIZJ(c528360Knq.LIZIZ).LIZ(ChooseMediaViewModel.class), this, new C2217381BqS() { // from class: X.0KiH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getShowAiContentGuideView();
                }
            }, new AwS587S0100000_8(c528360Knq, 193));
        }
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLIL(List<? extends TikTokMediaModel> list, boolean z) {
        InterfaceC529800KqA interfaceC529800KqA;
        if (list == null) {
            return;
        }
        LLLLIL(1007);
        if (list.isEmpty()) {
            TextView textView = null;
            if (this.LLLLLLJ == null) {
                ViewStub viewStub = this.LLLLLLL;
                if (viewStub == null) {
                    viewStub = null;
                }
                C786410Ut5.LJLLLL(viewStub);
                this.LLLLLLJ = (TextView) this.LLJJJJJIL.findViewById(R.id.p_c);
            }
            C524890KiF c524890KiF = this.LLLZIIL;
            if ((c524890KiF == null || !c524890KiF.enable()) && ((interfaceC529800KqA = this.LLLILZLLLI) == null || !interfaceC529800KqA.enable())) {
                TextView textView2 = this.LLLLLLJ;
                if (textView2 == null) {
                    textView2 = null;
                }
                C786410Ut5.LLIL(textView2, 0);
                TextView textView3 = this.LLLLLLJ;
                if (textView3 != null) {
                    textView = textView3;
                }
                textView.setText(2131829004);
            }
            if (this.LLLI) {
                C524780Ki4.LIZ.end(OpenAlbumPanelPerformanceMonitor.INSTANCE, "imageLoaded");
                this.LLLI = false;
            }
            LLZL();
        } else {
            TextView textView4 = this.LLLLLLJ;
            if (textView4 != null) {
                C786410Ut5.LLIL(textView4, 8);
            }
        }
        if (z) {
            this.LLJJJ.setData(list);
        } else {
            this.LLJJJ.LLLLLLZ(list);
        }
        if (C522610KeZ.LIZ()) {
            int i = this.LLLLJI;
            if (i == 3 || i == 4) {
                C0DVE.LIZ(list, C528500Ko4.LIZ, this.LLJJJIL);
            }
        }
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLZ(List<? extends InterfaceC529800KqA> list, boolean z) {
        C524890KiF c524890KiF;
        Object next;
        String string;
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            c524890KiF = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C524890KiF) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC529800KqA interfaceC529800KqA = (InterfaceC529800KqA) next;
        if (interfaceC529800KqA instanceof C524890KiF) {
            c524890KiF = (C524890KiF) interfaceC529800KqA;
        }
        this.LLLZIIL = c524890KiF;
        boolean z2 = C522290Ke3.LIZIZ;
        Bundle bundle = this.mArguments;
        String str = "";
        if (bundle != null && (string = bundle.getString("shoot_way", "")) != null) {
            str = string;
        }
        if (!C312580CNc.LIZ(str, z)) {
            super.LLLLLLZ(list, z);
            return;
        }
        super.LLLLLLZ(new ArrayList(list), z);
        C522290Ke3 c522290Ke3 = this.LLLLZLLLI;
        if (c522290Ke3 == null) {
            return;
        }
        c522290Ke3.LIZ().setOnClose(new AwS552S0100000_8(this, 281));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZLZ(boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528320Knm.LLLZLZ(boolean, boolean):void");
    }

    public final boolean LLZIL(View view, MediaModel mediaModel) {
        if (mediaModel == null || view == null) {
            return false;
        }
        if (mediaModel.LJIILJJIL()) {
            if (this.LLLLLLZZ) {
                return false;
            }
            this.LLLLLLZZ = true;
            LLLZZ(true, mediaModel, -1, new AwS252S0300000_8(this, (TikTokMediaModel) mediaModel, view, 15));
            return true;
        }
        ChooseMediaExtensionKt.LIZIZ(null, mediaModel);
        C523090KfL c523090KfL = this.LLLLLLZ;
        if (c523090KfL != null && (mediaModel instanceof TikTokMediaModel)) {
            c523090KfL.LJIIIIZZ((TikTokMediaModel) mediaModel, view);
            this.LLLLLLZZ = false;
        }
        return true;
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLL(int i, int i2, int i3) {
        C0CNO.LIZ(C15O7.LJI, new C528380Kns(this, System.currentTimeMillis() - this.LLLF.longValue(), i, i2));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewGroup viewGroup2;
        boolean z;
        Context contextLIZIZ;
        Drawable drawableLIZ;
        Drawable drawableLIZ2;
        boolean zLJI = MethodIDManager.LJI(202412);
        C128Y currentScene = C0CHQ.LIZ().LJIJJ().getCurrentScene(requireActivity());
        if (LLLLLJLJLL()) {
            i = R.layout.i8p;
        } else {
            i = R.layout.i8o;
        }
        if (C524870KiD.LIZ() && (currentScene instanceof InterfaceC530790Krl)) {
            viewGroup2 = (ViewGroup) C530780Krk.LIZ((InterfaceC530790Krl) currentScene, i, this);
        } else if (C297760Blm.LIZ() && C300110BpZ.LIZ()) {
            Context contextRequireSceneContext = requireSceneContext();
            viewGroup2 = (ViewGroup) C21146717pB.LIZIZ(contextRequireSceneContext, i, viewGroup, false);
            PreloadContextReplaceHelper.replaceAfterInflate(viewGroup2, contextRequireSceneContext, false, viewGroup);
        } else {
            viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        }
        this.LLJJJJJIL = viewGroup2;
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.j5o);
        this.LLJJJIL = recyclerView;
        recyclerView.setRecycledViewPool(C535480KzK.LIZ(this));
        C528360Knq c528360Knq = this.LLLZIL;
        Context sceneContext = getSceneContext();
        ViewGroup viewGroup3 = this.LLJJJJJIL;
        RecyclerView recyclerView2 = this.LLJJJIL;
        c528360Knq.getClass();
        LiveRecordingsService.LIZ.getClass();
        LiveRecordingsService liveRecordingsServiceLIZ = C522560KeU.LIZ();
        if (liveRecordingsServiceLIZ != null && liveRecordingsServiceLIZ.isEnable()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c528360Knq.LJI = viewGroup3.findViewById(R.id.n4w);
            c528360Knq.LJII = viewGroup3.findViewById(R.id.n51);
            c528360Knq.LJIIIIZZ = (C1322110kVd) viewGroup3.findViewById(R.id.p78);
            View view = c528360Knq.LJI;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS143S0100000_8(viewGroup3, 61), view);
            }
            View view2 = c528360Knq.LJII;
            if (view2 != null) {
                if (sceneContext != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                    c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                    c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
                    drawableLIZ2 = c384050F3z.LIZ(sceneContext);
                } else {
                    drawableLIZ2 = null;
                }
                view2.setBackground(drawableLIZ2);
            }
        }
        if (C301610Brz.LIZ()) {
            c528360Knq.LIZLLL = viewGroup3.findViewById(R.id.anh);
            c528360Knq.LJ = viewGroup3.findViewById(R.id.white_bg_container);
            c528360Knq.LJFF = (C1322110kVd) viewGroup3.findViewById(R.id.p5o);
            View view3 = c528360Knq.LIZLLL;
            if (view3 != null) {
                C786410Ut5.I7(new ACListenerS143S0100000_8(viewGroup3, 63), view3);
            }
            View view4 = c528360Knq.LJ;
            if (view4 != null) {
                if (sceneContext != null) {
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1d);
                    c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                    c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                    c384050F3z2.LJFF = Integer.valueOf(R.attr.a03);
                    drawableLIZ = c384050F3z2.LIZ(sceneContext);
                } else {
                    drawableLIZ = null;
                }
                view4.setBackground(drawableLIZ);
            }
        }
        c528360Knq.LIZIZ = viewGroup3;
        c528360Knq.LIZJ = recyclerView2;
        if (LLLLLJLJLL()) {
            this.LLJJLIIIJLLLLLLLZ = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_loading);
            this.LLLLLLL = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_empty_content);
        } else {
            this.LLLLLLJ = (TextView) this.LLJJJJJIL.findViewById(R.id.zpi);
            this.LLJJL = this.LLJJJJJIL.findViewById(R.id.video_loading);
        }
        ((InterfaceC528880Kog) this.LLLZ.getValue()).setEnterFrom("enter_from_multi");
        RecyclerView recyclerView3 = this.LLJJJIL;
        if (recyclerView3 instanceof C540760LIs) {
            ((C540760LIs) recyclerView3).setFastScrollEnabled(true);
            ((C540760LIs) this.LLJJJIL).setFastScrollListener(this.LLLLLJLJLL);
        }
        LLLZLZ(LLLLLL().LIZ(), false);
        if (C298320Bmg.LIZ() && (contextLIZIZ = C545820Lau.LIZIZ(this)) != null) {
            LocalBroadcastManager.LIZ(contextLIZIZ).LIZIZ(this.LLLZLL, new IntentFilter("action-auto-test-select-media"));
        }
        ViewGroup viewGroup4 = this.LLJJJJJIL;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return viewGroup4;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(202412);
        ViewGroup viewGroupOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return viewGroupOnCreateView;
    }

    public final void LLLZZ(boolean z, MediaModel mediaModel, int i, Function0<Unit> function0) {
        String str;
        long j;
        boolean z2;
        if (z) {
            str = "preview";
            j = 0;
        } else {
            str = "select";
            j = this.LLLLLZ;
        }
        InterfaceC528880Kog interfaceC528880Kog = (InterfaceC528880Kog) this.LLLZ.getValue();
        long j2 = i;
        if (this.LLLLJI != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        interfaceC528880Kog.LIZ(mediaModel, true, j, j2, z2, false, false, new AwS48S1300000_8(mediaModel, (MediaModel) this, (C528320Knm) str, (String) function0, (Function0<Unit>) 2), new AwS19S1201000_8(mediaModel, this, str, i, 2));
    }

    public static final void LLZ(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
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
