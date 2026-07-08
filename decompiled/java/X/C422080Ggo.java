package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ggo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422080Ggo extends C0DXR {
    public final Context LL;
    public final Map<EnumC429110Gs9, Boolean> LLILLJJLI;
    public final Function1<Integer, Integer> LLILLL;
    public final Function1<Integer, EnumC429110Gs9> LLILZ;
    public final Function2<EnumC429110Gs9, Boolean, Unit> LLILZIL;
    public C422100Ggq LLILZLL;
    public EnumC429110Gs9 LLIZ;
    public int LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1290));

    public final void LJ(View view, ViewGroup viewGroup) {
        view.measure(View.MeasureSpec.makeMeasureSpec((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)), 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        this.LLIZLLLIL = view.getMeasuredHeight();
    }

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        LinearLayoutManager linearLayoutManager;
        EnumC429110Gs9 enumC429110Gs9Invoke;
        String string;
        float paddingLeft;
        int childCount = recyclerView.getChildCount();
        if (childCount == 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || linearLayoutManager.findFirstVisibleItemPosition() == -1) {
            return;
        }
        if (this.LLILZLL == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.fnk, recyclerView, false);
            this.LLILZLL = new C422100Ggq(viewTd);
            LJ(viewTd, recyclerView);
        }
        C422100Ggq c422100Ggq = this.LLILZLL;
        if (c422100Ggq == null) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i));
            if (childAdapterPosition != -1 && (enumC429110Gs9Invoke = this.LLILZ.invoke(Integer.valueOf(childAdapterPosition))) != null) {
                this.LLIZ = enumC429110Gs9Invoke;
                View view = c422100Ggq.LIZ;
                TuxTextView tuxTextView = c422100Ggq.LIZIZ;
                int i2 = C422120Ggs.LIZ[enumC429110Gs9Invoke.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            string = "";
                        } else {
                            string = this.LL.getString(2131822479);
                        }
                    } else {
                        string = this.LL.getString(2131822483);
                    }
                } else {
                    string = this.LL.getString(2131822484);
                }
                tuxTextView.setText(string);
                TuxIconView tuxIconView = c422100Ggq.LIZJ;
                if (Intrinsics.LJFF(this.LLILLJJLI.get(enumC429110Gs9Invoke), Boolean.TRUE)) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_up_fill;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                    c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, tuxIconView.getContext());
                    tuxIconView.setTuxIcon(c419910GdJ);
                } else {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_chevron_down_fill;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                    c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, tuxIconView.getContext());
                    tuxIconView.setTuxIcon(c419910GdJ2);
                }
                LJ(view, recyclerView);
                if (C426750GoL.LIZLLL(this.LL)) {
                    paddingLeft = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - recyclerView.getPaddingLeft();
                } else {
                    paddingLeft = recyclerView.getPaddingLeft();
                }
                int iSave = canvas.save();
                canvas.translate(paddingLeft, 0.0f);
                try {
                    ((Drawable) this.LLJ.getValue()).setBounds(0, 0, view.getWidth(), view.getHeight());
                    ((Drawable) this.LLJ.getValue()).draw(canvas);
                    view.draw(canvas);
                    canvas.restoreToCount(iSave);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && this.LLILLL.invoke(Integer.valueOf(childAdapterPosition)).intValue() == 1) {
            rect.top = 0;
        }
    }

    public C422080Ggo(Context context, Map map, AwS606S0100000_27 awS606S0100000_27, AwS606S0100000_27 awS606S0100000_272, AwS646S0100000_32 awS646S0100000_32) {
        this.LL = context;
        this.LLILLJJLI = map;
        this.LLILLL = awS606S0100000_27;
        this.LLILZ = awS606S0100000_272;
        this.LLILZIL = awS646S0100000_32;
    }
}
