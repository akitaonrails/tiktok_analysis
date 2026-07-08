package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0KgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523840KgY implements InterfaceC529800KqA {
    public static final int $stable = 8;
    public final TikTokMediaModel LL;
    public final LifecycleOwner LLILLJJLI;
    public final boolean LLILLL;
    public C433800Gzi LLILZ;
    public ChooseMediaViewModel chooseMediaViewModel;
    public View greenDot;
    public int LLILZIL = -1;
    public boolean enableClick = true;
    public final ACListenerS143S0100000_8 LLILZLL = new ACListenerS143S0100000_8(this, 124);

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
    public boolean enable() {
        ChooseMediaViewModel chooseMediaViewModel;
        Boolean boolValueOf;
        Context contextM3 = C786410Ut5.M3(C0CHQ.LIZ);
        if (contextM3 == null || (chooseMediaViewModel = this.chooseMediaViewModel) == null || (boolValueOf = Boolean.valueOf(chooseMediaViewModel.qR2(contextM3))) == null) {
            return false;
        }
        return boolValueOf.booleanValue();
    }

    @Override // X.InterfaceC529800KqA
    public View.OnClickListener getClickListener() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC529800KqA
    public View getImageView() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC529800KqA
    public void dynamicInitView(View view) {
        ChooseMediaViewModel chooseMediaViewModel;
        String strLJFF;
        TextView textView = (TextView) view.findViewById(R.id.xp9);
        if (textView != null) {
            textView.setText(2131853555);
        }
        View viewFindViewById = view.findViewById(R.id.jc3);
        int i = 0;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.j5_);
        this.greenDot = viewFindViewById2;
        if (viewFindViewById2 != null) {
            if (!this.LLILLL) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById2);
        }
        this.LLILZ = (C433800Gzi) view.findViewById(R.id.o5h);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            C433800Gzi c433800Gzi = this.LLILZ;
            TikTokMediaModel tikTokMediaModel = this.LL;
            if (tikTokMediaModel != null) {
                strLJFF = tikTokMediaModel.LJFF();
            } else {
                strLJFF = null;
            }
            C530900Krw.LIZIZ(c433800Gzi, strLJFF, layoutParams.width, layoutParams.height);
        }
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (lifecycleOwner != null && (chooseMediaViewModel = this.chooseMediaViewModel) != null) {
            BaseJediViewModel.iR2(chooseMediaViewModel, lifecycleOwner, new C2217381BqS() { // from class: X.0KfD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getShowLiveRecordingsFloatingGuide();
                }
            }, new AwS587S0100000_8(this, 585));
        }
    }

    @Override // X.InterfaceC529800KqA
    public void onFirstScreenLoaded(int i) {
        int i2 = this.LLILZIL;
        if (i2 != -1 && i2 <= i) {
            ChooseMediaViewModel chooseMediaViewModel = this.chooseMediaViewModel;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.yR2(new AwS23S0010000_8(true, 6));
                return;
            }
            return;
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.chooseMediaViewModel;
        if (chooseMediaViewModel2 == null) {
            return;
        }
        chooseMediaViewModel2.yR2(new AwS23S0010000_8(false, 6));
    }

    @Override // X.InterfaceC529800KqA
    public void setViewPosition(int i) {
        this.LLILZIL = i;
    }

    public C523840KgY(TikTokMediaModel tikTokMediaModel, ChooseMediaViewModel chooseMediaViewModel, LifecycleOwner lifecycleOwner, boolean z) {
        this.LL = tikTokMediaModel;
        this.chooseMediaViewModel = chooseMediaViewModel;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = z;
    }
}
