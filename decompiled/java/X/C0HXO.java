package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0HXO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HXO implements InterfaceC328600CuQ {
    public final TakoCardAbility LIZ;
    public final /* synthetic */ String LIZIZ;

    public C0HXO(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        this.LIZIZ = str;
        this.LIZ = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
    }

    @Override // X.InterfaceC328600CuQ
    public final void LIZ(View view, InterfaceC431020GvE interfaceC431020GvE, CharSequence charSequence, CharSequence charSequence2) {
        TakoCardAbility takoCardAbility = this.LIZ;
        if (takoCardAbility != null) {
            takoCardAbility.n21(charSequence);
        }
    }

    @Override // X.InterfaceC328600CuQ
    public final void LIZIZ(View view, InterfaceC431020GvE interfaceC431020GvE, List<? extends CharSequence> list, Map<String, ? extends Object> map) {
        TakoCardAbility takoCardAbility = this.LIZ;
        if (takoCardAbility != null) {
            takoCardAbility.Kk(view, list, "click_superscript", this.LIZIZ);
        }
    }
}
