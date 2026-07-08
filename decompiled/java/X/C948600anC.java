package X;

import Y.ACListenerS118S0200000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperPicStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0anC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948600anC extends C0J8P<MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem, C948610anD> {
    public final Function1<MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem, Unit> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C948600anC(Function1<? super MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C948610anD(viewGroup);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void LIZJ(C948610anD c948610anD, MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem picStyleItem) {
        picStyleItem.position = c948610anD.getLayoutPosition();
        c948610anD.itemView.setSelected(picStyleItem.isSelected);
        String str = picStyleItem.geckoFileName;
        if (str != null) {
            C1143680frq.LIZLLL((View) c948610anD.LL.getValue(), "tiktok_live_interaction_normal_1", str);
        } else {
            ((C1322110kVd) c948610anD.LL.getValue()).setImageResource(R.drawable.eej);
        }
        TextView textView = (TextView) c948610anD.LLILLJJLI.getValue();
        String str2 = picStyleItem.styleName;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(str2);
        C786410Ut5.I7(new ACListenerS118S0200000_15(picStyleItem, this, 0), c948610anD.itemView);
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem picStyleItem, List list) {
        boolean z;
        C948610anD c948610anD = (C948610anD) viewHolder;
        MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem picStyleItem2 = picStyleItem;
        if (list.isEmpty()) {
            LIZJ(c948610anD, picStyleItem2);
            return;
        }
        boolean z2 = false;
        if (!(ListProtector.get(list, 0) instanceof Integer)) {
            return;
        }
        View view = c948610anD.itemView;
        int layoutPosition = c948610anD.getLayoutPosition();
        Object obj = ListProtector.get(list, 0);
        if ((obj instanceof Integer) && layoutPosition == ((Number) obj).intValue()) {
            z = true;
        } else {
            z = false;
        }
        view.setSelected(z);
        int layoutPosition2 = c948610anD.getLayoutPosition();
        Object obj2 = ListProtector.get(list, 0);
        if ((obj2 instanceof Integer) && layoutPosition2 == ((Number) obj2).intValue()) {
            z2 = true;
        }
        picStyleItem2.isSelected = z2;
    }
}
