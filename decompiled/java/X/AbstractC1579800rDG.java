package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b6g.o;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1579800rDG<BLOCK_INFO extends o> extends AbstractC1579820rDI<BLOCK_INFO> {
    public final RecyclerView LLILLL;

    public abstract String getMainTitle();

    public abstract String getSubTitle();

    public final RecyclerView getRecyclerView() {
        return this.LLILLL;
    }

    public AbstractC1579800rDG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.f5g, this);
        TextView textView = (TextView) findViewById(R.id.zwv);
        textView.setTextColor(C1578770rBb.LIZ(context, R.attr.a1h));
        textView.setText(getMainTitle());
        TextView textView2 = (TextView) findViewById(R.id.tv_sub_title);
        textView2.setTextColor(C1578770rBb.LIZ(context, R.attr.a1k));
        textView2.setText(getSubTitle());
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.k0d);
        tuxIconView.setTintColor(C1578770rBb.LIZ(context, R.attr.a1k));
        if (C426750GoL.LIZLLL(context)) {
            tuxIconView.setIconRes(EnumC1578890rBn.ICON_CHEVRON_LEFT_SLIM_THIN_LTR.id());
        } else {
            tuxIconView.setIconRes(EnumC1578890rBn.ICON_CHEVRON_RIGHT_SLIM_THIN_LTR.id());
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rn0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new C346260Dho(recyclerView, 0));
        this.LLILLL = recyclerView;
    }
}
