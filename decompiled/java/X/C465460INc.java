package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0INc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465460INc extends RecyclerView.ViewHolder {
    public final Map<String, String> LL;
    public final View LLILLJJLI;
    public final C16F5 LLILLL;
    public final C20744016Fi LLILZ;

    public C465460INc(View view, Map<String, String> map) {
        super(view);
        this.LL = map;
        this.LLILLJJLI = view.findViewById(R.id.yuj);
        this.LLILLL = (C16F5) view.findViewById(R.id.yul);
        this.LLILZ = (C20744016Fi) view.findViewById(R.id.yuk);
    }
}
