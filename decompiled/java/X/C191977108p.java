package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.PrivacyUserSettingDataViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS109S0201000_28;
import kotlin.jvm.internal.AwS182S0101000_28;
import kotlin.jvm.internal.AwS9S0211000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.108p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C191977108p extends AbstractC191963108b {
    public final C191848103q LLJ;
    public final C107N LLJI;
    public final Function2<Context, String, String> LLJIJIL;
    public final Map<Integer, C191983108v> LLJILJIL;

    public C191977108p() {
        throw null;
    }

    public boolean LJJI(int i, boolean z) {
        return z;
    }

    public boolean LJJIFFI(int i, boolean z) {
        return z;
    }

    public CharSequence LJJII(Context context, CharSequence charSequence, int i) {
        return charSequence;
    }

    public CharSequence LJJIII(Context context, CharSequence charSequence, int i) {
        return charSequence;
    }

    public boolean LJJIIJ(int i, boolean z) {
        return z;
    }

    public void LJJIJIIJIL(int i, int i2, BaseResponse baseResponse) {
    }

    public final C105M LJJIIJZLJL() {
        C105M next;
        Iterator<C105M> it2 = this.LLJI.LJIIJJI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LJIIIIZZ == 1) {
                break;
            }
        }
        return next;
    }

    public final Integer LJJIIZI() {
        PrivacyUserSettingDataViewModel privacyUserSettingDataViewModel = this.LLIZ;
        return Intrinsics.LJFF(privacyUserSettingDataViewModel.LLILZ.getValue(), Boolean.TRUE) ? privacyUserSettingDataViewModel.LLILLJJLI : privacyUserSettingDataViewModel.LLILLL.getValue();
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        CharSequence charSequenceLIZ;
        boolean z;
        CharSequence charSequenceLIZ2;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(LJIJJLI());
        boolean z4 = c191986108yLIZLLL.LIZ;
        if (c191986108yLIZLLL.LIZIZ) {
            CharSequence charSequenceLIZ3 = this.LLJI.LJ.LIZ(context);
            C103N c103n = this.LLJI.LJFF;
            if (c103n == null || (charSequenceLIZ = c103n.LIZ(context)) == null) {
                charSequenceLIZ = "";
            }
            arrayList.add(new AnonymousClass1088(charSequenceLIZ3, charSequenceLIZ));
            for (C105M c105m : this.LLJI.LJIIJJI) {
                int i = c105m.LJIIIIZZ;
                C191986108y c191986108yLJ = C191985108x.LJ(C856230XiP.LIZ(LJIJJLI(), Integer.valueOf(i)));
                boolean z5 = c191986108yLJ.LIZ;
                if (LJJIIJ(i, c191986108yLJ.LIZIZ)) {
                    C191983108v c191983108v = (C191983108v) ((LinkedHashMap) this.LLJILJIL).get(Integer.valueOf(i));
                    if (c191983108v == null) {
                        c191983108v = new C191983108v(c105m.LIZ, "Radio");
                        this.LLJILJIL.put(Integer.valueOf(i), c191983108v);
                    }
                    Integer value = this.LLIZ.LLILLL.getValue();
                    if (value != null && value.intValue() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zLJJI = LJJI(i, z);
                    CharSequence charSequenceLJJIII = LJJIII(context, c105m.LJ.LIZ(context), i);
                    C103N c103n2 = c105m.LJFF;
                    if (c103n2 == null || (charSequenceLIZ2 = c103n2.LIZ(context)) == null) {
                        charSequenceLIZ2 = "";
                    }
                    CharSequence charSequenceLJJII = LJJII(context, charSequenceLIZ2, i);
                    AwS182S0101000_28 awS182S0101000_28 = new AwS182S0101000_28(this, i, 3);
                    AwS109S0201000_28 awS109S0201000_28 = new AwS109S0201000_28(c191983108v, this, i, 15);
                    AwS109S0201000_28 awS109S0201000_282 = new AwS109S0201000_28(c191983108v, this, i, 16);
                    if (zLJJI && Intrinsics.LJFF(this.LLIZ.LLILZ.getValue(), Boolean.TRUE)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z4 && LJJIFFI(i, z5)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C109B c109b = new C109B(null, charSequenceLJJIII, charSequenceLJJII, awS182S0101000_28, awS109S0201000_28, awS109S0201000_282, zLJJI, z2, z3, LJJIIZ(this.LLJ), new AwS9S0211000_28(c191983108v, this, zLJJI, i, 6), 23040);
                    c191983108v.LIZJ = Boolean.valueOf(c109b.LJIIJ);
                    arrayList.add(c109b);
                }
            }
        }
        LJIILIIL(arrayList);
        return arrayList;
    }

    public AnonymousClass1098 LJJIIZ(C191848103q c191848103q) {
        String string;
        AnonymousClass1098 anonymousClass1098 = new AnonymousClass1098();
        Bundle bundle = c191848103q.LJ;
        if (bundle != null) {
            string = bundle.getString("page_type");
        } else {
            string = null;
        }
        if (u.LJIJI(string, "sheet", false)) {
            anonymousClass1098.LIZ = 12;
        }
        return anonymousClass1098;
    }

    public final boolean LJJIJ(C105M c105m) {
        boolean zBooleanValue = this.LLJI.LJI.invoke(Boolean.valueOf(C191985108x.LIZLLL(LJIJJLI()).LIZ)).booleanValue();
        boolean z = C191985108x.LJ(C856230XiP.LIZ(LJIJJLI(), Integer.valueOf(c105m.LJIIIIZZ))).LIZ;
        if (zBooleanValue && c105m.LJI.invoke(Boolean.valueOf(z)).booleanValue()) {
            return true;
        }
        return false;
    }

    public C191977108p(C191848103q c191848103q, C107N c107n) {
        super(c191848103q, c107n.LJIIIIZZ, c107n.LJIIIZ, null);
        this.LLJ = c191848103q;
        this.LLJI = c107n;
        this.LLJIJIL = null;
        this.LLJILJIL = new LinkedHashMap();
    }

    public void LJJIJIIJI(int i, View view) {
        this.LLIZ.wQ2(i, LJIILJJIL(i), new C191979108r(this), new C191978108q(this));
    }
}
