package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellBackgroundComponentAbility;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cBE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001940cBE {
    public final Context LIZ;
    public final ISlideIndicatorAbility LIZIZ;
    public final CellBackgroundComponentAbility LIZJ;
    public boolean LIZLLL;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public float LJIIIIZZ;
    public ICommercePhotoSlideAbility LJIIIZ;
    public InterfaceC689860R4e LJIIJ;
    public float LJ = -1.0f;
    public final ArrayList<Integer> LJIIJJI = new ArrayList<>();
    public final ArrayList<Integer> LJIIL = new ArrayList<>();
    public final ArrayList<Integer> LJIILIIL = new ArrayList<>();
    public final ArrayList<Integer> LJIILJJIL = new ArrayList<>();
    public final HashMap<Integer, C1001980cBI> LJIILL = new HashMap<>();
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 639));

    public static int LIZJ(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public final void LIZLLL(C1001980cBI c1001980cBI) {
        InterfaceC689860R4e interfaceC689860R4e = this.LJIIJ;
        if (interfaceC689860R4e != null) {
            interfaceC689860R4e.LLIZLLLIL(c1001980cBI.LIZJ, c1001980cBI.LIZLLL);
        }
        int[] iArr = {c1001980cBI.LIZ, c1001980cBI.LIZIZ};
        ICommercePhotoSlideAbility iCommercePhotoSlideAbility = this.LJIIIZ;
        if (iCommercePhotoSlideAbility != null) {
            iCommercePhotoSlideAbility.rM1(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr));
        }
    }

    public final C1001980cBI LIZ(float f, int i) {
        int i2 = i + 1;
        return new C1001980cBI(LIZIZ(f, ((Number) ListProtector.get(this.LJIILIIL, i)).intValue(), ((Number) ListProtector.get(this.LJIILIIL, i2)).intValue()), LIZIZ(f, ((Number) ListProtector.get(this.LJIILJJIL, i)).intValue(), ((Number) ListProtector.get(this.LJIILJJIL, i2)).intValue()), LIZIZ(f, ((Number) ListProtector.get(this.LJIIJJI, i)).intValue(), ((Number) ListProtector.get(this.LJIIJJI, i2)).intValue()), LIZIZ(f, ((Number) ListProtector.get(this.LJIIL, i)).intValue(), ((Number) ListProtector.get(this.LJIIL, i2)).intValue()));
    }

    public C1001940cBE(Context context, ISlideIndicatorAbility iSlideIndicatorAbility, CellBackgroundComponentAbility cellBackgroundComponentAbility) {
        this.LIZ = context;
        this.LIZIZ = iSlideIndicatorAbility;
        this.LIZJ = cellBackgroundComponentAbility;
    }

    public static int LIZIZ(float f, int i, int i2) {
        return Color.argb(255, (int) (Color.red(i) + ((Color.red(i2) - r2) * f)), (int) (Color.green(i) + ((Color.green(i2) - r2) * f)), (int) (Color.blue(i) + (f * (Color.blue(i2) - r2))));
    }
}
