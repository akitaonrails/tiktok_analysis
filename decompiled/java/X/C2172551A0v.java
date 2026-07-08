package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import r4b.c;
import r4b.g;

/* JADX INFO: renamed from: X.1A0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172551A0v extends AbstractC1747950vaT<Object> {
    public final g LLILZIL;
    public InterfaceC2172581A0y LLILZLL;

    @Override // X.AbstractC1747950vaT
    public final void LLLIILIL(C19465311Dn c19465311Dn) {
        Object obj;
        g cVar;
        Map<String, Object> map = this.LLILLL;
        if (map != null) {
            obj = map.get("style");
        } else {
            obj = null;
        }
        if (!(obj instanceof g) || (cVar = (g) obj) == null) {
            cVar = new c();
        }
        c19465311Dn.LJFF(new AwS612S0100000_33(this, 180), new AwS612S0100000_33(cVar, 181), null);
        c19465311Dn.LJFF(new AwS612S0100000_33(this, 182), new AwS612S0100000_33(cVar, 183), null);
        c19465311Dn.LJFF(new AwS612S0100000_33(this, 184), new AwS612S0100000_33(cVar, 185), null);
        c19465311Dn.LJFF(new AwS612S0100000_33(this, 186), AFwS228S0000000_1.get$arr$(661), null);
        c19465311Dn.LJFF(new AwS612S0100000_33(this, 179), AFwS279S0000000_33.get$arr$(311), null);
    }

    @Override // X.C11DY, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return this.LLILZ.LIZIZ(i);
    }

    public C2172551A0v(Fragment fragment, g gVar) {
        super(fragment, new C1065604Es(), null, C2097908Jt.LIZJ(new Pair("style", gVar)));
        this.LLILZIL = gVar;
    }

    @Override // X.C11DY, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i, List<Object> list) {
        super.onBindViewHolder(viewHolder, i, list);
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.1A0x
            @Override // X.AbstractViewOnClickListenerC420730Ged
            public final void LIZ(View view) {
                C2172551A0v c2172551A0v;
                InterfaceC2172581A0y interfaceC2172581A0y;
                if (view != null && (interfaceC2172581A0y = (c2172551A0v = this.LLILZ).LLILZLL) != null) {
                    int i2 = i;
                    interfaceC2172581A0y.LJJIFFI(i2, c2172551A0v.LLLIIIIL(i2, false));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, viewHolder.itemView);
        viewHolder.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: X.1A0w
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C2172551A0v c2172551A0v;
                InterfaceC2172581A0y interfaceC2172581A0y;
                if (motionEvent.getAction() == 0 && (interfaceC2172581A0y = (c2172551A0v = this.LL).LLILZLL) != null) {
                    int i2 = i;
                    c2172551A0v.LLLIIIIL(i2, false);
                    interfaceC2172581A0y.M2(i2);
                }
                return false;
            }
        });
        InterfaceC2172581A0y interfaceC2172581A0y = this.LLILZLL;
        if (interfaceC2172581A0y != null) {
            LLLIIIIL(i, false);
            interfaceC2172581A0y.LJJLIIIJ(i, viewHolder);
        }
    }
}
