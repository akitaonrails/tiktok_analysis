package X;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryStickerComponent;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RFS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RFS extends C09AY implements Function0<Map<Integer, ? extends InterfaceC19578611iq>> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ StoryStickerComponent LLILZ;
    public final /* synthetic */ C705930RmZ LLILZIL;
    public final /* synthetic */ FrameLayout LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RFS(Aweme aweme, C19EG c19eg, boolean z, StoryStickerComponent storyStickerComponent, C705930RmZ c705930RmZ, FrameLayout frameLayout) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = c19eg;
        this.LLILLL = z;
        this.LLILZ = storyStickerComponent;
        this.LLILZIL = c705930RmZ;
        this.LLILZLL = frameLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Integer, ? extends InterfaceC19578611iq> invoke() {
        C19602911ml c19602911ml = C19602911ml.LIZ;
        Aweme aweme = this.LL;
        C19EG c19eg = this.LLILLJJLI;
        boolean z = this.LLILLL;
        C0RFT c0rft = this.LLILZ.LLJJLIIIJLLLLLLLZ;
        C11NJ c11njLIZIZ = c0rft != null ? c0rft.LIZIZ() : null;
        C19EG c19eg2 = this.LLILLJJLI;
        C705930RmZ c705930RmZ = this.LLILZIL;
        FrameLayout frameLayout = this.LLILZLL;
        C0RF0 c0rf0 = this.LLILZ.jm().LIZLLL;
        Fragment fragment = c0rf0 != null ? c0rf0.LIZJ : null;
        C445660Hdk c445660Hdk = new C445660Hdk(this.LLILZ);
        C446450Hf1 c446450Hf1 = new C446450Hf1(this.LLILZ);
        c19602911ml.getClass();
        return C19602911ml.LJ(aweme, c19eg, z, c11njLIZIZ, c19eg2, c705930RmZ, frameLayout, fragment, c445660Hdk, c446450Hf1, true);
    }
}
