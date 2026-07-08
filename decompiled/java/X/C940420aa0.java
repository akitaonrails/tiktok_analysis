package X;

import Y.ARunnableS84S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixVoiceChatAvatarSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aa0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940420aa0 extends AbstractC940410aZz {
    public final String LLILZIL = "";
    public final String LLILZLL;

    @Override // X.AbstractC940410aZz
    public final int LIZIZ() {
        return R.layout.hwk;
    }

    @Override // X.AbstractC940410aZz
    public final String LIZ() {
        return this.LLILZIL;
    }

    public C940420aa0(String str) {
        this.LLILZLL = str;
    }

    @Override // X.AbstractC940410aZz
    public final void LIZJ(ViewGroup viewGroup) {
        if (BugFixVoiceChatAvatarSetting.INSTANCE.enable()) {
            if (viewGroup != null) {
                if (viewGroup.isLaidOut() && !viewGroup.isLayoutRequested()) {
                    int width = (int) (viewGroup.getWidth() * C933980aPc.LIZJ(this.LLILZLL));
                    int i = (int) (width * 0.375f);
                    ImageView imageView = (ImageView) viewGroup.findViewById(R.id.h23);
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.ff1);
                    }
                    View viewFindViewById = viewGroup.findViewById(R.id.h23);
                    if (viewFindViewById != null) {
                        C933980aPc.LJIIZILJ(width, width, viewFindViewById);
                    }
                    View viewFindViewById2 = viewGroup.findViewById(R.id.h34);
                    if (viewFindViewById2 != null) {
                        C933980aPc.LJIIZILJ(i, i, viewFindViewById2);
                        return;
                    }
                    return;
                }
                viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986910bmz(viewGroup, this, 1));
                return;
            }
            return;
        }
        if (viewGroup == null) {
            return;
        }
        C930540aK4.LJJJ(viewGroup, new ARunnableS84S0200000_15(viewGroup, this, 78));
    }
}
