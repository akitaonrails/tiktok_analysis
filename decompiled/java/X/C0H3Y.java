package X;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H3Y, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0H3Y<T> extends C0H3W<C434780H3c<T>, C0H3Z> {
    public int LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    private final int getNormalTabTextColor() {
        return ((Number) this.LLILZLL.getValue()).intValue();
    }

    private final int getSelTabTextColor() {
        return ((Number) this.LLIZ.getValue()).intValue();
    }

    public final int getViewHolderLayoutId() {
        return this.LLILZIL;
    }

    public final void setViewHolderLayoutId(int i) {
        this.LLILZIL = i;
    }

    public C0H3Y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.C0H3W
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj) {
        C0H3Z c0h3z = (C0H3Z) viewHolder;
        super.LIZLLL(c0h3z, obj);
        TextView textView = c0h3z.LL;
        if (textView != null) {
            obj.getClass();
            textView.setText((CharSequence) null);
            textView.setTextColor(getNormalTabTextColor());
            textView.setTypeface(Typeface.DEFAULT);
        }
        ImageView imageView = c0h3z.LLILLJJLI;
        if (imageView != null) {
            obj.getClass();
            C786410Ut5.LJZI(4, imageView);
        }
    }

    @Override // X.C0H3W
    public final RecyclerView.ViewHolder LJ(ViewGroup viewGroup, int i) {
        return new C0H3Z(C786410Ut5.LJLLJ(viewGroup.getContext(), this.LLILZIL, null));
    }

    @Override // X.C0H3W
    public final void LJFF(RecyclerView.ViewHolder viewHolder, Object obj) {
        View view;
        if (viewHolder != null && (view = viewHolder.itemView) != null) {
            view.setSelected(true);
        }
    }

    public C0H3Y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = R.layout.bij;
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1394));
        this.LLIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(536));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
