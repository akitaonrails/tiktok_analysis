package X;

import android.content.Intent;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0L7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537930L7v {
    public final ArrayList<MediaItem> LIZ;
    public final ArrayList<MediaItem> LIZIZ;
    public final ArrayList<TextItem> LIZJ;

    public final void LIZ(Intent intent) {
        intent.putParcelableArrayListExtra("arg_data_process_items", this.LIZ);
        ArrayList<MediaItem> arrayList = this.LIZIZ;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("arg_data_all_items", arrayList);
        }
        ArrayList<TextItem> arrayList2 = this.LIZJ;
        if (arrayList2 != null) {
            intent.putParcelableArrayListExtra("arg_data_text_items", arrayList2);
        }
    }

    public C537930L7v(ArrayList<MediaItem> arrayList, ArrayList<MediaItem> arrayList2, ArrayList<TextItem> arrayList3) {
        this.LIZ = arrayList;
        this.LIZIZ = arrayList2;
        this.LIZJ = arrayList3;
    }

    public /* synthetic */ C537930L7v(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        this(arrayList, (i & 2) != 0 ? null : arrayList2, (i & 4) != 0 ? null : arrayList3);
    }
}
