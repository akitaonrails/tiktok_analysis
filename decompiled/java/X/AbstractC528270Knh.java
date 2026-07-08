package X;

import X.C19576911iZ;
import Y.AObjectS284S0200000_8;
import Y.AObjectS310S0200000_8;
import Y.AObjectS383S0100000_8;
import Y.ARunnableS19S0101000_8;
import Y.ARunnableS77S0200000_8;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.MediaPickerConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumUIConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Knh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC528270Knh extends AbstractC528290Knj {
    public C529740Kq4 LLJJJ;
    public RecyclerView LLJJJIL;
    public InterfaceC528410Knv LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public TextView LLJJJJLIIL;
    public View LLJJL;
    public ViewStub LLJJLIIIJLLLLLLLZ;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public int LLJZIJLIL;
    public final List<String> LLL;
    public Long LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public C522190Kdt LLLIIII;
    public String LLLIIIIL;
    public String LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public List<InterfaceC529800KqA> LLLILZ;
    public List<InterfaceC529800KqA> LLLILZJ;
    public InterfaceC529800KqA LLLILZLLLI;
    public int LLLIZZ;
    public int LLLJ;
    public C522110Kdl LLLJIL;
    public C523920Kgg LLLJL;
    public final int LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public int LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public Runnable LLLLIL;
    public boolean LLLLILI;
    public C525190Kij LLLLJ;
    public int LLLLJI;
    public String LLLLL;
    public int LLLLLIL;
    public int LLLLLILLIL;
    public InterfaceC524480Kha LLLLLJIL;
    public MvChoosePhotoScene LLLLLJLJLL;
    public boolean LLLLLL;
    public AlbumUIConfig LLLLLLIL;
    public int LLJJIJIL = 4;
    public boolean LLJL = true;

    public abstract void LLLLLLIL(List<TikTokMediaModel> list, boolean z);

    public abstract void LLLLLLL(int i, int i2, int i3);

    public void LLLLLLLZIL(boolean z) {
    }

    public void LLLZ() {
        this.LLLFZ = true;
    }

    public abstract void LLLZI();

    public final String LLLLJ() {
        String quantityString = "";
        if (!this.LLLII) {
            return "";
        }
        C533730KwV c533730KwV = C533730KwV.LIZ;
        Context context = this.LLJJJJJIL.getContext();
        c533730KwV.getClass();
        String strLJI = C533730KwV.LJI(context);
        AlbumUIConfig albumUIConfig = this.LLLLLLIL;
        if (albumUIConfig != null) {
            Integer num = albumUIConfig.maxLimitToastText;
            return num != null ? getString(num.intValue(), Integer.valueOf(this.LLJLILLLLZIIL)) : "";
        }
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLLIIII.LJFF;
        if (choosePhotoPreviewPageConfig.stickerMultiPhotosMode) {
            return getString(2131830079, Integer.valueOf(this.LLJLILLLLZIIL));
        }
        if (choosePhotoPreviewPageConfig.isCreatePUGCTemplateFrom && C289500BWi.LIZ()) {
            return getString(2131830079, Integer.valueOf(C533730KwV.LJIIIZ()));
        }
        if (C529980KqS.LIZJ(this.LLLLJI)) {
            int i = this.LLJLLIL;
            int i2 = this.LLJLILLLLZIIL;
            if (i == i2) {
                try {
                    Resources resources = getResources();
                    int i3 = this.LLJLILLLLZIIL;
                    quantityString = resources.getQuantityString(2131755758, i3, Integer.valueOf(i3));
                    return quantityString;
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return quantityString;
                }
            }
            if (this.LLJLLL != i2) {
                return getString(2131850085, Integer.valueOf(i2));
            }
            try {
                Resources resources2 = getResources();
                int i4 = this.LLJLILLLLZIIL;
                quantityString = resources2.getQuantityString(2131755759, i4, Integer.valueOf(i4));
                return quantityString;
            } catch (Resources.NotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return quantityString;
            }
        }
        int i5 = this.LLLLJI;
        if (i5 == 47) {
            return C786410Ut5.j4(getString(2131827421), new Object[]{Integer.valueOf(this.LLJLILLLLZIIL)});
        }
        if (i5 == 39) {
            return C786410Ut5.j4(getString(2131826406), new Object[]{Integer.valueOf(C533730KwV.LJII())});
        }
        if (i5 == 64) {
            Bundle bundle = this.mArguments;
            MediaPickerConfig mediaPickerConfig = bundle != null ? (MediaPickerConfig) bundle.getParcelable("key_ame_media_picker_config") : null;
            String str = mediaPickerConfig != null ? mediaPickerConfig.maxCountError : null;
            return (str == null || str.isEmpty()) ? C786410Ut5.j4(getString(2131830079), new Object[]{Integer.valueOf(this.LLJLILLLLZIIL)}) : str;
        }
        if (i5 == 58 || i5 == 68 || i5 == 69) {
            return C786410Ut5.j4(getString(2131830079), new Object[]{Integer.valueOf(this.LLJLILLLLZIIL)});
        }
        int i6 = this.LLJZIJLIL;
        if (i6 == 1 || i6 == 21 || i6 == 10 || i6 == 37 || i5 == 16 || i5 == 57 || i5 == 60 || i5 == 25) {
            return C786410Ut5.j4(getString(2131830079), new Object[]{Integer.valueOf(this.LLJLILLLLZIIL)});
        }
        if (i6 == 20 || i6 == 24 || i5 == 42 || i6 == 29) {
            return C786410Ut5.j4(getString(2131848654), new Object[]{Integer.valueOf(this.LLJLILLLLZIIL)});
        }
        if (i6 == 18) {
            return getResources().getString(2131850310);
        }
        if (i6 != 54) {
            return (i6 == 19 || i6 == 21 || i5 == 45) ? C786410Ut5.j4(getString(2131830079), new Object[]{1}) : i5 == 63 ? C786410Ut5.j4(getString(2131830079), new Object[]{1}) : i5 == 65 ? C786410Ut5.j4(getString(2131830079), new Object[]{1}) : C1444820nhY.LIZIZ ? C533730KwV.LJI(this.LLJJJJJIL.getContext()) : strLJI;
        }
        Resources resources3 = getResources();
        int i7 = this.LLJLILLLLZIIL;
        return resources3.getQuantityString(2131755130, i7, Integer.valueOf(i7));
    }

    public final boolean LLLLL() {
        return this.LLLLJI == 52 && TextUtils.equals(this.LLLLL, "cutout");
    }

    public final void LLLLLIL() {
        View viewFindViewById = this.LLJJJJJIL.findViewById(R.id.tb6);
        View viewFindViewById2 = this.LLJJJJJIL.findViewById(R.id.z1f);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            return;
        }
        if (this.LLLLLL) {
            C426750GoL.LJII(viewFindViewById, null, 36, null, null, true);
        } else {
            HandlerHook.viewPost(viewFindViewById, new ARunnableS77S0200000_8(viewFindViewById, viewFindViewById2, 11));
        }
    }

    public final void LLLLLILLIL() {
        if (this.LLJJJ == null || C2401009ay.LIZ(this.LLLILZ)) {
            return;
        }
        this.LLJJJ.notifyItemRangeChanged(0, this.LLLILZ.size());
    }

    public final boolean LLLLLJLJLL() {
        C522190Kdt c522190Kdt = this.LLLIIII;
        return c522190Kdt != null && c522190Kdt.LJIIJ;
    }

    public final InterfaceC528460Ko0 LLLLLL() {
        return C523750KgP.LJ() ? new C522410KeF(new AObjectS383S0100000_8(this, 2), new AObjectS383S0100000_8(this, 3)) : new C522650Ked();
    }

    public final void LLLLLLJ() {
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLLJ();
        }
    }

    public final void LLLLZLLLI() {
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLLIIL();
        }
    }

    public final void LLLZIIL() {
        C0LJV c0ljv;
        View view;
        RecyclerView recyclerView = this.LLJJJIL;
        if (!(recyclerView instanceof C540760LIs) || (c0ljv = ((C540760LIs) recyclerView).LL) == null || (view = c0ljv.LLJ) == null || view.getVisibility() != 0 || c0ljv.LLJ == null) {
            return;
        }
        c0ljv.getHandler().removeCallbacks(c0ljv.LLJILLL);
        C786410Ut5.LJLLLLLL(8, c0ljv.LLJ);
    }

    public final boolean needDarkMode() {
        return "story".equals(this.LLLIIIIL) || this.LLLIILIL;
    }

    public AbstractC528270Knh() {
        C533730KwV.LIZ.getClass();
        this.LLJLIL = C533730KwV.LJII();
        this.LLJLILLLLZIIL = C533730KwV.LJII();
        this.LLJLL = 0;
        this.LLJLLIL = 0;
        this.LLJLLL = 0;
        this.LLL = new ArrayList();
        this.LLLF = 0L;
        this.LLLFF = false;
        this.LLLFFI = false;
        this.LLLFZ = false;
        this.LLLI = false;
        this.LLLII = true;
        this.LLLIIII = new C522190Kdt();
        this.LLLIIIIL = "";
        this.LLLIIIL = "";
        this.LLLIIL = false;
        this.LLLIILIL = false;
        this.LLLIL = false;
        this.LLLIZZ = C533730KwV.LJII();
        this.LLLJ = C533730KwV.LJII();
        this.LLLJIL = null;
        this.LLLJL = null;
        this.LLLL = C418440Gaw.LIZ(2);
        this.LLLLIIIILLL = false;
        this.LLLLIIL = -1;
        this.LLLLIILL = false;
        this.LLLLIILLL = false;
        this.LLLLIL = null;
        this.LLLLILI = false;
        this.LLLLJ = null;
        this.LLLLJI = -1;
        this.LLLLL = "";
        this.LLLLLIL = -1;
        this.LLLLLILLIL = -1;
        this.LLLLLJIL = null;
        this.LLLLLL = false;
    }

    @Override // X.AbstractC528890Koh, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        this.LLLFZ = false;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene
    public void LLLLIIIILLL(boolean z) {
        C529740Kq4 c529740Kq4;
        C433800Gzi c433800Gzi;
        super.LLLLIIIILLL(z);
        this.LLLFFI = z;
        if (this.LLLFF && !this.LLLFZ) {
            LLLZ();
        }
        if (this.LLLFZ) {
            C529740Kq4 c529740Kq42 = this.LLJJJ;
            boolean z2 = !z;
            c529740Kq42.LLLI = true;
            if (c529740Kq42.LLJL != null) {
                for (int i = c529740Kq42.LLLJIL; i < c529740Kq42.LLJL.getChildCount(); i++) {
                    RecyclerView recyclerView = c529740Kq42.LLJL;
                    C529750Kq5 c529750Kq5 = (C529750Kq5) recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                    if (!c529740Kq42.LLLFFI.contains(c529750Kq5)) {
                        if (z2 && (c433800Gzi = c529750Kq5.LL) != null) {
                            c433800Gzi.setController(null);
                        } else {
                            c529740Kq42.LLLFZ(c529750Kq5, -1);
                        }
                    }
                }
            }
            if (z && (c529740Kq4 = this.LLJJJ) != null && this.LLLLIIL != -1) {
                c529740Kq4.LLLLZ();
                this.LLJJJ.LLLLJ();
            }
        }
    }

    public final void LLLLIILL(List<String> list) {
        this.LLJZ = true;
        ((ArrayList) this.LLL).addAll(list);
    }

    public final void LLLLIL(int i) {
        View view;
        View view2 = this.LLJJL;
        if (view2 != null || this.LLJJLIIIJLLLLLLLZ != null) {
            this.LLJL = false;
            if (view2 != null && view2.getVisibility() == 0 && (view = this.LLJJL) != null) {
                C786410Ut5.LJLLLLLL(8, view);
                C194353111z.LIZ.LIZJ(i, C0MVY.DISMISS, C0LD3.DUAL_BALL, C0LEP.CLOSE_GONE, LLLLLJLJLL());
            }
        }
    }

    public final int LLLLILI(TikTokMediaModel tikTokMediaModel) {
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 == null) {
            return -1;
        }
        for (int i = 0; i < c529740Kq4.LLJLIL.size(); i++) {
            if (TextUtils.equals(((MediaModel) ListProtector.get(c529740Kq4.LLJLIL, i)).id, ((MediaModel) tikTokMediaModel).id)) {
                return i + c529740Kq4.LLLJIL;
            }
        }
        return -1;
    }

    public final void LLLLLLLLL(Boolean bool) {
        this.LLLLLL = bool.booleanValue();
    }

    public final void LLLLLLLLLL(int i) {
        if (this.LLLLIIL != i) {
            this.LLLLIIL = i;
            C529740Kq4 c529740Kq4 = this.LLJJJ;
            if (c529740Kq4 != null) {
                c529740Kq4.LLLIL(i, true);
            }
        }
    }

    public final void LLLLLLZZ(int i) {
        this.LLJZIJLIL = i;
        if (this.LLLF.longValue() != 0) {
            this.LLJJJ.LLILZ = LLLLJ();
        }
    }

    public final void LLLLLZ(C523840KgY c523840KgY) {
        this.LLLILZLLLI = c523840KgY;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLILZLLLI = c523840KgY;
        }
    }

    public final void LLLLZ(int i) {
        this.LLJLILLLLZIIL = i;
        this.LLJLIL = i;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LL = i;
        }
    }

    public final void LLLLZLL(InterfaceC524480Kha interfaceC524480Kha) {
        this.LLLLLJIL = interfaceC524480Kha;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLJLLIL = interfaceC524480Kha;
        }
    }

    public final void LLLLZLLIL(int i) {
        if (this.LLJJL != null || this.LLJJLIIIJLLLLLLLZ != null) {
            C01GW c01gw = C268530Afj.LIZ;
            if ((((Number) c01gw.getValue()).longValue() != -1 && !((Boolean) C536120L0w.LIZ.getValue()).booleanValue()) || LLLLLJLJLL()) {
                this.LLJL = true;
                long jLIZ = C19576911iZ.LIZ();
                if (((Number) c01gw.getValue()).longValue() != -1 && !((Boolean) C536120L0w.LIZ.getValue()).booleanValue()) {
                    jLIZ = ((Number) c01gw.getValue()).longValue();
                }
                Lifecycle lifecycle = getLifecycle();
                final ARunnableS19S0101000_8 aRunnableS19S0101000_8 = new ARunnableS19S0101000_8(i, this, 0);
                if (jLIZ <= 0) {
                    jLIZ = ((Number) C0BA0.LIZ.getValue()).longValue();
                }
                C786410Ut5.LJLIIL(jLIZ, C19576911iZ.LIZLLL, aRunnableS19S0101000_8);
                lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.tools.view.uikit.factory.CreativeLoadingDialogFactory$sendDelayTaskForShowLoading$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        C19576911iZ.LIZLLL.removeCallbacks(aRunnableS19S0101000_8);
                    }
                });
                return;
            }
            LLLZI();
            View view = this.LLJJL;
            if (view == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, view);
            C194353111z.LIZ.LIZJ(i, C0MVY.SHOW, C0LD3.DUAL_BALL, C0LEP.CLOSE_GONE, LLLLLJLJLL());
        }
    }

    public final void LLLZIL(TikTokMediaModel tikTokMediaModel) {
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null && tikTokMediaModel != null) {
            List<String> list = c529740Kq4.LLJJJJ;
            if (list != null) {
                list.remove(((MediaModel) tikTokMediaModel).id);
            }
            c529740Kq4.LLJ.remove(tikTokMediaModel);
            c529740Kq4.LLLLIIL();
        }
    }

    public final void LLLZLL(int i) {
        this.LLJLIL = i;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LL = i;
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLLFF = true;
        if (this.LLLFFI && !this.LLLFZ) {
            LLLZ();
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getParcelable("PREVIEW_CONFIG") != null) {
            this.LLLIIII = (C522190Kdt) this.mArguments.getParcelable("PREVIEW_CONFIG");
        }
    }

    @Override // X.AbstractC528890Koh, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.LLLIIIIL = bundle2.getString("shoot_way", "");
            this.LLLIIIL = bundle2.getString("creation_id", "");
            bundle2.getBoolean("is_ugc_template_from_anchor", false);
            this.LLLIIL = bundle2.getBoolean("is_from_create_template", false);
            bundle2.getBoolean("is_from_pugc_template_tab", false);
            this.LLLIILIL = bundle2.getBoolean("enable_story_layout", false);
            this.LLLIL = bundle2.getBoolean("is_story_standalone", false);
            this.LLLLIIIILLL = bundle2.getBoolean("key_set_show_expand_icon_skip_preview", false);
        }
    }

    public final void LLLLJI(List<TikTokMediaModel> list, C0L90 c0l90) {
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLJJJIL = true;
            C529330KpP c529330KpP = c529740Kq4.LLLIILIL;
            C23250099c.LIZLLL(c529740Kq4.LLLLII, null, null, new C1404405ec(list, new AObjectS284S0200000_8(c529740Kq4, c0l90, 1), c529330KpP, c529740Kq4.LLILZLL, c0l90, new AObjectS310S0200000_8(c529740Kq4, c0l90, 2), null), 3);
        }
    }

    public final void LLLLLJIL(TikTokMediaModel tikTokMediaModel, boolean z) {
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            if (z) {
                if (tikTokMediaModel != null) {
                    if (!c529740Kq4.LLJ.contains(tikTokMediaModel)) {
                        c529740Kq4.LLJ.add(tikTokMediaModel);
                    }
                    List<String> list = c529740Kq4.LLJJJJ;
                    if (list != null && !list.contains(((MediaModel) tikTokMediaModel).id)) {
                        c529740Kq4.LLJJJJ.add(((MediaModel) tikTokMediaModel).id);
                    }
                    c529740Kq4.LLLLIIL();
                    return;
                }
                return;
            }
            if (tikTokMediaModel == null) {
                return;
            }
            List<String> list2 = c529740Kq4.LLJJJJ;
            if (list2 != null) {
                list2.remove(((MediaModel) tikTokMediaModel).id);
            }
            c529740Kq4.LLJ.remove(tikTokMediaModel);
            c529740Kq4.LLLLIIL();
        }
    }

    public void LLLLLLZ(List<InterfaceC529800KqA> list, boolean z) {
        this.LLLILZ = list;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLLLLL(list);
        }
    }

    public final void LLLLLZL(int i, int i2) {
        this.LLJLLIL = i;
        this.LLJLLL = i2;
    }

    public final void LLLLZIL(int i, int i2) {
        this.LLLIZZ = i;
        this.LLLJ = i2;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLLLLLZIL(i, i2);
        }
    }

    @Override // X.AbstractC528890Koh, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        this.LLLF = Long.valueOf(System.currentTimeMillis());
        super.onViewCreated(view, bundle);
    }
}
