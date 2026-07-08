package X;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Gqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428260Gqm extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ ImageView LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C428260Gqm(ImageView imageView, int i, int i2, int i3, int i4, boolean z) {
        super(2);
        this.LL = imageView;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
        this.LLILZLL = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        BitmapDrawable bitmapDrawable;
        bool.booleanValue();
        String str2 = str;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (new C0VSJ(str2).exists()) {
            bitmapDrawable = new BitmapDrawable(Resources.getSystem(), BitmapFactory.decodeFile(str2));
        } else {
            bitmapDrawable = null;
        }
        C1857690yRT.LJIIIIZZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, bitmapDrawable, this.LLILZLL, null);
        return Unit.LIZ;
    }
}
