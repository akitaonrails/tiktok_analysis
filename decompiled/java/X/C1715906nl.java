package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1715906nl extends C09AY implements Function1<C1715206ne, C1715206ne> {
    public final /* synthetic */ DataSource LL;
    public final /* synthetic */ InterfaceC1715506nh LLILLJJLI;
    public final /* synthetic */ Map<String, Bitmap> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1715706nj LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715906nl(DataSource dataSource, InterfaceC1715506nh interfaceC1715506nh, Map<String, Bitmap> map, boolean z, C1715706nj c1715706nj) {
        super(1);
        this.LL = dataSource;
        this.LLILLJJLI = interfaceC1715506nh;
        this.LLILLL = map;
        this.LLILZ = z;
        this.LLILZIL = c1715706nj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1715206ne invoke(C1715206ne c1715206ne) {
        return C1715206ne.LIZ(c1715206ne, new C291001Au(new C1715806nk(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL)), null, 6);
    }
}
