package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eOZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087090eOZ extends FrameLayout {
    public final C150Z LL;
    public TextView LLILLJJLI;
    public final Integer LLILLL;
    public final Integer LLILZ;
    public Boolean LLILZIL;

    public final TextView getContent() {
        return this.LLILLJJLI;
    }

    public final C150Z getItemModule() {
        return this.LL;
    }

    public final void setContent(TextView textView) {
        this.LLILLJJLI = textView;
    }

    public C1087090eOZ(C150Z c150z, Context context) {
        super(context, null, 0);
        this.LL = c150z;
        this.LLILLL = C1308910kAL.LIZJ(R.attr.ee, context);
        this.LLILZ = C1308910kAL.LIZJ(R.attr.eh, context);
        this.LLILLJJLI = (TextView) C786410Ut5.Sd(R.layout.dbd, C786410Ut5.ne(context), this).findViewById(R.id.ce_);
        Integer num = c150z.LJ;
        String string = (num == null || (string = context.getString(num.intValue())) == null) ? c150z.LIZLLL : string;
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setText(string);
        }
    }
}
