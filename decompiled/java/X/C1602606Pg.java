package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1602606Pg extends C09AY implements Function1<C06PY, C06PY> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ DataSource LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Bitmap LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602606Pg(int i, DataSource dataSource, C013C c013c, int i2, boolean z, int i3, boolean z2, Bitmap bitmap) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = dataSource;
        this.LLILLL = c013c;
        this.LLILZ = i2;
        this.LLILZIL = z;
        this.LLILZLL = i3;
        this.LLIZ = z2;
        this.LLIZLLLIL = bitmap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C06PY invoke(C06PY c06py) {
        return C06PY.LIZ(c06py, new C291001Au(new C1628606Zg(this.LL, this.LLILLJJLI, this.LLILLL.element, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL)), null, null, null, 14);
    }
}
