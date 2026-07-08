package X;

import Y.ACListenerS52S0400000_16;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.AnoleAdCardModel;
import com.ss.android.ugc.aweme.model.AnoleProductModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0H9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H9Y extends AbstractC683590Qrd<AnoleProductModel> {
    public Map<Integer, ? extends Object> LL;
    public AwemeRawAd LLILLJJLI;
    public AnoleAdCardModel LLILLL;

    public C0H9Y() {
        super(false);
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AnoleProductModel anoleProductModel;
        Object obj;
        Bitmap bitmap;
        List<T> list = this.mmItems;
        if (list != 0 && i >= 0 && i < list.size() && (anoleProductModel = (AnoleProductModel) ListProtector.get(list, i)) != null) {
            C0H9X c0h9x = (C0H9X) viewHolder;
            c0h9x.LLILZ = i;
            AnoleAdCardModel anoleAdCardModel = this.LLILLL;
            Map<Integer, ? extends Object> map = this.LL;
            if (map != null) {
                obj = map.get(Integer.valueOf(i));
            } else {
                obj = null;
            }
            if (obj instanceof Bitmap) {
                bitmap = (Bitmap) obj;
            } else {
                bitmap = null;
            }
            AwemeRawAd awemeRawAd = this.LLILLJJLI;
            if (awemeRawAd != null) {
                ViewGroup.LayoutParams layoutParams = c0h9x.LL.getLayoutParams();
                int i2 = C0H9X.LLILZIL;
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C0H9Z.LIZ())));
                c0h9x.LL.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C0H9Z.LIZ())));
                if ((bitmap instanceof Bitmap) && bitmap != null) {
                    c0h9x.LLILLJJLI.setImageBitmap(bitmap);
                } else {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0H9U(anoleProductModel, c0h9x, null), 3);
                }
                c0h9x.LLILLL.setText(anoleProductModel.getDescription());
                C786410Ut5.I7(new ACListenerS52S0400000_16(anoleProductModel, anoleAdCardModel, awemeRawAd, c0h9x, 3), c0h9x.itemView);
            }
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            return null;
        }
        return new C0H9X(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.qw, viewGroup, false));
    }
}
