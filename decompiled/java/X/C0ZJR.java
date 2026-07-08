package X;

import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS258S0300000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZJR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZJR {
    public final Context LIZ;
    public final FragmentManager LIZIZ;
    public final boolean LIZJ;
    public TuxSheet LIZLLL;
    public final View LJ;
    public final C427660Gpo LJFF;
    public final C01GW LJI;
    public final C21411818qq LJII;
    public final LinearLayout LJIIIIZZ;
    public final C19727912Gn LJIIIZ;
    public final C197039127h LJIIJ;
    public final TextView LJIIJJI;
    public final View LJIIL;
    public final TuxTextView LJIILIIL;
    public final TuxTextView LJIILJJIL;
    public final TuxTextView LJIILL;
    public final TuxTextView LJIILLIIL;
    public final TuxTextView LJIIZILJ;
    public Function1<? super Boolean, Unit> LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public C0ZHA LJIJJLI;
    public boolean LJIL;

    public final void LIZ() {
        this.LJIL = true;
        TuxTextView tuxTextView = this.LJIILJJIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(2131830845);
        TuxTextView tuxTextView2 = this.LJIILL;
        (tuxTextView2 != null ? tuxTextView2 : null).setText(2131830846);
        LIZJ(1);
    }

    public final TuxSheet LJ() {
        String string;
        Resources resources;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        View view = this.LJ;
        if (view == null) {
            view = null;
        }
        c1390920mIc.LIZ.LLJJIII = view;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC913930ZtH(this, 2);
        C0OM1 c0om1 = new C0OM1();
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        Context context = this.LIZ;
        if (context == null || (resources = context.getResources()) == null || (string = resources.getString(2131823236)) == null) {
            string = "";
        }
        c1251150ifB.LJIIIIZZ = string;
        c1251150ifB.LIZJ(new AwS558S0100000_14(this, 1815));
        abstractC1250290idnArr[0] = c1251150ifB;
        c0om1.LIZIZ(abstractC1250290idnArr);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIL = c0om1;
        tuxSheet2.LLJJJ = null;
        return tuxSheet2;
    }

    public final void LIZIZ(int i) {
        Pair pair;
        if (i != 1) {
            if (i != 2) {
                pair = new Pair(2131824678, 2131824677);
            } else {
                pair = new Pair(2131830835, 2131830834);
            }
        } else {
            pair = new Pair(2131830842, 2131830841);
        }
        SpannableString spannableStringLIZLLL = LIZLLL(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), new AwS558S0100000_14(this, 1812));
        TuxTextView tuxTextView = this.LJIILJJIL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView3 = this.LJIILJJIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setHighlightColor(0);
        TuxTextView tuxTextView4 = this.LJIILJJIL;
        if (tuxTextView4 != null) {
            tuxTextView2 = tuxTextView4;
        }
        tuxTextView2.setText(spannableStringLIZLLL);
    }

    public final void LIZJ(int i) {
        Pair pair;
        if (i != 1) {
            if (i != 2) {
                pair = new Pair(2131831548, 2131831547);
            } else {
                pair = new Pair(2131830838, 2131830837);
            }
        } else {
            pair = new Pair(2131830848, 2131830847);
        }
        SpannableString spannableStringLIZLLL = LIZLLL(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), new AwS558S0100000_14(this, 1813));
        TuxTextView tuxTextView = this.LJIILLIIL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView3 = this.LJIILLIIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setHighlightColor(0);
        TuxTextView tuxTextView4 = this.LJIILLIIL;
        if (tuxTextView4 != null) {
            tuxTextView2 = tuxTextView4;
        }
        tuxTextView2.setText(spannableStringLIZLLL);
    }

    public final void LJFF(boolean z) {
        int readHoldCount;
        EnumC1643306c3 enumC1643306c3;
        InterfaceC897380ZIi.LIZIZ.getClass();
        C0ZJT c0zjtLJ = C897370ZIh.LIZ().LJ();
        EnumC1643306c3 enumC1643306c3LJFF = C897370ZIh.LIZ().LJ().LJFF();
        String strLIZ = C0ZJN.LIZ();
        Boolean boolValueOf = Boolean.valueOf(z);
        ReentrantReadWriteLock reentrantReadWriteLock = C891910Yyr.LIZIZ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            C891910Yyr.LIZ.put(strLIZ, new C0ZH7(boolValueOf, System.currentTimeMillis()));
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            if (z) {
                enumC1643306c3 = EnumC1643306c3.FRIENDS;
            } else {
                enumC1643306c3 = EnumC1643306c3.NO_ONE;
            }
            c0zjtLJ.LJIIIZ(enumC1643306c3, new AwS258S0300000_14(this, enumC1643306c3LJFF, enumC1643306c3, 21));
            c0zjtLJ.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void LJI(Function1 function1) {
        int i;
        C197039127h c197039127h = this.LJIIJ;
        TuxSheet tuxSheet = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C786410Ut5.LLLLLLJ(c197039127h, 8);
        this.LJIJJLI = C0ZHA.INBOX_TITLE;
        this.LJIJ = function1;
        if (this.LIZJ) {
            LIZ();
        } else {
            TuxTextView tuxTextView = this.LJIIZILJ;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            TuxTextView tuxTextView2 = this.LJIILLIIL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            this.LJIL = true;
            IMFriendsService.LIZ.getClass();
            IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
            if (iMFriendsServiceLIZ != null && iMFriendsServiceLIZ.LJII()) {
                LIZIZ(1);
            } else {
                TuxTextView tuxTextView3 = this.LJIILJJIL;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                tuxTextView3.setText(2131824679);
            }
            TuxTextView tuxTextView4 = this.LJIILL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setText(2131830843);
            TuxTextView tuxTextView5 = this.LJIILLIIL;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            tuxTextView5.setText(2131830844);
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        boolean zLIZ = C897370ZIh.LIZ().LJ().LIZ();
        C19727912Gn c19727912Gn = this.LJIIIZ;
        if (c19727912Gn == null) {
            c19727912Gn = null;
        }
        c19727912Gn.setActive(zLIZ);
        if (this.LJIL) {
            if (zLIZ) {
                i = 2131824680;
            } else {
                i = 2131824676;
            }
            TextView textView = this.LJIIJJI;
            if (textView == null) {
                textView = null;
            }
            textView.setText(i);
        }
        C21411818qq c21411818qq = this.LJII;
        if (c21411818qq == null) {
            c21411818qq = null;
        }
        c21411818qq.setChecked(zLIZ);
        this.LJIJJ = zLIZ;
        TuxSheet tuxSheetLJ = LJ();
        this.LIZLLL = tuxSheetLJ;
        FragmentManager fragmentManager = this.LIZIZ;
        if (fragmentManager != null) {
            if (tuxSheetLJ != null) {
                tuxSheet = tuxSheetLJ;
            }
            tuxSheet.show(fragmentManager, "");
        }
    }

    public C0ZJR(Context context, FragmentManager fragmentManager, boolean z) {
        this.LIZ = context;
        this.LIZIZ = fragmentManager;
        this.LIZJ = z;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1814));
        this.LJI = c01gwLIZIZ;
        if (context != null) {
            View viewSd = C786410Ut5.Sd(R.layout.cec, C786410Ut5.ne(context), null);
            this.LJ = viewSd;
            C197039127h c197039127h = (C197039127h) viewSd.findViewById(R.id.a69);
            this.LJIIJ = c197039127h;
            this.LJIILIIL = (TuxTextView) viewSd.findViewById(R.id.a60);
            C21411818qq c21411818qq = (C21411818qq) viewSd.findViewById(R.id.w23);
            this.LJII = c21411818qq;
            View viewFindViewById = viewSd.findViewById(R.id.a5z);
            this.LJIIL = viewFindViewById;
            this.LJIIIIZZ = (LinearLayout) viewSd.findViewById(R.id.two_buttons_container);
            C197039127h c197039127h2 = (C197039127h) viewSd.findViewById(R.id.a67);
            C197039127h c197039127h3 = (C197039127h) viewSd.findViewById(R.id.a6e);
            this.LJIIIZ = (C19727912Gn) viewSd.findViewById(R.id.w28);
            this.LJIIJJI = (TextView) viewSd.findViewById(R.id.a6d);
            this.LJFF = (C427660Gpo) viewSd.findViewById(R.id.user_avatar_activity_status);
            this.LJIILJJIL = (TuxTextView) viewSd.findViewById(R.id.a63);
            this.LJIILL = (TuxTextView) viewSd.findViewById(R.id.a6_);
            this.LJIILLIIL = (TuxTextView) viewSd.findViewById(R.id.a6c);
            TextView textView = (TextView) viewSd.findViewById(R.id.i0_);
            TextView textView2 = (TextView) viewSd.findViewById(R.id.uh3);
            TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.xt6);
            this.LJIIZILJ = tuxTextView;
            (textView == null ? null : textView).setText("•");
            (textView2 == null ? null : textView2).setText("•");
            (tuxTextView == null ? null : tuxTextView).setText("•");
            C786410Ut5.C7(c21411818qq == null ? null : c21411818qq, new C913870ZtB(this, 6));
            C786410Ut5.U8(c197039127h == null ? null : c197039127h, new ACListenerS149S0100000_14(this, 93));
            C786410Ut5.U8(c197039127h3 == null ? null : c197039127h3, new ACListenerS149S0100000_14(this, 94));
            C786410Ut5.U8(c197039127h2 == null ? null : c197039127h2, new ACListenerS149S0100000_14(this, 95));
            User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
            if (currentUser != null) {
                IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) c01gwLIZIZ.getValue();
                String uid = currentUser.getUid();
                uid = uid == null ? "" : uid;
                UrlModel avatarMedium = currentUser.getAvatarMedium();
                iDMAvatarLoader.LIZIZ(uid, avatarMedium == null ? currentUser.getAvatarThumb() : avatarMedium, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
            }
            LIZJ(0);
            View view = viewFindViewById != null ? viewFindViewById : null;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.c7);
            view.setBackground(c384050F3z.LIZ(context));
        }
    }

    public final SpannableString LIZLLL(int i, int i2, final Function0<Unit> function0) {
        Context context = this.LIZ;
        if (context == null) {
            return null;
        }
        String string = context.getResources().getString(i);
        SpannableString spannableString = new SpannableString(this.LIZ.getResources().getString(i2, string));
        C786410Ut5.p2(spannableString, new AbstractC426530Gnz() { // from class: X.0ZJS
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                function0.invoke();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, this.LIZ);
                if (numLIZJ != null) {
                    textPaint.setColor(numLIZJ.intValue());
                }
            }
        }, a0.LJJJ(spannableString, string, 0, false, 6), spannableString.length(), 33);
        return spannableString;
    }
}
