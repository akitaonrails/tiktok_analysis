package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS109S0201000_28;
import kotlin.jvm.internal.AwS182S0101000_28;
import kotlin.jvm.internal.AwS51S0301000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.109U, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C109U extends ValuedAccountPrivacySettingItemModel {
    public final C191848103q LLJILJILJ;
    public final C191995109h LLJILLL;
    public final Map<Integer, C191983108v> LLJJ;

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        C103N c103n;
        boolean z;
        CharSequence charSequenceLJI;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(LJIILLIIL());
        boolean z4 = c191986108yLIZLLL.LIZ;
        boolean zBooleanValue = this.LLJILLL.LJIIJJI.invoke(Boolean.valueOf(c191986108yLIZLLL.LIZIZ)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.LLJILLL.LJIIJ.invoke(Boolean.valueOf(z4))).booleanValue();
        Iterator it2 = ((ArrayList) this.LLJILLL.LJIIIIZZ).iterator();
        while (true) {
            String string = null;
            if (!it2.hasNext()) {
                break;
            }
            C191976108o c191976108o = (C191976108o) it2.next();
            int i = c191976108o.LJIIIIZZ;
            C191986108y c191986108yLJ = C191985108x.LJ(C856230XiP.LIZ(LJIILLIIL(), Integer.valueOf(i)));
            boolean z5 = c191986108yLJ.LIZ;
            boolean z6 = c191986108yLJ.LIZIZ;
            if (zBooleanValue && c191976108o.LJII.invoke(Boolean.valueOf(z6)).booleanValue()) {
                C191983108v c191983108v = (C191983108v) ((LinkedHashMap) this.LLJJ).get(Integer.valueOf(i));
                if (c191983108v == null) {
                    c191983108v = new C191983108v(c191976108o.LIZ, "Radio");
                    this.LLJJ.put(Integer.valueOf(i), c191983108v);
                }
                this.LLJILLL.getClass();
                Integer value = this.LLJILJIL.LLILLL.getValue();
                if (value != null && value.intValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                Integer num = c191976108o.LIZLLL;
                CharSequence charSequenceLJI2 = LJI(c191976108o.LJ, context);
                C103N c103n2 = c191976108o.LJFF;
                if (c103n2 != null) {
                    charSequenceLJI = LJI(c103n2, context);
                } else {
                    charSequenceLJI = null;
                }
                if (z && Intrinsics.LJFF(this.LLJILJIL.LLILZ.getValue(), Boolean.TRUE)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (zBooleanValue2 && c191976108o.LJI.invoke(Boolean.valueOf(z5)).booleanValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C191848103q c191848103q = this.LLJILJILJ;
                AnonymousClass1098 anonymousClass1098 = new AnonymousClass1098();
                Bundle bundle = c191848103q.LJ;
                if (bundle != null) {
                    string = bundle.getString("page_type");
                }
                if (u.LJIJI(string, "sheet", false)) {
                    anonymousClass1098.LIZ = 12;
                }
                C109B c109b = new C109B(num, charSequenceLJI2, charSequenceLJI, new AwS182S0101000_28(this, i, 1), new AwS51S0301000_28(c191983108v, this, i, c191976108o, 0), new AwS109S0201000_28(c191983108v, this, i, 8), z, z2, z3, anonymousClass1098, new C191990109c(c191983108v, this, z, i, c191976108o), 6144);
                c191983108v.LIZJ = Boolean.valueOf(c109b.LJIIJ);
                arrayList.add(c109b);
            }
        }
        if ((!arrayList.isEmpty()) && (c103n = this.LLJILLL.LJII) != null) {
            ListProtector.add(arrayList, 0, new AnonymousClass1088(LJI(c103n, context), null));
        }
        return arrayList;
    }

    public C109U(C191848103q c191848103q, C191995109h c191995109h) {
        super(c191848103q, c191995109h);
        this.LLJILJILJ = c191848103q;
        this.LLJILLL = c191995109h;
        this.LLJJ = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel, X.InterfaceC192001109n
    public final void LIZ(int i, Throwable th) {
        super.LIZ(i, th);
        C191983108v c191983108v = (C191983108v) ((LinkedHashMap) this.LLJJ).get(Integer.valueOf(i));
        if (c191983108v != null) {
            c191983108v.LJFF(i, this.LLJILJILJ.LIZLLL, th);
        }
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel, X.InterfaceC192001109n
    public final void LIZIZ(int i, BaseResponse baseResponse) {
        super.LIZIZ(i, baseResponse);
        C191983108v c191983108v = (C191983108v) ((LinkedHashMap) this.LLJJ).get(Integer.valueOf(i));
        if (c191983108v != null) {
            c191983108v.LJI(i, this.LLJILJILJ.LIZLLL, baseResponse);
        }
    }
}
