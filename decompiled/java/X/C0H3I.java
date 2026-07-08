package X;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H3I, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H3I extends C214906198m {
    public final Activity LL;
    public final View LLILLJJLI;
    public final C0H3F LLILLL;
    public C0H3J LLILZ;
    public List<String> LLILZIL;
    public int LLILZLL;

    public C0H3I(Activity activity, C450580Hlg c450580Hlg) {
        super(activity);
        this.LL = activity;
        this.LLILZIL = C13BV.INSTANCE;
        this.LLILZLL = -1;
        setOutsideTouchable(false);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        C0H3F c0h3f = new C0H3F();
        this.LLILLL = c0h3f;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(activity), R.layout.c41, c450580Hlg, false);
        this.LLILLJJLI = viewTd;
        RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.ms4);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity, 0, false));
        recyclerView.addItemDecoration(new C423510Gj7(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))));
        recyclerView.setAdapter(c0h3f);
        setContentView(viewTd);
    }

    public final void LJJIIJ(List<String> list, MotionEvent motionEvent, int i, View view) {
        int width;
        int rawX;
        int size;
        if (list.isEmpty()) {
            return;
        }
        if (!Intrinsics.LJFF(list, this.LLILZIL) || i != this.LLILZLL) {
            this.LLILZIL = list;
            this.LLILZLL = i;
            C0H3F c0h3f = this.LLILLL;
            c0h3f.LLILLJJLI = list;
            c0h3f.LLILLL = 0;
            List<C0H3H> data = c0h3f.getData();
            if (!list.isEmpty() && data != null) {
                data.clear();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Boolean.valueOf(data.add(new C0H3H(it2.next()))));
                }
                c0h3f.notifyDataSetChanged();
            }
            this.LLILLL.notifyDataSetChanged();
            if (this.LLILLL.getItemCount() == 1) {
                setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(61)));
                setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(61)));
                this.LLILLJJLI.setBackground(new C386980FFg(getWidth(), getHeight(), this.LLILLJJLI.getContext()));
            } else {
                setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(255)));
                setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(61)));
                Rect rect = new Rect();
                if (view != null) {
                    view.getGlobalVisibleRect(rect);
                }
                int iCenterX = rect.centerX();
                Rect rect2 = new Rect();
                this.LL.getWindow().getDecorView().getGlobalVisibleRect(rect2);
                if (iCenterX < getWidth() / 2) {
                    width = iCenterX - (getWidth() / 2);
                } else if (rect2.right - iCenterX < getWidth() / 2) {
                    width = (getWidth() / 2) - (rect2.right - iCenterX);
                } else {
                    width = 0;
                }
                this.LLILLJJLI.setBackground(new C386990FFh(this.LLILLJJLI.getContext(), getWidth(), getHeight(), width));
            }
        }
        int[] iArr = new int[2];
        this.LLILLJJLI.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        if (this.LLILLJJLI.getWidth() <= 0) {
            return;
        }
        int width2 = this.LLILLJJLI.getWidth() / list.size();
        float f = i2;
        if (motionEvent.getRawX() <= f) {
            rawX = 0;
        } else if (motionEvent.getRawX() >= i2 + this.LLILLJJLI.getWidth()) {
            rawX = list.size() - 1;
        } else {
            rawX = (int) ((motionEvent.getRawX() - f) / width2);
            int size2 = list.size() - 1;
            if (rawX > size2) {
                rawX = size2;
            }
        }
        C0H3F c0h3f2 = this.LLILLL;
        if (c0h3f2.LLILLL != rawX) {
            if (rawX >= c0h3f2.getData().size()) {
                size = c0h3f2.getData().size() - 1;
            } else {
                size = rawX;
            }
            ((C0H3H) ListProtector.get(c0h3f2.getData(), c0h3f2.LLILLL)).LIZIZ = false;
            ((C0H3H) ListProtector.get(c0h3f2.getData(), size)).LIZIZ = true;
            c0h3f2.LLILLL = size;
            c0h3f2.notifyDataSetChanged();
        }
        if (motionEvent.getAction() == 1) {
            C0H3J c0h3j = this.LLILZ;
            if (c0h3j != null) {
                c0h3j.O2(i, (String) ListProtector.get(list, rawX), list);
            }
            dismiss();
        }
    }
}
