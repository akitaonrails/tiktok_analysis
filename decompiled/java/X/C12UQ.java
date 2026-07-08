package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12UQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12UQ extends RecyclerView.ViewHolder {
    public final ImageView LL;
    public C1323050kX9<AbstractC1325130kaV> LLILLJJLI;
    public final /* synthetic */ C12UP LLILLL;

    public final void I5(Bitmap bitmap) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LL.getLayoutParams();
        C12UP c12up = this.LLILLL;
        int i = c12up.LLJILJIL % c12up.LLJILJILJ.LJ;
        int width = (bitmap.getWidth() * i) / this.LLILLL.LLJILJILJ.LJ;
        if (i != 0 && width > 0 && width < bitmap.getWidth()) {
            marginLayoutParams.width = i;
            this.LL.setImageBitmap(Bitmap.createBitmap(bitmap, 0, 0, width, bitmap.getHeight()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12UQ(C12UP c12up, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cx3, viewGroup, false));
        this.LLILLL = c12up;
        this.LL = (ImageView) this.itemView.findViewById(R.id.lxl);
    }

    public final void L5(C1323050kX9<AbstractC1325130kaV> c1323050kX9, boolean z) {
        Bitmap underlyingBitmap = c1323050kX9.get().getUnderlyingBitmap();
        if (underlyingBitmap != null && !underlyingBitmap.isRecycled() && this.LL != null) {
            C1323050kX9.LJII(this.LLILLJJLI);
            this.LLILLJJLI = c1323050kX9;
            this.LL.setImageBitmap(underlyingBitmap);
            if (!z) {
                return;
            }
            I5(underlyingBitmap);
        }
    }
}
