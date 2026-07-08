package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommercelive.common.container.lynxcard.LynxCardEventParams;
import com.ss.android.ugc.aweme.ecommercelive.common.container.lynxcard.LynxCardTemplateEventData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17y6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21202017y6 extends ConstraintLayout implements InterfaceC1141530foN {
    public static final /* synthetic */ int LLIZ = 0;
    public InterfaceC1541990qEH LL;
    public C21208017z4 LLILLJJLI;
    public AbstractC21191617wQ LLILLL;
    public C1564050qnr LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    private final Set<InterfaceC21202517yB> getEventSubscribers() {
        return (Set) this.LLILZIL.getValue();
    }

    private final String getUserId() {
        return (String) this.LLILZLL.getValue();
    }

    public final String e0() {
        C1537480q70 hybridContext;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LL;
        if (interfaceC1541990qEH == null || (hybridContext = interfaceC1541990qEH.getHybridContext()) == null) {
            return null;
        }
        return hybridContext.containerId;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1564050qnr c1564050qnr = this.LLILZ;
        sbLIZ.append(c1564050qnr != null ? c1564050qnr.LIZ : null);
        sbLIZ.append(" onAttachedToWindow: ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        Iterator<T> it2 = getEventSubscribers().iterator();
        while (it2.hasNext()) {
            Iterator<T> it3 = ((InterfaceC21202517yB) it2.next()).events().iterator();
            while (it3.hasNext()) {
                C1548820qPI.LIZLLL((String) it3.next(), this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1564050qnr c1564050qnr = this.LLILZ;
        sbLIZ.append(c1564050qnr != null ? c1564050qnr.LIZ : null);
        sbLIZ.append(" onDetachedFromWindow: ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        Iterator<T> it2 = getEventSubscribers().iterator();
        while (it2.hasNext()) {
            Iterator<T> it3 = ((InterfaceC21202517yB) it2.next()).events().iterator();
            while (it3.hasNext()) {
                C1548820qPI.LJIIIIZZ((String) it3.next(), this);
            }
        }
    }

    public /* synthetic */ C21202017y6(Context context) {
        this(context, null, 0);
    }

    public final void ga0(boolean z) {
        String str;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1564050qnr c1564050qnr = this.LLILZ;
        if (c1564050qnr != null) {
            str = c1564050qnr.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" refresh data:");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        l0(!z);
    }

    public final void h0(InterfaceC21202517yB interfaceC21202517yB) {
        getEventSubscribers().add(interfaceC21202517yB);
    }

    public final void i0(LynxCardEventParams lynxCardEventParams) {
        LynxView lynxView;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1564050qnr c1564050qnr = this.LLILZ;
        String str = null;
        if (c1564050qnr != null) {
            str = c1564050qnr.LIZ;
        }
        sbLIZ.append(str);
        sbLIZ.append(" updateTemplateData direct:");
        sbLIZ.append(lynxCardEventParams);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZJ(strLIZIZ);
        Object obj = this.LL;
        if ((obj instanceof LynxView) && (lynxView = (LynxView) obj) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("event_info", new JSONObject(C1741890vQh.LJIIIIZZ(new LynxCardTemplateEventData(lynxCardEventParams, String.valueOf(System.currentTimeMillis())))));
            lynxView.updateData(TemplateData.LJII(linkedHashMap));
        }
    }

    public final void l0(boolean z) {
        boolean z2;
        String str;
        Map<String, Object> mapLIZJ;
        String str2;
        Map<String, Object> mapLJ;
        LynxView lynxView;
        Map<String, Object> mapLJ2;
        String str3;
        Map<String, Object> mapLIZIZ;
        Map<String, Object> mapLJ3;
        String str4;
        AbstractC21191617wQ abstractC21191617wQ = this.LLILLL;
        if (abstractC21191617wQ != null) {
            abstractC21191617wQ.LIZ(Long.valueOf(System.currentTimeMillis()), "update_template_time");
            if (Intrinsics.LJFF(Boolean.valueOf(!z), Boolean.TRUE)) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            abstractC21191617wQ.LIZ(str4, "is_new");
        }
        C21208017z4 c21208017z4 = this.LLILLJJLI;
        if (c21208017z4 != null && c21208017z4.LIZLLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        Map<String, Object> mapLIZIZ2 = null;
        if (z2) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1564050qnr c1564050qnr = this.LLILZ;
            if (c1564050qnr != null) {
                str3 = c1564050qnr.LIZ;
            } else {
                str3 = null;
            }
            sbLIZ.append(str3);
            sbLIZ.append(" update global props:");
            AbstractC21191617wQ abstractC21191617wQ2 = this.LLILLL;
            if (abstractC21191617wQ2 != null) {
                mapLIZIZ = abstractC21191617wQ2.LIZIZ();
            } else {
                mapLIZIZ = null;
            }
            sbLIZ.append(mapLIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZJ(strLIZIZ);
            InterfaceC1541990qEH interfaceC1541990qEH = this.LL;
            if (interfaceC1541990qEH != null) {
                AbstractC21191617wQ abstractC21191617wQ3 = this.LLILLL;
                if (abstractC21191617wQ3 == null || (mapLJ3 = abstractC21191617wQ3.LIZIZ()) == null) {
                    mapLJ3 = C2097608Jq.LJ();
                }
                interfaceC1541990qEH.U0(mapLJ3);
            }
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        C1564050qnr c1564050qnr2 = this.LLILZ;
        if (c1564050qnr2 != null) {
            str = c1564050qnr2.LIZ;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        sbLIZ2.append(" updateTemplateData fromRefresh:");
        sbLIZ2.append(z);
        sbLIZ2.append(", ");
        AbstractC21191617wQ abstractC21191617wQ4 = this.LLILLL;
        if (abstractC21191617wQ4 != null) {
            mapLIZJ = abstractC21191617wQ4.LIZJ();
        } else {
            mapLIZJ = null;
        }
        sbLIZ2.append(mapLIZJ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c2341109Fh2.getClass();
        C2341109Fh.LIZJ(strLIZIZ2);
        Object obj = this.LL;
        if ((obj instanceof LynxView) && (lynxView = (LynxView) obj) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC21191617wQ abstractC21191617wQ5 = this.LLILLL;
            if (abstractC21191617wQ5 == null || (mapLJ2 = abstractC21191617wQ5.LIZJ()) == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            linkedHashMap.putAll(mapLJ2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateTemplateData ");
            sbLIZ3.append(jCurrentTimeMillis);
            linkedHashMap.put("debug_key", C2188811AlT.LIZIZ(sbLIZ3));
            lynxView.updateData(TemplateData.LJII(linkedHashMap));
        }
        C21208017z4 c21208017z42 = this.LLILLJJLI;
        if (c21208017z42 != null && c21208017z42.LIZLLL) {
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        C1564050qnr c1564050qnr3 = this.LLILZ;
        if (c1564050qnr3 != null) {
            str2 = c1564050qnr3.LIZ;
        } else {
            str2 = null;
        }
        sbLIZ4.append(str2);
        sbLIZ4.append(" update global props:");
        AbstractC21191617wQ abstractC21191617wQ6 = this.LLILLL;
        if (abstractC21191617wQ6 != null) {
            mapLIZIZ2 = abstractC21191617wQ6.LIZIZ();
        }
        sbLIZ4.append(mapLIZIZ2);
        C2341109Fh.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LL;
        if (interfaceC1541990qEH2 == null) {
            return;
        }
        AbstractC21191617wQ abstractC21191617wQ7 = this.LLILLL;
        if (abstractC21191617wQ7 == null || (mapLJ = abstractC21191617wQ7.LIZIZ()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        interfaceC1541990qEH2.U0(mapLJ);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        Map<String, Object> mapLIZ;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null || (mapLIZ = interfaceC1107590evd.LIZ()) == null || (string = mapLIZ.toString()) == null) {
            string = "";
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent ");
        sbLIZ.append(c262100zr.LIZ);
        sbLIZ.append(',');
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        Set<InterfaceC21202517yB> eventSubscribers = getEventSubscribers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : eventSubscribers) {
            if (((InterfaceC21202517yB) obj).events().contains(c262100zr.LIZ)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC21202517yB) it2.next()).LLLLLLLLL(c262100zr);
        }
    }

    public C21202017y6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(659));
        this.LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(660));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(java.lang.String r19, X.C1564050qnr r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21202017y6.j0(java.lang.String, X.0qnr, java.lang.String):void");
    }
}
