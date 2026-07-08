package X;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L68, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L68 extends PagerAdapter {
    public final List<LiveSubMediaModel> LLILLJJLI = new ArrayList();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public final void setData(List<LiveSubMediaModel> list) {
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
        notifyDataSetChanged();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        InterfaceC1320850kTb controller;
        LiveSubMediaModel liveSubMediaModel = (LiveSubMediaModel) ListProtector.get(this.LLILLJJLI, i);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hfm, viewGroup, false);
        viewGroup.addView(viewTd);
        C1322090kVb c1322090kVb = (C1322090kVb) viewTd.findViewById(R.id.kc9);
        Uri uriLIZ = C010V.LIZ(liveSubMediaModel.getFileLocalUriPath());
        if (uriLIZ == null) {
            uriLIZ = UriProtector.parse("file://");
        }
        ?? LIZ = C1325700kbQ.LIZLLL(uriLIZ).LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        if (c1322090kVb != null) {
            controller = c1322090kVb.getController();
        } else {
            controller = null;
        }
        c1320810kTXLIZJ.LJIILJJIL = controller;
        c1320810kTXLIZJ.LIZLLL = LIZ;
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        if (c1322090kVb != null) {
            c1322090kVb.setController(abstractC1320710kTNLIZ);
        }
        return viewTd;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        if (obj instanceof View) {
            return Intrinsics.LJFF(obj, view);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
        }
    }
}
