package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Tar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC749630Tar extends RecyclerView.ViewHolder {
    public abstract <T> void V2(T t);

    public AbstractC749630Tar(int i, View view) {
        super(view);
        if (C20441214yg.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("");
            C20441214yg.LIZIZ("type", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
