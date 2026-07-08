package X;

import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0l1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341720l1G extends RelativeLayout {
    public boolean LL;
    public boolean LLILLJJLI;
    public TuxIconView LLILLL;
    public SmartImageView LLILZ;
    public GiftViewModel LLILZIL;

    public final boolean getEnable() {
        return this.LLILLJJLI;
    }

    public final boolean getHasGift() {
        return this.LL;
    }

    public final void setEnable(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setHasGift(boolean z) {
        this.LL = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.LLILLJJLI) {
            if (this.LL) {
                super.setVisibility(i);
                return;
            } else {
                super.setVisibility(8);
                return;
            }
        }
        super.setVisibility(8);
    }

    public C1341720l1G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = true;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a2n, this, true);
        this.LLILLL = (TuxIconView) getRootView().findViewById(R.id.t60);
        this.LLILZ = (SmartImageView) getRootView().findViewById(R.id.um9);
        C786410Ut5.y(this, 8);
        SmartImageView smartImageView = this.LLILZ;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
    }

    public final void LIZ(GiftViewModel giftViewModel, LifecycleOwner lifecycleOwner) {
        MutableLiveData<GiftStruct> mutableLiveDataWQ2;
        this.LLILZIL = giftViewModel;
        if (giftViewModel != null && (mutableLiveDataWQ2 = giftViewModel.wQ2()) != null) {
            mutableLiveDataWQ2.observe(lifecycleOwner, new AObserverS224S0100000_21(this, 56));
        }
        SmartImageView smartImageView = this.LLILZ;
        if (smartImageView != null) {
            C786410Ut5.Q8(smartImageView, new ACListenerS155S0100000_21(this, 118));
        }
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 119));
        }
    }
}
