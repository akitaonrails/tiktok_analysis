package X;

import Y.ACListenerS41S0201000_6;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;
import u4.q0;

/* JADX INFO: renamed from: X.0HbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444060HbA extends C444090HbD<InterfaceC444050Hb9> {
    public RemoteImageView LL;
    public final /* synthetic */ C444070HbB LLILLJJLI;

    @Override // X.C444090HbD
    public final void N5() {
        this.LL = (RemoteImageView) this.itemView.findViewById(R.id.wy_);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C444060HbA(C444070HbB c444070HbB, View view) {
        super(view);
        this.LLILLJJLI = c444070HbB;
    }

    @Override // X.C444090HbD
    public final void I5(final int i, Object obj) {
        InterfaceC444050Hb9 interfaceC444050Hb9 = (InterfaceC444050Hb9) obj;
        RemoteImageView remoteImageView = this.LL;
        RemoteImageView remoteImageView2 = null;
        if (remoteImageView == null) {
            remoteImageView = null;
        }
        boolean z = false;
        remoteImageView.setPadding(0, 0, 0, 0);
        if (interfaceC444050Hb9.LIZJ() == 2) {
            int iLIZJ = (int) C12ES.LIZJ(6.0f, this.itemView.getContext());
            RemoteImageView remoteImageView3 = this.LL;
            if (remoteImageView3 == null) {
                remoteImageView3 = null;
            }
            remoteImageView3.setPadding(iLIZJ, iLIZJ, iLIZJ, iLIZJ);
            RemoteImageView remoteImageView4 = this.LL;
            if (remoteImageView4 == null) {
                remoteImageView4 = null;
            }
            C1324840ka2.LJIIJ(remoteImageView4, interfaceC444050Hb9.getIconUrl(), -1, -1);
        } else if (interfaceC444050Hb9.LIZLLL() > 0) {
            RemoteImageView remoteImageView5 = this.LL;
            if (remoteImageView5 == null) {
                remoteImageView5 = null;
            }
            remoteImageView5.setImageResource(interfaceC444050Hb9.LIZLLL());
        } else {
            Drawable drawableLJFF = interfaceC444050Hb9.LJFF(this.itemView.getContext());
            if (drawableLJFF != null) {
                RemoteImageView remoteImageView6 = this.LL;
                if (remoteImageView6 == null) {
                    remoteImageView6 = null;
                }
                remoteImageView6.setImageDrawable(drawableLJFF);
            }
        }
        String name = interfaceC444050Hb9.getName();
        if (name != null && name.length() != 0) {
            RemoteImageView remoteImageView7 = this.LL;
            if (remoteImageView7 == null) {
                remoteImageView7 = null;
            }
            q0.LJIJ(remoteImageView7, new C0IE6(interfaceC444050Hb9, 1));
        }
        int i2 = this.LLILLJJLI.LL.LLILZIL.LIZLLL;
        RemoteImageView remoteImageView8 = this.LL;
        if (remoteImageView8 == null) {
            remoteImageView8 = null;
        }
        if (i == i2) {
            z = true;
        }
        remoteImageView8.setSelected(z);
        RemoteImageView remoteImageView9 = this.LL;
        if (remoteImageView9 == null) {
            remoteImageView9 = null;
        }
        C786410Ut5.E9(remoteImageView9, new ACListenerS41S0201000_6(this, this.LLILLJJLI, i, 4));
        final Function2<View, Integer, Boolean> function2 = this.LLILLJJLI.LLILLJJLI;
        if (function2 != null) {
            RemoteImageView remoteImageView10 = this.LL;
            if (remoteImageView10 != null) {
                remoteImageView2 = remoteImageView10;
            }
            remoteImageView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.03AY
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return function2.invoke(view, Integer.valueOf(i)).booleanValue();
                }
            });
        }
    }
}
