package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0KiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524890KiF implements InterfaceC529800KqA {
    public static final int $stable = 8;
    public final TikTokMediaModel LL;
    public final LifecycleOwner LLILLJJLI;
    public final boolean LLILLL;
    public C433800Gzi LLILZ;
    public View LLILZIL;
    public ChooseMediaViewModel chooseMediaViewModel;
    public boolean enableClick = true;
    public View greenDot;

    @Override // X.InterfaceC529800KqA
    public View getImageView() {
        return null;
    }

    @Override // X.InterfaceC529800KqA
    public int layoutRes() {
        return R.layout.bfs;
    }

    @Override // X.InterfaceC529800KqA
    public boolean needFullSpan() {
        return false;
    }

    @Override // X.InterfaceC529800KqA
    public boolean needGray() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public void onFirstScreenLoaded(int i) {
    }

    @Override // X.InterfaceC529800KqA
    public void onRecoverFromGray() {
        this.enableClick = true;
    }

    @Override // X.InterfaceC529800KqA
    public void onSetGray() {
        this.enableClick = false;
    }

    @Override // X.InterfaceC529800KqA
    public void setAlbumActivity(Activity activity) {
    }

    @Override // X.InterfaceC529800KqA
    public void setViewPosition(int i) {
    }

    @Override // X.InterfaceC529800KqA
    public boolean enable() {
        Context contextM3 = C786410Ut5.M3(C0CHQ.LIZ);
        if (contextM3 != null) {
            return this.chooseMediaViewModel.qR2(contextM3);
        }
        return false;
    }

    @Override // X.InterfaceC529800KqA
    public View.OnClickListener getClickListener() {
        return new ACListenerS143S0100000_8(this, 120);
    }

    @Override // X.InterfaceC529800KqA
    public void dynamicInitView(View view) {
        Context context;
        TextView textView = (TextView) view.findViewById(R.id.xp9);
        if (textView != null) {
            textView.setText(2131825502);
        }
        this.LLILZ = (C433800Gzi) view.findViewById(R.id.o5h);
        View viewFindViewById = view.findViewById(R.id.jc3);
        this.LLILZIL = viewFindViewById;
        int i = 0;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        this.greenDot = view.findViewById(R.id.j5_);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        View view2 = this.greenDot;
        if (view2 != null) {
            if (!this.LLILLL) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        if (layoutParams != null) {
            C433800Gzi c433800Gzi = this.LLILZ;
            Size size = new Size(layoutParams.width, layoutParams.height);
            TikTokMediaModel tikTokMediaModel = this.LL;
            InterfaceC529900KqK interfaceC529900KqK = new InterfaceC529900KqK() { // from class: X.0KiI
                @Override // X.InterfaceC529900KqK
                public final void LIZ() {
                }

                @Override // X.InterfaceC529900KqK
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC529900KqK
                public final void onFailure(Throwable th) {
                }
            };
            Uri uriLJIILIIL = C2471909mP.LJIILIIL(tikTokMediaModel.LJFF());
            if (c433800Gzi != null && (context = c433800Gzi.getContext()) != null) {
                C529670Kpx.LIZIZ(c433800Gzi, context, uriLJIILIIL, size, interfaceC529900KqK);
            }
        }
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (lifecycleOwner != null) {
            BaseJediViewModel.iR2(this.chooseMediaViewModel, lifecycleOwner, new C2217381BqS() { // from class: X.0KiG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getShowAiContentGuideView();
                }
            }, new AwS587S0100000_8(this, 584));
        }
    }

    public C524890KiF(TikTokMediaModel tikTokMediaModel, ChooseMediaViewModel chooseMediaViewModel, LifecycleOwner lifecycleOwner, boolean z) {
        this.LL = tikTokMediaModel;
        this.chooseMediaViewModel = chooseMediaViewModel;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = z;
    }
}
