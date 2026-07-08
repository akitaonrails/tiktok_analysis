package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;

/* JADX INFO: renamed from: X.0EIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362290EIh implements C0EIO {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C19EG LL;
    public final C0E48 LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final VideoPublishEditModel LLILZ;
    public final C0EIE LLILZIL = C0EIE.AUTO_SELECT;
    public final C1664750tQH LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C362290EIh.class, "tracApi", "getTracApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C362290EIh.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C362290EIh.class, "editorProStateApi", "getEditorProStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.C0EIO
    public final boolean LLJJ() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLIILIL() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLLLLL() {
        return !C359960E9i.LIZ(null);
    }

    @Override // X.C0EIO
    public final boolean LLLZZIL(List<String> list) {
        return false;
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLILZIL;
    }

    @Override // X.C0EIO
    public final boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        if (c0elj.isSlideInto() || c0elj.getInitIntent() == EnumC359990E9l.OPEN_MUSIC_FROM_EDITOR) {
            return false;
        }
        C0CNO.LIZLLL(800L, new AwS406S0200000_5(this, c0elj, 157));
        return true;
    }

    public C362290EIh(C19EG c19eg, C1DRG c1drg, C0E48 c0e48, LifecycleOwner lifecycleOwner, VideoPublishEditModel videoPublishEditModel) {
        this.LL = c19eg;
        this.LLILLJJLI = c0e48;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = videoPublishEditModel;
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, C0E5S.class, null);
        this.LLIZ = new C1664740tQG(c1drg.LJIILIIL(null, C0EGY.class), C0EGY.class);
        this.LLIZLLLIL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC359950E9h.class), InterfaceC359950E9h.class);
    }
}
