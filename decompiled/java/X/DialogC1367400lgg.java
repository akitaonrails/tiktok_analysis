package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0lgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1367400lgg extends C19GU {
    public final IMContact[] LLILZLL;
    public final InterfaceC1367420lgi LLIZ;
    public final InterfaceC1367420lgi LLIZLLLIL;
    public RemoteImageView LLJ;
    public TextView LLJI;
    public ViewGroup LLJIJIL;
    public TextView LLJILJIL;
    public EditText LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public View LLJJI;
    public final SharePackage LLJJIII;
    public final Context LLJJIJI;
    public final String LLJJIJIIJIL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.LLJILJILJ.getWindowToken(), 0);
        }
        super.cancel();
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.LLJILJILJ.getWindowToken(), 0);
        }
        super.dismiss();
    }

    public DialogC1367400lgg(C1364870lcb c1364870lcb) {
        super(c1364870lcb.LIZ, R.style.adg);
        this.LLJJIJI = c1364870lcb.LIZ;
        this.LLILZLL = c1364870lcb.LIZIZ;
        this.LLJJIII = c1364870lcb.LIZJ;
        this.LLIZ = c1364870lcb.LIZLLL;
        this.LLIZLLLIL = c1364870lcb.LJ;
        this.LLJJIJIIJIL = c1364870lcb.LJFF;
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        View viewSd = C786410Ut5.Sd(R.layout.cgl, C786410Ut5.ne(this.LLJJIJI), null);
        this.LLJJI = viewSd;
        setContentView(viewSd);
        setCancelable(false);
        this.LLJILJIL = (TextView) findViewById(R.id.upy);
        this.LLJIJIL = (ViewGroup) findViewById(R.id.user_list_ll);
        this.LLJ = (RemoteImageView) findViewById(R.id.uz9);
        this.LLJI = (TextView) findViewById(R.id.v1q);
        EditText editText = (EditText) findViewById(R.id.gq9);
        this.LLJILJILJ = editText;
        editText.setText(this.LLJJIJIIJIL);
        EditText editText2 = this.LLJILJILJ;
        editText2.setSelection(C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQFMM4R6KbjUtUl+eCA", null)).length());
        this.LLJILLL = (TuxTextView) findViewById(R.id.uyt);
        this.LLJJ = (TuxTextView) findViewById(R.id.uz3);
        this.LLJILLL.setOnTouchListener(new ViewOnTouchListenerC444170HbL());
        this.LLJJ.setOnTouchListener(new ViewOnTouchListenerC444170HbL());
        C786410Ut5.h9(this.LLJILLL, new ACListenerS155S0100000_21(this, 227));
        C786410Ut5.h9(this.LLJJ, new ACListenerS155S0100000_21(this, 228));
        if (TextUtils.equals("live_event", this.LLJJIII.itemType)) {
            String string = this.LLJJIII.extras.getString("live_event_title");
            if (!TextUtils.isEmpty(string) && this.LLJI != null) {
                C844470XAv.LIZ.getClass();
                this.LLJI.setText(C844470XAv.LIZ().getResources().getString(2131834257, string));
                C786410Ut5.LLIL(this.LLJI, 0);
            }
            C786410Ut5.l(this.LLJ, 8);
        } else if (TextUtils.equals("text", this.LLJJIII.itemType)) {
            String string2 = this.LLJJIII.extras.getString("share_text");
            this.LLJI.setText(string2);
            C786410Ut5.l(this.LLJ, 8);
            C786410Ut5.LLIL(this.LLJI, 0);
            if (string2 != null && string2.length() <= 1024) {
                C439870HMr.LIZJ(this.LLJI, null);
            }
        } else if (TextUtils.equals("comment", this.LLJJIII.itemType)) {
            C786410Ut5.l(this.LLJ, 0);
            C786410Ut5.LLIL(this.LLJI, 0);
            TextView textView = this.LLJI;
            Context context = this.LLJJIJI;
            String string3 = this.LLJJIII.extras.getString("comment_author_name", "");
            this.LLJJIII.extras.getString("comment_reply_user_name", "");
            String string4 = this.LLJJIII.extras.getString("comment_text", "");
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.LLJJIJI.getResources(), R.drawable.caz);
            int iLIZJ = (int) C12ES.LIZJ(16.0f, this.LLJJIJI);
            int i = this.LLJJIII.extras.getInt("comment_media_type", 0);
            CommentSharePackage.Companion.getClass();
            textView.setText(C1351870lHd.LIZ(context, string3, string4, bitmapDecodeResource, iLIZJ, i));
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ((UrlModel) this.LLJJIII.extras.getSerializable("comment_author_avatar_url")));
            c1331670kl3LJIIIIZZ.LJJIJL(this.LLJJIJI);
            c1331670kl3LJIIIIZZ.LIZLLL("ImShareDialog");
            c1331670kl3LJIIIIZZ.LJJII(new C1401760ma6(this, 0));
            LJJZ(this.LLJ, null, this.LLJJIII, Boolean.TRUE);
        } else {
            C786410Ut5.l(this.LLJ, 0);
            C786410Ut5.LLIL(this.LLJI, 8);
            LJJZ(this.LLJ, null, this.LLJJIII, Boolean.TRUE);
        }
        EditText editText3 = this.LLJILJILJ;
        editText3.setFilters(new InputFilter[]{new C09M4(editText3)});
        this.LLJILJILJ.setOnKeyListener(new View.OnKeyListener() { // from class: X.0lgh
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return i2 == 66;
            }
        });
        IMContact[] iMContactArr = this.LLILZLL;
        if (iMContactArr != null && iMContactArr.length > 0) {
            C786410Ut5.LJJJJI(this.LLJIJIL);
            if (iMContactArr.length == 1) {
                this.LLJILJIL.setText(2131835798);
                this.LLJJ.setText(2131835796);
                View viewSd2 = C786410Ut5.Sd(R.layout.cs0, C786410Ut5.ne(getContext()), null);
                C1322110kVd c1322110kVd = (C1322110kVd) viewSd2.findViewById(R.id.bir);
                TextView textView2 = (TextView) viewSd2.findViewById(R.id.user_name);
                IMContact iMContact = iMContactArr[0];
                C0I98.LJIIJ(c1322110kVd, iMContact.getDisplayAvatar(), "ImShareDialog:bindShareToView", C454440Hru.LIZ());
                if (iMContact instanceof IMUser) {
                    textView2.setText(iMContact.getDisplayName());
                    IMUser iMUser = (IMUser) iMContact;
                    C1908030zkf.LJI(getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), textView2);
                } else {
                    textView2.setText(iMContact.getDisplayName());
                    C1908030zkf.LJI(getContext(), "", "", textView2);
                }
                this.LLJIJIL.addView(viewSd2);
                return;
            }
            this.LLJILJIL.setText(2131835740);
            int length = iMContactArr.length;
            for (IMContact iMContact2 : iMContactArr) {
                View viewSd3 = C786410Ut5.Sd(R.layout.crs, C786410Ut5.ne(getContext()), null);
                C1322110kVd c1322110kVd2 = (C1322110kVd) viewSd3.findViewById(R.id.bir);
                TuxIconView tuxIconView = (TuxIconView) viewSd3.findViewById(R.id.verify_iv);
                C0I98.LJIIJ(c1322110kVd2, iMContact2.getDisplayAvatar(), "ImShareDialog:bindShareToView", C454440Hru.LIZ());
                C2201961BFy.LIZ(tuxIconView, C903150Zbt.LIZ(iMContact2));
                this.LLJIJIL.addView(viewSd3);
            }
            TuxTextView tuxTextView = this.LLJJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) getContext().getResources().getText(2131835796));
            sbLIZ.append(e3.h);
            sbLIZ.append(length);
            sbLIZ.append(")");
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJZ(com.ss.android.ugc.aweme.base.ui.RemoteImageView r17, com.bytedance.tux.icon.TuxIconView r18, com.ss.android.ugc.aweme.sharer.model.SharePackage r19, java.lang.Boolean r20) {
        /*
            Method dump skipped, instruction units count: 2166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC1367400lgg.LJJZ(com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.bytedance.tux.icon.TuxIconView, com.ss.android.ugc.aweme.sharer.model.SharePackage, java.lang.Boolean):boolean");
    }
}
