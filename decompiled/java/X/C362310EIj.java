package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362310EIj implements C0EIO {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C19EG LL;
    public final InterfaceC359940E9g LLILLJJLI;
    public final C0E48 LLILLL;
    public final C0EIE LLILZ = C0EIE.MULTI_MUSIC;

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

    public final boolean LIZ() {
        List<C361980EHc> listLJIILJJIL;
        InterfaceC359940E9g interfaceC359940E9g;
        RecyclerView recyclerViewLLII;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (!C362270EIf.LIZ(this.LLILLL)) {
            return false;
        }
        InterfaceC359940E9g interfaceC359940E9g2 = this.LLILLJJLI;
        if (interfaceC359940E9g2 == null || (listLJIILJJIL = interfaceC359940E9g2.LJIILJJIL()) == null) {
            return false;
        }
        Iterator<C361980EHc> it2 = listLJIILJJIL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next().LJI, "bottom_item_root_sound")) {
                if (i < 0 || i >= listLJIILJJIL.size() || (interfaceC359940E9g = this.LLILLJJLI) == null || (recyclerViewLLII = interfaceC359940E9g.LLII()) == null || (viewHolderFindViewHolderForAdapterPosition = recyclerViewLLII.findViewHolderForAdapterPosition(i)) == null) {
                    return false;
                }
                C450720Hlu c450720Hlu = new C450720Hlu(this.LL);
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = view;
                c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                c450720Hlu.LJIIJ(2131837600);
                c450720Hlu.LIZIZ().show();
                C0EFJ c0efj = C0EFJ.LIZ;
                C0E48 c0e48 = this.LLILLL;
                EditModelProvider.Companion.getClass();
                EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
                VideoPublishEditModel editModel = editModelProviderLIZIZ != null ? editModelProviderLIZIZ.getEditModel() : null;
                c0efj.getClass();
                C20684815ws.LJIILLIIL("add_multi_sound_pop_up", C0EFJ.LIZ(editModel, c0e48).LIZ);
                C363750ENx.LJ("multi_music_guide_has_shown_in_root");
                return true;
            }
            i++;
        }
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLLLLL() {
        return C363750ENx.LIZIZ("multi_music_guide_has_shown_in_root");
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLILZ;
    }

    @Override // X.C0EIO
    public final boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        if (list.contains("bottom_item_root_sound") && !LLLLLLL()) {
            return LIZ();
        }
        return false;
    }

    public C362310EIj(C19EG c19eg, InterfaceC359940E9g interfaceC359940E9g, C0E48 c0e48) {
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC359940E9g;
        this.LLILLL = c0e48;
    }
}
