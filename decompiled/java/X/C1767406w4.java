package X;

import android.widget.CompoundButton;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.legacy.select.RecUserSelectCell;
import com.ss.android.ugc.aweme.legacy.select.SelectedCardVM;
import com.ss.android.ugc.aweme.tako.botpage.components.image.TakoAIImageConvertStyleItemAssem;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeNewDesignFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS4S0011000_2;

/* JADX INFO: renamed from: X.06w4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1767406w4 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
        }
    }

    public C1767406w4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onCheckedChanged$0(C1767406w4 c1767406w4, CompoundButton compoundButton, boolean z) {
        AssemVMLazy assemVMLazy = ((TakoAIImageConvertStyleItemAssem) c1767406w4.l0).LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoAIImageConvertStyleItemAssem.LLJLL;
        assemVMLazy.getValue().setState(new AwS4S0011000_2(((C06X1) c1767406w4.l1).LL, z, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onCheckedChanged$1(X.C1767406w4 r4, android.widget.CompoundButton r5, boolean r6) {
        /*
            r0 = 3
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeNewDesignFragment r0 = (com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeNewDesignFragment) r0
            java.lang.String r2 = r0.getEnterMethod()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_method"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeNewDesignFragment r0 = (com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeNewDesignFragment) r0
            X.01GW r0 = r0.LLJJIJI
            java.lang.Object r0 = r0.getValue()
            X.06Vz r0 = (X.EnumC1620106Vz) r0
            if (r0 == 0) goto L2e
            int[] r1 = X.C06W0.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 4: goto L60;
                case 5: goto L60;
                case 6: goto L63;
                case 7: goto L66;
                case 8: goto L66;
                case 9: goto L2e;
                case 10: goto L69;
                default: goto L2e;
            }
        L2e:
            java.lang.String r2 = ""
        L30:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "trigger"
            r1.<init>(r0, r2)
            r0 = 1
            r3[r0] = r1
            if (r6 == 0) goto L5d
            java.lang.String r2 = "on"
        L3e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "to_status"
            r1.<init>(r0, r2)
            r0 = 2
            r3[r0] = r1
            java.util.Map r1 = X.C2097608Jq.LJIIIIZZ(r3)
            java.lang.String r0 = "one_click_care_mode_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            java.lang.Object r1 = r4.l1
            androidx.lifecycle.MutableLiveData r1 = (androidx.lifecycle.MutableLiveData) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.setValue(r0)
            return
        L5d:
            java.lang.String r2 = "off"
            goto L3e
        L60:
            java.lang.String r2 = "delete"
            goto L30
        L63:
            java.lang.String r2 = "dislike"
            goto L30
        L66:
            java.lang.String r2 = "vulnerable_creator"
            goto L30
        L69:
            java.lang.String r2 = "report"
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767406w4.onCheckedChanged$1(X.06w4, android.widget.CompoundButton, boolean):void");
    }

    public static final void onCheckedChanged$2(C1767406w4 c1767406w4, CompoundButton compoundButton, boolean z) {
        String str;
        ((CreatorCareModeNewDesignFragment) c1767406w4.l0).LLJJIJIIJIL = true;
        if (z) {
            str = "all_filter_on_ck";
        } else {
            str = "all_filter_off_ck";
        }
        C20684815ws.LJIILLIIL(str, C2097608Jq.LJIIIIZZ(new Pair("enter_from", "care_mode_page"), new Pair("enter_method", ((CreatorCareModeNewDesignFragment) c1767406w4.l0).getEnterMethod())));
        ((MutableLiveData) c1767406w4.l1).setValue(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$3(C1767406w4 c1767406w4, CompoundButton compoundButton, boolean z) {
        SelectedCardVM selectedCardVM = (SelectedCardVM) ((RecUserSelectCell) c1767406w4.l0).LLILZLL.getValue();
        C1486105rn c1486105rn = (C1486105rn) c1767406w4.l1;
        C0HZQ c0hzq = ((RecUserSelectCell) c1767406w4.l0).LLILZIL;
        if (c0hzq == null) {
            c0hzq = null;
        }
        boolean zIsChecked = c0hzq.isChecked();
        selectedCardVM.getClass();
        c1486105rn.LLILLJJLI = zIsChecked;
        List<C1486105rn> value = selectedCardVM.LLIZ.getValue();
        int i = 0;
        if (value != null) {
            Iterator<C1486105rn> it2 = value.iterator();
            while (it2.hasNext()) {
                i += it2.next().LLILLJJLI ? 1 : 0;
            }
        }
        selectedCardVM.LLJ.postValue(Integer.valueOf(i));
    }
}
