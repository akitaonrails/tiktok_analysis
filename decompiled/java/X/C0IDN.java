package X;

import Y.ATListenerS440S0100000_6;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinSelectEmojiCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinSelectEmojiPopupCell;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinSelectEmojiSheetAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0IDN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDN implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(C0IDN c0idn, View view) {
        List<String> list;
        C427100Gou item;
        List<String> list2;
        BulletinSelectEmojiSheetAbility bulletinSelectEmojiSheetAbility;
        List<String> list3;
        List<String> list4;
        C427100Gou item2 = ((BulletinSelectEmojiCell) c0idn.l0).getItem();
        if (item2 != null && (list = item2.LLILLJJLI) != null && (!list.isEmpty()) && (item = ((BulletinSelectEmojiCell) c0idn.l0).getItem()) != null && (list2 = item.LLILLJJLI) != null && list2.size() > 1) {
            View viewSd = C786410Ut5.Sd(R.layout.a6c, C786410Ut5.ne(((TuxTextView) c0idn.l1).getContext()), null);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(32));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
            viewSd.setBackground(c384050F3z.LIZ(((BulletinSelectEmojiCell) c0idn.l0).itemView.getContext()));
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewSd.findViewById(R.id.d4m);
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                TuxTextView tuxTextView = (TuxTextView) c0idn.l1;
                BulletinSelectEmojiCell bulletinSelectEmojiCell = (BulletinSelectEmojiCell) c0idn.l0;
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(BulletinSelectEmojiPopupCell.class);
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(tuxTextView.getContext(), 0, false));
                ArrayList arrayList = new ArrayList();
                C427100Gou item3 = bulletinSelectEmojiCell.getItem();
                if (item3 != null && (list3 = item3.LLILLJJLI) != null) {
                    for (String str : list3) {
                        C427100Gou item4 = bulletinSelectEmojiCell.getItem();
                        if (item4 != null) {
                            list4 = item4.LLILLJJLI;
                        } else {
                            list4 = null;
                        }
                        arrayList.add(new C427100Gou(str, list4, ""));
                    }
                }
                viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, null);
            }
            PopupWindow popupWindow = new PopupWindow(viewSd, -2, -2);
            popupWindow.setElevation(C418440Gaw.LIZIZ(16));
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            popupWindow.setTouchInterceptor(new ATListenerS440S0100000_6(popupWindow, 2));
            final BulletinSelectEmojiCell bulletinSelectEmojiCell2 = (BulletinSelectEmojiCell) c0idn.l0;
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0H8k
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    BulletinSelectEmojiSheetAbility bulletinSelectEmojiSheetAbility2;
                    BulletinSelectEmojiCell bulletinSelectEmojiCell3 = bulletinSelectEmojiCell2;
                    bulletinSelectEmojiCell3.getClass();
                    InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(bulletinSelectEmojiCell3);
                    if (interfaceC665370Q7zLIZ == null || (bulletinSelectEmojiSheetAbility2 = (BulletinSelectEmojiSheetAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinSelectEmojiSheetAbility.class, null)) == null) {
                        return;
                    }
                    bulletinSelectEmojiSheetAbility2.lx(true);
                }
            });
            BulletinSelectEmojiCell bulletinSelectEmojiCell3 = (BulletinSelectEmojiCell) c0idn.l0;
            bulletinSelectEmojiCell3.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(bulletinSelectEmojiCell3);
            if (interfaceC665370Q7zLIZ != null && (bulletinSelectEmojiSheetAbility = (BulletinSelectEmojiSheetAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinSelectEmojiSheetAbility.class, null)) != null) {
                bulletinSelectEmojiSheetAbility.lx(false);
            }
            C786410Ut5.k3(popupWindow, view, 0, iArr[0], iArr[1] - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
        }
        return true;
    }

    public static final boolean onLongClick$1(C0IDN c0idn, View view) {
        CommentCommonModel commonModel;
        C0P0T c0p0t = ((C1341150l0L) c0idn.l0).LJJ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        CommentContextSource commentContextSource = ((C1341150l0L) c0idn.l0).LJIIZILJ;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null && commonModel.isLandscapeMode()) {
            return true;
        }
        Map<String, String> mapLIZJ = ((C1341150l0L) c0idn.l0).LIZJ();
        String str = ((C1341150l0L) c0idn.l0).LJIIIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        C1341320l0c.LIZLLL(c2344009Gk, str, mapLIZJ);
        C1350920lG6.LJJJ(c2344009Gk, "ttinter_comment_multi_genre_hotzone_long_press");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C447640Hgw((CommentStickerStruct) c0idn.l1, (C1341150l0L) c0idn.l0, view, null), 3);
        return true;
    }

    public static final boolean onLongClick$2(C0IDN c0idn, View view) {
        return ((Boolean) ((InterfaceC1631620sYq) c0idn.l0).invoke((StickerItem) c0idn.l1, view, EnumC453020Hpc.LONG_PRESS)).booleanValue();
    }

    public C0IDN(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
