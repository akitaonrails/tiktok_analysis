package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0H3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0H3Z extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final ImageView LLILLJJLI;

    public C0H3Z(View view) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.wxe);
        ImageView imageView = null;
        if (textView == null) {
            if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
                textView = (TextView) I5(viewGroup2, TextView.class);
            } else {
                textView = null;
            }
        }
        this.LL = textView;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.wyl);
        if (imageView2 == null) {
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                imageView = (ImageView) I5(viewGroup, ImageView.class);
            }
        } else {
            imageView = imageView2;
        }
        this.LLILLJJLI = imageView;
    }

    public static Object I5(ViewGroup viewGroup, Class cls) {
        Object objI5;
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                objI5 = (View) c09re.next();
                if (cls.isAssignableFrom(objI5.getClass()) || ((objI5 instanceof ViewGroup) && (objI5 = I5((ViewGroup) objI5, cls)) != null)) {
                    break;
                }
            } else {
                return null;
            }
        }
        return objI5;
    }
}
