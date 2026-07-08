package X;

import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationTextEditContentAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0xw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838260xw8 extends C09AY implements Function2<UIAssem, C291001Au<? extends Spannable>, Unit> {
    public final /* synthetic */ DecorationTextEditContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838260xw8(DecorationTextEditContentAssem decorationTextEditContentAssem) {
        super(2);
        this.LL = decorationTextEditContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Spannable> c291001Au) {
        CharSequence charSequenceSubSequence;
        Spannable spannableLIZ = c291001Au.LIZ();
        if (spannableLIZ != null) {
            DecorationTextEditContentAssem decorationTextEditContentAssem = this.LL;
            if (spannableLIZ.length() > decorationTextEditContentAssem.lp()) {
                InterfaceC1818210xPn interfaceC1818210xPnHp = decorationTextEditContentAssem.LLJJJJ;
                if (interfaceC1818210xPnHp == null) {
                    synchronized (decorationTextEditContentAssem) {
                        interfaceC1818210xPnHp = decorationTextEditContentAssem.LLJJJJ;
                        if (interfaceC1818210xPnHp == null) {
                            interfaceC1818210xPnHp = decorationTextEditContentAssem.hp();
                            decorationTextEditContentAssem.LLJJJJ = interfaceC1818210xPnHp;
                        }
                    }
                }
                interfaceC1818210xPnHp.jq(new C1817880xPG(C497740JfY.LJIJJ(2131851424, Integer.valueOf(decorationTextEditContentAssem.lp())), "ttlive_boards_live_createBoard_characterToast"));
                IntRange intRange = new IntRange(0, decorationTextEditContentAssem.lp());
                if (intRange.isEmpty()) {
                    charSequenceSubSequence = "";
                } else {
                    charSequenceSubSequence = spannableLIZ.subSequence(intRange.getStart().intValue(), intRange.LJFF().intValue() + 1);
                }
                spannableLIZ = SpannableString.valueOf(charSequenceSubSequence);
            }
            C1838520xwY c1838520xwYIp = decorationTextEditContentAssem.ip();
            if (c1838520xwYIp != null) {
                c1838520xwYIp.setText(spannableLIZ);
            }
            C1838520xwY c1838520xwYIp2 = decorationTextEditContentAssem.ip();
            if (c1838520xwYIp2 != null) {
                c1838520xwYIp2.setSelection(spannableLIZ.length());
            }
        }
        return Unit.LIZ;
    }
}
