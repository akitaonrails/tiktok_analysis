package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114970f7X extends AbstractC1115080f7i {
    public C1115170f7r LJIIL;
    public C1115350f89 LJIILIIL;
    public List<? extends EmoteModel> LJIILJJIL;
    public InterfaceC1114320f6U LJIILL;

    @Override // X.AbstractC1115080f7i
    public final View LIZIZ() {
        Context context = this.LIZ;
        DataChannel dataChannel = this.LIZJ;
        boolean z = this.LJ;
        C1115170f7r c1115170f7r = this.LJIIL;
        C1115350f89 c1115350f89 = new C1115350f89(context, dataChannel);
        c1115350f89.setOnEmojiSelectListener(c1115170f7r);
        c1115350f89.h0(z);
        int dimensionPixelSize = c1115350f89.getContext().getResources().getDimensionPixelSize(R.dimen.aqu);
        RecyclerView recyclerView = c1115350f89.LL;
        if (recyclerView != null) {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), dimensionPixelSize);
        }
        this.LJIILIIL = c1115350f89;
        LJI();
        LJFF(!c1115350f89.LLJJI.isEmpty());
        c1115350f89.setEmoteSelectPanelCallback(new InterfaceC1115330f87() { // from class: X.0f7v
            @Override // X.InterfaceC1115330f87
            public final void LIZIZ(boolean z2) {
                this.LIZ.LJFF(z2);
            }
        });
        return c1115350f89;
    }

    @Override // X.AbstractC1115080f7i
    public final void LIZJ() {
        C1115170f7r c1115170f7r = this.LJIIL;
        if (c1115170f7r != null) {
            c1115170f7r.LJ(this);
        }
        InterfaceC1114320f6U interfaceC1114320f6U = this.LJIILL;
        if (interfaceC1114320f6U != null) {
            interfaceC1114320f6U.LIZIZ();
        }
    }

    @Override // X.AbstractC1115080f7i
    public final void LJ() {
        InterfaceC1114320f6U interfaceC1114320f6U = this.LJIILL;
        if (interfaceC1114320f6U != null) {
            interfaceC1114320f6U.LIZJ();
        }
    }

    public final void LJI() {
        if (this.LJIIJ) {
            C1115350f89 c1115350f89 = this.LJIILIIL;
            if (c1115350f89 == null || c1115350f89.LLJILLL) {
                return;
            }
            c1115350f89.LLJILLL = true;
            return;
        }
        C1115350f89 c1115350f892 = this.LJIILIIL;
        if (c1115350f892 == null || !c1115350f892.LLJILLL) {
            return;
        }
        c1115350f892.LLJILLL = false;
    }

    @Override // X.AbstractC1115080f7i
    public final void LIZ() {
        LJI();
    }

    public C1114970f7X(Context context) {
        super(context, EnumC584890Mwp.COMMENT);
    }

    @Override // X.AbstractC1115080f7i
    public final void LIZLLL(String str, boolean z) {
        List<? extends EmoteModel> list;
        if (z && (list = this.LJIILJJIL) != null) {
            if (Intrinsics.LJFF(str, "comment_panel")) {
                C1114370f6Z.LJII(this.LIZJ, list.size(), "click");
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_emoji_show");
            c474500IjALIZ.LJIJJLI(this.LIZJ);
            c474500IjALIZ.LJJII("comment_panel", "method");
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends EmoteModel> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().emoteId;
                str2.toString();
                arrayList.add(str2);
            }
            c474500IjALIZ.LJJII(arrayList, "emotes_label");
            c474500IjALIZ.LIZ();
        }
    }
}
