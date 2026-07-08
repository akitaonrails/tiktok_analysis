package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.ui.MediaSelectionFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.147A, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C147A extends AnonymousClass1118 implements View.OnClickListener {
    public C1322110kVd LL;
    public C418950Gbl LLILLJJLI;
    public ImageView LLILLL;
    public TextView LLILZ;
    public Item LLILZIL;
    public C147B LLILZLL;
    public C147D LLIZ;

    public Item getMedia() {
        return this.LLILZIL;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C147D c147d = this.LLIZ;
        if (c147d != null) {
            if (view == this.LL) {
                Item item = this.LLILZIL;
                RecyclerView.ViewHolder viewHolder = this.LLILZLL.LIZJ;
                MediaSelectionFragment mediaSelectionFragment = ((C147I) c147d).LLILZLL;
                if (mediaSelectionFragment != null) {
                    mediaSelectionFragment.gL(null, item, viewHolder.getAdapterPosition());
                    return;
                }
                return;
            }
            if (view != this.LLILLJJLI) {
                return;
            }
            Item item2 = this.LLILZIL;
            RecyclerView.ViewHolder viewHolder2 = this.LLILZLL.LIZJ;
            C147I c147i = (C147I) c147d;
            if (c147i.LLILZ.LJFF) {
                if (c147i.LLILLL.LIZIZ(item2) == Integer.MIN_VALUE) {
                    Context context = viewHolder2.itemView.getContext();
                    AnonymousClass1474 anonymousClass1474LIZLLL = c147i.LLILLL.LIZLLL(item2);
                    AnonymousClass1474.LIZ(context, anonymousClass1474LIZLLL);
                    if (anonymousClass1474LIZLLL != null) {
                        return;
                    }
                    c147i.LLILLL.LIZ(item2);
                    c147i.LLLI();
                    return;
                }
                c147i.LLILLL.LJI(item2);
                c147i.LLLI();
                return;
            }
            if (c147i.LLILLL.LIZIZ.contains(item2)) {
                c147i.LLILLL.LJI(item2);
                c147i.LLLI();
                return;
            }
            Context context2 = viewHolder2.itemView.getContext();
            AnonymousClass1474 anonymousClass1474LIZLLL2 = c147i.LLILLL.LIZLLL(item2);
            AnonymousClass1474.LIZ(context2, anonymousClass1474LIZLLL2);
            if (anonymousClass1474LIZLLL2 != null) {
                return;
            }
            c147i.LLILLL.LIZ(item2);
            c147i.LLLI();
        }
    }

    public void setCheckEnabled(boolean z) {
        this.LLILLJJLI.setEnabled(z);
    }

    public void setChecked(boolean z) {
        this.LLILLJJLI.setChecked(z);
    }

    public void setCheckedNum(int i) {
        this.LLILLJJLI.setCheckedNum(i);
    }

    public void setOnMediaGridClickListener(C147D c147d) {
        this.LLIZ = c147d;
    }

    public C147A(final Context context, final AttributeSet attributeSet) {
        new FrameLayout(context, attributeSet) { // from class: X.1118
            @Override // android.widget.FrameLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, i);
            }
        };
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dl2, this, true);
        this.LL = (C1322110kVd) findViewById(R.id.o5f);
        this.LLILLJJLI = (C418950Gbl) findViewById(R.id.dqj);
        this.LLILLL = (ImageView) findViewById(R.id.ivb);
        this.LLILZ = (TextView) findViewById(R.id.video_duration);
        C786410Ut5.q9(this.LL, this);
        C786410Ut5.Va(this.LLILLJJLI, this);
    }
}
