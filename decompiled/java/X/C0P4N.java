package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinEmojiDetailSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinEmojiNumCell;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionAbility;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem;

/* JADX INFO: renamed from: X.0P4N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4N implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            default:
                return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0P4N(Object obj, BulletinBaseCell<BulletinBaseItem> bulletinBaseCell) {
        this.$t = bulletinBaseCell;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(C0P4N c0p4n, View view) {
        ((BulletinBaseCell) c0p4n.l0).D6();
        return false;
    }

    public static final boolean onLongClick$1(C0P4N c0p4n, View view) {
        String str;
        Long lLJIILIIL;
        boolean z;
        long jOg2;
        String str2;
        BulletinEmojiAbility bulletinEmojiAbility;
        String str3;
        int iIE;
        int status;
        BulletinCommonAbility bulletinCommonAbilityN5;
        BulletinInteractionAbility bulletinInteractionAbility;
        BulletinEmojiItem item = ((BulletinEmojiCell) c0p4n.l0).getItem();
        if (item != null && (str = item.LL) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            BulletinCommonAbility bulletinCommonAbilityN52 = ((BulletinEmojiCell) c0p4n.l0).N5();
            boolean zIsHalfScreen = false;
            if (bulletinCommonAbilityN52 != null && bulletinCommonAbilityN52.To()) {
                z = true;
            } else {
                z = false;
            }
            Long lValueOf = null;
            if (!z && (bulletinCommonAbilityN5 = ((BulletinEmojiCell) c0p4n.l0).N5()) != null && bulletinCommonAbilityN5.Nl()) {
                BulletinEmojiCell bulletinEmojiCell = (BulletinEmojiCell) c0p4n.l0;
                bulletinEmojiCell.getClass();
                InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(bulletinEmojiCell);
                if (interfaceC665370Q7zLIZ != null && (bulletinInteractionAbility = (BulletinInteractionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinInteractionAbility.class, null)) != null) {
                    bulletinInteractionAbility.rE1(String.valueOf(jLongValue), "click_bulletin_message_emoji", null);
                }
                return true;
            }
            String str4 = BulletinEmojiDetailSheetFragment._pnsPageId;
            Context context = ((BulletinEmojiCell) c0p4n.l0).itemView.getContext();
            FragmentManager parentFragmentManager = FragmentManager.LJJJJLL(((BulletinEmojiCell) c0p4n.l0).itemView).getParentFragmentManager();
            Bundle bundle = new Bundle();
            BulletinEmojiCell bulletinEmojiCell2 = (BulletinEmojiCell) c0p4n.l0;
            BulletinCommonAbility bulletinCommonAbilityN53 = bulletinEmojiCell2.N5();
            if (bulletinCommonAbilityN53 != null) {
                jOg2 = bulletinCommonAbilityN53.Og2();
            } else {
                jOg2 = 0;
            }
            bundle.putLong("bulletin_board_id", jOg2);
            bundle.putLong("bbItemId", jLongValue);
            BulletinEmojiItem item2 = bulletinEmojiCell2.getItem();
            if (item2 != null) {
                str2 = item2.emoji;
            } else {
                str2 = null;
            }
            C786410Ut5.LJJJI("landingEmoji", str2, bundle);
            BulletinEmojiCell bulletinEmojiCell3 = (BulletinEmojiCell) c0p4n.l0;
            bulletinEmojiCell3.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ2 = C1196320hEk.LIZ(bulletinEmojiCell3);
            if (interfaceC665370Q7zLIZ2 != null) {
                bulletinEmojiAbility = (BulletinEmojiAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ2, BulletinEmojiAbility.class, null);
            } else {
                bulletinEmojiAbility = null;
            }
            BulletinCommonAbility bulletinCommonAbilityN54 = ((BulletinEmojiCell) c0p4n.l0).N5();
            if (bulletinCommonAbilityN54 != null) {
                zIsHalfScreen = bulletinCommonAbilityN54.isHalfScreen();
            }
            C616780OHc.LIZ(context, parentFragmentManager, bundle, bulletinEmojiAbility, zIsHalfScreen);
            C0OPQ c0opq = C0OPQ.LIZ;
            BulletinCommonAbility bulletinCommonAbilityN55 = ((BulletinEmojiCell) c0p4n.l0).N5();
            if (bulletinCommonAbilityN55 != null) {
                lValueOf = Long.valueOf(bulletinCommonAbilityN55.Og2());
            }
            String strValueOf = String.valueOf(lValueOf);
            BulletinEmojiItem item3 = ((BulletinEmojiCell) c0p4n.l0).getItem();
            if (item3 == null || (str3 = item3.LL) == null) {
                str3 = "";
            }
            BulletinCommonAbility bulletinCommonAbilityN56 = ((BulletinEmojiCell) c0p4n.l0).N5();
            if (bulletinCommonAbilityN56 != null) {
                iIE = bulletinCommonAbilityN56.IE();
            } else {
                iIE = -1;
            }
            BulletinCommonAbility bulletinCommonAbilityN57 = ((BulletinEmojiCell) c0p4n.l0).N5();
            if (bulletinCommonAbilityN57 != null) {
                status = bulletinCommonAbilityN57.qF();
            } else {
                status = EnumC617010OHz.INVALID.getStatus();
            }
            c0opq.getClass();
            C0OPQ.LJIJJLI(iIE, status, strValueOf, str3, "long_press_emoji");
        }
        return true;
    }

    public static final boolean onLongClick$2(C0P4N c0p4n, View view) {
        ((BulletinEmojiNumCell) c0p4n.l0).N5(true);
        return true;
    }

    public static final boolean onLongClick$3(C0P4N c0p4n, View view) {
        AddYoursCollectionAbility addYoursCollectionAbility = (AddYoursCollectionAbility) ((AddYoursCollectionCellAssem) c0p4n.l0).LLJLLL.getValue();
        if (addYoursCollectionAbility != null) {
            addYoursCollectionAbility.mq1((C615070OAn) C631370Opb.LIZ((AddYoursCollectionCellAssem) c0p4n.l0));
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$4(C0P4N c0p4n, View view) {
        ((C0OQB) c0p4n.l0).LIZIZ(true);
        return true;
    }
}
