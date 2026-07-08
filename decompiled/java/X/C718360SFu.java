package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0SFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718360SFu {
    public final /* synthetic */ C718370SFv LIZ = new C718370SFv();
    public String LIZIZ;
    public Aweme LIZJ;
    public BannerCommonStruct LIZLLL;
    public C690870R8b LJ;
    public String LJFF;

    public final void LIZ(EnumC707450Rp1 enumC707450Rp1) {
        C718370SFv c718370SFv = this.LIZ;
        if (enumC707450Rp1 != c718370SFv.LIZ) {
            Iterator it2 = ((ArrayList) c718370SFv.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC718380SFw) it2.next()).LIZ(enumC707450Rp1);
            }
        }
        c718370SFv.LIZ = enumC707450Rp1;
    }
}
