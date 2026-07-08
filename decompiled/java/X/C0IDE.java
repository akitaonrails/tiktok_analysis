package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sticker.impl.panel.ui.adapter.powercells.SystemSmallEmojiPageCellV2;
import com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridAdapter;

/* JADX INFO: renamed from: X.0IDE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDE extends AbstractC214823195h {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(C0IDE c0ide, int i) {
        if (ListProtector.get(((SystemSmallEmojiPageCellV2) c0ide.l0).X5().getListItems(), i) instanceof C424230GkH) {
            return ((SystemSmallEmojiPageCellV2.AnonymousClass1) c0ide.l1).LLILLJJLI;
        }
        return 1;
    }

    public static final int LJFF$1(C0IDE c0ide, int i) {
        switch (((StickerGridAdapter) c0ide.l0).getItemViewType(i)) {
            case 1002:
                return ((GridLayoutManager) c0ide.l1).LLILLJJLI;
            case 1003:
                return ((GridLayoutManager) c0ide.l1).LLILLJJLI;
            case 1004:
                return ((GridLayoutManager) c0ide.l1).LLILLJJLI;
            default:
                return 1;
        }
    }

    public C0IDE(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
