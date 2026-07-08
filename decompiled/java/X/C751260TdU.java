package X;

import android.view.View;
import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0TdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751260TdU extends AbstractC751190TdN {
    public final boolean LIZIZ;
    public final View LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final DataChannel LJFF;
    public final LifecycleOwner LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final View LJIIIZ;
    public final CommentSwitchSettings LJIIJ;
    public final C20744116Fj LJIIJJI;
    public final C20744116Fj LJIIL;
    public final C20744116Fj LJIILIIL;
    public final C21411718qp LJIILJJIL;
    public final View LJIILL;
    public final C16FZ LJIILLIIL;
    public final View LJIIZILJ;
    public final View LJIJ;

    @Override // X.AbstractC751190TdN
    public final HashMap<String, String> LIZ() {
        HashMap<String, String> map = new HashMap<>();
        if (this.LIZLLL.length() > 0) {
            map.put("trigger", this.LIZLLL);
        }
        if (this.LJ.length() > 0) {
            map.put("entry", this.LJ);
        }
        return map;
    }

    public final boolean LIZLLL() {
        return (!C01C5.LIZ(this.LJFF) || C500260Jjc.LJJIJLIJ() || C488040JBy.LIZ(14)) ? false : true;
    }

    @Override // X.AbstractC751190TdN
    public final boolean LIZIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751260TdU.LJ(X.05Vn):java.lang.Object");
    }

    public final void LJI(CommentSwitchSettings commentSwitchSettings) {
        Integer numValueOf;
        View view;
        int i;
        Integer numValueOf2;
        Integer numValueOf3;
        C20744116Fj c20744116Fj = this.LJIIJJI;
        Integer numValueOf4 = null;
        if (c20744116Fj != null) {
            if (commentSwitchSettings != null) {
                numValueOf3 = Integer.valueOf(commentSwitchSettings.chatSpamComments);
            } else {
                numValueOf3 = null;
            }
            boolean zLIZ = C750850Tcp.LIZ(InterfaceC1106030et7.i6.LIZIZ().booleanValue(), numValueOf3);
            this.LJIIJ.chatSpamComments = C750850Tcp.LIZIZ(zLIZ);
            c20744116Fj.setChecked(zLIZ);
        }
        C20744116Fj c20744116Fj2 = this.LJIIL;
        if (c20744116Fj2 != null) {
            if (commentSwitchSettings != null) {
                numValueOf2 = Integer.valueOf(commentSwitchSettings.chatL2);
            } else {
                numValueOf2 = null;
            }
            boolean zLIZ2 = C750850Tcp.LIZ(InterfaceC1106030et7.j6.LIZIZ().booleanValue(), numValueOf2);
            this.LJIIJ.chatL2 = C750850Tcp.LIZIZ(zLIZ2);
            c20744116Fj2.setChecked(zLIZ2);
        }
        if (commentSwitchSettings != null) {
            numValueOf = Integer.valueOf(commentSwitchSettings.chatCommunityFlagged);
        } else {
            numValueOf = null;
        }
        boolean zLIZ3 = C750850Tcp.LIZ(InterfaceC1106030et7.k6.LIZIZ().booleanValue(), numValueOf);
        this.LJIIJ.chatCommunityFlagged = C750850Tcp.LIZIZ(zLIZ3);
        C20744116Fj c20744116Fj3 = this.LJIILIIL;
        if (c20744116Fj3 != null) {
            c20744116Fj3.setChecked(zLIZ3);
        }
        C21411718qp c21411718qp = this.LJIILJJIL;
        if (c21411718qp != null) {
            if (commentSwitchSettings != null) {
                numValueOf4 = Integer.valueOf(commentSwitchSettings.chatCommunityFlaggedReview);
            }
            boolean zLIZ4 = C750850Tcp.LIZ(InterfaceC1106030et7.l6.LIZIZ().booleanValue(), numValueOf4);
            this.LJIIJ.chatCommunityFlaggedReview = C750850Tcp.LIZIZ(zLIZ4);
            c21411718qp.setChecked(zLIZ4);
        }
        View view2 = this.LJIILL;
        int i2 = 0;
        if (view2 != null) {
            if (zLIZ3) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        if (!C500260Jjc.LJJIJLIJ() && (view = this.LJIIZILJ) != null) {
            if (!zLIZ3) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        if (LIZLLL()) {
            View view3 = this.LJIIZILJ;
            if (view3 != null) {
                C500260Jjc.LJIILIIL(view3);
            }
            View view4 = this.LJIILL;
            if (view4 != null) {
                C500260Jjc.LJIILIIL(view4);
            }
        }
    }

    public final void LJFF(HashMap<Integer, Boolean> map, CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Observer<Unit> observer) {
        C500260Jjc.LJJJJJ(this.LJI, null, new C751200TdO(this, map, observer, compoundButton, onCheckedChangeListener, null), 3);
    }

    public C751260TdU(boolean z, View view, String str, String str2, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        C20744116Fj c20744116Fj;
        C20744116Fj c20744116Fj2;
        C20744116Fj c20744116Fj3;
        C21411718qp c21411718qp;
        View viewFindViewById4;
        C16FZ c16fz;
        View viewFindViewById5;
        this.LIZIZ = z;
        this.LIZJ = view;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = dataChannel;
        this.LJI = lifecycleOwner;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.nc0);
        } else {
            viewFindViewById = null;
        }
        this.LJII = viewFindViewById;
        if (view != null) {
            viewFindViewById2 = view.findViewById(R.id.ngk);
        } else {
            viewFindViewById2 = null;
        }
        this.LJIIIIZZ = viewFindViewById2;
        if (view != null) {
            viewFindViewById3 = view.findViewById(R.id.ni2);
        } else {
            viewFindViewById3 = null;
        }
        this.LJIIIZ = viewFindViewById3;
        this.LJIIJ = new CommentSwitchSettings();
        if (view != null) {
            c20744116Fj = (C20744116Fj) view.findViewById(R.id.mi5);
        } else {
            c20744116Fj = null;
        }
        this.LJIIJJI = c20744116Fj;
        if (view != null) {
            c20744116Fj2 = (C20744116Fj) view.findViewById(R.id.mi4);
        } else {
            c20744116Fj2 = null;
        }
        this.LJIIL = c20744116Fj2;
        if (view != null) {
            c20744116Fj3 = (C20744116Fj) view.findViewById(R.id.mi3);
        } else {
            c20744116Fj3 = null;
        }
        this.LJIILIIL = c20744116Fj3;
        if (view != null) {
            c21411718qp = (C21411718qp) view.findViewById(R.id.nsj);
        } else {
            c21411718qp = null;
        }
        this.LJIILJJIL = c21411718qp;
        if (view != null) {
            viewFindViewById4 = view.findViewById(R.id.nh3);
        } else {
            viewFindViewById4 = null;
        }
        this.LJIILL = viewFindViewById4;
        if (view != null) {
            c16fz = (C16FZ) view.findViewById(R.id.nnp);
        } else {
            c16fz = null;
        }
        this.LJIILLIIL = c16fz;
        if (view != null) {
            viewFindViewById5 = view.findViewById(R.id.nh4);
        } else {
            viewFindViewById5 = null;
        }
        this.LJIIZILJ = viewFindViewById5;
        this.LJIJ = view != null ? view.findViewById(R.id.tgz) : null;
    }
}
