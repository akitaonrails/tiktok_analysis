package X;

import Y.ACListenerS110S0200000_6;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Hkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C449930Hkd extends RecyclerView.ViewHolder {
    public final InterfaceC449980Hki LL;
    public InterfaceC449910Hkb LLILLJJLI;

    public final void I5(InterfaceC449910Hkb interfaceC449910Hkb) {
        InterfaceC337240DJy interfaceC337240DJy;
        this.LLILLJJLI = interfaceC449910Hkb;
        if (interfaceC449910Hkb instanceof InterfaceC449960Hkg) {
            KeyEvent.Callback callback = this.itemView;
            if ((callback instanceof InterfaceC337240DJy) && (interfaceC337240DJy = (InterfaceC337240DJy) callback) != null) {
                interfaceC449910Hkb.LJ().onShow();
                interfaceC337240DJy.LIZ(((InterfaceC449960Hkg) interfaceC449910Hkb).LIZ(), new C449940Hke(this));
                C786410Ut5.I7(new ACListenerS110S0200000_6(this, interfaceC449910Hkb, 61), this.itemView);
            }
        }
    }

    public final void L5(String str) {
        InterfaceC449950Hkf interfaceC449950HkfLJ;
        InterfaceC449980Hki interfaceC449980Hki = this.LL;
        C2097608Jq.LJ();
        C449920Hkc c449920Hkc = (C449920Hkc) interfaceC449980Hki;
        InterfaceC449910Hkb interfaceC449910Hkb = c449920Hkc.LIZ.LLILZIL;
        if (interfaceC449910Hkb != null) {
            int position = interfaceC449910Hkb.getPosition();
            C449890HkZ c449890HkZ = c449920Hkc.LIZ;
            c449890HkZ.LLILZIL = null;
            c449890HkZ.notifyItemRemoved(position);
        }
        InterfaceC449910Hkb interfaceC449910Hkb2 = this.LLILLJJLI;
        if (interfaceC449910Hkb2 != null && (interfaceC449950HkfLJ = interfaceC449910Hkb2.LJ()) != null) {
            interfaceC449950HkfLJ.LIZIZ(C2097908Jt.LIZJ(new Pair("action_type", str)));
        }
    }

    public C449930Hkd(View view, C449920Hkc c449920Hkc) {
        super(view);
        this.LL = c449920Hkc;
    }
}
