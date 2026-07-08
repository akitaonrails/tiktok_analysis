package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344300Dee extends RecyclerView.ViewHolder {
    public final View LL;
    public final Function1<IMContact, Unit> LLILLJJLI;
    public final View LLILLL;

    public C344300Dee(View view, C344290Ded c344290Ded) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = c344290Ded;
        this.LLILLL = view.findViewById(R.id.mso);
    }
}
