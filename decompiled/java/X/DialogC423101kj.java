package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.01kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC423101kj extends AbstractDialogC972150bPB {
    public final InterfaceC423001ki LLJI;
    public final String LLJIJIL;
    public View LLJILJIL;
    public C16FS LLJILJILJ;
    public C16FS LLJILLL;
    public EnumC421901kX LLJJ;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g93;
    }

    @Override // X.C19GI, X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT/6WoEEzjUHyaNggw+opQ1Bb50dXc5Jfr6fofKdXJOzwcJAbwYo=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C19GI c19gi = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GI) obj;
            super.show();
            c0wst.LIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", null, objArr, c19gi, c0wzw, true);
        }
        C320501Md.LIZJ("show", "");
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJ = EnumC421901kX.OTHER;
        this.LLJILJIL = findViewById(R.id.v_f);
        this.LLJILJILJ = (C16FS) findViewById(R.id.cny);
        this.LLJILLL = (C16FS) findViewById(R.id.cp0);
        TextView textView = (TextView) findViewById(R.id.zk9);
        if (textView != null) {
            textView.setText(this.LLJIJIL);
        }
        C16FS c16fs = this.LLJILJILJ;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ViewOnClickListenerC512201z6(this, 45));
        }
        C16FS c16fs2 = this.LLJILLL;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ViewOnClickListenerC512201z6(this, 46));
        }
    }

    public DialogC423101kj(Context context, C421601kU c421601kU, String str) {
        super(context);
        this.LLJI = c421601kU;
        this.LLJIJIL = str;
        this.LLJJ = EnumC421901kX.OTHER;
    }
}
