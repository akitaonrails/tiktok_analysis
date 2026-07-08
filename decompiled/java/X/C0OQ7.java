package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAnimationAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OQ7 implements InterfaceC619810OSt {
    public final BulletinInteractionAbility LIZ;
    public final BulletinEmojiAnimationAbility LIZIZ;
    public final BulletinCommonAbility LIZJ;
    public final InterfaceC665370Q7z LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final View LJII;
    public final C01GW LJIIIIZZ;

    @Override // X.InterfaceC619810OSt
    public final void LIZIZ() {
    }

    @Override // X.C0OT0
    public final View LJIJI() {
        return this.LJII;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    @Override // X.InterfaceC619810OSt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r11, boolean r12, boolean r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OQ7.LJIIIIZZ(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, boolean, boolean, java.lang.String):void");
    }

    public C0OQ7(View view, BulletinInteractionAbility bulletinInteractionAbility, BulletinEmojiAnimationAbility bulletinEmojiAnimationAbility, BulletinCommonAbility bulletinCommonAbility, InterfaceC665370Q7z interfaceC665370Q7z) {
        boolean zTo;
        boolean zAK2;
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
        this.LJI = bulletinInteractionAbility != null ? bulletinInteractionAbility.v20() : false;
        ViewStub viewStub = (ViewStub) view;
        viewStub.setLayoutResource(R.layout.a6y);
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(viewLJLLLL);
        if (zTo) {
            if (marginLayoutParamsLJI != null) {
                marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
        } else if (marginLayoutParamsLJI != null) {
            marginLayoutParamsLJI.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
        C786410Ut5.W5(viewLJLLLL, marginLayoutParamsLJI);
        this.LJII = viewLJLLLL;
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 814));
    }
}
