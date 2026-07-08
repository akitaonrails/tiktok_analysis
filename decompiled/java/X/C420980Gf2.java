package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420980Gf2 extends RecyclerView.ViewHolder {
    public final View LL;
    public final Function1<IMContact, Unit> LLILLJJLI;
    public final View LLILLL;

    public final void I5(boolean z) {
        LinearLayout linearLayout = (LinearLayout) this.LLILLL.findViewById(R.id.xuh);
        if (z) {
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
                List listLJIIJJI = C1697810uHb.LJIIJJI(linearLayout.findViewById(R.id.g3d), linearLayout.findViewById(R.id.g3e), linearLayout.findViewById(R.id.g3f));
                Context context = linearLayout.getContext();
                float fLIZIZ = C0DYJ.LIZIZ(4, context);
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, C0DYJ.LIZIZ(8, context), C0DYJ.LIZIZ(8, context)), fLIZIZ, fLIZIZ, Path.Direction.CW);
                ShapeDrawable shapeDrawable = new ShapeDrawable();
                shapeDrawable.setShape(new PathShape(path, C0DYJ.LIZIZ(8, context), C0DYJ.LIZIZ(8, context)));
                Iterator it2 = listLJIIJJI.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).setBackground(shapeDrawable);
                }
                return;
            }
            return;
        }
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
    }

    public C420980Gf2(View view, C954803oI c954803oI) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = c954803oI;
        this.LLILLL = view.findViewById(R.id.j5s);
    }
}
