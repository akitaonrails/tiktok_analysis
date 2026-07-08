package X;

import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAnimationAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619270OQr implements InterfaceC619810OSt {
    public final BulletinInteractionAbility LIZ;
    public final BulletinEmojiAnimationAbility LIZIZ;
    public final BulletinCommonAbility LIZJ;
    public final InterfaceC665370Q7z LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final View LJII;
    public boolean LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final List<C619260OQq> LJIIJJI;
    public final List<C618800OOw> LJIIL;
    public final List<C0OQB> LJIILIIL;
    public final List<C619280OQs> LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public List<InterfaceC1891350zJl> LJIJ;
    public List<? extends InterfaceC1891350zJl> LJIJI;
    public Integer LJIJJ;

    @Override // X.InterfaceC619810OSt
    public final void LIZIZ() {
        if (this.LJFF) {
            return;
        }
        LJFF();
        this.LJIJ = null;
        this.LJIJI = null;
        this.LJIJJ = null;
    }

    public final void LJFF() {
        C426160GnO c426160GnO = (C426160GnO) this.LJIIJ.getValue();
        if (c426160GnO != null) {
            C786410Ut5.LJJJJZ(c426160GnO);
        }
        for (C619260OQq c619260OQq : (ArrayList) this.LJIIJJI) {
            C619290OQt.LIZ.getClass();
            c619260OQq.LLJILJIL = null;
            c619260OQq.LLJILJILJ = -1L;
            c619260OQq.LLJILLL = null;
            c619260OQq.LLJJ = null;
            c619260OQq.LLIZ = null;
            c619260OQq.LLIZLLLIL = null;
            c619260OQq.LLJ = null;
            c619260OQq.LLJI = null;
            c619260OQq.LLJIJIL = null;
            C619290OQt.LIZIZ.addLast(c619260OQq);
        }
        for (C618800OOw c618800OOw : (ArrayList) this.LJIIL) {
            C619290OQt.LIZ.getClass();
            c618800OOw.LLILLL = null;
            c618800OOw.LLILZ = null;
            c618800OOw.LLILZIL = null;
            c618800OOw.LLILLJJLI = "";
            C619290OQt.LIZJ.addLast(c618800OOw);
        }
        for (C0OQB c0oqb : (ArrayList) this.LJIILIIL) {
            C619290OQt.LIZ.getClass();
            Handler handler = c0oqb.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            c0oqb.LLILLJJLI = null;
            c0oqb.LLILLL = null;
            c0oqb.LLILZ = null;
            c0oqb.LLILZIL = null;
            C619290OQt.LIZLLL.addLast(c0oqb);
        }
        for (C619280OQs c619280OQs : (ArrayList) this.LJIILJJIL) {
            C619290OQt.LIZ.getClass();
            c619280OQs.LLJ = -1;
            c619280OQs.LLJI = null;
            c619280OQs.LLILZLL = null;
            c619280OQs.LLIZ = null;
            c619280OQs.LLIZLLLIL = null;
            C619290OQt.LJ.addLast(c619280OQs);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmojiWidgetV2 recycleActiveViews emoji=");
        sbLIZ.append(((ArrayList) this.LJIIJJI).size());
        sbLIZ.append(" action=");
        sbLIZ.append(((ArrayList) this.LJIIL).size());
        sbLIZ.append(" num=");
        sbLIZ.append(((ArrayList) this.LJIILIIL).size());
        sbLIZ.append(" commentEntry=");
        sbLIZ.append(((ArrayList) this.LJIILJJIL).size());
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        ((ArrayList) this.LJIIJJI).clear();
        ((ArrayList) this.LJIIL).clear();
        ((ArrayList) this.LJIILIIL).clear();
        ((ArrayList) this.LJIILJJIL).clear();
    }

    @Override // X.C0OT0
    public final View LJIJI() {
        return this.LJII;
    }

    public static boolean LIZLLL(Integer num, List list) {
        C0OQC c0oqc;
        Object next;
        int iIntValue;
        if (list == null) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (true) {
            c0oqc = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C0OQC) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof C0OQC) {
            c0oqc = (C0OQC) next;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (c0oqc == null) {
            if (iIntValue != 0) {
                return false;
            }
            return true;
        }
        if (c0oqc.LLILLJJLI != iIntValue) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List, java.util.List<? extends X.0zJl>] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // X.InterfaceC619810OSt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r27, boolean r28, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 1655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619270OQr.LJIIIIZZ(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, boolean, boolean, java.lang.String):void");
    }

    public C619270OQr(View view, BulletinInteractionAbility bulletinInteractionAbility, BulletinEmojiAnimationAbility bulletinEmojiAnimationAbility, BulletinCommonAbility bulletinCommonAbility, InterfaceC665370Q7z interfaceC665370Q7z) {
        boolean zTo;
        boolean zAK2;
        boolean zV20;
        C426160GnO c426160GnO;
        int i;
        this.LIZ = bulletinInteractionAbility;
        this.LIZIZ = bulletinEmojiAnimationAbility;
        this.LIZJ = bulletinCommonAbility;
        this.LIZLLL = interfaceC665370Q7z;
        if (bulletinCommonAbility != null) {
            zTo = bulletinCommonAbility.To();
        } else {
            zTo = false;
        }
        this.LJ = zTo;
        if (bulletinInteractionAbility != null) {
            zAK2 = bulletinInteractionAbility.AK2();
        } else {
            zAK2 = false;
        }
        this.LJFF = zAK2;
        if (bulletinInteractionAbility != null) {
            zV20 = bulletinInteractionAbility.v20();
        } else {
            zV20 = false;
        }
        this.LJI = zV20;
        if ((view instanceof C426160GnO) && (c426160GnO = (C426160GnO) view) != null) {
            if (zTo) {
                i = 1;
            } else {
                i = -1;
            }
            c426160GnO.setGravity(i);
            c426160GnO.setClipChildren(false);
            c426160GnO.setClipToPadding(false);
            if (zTo) {
                c426160GnO.setPadding(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
            } else {
                c426160GnO.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0, 0);
            }
            view = c426160GnO;
        }
        this.LJII = view;
        this.LJIIIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 819));
        this.LJIIJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 818));
        this.LJIIJJI = new ArrayList();
        this.LJIIL = new ArrayList();
        this.LJIILIIL = new ArrayList();
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 816));
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 815));
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 817));
    }
}
