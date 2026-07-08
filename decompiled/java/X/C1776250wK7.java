package X;

import Y.ARunnableS126S0100000_26;
import android.graphics.drawable.Animatable;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0wK7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776250wK7 extends C1320700kTM {
    public final int $t;
    public Object l0;

    public static final void LIZLLL$0(C1776250wK7 c1776250wK7, String str, Throwable th) {
    }

    public static final void LIZLLL$1(C1776250wK7 c1776250wK7, String str, Throwable th) {
    }

    public static final void LJFF$0(C1776250wK7 c1776250wK7, Object obj, String str) {
    }

    public static final void LJFF$1(C1776250wK7 c1776250wK7, Object obj, String str) {
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this, str, th);
                break;
            case 1:
                LIZLLL$1(this, str, th);
                break;
            default:
                super.LIZLLL(str, th);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, obj, animatable);
                break;
            case 1:
                LJ$1(this, str, obj, animatable);
                break;
            default:
                super.LJ(str, obj, animatable);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, obj, str);
                break;
            case 1:
                LJFF$1(this, obj, str);
                break;
            default:
                super.LJFF(obj, str);
                break;
        }
    }

    public C1776250wK7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJ$0(C1776250wK7 c1776250wK7, String str, Object obj, Animatable animatable) {
        C1765450w2h c1765450w2h = (C1765450w2h) c1776250wK7.l0;
        HandlerHook.viewPost(c1765450w2h.LL, new ARunnableS126S0100000_26(c1765450w2h, 42));
        C1765450w2h c1765450w2h2 = (C1765450w2h) c1776250wK7.l0;
        InterfaceC1763180vz2 interfaceC1763180vz2 = c1765450w2h2.LLILZLL;
        if (interfaceC1763180vz2 != null) {
            interfaceC1763180vz2.LJIIJJI(((C1765450w2h) c1776250wK7.l0).LL.getImageBounds(), c1765450w2h2.getLayoutPosition());
        }
    }

    public static final void LJ$1(C1776250wK7 c1776250wK7, String str, Object obj, Animatable animatable) {
        C1765440w2g c1765440w2g = (C1765440w2g) c1776250wK7.l0;
        InterfaceC1763180vz2 interfaceC1763180vz2 = c1765440w2g.LLILLL;
        if (interfaceC1763180vz2 != null) {
            interfaceC1763180vz2.LJIIJJI(((C1765440w2g) c1776250wK7.l0).LLILLJJLI.getImageBounds(), c1765440w2g.getLayoutPosition());
        }
    }
}
