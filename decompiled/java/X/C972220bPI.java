package X;

import Y.ARunnableS84S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0bPI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972220bPI extends RecyclerView.ViewHolder implements InterfaceC972200bPG {
    public C426160GnO LL;
    public View LLILLJJLI;
    public View LLILLL;
    public final /* synthetic */ C972230bPJ LLILZ;

    public final void L5() {
        Set setLLIIJI;
        AppCompatTextView appCompatTextView;
        String string;
        String idStr;
        if (this.LLILZ.LJ) {
            setLLIIJI = C13LP.LLIIJI(InterfaceC960800b6s.LLLLJI.LIZIZ());
        } else {
            ArrayList arrayList = new ArrayList();
            C426160GnO c426160GnO = this.LL;
            if (c426160GnO != null) {
                int childCount = c426160GnO.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = c426160GnO.getChildAt(i);
                    if (childAt != null && childAt.getHeight() != 0 && childAt.getWidth() != 0 && (appCompatTextView = (AppCompatTextView) childAt.findViewById(R.id.jpv)) != null && appCompatTextView.getText() != null) {
                        arrayList.add(appCompatTextView.getText().toString());
                    }
                }
            }
            setLLIIJI = C13LP.LLIIJI(arrayList);
        }
        Set setLJLLLLLL = C13LP.LJLLLLLL(setLLIIJI, this.LLILZ.LJFF);
        for (Object obj : setLJLLLLLL) {
            C955400ayA c955400ayA = C955400ayA.LIZ;
            int absoluteAdapterPosition = getAbsoluteAdapterPosition();
            HashMap map = new HashMap();
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            map.put("words_position", String.valueOf(absoluteAdapterPosition));
            map.put("words_type", "history");
            map.put("words_content", obj);
            String str = "";
            if (room == null || (string = Long.valueOf(room.getOwnerUserId()).toString()) == null) {
                string = "";
            }
            map.put("anchor_id", string);
            if (room != null && (idStr = room.getIdStr()) != null) {
                str = idStr;
            }
            map.put("room_id", str);
            C955400ayA.LLIILII("livesdk_connection_search_history_words_show", map);
        }
        this.LLILZ.LJFF.addAll(setLJLLLLLL);
    }

    public final void N5() {
        C426160GnO c426160GnO;
        C426160GnO c426160GnO2 = this.LL;
        if (c426160GnO2 != null) {
            C786410Ut5.LJJJJZ(c426160GnO2);
        }
        C20337914i1<List<String>> c20337914i1 = InterfaceC960800b6s.LLLLJI;
        if (c20337914i1.LIZIZ().size() == 0) {
            return;
        }
        List<String> listLIZIZ = c20337914i1.LIZIZ();
        final C972230bPJ c972230bPJ = this.LLILZ;
        final int i = 0;
        for (Object obj : listLIZIZ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            final String str = (String) obj;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ.LIZJ), R.layout.gr3, this.LL, false);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, C439101nJ.LIZ(32));
            marginLayoutParams.setMargins(C439101nJ.LIZ(6), C439101nJ.LIZ(6), C439101nJ.LIZ(6), C439101nJ.LIZ(6));
            C786410Ut5.W5(viewTd, marginLayoutParams);
            ((TextView) viewTd.findViewById(R.id.jpv)).setMaxWidth((int) (((double) C497740JfY.LJIIZILJ()) * 0.6d));
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0bPH
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    String string;
                    String idStr;
                    if (view != null) {
                        c972230bPJ.LIZIZ.Ns(str);
                        C955400ayA c955400ayA = C955400ayA.LIZ;
                        String str2 = str;
                        int i3 = i + 1;
                        HashMap map = new HashMap();
                        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                        map.put("words_position", String.valueOf(i3));
                        map.put("words_type", "history");
                        map.put("words_content", str2);
                        String str3 = "";
                        if (room == null || (string = Long.valueOf(room.getOwnerUserId()).toString()) == null) {
                            string = "";
                        }
                        map.put("anchor_id", string);
                        if (room != null && (idStr = room.getIdStr()) != null) {
                            str3 = idStr;
                        }
                        map.put("room_id", str3);
                        C955400ayA.LLIILII("livesdk_connection_search_history_words_click", map);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, viewTd);
            ((TextView) viewTd.findViewById(R.id.jpv)).setText(str);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0bPF
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    if (view != null) {
                        List<String> listLIZIZ2 = InterfaceC960800b6s.LLLLJI.LIZIZ();
                        ArrayList arrayList = new ArrayList();
                        if (listLIZIZ2 != null) {
                            Iterator<String> it2 = listLIZIZ2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(it2.next());
                            }
                        }
                        ListProtector.remove(arrayList, i);
                        C20337914i1<List<String>> c20337914i12 = InterfaceC960800b6s.LLLLJI;
                        c20337914i12.LJFF(arrayList);
                        this.N5();
                        if (c20337914i12.LIZIZ().size() == 0) {
                            c972230bPJ.LIZIZ.yr(i);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, viewTd.findViewById(R.id.jpw));
            C426160GnO c426160GnO3 = this.LL;
            if (c426160GnO3 != null) {
                c426160GnO3.addView(viewTd);
            }
            i = i2;
        }
        C972230bPJ c972230bPJ2 = this.LLILZ;
        if (c972230bPJ2.LJ && (c426160GnO = this.LL) != null) {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c426160GnO, new ARunnableS84S0200000_15(c972230bPJ2, this, 37));
        }
        C426160GnO c426160GnO4 = this.LL;
        if (c426160GnO4 != null) {
            View view = this.LLILLJJLI;
            c426160GnO4.LLJI = view;
            c426160GnO4.addView(view);
        }
    }

    public final View I5(C426160GnO c426160GnO) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ.LIZJ), R.layout.gfu, c426160GnO, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C439101nJ.LIZ(32), C439101nJ.LIZ(32));
        marginLayoutParams.setMargins(C439101nJ.LIZ(6), C439101nJ.LIZ(6), C439101nJ.LIZ(6), C439101nJ.LIZ(6));
        C786410Ut5.W5(viewTd, marginLayoutParams);
        ((LiveIconView) viewTd.findViewById(R.id.lbg)).setIconTint(R.attr.ezs);
        return viewTd;
    }

    @Override // X.InterfaceC972200bPG
    public final void Ns(String str) {
        this.LLILZ.LIZIZ.Ns(str);
    }

    @Override // X.InterfaceC972200bPG
    public final void yr(int i) {
        List<String> listLIZIZ = InterfaceC960800b6s.LLLLJI.LIZIZ();
        ArrayList arrayList = new ArrayList();
        if (listLIZIZ != null) {
            Iterator<String> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        ListProtector.remove(arrayList, i);
        C20337914i1<List<String>> c20337914i1 = InterfaceC960800b6s.LLLLJI;
        c20337914i1.LJFF(arrayList);
        if (c20337914i1.LIZIZ().size() == 0) {
            this.LLILZ.LIZIZ.yr(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C972220bPI(C972230bPJ c972230bPJ, View view) {
        super(view);
        this.LLILZ = c972230bPJ;
    }
}
