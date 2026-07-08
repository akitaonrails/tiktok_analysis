package X;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.MagicFunctionItemController;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;

/* JADX INFO: renamed from: X.0EIQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EIQ implements C0EIO {
    public final C19EG LL;
    public final C0EGY LLILLJJLI;
    public final InterfaceC362350EIn LLILLL;
    public final InterfaceC359950E9h LLILZ;
    public final LifecycleOwner LLILZIL;
    public final VideoPublishEditModel LLILZLL;
    public final C0EIE LLIZ = C0EIE.MAGIC_ANCHOR;
    public final String LLIZLLLIL = "bottom_item_root_magic";
    public final BPEAHandler LLJ = new BPEAHandler(Looper.getMainLooper());
    public C0P0T LLJI;
    public final C01GW LLJIJIL;
    public final InterfaceC359940E9g LLJILJIL;

    @Override // X.C0EIO
    public final boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        return false;
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
    public final boolean LLLZZIL(List<String> list) {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLLLLL() {
        return ((MagicFunctionItemController) this.LLJIJIL.getValue()).LLJILJILJ.getBoolean("editor_pro_magic_anchor_guide", false);
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLIZ;
    }

    public C0EIQ(C19EG c19eg, Lifecycle lifecycle, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn, InterfaceC359950E9h interfaceC359950E9h, LifecycleOwner lifecycleOwner, VideoPublishEditModel videoPublishEditModel) {
        this.LL = c19eg;
        this.LLILLJJLI = c0egy;
        this.LLILLL = interfaceC362350EIn;
        this.LLILZ = interfaceC359950E9h;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = videoPublishEditModel;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS406S0200000_5(this, lifecycle, 159));
        this.LLJILJIL = c0egy.AZ0();
    }
}
