package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.11F8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11F8 {
    public static final List<Banner> LJIIJJI = Arrays.asList(new Banner());
    public final ViewPager LIZ;
    public final C1194770hCF LIZIZ;
    public final View LIZJ;
    public final FrameLayout LIZLLL;
    public C11EU LJ;
    public final C19466911Ed LJFF;
    public final Context LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;

    public C11F8(View view, int i, int i2, long j, long j2) {
        Context context = view.getContext();
        this.LJI = context;
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        this.LIZ = viewPager;
        C1194770hCF c1194770hCF = (C1194770hCF) view.findViewById(R.id.g3k);
        this.LIZIZ = c1194770hCF;
        View viewFindViewById = view.findViewById(R.id.w0u);
        this.LIZJ = viewFindViewById;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.brx);
        this.LIZLLL = frameLayout;
        this.LJII = i;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = j;
        this.LJIIJ = j2;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = (int) ((C12ES.LJIIJ(context) - ((int) (C12ES.LIZJ(16.0f, context) * 2.0f))) * 0.26239067f);
        C786410Ut5.a6(this.LIZLLL, layoutParams);
        frameLayout.setOutlineProvider(new C663220Pzs((int) C12ES.LIZJ(2.0f, context)));
        frameLayout.setClipToOutline(true);
        this.LJFF = new C19466911Ed(viewPager);
        viewFindViewById.getLayoutParams().height = C497820Jfg.LIZJ(view.getContext());
        c1194770hCF.setLayoutDirection(0);
    }
}
