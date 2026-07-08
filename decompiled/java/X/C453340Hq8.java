package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Hq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453340Hq8 extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLIZ = 0;
    public final InterfaceC453460HqK LL;
    public final SmartImageView LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public Animatable LLILZLL;

    public C453340Hq8(View view, InterfaceC453460HqK interfaceC453460HqK) {
        super(view);
        this.LL = interfaceC453460HqK;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.wo8);
        float fMax = Math.max(C451310Hmr.LIZ().itemHeightDp / 72.0f, 0.3f);
        this.LLILLL = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) * fMax);
        this.LLILZ = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(128)) * fMax);
        this.LLILZIL = "t:s";
    }
}
