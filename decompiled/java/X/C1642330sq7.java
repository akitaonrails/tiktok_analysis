package X;

import Y.ACListenerS159S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS269S0300000_25;

/* JADX INFO: renamed from: X.0sq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642330sq7 extends C19A3 {
    public final int LLJILLL;
    public final Function0<Unit> LLJJ;
    public final Function0<Unit> LLJJI;

    public C1642330sq7(int i, AwS269S0300000_25 awS269S0300000_25, Function0 function0) {
        this.LLJILLL = i;
        this.LLJJ = awS269S0300000_25;
        this.LLJJI = function0;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.d3e, viewGroup, false);
        C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0sq8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        C197039127h c197039127h = (C197039127h) viewGroup2.findViewById(R.id.fym);
        C197039127h c197039127h2 = (C197039127h) viewGroup2.findViewById(R.id.fyl);
        C786410Ut5.U8(c197039127h, new ACListenerS159S0100000_25(this, 47));
        C786410Ut5.U8(c197039127h2, new ACListenerS159S0100000_25(this, 48));
        TuxIconView tuxIconView = (TuxIconView) viewGroup2.findViewById(R.id.qdl);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.fyn);
        View viewFindViewById = viewGroup2.findViewById(R.id.f705fyo);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.fyq);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.fyp);
        int i = this.LLJILLL;
        if (i != 0) {
            if (i == 1) {
                viewFindViewById.setBackgroundResource(R.drawable.a7h);
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                C786410Ut5.LJZI(8, imageView);
                textView.setText(2131839876);
                textView2.setText(2131839878);
            }
            return viewGroup2;
        }
        viewFindViewById.setBackground(null);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        C786410Ut5.LJZI(0, imageView);
        textView.setText(2131830746);
        textView2.setText(2131830745);
        return viewGroup2;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
