package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0yJ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852450yJ1 extends C09AY implements InterfaceC1631620sYq<CreativeTemplate, Integer, List<? extends BaseImage>, Unit> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1852450yJ1(Fragment fragment, String str, String str2) {
        super(3);
        this.LL = fragment;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(CreativeTemplate creativeTemplate, Integer num, List<? extends BaseImage> list) {
        CreativeTemplate creativeTemplate2 = creativeTemplate;
        num.intValue();
        C1852270yIj c1852270yIj = C1852270yIj.LIZ;
        Fragment fragment = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        c1852270yIj.getClass();
        C1854410yMB.LIZ(fragment, new C1853710yL3(creativeTemplate2.templatePrompt, list, C1852270yIj.LJ(creativeTemplate2, 0), C1852270yIj.LJII(str, str2, null, null), null));
        return Unit.LIZ;
    }
}
