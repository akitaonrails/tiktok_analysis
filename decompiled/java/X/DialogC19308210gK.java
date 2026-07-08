package X;

import Y.ACListenerS162S0100000_28;
import Y.ACListenerS89S1100000_28;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Html;
import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10gK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class DialogC19308210gK extends DialogC1239100iLk {
    public static boolean LLILZLL = true;
    public static DialogC19308210gK LLIZ;
    public static boolean LLIZLLLIL;
    public final boolean LLILZ;
    public final boolean LLILZIL;

    public static void LJJLIIJ(DialogC1239100iLk dialogC1239100iLk, C0WZX c0wzx) throws Throwable {
        Object obj;
        DialogC19728412Gs dialogC19728412Gs = dialogC1239100iLk;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", dialogC19728412Gs, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            dialogC19728412Gs = (DialogC19728412Gs) obj;
        }
        super.show();
        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/views/ResizableDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        if (this.LLILZ) {
            try {
                LJJLIIJ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOenbZrXkjWgDPmyC3avSqi38x2SMEzEgUDAd03+VQ==", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                if (this.LLILZIL) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("toast_type", "coupon_fission");
                    C20684815ws.LJIILLIIL("toast_show", c2344009Gk.LIZ);
                }
                C19308310gL.LJII.LIZJ.LIZ(2);
            } catch (C316660CbA e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public DialogC19308210gK(Context context, UgChannelPopup ugChannelPopup) {
        UgChannelPopup channelPopup;
        String h5Link;
        super(context, R.style.aed);
        this.LLILZ = true;
        try {
            Integer imageStyle = ugChannelPopup.getImageStyle();
            int style = EnumC1156150gBx.BANNER.getStyle();
            if (imageStyle != null && imageStyle.intValue() == style) {
                this.LLILZIL = true;
            }
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZIL = false;
        }
        if (this.LLILZIL) {
            setContentView(R.layout.bmc);
        } else {
            setContentView(R.layout.bmr);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.10gU
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return i == 84;
            }
        });
        C786410Ut5.a9((TuxIconView) findViewById(R.id.e1o), new ACListenerS162S0100000_28(this, 217));
        try {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    ((TextView) findViewById(R.id.xzu)).setText(Html.fromHtml(ugChannelPopup.getTitle(), 63));
                } else {
                    ((TextView) findViewById(R.id.xzu)).setText(Html.fromHtml(ugChannelPopup.getTitle()));
                }
            } catch (C316660CbA e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                ((TextView) findViewById(R.id.eue)).setText(ugChannelPopup.getContent());
            } catch (C316660CbA e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                ((TextView) findViewById(R.id.d6g)).setText(ugChannelPopup.getButtonText());
            } catch (C316660CbA e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            final UrlModel urlModel = new UrlModel();
            try {
                urlModel.setUrlList(ugChannelPopup.getResourceUrl().getUrlList());
                urlModel.setUri(ugChannelPopup.getResourceUrl().getUri());
            } catch (C316660CbA e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            if (this.LLILZIL) {
                C1324840ka2.LJFF((RemoteImageView) findViewById(R.id.jxx), urlModel);
            } else {
                C1324840ka2.LJIJ(urlModel, 0, 0, new InterfaceC447230HgH() { // from class: X.10gP
                    @Override // X.InterfaceC447230HgH
                    public final void accept(Object obj) {
                        Bitmap bitmap = (Bitmap) obj;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            ((C1322090kVb) this.LIZ.findViewById(R.id.jxx)).setImageBitmap(bitmap);
                        } else {
                            C1324840ka2.LJFF((RemoteImageView) this.LIZ.findViewById(R.id.jxx), urlModel);
                        }
                    }
                });
            }
            UgAwemeActivitySetting ugAwemeActivitySetting = C19308310gL.LJII.LIZ;
            if (ugAwemeActivitySetting != null && (channelPopup = ugAwemeActivitySetting.getChannelPopup()) != null && (h5Link = channelPopup.getH5Link()) != null) {
                C786410Ut5.h9((TuxTextView) findViewById(R.id.d6g), new ACListenerS89S1100000_28(this, h5Link, 9));
            } else {
                this.LLILZ = false;
            }
        } catch (C316660CbA e6) {
            TryCatchGuardChecker.doCheck(e6);
            this.LLILZ = false;
        }
    }
}
