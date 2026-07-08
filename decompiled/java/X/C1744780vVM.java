package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SpecificationLink;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0vVM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744780vVM extends FrameLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public boolean LLILLL;
    public Specification LLILZ;
    public Function2<? super SpecificationLink, ? super C1744780vVM, Unit> LLILZIL;

    public final TuxTextView getSpecNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt2);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getSpecValueFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt_);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final Function2<SpecificationLink, C1744780vVM, Unit> getOnClickListener() {
        return this.LLILZIL;
    }

    public final Specification getSpecification() {
        return this.LLILZ;
    }

    public C1744780vVM(Context context) {
        super(context, null, 0);
        C1755600vmo.LIZ.getClass();
        C1755600vmo.LIZ(R.layout.awk, context, this, true, true);
    }

    public final void setClickListener(Function2<? super SpecificationLink, ? super C1744780vVM, Unit> function2) {
        this.LLILZIL = function2;
    }

    public final void setDownloading(boolean z) {
        this.LLILLL = z;
    }

    public final void setOnClickListener(Function2<? super SpecificationLink, ? super C1744780vVM, Unit> function2) {
        this.LLILZIL = function2;
    }

    public final void setSpecNameFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setSpecValueFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setSpecification(Specification specification) {
        this.LLILZ = specification;
    }
}
