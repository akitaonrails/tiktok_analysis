package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746340TPk extends RecyclerView {
    public final int LL;
    public final int LLILLJJLI;
    public final C0TLX LLILLL;

    public final int getAvailableWidth() {
        return this.LLILLJJLI;
    }

    public final int getScreenWidth() {
        return this.LL;
    }

    public final void LIZJ(List<C0TLZ> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = (this.LLILLJJLI - ((arrayList.size() - 1) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)))) / arrayList.size();
        TextView textView = (TextView) C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dld, this, false).findViewById(R.id.o88);
        TextPaint textPaint = new TextPaint(textView.getPaint());
        Iterator it2 = arrayList.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (C20588115hH.LIZLLL(textView, ((C0TLZ) it2.next()).LIZ, textPaint, this.LL, Float.valueOf(textView.getTextSize()), true).getLineWidth(0) + textView.getPaddingStart() + textView.getPaddingEnd() > size) {
                z = true;
            }
        }
        C0TLX c0tlx = this.LLILLL;
        ((ArrayList) c0tlx.LL).clear();
        ((ArrayList) c0tlx.LL).addAll(arrayList);
        c0tlx.LLILLJJLI = z;
        c0tlx.LLILLL = size;
        c0tlx.notifyDataSetChanged();
    }

    public final void setCallback(Function1<? super Integer, Unit> function1) {
        this.LLILLL.LLILZ = function1;
    }

    public C746340TPk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C746340TPk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int screenWidth = ScreenUtils.getScreenWidth(context);
        this.LL = screenWidth;
        this.LLILLJJLI = screenWidth - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2);
        C0TLX c0tlx = new C0TLX();
        this.LLILLL = c0tlx;
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0, 0);
        setAdapter(c0tlx);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
