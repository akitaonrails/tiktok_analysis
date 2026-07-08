package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sGB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620050sGB {
    public static final C727490SgF LIZLLL = new ViewModelProvider.NewInstanceFactory() { // from class: X.0SgF
        public FeedPanelStateViewModel LIZ;

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends ViewModel> T create(Class<T> cls) {
            if (Intrinsics.LJFF(FeedPanelStateViewModel.class, cls)) {
                if (this.LIZ == null) {
                    this.LIZ = (FeedPanelStateViewModel) super.create(cls);
                }
                return this.LIZ;
            }
            return (T) super.create(cls);
        }
    };
    public final FeedPanelStateViewModel LIZ;
    public final Context LIZIZ;
    public final WeakReference<LifecycleOwner> LIZJ;

    public C1620050sGB() {
        throw null;
    }

    public final boolean LIZIZ() {
        return LIZ("comment_panel");
    }

    public final boolean LIZJ() {
        return LIZ("login_panel");
    }

    public final boolean LIZLLL() {
        return LIZ("not_interested_tutorial");
    }

    public final boolean LJ() {
        return LIZ("permission_dialog");
    }

    public final boolean LJFF() {
        return LIZ("share_panel");
    }

    public final boolean LJI() {
        return LIZ("swipe_up_guide");
    }

    public final boolean LIZ(String str) {
        Boolean value;
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveDataLJII = LJII(str);
        if (dialogStateLiveDataLJII != null && (value = dialogStateLiveDataLJII.getValue()) != null) {
            return value.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final FeedPanelStateViewModel.DialogStateLiveData LJII(String str) {
        FeedPanelStateViewModel feedPanelStateViewModel;
        FeedPanelStateViewModel feedPanelStateViewModel2;
        FeedPanelStateViewModel feedPanelStateViewModel3;
        FeedPanelStateViewModel feedPanelStateViewModel4;
        FeedPanelStateViewModel feedPanelStateViewModel5;
        FeedPanelStateViewModel feedPanelStateViewModel6;
        FeedPanelStateViewModel feedPanelStateViewModel7;
        FeedPanelStateViewModel feedPanelStateViewModel8;
        FeedPanelStateViewModel feedPanelStateViewModel9;
        FeedPanelStateViewModel feedPanelStateViewModel10;
        FeedPanelStateViewModel feedPanelStateViewModel11;
        FeedPanelStateViewModel feedPanelStateViewModel12;
        FeedPanelStateViewModel feedPanelStateViewModel13;
        FeedPanelStateViewModel feedPanelStateViewModel14;
        FeedPanelStateViewModel feedPanelStateViewModel15;
        FeedPanelStateViewModel feedPanelStateViewModel16;
        FeedPanelStateViewModel feedPanelStateViewModel17;
        FeedPanelStateViewModel feedPanelStateViewModel18;
        FeedPanelStateViewModel feedPanelStateViewModel19;
        FeedPanelStateViewModel feedPanelStateViewModel20;
        switch (str.hashCode()) {
            case -2144360174:
                if (!str.equals("long_press_layer") || (feedPanelStateViewModel20 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel20.LLJJI;
            case -2140676667:
                if (!str.equals("long_press_panel") || (feedPanelStateViewModel19 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel19.LLJJIII;
            case -1835633107:
                if (!str.equals("show_danmaku_rethink") || (feedPanelStateViewModel18 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel18.LLJJ;
            case -1109403612:
                if (!str.equals("comment_panel") || (feedPanelStateViewModel17 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel17.LLILZIL;
            case -208635325:
                if (!str.equals("gif_share_dialog") || (feedPanelStateViewModel16 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel16.LLJIJIL;
            case -67089052:
                if (!str.equals("upload_progress_fragment") || (feedPanelStateViewModel15 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel15.LLJJIJI;
            case -50729574:
                if (!str.equals("input_danmaku") || (feedPanelStateViewModel14 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel14.LLJILLL;
            case -34962636:
                if (!str.equals("search_swipe_up_guide") || (feedPanelStateViewModel13 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel13.LLILLL;
            case -18099452:
                if (!str.equals("downloaded_video_share_dialog") || (feedPanelStateViewModel12 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel12.LLJILJIL;
            case 106825951:
                if (!str.equals("download_dialog") || (feedPanelStateViewModel11 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel11.LLJ;
            case 333438392:
                if (!str.equals("permission_dialog") || (feedPanelStateViewModel10 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel10.LLJJIJIL;
            case 403708324:
                if (!str.equals("share_panel") || (feedPanelStateViewModel9 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel9.LLILZLL;
            case 684302462:
                if (!str.equals("privacy_policy_dialog") || (feedPanelStateViewModel8 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel8.LLIZLLLIL;
            case 975552040:
                if (!str.equals("not_interested_tutorial") || (feedPanelStateViewModel7 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel7.LLJJIJIIJIL;
            case 1049683556:
                if (!str.equals("gif_download_dialog") || (feedPanelStateViewModel6 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel6.LLJI;
            case 1316323261:
                if (!str.equals("swipe_up_guide") || (feedPanelStateViewModel5 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel5.LLILLJJLI;
            case 1494381465:
                if (!str.equals("story_page") || (feedPanelStateViewModel4 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel4.LLIZ;
            case 1654221230:
                if (!str.equals("login_panel") || (feedPanelStateViewModel3 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel3.LLILZ;
            case 2050924370:
                if (!str.equals("ad_explain_static_dynamic") || (feedPanelStateViewModel2 = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel2.LLJJJ;
            case 2144107035:
                if (!str.equals("follow_guide_popup") || (feedPanelStateViewModel = this.LIZ) == null) {
                    return null;
                }
                return feedPanelStateViewModel.LLJILJILJ;
            default:
                return null;
        }
    }

    public final void LJIIIIZZ(boolean z) {
        LJIIJJI("not_interested_tutorial", z, null);
    }

    public final void LJIIJ(boolean z) {
        LJIIJJI("swipe_up_guide", z, null);
    }

    public final void LJIIIZ(String str, final C0T3B c0t3b) {
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveDataLJII;
        LifecycleOwner lifecycleOwner;
        if (this.LIZ != null && (this.LIZIZ instanceof LifecycleOwner) && (dialogStateLiveDataLJII = LJII(str)) != null) {
            WeakReference<LifecycleOwner> weakReference = this.LIZJ;
            if (weakReference == null || (lifecycleOwner = weakReference.get()) == null) {
                lifecycleOwner = (LifecycleOwner) this.LIZIZ;
            }
            dialogStateLiveDataLJII.observe(lifecycleOwner, new Observer() { // from class: X.0T3A
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        C0T3B c0t3b2 = c0t3b;
                        bool.booleanValue();
                        if (bool.booleanValue()) {
                            c0t3b2.LIZIZ();
                        } else {
                            c0t3b2.LIZ();
                        }
                    }
                }
            });
        }
    }

    public C1620050sGB(FeedPanelStateViewModel feedPanelStateViewModel, Context context, WeakReference weakReference) {
        this.LIZ = feedPanelStateViewModel;
        this.LIZIZ = context;
        this.LIZJ = weakReference;
    }

    public final void LJIIJJI(String str, boolean z, C0TA1 c0ta1) {
        FeedPanelStateViewModel.DialogStateLiveData dialogStateLiveDataLJII = LJII(str);
        if (dialogStateLiveDataLJII != null && !Intrinsics.LJFF(dialogStateLiveDataLJII.getValue(), Boolean.valueOf(z))) {
            dialogStateLiveDataLJII.setValue(z);
            if (z) {
                dialogStateLiveDataLJII.setStateRequestHandler(c0ta1);
            } else {
                dialogStateLiveDataLJII.setStateRequestHandler(null);
            }
        }
    }
}
