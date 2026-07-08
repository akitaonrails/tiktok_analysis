package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS425S0200000_24;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563030qmD extends AbstractC1585810rMx implements C0VWT, C0VWS {
    public final C20603715jn LL;
    public final RecyclerView LLILLJJLI;
    public final C1558530qex LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1563040qmE(this));
    public volatile boolean LLILZIL;

    public final String LJJIJIIJIL() {
        String str = this.LL.LJIIIZ;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("powerlist_fps_");
        sbLIZ.append(this.LL.LJIIIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0VWT
    public final void LIZIZ(double d) {
        C1558530qex c1558530qex = this.LLILLL;
        C1562230qkv c1562230qkv = C1562230qkv.LIZ;
        C1562270qkz c1562270qkz = new C1562270qkz(d);
        c1558530qex.getClass();
        C725430Scv.LIZIZ(c1562230qkv, new AwS425S0200000_24((Function0) c1562270qkz, (Function0<AbstractC1562180qkq>) c1558530qex, (C1558530qex) 94));
    }

    @Override // X.C0VWS
    public final void LIZLLL(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys;
        Integer num;
        int iIntValue;
        Integer num2;
        if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
            Iterator it2 = C09R4.LIZIZ(itKeys).iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object obj = jSONObject.get((String) it2.next());
                if ((obj instanceof Integer) && (num2 = (Integer) obj) != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                i += iIntValue;
            }
            if (i == 0) {
                return;
            }
            C118300cf c118300cf = new C118300cf();
            C118300cf c118300cf2 = new C118300cf();
            C118300cf c118300cf3 = new C118300cf();
            C118300cf c118300cf4 = new C118300cf();
            C118300cf c118300cf5 = new C118300cf();
            C118300cf c118300cf6 = new C118300cf();
            Iterator<String> itKeys2 = jSONObject.keys();
            if (itKeys2 != null) {
                Iterator it3 = C09R4.LIZIZ(itKeys2).iterator();
                while (it3.hasNext()) {
                    Object obj2 = jSONObject.get((String) it3.next());
                    if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                        int iIntValue2 = num.intValue();
                        if (iIntValue2 == 0) {
                            c118300cf.element = c118300cf.element;
                        } else {
                            if (1 <= iIntValue2) {
                                if (iIntValue2 < 3) {
                                    c118300cf2.element += iIntValue2;
                                } else if (3 <= iIntValue2) {
                                    if (iIntValue2 < 7) {
                                        c118300cf3.element += iIntValue2;
                                    } else if (7 <= iIntValue2) {
                                        if (iIntValue2 < 14) {
                                            c118300cf4.element += iIntValue2;
                                        } else if (iIntValue2 < 26) {
                                            c118300cf5.element += iIntValue2;
                                        }
                                    }
                                }
                            }
                            c118300cf6.element += iIntValue2;
                        }
                    }
                }
            }
            C1558530qex c1558530qex = this.LLILLL;
            C1562220qku c1562220qku = C1562220qku.LIZ;
            C1563020qmC c1563020qmC = new C1563020qmC(c118300cf, i, c118300cf2, c118300cf3, c118300cf4, c118300cf5, c118300cf6);
            c1558530qex.getClass();
            C725430Scv.LIZIZ(c1562220qku, new AwS425S0200000_24((Function0) c1563020qmC, (Function0<AbstractC1562180qkq>) c1558530qex, (C1558530qex) 94));
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (this.LLILZIL && this.LLILZIL) {
                this.LLILZIL = false;
                InterfaceC1563050qmF interfaceC1563050qmF = (InterfaceC1563050qmF) this.LLILZ.getValue();
                if (interfaceC1563050qmF != null) {
                    interfaceC1563050qmF.stop();
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLILZIL || this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        InterfaceC1563050qmF interfaceC1563050qmF2 = (InterfaceC1563050qmF) this.LLILZ.getValue();
        if (interfaceC1563050qmF2 == null) {
            return;
        }
        interfaceC1563050qmF2.start();
    }

    public C1563030qmD(C20603715jn c20603715jn, RecyclerView recyclerView, C1558530qex c1558530qex) {
        this.LL = c20603715jn;
        this.LLILLJJLI = recyclerView;
        this.LLILLL = c1558530qex;
    }
}
