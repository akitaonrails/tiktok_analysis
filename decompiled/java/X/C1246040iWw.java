package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateErrorAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246040iWw extends C09AY implements Function2<UIAssem, C627660Ojc<InterfaceC1891350zJl>, Unit> {
    public final /* synthetic */ IntelligentBoardTemplateErrorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246040iWw(IntelligentBoardTemplateErrorAssem intelligentBoardTemplateErrorAssem) {
        super(2);
        this.LL = intelligentBoardTemplateErrorAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        if (c627660Ojc.LL instanceof C491001vg) {
            C500260Jjc.LLFFF(this.LL.getContentView());
        } else {
            C500260Jjc.LJIILIIL(this.LL.getContentView());
        }
        return Unit.LIZ;
    }
}
