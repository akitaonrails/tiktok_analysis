package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: renamed from: X.0Gqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C428380Gqy extends ConstraintLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public RelativeLayout LL;
    public TextView LLILLJJLI;
    public final InterfaceC428400Gr0 LLILLL;
    public final InterfaceC428390Gqz LLILZ;
    public int LLILZIL;

    public final TextView getCreatorPanelBottomTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f8h);
            this.LLILLJJLI = (TextView) callbackFindViewById;
        }
        return (TextView) callbackFindViewById;
    }

    public final RelativeLayout getCreatorPanelCompleteRlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f8i);
            this.LL = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public View getCloseView() {
        return getCreatorPanelCompleteRlFromXml();
    }

    public TextView getContainerTitleView() {
        return getCreatorPanelBottomTitleFromXml();
    }

    public int getLayoutId() {
        return this.LLILZIL;
    }

    public final void setCreatorPanelBottomTitleFromXml(TextView textView) {
        this.LLILLJJLI = textView;
    }

    public final void setCreatorPanelCompleteRlFromXml(RelativeLayout relativeLayout) {
        this.LL = relativeLayout;
    }

    public void setLayoutId(int i) {
        this.LLILZIL = i;
    }

    public C428380Gqy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = C428410Gr1.LIZ().LIZ();
        this.LLILZ = C428420Gr2.LIZ().LIZ(EnumC429050Gs3.Small);
        this.LLILZIL = R.layout.ag3;
    }

    public final void e0(Integer num, Function1<? super View, Unit> function1) {
        if (num != null) {
            num.intValue();
            if (num.intValue() == 1) {
                this.LLILZ.hide();
                this.LLILLL.LJLJLJ();
            } else {
                if (num.intValue() != 3 && num.intValue() != 0) {
                    if (num.intValue() != 2) {
                        return;
                    }
                    this.LLILLL.LJJJJL();
                    this.LLILZ.LIZJ(new AwS372S0200000_6(this, (C428380Gqy) function1, (Function1<? super View, Unit>) 6));
                    this.LLILZ.LIZIZ(EnumC429200GsI.NoNetwork);
                    return;
                }
                this.LLILLL.LJJJJL();
                this.LLILZ.hide();
            }
        }
    }
}
