package X;

import Y.ACListenerS112S0200000_8;
import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.services.optimization.PreloadContextReplaceHelper;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Knl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528310Knl extends AbstractC528270Knh implements InterfaceC528520Ko6 {
    public TextView LLLLLLJ;
    public ViewStub LLLLLLL;
    public String LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public View LLLLLLLZIL;
    public View.OnClickListener LLLLLLZ;
    public ACListenerS143S0100000_8 LLLLLLZZ;
    public C525350Kiz LLLLLZ;
    public C530020KqW LLLLLZIL;
    public boolean LLLLLZL = true;

    @Override // X.AbstractC528270Knh
    public final void LLLZ() {
        this.LLLFZ = true;
        ChooseMediaExtensionKt.LIZJ(this, C528620KoG.LIZ);
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

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (!LLLLLL().LIZ()) {
            LLLZLZ(false, false);
            return;
        }
        LLLZLZ(true, false);
        if (this.LLLLLZ != null && LLLLLL().LIZIZ()) {
            this.LLLLLZ.invoke();
        } else if (C523360Kfm.LIZJ()) {
            LLLLIL(1009);
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
        this.LLLLLLLLLL = false;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLLLLIL(false);
        }
    }

    public final void LLLZZ(View.OnClickListener onClickListener) {
        this.LLLLLLZ = onClickListener;
        View view = this.LLLLLLLZIL;
        if (view != null) {
            C786410Ut5.I7(onClickListener, view);
        }
    }

    @Override // X.AbstractC528270Knh, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C529740Kq4 c529740Kq4 = new C529740Kq4(LifecycleOwnerKt.getLifecycleScope(this), C545820Lau.LIZIZ(this), this.LLJJIJIL, C524710Khx.LIZ(this.LLLIIII), 2, this.LLLI);
        this.LLJJJ = c529740Kq4;
        c529740Kq4.LLJLLIL = this.LLLLLJIL;
        c529740Kq4.LLLLIIIILLL = this.LLLLIILL;
        int i = this.LLLLIIL;
        if (i != -1) {
            c529740Kq4.LLLIL(i, false);
        }
        C529740Kq4 c529740Kq42 = this.LLJJJ;
        c529740Kq42.LLJLILLLLZIIL = this.LLLLJI;
        c529740Kq42.LLLLLL(this.LLLIIII);
        this.LLJJJ.LLJJ = this.LLJJJJ;
        if (LLLLL()) {
            this.LLJJJ.LLLLLLIL(false);
        } else {
            this.LLJJJ.LLLLLLIL(this.LLLLLLLLLL);
        }
        this.LLJJJ.LLLLLLL(this.LLLILZ);
        C529740Kq4 c529740Kq43 = this.LLJJJ;
        c529740Kq43.LLJJIII = this.LLLLIIIILLL;
        C523920Kgg c523920Kgg = this.LLLJL;
        if (c523920Kgg != null) {
            c529740Kq43.LLLLJI(c523920Kgg);
        }
        this.LLJJJ.LLLLLLZZ(this.LLLILZJ);
        this.LLJJJ.LLJILLL = new InterfaceC529910KqL() { // from class: X.0Khd
            @Override // X.InterfaceC529910KqL
            public final void LIZ(View view, TikTokMediaModel tikTokMediaModel) {
                C528310Knl c528310Knl = this.LIZ;
                if (tikTokMediaModel == null) {
                    c528310Knl.getClass();
                    return;
                }
                if (C529980KqS.LIZJ(c528310Knl.LLLIIII.LJFF.chooseSceneMode) && tikTokMediaModel.selectIndex <= -1) {
                    if (c528310Knl.LLJJJ.LLLLII(tikTokMediaModel)) {
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.message(c528310Knl.LLLLJ());
                        creativeToastBuilder.isTuxToastLegacy(true);
                        C1390380mHk.LIZLLL(view, 3014, creativeToastBuilder);
                        return;
                    }
                    int i2 = c528310Knl.LLLLIIL;
                    if (i2 != -1 && i2 == 2) {
                        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                        creativeToastBuilder2.messageRes(2131850070);
                        C1390380mHk.LIZLLL(view, 6014, creativeToastBuilder2);
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("toast_type", "inappropriate_content");
                        c0lab.LJ("enter_from", "album_panel");
                        c0lab.LJ("shoot_way", c528310Knl.LLLIIIIL);
                        c0lab.LJ("creation_id", c528310Knl.LLLIIIL);
                        C20684815ws.LJIILLIIL("album_toast_show", c0lab.LIZ);
                        return;
                    }
                }
                boolean zLIZIZ = C525490KjD.LIZIZ(tikTokMediaModel, false);
                if (C545820Lau.LIZIZ(c528310Knl) == null) {
                    return;
                }
                if (!zLIZIZ) {
                    Context contextLIZIZ = C545820Lau.LIZIZ(c528310Knl);
                    CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                    creativeToastBuilder3.messageRes(R.string.nfi);
                    creativeToastBuilder3.isTuxToastLegacy(true);
                    C1390380mHk.LIZJ(contextLIZIZ, 3047, creativeToastBuilder3);
                    return;
                }
                if (!c528310Knl.LLJJJJ.LJ()) {
                    return;
                }
                if (c528310Knl.LLJJJ.LLJJI) {
                    InterfaceC528410Knv interfaceC528410Knv = c528310Knl.LLJJJJ;
                    if (interfaceC528410Knv == null) {
                        return;
                    }
                    interfaceC528410Knv.LJIIIIZZ(tikTokMediaModel, view);
                    return;
                }
                InterfaceC528410Knv interfaceC528410Knv2 = c528310Knl.LLJJJJ;
                if (interfaceC528410Knv2 == null) {
                    return;
                }
                interfaceC528410Knv2.LIZLLL(tikTokMediaModel);
            }
        };
        if (this.LLLLJ != null) {
            this.LLJJJ.LLLLLLLLLL(this.LLLLJ);
        }
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager((Context) null, this.LLJJIJIL);
        wrapGridLayoutManager.LLIZ = new C580770MqB(wrapGridLayoutManager, this, 3);
        wrapGridLayoutManager.mInitialPrefetchItemCount = this.LLJJIJIL;
        this.LLJJJIL.setHasFixedSize(true);
        this.LLJJJIL.setItemAnimator(null);
        this.LLJJJIL.setLayoutManager(wrapGridLayoutManager);
        this.LLJJJIL.addItemDecoration(new C0OZZ(this.LLJJIJIL, this.LLLL, true));
        C529740Kq4 c529740Kq44 = this.LLJJJ;
        RecyclerView recyclerView = this.LLJJJIL;
        c529740Kq44.LLJL = recyclerView;
        recyclerView.setAdapter(c529740Kq44);
        if (this.LLJZ) {
            this.LLJJJ.LLLLLLLLL(this.LLL);
        }
        C529740Kq4 c529740Kq45 = this.LLJJJ;
        if (c529740Kq45 != null) {
            c529740Kq45.LL = this.LLJLIL;
            c529740Kq45.LLILZ = LLLLJ();
            this.LLJJJ.LLLLLLLZIL(this.LLLIZZ, this.LLLJ);
            C529740Kq4 c529740Kq46 = this.LLJJJ;
            c529740Kq46.LLJJJJ = null;
            c529740Kq46.LLJJJJJIL = this.LLLLLZIL;
            c529740Kq46.LLLIIII = this.LLLLIILLL;
            c529740Kq46.LLLIIIIL = this.LLLLIL;
        }
        if (!TextUtils.isEmpty(this.LLLLLLLLL)) {
            C786410Ut5.LLIL(this.LLJJJJLIIL, 0);
            this.LLJJJJLIIL.setText(this.LLLLLLLLL);
        } else {
            C786410Ut5.LLIL(this.LLJJJJLIIL, 8);
        }
        LLLLZLLIL(1009);
    }

    @Override // X.AbstractC528270Knh, X.AbstractC528890Koh, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLIL(List<TikTokMediaModel> list, boolean z) {
        ViewStub viewStub;
        if (list == null) {
            return;
        }
        LLLLIL(1009);
        if (list.isEmpty()) {
            if (this.LLLLLLJ == null && (viewStub = this.LLLLLLL) != null) {
                C786410Ut5.LJLLLL(viewStub);
                this.LLLLLLJ = (TextView) this.LLJJJJJIL.findViewById(R.id.p_c);
            }
            C786410Ut5.LLIL(this.LLLLLLJ, 0);
            this.LLLLLLJ.setText(2131835752);
            if (this.LLLI) {
                C524780Ki4.LIZ.end(OpenAlbumPanelPerformanceMonitor.INSTANCE, "imageLoaded");
                this.LLLI = false;
            }
        } else {
            TextView textView = this.LLLLLLJ;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZLZ(boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528310Knl.LLLZLZ(boolean, boolean):void");
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLL(int i, int i2, int i3) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLLF.longValue(), "duration");
        c0lab.LIZ(2, "type");
        c0lab.LJ("shoot_way", this.LLLIIIIL);
        c0lab.LIZ(i2, "count");
        C2341909Fp.LIZ("tool_performance_fetch_album_assets", c0lab.LIZ);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int intExtra;
        FrameLayout frameLayout;
        C128Y currentScene = C0CHQ.LIZ().LJIJJ().getCurrentScene(requireActivity());
        if (LLLLLJLJLL()) {
            i = R.layout.cst;
        } else {
            i = R.layout.css;
        }
        if ((currentScene instanceof InterfaceC530790Krl) && C524870KiD.LIZ()) {
            this.LLJJJJJIL = (ViewGroup) C530780Krk.LIZ((InterfaceC530790Krl) currentScene, i, this);
        } else if (C297760Blm.LIZ() && C300110BpZ.LIZ()) {
            Context contextRequireSceneContext = requireSceneContext();
            ViewGroup viewGroup2 = (ViewGroup) C21146717pB.LIZIZ(contextRequireSceneContext, i, viewGroup, false);
            this.LLJJJJJIL = viewGroup2;
            PreloadContextReplaceHelper.replaceAfterInflate(viewGroup2, contextRequireSceneContext, false, viewGroup);
        } else {
            this.LLJJJJJIL = (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        }
        RecyclerView recyclerView = (RecyclerView) this.LLJJJJJIL.findViewById(R.id.kck);
        this.LLJJJIL = recyclerView;
        recyclerView.setRecycledViewPool(C535480KzK.LIZ(this));
        this.LLJJJJLIIL = (TextView) this.LLJJJJJIL.findViewById(R.id.jp1);
        ViewGroup viewGroup3 = this.LLJJJJJIL;
        Activity activity = this.mActivity;
        if (activity != null && activity.getIntent() != null && (intExtra = this.mActivity.getIntent().getIntExtra("key_custom_banner_layout_res", 0)) != 0 && (frameLayout = (FrameLayout) viewGroup3.findViewById(R.id.fbz)) != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(C545820Lau.LIZIZ(this)), intExtra, frameLayout, false);
            frameLayout.addView(viewTd);
            C786410Ut5.LJZ(0, frameLayout);
            View viewFindViewById = viewTd.findViewById(R.id.e1v);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new ACListenerS112S0200000_8(this, frameLayout, 4), viewFindViewById);
            }
        }
        if (LLLLLJLJLL()) {
            this.LLJJLIIIJLLLLLLLZ = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_loading);
            this.LLLLLLL = (ViewStub) this.LLJJJJJIL.findViewById(R.id.view_stub_no_image);
        } else {
            this.LLLLLLJ = (TextView) this.LLJJJJJIL.findViewById(R.id.p_c);
            this.LLJJL = this.LLJJJJJIL.findViewById(R.id.kdb);
        }
        RecyclerView recyclerView2 = this.LLJJJIL;
        if (recyclerView2 instanceof C540760LIs) {
            ((C540760LIs) recyclerView2).setFastScrollEnabled(true);
            ((C540760LIs) this.LLJJJIL).setFastScrollListener(this.LLLLLJLJLL);
        }
        LLLZLZ(LLLLLL().LIZ(), false);
        return this.LLJJJJJIL;
    }
}
