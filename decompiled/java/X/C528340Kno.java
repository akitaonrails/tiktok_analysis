package X;

import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Kno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528340Kno extends AbstractC528270Knh implements InterfaceC528520Ko6 {
    public TextView LLLLLLJ;
    public ViewStub LLLLLLL;
    public boolean LLLLLLLLL;
    public View LLLLLLLLLL;
    public View.OnClickListener LLLLLLLZIL;
    public ACListenerS143S0100000_8 LLLLLLZ;
    public C525360Kj0 LLLLLLZZ;
    public boolean LLLLLZ = true;

    @Override // X.AbstractC528270Knh
    public final void LLLZ() {
        this.LLLFZ = true;
        ChooseMediaExtensionKt.LIZJ(this, C528600KoE.LIZ);
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
        if (this.LLLLLLZZ == null || !LLLLLL().LIZIZ()) {
            if (C523360Kfm.LIZJ()) {
                LLLLIL(1009);
            }
        } else {
            C525360Kj0 c525360Kj0 = this.LLLLLLZZ;
            if (c525360Kj0 != null) {
                c525360Kj0.invoke();
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
        this.LLLLLLLLL = false;
        C529740Kq4 c529740Kq4 = this.LLJJJ;
        if (c529740Kq4 != null) {
            c529740Kq4.LLLLLLIL(false);
        }
    }

    public final void LLLZZ(View.OnClickListener onClickListener) {
        this.LLLLLLLZIL = onClickListener;
        View view = this.LLLLLLLLLL;
        if (view != null) {
            C786410Ut5.I7(onClickListener, view);
        }
    }

    @Override // X.AbstractC528270Knh, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C529740Kq4 c529740Kq4 = new C529740Kq4(LifecycleOwnerKt.getLifecycleScope(this), C545820Lau.LIZIZ(this), this.LLJJIJIL, C524710Khx.LIZ(this.LLLIIII), 4, this.LLLI);
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
        C529740Kq4 c529740Kq43 = this.LLJJJ;
        c529740Kq43.LLJJ = this.LLJJJJ;
        c529740Kq43.LLLLLLIL(this.LLLLLLLLL);
        this.LLJJJ.LLLLLLL(this.LLLILZ);
        C529740Kq4 c529740Kq44 = this.LLJJJ;
        c529740Kq44.LLJJIII = this.LLLLIIIILLL;
        C523920Kgg c523920Kgg = this.LLLJL;
        if (c523920Kgg != null) {
            c529740Kq44.LLLLJI(c523920Kgg);
        }
        this.LLJJJ.LLLLLLZZ(this.LLLILZJ);
        C525190Kij c525190Kij = this.LLLLJ;
        if (c525190Kij != null) {
            this.LLJJJ.LLLLLLLLLL(c525190Kij);
        }
        this.LLJJJ.LLJILLL = new InterfaceC529910KqL() { // from class: X.0Khc
            @Override // X.InterfaceC529910KqL
            public final void LIZ(View view, TikTokMediaModel tikTokMediaModel) {
                C528340Kno c528340Kno = this.LIZ;
                if (tikTokMediaModel == null) {
                    c528340Kno.getClass();
                    return;
                }
                if (C529980KqS.LIZJ(c528340Kno.LLLIIII.LJFF.chooseSceneMode) && tikTokMediaModel.selectIndex <= -1) {
                    if (c528340Kno.LLJJJ.LLLLII(tikTokMediaModel)) {
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.message(c528340Kno.LLLLJ());
                        creativeToastBuilder.isTuxToastLegacy(true);
                        C1390380mHk.LIZLLL(view, 3014, creativeToastBuilder);
                        return;
                    }
                    int i2 = c528340Kno.LLLLIIL;
                    if (i2 != -1 && i2 == 2) {
                        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                        creativeToastBuilder2.messageRes(2131850070);
                        C1390380mHk.LIZLLL(view, 6014, creativeToastBuilder2);
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("toast_type", "inappropriate_content");
                        c0lab.LJ("enter_from", "album_panel");
                        c0lab.LJ("shoot_way", c528340Kno.LLLIIIIL);
                        c0lab.LJ("creation_id", c528340Kno.LLLIIIL);
                        C20684815ws.LJIILLIIL("album_toast_show", c0lab.LIZ);
                        return;
                    }
                }
                InterfaceC524480Kha interfaceC524480Kha = c528340Kno.LLLLLJIL;
                if (interfaceC524480Kha != null && !interfaceC524480Kha.LIZIZ(tikTokMediaModel)) {
                    c528340Kno.LLLLLJIL.LIZ(c528340Kno.requireActivity(), tikTokMediaModel);
                    return;
                }
                boolean zLIZIZ = C525490KjD.LIZIZ(tikTokMediaModel, false);
                if (C545820Lau.LIZIZ(c528340Kno) == null) {
                    return;
                }
                if (!zLIZIZ) {
                    Context contextLIZIZ = C545820Lau.LIZIZ(c528340Kno);
                    CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                    creativeToastBuilder3.messageRes(R.string.nfi);
                    creativeToastBuilder3.isTuxToastLegacy(true);
                    C1390380mHk.LIZJ(contextLIZIZ, 3047, creativeToastBuilder3);
                    return;
                }
                if (!c528340Kno.LLJJJJ.LJ()) {
                    return;
                }
                if (c528340Kno.LLJJJ.LLJJI) {
                    InterfaceC528410Knv interfaceC528410Knv = c528340Kno.LLJJJJ;
                    if (interfaceC528410Knv == null) {
                        return;
                    }
                    interfaceC528410Knv.LJIIIIZZ(tikTokMediaModel, view);
                    return;
                }
                InterfaceC528410Knv interfaceC528410Knv2 = c528340Kno.LLJJJJ;
                if (interfaceC528410Knv2 == null) {
                    return;
                }
                interfaceC528410Knv2.LIZLLL(tikTokMediaModel);
            }
        };
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager((Context) null, this.LLJJIJIL);
        wrapGridLayoutManager.LLIZ = new C580770MqB(this, wrapGridLayoutManager, 4);
        wrapGridLayoutManager.mInitialPrefetchItemCount = this.LLJJIJIL;
        this.LLJJJIL.setHasFixedSize(true);
        this.LLJJJIL.setItemAnimator(null);
        this.LLJJJIL.setLayoutManager(wrapGridLayoutManager);
        this.LLJJJIL.addItemDecoration(new C0OZZ(this.LLJJIJIL, this.LLLL, true));
        C529740Kq4 c529740Kq45 = this.LLJJJ;
        RecyclerView recyclerView = this.LLJJJIL;
        c529740Kq45.LLJL = recyclerView;
        recyclerView.setAdapter(c529740Kq45);
        if (this.LLJZ) {
            this.LLJJJ.LLLLLLLLL(this.LLL);
        }
        C529740Kq4 c529740Kq46 = this.LLJJJ;
        if (c529740Kq46 != null) {
            c529740Kq46.LL = this.LLJLIL;
            c529740Kq46.LLILZ = LLLLJ();
            this.LLJJJ.LLLLLLLZIL(this.LLLIZZ, this.LLLJ);
            C529740Kq4 c529740Kq47 = this.LLJJJ;
            c529740Kq47.LLJJJJ = null;
            c529740Kq47.LLJJJJJIL = null;
            c529740Kq47.LLLIIII = this.LLLLIILLL;
            c529740Kq47.LLLIIIIL = this.LLLLIL;
        }
        if (!TextUtils.isEmpty(null)) {
            C786410Ut5.LLIL(this.LLJJJJLIIL, 0);
            this.LLJJJJLIIL.setText((CharSequence) null);
        } else {
            C786410Ut5.LLIL(this.LLJJJJLIIL, 8);
        }
        LLLLZLLIL(1009);
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLIL(List<? extends TikTokMediaModel> list, boolean z) {
        ViewStub viewStub;
        LLLLIL(1009);
        if (list.isEmpty()) {
            if (this.LLLLLLJ == null && (viewStub = this.LLLLLLL) != null) {
                C786410Ut5.LJLLLL(viewStub);
                this.LLLLLLJ = (TextView) this.LLJJJJJIL.findViewById(R.id.p_c);
            }
            TextView textView = this.LLLLLLJ;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 0);
            }
            TextView textView2 = this.LLLLLLJ;
            if (textView2 != null) {
                textView2.setText(2131836579);
            }
            if (this.LLLI) {
                C524780Ki4.LIZ.end(OpenAlbumPanelPerformanceMonitor.INSTANCE, "imageLoaded");
                this.LLLI = false;
            }
        } else {
            TextView textView3 = this.LLLLLLJ;
            if (textView3 != null) {
                C786410Ut5.LLIL(textView3, 8);
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
    public final void LLLZLZ(boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528340Kno.LLLZLZ(boolean, boolean):void");
    }

    @Override // X.AbstractC528270Knh
    public final void LLLLLLL(int i, int i2, int i3) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLLF.longValue(), "duration");
        c0lab.LIZ(3, "type");
        c0lab.LJ("shoot_way", this.LLLIIIIL);
        c0lab.LIZ(i3, "count");
        C2341909Fp.LIZ("tool_performance_fetch_album_assets", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C528340Kno.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.ViewGroup");
    }
}
