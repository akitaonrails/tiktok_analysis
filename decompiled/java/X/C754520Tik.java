package X;

import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Tik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754520Tik extends FrameLayout implements InterfaceC2176911AHp {
    public final ViewGroup LL;
    public final RecyclerView LLILLJJLI;
    public final C376750Ept LLILLL;
    public final C1324720kZq LLILZ;
    public C754490Tih LLILZIL;

    @Override // X.InterfaceC2176911AHp
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC2176911AHp
    public final void LIZ() {
        C1324720kZq c1324720kZq = this.LLILZ;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
    }

    public C754520Tik(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hwq, this, true);
        this.LL = (ViewGroup) findViewById(R.id.vertical_gift_bar_panel);
        this.LLILLJJLI = (RecyclerView) findViewById(R.id.vertical_gift_picked_list);
        this.LLILLL = (C376750Ept) findViewById(R.id.hjl);
        this.LLILZ = (C1324720kZq) findViewById(R.id.viewer_wishes_banner);
    }

    @Override // X.InterfaceC2176911AHp
    public void setBanner(ImageModel imageModel) {
        C1324720kZq c1324720kZq = this.LLILZ;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
        }
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJIILL = new float[]{C418440Gaw.LIZIZ(6), C418440Gaw.LIZIZ(6), 0.0f, 0.0f};
        c1324610kZfLJIIIZ.LJJI(this.LLILZ);
    }

    @Override // X.InterfaceC2176911AHp
    public void setGiftList(List<GiftPickWithScore> list) {
        if (this.LLILZIL == null) {
            C754490Tih c754490Tih = new C754490Tih(list);
            this.LLILZIL = c754490Tih;
            RecyclerView recyclerView = this.LLILLJJLI;
            if (recyclerView != null) {
                recyclerView.setAdapter(c754490Tih);
            }
            RecyclerView recyclerView2 = this.LLILLJJLI;
            if (recyclerView2 != null) {
                final Context context = getContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager(context) { // from class: com.bytedance.android.livesdk.viewerwishes.common.ui.VerticalGiftBarFeedView$setGiftList$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final boolean canScrollVertically() {
                        return false;
                    }
                });
            }
        }
        C754490Tih c754490Tih2 = this.LLILZIL;
        if (c754490Tih2 != null) {
            c754490Tih2.LL = list;
            c754490Tih2.notifyDataSetChanged();
        }
        RecyclerView recyclerView3 = this.LLILLJJLI;
        if (recyclerView3 != null) {
            HandlerHook.viewPost(recyclerView3, new ARunnableS81S0200000_12(list, this, 42));
        }
    }
}
