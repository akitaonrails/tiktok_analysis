package X;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.MagicFunctionItemController;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EHP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EHP implements C0EIO {
    public final C19EG LL;
    public final C0EGY LLILLJJLI;
    public final InterfaceC362350EIn LLILLL;
    public final InterfaceC359950E9h LLILZ;
    public final LifecycleOwner LLILZIL;
    public final VideoPublishEditModel LLILZLL;
    public final C0EIE LLIZ = C0EIE.MAGIC;
    public final InterfaceC359850E8x LLIZLLLIL;
    public final InterfaceC359940E9g LLJ;
    public final C01GW LLJI;

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
        Keva keva = ((MagicFunctionItemController) this.LLJI.getValue()).LLJILJILJ;
        C353560Dta.LIZ.getClass();
        return keva.getBoolean(C353560Dta.LJFF() ? "editor_pro_magic_guide_add_tab" : "editor_pro_magic_guide_init", false);
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLIZ;
    }

    public final boolean LIZ(List<String> list) {
        String str;
        EditorProSchemeModel editorProSchemeModel;
        EPAnchorData ePAnchorData;
        VideoPublishEditModel videoPublishEditModel = this.LLILZLL;
        if (videoPublishEditModel != null && (editorProSchemeModel = videoPublishEditModel.creativeModel.editorProSchemeModel) != null && (ePAnchorData = editorProSchemeModel.anchorData) != null) {
            str = ePAnchorData.editorProAnchorType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "magic") || !list.contains("bottom_item_root_magic")) {
            return false;
        }
        InterfaceC359850E8x interfaceC359850E8x = this.LLIZLLLIL;
        if (interfaceC359850E8x != null) {
            ((MagicFunctionItemController) this.LLJI.getValue()).LJII(interfaceC359850E8x, this.LLILZLL);
            return true;
        }
        return true;
    }

    @Override // X.C0EIO
    public final boolean LLLZZIL(List<String> list) {
        return LIZ(list);
    }

    @Override // X.C0EIO
    public final boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        RecyclerView recyclerViewLLII;
        C361980EHc c361980EHcLJ;
        C0EJO c0ejo;
        ArrayList<C361980EHc> arrayList;
        int iIndexOf;
        LinearLayoutManager linearLayoutManager;
        EditorProSchemeModel editorProSchemeModel;
        EPAnchorData ePAnchorData;
        InterfaceC359940E9g interfaceC359940E9g = this.LLJ;
        if (interfaceC359940E9g == null || (recyclerViewLLII = interfaceC359940E9g.LLII()) == null) {
            return false;
        }
        InterfaceC359850E8x interfaceC359850E8x = this.LLIZLLLIL;
        String str = null;
        if (interfaceC359850E8x != null) {
            c361980EHcLJ = interfaceC359850E8x.LJ("bottom_item_root_magic");
        } else {
            c361980EHcLJ = null;
        }
        AbstractC21673619ry adapter = recyclerViewLLII.getAdapter();
        if ((adapter instanceof C0EJO) && (c0ejo = (C0EJO) adapter) != null && (arrayList = c0ejo.LL) != null && (iIndexOf = arrayList.indexOf(c361980EHcLJ)) != -1) {
            RecyclerView.LayoutManager layoutManager = recyclerViewLLII.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition > iIndexOf || iIndexOf > iFindLastCompletelyVisibleItemPosition) {
                    recyclerViewLLII.scrollToPosition(iIndexOf);
                }
            }
            VideoPublishEditModel videoPublishEditModel = this.LLILZLL;
            if (videoPublishEditModel != null && (editorProSchemeModel = videoPublishEditModel.creativeModel.editorProSchemeModel) != null && (ePAnchorData = editorProSchemeModel.anchorData) != null) {
                str = ePAnchorData.editorProAnchorType;
            }
            if (!Intrinsics.LJFF(str, "magic")) {
                ((MagicFunctionItemController) this.LLJI.getValue()).LJII(this.LLIZLLLIL, this.LLILZLL);
                return true;
            }
        }
        return LIZ(list);
    }

    public C0EHP(C19EG c19eg, Lifecycle lifecycle, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn, InterfaceC359950E9h interfaceC359950E9h, LifecycleOwner lifecycleOwner, VideoPublishEditModel videoPublishEditModel) {
        this.LL = c19eg;
        this.LLILLJJLI = c0egy;
        this.LLILLL = interfaceC362350EIn;
        this.LLILZ = interfaceC359950E9h;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = videoPublishEditModel;
        this.LLIZLLLIL = c0egy.B20();
        this.LLJ = c0egy.AZ0();
        new BPEAHandler(Looper.getMainLooper());
        this.LLJI = C452501pT.LIZIZ(new AwS406S0200000_5(this, lifecycle, 155));
    }
}
