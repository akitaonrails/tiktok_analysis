package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftAvatarAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0kzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340710kzd extends C09AY implements InterfaceC1631630sYr<UIAssem, Integer, Float, Float, Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ LeftAvatarAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1340710kzd(View view, LeftAvatarAssem leftAvatarAssem) {
        super(4);
        this.LL = view;
        this.LLILLJJLI = leftAvatarAssem;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, Integer num, Float f, Float f2) {
        int iIntValue = num.intValue();
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] leftType = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", avatarImageRadius = ");
        sbLIZ.append(fFloatValue);
        sbLIZ.append(", avatarImageBorderWidth = ");
        sbLIZ.append(fFloatValue2);
        C19290510dT.LIZLLL("LeftAvatarAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (iIntValue != -1) {
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        C786410Ut5.LJLLLLLL(0, this.LL);
                        this.LLILLJJLI.tp(fFloatValue, fFloatValue2, Float.valueOf(0.0f));
                    }
                } else {
                    C786410Ut5.LJLLLLLL(0, this.LL);
                    this.LLILLJJLI.tp(fFloatValue, fFloatValue2, Float.valueOf(2.0f));
                }
            } else {
                C786410Ut5.LJLLLLLL(0, this.LL);
                this.LLILLJJLI.tp(fFloatValue, fFloatValue2, null);
            }
        } else {
            C786410Ut5.LJLLLLLL(8, this.LL);
        }
        return Unit.LIZ;
    }
}
