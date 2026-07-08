package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0y1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class DialogC1841380y1A extends AbstractDialogC972150bPB {
    public final boolean LLJI;
    public EnumC1815680xLi LLJIJIL;
    public final Function1<EnumC1815680xLi, Unit> LLJILJIL;
    public View LLJILJILJ;
    public C16FS LLJILLL;
    public C1324720kZq LLJJ;
    public C1324720kZq LLJJI;
    public TextView LLJJIII;
    public TextView LLJJIJI;
    public C20744016Fi LLJJIJIIJIL;
    public C20744016Fi LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public boolean LLJJJJ;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g4v;
    }

    public final void LJL() {
        C20744016Fi c20744016Fi = this.LLJJIJIIJIL;
        if (c20744016Fi != null) {
            c20744016Fi.setChecked(true);
        }
        C20744016Fi c20744016Fi2 = this.LLJJIJIL;
        if (c20744016Fi2 != null) {
            c20744016Fi2.setChecked(false);
        }
    }

    public final void LJLI() {
        C20744016Fi c20744016Fi = this.LLJJIJIL;
        if (c20744016Fi != null) {
            c20744016Fi.setChecked(true);
        }
        C20744016Fi c20744016Fi2 = this.LLJJIJIIJIL;
        if (c20744016Fi2 != null) {
            c20744016Fi2.setChecked(false);
        }
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJILJILJ = findViewById(R.id.c7_);
        this.LLJILLL = (C16FS) findViewById(R.id.c70);
        this.LLJJ = (C1324720kZq) findViewById(R.id.c71);
        this.LLJJI = (C1324720kZq) findViewById(R.id.f682c75);
        this.LLJJIII = (TextView) findViewById(R.id.c74);
        this.LLJJIJI = (TextView) findViewById(R.id.c78);
        this.LLJJIJIIJIL = (C20744016Fi) findViewById(R.id.c72);
        this.LLJJIJIL = (C20744016Fi) findViewById(R.id.c76);
        this.LLJJJ = findViewById(R.id.c73);
        this.LLJJJIL = findViewById(R.id.c77);
        if (this.LLJI) {
            LJLI();
            C20744016Fi c20744016Fi = this.LLJJIJIIJIL;
            if (c20744016Fi != null) {
                c20744016Fi.setBackgroundResource(R.drawable.dp4);
            }
        } else {
            int i = C1819360xRe.LIZ[this.LLJIJIL.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    LJLI();
                } else {
                    throw new C1954807lC();
                }
            } else {
                LJL();
            }
        }
        C1143680frq.LIZLLL(this.LLJJ, "tiktok_live_interaction_normal_3", "ttlive_boards_create_selector_general.png");
        C1143680frq.LIZLLL(this.LLJJI, "tiktok_live_interaction_normal_3", "ttlive_boards_create_selector_multi_guest.png");
        if (C497740JfY.LJJ()) {
            C1324720kZq c1324720kZq = this.LLJJ;
            if (c1324720kZq != null) {
                C786410Ut5.Yb(c1324720kZq, -1.0f);
            }
            C1324720kZq c1324720kZq2 = this.LLJJI;
            if (c1324720kZq2 != null) {
                C786410Ut5.Yb(c1324720kZq2, -1.0f);
            }
        }
        View view = this.LLJILJILJ;
        if (view != null) {
            C500260Jjc.LJLIIIL(500L, view, new C1821420xUy(this));
        }
        C16FS c16fs = this.LLJILLL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0y1B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EnumC1815680xLi enumC1815680xLi;
                    DialogC1841380y1A dialogC1841380y1A = this.LL;
                    if (dialogC1841380y1A.LLJJJJ) {
                        return;
                    }
                    dialogC1841380y1A.LLJJJJ = true;
                    Function1<EnumC1815680xLi, Unit> function1 = dialogC1841380y1A.LLJILJIL;
                    C20744016Fi c20744016Fi2 = dialogC1841380y1A.LLJJIJIIJIL;
                    if (c20744016Fi2 != null && c20744016Fi2.isChecked()) {
                        enumC1815680xLi = EnumC1815680xLi.GENERAL;
                    } else {
                        enumC1815680xLi = EnumC1815680xLi.MULTI_GUEST;
                    }
                    function1.invoke(enumC1815680xLi);
                    DialogC1841380y1A dialogC1841380y1A2 = this.LL;
                    dialogC1841380y1A2.dismiss();
                    C785410UrT.LIZ(dialogC1841380y1A2);
                }
            });
        }
        if (!this.LLJI) {
            TextView textView = this.LLJJIII;
            if (textView != null) {
                C500260Jjc.LJLIIIL(500L, textView, new C1841400y1C(this));
            }
            View view2 = this.LLJJJ;
            if (view2 != null) {
                C500260Jjc.LJLIIIL(500L, view2, new C1841410y1D(this));
            }
            C1324720kZq c1324720kZq3 = this.LLJJ;
            if (c1324720kZq3 != null) {
                C500260Jjc.LJLIIIL(500L, c1324720kZq3, new C1841420y1E(this));
            }
        }
        TextView textView2 = this.LLJJIJI;
        if (textView2 != null) {
            C500260Jjc.LJLIIIL(500L, textView2, new C1841430y1F(this));
        }
        View view3 = this.LLJJJIL;
        if (view3 != null) {
            C500260Jjc.LJLIIIL(500L, view3, new C1841440y1G(this));
        }
        C1324720kZq c1324720kZq4 = this.LLJJI;
        if (c1324720kZq4 != null) {
            C500260Jjc.LJLIIIL(500L, c1324720kZq4, new C1841450y1H(this));
        }
    }

    public DialogC1841380y1A(Context context, boolean z, EnumC1815680xLi enumC1815680xLi, C1819300xRY c1819300xRY) {
        super(context);
        this.LLJI = z;
        this.LLJIJIL = enumC1815680xLi;
        this.LLJILJIL = c1819300xRY;
    }
}
