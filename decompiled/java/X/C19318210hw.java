package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10hw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19318210hw extends C19318010hu {
    @Override // X.C19318010hu
    public final void LIZIZ() {
        C786410Ut5.Td(getLayoutInflater(), R.layout.a5j, this, true);
        setContainer((LinearLayout) findViewById(R.id.q2y));
        setYearPicker((C12KT) findViewById(R.id.year_picker));
        setMonthPicker((C12KT) findViewById(R.id.okh));
        setDayOfMonthPicker((C12KT) findViewById(R.id.fg5));
        C12KT monthPicker = getMonthPicker();
        if (monthPicker != null) {
            int visibility = monthPicker.getVisibility();
            monthPicker.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, monthPicker);
        }
        C12KT dayOfMonthPicker = getDayOfMonthPicker();
        if (dayOfMonthPicker != null) {
            int visibility2 = dayOfMonthPicker.getVisibility();
            dayOfMonthPicker.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, dayOfMonthPicker);
        }
        C12KT yearPicker = getYearPicker();
        if (yearPicker != null) {
            yearPicker.LLLIL = this;
        }
    }

    public C19318210hw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
