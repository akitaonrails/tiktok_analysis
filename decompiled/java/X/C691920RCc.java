package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0RCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691920RCc extends C09AY implements InterfaceC1631620sYq<List<? extends String>, List<? extends String>, List<? extends Integer>, Unit> {
    public final /* synthetic */ C0RCY LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C691920RCc(C0RCY c0rcy, int i, int i2) {
        super(3);
        this.LL = c0rcy;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(List<? extends String> list, List<? extends String> list2, List<? extends Integer> list3) {
        int i;
        String str;
        String str2;
        String str3;
        Boolean boolValueOf;
        Long lValueOf;
        C0RCU c0rcu;
        C0RCU c0rcu2;
        C691980RCi c691980RCi;
        C691980RCi c691980RCi2;
        C691980RCi c691980RCi3;
        C691980RCi c691980RCi4;
        List<? extends String> list4 = list;
        List<? extends String> list5 = list2;
        List<? extends Integer> list6 = list3;
        C691910RCb c691910RCb = this.LL.LIZIZ;
        if (c691910RCb != null) {
            i = c691910RCb.LIZIZ;
        } else {
            i = 0;
        }
        if (!list4.isEmpty() && list4.size() == list5.size() && list4.size() == list6.size()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            C0RCR c0rcr = this.LL.LIZ;
            Boolean boolValueOf2 = null;
            if (c0rcr != null && (c691980RCi4 = c0rcr.LIZJ) != null) {
                str = c691980RCi4.LIZ;
            } else {
                str = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", str);
            C0RCR c0rcr2 = this.LL.LIZ;
            if (c0rcr2 != null && (c691980RCi3 = c0rcr2.LIZJ) != null) {
                str2 = c691980RCi3.LIZIZ;
            } else {
                str2 = null;
            }
            c2344009Gk.LJIIIIZZ("feed_scene", str2);
            C0RCR c0rcr3 = this.LL.LIZ;
            if (c0rcr3 != null && (c691980RCi2 = c0rcr3.LIZJ) != null) {
                str3 = c691980RCi2.LIZJ;
            } else {
                str3 = null;
            }
            c2344009Gk.LJIIIIZZ("fcp_genre", str3);
            C0RCR c0rcr4 = this.LL.LIZ;
            if (c0rcr4 != null && (c691980RCi = c0rcr4.LIZJ) != null) {
                boolValueOf = Boolean.valueOf(c691980RCi.LIZLLL);
            } else {
                boolValueOf = null;
            }
            c2344009Gk.LJ(boolValueOf, "after_on_create");
            C0RCR c0rcr5 = this.LL.LIZ;
            if (c0rcr5 != null && (c0rcu2 = c0rcr5.LIZIZ) != null) {
                lValueOf = Long.valueOf(c0rcu2.LIZ);
            } else {
                lValueOf = null;
            }
            c2344009Gk.LJ(lValueOf, "duration_to_selected");
            C0RCR c0rcr6 = this.LL.LIZ;
            if (c0rcr6 != null && (c0rcu = c0rcr6.LIZIZ) != null) {
                boolValueOf2 = Boolean.valueOf(c0rcu.LIZIZ);
            }
            c2344009Gk.LJ(boolValueOf2, "cold_start");
            c2344009Gk.LIZJ(this.LLILLJJLI, "shake_order");
            c2344009Gk.LIZJ(this.LLILLL, "shake_count");
            c2344009Gk.LIZJ(C341940Daq.LIZIZ(i), "diff_value");
            c2344009Gk.LJ(list4, "component_keys");
            c2344009Gk.LJ(list6, "component_diff_delta");
            c2344009Gk.LJ(list5, "reasons");
            C20684815ws.LJIILLIIL("fcp_component_flash_detect", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }
}
