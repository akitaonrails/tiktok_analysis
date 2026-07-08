package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0HmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450950HmH extends BaseAdapter {
    public final List<C451030HmP> LL = new ArrayList();

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return ((ArrayList) this.LL).size();
    }

    public C450950HmH(C450960HmI c450960HmI) {
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ListProtector.get(this.LL, i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C444100HbE c444100HbE;
        int i2;
        C451030HmP c451030HmP = (C451030HmP) ListProtector.get(this.LL, i);
        if (view != null && c451030HmP != null && c451030HmP.equals(view.getTag(R.id.m2c))) {
            return view;
        }
        if (view == null) {
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
            if (i == ((ArrayList) this.LL).size() - 1) {
                i2 = R.layout.c3r;
            } else {
                i2 = R.layout.c3p;
            }
            view = C786410Ut5.Td(layoutInflaterNe, i2, viewGroup, false);
            c444100HbE = new C444100HbE(view);
            view.setTag(R.id.f748m2b, c444100HbE);
        } else {
            c444100HbE = (C444100HbE) view.getTag(R.id.f748m2b);
        }
        view.setTag(R.id.m2c, c451030HmP);
        if (c451030HmP == null) {
            c444100HbE.getClass();
        } else {
            if (c444100HbE.LL != null) {
                if (c451030HmP.LIZLLL() && c451030HmP.LIZJ.getStaticUrl() != null) {
                    C1331070kk5 hierarchy = c444100HbE.LL.getHierarchy();
                    hierarchy.LJIJ(hierarchy.LIZIZ.getDrawable(R.drawable.bq4), 5);
                    c444100HbE.LL.getHierarchy().LJJ(R.drawable.bq4);
                } else {
                    c444100HbE.LL.getHierarchy().LJIJ(null, 5);
                    c444100HbE.LL.getHierarchy().LJIJ(null, 1);
                }
            }
            c444100HbE.itemView.getContext();
            if (c451030HmP.LIZLLL() && (c451030HmP.LIZJ instanceof ImSysEmojiModel)) {
                TextView textView = c444100HbE.LLILLJJLI;
                if (textView != null) {
                    C786410Ut5.LLIL(textView, 0);
                    c444100HbE.LLILLJJLI.setText(((ImSysEmojiModel) c451030HmP.LIZJ).getPreviewEmoji());
                    c444100HbE.LLILLJJLI.setContentDescription(c451030HmP.LIZIZ);
                    return view;
                }
            } else {
                if (c444100HbE.LL != null) {
                    if (!c451030HmP.LIZLLL() && c451030HmP.LIZ > 0) {
                        C786410Ut5.l(c444100HbE.LL, 0);
                        c444100HbE.LL.setImageResource(c451030HmP.LIZ);
                        c444100HbE.LL.setContentDescription(c451030HmP.LIZIZ);
                    } else {
                        C786410Ut5.l(c444100HbE.LL, 8);
                    }
                }
                TextView textView2 = c444100HbE.LLILLJJLI;
                if (textView2 != null) {
                    C786410Ut5.LLIL(textView2, 8);
                    return view;
                }
            }
        }
        return view;
    }
}
