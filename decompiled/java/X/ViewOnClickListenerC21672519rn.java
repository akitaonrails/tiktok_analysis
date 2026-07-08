package X;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ViewOnClickListenerC21672519rn extends AbstractC21673019rs implements View.OnClickListener {
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;

    public ViewOnClickListenerC21672519rn() {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle extras;
        super.notifyDataSetChanged();
        Cursor cursor = this.LLILLJJLI;
        if (cursor == null || (extras = cursor.getExtras()) == null) {
            return;
        }
        extras.getBoolean("in_progress");
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle extras;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.LLILLJJLI;
        if (cursor == null || (extras = cursor.getExtras()) == null) {
            return;
        }
        extras.getBoolean("in_progress");
    }

    public static final Drawable LJ(String str) {
        if (str == null || str.isEmpty() || CardStruct.IStatusCode.DEFAULT.equals(str)) {
            return null;
        }
        try {
            CastIntegerProtector.parseInt(str);
            C2188811AlT.LIZ().append("android.resource://");
            throw null;
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw null;
        }
    }

    @Override // X.AbstractC21672619ro
    public final void LIZJ(Cursor cursor) {
        try {
            super.LIZJ(cursor);
            if (cursor != null) {
                this.LLILZLL = cursor.getColumnIndex("suggest_text_1");
                this.LLIZ = cursor.getColumnIndex("suggest_text_2");
                this.LLIZLLLIL = cursor.getColumnIndex("suggest_text_2_url");
                this.LLJ = cursor.getColumnIndex("suggest_icon_1");
                this.LLJI = cursor.getColumnIndex("suggest_icon_2");
                this.LLJIJIL = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC21672619ro
    public final View LIZLLL(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(null, 0, viewGroup, false);
        viewTd.setTag(new C21672819rq(viewTd));
        ((ImageView) viewTd.findViewById(R.id.grb)).setImageResource(0);
        return viewTd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!(view.getTag() instanceof CharSequence)) {
        } else {
            throw null;
        }
    }

    public static String LJFF(int i, Cursor cursor) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.AbstractC21672619ro
    public final void LIZIZ(View view, Cursor cursor) {
        int i;
        C21672819rq c21672819rq = (C21672819rq) view.getTag();
        int i2 = this.LLJIJIL;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (c21672819rq.LIZ != null) {
            String strLJFF = LJFF(this.LLILZLL, cursor);
            TextView textView = c21672819rq.LIZ;
            textView.setText(strLJFF);
            if (TextUtils.isEmpty(strLJFF)) {
                C786410Ut5.LLIL(textView, 8);
            } else {
                C786410Ut5.LLIL(textView, 0);
            }
        }
        if (c21672819rq.LIZIZ != null) {
            if (LJFF(this.LLIZLLLIL, cursor) == null) {
                String strLJFF2 = LJFF(this.LLIZ, cursor);
                if (TextUtils.isEmpty(strLJFF2)) {
                    TextView textView2 = c21672819rq.LIZ;
                    if (textView2 != null) {
                        textView2.setSingleLine(false);
                        c21672819rq.LIZ.setMaxLines(2);
                    }
                } else {
                    TextView textView3 = c21672819rq.LIZ;
                    if (textView3 != null) {
                        textView3.setSingleLine(true);
                        c21672819rq.LIZ.setMaxLines(1);
                    }
                }
                TextView textView4 = c21672819rq.LIZIZ;
                textView4.setText(strLJFF2);
                if (TextUtils.isEmpty(strLJFF2)) {
                    C786410Ut5.LLIL(textView4, 8);
                } else {
                    C786410Ut5.LLIL(textView4, 0);
                }
            } else {
                new TypedValue();
                throw null;
            }
        }
        ImageView imageView = c21672819rq.LIZJ;
        if (imageView != null) {
            int i3 = this.LLJ;
            if (i3 == -1) {
                imageView.setImageDrawable(null);
                C786410Ut5.LJZI(4, imageView);
            } else {
                LJ(cursor.getString(i3));
                throw null;
            }
        }
        ImageView imageView2 = c21672819rq.LIZLLL;
        if (imageView2 != null) {
            int i4 = this.LLJI;
            if (i4 != -1) {
                LJ(cursor.getString(i4));
            }
            imageView2.setImageDrawable(null);
            C786410Ut5.LJZI(8, imageView2);
        }
        int i5 = this.LLILZIL;
        if (i5 == 2 || (i5 == 1 && (i & 1) != 0)) {
            C786410Ut5.LJZI(0, c21672819rq.LJ);
            c21672819rq.LJ.setTag(c21672819rq.LIZ.getText());
            C786410Ut5.Q7(c21672819rq.LJ, this);
            return;
        }
        C786410Ut5.LJZI(8, c21672819rq.LJ);
    }

    @Override // X.AbstractC21672619ro, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            View viewTd = C786410Ut5.Td(null, 0, viewGroup, false);
            if (viewTd != null) {
                ((C21672819rq) viewTd.getTag()).LIZ.setText(e.toString());
            }
            return viewTd;
        }
    }

    @Override // X.AbstractC21672619ro, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            View viewLIZLLL = LIZLLL(viewGroup);
            ((C21672819rq) viewLIZLLL.getTag()).LIZ.setText(e.toString());
            return viewLIZLLL;
        }
    }
}
