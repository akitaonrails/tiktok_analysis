package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS109S0201000_28;
import kotlin.jvm.internal.AwS182S0101000_28;
import kotlin.jvm.internal.AwS9S0211000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1097, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class AnonymousClass1097 extends C109N {
    public final C191848103q LLJI;
    public final C107N LLJIJIL;
    public final Map<Integer, C191983108v> LLJILJIL;

    @Override // X.C109N
    public String LJIJJLI() {
        return "radio_group";
    }

    public CharSequence LJJIJIL(Context context, CharSequence charSequence, int i) {
        return charSequence;
    }

    public CharSequence LJJIJLIJ(Context context, CharSequence charSequence, int i) {
        return charSequence;
    }

    public boolean LJJIL(int i, boolean z) {
        return z;
    }

    @Override // X.C109N
    public Integer LJIJJ() {
        return LJIL().LLILZ.get(this.LLJIJIL.LJIIIZ);
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        CharSequence charSequenceLIZ;
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption;
        boolean z;
        CharSequence charSequenceLIZ2;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = LJIL().LLILLL.get(this.LLJIJIL.LJIIIIZZ);
        if (privacySettingsRestrictionItem == null) {
            privacySettingsRestrictionItem = new PrivacySettingsRestrictionItem(2, 0, null, 0, -1, null);
        }
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(privacySettingsRestrictionItem);
        boolean z4 = c191986108yLIZLLL.LIZ;
        if (LJIJ(c191986108yLIZLLL.LIZIZ)) {
            CharSequence charSequenceLJIIZILJ = LJIIZILJ(context, this.LLJIJIL.LJ.LIZ(context));
            C103N c103n = this.LLJIJIL.LJFF;
            if (c103n == null || (charSequenceLIZ = c103n.LIZ(context)) == null) {
                charSequenceLIZ = "";
            }
            arrayList.add(new AnonymousClass1088(charSequenceLJIIZILJ, charSequenceLIZ));
            for (C105M c105m : this.LLJIJIL.LJIIJJI) {
                int i = c105m.LJIIIIZZ;
                PrivacySettingsRestrictionItem privacySettingsRestrictionItem2 = LJIL().LLILLL.get(this.LLJIJIL.LJIIIIZZ);
                if (privacySettingsRestrictionItem2 == null || (privacySettingsRestrictionOption = C856230XiP.LIZ(privacySettingsRestrictionItem2, Integer.valueOf(i))) == null) {
                    privacySettingsRestrictionOption = new PrivacySettingsRestrictionOption(0, 2, 0, null);
                }
                C191986108y c191986108yLJ = C191985108x.LJ(privacySettingsRestrictionOption);
                boolean z5 = c191986108yLJ.LIZ;
                if (LJJIL(i, c191986108yLJ.LIZIZ)) {
                    C191983108v c191983108v = (C191983108v) ((LinkedHashMap) this.LLJILJIL).get(Integer.valueOf(i));
                    if (c191983108v == null) {
                        c191983108v = new C191983108v(c105m.LIZ, "Radio");
                        this.LLJILJIL.put(Integer.valueOf(i), c191983108v);
                    }
                    Integer value = LJJI().LLILLL.getValue();
                    if (value != null && value.intValue() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    CharSequence charSequenceLJJIJLIJ = LJJIJLIJ(context, c105m.LJ.LIZ(context), i);
                    C103N c103n2 = c105m.LJFF;
                    if (c103n2 == null || (charSequenceLIZ2 = c103n2.LIZ(context)) == null) {
                        charSequenceLIZ2 = "";
                    }
                    CharSequence charSequenceLJJIJIL = LJJIJIL(context, charSequenceLIZ2, i);
                    AwS182S0101000_28 awS182S0101000_28 = new AwS182S0101000_28(this, i, 2);
                    AwS109S0201000_28 awS109S0201000_28 = new AwS109S0201000_28(c191983108v, this, i, 9);
                    AwS109S0201000_28 awS109S0201000_282 = new AwS109S0201000_28(c191983108v, this, i, 10);
                    if (z && Intrinsics.LJFF(LJJI().LLILZ.getValue(), Boolean.TRUE)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z4 && z5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AnonymousClass1098 anonymousClass1098 = new AnonymousClass1098();
                    anonymousClass1098.LIZ = 12;
                    C109B c109b = new C109B(null, charSequenceLJJIJLIJ, charSequenceLJJIJIL, awS182S0101000_28, awS109S0201000_28, awS109S0201000_282, z, z2, z3, anonymousClass1098, new AwS9S0211000_28(c191983108v, this, z, i, 4), 23040);
                    c191983108v.LIZJ = Boolean.valueOf(c109b.LJIIJ);
                    arrayList.addAll(LJJIJIIJIL(i, c109b));
                }
            }
        }
        LJIILIIL(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIZ(int r6) {
        /*
            r5 = this;
            com.ss.android.ugc.tiktok.tpsc.privacy.business.components.video.base.VideoPrivacySettingPageViewModel r0 = r5.LJIL()
            java.util.Map<java.lang.String, com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem> r1 = r0.LLILLL
            X.107N r0 = r5.LLJIJIL
            java.lang.String r0 = r0.LJIIIIZZ
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem r1 = (com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem) r1
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L23
            int r0 = r1.showType
            if (r0 != r4) goto L19
            return r3
        L19:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption r2 = X.C856230XiP.LIZ(r1, r0)
            if (r2 != 0) goto L2a
        L23:
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption r2 = new com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption
            r1 = 0
            r0 = 2
            r2.<init>(r3, r0, r3, r1)
        L2a:
            int r0 = r2.showType
            if (r0 != r4) goto L2f
            r4 = 0
        L2f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1097.LJJIZ(int):boolean");
    }

    public AnonymousClass1097(C191848103q c191848103q, C107N c107n) {
        super(c191848103q, c107n.LIZ, c107n.LJIIIIZZ, c107n.LJIIIZ);
        this.LLJI = c191848103q;
        this.LLJIJIL = c107n;
        this.LLJILJIL = new LinkedHashMap();
    }

    @Override // X.C109N
    public boolean LJJIII(int i, View view) {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOptionLIZ;
        String str;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = LJIL().LLILLL.get(this.LLJIJIL.LJIIIIZZ);
        String str2 = null;
        if (privacySettingsRestrictionItem != null) {
            privacySettingsRestrictionOptionLIZ = C856230XiP.LIZ(privacySettingsRestrictionItem, Integer.valueOf(i));
        } else {
            privacySettingsRestrictionOptionLIZ = null;
        }
        if (C1207604ny.LIZ()) {
            if (privacySettingsRestrictionOptionLIZ != null) {
                str2 = privacySettingsRestrictionOptionLIZ.disabledToast;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (privacySettingsRestrictionOptionLIZ != null && (str = privacySettingsRestrictionOptionLIZ.disabledToast) != null) {
                    bu(str);
                    return true;
                }
                return true;
            }
        }
        return super.LJJIII(i, view);
    }

    public List LJJIJIIJIL(int i, C109B c109b) {
        return Collections.singletonList(c109b);
    }

    @Override // X.C109N
    public final void LJJIIJZLJL(int i, int i2, Throwable th) {
        LJJIJIIJI(th);
        C191983108v c191983108v = (C191983108v) ((LinkedHashMap) this.LLJILJIL).get(Integer.valueOf(i2));
        if (c191983108v != null) {
            c191983108v.LJFF(i2, this.LLJI.LIZLLL, th);
        }
    }

    @Override // X.C109N
    public void LJJIIZ(int i, int i2, BaseResponse baseResponse) {
        C191983108v c191983108v = (C191983108v) ((LinkedHashMap) this.LLJILJIL).get(Integer.valueOf(i2));
        if (c191983108v != null) {
            c191983108v.LJI(i2, this.LLJI.LIZLLL, baseResponse);
        }
    }
}
