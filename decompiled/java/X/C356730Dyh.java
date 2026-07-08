package X;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Dyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C356730Dyh extends C348440DlK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILJJIL;
    public String LJIIL;
    public final C357070DzF LJIILIIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C356730Dyh.class, "color", "getColor()I", 0);
        C13LE.LIZ.getClass();
        LJIILJJIL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public C356730Dyh() {
        this(null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0DzF] */
    public C356730Dyh(String str) {
        super(EnumC356050Dxb.TEXT);
        this.LJIIL = str;
        final int i = -1;
        this.LJIILIIL = new C0NTU<Integer>(i) { // from class: X.0DzF
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                String str2 = this.LJIIL;
                if (str2 == null || str2.length() == 0) {
                    this.LJIIL = "{}";
                }
                C356730Dyh c356730Dyh = this;
                JSONObject jSONObject = new JSONObject(this.LJIIL);
                this.getClass();
                List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(Color.red(iIntValue)), Integer.valueOf(Color.green(iIntValue)), Integer.valueOf(Color.blue(iIntValue)), Integer.valueOf(Color.alpha(iIntValue)));
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
                Iterator it2 = listLJIIJJI.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Double.valueOf(((double) ((Number) it2.next()).intValue()) / 255.0d));
                }
                c356730Dyh.LJIIL = C786410Ut5.J3(jSONObject.put("textColor", new JSONArray((Collection) arrayList)));
            }
        };
    }
}
