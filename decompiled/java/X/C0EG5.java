package X;

import Y.ACListenerS140S0100000_5;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EG5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EG5 extends C0FC9<C357930E1n, InterfaceC360910ECz> {
    public final Bitmap LLJJJJJIL;
    public final Function1<String, Unit> LLJJJJLIIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C0EG5(C1DRG c1drg, Bitmap bitmap, Function1<? super String, Unit> function1) {
        super(c1drg);
        this.LLJJJJJIL = bitmap;
        this.LLJJJJLIIL = function1;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c1c, viewGroup, false);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.lee);
        Bitmap bitmap = this.LLJJJJJIL;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        TuxIconView tuxIconView = (TuxIconView) viewGroup2.findViewById(R.id.nvh);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 31));
        }
        C197039127h c197039127h = (C197039127h) viewGroup2.findViewById(R.id.cqt);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS140S0100000_5(this, 32));
        }
        return viewGroup2;
    }
}
