package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinEmojiDetailSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.FanSpotlightBlockVideoAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0P4F, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4F implements View.OnLongClickListener {
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
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(C0P4F c0p4f, View view) {
        boolean z;
        long jOg2;
        int iIE;
        int status;
        C619260OQq c619260OQq = (C619260OQq) c0p4f.l0;
        BulletinEmojiItem bulletinEmojiItem = c619260OQq.LLIZ;
        if (bulletinEmojiItem == null) {
            return true;
        }
        BulletinCommonAbility bulletinCommonAbility = c619260OQq.LLIZLLLIL;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(bulletinEmojiItem.LL);
        if (lLJIILIIL != null) {
            long jLongValue = lLJIILIIL.longValue();
            boolean zIsHalfScreen = false;
            if (bulletinCommonAbility != null && bulletinCommonAbility.To()) {
                z = true;
            } else {
                z = false;
            }
            Long lValueOf = null;
            if (!z && bulletinCommonAbility != null && bulletinCommonAbility.Nl()) {
                BulletinInteractionAbility bulletinInteractionAbility = ((C619260OQq) c0p4f.l0).LLJ;
                if (bulletinInteractionAbility != null) {
                    bulletinInteractionAbility.rE1(String.valueOf(jLongValue), "click_bulletin_message_emoji", null);
                }
                return true;
            }
            String str = BulletinEmojiDetailSheetFragment._pnsPageId;
            Context context = (Context) c0p4f.l1;
            FragmentManager parentFragmentManager = FragmentManager.LJJJJLL((C619260OQq) c0p4f.l0).getParentFragmentManager();
            Bundle bundle = new Bundle();
            if (bulletinCommonAbility != null) {
                jOg2 = bulletinCommonAbility.Og2();
            } else {
                jOg2 = 0;
            }
            bundle.putLong("bulletin_board_id", jOg2);
            bundle.putLong("bbItemId", jLongValue);
            C786410Ut5.LJJJI("landingEmoji", bulletinEmojiItem.emoji, bundle);
            BulletinEmojiAbility bulletinEmojiAbility = ((C619260OQq) c0p4f.l0).LLJI;
            if (bulletinCommonAbility != null) {
                zIsHalfScreen = bulletinCommonAbility.isHalfScreen();
            }
            C616780OHc.LIZ(context, parentFragmentManager, bundle, bulletinEmojiAbility, zIsHalfScreen);
            C0OPQ c0opq = C0OPQ.LIZ;
            if (bulletinCommonAbility != null) {
                lValueOf = Long.valueOf(bulletinCommonAbility.Og2());
            }
            String strValueOf = String.valueOf(lValueOf);
            String str2 = bulletinEmojiItem.LL;
            if (bulletinCommonAbility != null) {
                iIE = bulletinCommonAbility.IE();
                status = bulletinCommonAbility.qF();
            } else {
                iIE = -1;
                status = EnumC617010OHz.INVALID.getStatus();
            }
            c0opq.getClass();
            C0OPQ.LJIJJLI(iIE, status, strValueOf, str2, "long_press_emoji");
        }
        return true;
    }

    public static final boolean onLongClick$1(C0P4F c0p4f, View view) {
        FragmentManager supportFragmentManager;
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJ(R.style.m9);
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131834407);
        c1247510iZJ.LIZ(new AwS375S0200000_9((FanSpotlightBlockVideoAssem) c0p4f.l0, (C050S) c0p4f.l1, 146));
        c1390850mIV.LIZIZ(c1247510iZJ);
        c1390850mIV.LIZLLL(2131837737);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        C19EG c19egLIZ = C724240Sb0.LIZ((FanSpotlightBlockVideoAssem) c0p4f.l0);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            tuxActionSheetLIZJ.show(supportFragmentManager, "remove fan spotlight");
        }
        return true;
    }

    public C0P4F(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
