package Y;

import X.C0H37;
import X.C0H38;
import X.C0I9T;
import X.C0I9U;
import X.C0OBG;
import X.C0ZDN;
import X.C1628906Zj;
import X.C434900H3o;
import X.C434910H3p;
import X.C443870Har;
import X.C443960Hb0;
import X.C444060HbA;
import X.C444070HbB;
import X.C444080HbC;
import X.C455190Ht7;
import X.C785410UrT;
import X.DialogC446620HfI;
import X.InterfaceC434930H3r;
import X.InterfaceC444050Hb9;
import X.InterfaceC455210Ht9;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.ss.android.ugc.aweme.notification.creator.widget.SortPopupWindow;
import com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public class ACListenerS41S0201000_6 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS41S0201000_6 aCListenerS41S0201000_6, View view) {
        InterfaceC434930H3r interfaceC434930H3r = ((C434900H3o) aCListenerS41S0201000_6.l0).LLILLJJLI;
        if (interfaceC434930H3r != null) {
            interfaceC434930H3r.LIZJ(((C434910H3p) aCListenerS41S0201000_6.l1).itemView, aCListenerS41S0201000_6.i2);
        }
    }

    public static final void onClick$1(ACListenerS41S0201000_6 aCListenerS41S0201000_6, View view) {
        InterfaceC455210Ht9 interfaceC455210Ht9 = ((C455190Ht7) aCListenerS41S0201000_6.l0).LLILZ;
        if (interfaceC455210Ht9 != null) {
            interfaceC455210Ht9.LIZIZ(aCListenerS41S0201000_6.i2, (StickerItem) aCListenerS41S0201000_6.l1);
        }
    }

    public static final void onClick$2(ACListenerS41S0201000_6 aCListenerS41S0201000_6, View view) {
        Function1<NoticeSortModel, Unit> function1 = ((SortPopupWindow) aCListenerS41S0201000_6.l0).LL;
        if (function1 != null) {
            function1.invoke((NoticeSortModel) ListProtector.get((List) aCListenerS41S0201000_6.l1, aCListenerS41S0201000_6.i2));
        }
        ((SortPopupWindow) aCListenerS41S0201000_6.l0).dismiss();
    }

    public static final void onClick$3(ACListenerS41S0201000_6 aCListenerS41S0201000_6, View view) {
        if (((InterfaceC444050Hb9) aCListenerS41S0201000_6.l0) instanceof C443870Har) {
            StickerPanelAssemViewModel stickerPanelAssemViewModel = ((C443960Hb0) aCListenerS41S0201000_6.l1).LLILLJJLI;
            stickerPanelAssemViewModel.getClass();
            stickerPanelAssemViewModel.setState(AFwS236S0000000_6.get$arr$(438));
            return;
        }
        ((C443960Hb0) aCListenerS41S0201000_6.l1).LLILLJJLI.IQ2(aCListenerS41S0201000_6.i2);
    }

    public static final void onClick$4(ACListenerS41S0201000_6 aCListenerS41S0201000_6, View view) {
        RemoteImageView remoteImageView = ((C444060HbA) aCListenerS41S0201000_6.l0).LL;
        if (remoteImageView == null) {
            remoteImageView = null;
        }
        if (remoteImageView.isSelected()) {
            return;
        }
        ((C444070HbB) aCListenerS41S0201000_6.l1).LL.LIZJ(aCListenerS41S0201000_6.i2);
    }

    public static final void onClick$5(ACListenerS41S0201000_6 aCListenerS41S0201000_6, View view) {
        TextView textView = ((C444080HbC) aCListenerS41S0201000_6.l0).LL;
        if (textView == null) {
            textView = null;
        }
        if (textView.isSelected()) {
            return;
        }
        ((C444070HbB) aCListenerS41S0201000_6.l1).LL.LIZJ(aCListenerS41S0201000_6.i2);
    }

    public static final void onClick$6(ACListenerS41S0201000_6 aCListenerS41S0201000_6, View view) {
        new C0ZDN(((DialogC446620HfI) aCListenerS41S0201000_6.l0).LLILZLL).LIZ(0);
        ((DialogC446620HfI) aCListenerS41S0201000_6.l0).LLJ.invoke((CollectionDetail) aCListenerS41S0201000_6.l1, Integer.valueOf(aCListenerS41S0201000_6.i2));
        DialogC446620HfI dialogC446620HfI = (DialogC446620HfI) aCListenerS41S0201000_6.l0;
        dialogC446620HfI.dismiss();
        C785410UrT.LIZ(dialogC446620HfI);
    }

    public static final void onClick$7(ACListenerS41S0201000_6 aCListenerS41S0201000_6, View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        C1628906Zj.LIZ(((C0I9U) aCListenerS41S0201000_6.l0).itemView.getContext());
        C0I9T c0i9t = (C0I9T) aCListenerS41S0201000_6.l1;
        c0i9t.LLILLJJLI.invoke((PreshownStickerItem) ListProtector.get(c0i9t.LL, aCListenerS41S0201000_6.i2));
    }

    public static final void onClick$8(ACListenerS41S0201000_6 aCListenerS41S0201000_6, View view) {
        C0H37 c0h37 = (C0H37) aCListenerS41S0201000_6.l0;
        c0h37.LLILLJJLI.invoke((Bitmap) ListProtector.get(c0h37.LL, aCListenerS41S0201000_6.i2), Integer.valueOf(aCListenerS41S0201000_6.i2));
        ((C0H37) aCListenerS41S0201000_6.l0).LLILZ = ((C0H38) aCListenerS41S0201000_6.l1).getAbsoluteAdapterPosition();
        ((C0H37) aCListenerS41S0201000_6.l0).notifyDataSetChanged();
    }

    public ACListenerS41S0201000_6(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }

    public ACListenerS41S0201000_6(C434900H3o c434900H3o, C434910H3p c434910H3p, int i, Image image, int i2) {
        this.$t = i2;
        this.l0 = c434900H3o;
        this.l1 = c434910H3p;
        this.i2 = i;
    }
}
