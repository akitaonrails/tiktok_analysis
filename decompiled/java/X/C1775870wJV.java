package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AgreementCheckBoxViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USSwitchInputItemVH;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AwS38S0010000_26;

/* JADX INFO: renamed from: X.0wJV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775870wJV implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
        }
    }

    public static final void onCheckedChanged$0(C1775870wJV c1775870wJV, CompoundButton compoundButton, boolean z) {
        String str;
        ((C0HZQ) c1775870wJV.l0).setChecked(z);
        C1745680vWo c1745680vWo = (C1745680vWo) c1775870wJV.l1;
        if (((C0HZQ) c1775870wJV.l0).isChecked()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1745680vWo.LIZIZ = str;
        ((AddressEditViewModel) ((AgreementCheckBoxViewHolder) c1775870wJV.l2).LLJILLL.getValue()).LLLFFI = z;
        ((AddressEditViewModel) ((AgreementCheckBoxViewHolder) c1775870wJV.l2).LLJILLL.getValue()).LLJJIJI = true;
        C1748720vbi.LIZLLL((C0HZQ) c1775870wJV.l0, new C049Y(), new AwS38S0010000_26(z, 3));
    }

    public static final void onCheckedChanged$1(C1775870wJV c1775870wJV, CompoundButton compoundButton, boolean z) {
        String str;
        ((C127A) c1775870wJV.l0).LJIILJJIL(z);
        C1745680vWo c1745680vWo = (C1745680vWo) c1775870wJV.l1;
        if (((C127A) c1775870wJV.l0).LJIILIIL()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1745680vWo.LIZIZ = str;
        if (((USSwitchInputItemVH) c1775870wJV.l2).a6().LLLLIILL) {
            ((USSwitchInputItemVH) c1775870wJV.l2).a6().LLIZLLLIL = Boolean.valueOf(((C127A) c1775870wJV.l0).LJIILIIL());
            C1745480vWU.LJ(((USSwitchInputItemVH) c1775870wJV.l2).a6().LLJJIJIL, "default_PUDO_address", null, null, 6);
        }
        ((USSwitchInputItemVH) c1775870wJV.l2).a6().LLJJIJI = true;
    }

    public C1775870wJV(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
