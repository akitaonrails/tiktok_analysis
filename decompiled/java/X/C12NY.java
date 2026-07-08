package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.common.ui.markdown.style.LinkUnderLineSpan;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12NY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12NY {
    public static String LJ;
    public final View LIZ;
    public final CommerceAgentCardAbility LIZIZ;
    public final C12NZ LIZJ = new InterfaceC426470Gnt() { // from class: X.12NZ
        @Override // X.InterfaceC426470Gnt
        public final void LIZ(LinkUnderLineSpan linkUnderLineSpan, CharSequence charSequence, Map map) {
            CommerceAgentCardAbility commerceAgentCardAbility = this.LIZ.LIZIZ;
            if (commerceAgentCardAbility != null) {
                commerceAgentCardAbility.jJ0();
            }
        }
    };
    public final C12NX LIZLLL = new InterfaceC418230Gab() { // from class: X.12NX
        @Override // X.InterfaceC418230Gab
        public final void LIZ(List list) {
            CommerceAgentCardAbility commerceAgentCardAbility;
            C12NY c12ny = this.LIZ;
            View view = c12ny.LIZ;
            if (view != null && (commerceAgentCardAbility = c12ny.LIZIZ) != null) {
                commerceAgentCardAbility.Kk(view, list, "reference_click_superscript", "reply");
            }
        }

        @Override // X.InterfaceC418230Gab
        public final void LIZIZ(InterfaceC418110GaP interfaceC418110GaP, CharSequence charSequence, Map<String, ? extends Object> map) {
            CommerceAgentCardAbility commerceAgentCardAbility = this.LIZ.LIZIZ;
            if (commerceAgentCardAbility != null) {
                commerceAgentCardAbility.EF0();
            }
        }

        @Override // X.InterfaceC418230Gab
        public final void LIZJ(InterfaceC418110GaP interfaceC418110GaP, CharSequence charSequence, Map<String, ? extends Object> map) {
            CommerceAgentCardAbility commerceAgentCardAbility = this.LIZ.LIZIZ;
            if (commerceAgentCardAbility != null) {
                commerceAgentCardAbility.D71();
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12NZ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.12NX] */
    public C12NY(View view, CommerceAgentCardAbility commerceAgentCardAbility) {
        this.LIZ = view;
        this.LIZIZ = commerceAgentCardAbility;
    }
}
