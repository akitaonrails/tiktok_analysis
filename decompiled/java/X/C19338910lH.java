package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.BaseAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.10lH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19338910lH extends BaseAdapter {
    public final List<NewFaceStickerBean> LL = new ArrayList();
    public final Context LLILLJJLI;
    public int LLILLL;
    public final InterfaceC19338210lA LLILZ;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<NewFaceStickerBean> list = this.LL;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    public C19338910lH(C19EG c19eg, C19338810lG c19338810lG) {
        this.LLILLJJLI = c19eg;
        this.LLILZ = c19338810lG;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C19339010lI c19339010lI;
        if (view == null) {
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.LLILLJJLI);
            this.LLILZ.LIZ();
            view = C786410Ut5.Td(layoutInflaterNe, R.layout.cyg, viewGroup, false);
            c19339010lI = new C19339010lI();
            c19339010lI.LIZ = view.findViewById(R.id.kg5);
            c19339010lI.LIZIZ = (RemoteImageView) view.findViewById(R.id.w6z);
            view.setTag(c19339010lI);
        } else {
            c19339010lI = (C19339010lI) view.getTag();
        }
        c19339010lI.LIZIZ.getHierarchy().LJJ(R.drawable.d_0);
        C1324840ka2.LJFF(c19339010lI.LIZIZ, ((NewFaceStickerBean) ListProtector.get(this.LL, i)).iconUrl);
        if (((NewFaceStickerBean) ListProtector.get(this.LL, i)).mIsSelect) {
            C786410Ut5.LJLLLLLL(0, c19339010lI.LIZ);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c19339010lI.LIZ, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            C786410Ut5.Pd(objectAnimatorOfFloat);
            return view;
        }
        C786410Ut5.LJLLLLLL(4, c19339010lI.LIZ);
        return view;
    }
}
