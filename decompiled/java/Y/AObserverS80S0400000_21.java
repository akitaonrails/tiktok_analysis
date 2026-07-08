package Y;

import X.C0XQ7;
import X.C1235900iGa;
import X.C1348790lCf;
import X.C1349220lDM;
import X.C1349530lDr;
import X.C197039127h;
import X.C19U1;
import X.C786410Ut5;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.gift.model.GiftPage;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResponse;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class AObserverS80S0400000_21 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS80S0400000_21 aObserverS80S0400000_21, Object obj) {
        GiftResult giftPageList;
        GiftResult giftPageList2;
        List<GiftPage> list;
        GiftResult giftPageList3;
        String string;
        GiftResult giftPageList4;
        List<GiftPage> list2;
        GiftPage giftPage;
        List<GiftPage> list3;
        GiftResponse giftResponse = (GiftResponse) obj;
        C1348790lCf c1348790lCf = (C1348790lCf) aObserverS80S0400000_21.l0;
        c1348790lCf.LJFF = new C1349530lDr(c1348790lCf.LIZ, c1348790lCf.LIZJ, c1348790lCf.LIZLLL, (C1235900iGa) aObserverS80S0400000_21.l1, c1348790lCf.LJIIIZ);
        C1349220lDM c1349220lDM = (C1349220lDM) aObserverS80S0400000_21.l2;
        C1349530lDr c1349530lDr = ((C1348790lCf) aObserverS80S0400000_21.l0).LJFF;
        List<GiftPage> list4 = null;
        if (c1349530lDr == null) {
            c1349530lDr = null;
        }
        c1349220lDM.setAdapter(c1349530lDr);
        C1349530lDr c1349530lDr2 = ((C1348790lCf) aObserverS80S0400000_21.l0).LJFF;
        if (c1349530lDr2 == null) {
            c1349530lDr2 = null;
        }
        if (giftResponse != null) {
            giftPageList = giftResponse.getGiftPageList();
        } else {
            giftPageList = null;
        }
        ((ArrayList) c1349530lDr2.LLIZLLLIL).clear();
        c1349530lDr2.notifyDataSetChanged();
        if (giftPageList != null && (list3 = giftPageList.giftPageList) != null) {
            ((ArrayList) c1349530lDr2.LLIZLLLIL).addAll(list3);
        }
        C786410Ut5.LLLLIIL(c1349530lDr2.LLILZIL, 8);
        C1349530lDr c1349530lDr3 = ((C1348790lCf) aObserverS80S0400000_21.l0).LJFF;
        if (c1349530lDr3 == null) {
            c1349530lDr3 = null;
        }
        c1349530lDr3.notifyDataSetChanged();
        ((C1348790lCf) aObserverS80S0400000_21.l0).LIZLLL.AQ2();
        boolean z = true;
        if (C0XQ7.LJFF().getCurUser().getGiftBagStatus() == 1) {
            C1348790lCf c1348790lCf2 = (C1348790lCf) aObserverS80S0400000_21.l0;
            if (giftResponse != null) {
                giftPageList3 = giftResponse.getGiftPageList();
            } else {
                giftPageList3 = null;
            }
            c1348790lCf2.getClass();
            if (giftPageList3 != null) {
                list4 = giftPageList3.giftPageList;
            }
            Iterator<GiftPage> it2 = list4.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    int i2 = i + 1;
                    if (it2.next().giftPageType == 3) {
                        break;
                    } else {
                        i = i2;
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            if (giftResponse == null || (giftPageList4 = giftResponse.getGiftPageList()) == null || (list2 = giftPageList4.giftPageList) == null || (giftPage = (GiftPage) ListProtector.get(list2, i)) == null || (string = giftPage.pageName) == null) {
                string = C786410Ut5.P3(((C1348790lCf) aObserverS80S0400000_21.l0).LIZJ).getString(2131827844);
            }
            HandlerHook.viewPostDelay((C19U1) aObserverS80S0400000_21.l3, new ARunnableS32S0101000_21(i, (C1349220lDM) aObserverS80S0400000_21.l2, 8), 500L);
            C19U1 c19u1 = (C19U1) aObserverS80S0400000_21.l3;
            HandlerHook.viewPost(c19u1, new ARunnableS0S1201000_4((C1348790lCf) aObserverS80S0400000_21.l0, i, string, c19u1, 1));
        }
        C1348790lCf c1348790lCf3 = (C1348790lCf) aObserverS80S0400000_21.l0;
        if (giftResponse == null || (giftPageList2 = giftResponse.getGiftPageList()) == null || (list = giftPageList2.giftPageList) == null || list.size() != 1) {
            z = false;
        }
        C19U1 c19u12 = (C19U1) aObserverS80S0400000_21.l3;
        c1348790lCf3.getClass();
        if (z) {
            C786410Ut5.LLFFF(8, c19u12);
        } else {
            C786410Ut5.LLFFF(0, c19u12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$1(Y.AObserverS80S0400000_21 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS80S0400000_21.onChanged$1(Y.AObserverS80S0400000_21, java.lang.Object):void");
    }

    public static final void onChanged$2(AObserverS80S0400000_21 aObserverS80S0400000_21, Object obj) {
        Long l = (Long) obj;
        ((C1348790lCf) aObserverS80S0400000_21.l0).LJI((C197039127h) aObserverS80S0400000_21.l1);
        if (l.longValue() > Long.MIN_VALUE) {
            C786410Ut5.LLLLIIL((C1235900iGa) aObserverS80S0400000_21.l2, 8);
            C786410Ut5.LLIL((TextView) aObserverS80S0400000_21.l3, 0);
            ((TextView) aObserverS80S0400000_21.l3).setText(l.toString());
        } else {
            C786410Ut5.LLLLIIL((C1235900iGa) aObserverS80S0400000_21.l2, 0);
            C786410Ut5.LLIL((TextView) aObserverS80S0400000_21.l3, 8);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS80S0400000_21(X.C1235900iGa r2, X.C19U1 r3, X.C1348790lCf r4, X.C1349220lDM r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r5
            r0.l3 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r5
            r0.l3 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS80S0400000_21.<init>(X.0iGa, X.19U1, X.0lCf, X.0lDM, int):void");
    }

    public AObserverS80S0400000_21(C1348790lCf c1348790lCf, C197039127h c197039127h, C1235900iGa c1235900iGa, TextView textView, int i) {
        this.$t = i;
        this.l0 = c1348790lCf;
        this.l1 = c197039127h;
        this.l2 = c1235900iGa;
        this.l3 = textView;
    }
}
