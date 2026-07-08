package X;

import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10R1, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10R1 extends C03AM implements InterfaceC19246610Rk {
    public final List<NewUserInterestStruct> LLILLJJLI;
    public final List<NewUserInterestStruct> LLILLL;
    public final Function1<Integer, Unit> LLILZ;
    public final C19245810Rc LLILZIL;
    public final C10SG LLILZLL;
    public final LinkedHashSet<NewUserInterestStruct> LLIZ;
    public final List<String> LLIZLLLIL;

    @Override // X.InterfaceC19246610Rk
    public final List<NewUserInterestStruct> LJJJJJ() {
        return C13LP.LLIIII(this.LLIZ);
    }

    @Override // X.C03AM
    public final int LLLFZ() {
        return this.LLILLL.size();
    }

    @Override // X.InterfaceC19246610Rk
    public final int LJLLJ(NewUserInterestStruct newUserInterestStruct) {
        Iterator<NewUserInterestStruct> it2 = this.LLILLJJLI.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (!C19246410Ri.LIZ(it2.next(), newUserInterestStruct)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // X.C03AM
    public AbstractC1216180hkm LLLII(ViewGroup viewGroup) {
        int iLIZIZ;
        String str;
        C1150504el.LIZ().LIZLLL("interest_fragment_create_headholder", false);
        int i = C1216170hkl.LL;
        String str2 = this.LL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C19245810Rc c19245810Rc = this.LLILZIL;
        if (c19245810Rc != null && (str = c19245810Rc.LIZIZ) != null) {
            str3 = str;
        }
        C1216170hkl c1216170hklLIZ = C1214200hha.LIZ(viewGroup, str2, str3);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1216170hklLIZ.itemView.getLayoutParams();
        if (C1911400zq6.LIZ(viewGroup.getContext())) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f)));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(28.0f)));
        }
        marginLayoutParams.bottomMargin = iLIZIZ;
        C786410Ut5.W5(c1216170hklLIZ.itemView, marginLayoutParams);
        C1150504el.LIZ().LJI("interest_fragment_create_headholder", false);
        return c1216170hklLIZ;
    }

    public final NewUserInterestStruct LLLIIIIL(int i) {
        return (NewUserInterestStruct) ListProtector.get(this.LLILLL, i);
    }

    public final boolean LLLIL(NewUserInterestStruct newUserInterestStruct) {
        LinkedHashSet<NewUserInterestStruct> linkedHashSet = this.LLIZ;
        if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
            Iterator<NewUserInterestStruct> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                if (C19246410Ri.LIZ(it2.next(), newUserInterestStruct)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LLLIILIL(String str, String str2) {
        C10H5 c10h5 = C10H5.INTEREST_SELECTION_TAG_CLICK;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action", str);
        c2344009Gk.LJIIIIZZ("tag_detail", str2);
        C10SV.LIZIZ(c10h5, c2344009Gk.LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10R1(List list, List list2, Function1 function1, C19245810Rc c19245810Rc, C19246210Rg c19246210Rg) {
        String str;
        if (c19245810Rc != null) {
            str = c19245810Rc.LIZ;
        } else {
            str = null;
        }
        super(str);
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = function1;
        this.LLILZIL = c19245810Rc;
        this.LLILZLL = c19246210Rg;
        this.LLIZ = new LinkedHashSet<>();
        this.LLIZLLLIL = new ArrayList();
    }
}
